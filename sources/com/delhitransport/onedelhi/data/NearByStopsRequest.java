package com.delhitransport.onedelhi.data;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;

public class NearByStopsRequest {
    @nu3("device_id")
    @qy0
    public String device_id;
    @nu3("session_id")
    @qy0
    public String session_id;
    @nu3("user_lat")
    @qy0
    public Double user_lat;
    @nu3("user_lon")
    @qy0
    public Double user_lon;

    public NearByStopsRequest(String str, Double d, Double d2, String str2) {
        this.device_id = str;
        this.user_lat = d;
        this.user_lon = d2;
        this.session_id = str2;
    }

    public String getDevice_id() {
        return this.device_id;
    }

    public String getSession_id() {
        return this.session_id;
    }

    public Double getUser_lat() {
        return this.user_lat;
    }

    public Double getUser_lon() {
        return this.user_lon;
    }

    public String toString() {
        return "NearByStopsRequest{device_id='" + this.device_id + '\'' + ", user_lat=" + this.user_lat + ", user_lon=" + this.user_lon + ", session_id='" + this.session_id + '\'' + '}';
    }
}
