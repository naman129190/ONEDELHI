package com.delhitransport.onedelhi.models.directions;

import com.google.android.gms.maps.model.LatLng;
import java.io.Serializable;
import java.util.ArrayList;

public class PolyPoints implements Serializable {
    private String color;
    private ArrayList<String> data;
    private ArrayList<LatLng> points;
    private String type;

    public PolyPoints(String str, ArrayList<LatLng> arrayList) {
        this.color = str;
        this.points = arrayList;
    }

    public PolyPoints(String str, ArrayList<LatLng> arrayList, ArrayList<String> arrayList2, String str2) {
        this.color = str;
        this.points = arrayList;
        this.data = arrayList2;
        this.type = str2;
    }

    public String getColor() {
        return this.color;
    }

    public ArrayList<String> getData() {
        return this.data;
    }

    public ArrayList<LatLng> getPoints() {
        return this.points;
    }

    public String getType() {
        return this.type;
    }

    public void setColor(String str) {
        this.color = str;
    }

    public void setData(ArrayList<String> arrayList) {
        this.data = arrayList;
    }

    public void setPoints(ArrayList<LatLng> arrayList) {
        this.points = arrayList;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String toString() {
        return "PolyPoints{color='" + this.color + '\'' + ", points=" + this.points + '}';
    }
}
