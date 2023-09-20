package com.delhitransport.onedelhi.pass;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import java.util.ArrayList;

public class DailyPassForm {
    @nu3("form_fields")
    @qy0
    private ArrayList<FormField> form_fields;
    @nu3("pass_type")
    @qy0
    private PassType pass_type;

    public DailyPassForm(ArrayList<FormField> arrayList, PassType passType) {
        this.form_fields = arrayList;
        this.pass_type = passType;
    }

    public ArrayList<FormField> getForm_fields() {
        return this.form_fields;
    }

    public PassType getPass_type() {
        return this.pass_type;
    }

    public String toString() {
        return "DailyPassForm{form_fields=" + this.form_fields + ", pass_type=" + this.pass_type + '}';
    }
}
