package com.delhitransport.onedelhi.data;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;

public class RouteDetailRequest {
    @nu3("device_id")
    @qy0
    public String device_id;
    @nu3("route")
    @qy0
    public String route;
    @nu3("session_id")
    @qy0
    public String session_id;

    public RouteDetailRequest(String str, String str2, String str3) {
        this.device_id = str;
        this.route = str2;
        this.session_id = str3;
    }

    public String getDevice_id() {
        return this.device_id;
    }

    public String getRoute() {
        return this.route;
    }

    public String getSession_id() {
        return this.session_id;
    }

    public String toString() {
        return "RouteDetailRequest{device_id='" + this.device_id + '\'' + ", route='" + this.route + '\'' + ", session_id='" + this.session_id + '\'' + '}';
    }
}
