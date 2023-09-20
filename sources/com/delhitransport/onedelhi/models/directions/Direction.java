package com.delhitransport.onedelhi.models.directions;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import java.io.Serializable;

public class Direction implements Serializable {
    @nu3("fare")
    @qy0
    private String fare;
    @nu3("reach_by")
    @qy0
    private String reach_by;
    @nu3("response_type")
    @qy0
    private String response_type;
    @nu3("directions")
    @qy0
    private Routes routes;
    @nu3("total_fare")
    @qy0
    private float total_fare;
    @nu3("trip_time")
    @qy0
    private int trip_time;

    public Direction() {
    }

    public Direction(Routes routes2) {
        this.routes = routes2;
    }

    public Direction(Routes routes2, String str, int i, float f, String str2, String str3) {
        this.routes = routes2;
        this.fare = str;
        this.trip_time = i;
        this.total_fare = f;
        this.reach_by = str2;
        this.response_type = str3;
    }

    public String getFare() {
        return this.fare;
    }

    public String getReach_by() {
        return this.reach_by;
    }

    public String getResponse_type() {
        return this.response_type;
    }

    public Routes getRoutes() {
        return this.routes;
    }

    public float getTotal_fare() {
        return this.total_fare;
    }

    public int getTrip_time() {
        return this.trip_time;
    }

    public String toString() {
        return "Direction{routes=" + this.routes + ", fare='" + this.fare + '\'' + ", trip_time=" + this.trip_time + ", total_fare=" + this.total_fare + ", reach_by='" + this.reach_by + '\'' + ", response_type='" + this.response_type + '\'' + '}';
    }
}
