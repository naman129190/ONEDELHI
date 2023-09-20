package com.delhitransport.onedelhi.live;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;

public class LiveRequest {
    @nu3("lat")
    @qy0
    public double lat;
    @nu3("lon")
    @qy0
    public double lon;

    public LiveRequest(double d, double d2) {
        this.lat = d;
        this.lon = d2;
    }

    public double getLat() {
        return this.lat;
    }

    public double getLon() {
        return this.lon;
    }

    public void setLat(double d) {
        this.lat = d;
    }

    public void setLon(double d) {
        this.lon = d;
    }

    public String toString() {
        return "LiveRequest{lat=" + this.lat + ", lon=" + this.lon + '}';
    }
}
