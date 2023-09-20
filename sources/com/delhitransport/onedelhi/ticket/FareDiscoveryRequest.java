package com.delhitransport.onedelhi.ticket;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;

public class FareDiscoveryRequest {
    @nu3("booking_id")
    @qy0
    private String booking_id;
    @nu3("bus_number")
    @qy0
    private String bus_number;
    @nu3("category")
    @qy0
    private String category;
    @nu3("end_stop_index")
    @qy0
    private int end_stop_index;
    @nu3("fare_per_ticket")
    @qy0
    private float fare_per_ticket;
    @nu3("route_long_name")
    @qy0
    private String route_long_name;
    @nu3("start_stop_index")
    @qy0
    private int start_stop_index;
    @nu3("ticket_count")
    @qy0
    private int tickets_count;

    public FareDiscoveryRequest() {
    }

    public FareDiscoveryRequest(String str, String str2, int i, int i2, float f, String str3, String str4, int i3) {
        this.booking_id = str;
        this.route_long_name = str2;
        this.start_stop_index = i;
        this.end_stop_index = i2;
        this.fare_per_ticket = f;
        this.bus_number = str3;
        this.category = str4;
        this.tickets_count = i3;
    }

    public String getBooking_id() {
        return this.booking_id;
    }

    public String getBus_number() {
        return this.bus_number;
    }

    public String getCategory() {
        return this.category;
    }

    public int getEnd_stop_index() {
        return this.end_stop_index;
    }

    public float getFare_per_ticket() {
        return this.fare_per_ticket;
    }

    public String getRoute_long_name() {
        return this.route_long_name;
    }

    public int getStart_stop_index() {
        return this.start_stop_index;
    }

    public int getTickets_count() {
        return this.tickets_count;
    }

    public void setBooking_id(String str) {
        this.booking_id = str;
    }

    public void setBus_number(String str) {
        this.bus_number = str;
    }

    public void setCategory(String str) {
        this.category = str;
    }

    public void setEnd_stop_index(int i) {
        this.end_stop_index = i;
    }

    public void setFare_per_ticket(float f) {
        this.fare_per_ticket = f;
    }

    public void setRoute_long_name(String str) {
        this.route_long_name = str;
    }

    public void setStart_stop_index(int i) {
        this.start_stop_index = i;
    }

    public void setTickets_count(int i) {
        this.tickets_count = i;
    }

    public String toString() {
        return "FareDiscoveryRequest{booking_id='" + this.booking_id + '\'' + ", route_long_name='" + this.route_long_name + '\'' + ", start_stop_index=" + this.start_stop_index + ", end_stop_index=" + this.end_stop_index + ", fare_per_ticket=" + this.fare_per_ticket + ", bus_number='" + this.bus_number + '\'' + ", category='" + this.category + '\'' + ", tickets_count=" + this.tickets_count + '}';
    }
}
