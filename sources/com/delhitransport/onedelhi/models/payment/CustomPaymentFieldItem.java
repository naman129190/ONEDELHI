package com.delhitransport.onedelhi.models.payment;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;

public class CustomPaymentFieldItem {
    @nu3("active")
    @qy0
    private final Boolean active;
    @nu3("display_name")
    @qy0
    private final String display_name;
    @nu3("logo_url")
    @qy0
    private final String logo_url;
    @nu3("message")
    @qy0
    private final String message;
    @nu3("mode")
    @qy0
    private final String mode;
    @nu3("pg")
    @qy0

    /* renamed from: pg */
    private final int f7049pg;

    public CustomPaymentFieldItem(Boolean bool, String str, String str2, int i, String str3, String str4) {
        this.active = bool;
        this.mode = str;
        this.display_name = str2;
        this.f7049pg = i;
        this.message = str3;
        this.logo_url = str4;
    }

    public Boolean getActive() {
        return this.active;
    }

    public String getDisplay_name() {
        return this.display_name;
    }

    public String getLogo_url() {
        return this.logo_url;
    }

    public String getMessage() {
        return this.message;
    }

    public String getMode() {
        return this.mode;
    }

    public int getPg() {
        return this.f7049pg;
    }

    public String toString() {
        return "CustomPaymentItem{active=" + this.active + ", mode='" + this.mode + '\'' + ", display_name='" + this.display_name + '\'' + ", pg=" + this.f7049pg + ", message='" + this.message + '\'' + ", logo_url='" + this.logo_url + '\'' + '}';
    }
}
