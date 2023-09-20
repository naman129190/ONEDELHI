package com.delhitransport.onedelhi.models.payment;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;

public class CustomPaymentDataItem {
    @nu3("fields")
    @qy0
    private final CustomPaymentFieldItem fields;
    @nu3("model")
    @qy0
    private final Boolean model;
    @nu3("pk")
    @qy0

    /* renamed from: pk */
    private final int f7048pk;

    public CustomPaymentDataItem(Boolean bool, int i, CustomPaymentFieldItem customPaymentFieldItem) {
        this.model = bool;
        this.f7048pk = i;
        this.fields = customPaymentFieldItem;
    }

    public CustomPaymentFieldItem getFields() {
        return this.fields;
    }

    public Boolean getModel() {
        return this.model;
    }

    public int getPk() {
        return this.f7048pk;
    }

    public String toString() {
        return "CustomPaymentDataItem{model=" + this.model + ", pk=" + this.f7048pk + ", fields=" + this.fields + '}';
    }
}
