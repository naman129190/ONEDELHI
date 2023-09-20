package com.delhitransport.onedelhi.models.payment;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;

public class PaymentTransactionsItem {
    @nu3("booking")
    @qy0
    private final String booking;
    @nu3("createdAt")
    @qy0
    private final String created_at;
    @nu3("gateway_order_id")
    @qy0
    private final String order_id;
    @nu3("txnStatus")
    @qy0
    private final String txn_Status;
    @nu3("value")
    @qy0
    private final float value;

    public PaymentTransactionsItem(String str, String str2, float f, String str3, String str4) {
        this.booking = str;
        this.order_id = str2;
        this.value = f;
        this.txn_Status = str3;
        this.created_at = str4;
    }

    public String getBooking() {
        return this.booking;
    }

    public String getCreated_at() {
        return this.created_at;
    }

    public String getOrder_id() {
        return this.order_id;
    }

    public String getTxn_Status() {
        return this.txn_Status;
    }

    public float getValue() {
        return this.value;
    }

    public String toString() {
        return "PaymentTransactionsItem{booking='" + this.booking + '\'' + ", order_id='" + this.order_id + '\'' + ", value=" + this.value + ", txn_Status='" + this.txn_Status + '\'' + ", created_at='" + this.created_at + '\'' + '}';
    }
}
