package com.delhitransport.onedelhi.ticket;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import java.io.Serializable;
import java.util.ArrayList;

public class FareDiscovery implements Serializable {
    @nu3("amount_payable_by_user")
    @qy0
    private Float amount_payable_by_user;
    @nu3("bus_agency")
    @qy0
    private String bus_agency;
    @nu3("bus_found")
    @qy0
    private Boolean bus_found;
    @nu3("bus_number")
    @qy0
    private String bus_number;
    @nu3("coupons_applied")
    @qy0
    private ArrayList<Coupon> coupons_applied;
    @nu3("end_stop_index")
    @qy0
    private int end_stop_index;
    @nu3("end_stop_name")
    @qy0
    private String end_stop_name;
    @nu3("fare_per_ticket")
    @qy0
    private float fare_per_ticket;
    @nu3("message")
    @qy0
    private String message;
    @nu3("start_stop_index")
    @qy0
    private int start_stop_index;
    @nu3("start_stop_name")
    @qy0
    private String start_stop_name;
    @nu3("total_fare")
    @qy0
    private float total_fare;
    @nu3("validity_stop_index")
    @qy0
    private int validity_stop_index;

    public FareDiscovery() {
    }

    public FareDiscovery(String str, Boolean bool, String str2, int i, String str3, int i2, int i3, String str4, String str5, Float f, float f2, float f3, ArrayList<Coupon> arrayList) {
        this.message = str;
        this.bus_found = bool;
        this.start_stop_name = str2;
        this.start_stop_index = i;
        this.end_stop_name = str3;
        this.end_stop_index = i2;
        this.validity_stop_index = i3;
        this.bus_number = str4;
        this.bus_agency = str5;
        this.amount_payable_by_user = f;
        this.total_fare = f2;
        this.fare_per_ticket = f3;
        this.coupons_applied = arrayList;
    }

    public Float getAmount_payable_by_user() {
        return this.amount_payable_by_user;
    }

    public String getBus_agency() {
        return this.bus_agency;
    }

    public Boolean getBus_found() {
        return this.bus_found;
    }

    public String getBus_number() {
        return this.bus_number;
    }

    public ArrayList<Coupon> getCoupons_applied() {
        return this.coupons_applied;
    }

    public int getEnd_stop_index() {
        return this.end_stop_index;
    }

    public String getEnd_stop_name() {
        return this.end_stop_name;
    }

    public float getFare_per_ticket() {
        return this.fare_per_ticket;
    }

    public String getMessage() {
        return this.message;
    }

    public int getStart_stop_index() {
        return this.start_stop_index;
    }

    public String getStart_stop_name() {
        return this.start_stop_name;
    }

    public float getTotal_fare() {
        return this.total_fare;
    }

    public int getValidity_stop_index() {
        return this.validity_stop_index;
    }

    public void setAmount_payable_by_user(Float f) {
        this.amount_payable_by_user = f;
    }

    public void setBus_agency(String str) {
        this.bus_agency = str;
    }

    public void setBus_found(Boolean bool) {
        this.bus_found = bool;
    }

    public void setBus_number(String str) {
        this.bus_number = str;
    }

    public void setCoupons_applied(ArrayList<Coupon> arrayList) {
        this.coupons_applied = arrayList;
    }

    public void setEnd_stop_index(int i) {
        this.end_stop_index = i;
    }

    public void setEnd_stop_name(String str) {
        this.end_stop_name = str;
    }

    public void setFare_per_ticket(float f) {
        this.fare_per_ticket = f;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setStart_stop_index(int i) {
        this.start_stop_index = i;
    }

    public void setStart_stop_name(String str) {
        this.start_stop_name = str;
    }

    public void setTotal_fare(float f) {
        this.total_fare = f;
    }

    public void setValidity_stop_index(int i) {
        this.validity_stop_index = i;
    }

    public String toString() {
        return "FareDiscovery{message='" + this.message + '\'' + ", bus_found=" + this.bus_found + ", start_stop_name='" + this.start_stop_name + '\'' + ", start_stop_index=" + this.start_stop_index + ", end_stop_name='" + this.end_stop_name + '\'' + ", end_stop_index=" + this.end_stop_index + ", validity_stop_index=" + this.validity_stop_index + ", bus_number='" + this.bus_number + '\'' + ", bus_agency='" + this.bus_agency + '\'' + ", amount_payable_by_user=" + this.amount_payable_by_user + ", total_fare=" + this.total_fare + ", fare_per_ticket=" + this.fare_per_ticket + ", coupons_applied=" + this.coupons_applied + '}';
    }
}
