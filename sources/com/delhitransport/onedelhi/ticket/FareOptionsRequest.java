package com.delhitransport.onedelhi.ticket;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import java.util.ArrayList;

public class FareOptionsRequest {
    @nu3("booking_id")
    @qy0
    private String booking_id;
    @nu3("is_ac")
    @qy0
    private Boolean is_ac;
    @nu3("route_long_name")
    @qy0
    private String route_long_name;
    @nu3("user_lat_lon")
    @qy0
    private ArrayList<Double> user_lat_lon;

    public FareOptionsRequest(String str, String str2, Boolean bool, ArrayList<Double> arrayList) {
        this.route_long_name = str;
        this.booking_id = str2;
        this.is_ac = bool;
        this.user_lat_lon = arrayList;
    }

    public String getBooking_id() {
        return this.booking_id;
    }

    public Boolean getIs_ac() {
        return this.is_ac;
    }

    public String getRoute_long_name() {
        return this.route_long_name;
    }

    public String toString() {
        return "FareOptionsRequest{route_long_name='" + this.route_long_name + '\'' + ", booking_id='" + this.booking_id + '\'' + ", is_ac=" + this.is_ac + '}';
    }
}
