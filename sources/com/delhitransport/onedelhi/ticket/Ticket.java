package com.delhitransport.onedelhi.ticket;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import java.io.Serializable;

public class Ticket implements Serializable {
    @nu3("amount_payable_by_user")
    @qy0
    private float amount_payable_by_user;
    @nu3("booking_id")
    @qy0
    private String booking_id;
    @nu3("booking_time")
    @qy0
    private String booking_time;
    @nu3("bus_agency")
    @qy0
    private String bus_agency;
    @nu3("bus_number")
    @qy0
    private String bus_number;
    @nu3("bus_route_long_name")
    @qy0
    private String bus_route_long_name;
    @nu3("category")
    @qy0
    private String category;
    @nu3("description")
    @qy0
    private String description;
    @nu3("fare")
    @qy0
    private float fare;
    @nu3("fare_per_ticket")
    @qy0
    private float fare_per_ticket;
    @nu3("is_ac")
    @qy0
    private boolean isAc;
    @nu3("message")
    @qy0
    private String message;
    @nu3("ticket_count")
    @qy0
    private int ticket_count;
    @nu3("ticket_end_stop_index")
    @qy0
    private int ticket_end_stop_idx;
    @nu3("ticket_end_stop_name")
    @qy0
    private String ticket_end_stop_name;
    @nu3("ticket_id")
    @qy0
    private String ticket_id;
    @nu3("ticket_start_stop_index")
    @qy0
    private int ticket_start_stop_idx;
    @nu3("ticket_start_stop_name")
    @qy0
    private String ticket_start_stop_name;
    @nu3("tickets_count")
    @qy0
    private int tickets_count;
    @nu3("total_fare")
    @qy0
    private float total_fare;
    @nu3("transaction_status")
    @qy0
    private String transaction_status;
    @nu3("transaction_type")
    @qy0
    private int transaction_type;
    @nu3("validity")
    @qy0
    private String validity;
    @nu3("validity_stop_index")
    @qy0
    private int validity_stop_idx;

    public Ticket() {
    }

    public Ticket(String str, String str2, String str3, String str4, float f, String str5, String str6, String str7, String str8, String str9, float f2, int i, int i2, float f3, int i3, int i4, String str10, String str11, String str12, int i5, String str13, int i6, float f4, boolean z) {
        this.message = str;
        this.bus_number = str2;
        this.ticket_id = str3;
        this.booking_id = str4;
        this.fare = f;
        this.bus_route_long_name = str5;
        this.bus_agency = str6;
        this.booking_time = str7;
        this.validity = str8;
        this.description = str9;
        this.total_fare = f2;
        this.tickets_count = i;
        this.ticket_count = i2;
        this.fare_per_ticket = f3;
        this.validity_stop_idx = i3;
        this.transaction_type = i4;
        this.transaction_status = str10;
        this.category = str11;
        this.ticket_start_stop_name = str12;
        this.ticket_start_stop_idx = i5;
        this.ticket_end_stop_name = str13;
        this.ticket_end_stop_idx = i6;
        this.amount_payable_by_user = f4;
        this.isAc = z;
    }

    public float getAmount_payable_by_user() {
        return this.amount_payable_by_user;
    }

    public String getBooking_id() {
        return this.booking_id;
    }

    public String getBooking_time() {
        return this.booking_time;
    }

    public String getBus_agency() {
        return this.bus_agency;
    }

    public String getBus_number() {
        return this.bus_number;
    }

    public String getBus_route_long_name() {
        return this.bus_route_long_name;
    }

    public String getCategory() {
        return this.category;
    }

    public String getDescription() {
        return this.description;
    }

    public float getFare() {
        return this.fare;
    }

    public float getFare_per_ticket() {
        return this.fare_per_ticket;
    }

    public String getMessage() {
        return this.message;
    }

    public int getTicket_count() {
        return this.ticket_count;
    }

    public int getTicket_end_stop_idx() {
        return this.ticket_end_stop_idx;
    }

    public String getTicket_end_stop_name() {
        return this.ticket_end_stop_name;
    }

    public String getTicket_id() {
        return this.ticket_id;
    }

    public int getTicket_start_stop_idx() {
        return this.ticket_start_stop_idx;
    }

    public String getTicket_start_stop_name() {
        return this.ticket_start_stop_name;
    }

    public int getTickets_count() {
        return this.tickets_count;
    }

    public float getTotal_fare() {
        return this.total_fare;
    }

    public String getTransaction_status() {
        return this.transaction_status;
    }

    public int getTransaction_type() {
        return this.transaction_type;
    }

    public String getValidity() {
        return this.validity;
    }

    public int getValidity_stop_idx() {
        return this.validity_stop_idx;
    }

    public boolean isAc() {
        return this.isAc;
    }

    public void setAc(boolean z) {
        this.isAc = z;
    }

    public void setAmount_payable_by_user(float f) {
        this.amount_payable_by_user = f;
    }

    public void setBooking_id(String str) {
        this.booking_id = str;
    }

    public void setBooking_time(String str) {
        this.booking_time = str;
    }

    public void setBus_agency(String str) {
        this.bus_agency = str;
    }

    public void setBus_number(String str) {
        this.bus_number = str;
    }

    public void setBus_route_long_name(String str) {
        this.bus_route_long_name = str;
    }

    public void setCategory(String str) {
        this.category = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setFare(float f) {
        this.fare = f;
    }

    public void setFare_per_ticket(float f) {
        this.fare_per_ticket = f;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setTicket_count(int i) {
        this.ticket_count = i;
    }

    public void setTicket_end_stop_idx(int i) {
        this.ticket_end_stop_idx = i;
    }

    public void setTicket_end_stop_name(String str) {
        this.ticket_end_stop_name = str;
    }

    public void setTicket_id(String str) {
        this.ticket_id = str;
    }

    public void setTicket_start_stop_idx(int i) {
        this.ticket_start_stop_idx = i;
    }

    public void setTicket_start_stop_name(String str) {
        this.ticket_start_stop_name = str;
    }

    public void setTickets_count(int i) {
        this.tickets_count = i;
    }

    public void setTotal_fare(float f) {
        this.total_fare = f;
    }

    public void setTransaction_status(String str) {
        this.transaction_status = str;
    }

    public void setTransaction_type(int i) {
        this.transaction_type = i;
    }

    public void setValidity(String str) {
        this.validity = str;
    }

    public void setValidity_stop_idx(int i) {
        this.validity_stop_idx = i;
    }

    public String toString() {
        return "UserTickets{message='" + this.message + '\'' + ", bus_number='" + this.bus_number + '\'' + ", ticket_id='" + this.ticket_id + '\'' + ", booking_id='" + this.booking_id + '\'' + ", fare=" + this.fare + ", bus_route_long_name='" + this.bus_route_long_name + '\'' + ", bus_agency='" + this.bus_agency + '\'' + ", booking_time='" + this.booking_time + '\'' + ", validity='" + this.validity + '\'' + ", description='" + this.description + '\'' + ", total_fare=" + this.total_fare + ", tickets_count=" + this.tickets_count + ", ticket_count=" + this.ticket_count + ", fare_per_ticket=" + this.fare_per_ticket + ", validity_stop_idx=" + this.validity_stop_idx + ", transaction_type=" + this.transaction_type + ", transaction_status='" + this.transaction_status + '\'' + ", category='" + this.category + '\'' + ", ticket_start_stop_name='" + this.ticket_start_stop_name + '\'' + ", ticket_start_stop_idx=" + this.ticket_start_stop_idx + ", ticket_end_stop_name='" + this.ticket_end_stop_name + '\'' + ", ticket_end_stop_idx=" + this.ticket_end_stop_idx + ", amount_payable_by_user=" + this.amount_payable_by_user + ", isAc=" + this.isAc + '}';
    }
}
