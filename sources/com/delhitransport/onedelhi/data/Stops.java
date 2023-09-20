package com.delhitransport.onedelhi.data;

import com.onedelhi.secure.r10;
import com.onedelhi.secure.up1;
import com.onedelhi.secure.vu0;
import com.onedelhi.secure.w43;
import java.io.Serializable;

@vu0(indices = {@up1(unique = true, value = {"stop_id", "stop_type"}), @up1({"stop_type"})})
public class Stops implements Serializable {
    @r10(defaultValue = "-1", name = "cluster_id")
    private int cluster_id;
    @w43(autoGenerate = true)

    /* renamed from: id */
    private int f7032id;
    @r10(name = "lat")
    private double lat;
    @r10(name = "lon")
    private double lon;
    @r10(name = "stop_desc")
    private String stop_desc;
    @r10(name = "stop_id")
    private int stop_id;
    @r10(name = "name")
    private String stop_name;
    @r10(name = "stop_type")
    private String stop_type;

    public Stops() {
    }

    public Stops(int i, String str, double d, double d2, String str2, String str3, int i2) {
        this.stop_id = i;
        this.stop_name = str;
        this.lat = d;
        this.lon = d2;
        this.stop_type = str2;
        this.stop_desc = str3;
        this.cluster_id = i2;
    }

    public int getCluster_id() {
        return this.cluster_id;
    }

    public int getId() {
        return this.f7032id;
    }

    public double getLat() {
        return this.lat;
    }

    public double getLon() {
        return this.lon;
    }

    public String getStop_desc() {
        return this.stop_desc;
    }

    public int getStop_id() {
        return this.stop_id;
    }

    public String getStop_name() {
        return this.stop_name;
    }

    public String getStop_type() {
        return this.stop_type;
    }

    public void setCluster_id(int i) {
        this.cluster_id = i;
    }

    public void setId(int i) {
        this.f7032id = i;
    }

    public void setLat(double d) {
        this.lat = d;
    }

    public void setLon(double d) {
        this.lon = d;
    }

    public void setStop_desc(String str) {
        this.stop_desc = str;
    }

    public void setStop_id(int i) {
        this.stop_id = i;
    }

    public void setStop_name(String str) {
        this.stop_name = str;
    }

    public void setStop_type(String str) {
        this.stop_type = str;
    }

    public String toString() {
        return "Stops{id=" + this.f7032id + ", stop_id=" + this.stop_id + ", stop_name='" + this.stop_name + '\'' + ", lat=" + this.lat + ", lon=" + this.lon + ", stop_type='" + this.stop_type + '\'' + ", stop_desc='" + this.stop_desc + '\'' + ", cluster_id=" + this.cluster_id + '}';
    }
}
