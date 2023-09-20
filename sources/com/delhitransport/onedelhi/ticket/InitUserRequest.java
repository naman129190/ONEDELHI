package com.delhitransport.onedelhi.ticket;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;

public class InitUserRequest {
    @nu3("user_age")
    @qy0
    private final int age;
    @nu3("api")
    @qy0
    private final String api;
    @nu3("app_version")
    @qy0
    private final String app_version;
    @nu3("phone_number")
    @qy0
    private final String contact_number;
    @nu3("device_id_hash")
    @qy0
    private final String device_id_hash;
    @nu3("user_email")
    @qy0
    private final String email;
    @nu3("imei_number_hash")
    @qy0
    private final String imei_number_hash;
    @nu3("login_type")
    @qy0
    private final String login_type;
    @nu3("manufacturer")
    @qy0
    private final String manufacturer;
    @nu3("model")
    @qy0
    private final String model;
    @nu3("user_name")
    @qy0
    private final String name;
    @nu3("os_version")
    @qy0
    private final String os_version;
    @nu3("product")
    @qy0
    private final String product;
    @nu3("version_code")
    @qy0
    private final String version_code;

    public InitUserRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i) {
        this.os_version = str;
        this.api = str2;
        this.manufacturer = str3;
        this.model = str4;
        this.product = str5;
        this.imei_number_hash = str6;
        this.app_version = str7;
        this.version_code = str8;
        this.device_id_hash = str9;
        this.login_type = str10;
        this.email = str11;
        this.name = str12;
        this.contact_number = str13;
        this.age = i;
    }

    public int getAge() {
        return this.age;
    }

    public String getApi() {
        return this.api;
    }

    public String getApp_version() {
        return this.app_version;
    }

    public String getContact_number() {
        return this.contact_number;
    }

    public String getDevice_id_hash() {
        return this.device_id_hash;
    }

    public String getEmail() {
        return this.email;
    }

    public String getImei_number_hash() {
        return this.imei_number_hash;
    }

    public String getLogin_type() {
        return this.login_type;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public String getModel() {
        return this.model;
    }

    public String getName() {
        return this.name;
    }

    public String getOs_version() {
        return this.os_version;
    }

    public String getProduct() {
        return this.product;
    }

    public String getVersion_code() {
        return this.version_code;
    }

    public String toString() {
        return "InitUserRequest{os_version='" + this.os_version + '\'' + ", api='" + this.api + '\'' + ", manufacturer='" + this.manufacturer + '\'' + ", model='" + this.model + '\'' + ", product='" + this.product + '\'' + ", imei_number_hash='" + this.imei_number_hash + '\'' + ", app_version='" + this.app_version + '\'' + ", version_code='" + this.version_code + '\'' + ", device_id_hash='" + this.device_id_hash + '\'' + ", login_type='" + this.login_type + '\'' + ", email='" + this.email + '\'' + ", name='" + this.name + '\'' + ", contact_number='" + this.contact_number + '\'' + ", age=" + this.age + '}';
    }
}
