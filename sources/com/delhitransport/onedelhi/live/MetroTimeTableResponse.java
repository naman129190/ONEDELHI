package com.delhitransport.onedelhi.live;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import java.util.ArrayList;

public class MetroTimeTableResponse {
    @nu3("time_table")
    @qy0
    public ArrayList<MetroTimeTableItem> metroTimeTableItems;

    public MetroTimeTableResponse(ArrayList<MetroTimeTableItem> arrayList) {
        this.metroTimeTableItems = arrayList;
    }

    public ArrayList<MetroTimeTableItem> getMetroTimeTableItems() {
        return this.metroTimeTableItems;
    }

    public void setMetroTimeTableItems(ArrayList<MetroTimeTableItem> arrayList) {
        this.metroTimeTableItems = arrayList;
    }

    public String toString() {
        return "MetroTimeTableResponse{metroTimeTableItems=" + this.metroTimeTableItems + '}';
    }
}
