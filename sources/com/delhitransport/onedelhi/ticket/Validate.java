package com.delhitransport.onedelhi.ticket;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class Validate implements Serializable {
    @nu3("bus_agency")
    @qy0
    private String agency;
    @nu3("booking_id")
    @qy0
    private String booking_id;
    @nu3("bus_found")
    @qy0
    private boolean bus_found;
    @nu3("description")
    @qy0
    private String description;
    @nu3("fare_options")
    @qy0
    private ArrayList<HashMap<String, FareOptionsEntry>> fare_options;
    @nu3("is_ac")
    @qy0
    private boolean is_ac;
    @nu3("message")
    @qy0
    private String message;
    @nu3("postpaid")
    @qy0
    private boolean postpaid;
    @nu3("route_long_name")
    @qy0
    private String route_long_name;
    @nu3("route_termination_stop")
    @qy0
    private String route_termination_stop;
    @nu3("start_stop_index")
    @qy0
    private int start_stop_index;
    @nu3("start_stop_name")
    @qy0
    private String start_stop_name;

    public Validate() {
    }

    public Validate(String str, boolean z, String str2, int i, String str3, ArrayList<HashMap<String, FareOptionsEntry>> arrayList, String str4, String str5, boolean z2, String str6, String str7, boolean z3) {
        this.message = str;
        this.bus_found = z;
        this.route_long_name = str2;
        this.start_stop_index = i;
        this.start_stop_name = str3;
        this.fare_options = arrayList;
        this.booking_id = str4;
        this.agency = str5;
        this.is_ac = z2;
        this.description = str6;
        this.route_termination_stop = str7;
        this.postpaid = z3;
    }

    public String getAgency() {
        return this.agency;
    }

    public String getBooking_id() {
        return this.booking_id;
    }

    public String getDescription() {
        return this.description;
    }

    public ArrayList<HashMap<String, FareOptionsEntry>> getFare_options() {
        return this.fare_options;
    }

    public String getMessage() {
        return this.message;
    }

    public String getRoute_long_name() {
        return this.route_long_name;
    }

    public String getRoute_termination_stop() {
        return this.route_termination_stop;
    }

    public int getStart_stop_index() {
        return this.start_stop_index;
    }

    public String getStart_stop_name() {
        return this.start_stop_name;
    }

    public boolean isIs_ac() {
        return this.is_ac;
    }

    public boolean isPostpaid() {
        return this.postpaid;
    }

    public void setBooking_id(String str) {
        this.booking_id = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setRoute_long_name(String str) {
        this.route_long_name = str;
    }

    public String toString() {
        return "Validate{message='" + this.message + '\'' + ", bus_found=" + this.bus_found + ", route_long_name='" + this.route_long_name + '\'' + ", start_stop_index=" + this.start_stop_index + ", start_stop_name='" + this.start_stop_name + '\'' + ", fare_options=" + this.fare_options + ", booking_id='" + this.booking_id + '\'' + ", agency='" + this.agency + '\'' + ", is_ac=" + this.is_ac + ", description='" + this.description + '\'' + ", route_termination_stop='" + this.route_termination_stop + '\'' + ", postpaid=" + this.postpaid + '}';
    }
}
