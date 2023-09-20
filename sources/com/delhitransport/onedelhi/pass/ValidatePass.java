package com.delhitransport.onedelhi.pass;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import java.io.Serializable;

public class ValidatePass implements Serializable {
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
    @nu3("description")
    @qy0
    private String description;
    @nu3("message")
    @qy0
    private String message;
    @nu3("pass_type")
    @qy0
    private String pass_type;
    @nu3("total_fare")
    @qy0
    private float total_fare;
    @nu3("validity")
    @qy0
    private String validity;

    public ValidatePass(String str, String str2, String str3, String str4, String str5, String str6, float f, float f2, String str7) {
        this.message = str;
        this.booking_id = str2;
        this.bus_agency = str3;
        this.booking_time = str4;
        this.validity = str5;
        this.pass_type = str6;
        this.total_fare = f;
        this.amount_payable_by_user = f2;
        this.description = str7;
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

    public String getDescription() {
        return this.description;
    }

    public String getMessage() {
        return this.message;
    }

    public String getPass_type() {
        return this.pass_type;
    }

    public float getTotal_fare() {
        return this.total_fare;
    }

    public String getValidity() {
        return this.validity;
    }

    public String toString() {
        return "ValidatePass{message='" + this.message + '\'' + ", booking_id='" + this.booking_id + '\'' + ", bus_agency='" + this.bus_agency + '\'' + ", booking_time='" + this.booking_time + '\'' + ", validity='" + this.validity + '\'' + ", pass_type=" + this.pass_type + ", total_fare=" + this.total_fare + ", amount_payable_by_user=" + this.amount_payable_by_user + ", description='" + this.description + '\'' + '}';
    }
}
