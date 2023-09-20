package com.delhitransport.onedelhi.p001db;

import com.onedelhi.secure.r10;
import com.onedelhi.secure.up1;
import com.onedelhi.secure.vu0;
import com.onedelhi.secure.w43;
import java.io.Serializable;

@vu0(indices = {@up1(unique = true, value = {"ticket_id"})})
/* renamed from: com.delhitransport.onedelhi.db.UserTickets */
public class UserTickets implements Serializable {
    @r10(name = "amount_payable_by_user")
    private float amount_payable_by_user;
    @r10(name = "booking_id")
    private String booking_id;
    @r10(name = "booking_time")
    private String booking_time;
    @r10(name = "bus_agency")
    private String bus_agency;
    @r10(name = "bus_number")
    private String bus_number;
    @r10(name = "bus_route_long_name")
    private String bus_route_long_name;
    @r10(name = "category")
    private String category;
    @r10(name = "description")
    private String description;
    @r10(name = "fare")
    private float fare;
    @r10(name = "fare_per_ticket")
    private float fare_per_ticket;
    @w43(autoGenerate = true)

    /* renamed from: id */
    private int f7038id;
    @r10(name = "is_ac")
    private boolean isAc;
    @r10(name = "message")
    private String message;
    @r10(name = "ticket_count")
    private int ticket_count;
    @r10(name = "ticket_end_stop_index")
    private int ticket_end_stop_idx;
    @r10(name = "ticket_end_stop_name")
    private String ticket_end_stop_name;
    @r10(name = "ticket_id")
    private String ticket_id;
    @r10(name = "ticket_start_stop_index")
    private int ticket_start_stop_idx;
    @r10(name = "ticket_start_stop_name")
    private String ticket_start_stop_name;
    @r10(name = "total_fare")
    private float total_fare;
    @r10(name = "transaction_status")
    private String transaction_status;
    @r10(name = "transaction_type")
    private int transaction_type;
    @r10(name = "validity")
    private String validity;
    @r10(name = "validity_stop_index")
    private int validity_stop_idx;

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

    public int getId() {
        return this.f7038id;
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

    public void setId(int i) {
        this.f7038id = i;
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
        return "UserTickets{id=" + this.f7038id + ", message='" + this.message + '\'' + ", bus_number='" + this.bus_number + '\'' + ", ticket_id='" + this.ticket_id + '\'' + ", booking_id='" + this.booking_id + '\'' + ", fare=" + this.fare + ", bus_route_long_name='" + this.bus_route_long_name + '\'' + ", bus_agency='" + this.bus_agency + '\'' + ", booking_time='" + this.booking_time + '\'' + ", validity='" + this.validity + '\'' + ", description='" + this.description + '\'' + ", total_fare=" + this.total_fare + ", ticket_count=" + this.ticket_count + ", fare_per_ticket=" + this.fare_per_ticket + ", validity_stop_idx=" + this.validity_stop_idx + ", transaction_type=" + this.transaction_type + ", transaction_status='" + this.transaction_status + '\'' + ", category='" + this.category + '\'' + ", ticket_start_stop_name='" + this.ticket_start_stop_name + '\'' + ", ticket_start_stop_idx=" + this.ticket_start_stop_idx + ", ticket_end_stop_name='" + this.ticket_end_stop_name + '\'' + ", ticket_end_stop_idx=" + this.ticket_end_stop_idx + ", amount_payable_by_user=" + this.amount_payable_by_user + ", isAc=" + this.isAc + '}';
    }
}
