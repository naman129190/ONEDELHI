package com.delhitransport.onedelhi.models.directions;

import java.io.Serializable;

public class RecyclerViewItem implements Serializable {
    private String color;
    private String comfortScore;
    private String departure_time;
    private String dest;
    private String fare;
    private String route;
    private String route_time;
    private String src;
    private String tripHeading;
    private String trip_time;
    private String vehicle_id;

    public RecyclerViewItem(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.src = str;
        this.dest = str2;
        this.tripHeading = str3;
        this.route = str4;
        this.comfortScore = str5;
        this.fare = str6;
        this.trip_time = str7;
    }

    public RecyclerViewItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.src = str;
        this.dest = str2;
        this.tripHeading = str3;
        this.route = str4;
        this.comfortScore = str5;
        this.fare = str6;
        this.trip_time = str7;
        this.vehicle_id = str8;
        this.color = str9;
        this.departure_time = str10;
        this.route_time = str11;
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

    public String getDest() {
        return this.dest;
    }

    public String getFare() {
        return this.fare;
    }

    public String getRoute() {
        return this.route;
    }

    public String getRoute_time() {
        return this.route_time;
    }

    public String getSrc() {
        return this.src;
    }

    public String getTripHeading() {
        return this.tripHeading;
    }

    public String getTrip_time() {
        return this.trip_time;
    }

    public String getVehicle_id() {
        return this.vehicle_id;
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

    public void setDest(String str) {
        this.dest = str;
    }

    public void setFare(String str) {
        this.fare = str;
    }

    public void setRoute(String str) {
        this.route = str;
    }

    public void setRoute_time(String str) {
        this.route_time = str;
    }

    public void setSrc(String str) {
        this.src = str;
    }

    public void setTripHeading(String str) {
        this.tripHeading = str;
    }

    public void setTrip_time(String str) {
        this.trip_time = str;
    }

    public void setVehicle_id(String str) {
        this.vehicle_id = str;
    }

    public String toString() {
        return "RecyclerViewItem{src='" + this.src + '\'' + ", dest='" + this.dest + '\'' + ", tripHeading='" + this.tripHeading + '\'' + ", route='" + this.route + '\'' + ", comfortScore='" + this.comfortScore + '\'' + ", fare='" + this.fare + '\'' + ", trip_time='" + this.trip_time + '\'' + ", vehicle_id='" + this.vehicle_id + '\'' + ", color='" + this.color + '\'' + ", departure_time='" + this.departure_time + '\'' + '}';
    }
}
