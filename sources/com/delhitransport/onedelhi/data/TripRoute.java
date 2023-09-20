package com.delhitransport.onedelhi.data;

import com.onedelhi.secure.mr2;
import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import java.util.ArrayList;

public class TripRoute {
    @nu3("score_text")
    @qy0
    private String comfortScore;
    @nu3("direction")
    @qy0
    private int direction;
    @nu3("id")
    @qy0

    /* renamed from: id */
    private int f7033id;
    @nu3("interchanges")
    @qy0
    private String interchanges;
    @nu3("long_name")
    @qy0
    private String longName;
    @nu3("route")
    @qy0
    private String route;
    @nu3("short_name")
    @qy0
    private String shortName;
    @nu3("stops")
    @qy0
    private ArrayList<Stop> stops;
    @nu3("stops_distance")
    @qy0
    private ArrayList<Double> stops_distance;
    @nu3("type")
    @qy0
    private String type;

    public TripRoute() {
    }

    public TripRoute(Integer num, String str, String str2, String str3, String str4, Integer num2, String str5, ArrayList<Stop> arrayList, ArrayList<Double> arrayList2, String str6) {
        this.f7033id = num.intValue();
        this.type = str;
        this.route = str2;
        this.shortName = str3;
        this.longName = str4;
        this.direction = num2.intValue();
        this.interchanges = str5;
        this.stops = arrayList;
        this.stops_distance = arrayList2;
        this.comfortScore = str6;
    }

    public String getComfortScore() {
        return this.comfortScore;
    }

    public Integer getDirection() {
        return Integer.valueOf(this.direction);
    }

    public Integer getId() {
        return Integer.valueOf(this.f7033id);
    }

    public String getInterchanges() {
        return this.interchanges;
    }

    public String getLongName() {
        return this.longName;
    }

    public String getRoute() {
        return this.route;
    }

    public String getShortName() {
        return this.shortName;
    }

    public ArrayList<Stop> getStops() {
        return this.stops;
    }

    public ArrayList<Double> getStops_distance() {
        return this.stops_distance;
    }

    public String getType() {
        return this.type;
    }

    public void setComfortScore(String str) {
        this.comfortScore = str;
    }

    public void setDirection(Integer num) {
        this.direction = num.intValue();
    }

    public void setId(Integer num) {
        this.f7033id = num.intValue();
    }

    public void setInterchanges(String str) {
        this.interchanges = str;
    }

    public void setLongName(String str) {
        this.longName = str;
    }

    public void setRoute(String str) {
        this.route = str;
    }

    public void setShortName(String str) {
        this.shortName = str;
    }

    public void setStops(ArrayList<Stop> arrayList) {
        this.stops = arrayList;
    }

    public void setStops_distance(ArrayList<Double> arrayList) {
        this.stops_distance = arrayList;
    }

    public void setType(String str) {
        this.type = str;
    }

    @mr2
    public String toString() {
        return "\nid: " + this.f7033id + "\ntype: " + this.type + "\nroute: " + this.route + "\nshort_name: " + this.shortName + "\nlong_name: " + this.longName + "\ndirection: " + this.direction + "\ninterchanges: " + this.interchanges + "\nstops: \n" + this.stops + "\nstops_distance: \n" + this.stops_distance;
    }
}
