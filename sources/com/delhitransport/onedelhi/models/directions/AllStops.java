package com.delhitransport.onedelhi.models.directions;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import java.io.Serializable;
import java.util.ArrayList;

public class AllStops implements Serializable {
    @nu3("id")
    @qy0

    /* renamed from: id */
    private int f7045id;
    @nu3("lat")
    @qy0
    private Double lat;
    @nu3("lines")
    @qy0
    private ArrayList<String> lines;
    @nu3("lng")
    @qy0
    private Double lng;
    @nu3("name")
    @qy0
    private String name;
    @nu3("next_stop")
    @qy0
    private String next_stop;
    @nu3("stop_type")
    @qy0
    private String stop_type;

    public AllStops() {
    }

    public AllStops(int i, Double d, Double d2, String str, String str2, String str3, ArrayList<String> arrayList) {
        this.f7045id = i;
        this.lat = d;
        this.lng = d2;
        this.name = str;
        this.next_stop = str2;
        this.stop_type = str3;
        this.lines = arrayList;
    }

    public int getId() {
        return this.f7045id;
    }

    public Double getLat() {
        return this.lat;
    }

    public ArrayList<String> getLines() {
        return this.lines;
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
        this.f7045id = i;
    }

    public void setLat(Double d) {
        this.lat = d;
    }

    public void setLines(ArrayList<String> arrayList) {
        this.lines = arrayList;
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

    public String toString() {
        return "AllStops{id=" + this.f7045id + ", lat=" + this.lat + ", lng=" + this.lng + ", name='" + this.name + '\'' + ", next_stop='" + this.next_stop + '\'' + ", stop_type='" + this.stop_type + '\'' + ", lines=" + this.lines + '}';
    }
}
