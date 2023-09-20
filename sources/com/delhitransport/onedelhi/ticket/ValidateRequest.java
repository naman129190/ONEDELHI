package com.delhitransport.onedelhi.ticket;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import java.util.ArrayList;

public class ValidateRequest {
    @nu3("bus_number")
    @qy0
    private String bus_number;
    @nu3("category")
    @qy0
    private String category;
    @nu3("user_lat_lon")
    @qy0
    private ArrayList<Double> user_lat_lon;
    @nu3("user_login_id")
    @qy0
    private String user_login_id;
    @nu3("validate_mode")
    @qy0
    private String validate_mode;

    public ValidateRequest(String str, String str2, String str3, ArrayList<Double> arrayList, String str4) {
        this.bus_number = str;
        this.user_login_id = str2;
        this.user_lat_lon = arrayList;
        this.category = str3;
        this.validate_mode = str4;
    }

    public String getBus_number() {
        return this.bus_number;
    }

    public String getCategory() {
        return this.category;
    }

    public ArrayList<Double> getUser_lat_lon() {
        return this.user_lat_lon;
    }

    public String getUser_login_id() {
        return this.user_login_id;
    }

    public String getValidate_mode() {
        return this.validate_mode;
    }

    public void setBus_number(String str) {
        this.bus_number = str;
    }

    public void setUser_lat_lon(ArrayList<Double> arrayList) {
        this.user_lat_lon = arrayList;
    }

    public void setUser_login_id(String str) {
        this.user_login_id = str;
    }

    public String toString() {
        return "ValidateRequest{bus_number='" + this.bus_number + '\'' + ", user_login_id='" + this.user_login_id + '\'' + ", user_lat_lon=" + this.user_lat_lon + ", category='" + this.category + '\'' + ", validate_mode='" + this.validate_mode + '\'' + '}';
    }
}
