package com.delhitransport.onedelhi.ticket;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import java.io.Serializable;

public class Coupon implements Serializable {
    @nu3("amount")
    @qy0
    private Float amount;
    @nu3("code")
    @qy0
    private String code;
    @nu3("description")
    @qy0
    private String description;
    @nu3("name")
    @qy0
    private String name;
    @nu3("percentage")
    @qy0
    private Float percentage;

    public Coupon() {
    }

    public Coupon(String str, String str2, Float f, Float f2, String str3) {
        this.name = str;
        this.code = str2;
        this.percentage = f;
        this.amount = f2;
        this.description = str3;
    }

    public Float getAmount() {
        return this.amount;
    }

    public String getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }

    public String getName() {
        return this.name;
    }

    public Float getPercentage() {
        return this.percentage;
    }
}
