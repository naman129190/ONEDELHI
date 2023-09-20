package com.delhitransport.onedelhi.live;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import java.util.ArrayList;

public class LocationLiveItem {
    @nu3("coordinates")
    @qy0
    public ArrayList<Double> coordinates;
    @nu3("$reql_type$")
    @qy0
    public String reql_type;
    @nu3("type")
    @qy0
    public String type;

    public LocationLiveItem(String str, ArrayList<Double> arrayList, String str2) {
        this.reql_type = str;
        this.coordinates = arrayList;
        this.type = str2;
    }

    public ArrayList<Double> getCoordinates() {
        return this.coordinates;
    }

    public String getReql_type() {
        return this.reql_type;
    }

    public String getType() {
        return this.type;
    }

    public void setCoordinates(ArrayList<Double> arrayList) {
        this.coordinates = arrayList;
    }

    public void setReql_type(String str) {
        this.reql_type = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String toString() {
        return "LocationLiveItem{reql_type='" + this.reql_type + '\'' + ", coordinates=" + this.coordinates + ", type='" + this.type + '\'' + '}';
    }
}
