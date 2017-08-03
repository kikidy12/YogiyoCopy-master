package kr.co.tjeit.yogiyocopy.data;

import java.util.Calendar;

/**
 * Created by the on 2017-08-03.
 */

public class OrderData {

    private StoreData oderStore;
    private Calendar oderData;
    private String location;
    private int cost;

    public OrderData() {
    }

    public OrderData(StoreData oderStore, Calendar oderData, String location, int cost) {
        this.oderStore = oderStore;
        this.oderData = oderData;
        this.location = location;
        this.cost = cost;
    }

    public StoreData getOderStore() {
        return oderStore;
    }

    public void setOderStore(StoreData oderStore) {
        this.oderStore = oderStore;
    }

    public Calendar getOderData() {
        return oderData;
    }

    public void setOderData(Calendar oderData) {
        this.oderData = oderData;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
