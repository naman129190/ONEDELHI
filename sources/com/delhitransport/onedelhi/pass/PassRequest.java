package com.delhitransport.onedelhi.pass;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;

public class PassRequest {
    @nu3("booking_id")
    @qy0
    private String booking_id;
    @nu3("currency")
    @qy0
    private String currency;
    @nu3("fare")
    @qy0
    private float fare;
    @nu3("mode")
    @qy0
    private String mode;
    @nu3("transaction_id")
    @qy0
    private String transaction_id;

    public PassRequest() {
    }

    public PassRequest(float f, String str, String str2, String str3, String str4) {
        this.fare = f;
        this.transaction_id = str;
        this.booking_id = str2;
        this.currency = str3;
        this.mode = str4;
    }

    public String getBooking_id() {
        return this.booking_id;
    }

    public String getCurrency() {
        return this.currency;
    }

    public float getFare() {
        return this.fare;
    }

    public String getMode() {
        return this.mode;
    }

    public String getTransaction_id() {
        return this.transaction_id;
    }

    public String toString() {
        return "PassRequest{fare=" + this.fare + ", transaction_id='" + this.transaction_id + '\'' + ", booking_id='" + this.booking_id + '\'' + ", currency='" + this.currency + '\'' + ", mode='" + this.mode + '\'' + '}';
    }
}
