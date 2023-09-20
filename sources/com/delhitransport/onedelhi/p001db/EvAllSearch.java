package com.delhitransport.onedelhi.p001db;

import com.onedelhi.secure.mr2;
import com.onedelhi.secure.nu3;
import com.onedelhi.secure.r10;
import com.onedelhi.secure.vu0;
import com.onedelhi.secure.w43;
import java.io.Serializable;

@vu0(tableName = "EvAllSearch")
/* renamed from: com.delhitransport.onedelhi.db.EvAllSearch */
public class EvAllSearch implements Serializable {
    @nu3("address")
    @r10(name = "address")
    private String address;
    @nu3("id")
    @mr2
    @w43
    @r10(name = "id")

    /* renamed from: id */
    private String f7035id;
    @nu3("name")
    @r10(name = "name")
    private String name;

    public String getAddress() {
        return this.address;
    }

    public String getId() {
        return this.f7035id;
    }

    public String getName() {
        return this.name;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setId(String str) {
        this.f7035id = str;
    }

    public void setName(String str) {
        this.name = str;
    }
}
