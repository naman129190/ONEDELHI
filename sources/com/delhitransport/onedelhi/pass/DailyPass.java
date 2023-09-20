package com.delhitransport.onedelhi.pass;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import java.io.Serializable;

public class DailyPass implements Serializable {
    @nu3("background")
    @qy0
    private String background;
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
    @nu3("fare")
    @qy0
    private float fare;
    @nu3("message")
    @qy0
    private String message;
    @nu3("pass_id")
    @qy0
    private String pass_id;
    @nu3("pass_type")
    @qy0
    private String pass_type;
    @nu3("age")
    @qy0
    private int passenger_age;
    @nu3("name")
    @qy0
    private String passenger_name;
    @nu3("transaction_status")
    @qy0
    private String transaction_status;
    @nu3("validity")
    @qy0
    private String validity;

    public DailyPass(String str, String str2, String str3, String str4, float f, String str5, String str6, String str7, String str8, String str9) {
        this.message = str;
        this.pass_id = str2;
        this.pass_type = str3;
        this.background = str4;
        this.fare = f;
        this.bus_agency = str5;
        this.booking_time = str6;
        this.validity = str7;
        this.description = str8;
        this.transaction_status = str9;
    }

    public DailyPass(String str, String str2, String str3, String str4, String str5, float f, String str6, String str7, String str8, String str9, String str10, String str11, int i) {
        this.booking_id = str;
        this.message = str2;
        this.pass_id = str3;
        this.pass_type = str4;
        this.background = str5;
        this.fare = f;
        this.bus_agency = str6;
        this.booking_time = str7;
        this.validity = str8;
        this.description = str9;
        this.transaction_status = str10;
        this.passenger_name = str11;
        this.passenger_age = i;
    }

    public String getBackground() {
        return this.background;
    }

    public String getBooking_id() {
        return this.booking_id;
    }

    public String getBooking_is() {
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

    public float getFare() {
        return this.fare;
    }

    public String getMessage() {
        return this.message;
    }

    public String getPass_id() {
        return this.pass_id;
    }

    public String getPass_type() {
        return this.pass_type;
    }

    public int getPassenger_age() {
        return this.passenger_age;
    }

    public String getPassenger_name() {
        return this.passenger_name;
    }

    public String getTransaction_status() {
        return this.transaction_status;
    }

    public String getValidity() {
        return this.validity;
    }

    public String toString() {
        return "DailyPass{passenger_name='" + this.passenger_name + '\'' + ", passenger_age=" + this.passenger_age + ", booking_id='" + this.booking_id + '\'' + ", message='" + this.message + '\'' + ", pass_id='" + this.pass_id + '\'' + ", pass_type='" + this.pass_type + '\'' + ", background='" + this.background + '\'' + ", fare=" + this.fare + ", bus_agency='" + this.bus_agency + '\'' + ", booking_time='" + this.booking_time + '\'' + ", validity='" + this.validity + '\'' + ", description='" + this.description + '\'' + ", transaction_status='" + this.transaction_status + '\'' + '}';
    }
}
