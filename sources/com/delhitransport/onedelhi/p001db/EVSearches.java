package com.delhitransport.onedelhi.p001db;

import com.onedelhi.secure.mr2;
import com.onedelhi.secure.r10;
import com.onedelhi.secure.up1;
import com.onedelhi.secure.vu0;
import com.onedelhi.secure.w43;
import java.io.Serializable;

@vu0(indices = {@up1(unique = false, value = {"name"})})
/* renamed from: com.delhitransport.onedelhi.db.EVSearches */
public class EVSearches implements Serializable {
    @r10(name = "address")
    private String address;
    @mr2
    @r10(name = "id")
    @w43

    /* renamed from: id */
    private String f7034id;
    @r10(name = "name")
    private String name;

    public EVSearches() {
    }

    public EVSearches(String str, String str2) {
        this.f7034id = this.f7034id;
        this.name = str;
        this.address = str2;
    }

    public String getAddress() {
        return this.address;
    }

    public String getId() {
        return this.f7034id;
    }

    public String getName() {
        return this.name;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setId(String str) {
        this.f7034id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String toString() {
        return "EVSearches{id=" + this.f7034id + ", name='" + this.name + '\'' + ", address='" + this.address + '\'' + '}';
    }
}
