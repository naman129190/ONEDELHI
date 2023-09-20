package com.delhitransport.onedelhi.p002ev;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import java.io.Serializable;

/* renamed from: com.delhitransport.onedelhi.ev.EVStationCoordinates */
public class EVStationCoordinates implements Serializable {
    @nu3("latitude")
    @qy0
    private double latitude;
    @nu3("longitude")
    @qy0
    private double longitude;

    public EVStationCoordinates(double d, double d2) {
        this.latitude = d;
        this.longitude = d2;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public void setLatitude(double d) {
        this.latitude = d;
    }

    public void setLongitude(double d) {
        this.longitude = d;
    }

    public String toString() {
        return "EVStationCoordinates{latitude=" + this.latitude + ", longitude=" + this.longitude + '}';
    }
}
