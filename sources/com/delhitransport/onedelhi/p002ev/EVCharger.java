package com.delhitransport.onedelhi.p002ev;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.delhitransport.onedelhi.ev.EVCharger */
public class EVCharger implements Serializable {
    @nu3("available")
    @qy0
    private final String available;
    @nu3("cost_per_unit")
    @qy0
    private final String cost_per_unit;
    @nu3("count")
    @qy0
    private final int count;
    @nu3("diagram")
    @qy0
    private final String diagram;
    @nu3("capacity")
    @qy0
    private final String power;
    @nu3("power_type")
    @qy0
    private final String power_type;
    @nu3("total")
    @qy0
    private final String total;
    @nu3("type")
    @qy0
    private final String type;
    @nu3("vehicle_type")
    @qy0
    private final List<String> vehicle_type;

    public EVCharger(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, List<String> list) {
        this.type = str;
        this.power = str2;
        this.diagram = str3;
        this.count = i;
        this.total = str4;
        this.available = str5;
        this.cost_per_unit = str6;
        this.power_type = str7;
        this.vehicle_type = list;
    }

    public String getAvailable() {
        return this.available;
    }

    public String getCost_per_unit() {
        return this.cost_per_unit;
    }

    public int getCount() {
        return this.count;
    }

    public String getDiagram() {
        return this.diagram;
    }

    public String getPower() {
        return this.power;
    }

    public String getPower_type() {
        return this.power_type;
    }

    public String getTotal() {
        return this.total;
    }

    public String getType() {
        return this.type;
    }

    public List<String> getVehicle_type() {
        return this.vehicle_type;
    }

    public String toString() {
        return "EVCharger{type='" + this.type + '\'' + ", power='" + this.power + '\'' + ", diagram='" + this.diagram + '\'' + ", count=" + this.count + ", total='" + this.total + '\'' + ", available='" + this.available + '\'' + ", cost_per_unit='" + this.cost_per_unit + '\'' + ", power_type='" + this.power_type + '\'' + ", vehicle_type=" + this.vehicle_type + '}';
    }
}
