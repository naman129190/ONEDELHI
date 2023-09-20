package com.delhitransport.onedelhi.live;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import java.io.Serializable;

public class LiveItem implements Serializable {
    @nu3("ac")
    @qy0

    /* renamed from: ac */
    public String f7042ac;
    @nu3("agency")
    @qy0
    public String agency;
    @nu3("id")
    @qy0

    /* renamed from: id */
    public String f7043id;
    @nu3("lat")
    @qy0
    public String lat;
    @nu3("location")
    @qy0
    public LocationLiveItem location;
    @nu3("lng")
    @qy0
    public String lon;
    @nu3("orientation")
    @qy0
    public float orientation;
    @nu3("route")
    @qy0
    public String route;
    @nu3("timestamp")
    @qy0
    public Long timestamp;

    public LiveItem(String str, String str2, String str3, String str4, String str5, String str6, Long l, LocationLiveItem locationLiveItem, float f) {
        this.f7042ac = str;
        this.agency = str2;
        this.f7043id = str3;
        this.lat = str4;
        this.lon = str5;
        this.route = str6;
        this.timestamp = l;
        this.location = locationLiveItem;
        this.orientation = f;
    }

    public String getAc() {
        return this.f7042ac;
    }

    public String getAgency() {
        return this.agency;
    }

    public String getId() {
        return this.f7043id;
    }

    public String getLat() {
        return this.lat;
    }

    public LocationLiveItem getLocation() {
        return this.location;
    }

    public String getLon() {
        return this.lon;
    }

    public float getOrientation() {
        return this.orientation;
    }

    public String getRoute() {
        return this.route;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public String toString() {
        return "LiveItem{ac='" + this.f7042ac + '\'' + ", agency='" + this.agency + '\'' + ", id='" + this.f7043id + '\'' + ", lat='" + this.lat + '\'' + ", lon='" + this.lon + '\'' + ", route='" + this.route + '\'' + ", timestamp=" + this.timestamp + ", location=" + this.location + ", orientation=" + this.orientation + '}';
    }
}
