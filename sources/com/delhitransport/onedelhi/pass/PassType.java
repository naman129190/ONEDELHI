package com.delhitransport.onedelhi.pass;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;

public class PassType {
    @nu3("ac")
    @qy0

    /* renamed from: ac */
    private Float f7203ac;
    @nu3("mandatory")
    @qy0
    private boolean mandatory;
    @nu3("non-ac")
    @qy0
    private Float nac;

    public PassType(Float f, Float f2, boolean z) {
        this.f7203ac = f;
        this.nac = f2;
        this.mandatory = z;
    }

    public Float getAc() {
        return this.f7203ac;
    }

    public boolean getMandatory() {
        return this.mandatory;
    }

    public Float getNac() {
        return this.nac;
    }

    public String toString() {
        return "PassType{ac=" + this.f7203ac + ", nac=" + this.nac + ", mandatory='" + this.mandatory + '\'' + '}';
    }
}
