package com.delhitransport.onedelhi.pass;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;

public class PassTxnTokenRequest {
    @nu3("booking_id")
    @qy0
    private String booking_id;
    @nu3("fare")
    @qy0
    private float fare;

    public PassTxnTokenRequest(String str, float f) {
        this.booking_id = str;
        this.fare = f;
    }

    public String getBooking_id() {
        return this.booking_id;
    }

    public float getFare() {
        return this.fare;
    }

    public void setBooking_id(String str) {
        this.booking_id = str;
    }

    public void setFare(float f) {
        this.fare = f;
    }

    public String toString() {
        return "PassTxnTokenRequest{booking_id='" + this.booking_id + '\'' + ", fare=" + this.fare + '}';
    }
}
