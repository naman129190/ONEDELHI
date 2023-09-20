package com.delhitransport.onedelhi.models.directions;

import java.io.Serializable;
import java.util.ArrayList;

public class Routes_list_item implements Serializable {
    private ArrayList<String> colorList;
    private String comfort;
    private String departure_time;
    private ArrayList<String> fareList;
    private ArrayList<String> modeList;
    private String response_type;
    private ArrayList<String> routeList;
    private String start_stop;
    private String status;
    private String timeRange;
    private String tripTime;
    private ArrayList<String> tripTimeList;
    private ArrayList<String> vehicleIdList;

    public Routes_list_item() {
    }

    public Routes_list_item(String str, String str2, String str3, String str4, String str5, String str6, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3, ArrayList<String> arrayList4, ArrayList<String> arrayList5, ArrayList<String> arrayList6) {
        this.tripTime = str;
        this.comfort = str2;
        this.status = str3;
        this.timeRange = str4;
        this.start_stop = str5;
        this.departure_time = str6;
        this.fareList = arrayList;
        this.vehicleIdList = arrayList2;
        this.modeList = arrayList3;
        this.routeList = arrayList4;
        this.colorList = arrayList5;
        this.tripTimeList = arrayList6;
    }

    public Routes_list_item(String str, String str2, String str3, String str4, String str5, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3, ArrayList<String> arrayList4, ArrayList<String> arrayList5, ArrayList<String> arrayList6) {
        this.tripTime = str;
        this.comfort = str2;
        this.status = str3;
        this.timeRange = str4;
        this.response_type = str5;
        this.fareList = arrayList;
        this.vehicleIdList = arrayList2;
        this.modeList = arrayList3;
        this.routeList = arrayList4;
        this.colorList = arrayList5;
        this.tripTimeList = arrayList6;
    }

    public ArrayList<String> getColorList() {
        return this.colorList;
    }

    public String getComfort() {
        return this.comfort;
    }

    public String getDeparture_time() {
        return this.departure_time;
    }

    public ArrayList<String> getFareList() {
        return this.fareList;
    }

    public ArrayList<String> getModeList() {
        return this.modeList;
    }

    public String getResponse_type() {
        return this.response_type;
    }

    public ArrayList<String> getRouteList() {
        return this.routeList;
    }

    public String getStart_stop() {
        return this.start_stop;
    }

    public String getStatus() {
        return this.status;
    }

    public String getTimeRange() {
        return this.timeRange;
    }

    public String getTripTime() {
        return this.tripTime;
    }

    public ArrayList<String> getTripTimeList() {
        return this.tripTimeList;
    }

    public ArrayList<String> getVehicleIdList() {
        return this.vehicleIdList;
    }

    public void setColorList(ArrayList<String> arrayList) {
        this.colorList = arrayList;
    }

    public void setComfort(String str) {
        this.comfort = str;
    }

    public void setDeparture_time(String str) {
        this.departure_time = str;
    }

    public void setFareList(ArrayList<String> arrayList) {
        this.fareList = arrayList;
    }

    public void setModeList(ArrayList<String> arrayList) {
        this.modeList = arrayList;
    }

    public void setResponse_type(String str) {
        this.response_type = str;
    }

    public void setRouteList(ArrayList<String> arrayList) {
        this.routeList = arrayList;
    }

    public void setStart_stop(String str) {
        this.start_stop = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setTimeRange(String str) {
        this.timeRange = str;
    }

    public void setTripTime(String str) {
        this.tripTime = str;
    }

    public void setTripTimeList(ArrayList<String> arrayList) {
        this.tripTimeList = arrayList;
    }

    public void setVehicleIdList(ArrayList<String> arrayList) {
        this.vehicleIdList = arrayList;
    }

    public String toString() {
        return "Routes_list_item{tripTime='" + this.tripTime + '\'' + ", comfort='" + this.comfort + '\'' + ", status='" + this.status + '\'' + ", timeRange='" + this.timeRange + '\'' + ", response_type='" + this.response_type + '\'' + ", fareList=" + this.fareList + ", vehicleIdList=" + this.vehicleIdList + ", modeList=" + this.modeList + ", routeList=" + this.routeList + ", colorList=" + this.colorList + ", start_stop='" + this.start_stop + '\'' + ", departure_time='" + this.departure_time + '\'' + '}';
    }
}
