package com.delhitransport.onedelhi.ticket;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import java.io.Serializable;

public class FareOptionsEntry implements Serializable {
    @nu3("final_fare")
    @qy0
    private float final_fare;
    @nu3("validity_stop_idx")
    @qy0
    private int validity_stop_idx;
    @nu3("validity_stop_name")
    @qy0
    private String validity_stop_name;

    public FareOptionsEntry(float f, int i, String str) {
        this.final_fare = f;
        this.validity_stop_idx = i;
        this.validity_stop_name = str;
    }

    public float getFinal_fare() {
        return this.final_fare;
    }

    public int getValidity_stop_idx() {
        return this.validity_stop_idx;
    }

    public String getValidity_stop_name() {
        return this.validity_stop_name;
    }

    public String toString() {
        return "FareOptionsEntry{final_fare=" + this.final_fare + ", validity_stop_idx=" + this.validity_stop_idx + ", validity_stop_name='" + this.validity_stop_name + '\'' + '}';
    }
}
