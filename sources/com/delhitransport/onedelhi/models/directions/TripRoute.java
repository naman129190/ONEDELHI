package com.delhitransport.onedelhi.models.directions;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import java.io.Serializable;
import java.util.ArrayList;

public class TripRoute implements Serializable {
    @nu3("agency")
    @qy0
    private String agency;
    @nu3("color")
    @qy0
    private String color;
    @nu3("score_text")
    @qy0
    private String comfortScore;
    @nu3("departure_time")
    @qy0
    private String departure_time;
    @nu3("direction")
    @qy0
    private int direction;
    @nu3("fare")
    @qy0
    private float fare;
    @nu3("id")
    @qy0

    /* renamed from: id */
    private int f7046id;
    @nu3("interchanges")
    @qy0
    private String interchanges;
    @nu3("long_name")
    @qy0
    private String longName;
    @nu3("occupancy")
    @qy0
    private String occupancy;
    @nu3("polyline")
    @qy0
    private String polyline;
    @nu3("route")
    @qy0
    private String route;
    @nu3("routes")
    @qy0
    private ArrayList<String> routes;
    @nu3("short_name")
    @qy0
    private String shortName;
    @nu3("stops")
    @qy0
    private ArrayList<Stop> stops;
    @nu3("stops_distance")
    @qy0
    private ArrayList<Double> stops_distance;
    @nu3("trip_time")
    @qy0
    private Integer trip_time;
    @nu3("type")
    @qy0
    private String type;
    @nu3("vehicle_id")
    @qy0
    private String vehicle_id;

    public TripRoute(int i, String str, String str2, String str3, String str4, int i2, String str5, ArrayList<Stop> arrayList, ArrayList<Double> arrayList2, String str6, String str7, float f, String str8, String str9, String str10, String str11) {
        this.f7046id = i;
        this.type = str;
        this.route = str2;
        this.shortName = str3;
        this.longName = str4;
        this.direction = i2;
        this.interchanges = str5;
        this.stops = arrayList;
        this.stops_distance = arrayList2;
        this.comfortScore = str6;
        this.agency = str7;
        this.fare = f;
        this.occupancy = str8;
        this.vehicle_id = str9;
        this.departure_time = str10;
        this.color = str11;
    }

    public TripRoute(int i, String str, String str2, ArrayList<String> arrayList, String str3, String str4, int i2, String str5, ArrayList<Stop> arrayList2, ArrayList<Double> arrayList3, String str6, String str7, float f, String str8, String str9, String str10, String str11) {
        this.f7046id = i;
        this.type = str;
        this.route = str2;
        this.routes = arrayList;
        this.shortName = str3;
        this.longName = str4;
        this.direction = i2;
        this.interchanges = str5;
        this.stops = arrayList2;
        this.stops_distance = arrayList3;
        this.comfortScore = str6;
        this.agency = str7;
        this.fare = f;
        this.occupancy = str8;
        this.vehicle_id = str9;
        this.departure_time = str10;
        this.color = str11;
    }

    public String getAgency() {
        return this.agency;
    }

    public String getColor() {
        return this.color;
    }

    public String getComfortScore() {
        return this.comfortScore;
    }

    public String getDeparture_time() {
        return this.departure_time;
    }

    public int getDirection() {
        return this.direction;
    }

    public float getFare() {
        return this.fare;
    }

    public int getId() {
        return this.f7046id;
    }

    public String getInterchanges() {
        return this.interchanges;
    }

    public String getLongName() {
        return this.longName;
    }

    public String getOccupancy() {
        return this.occupancy;
    }

    public String getPolyline() {
        return this.polyline;
    }

    public String getRoute() {
        return this.route;
    }

    public ArrayList<String> getRoutes() {
        return this.routes;
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

    public Integer getTrip_time() {
        return this.trip_time;
    }

    public String getType() {
        return this.type;
    }

    public String getVehicle_id() {
        return this.vehicle_id;
    }

    public void setAgency(String str) {
        this.agency = str;
    }

    public void setColor(String str) {
        this.color = str;
    }

    public void setComfortScore(String str) {
        this.comfortScore = str;
    }

    public void setDeparture_time(String str) {
        this.departure_time = str;
    }

    public void setDirection(int i) {
        this.direction = i;
    }

    public void setFare(float f) {
        this.fare = f;
    }

    public void setId(int i) {
        this.f7046id = i;
    }

    public void setInterchanges(String str) {
        this.interchanges = str;
    }

    public void setLongName(String str) {
        this.longName = str;
    }

    public void setOccupancy(String str) {
        this.occupancy = str;
    }

    public void setPolyline(String str) {
        this.polyline = str;
    }

    public void setRoute(String str) {
        this.route = str;
    }

    public void setRoutes(ArrayList<String> arrayList) {
        this.routes = arrayList;
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

    public void setTrip_time(Integer num) {
        this.trip_time = num;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setVehicle_id(String str) {
        this.vehicle_id = str;
    }

    public String toString() {
        return "TripRoute{id=" + this.f7046id + ", type='" + this.type + '\'' + ", route='" + this.route + '\'' + ", shortName='" + this.shortName + '\'' + ", longName='" + this.longName + '\'' + ", direction=" + this.direction + ", interchanges='" + this.interchanges + '\'' + ", stops=" + this.stops + ", stops_distance=" + this.stops_distance + ", comfortScore='" + this.comfortScore + '\'' + ", agency='" + this.agency + '\'' + ", fare=" + this.fare + ", occupancy='" + this.occupancy + '\'' + ", vehicle_id='" + this.vehicle_id + '\'' + ", departure_time='" + this.departure_time + '\'' + ", color='" + this.color + '\'' + '}';
    }
}
