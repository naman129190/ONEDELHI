package com.delhitransport.onedelhi.data;

import com.onedelhi.secure.r10;
import com.onedelhi.secure.up1;
import com.onedelhi.secure.vu0;
import com.onedelhi.secure.w43;
import java.io.Serializable;

@vu0(indices = {@up1({"stop_type"})})
public class PastSearchTripPlanner implements Serializable {
    @r10(name = "count")
    private int count;
    @r10(name = "id")
    @w43(autoGenerate = true)

    /* renamed from: id */
    private int f7031id;
    @r10(defaultValue = "", name = "stop_desc")
    private String stop_desc;
    @r10(name = "stop_id")
    private int stop_id;
    @r10(name = "stop_lat")
    private Double stop_lat;
    @r10(name = "stop_lon")
    private Double stop_lon;
    @r10(name = "stop_name")
    private String stop_name;
    @r10(name = "stop_type")
    private String stop_type;

    public PastSearchTripPlanner() {
    }

    public PastSearchTripPlanner(int i, String str, String str2, String str3, int i2, Double d, Double d2) {
        this.stop_id = i;
        this.stop_name = str;
        this.stop_type = str2;
        this.stop_desc = str3;
        this.count = i2;
        this.stop_lat = d;
        this.stop_lon = d2;
    }

    public int getCount() {
        return this.count;
    }

    public int getId() {
        return this.f7031id;
    }

    public String getStop_desc() {
        return this.stop_desc;
    }

    public int getStop_id() {
        return this.stop_id;
    }

    public Double getStop_lat() {
        return this.stop_lat;
    }

    public Double getStop_lon() {
        return this.stop_lon;
    }

    public String getStop_name() {
        return this.stop_name;
    }

    public String getStop_type() {
        return this.stop_type;
    }

    public void setCount(int i) {
        this.count = i;
    }

    public void setId(int i) {
        this.f7031id = i;
    }

    public void setStop_desc(String str) {
        this.stop_desc = str;
    }

    public void setStop_id(int i) {
        this.stop_id = i;
    }

    public void setStop_lat(Double d) {
        this.stop_lat = d;
    }

    public void setStop_lon(Double d) {
        this.stop_lon = d;
    }

    public void setStop_name(String str) {
        this.stop_name = str;
    }

    public void setStop_type(String str) {
        this.stop_type = str;
    }

    public String toString() {
        return "PastSearchTripPlanner{id=" + this.f7031id + ", stop_id=" + this.stop_id + ", stop_name='" + this.stop_name + '\'' + ", stop_type='" + this.stop_type + '\'' + ", stop_desc='" + this.stop_desc + '\'' + ", count=" + this.count + ", stop_lat=" + this.stop_lat + ", stop_lon=" + this.stop_lon + '}';
    }
}
