package com.delhitransport.onedelhi.live;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;

public class BusMetaData {
    @nu3("agency")
    @qy0
    private String agency;
    @nu3("bus_number")
    @qy0
    private String bus_number;
    @nu3("depot")
    @qy0
    private String depot;
    @nu3("description")
    @qy0
    private String description;
    @nu3("is_ac")
    @qy0
    private Boolean is_ac;
    @nu3("status")
    @qy0
    private String status;

    public BusMetaData() {
    }

    public BusMetaData(String str, String str2, String str3, String str4, String str5, Boolean bool) {
        this.status = str;
        this.description = str2;
        this.agency = str3;
        this.bus_number = str4;
        this.depot = str5;
        this.is_ac = bool;
    }

    public String getAgency() {
        return this.agency;
    }

    public String getBus_number() {
        return this.bus_number;
    }

    public String getDepot() {
        return this.depot;
    }

    public String getDescription() {
        return this.description;
    }

    public String getStatus() {
        return this.status;
    }

    public boolean isIs_ac() {
        return this.is_ac.booleanValue();
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public String toString() {
        return "BusMetaData{status='" + this.status + '\'' + ", description='" + this.description + '\'' + ", agency='" + this.agency + '\'' + ", bus_number='" + this.bus_number + '\'' + ", depot='" + this.depot + '\'' + ", is_ac=" + this.is_ac + '}';
    }
}
