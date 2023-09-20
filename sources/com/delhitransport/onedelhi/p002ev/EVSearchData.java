package com.delhitransport.onedelhi.p002ev;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import java.io.Serializable;

/* renamed from: com.delhitransport.onedelhi.ev.EVSearchData */
public class EVSearchData implements Serializable {
    @nu3("address")
    @qy0
    private String address;
    @nu3("id")
    @qy0

    /* renamed from: id */
    private String f7039id;
    @nu3("name")
    @qy0
    private String name;

    public EVSearchData() {
    }

    public EVSearchData(String str, String str2, String str3) {
        this.f7039id = str;
        this.name = str2;
        this.address = str3;
    }

    public String getAddress() {
        return this.address;
    }

    public String getId() {
        return this.f7039id;
    }

    public String getName() {
        return this.name;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setId(String str) {
        this.f7039id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String toString() {
        return "EVSearchData{id='" + this.f7039id + '\'' + ", name='" + this.name + '\'' + ", address='" + this.address + '\'' + '}';
    }
}
