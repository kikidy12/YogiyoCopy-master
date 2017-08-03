package kr.co.tjeit.yogiyocopy.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import kr.co.tjeit.yogiyocopy.MainActivity;
import kr.co.tjeit.yogiyocopy.R;
import kr.co.tjeit.yogiyocopy.data.OrderData;

/**
 * Created by the on 2017-08-03.
 */

public class OrderAdapter extends ArrayAdapter<OrderData>{

    Context mContext;
    List<OrderData> mList = new ArrayList<>();
    LayoutInflater inf;

    public OrderAdapter(Context context, List<OrderData> list) {
        super(context, R.layout.oder_list_item, list);
        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;

        if(row == null) {
            row = inf.inflate(R.layout.oder_list_item, null);
        }

        OrderData data = mList.get(position);

        TextView storeNameTxt = (TextView) row.findViewById(R.id.storeNameTxt);
        storeNameTxt.setText(data.getOderStore().getStoreName());

        TextView orderDataTxt = (TextView) row.findViewById(R.id.orderDataTxt);
        SimpleDateFormat simple1 = new SimpleDateFormat("yyyy년 M월 dd일");
        String dateStr = simple1.format(data.getOderData().getTime());
        orderDataTxt.setText(dateStr);

        TextView orderLocateTxt = (TextView) row.findViewById(R.id.orderLocateTxt);
        orderLocateTxt.setText(data.getLocation());

        TextView costTxt = (TextView) row.findViewById(R.id.costTxt);
        String amountStr = String.format(Locale.KOREA, "%,d 원", data.getCost());
        costTxt.setText(amountStr);



        return row;
    }
}
