package com.delhitransport.onedelhi.data;

import com.onedelhi.secure.mr2;
import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;

public class Stop {
    @nu3("lat")
    @qy0
    private Double lat;
    @nu3("lon")
    @qy0
    private Double lon;
    @nu3("name")
    @qy0
    private String name;
    @nu3("stop_id")
    @qy0
    private int stop_id;

    public Stop() {
    }

    public Stop(Double d, Double d2, String str) {
        this.lat = d;
        this.lon = d2;
        this.name = str;
    }

    public Stop(Double d, Double d2, String str, int i) {
        this.lat = d;
        this.lon = d2;
        this.name = str;
        this.stop_id = i;
    }

    public Double getLat() {
        return this.lat;
    }

    public Double getLon() {
        return this.lon;
    }

    public String getName() {
        return this.name;
    }

    public int getStop_Id() {
        return this.stop_id;
    }

    public void setLat(Double d) {
        this.lat = d;
    }

    public void setLon(Double d) {
        this.lon = d;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setStop_Id(int i) {
        this.stop_id = i;
    }

    @mr2
    public String toString() {
        return "\nlat: " + this.lat + "\nlon: " + this.lon + "\nname: " + this.name + "\nid: " + this.stop_id;
    }
}
