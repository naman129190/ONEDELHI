package com.delhitransport.onedelhi.p002ev;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: com.delhitransport.onedelhi.ev.EVdata */
public class EVdata implements Serializable {
    @nu3("address")
    @qy0
    private String address;
    @nu3("available")
    @qy0
    private String available;
    @nu3("city")
    @qy0
    private String city;
    @nu3("close")
    @qy0
    private String close;
    @nu3("contact_numbers")
    @qy0
    private ArrayList<String> contact_numbers;
    @nu3("coordinates")
    @qy0
    private EVStationCoordinates coordinates;
    @nu3("cost_per_unit")
    @qy0
    private String cost_per_unit;
    @nu3("country")
    @qy0
    private String country;
    @nu3("email")
    @qy0
    private String email;
    @nu3("charger_type")
    @qy0
    private ArrayList<EVCharger> evChargers;
    @nu3("id")
    @qy0

    /* renamed from: id */
    private String f7040id;
    @nu3("logo")
    @qy0
    private String logo;
    @nu3("name")
    @qy0
    private String name;
    @nu3("open")
    @qy0
    private String open;
    @nu3("payment_modes")
    @qy0
    private String payment_modes;
    @nu3("postal_code")
    @qy0
    private String postal_code;
    @nu3("staff")
    @qy0
    private String staff;
    @nu3("station_type")
    @qy0
    private String station_type;
    @nu3("total")
    @qy0
    private String total;
    @nu3("vendor")
    @qy0
    private String vendor;

    public EVdata() {
    }

    public EVdata(String str, String str2, String str3, String str4, String str5, String str6, EVStationCoordinates eVStationCoordinates, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, ArrayList<String> arrayList, String str17) {
        this.f7040id = str;
        this.name = str2;
        this.address = str3;
        this.city = str4;
        this.postal_code = str5;
        this.country = str6;
        this.coordinates = eVStationCoordinates;
        this.vendor = str7;
        this.total = str8;
        this.available = str9;
        this.open = str10;
        this.close = str11;
        this.logo = str12;
        this.staff = str13;
        this.cost_per_unit = str14;
        this.payment_modes = str15;
        this.email = str16;
        this.contact_numbers = arrayList;
        this.station_type = str17;
    }

    public EVdata(String str, String str2, String str3, String str4, String str5, String str6, EVStationCoordinates eVStationCoordinates, String str7, String str8, String str9, String str10, String str11, String str12, String str13, ArrayList<EVCharger> arrayList, String str14, String str15, String str16, ArrayList<String> arrayList2, String str17) {
        this.f7040id = str;
        this.name = str2;
        this.address = str3;
        this.city = str4;
        this.postal_code = str5;
        this.country = str6;
        this.coordinates = eVStationCoordinates;
        this.vendor = str7;
        this.total = str8;
        this.available = str9;
        this.open = str10;
        this.close = str11;
        this.logo = str12;
        this.staff = str13;
        this.evChargers = arrayList;
        this.cost_per_unit = str14;
        this.payment_modes = str15;
        this.email = str16;
        this.contact_numbers = this.contact_numbers;
        this.station_type = str17;
    }

    public String getAddress() {
        return this.address;
    }

    public String getAvailable() {
        return this.available;
    }

    public String getCity() {
        return this.city;
    }

    public String getClose() {
        return this.close;
    }

    public ArrayList<String> getContact_numbers() {
        return this.contact_numbers;
    }

    public EVStationCoordinates getCoordinates() {
        return this.coordinates;
    }

    public String getCost_per_unit() {
        return this.cost_per_unit;
    }

    public String getCountry() {
        return this.country;
    }

    public String getEmail() {
        return this.email;
    }

    public ArrayList<EVCharger> getEvChargers() {
        return this.evChargers;
    }

    public String getId() {
        return this.f7040id;
    }

    public String getLogo() {
        return this.logo;
    }

    public String getName() {
        return this.name;
    }

    public String getOpen() {
        return this.open;
    }

    public String getPayment_modes() {
        return this.payment_modes;
    }

    public String getPostal_code() {
        return this.postal_code;
    }

    public String getStaff() {
        return this.staff;
    }

    public String getStation_type() {
        return this.station_type;
    }

    public String getTotal() {
        return this.total;
    }

    public String getVendor() {
        return this.vendor;
    }

    public void setStation_type(String str) {
        this.station_type = str;
    }

    public String toString() {
        return "EVdata{id='" + this.f7040id + '\'' + ", name='" + this.name + '\'' + ", address='" + this.address + '\'' + ", city='" + this.city + '\'' + ", postal_code='" + this.postal_code + '\'' + ", country='" + this.country + '\'' + ", coordinates=" + this.coordinates + ", vendor='" + this.vendor + '\'' + ", total=" + this.total + ", available=" + this.available + ", open='" + this.open + '\'' + ", close='" + this.close + '\'' + ", logo='" + this.logo + '\'' + ", staff='" + this.staff + '\'' + ", evChargers=" + this.evChargers + ", cost_per_unit=" + this.cost_per_unit + ", payment_modes='" + this.payment_modes + '\'' + ", email='" + this.email + '\'' + ", contact_numbers=" + this.contact_numbers + '}';
    }
}
