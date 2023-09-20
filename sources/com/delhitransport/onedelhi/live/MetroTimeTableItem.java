package com.delhitransport.onedelhi.live;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;

public class MetroTimeTableItem {
    @nu3("first_train")
    @qy0
    public String first_train;
    @nu3("last_train")
    @qy0
    public String last_train;
    @nu3("line_color")
    @qy0
    public String line_color;
    @nu3("line_name")
    @qy0
    public String line_name;
    @nu3("station_name")
    @qy0
    public String station_name;

    public MetroTimeTableItem(String str, String str2, String str3, String str4, String str5) {
        this.station_name = str;
        this.line_name = str2;
        this.first_train = str3;
        this.last_train = str4;
        this.line_color = str5;
    }

    public String getFirst_train() {
        return this.first_train;
    }

    public String getLast_train() {
        return this.last_train;
    }

    public String getLine_color() {
        return this.line_color;
    }

    public String getLine_name() {
        return this.line_name;
    }

    public String getStation_name() {
        return this.station_name;
    }

    public void setFirst_train(String str) {
        this.first_train = str;
    }

    public void setLast_train(String str) {
        this.last_train = str;
    }

    public void setLine_color(String str) {
        this.line_color = str;
    }

    public void setLine_name(String str) {
        this.line_name = str;
    }

    public void setStation_name(String str) {
        this.station_name = str;
    }

    public String toString() {
        return "MetroTimeTableItem{station_name='" + this.station_name + '\'' + ", line_name='" + this.line_name + '\'' + ", first_train='" + this.first_train + '\'' + ", last_train='" + this.last_train + '\'' + ", line_color='" + this.line_color + '\'' + '}';
    }
}
