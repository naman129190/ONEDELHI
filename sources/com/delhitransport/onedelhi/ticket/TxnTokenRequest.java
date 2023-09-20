package com.delhitransport.onedelhi.ticket;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;

public class TxnTokenRequest {
    @nu3("booking_id")
    @qy0
    private final String booking_id;
    @nu3("payment_flow")
    @qy0
    private final int payment_flow;
    @nu3("payment_mode")
    @qy0
    private final int payment_mode;
    @nu3("pg")
    @qy0

    /* renamed from: pg */
    private final int f7205pg;

    public TxnTokenRequest(String str, int i, int i2, int i3) {
        this.booking_id = str;
        this.f7205pg = i;
        this.payment_mode = i2;
        this.payment_flow = i3;
    }

    public String getBooking_id() {
        return this.booking_id;
    }

    public int getPayment_flow() {
        return this.payment_flow;
    }

    public int getPayment_mode() {
        return this.payment_mode;
    }

    public int getPg() {
        return this.f7205pg;
    }

    public String toString() {
        return "TxnTokenRequest{booking_id='" + this.booking_id + '\'' + ", pg=" + this.f7205pg + ", payment_mode=" + this.payment_mode + ", payment_flow=" + this.payment_flow + '}';
    }
}
