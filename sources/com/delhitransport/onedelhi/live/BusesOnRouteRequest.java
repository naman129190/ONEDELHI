package com.delhitransport.onedelhi.live;

import com.onedelhi.secure.mr2;
import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;

public class BusesOnRouteRequest {
    @nu3("route_long_name")
    @qy0
    public String route_long_name;

    public BusesOnRouteRequest(String str) {
        this.route_long_name = str;
    }

    public String getRoute_long_name() {
        return this.route_long_name;
    }

    public void setRoute_long_name(String str) {
        this.route_long_name = str;
    }

    @mr2
    public String toString() {
        return "NearByStopsRequest{route_long_name=" + this.route_long_name + '}';
    }
}
