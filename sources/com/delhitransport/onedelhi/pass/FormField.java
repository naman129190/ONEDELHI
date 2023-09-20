package com.delhitransport.onedelhi.pass;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;

public class FormField {
    @nu3("description")
    @qy0
    private String description;
    @nu3("display_name")
    @qy0
    private String display_name;
    @nu3("field_name")
    @qy0
    private String field_name;
    @nu3("mandatory")
    @qy0
    private boolean mandatory;
    @nu3("max_value")
    @qy0
    private String max_value;
    @nu3("min_value")
    @qy0
    private String min_value;
    @nu3("type")
    @qy0
    private String type;

    public FormField(String str, String str2, String str3, String str4, String str5, boolean z, String str6) {
        this.field_name = str;
        this.display_name = str2;
        this.type = str3;
        this.min_value = str4;
        this.max_value = str5;
        this.mandatory = z;
        this.description = str6;
    }

    public String getDescription() {
        return this.description;
    }

    public String getDisplay_name() {
        return this.display_name;
    }

    public String getField_name() {
        return this.field_name;
    }

    public String getMax_value() {
        return this.max_value;
    }

    public String getMin_value() {
        return this.min_value;
    }

    public String getType() {
        return this.type;
    }

    public boolean isMandatory() {
        return this.mandatory;
    }

    public String toString() {
        return "FormField{field_name='" + this.field_name + '\'' + ", display_name='" + this.display_name + '\'' + ", type='" + this.type + '\'' + ", min_value=" + this.min_value + ", max_value=" + this.max_value + ", mandatory=" + this.mandatory + ", description='" + this.description + '\'' + '}';
    }
}
