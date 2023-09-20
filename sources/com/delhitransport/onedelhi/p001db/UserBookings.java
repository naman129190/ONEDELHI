package com.delhitransport.onedelhi.p001db;

import com.onedelhi.secure.r10;
import com.onedelhi.secure.up1;
import com.onedelhi.secure.vu0;
import com.onedelhi.secure.w43;
import java.io.Serializable;

@vu0(indices = {@up1(unique = true, value = {"booking_id"})})
/* renamed from: com.delhitransport.onedelhi.db.UserBookings */
public class UserBookings implements Serializable {
    @r10(name = "bus_agency")
    private String agency;
    @r10(name = "booking_id")
    private String booking_id;
    @r10(name = "description")
    private String description;
    @w43(autoGenerate = true)

    /* renamed from: id */
    private int f7037id;
    @r10(name = "is_ac")
    private boolean is_ac;
    @r10(name = "message")
    private String message;
    @r10(name = "postpaid")
    private boolean postpaid;
    @r10(name = "route_long_name")
    private String route_long_name;
    @r10(name = "route_termination_stop")
    private String route_termination_stop;
    @r10(name = "start_stop_index")
    private int start_stop_index;
    @r10(name = "start_stop_name")
    private String start_stop_name;

    public String getAgency() {
        return this.agency;
    }

    public String getBooking_id() {
        return this.booking_id;
    }

    public String getDescription() {
        return this.description;
    }

    public int getId() {
        return this.f7037id;
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

    public void setAgency(String str) {
        this.agency = str;
    }

    public void setBooking_id(String str) {
        this.booking_id = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setId(int i) {
        this.f7037id = i;
    }

    public void setIs_ac(boolean z) {
        this.is_ac = z;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setPostpaid(boolean z) {
        this.postpaid = z;
    }

    public void setRoute_long_name(String str) {
        this.route_long_name = str;
    }

    public void setRoute_termination_stop(String str) {
        this.route_termination_stop = str;
    }

    public void setStart_stop_index(int i) {
        this.start_stop_index = i;
    }

    public void setStart_stop_name(String str) {
        this.start_stop_name = str;
    }

    public String toString() {
        return "UserBookings{id=" + this.f7037id + ", message='" + this.message + '\'' + ", route_long_name='" + this.route_long_name + '\'' + ", start_stop_index=" + this.start_stop_index + ", start_stop_name='" + this.start_stop_name + '\'' + ", booking_id='" + this.booking_id + '\'' + ", agency='" + this.agency + '\'' + ", is_ac=" + this.is_ac + ", description='" + this.description + '\'' + ", route_termination_stop='" + this.route_termination_stop + '\'' + ", postpaid=" + this.postpaid + '}';
    }
}
