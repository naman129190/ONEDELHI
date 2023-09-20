package com.delhitransport.onedelhi.ticket;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;

public class TicketRequest {
    @nu3("booking_id")
    @qy0
    private String booking_id;
    @nu3("bus_number")
    @qy0
    private String bus_number;
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
    @nu3("transaction_type")
    @qy0
    private int transaction_type;

    public TicketRequest() {
    }

    public TicketRequest(String str, float f, String str2, String str3, String str4, String str5) {
        this.bus_number = str;
        this.fare = f;
        this.transaction_id = str2;
        this.booking_id = str3;
        this.currency = str4;
        this.mode = str5;
    }

    public TicketRequest(String str, float f, String str2, String str3, String str4, String str5, int i) {
        this.bus_number = str;
        this.fare = f;
        this.transaction_id = str2;
        this.booking_id = str3;
        this.currency = str4;
        this.mode = str5;
        this.transaction_type = i;
    }

    public String getBooking_id() {
        return this.booking_id;
    }

    public String getBus_number() {
        return this.bus_number;
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

    public int getTransaction_type() {
        return this.transaction_type;
    }

    public String toString() {
        return "TicketRequest{bus_number='" + this.bus_number + '\'' + ", fare=" + this.fare + ", transaction_id='" + this.transaction_id + '\'' + ", booking_id='" + this.booking_id + '\'' + ", currency='" + this.currency + '\'' + ", mode='" + this.mode + '\'' + ", transaction_type=" + this.transaction_type + '}';
    }
}
