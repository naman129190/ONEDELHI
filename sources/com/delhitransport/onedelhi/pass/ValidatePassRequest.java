package com.delhitransport.onedelhi.pass;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import java.io.Serializable;
import java.util.ArrayList;

public class ValidatePassRequest implements Serializable {
    @nu3("age")
    @qy0
    private int age;
    @nu3("bus_number")
    @qy0
    private String bus_number;
    @nu3("email")
    @qy0
    private String email;
    @nu3("gender")
    @qy0
    private String gender;
    @nu3("mobile_number")
    @qy0
    private float mobile_number;
    @nu3("name")
    @qy0
    private String name;
    @nu3("pass_type")
    @qy0
    private String pass_type;
    @nu3("user_lat_lon")
    @qy0
    private ArrayList<Float> user_lat_lon;
    @nu3("user_login_id")
    @qy0
    private String user_login_id;
    @nu3("validate_mode")
    @qy0
    private String validate_mode;

    public ValidatePassRequest() {
    }

    public ValidatePassRequest(String str, String str2, int i, String str3, float f, String str4, String str5, ArrayList<Float> arrayList, String str6, String str7) {
        this.user_login_id = str;
        this.name = str2;
        this.age = i;
        this.gender = str3;
        this.mobile_number = f;
        this.email = str4;
        this.pass_type = str5;
        this.user_lat_lon = arrayList;
        this.bus_number = str6;
        this.validate_mode = str7;
    }

    public int getAge() {
        return this.age;
    }

    public String getBus_number() {
        return this.bus_number;
    }

    public String getEmail() {
        return this.email;
    }

    public String getGender() {
        return this.gender;
    }

    public float getMobile_number() {
        return this.mobile_number;
    }

    public String getName() {
        return this.name;
    }

    public String getPass_type() {
        return this.pass_type;
    }

    public ArrayList<Float> getUser_lat_lon() {
        return this.user_lat_lon;
    }

    public String getUser_login_id() {
        return this.user_login_id;
    }

    public String getValidate_mode() {
        return this.validate_mode;
    }

    public void setAge(int i) {
        this.age = i;
    }

    public void setBus_number(String str) {
        this.bus_number = str;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setGender(String str) {
        this.gender = str;
    }

    public void setMobile_number(float f) {
        this.mobile_number = f;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPass_type(String str) {
        this.pass_type = str;
    }

    public void setUser_lat_lon(ArrayList<Float> arrayList) {
        this.user_lat_lon = arrayList;
    }

    public void setUser_login_id(String str) {
        this.user_login_id = str;
    }

    public void setValidate_mode(String str) {
        this.validate_mode = str;
    }

    public String toString() {
        return "ValidatePassRequest{user_login_id='" + this.user_login_id + '\'' + ", name='" + this.name + '\'' + ", age=" + this.age + ", gender='" + this.gender + '\'' + ", mobile_number=" + this.mobile_number + ", email='" + this.email + '\'' + ", pass_type='" + this.pass_type + '\'' + ", user_lat_lon=" + this.user_lat_lon + ", bus_number='" + this.bus_number + '\'' + ", validate_mode='" + this.validate_mode + '\'' + '}';
    }
}
