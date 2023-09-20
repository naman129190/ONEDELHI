package com.delhitransport.onedelhi.p002ev;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import java.util.ArrayList;

/* renamed from: com.delhitransport.onedelhi.ev.EVConnector */
public class EVConnector {
    @nu3("connector_name")
    @qy0
    private final String connector_name;
    @nu3("filter")
    @qy0
    private final ArrayList<String> filter;
    @nu3("power_type")
    @qy0
    private final String power_type;
    @nu3("url")
    @qy0
    private final String url;
    @nu3("vehicle_type")
    @qy0
    private final ArrayList<String> vehicle_type;

    public EVConnector(String str, ArrayList<String> arrayList, String str2, String str3, ArrayList<String> arrayList2) {
        this.connector_name = str;
        this.filter = arrayList;
        this.power_type = str2;
        this.url = str3;
        this.vehicle_type = arrayList2;
    }

    public String getConnector_name() {
        return this.connector_name;
    }

    public ArrayList<String> getFilter() {
        return this.filter;
    }

    public String getPower_type() {
        return this.power_type;
    }

    public String getUrl() {
        return this.url;
    }

    public ArrayList<String> getVehicle_type() {
        return this.vehicle_type;
    }
}
