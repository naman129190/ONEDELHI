package com.delhitransport.onedelhi.data;

import com.onedelhi.secure.mr2;
import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import com.onedelhi.secure.r10;
import com.onedelhi.secure.vu0;
import com.onedelhi.secure.w43;
import java.io.Serializable;

@vu0(tableName = "AllStops")
public class AllStops implements Serializable {
    @nu3("id")
    @mr2
    @w43
    @qy0
    @r10(name = "id")

    /* renamed from: id */
    private int f7030id;
    @nu3("lat")
    @qy0
    @r10(name = "latitude")
    private Double lat;
    @nu3("lng")
    @qy0
    @r10(name = "longitude")
    private Double lng;
    @nu3("name")
    @qy0
    @r10(name = "name")
    private String name;
    @nu3("next_stop")
    @qy0
    @r10(name = "next_stop")
    private String next_stop;
    @nu3("stop_type")
    @mr2
    @qy0
    @r10(name = "stop_type")
    private String stop_type;

    public AllStops() {
        this.stop_type = "bus";
    }

    public AllStops(int i, Double d, Double d2, String str, String str2, String str3) {
        this.f7030id = i;
        this.lat = d;
        this.lng = d2;
        this.name = str;
        this.next_stop = str2;
        this.stop_type = str3;
    }

    public AllStops(Integer num, Double d, Double d2, String str, String str2) {
        this.stop_type = "bus";
        this.f7030id = num.intValue();
        this.lat = d;
        this.lng = d2;
        this.name = str;
        this.next_stop = str2;
    }

    public int getId() {
        return this.f7030id;
    }

    public Double getLat() {
        return this.lat;
    }

    public Double getLng() {
        return this.lng;
    }

    public String getName() {
        return this.name;
    }

    public String getNext_stop() {
        return this.next_stop;
    }

    public String getStop_type() {
        return this.stop_type;
    }

    public void setId(int i) {
        this.f7030id = i;
    }

    public void setLat(Double d) {
        this.lat = d;
    }

    public void setLng(Double d) {
        this.lng = d;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNext_stop(String str) {
        this.next_stop = str;
    }

    public void setStop_type(String str) {
        this.stop_type = str;
    }
}
