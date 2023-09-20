package com.delhitransport.onedelhi.models.directions;

import com.onedelhi.secure.mr2;
import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import java.io.Serializable;
import java.util.List;

public class Routes implements Serializable {
    @nu3("routes")
    @qy0
    private List<TripRoute> route;

    public Routes() {
    }

    public Routes(List<TripRoute> list) {
        this.route = list;
    }

    public List<TripRoute> getRoute() {
        return this.route;
    }

    public void setRoute(List<TripRoute> list) {
        this.route = list;
    }

    @mr2
    public String toString() {
        return "\nroute: " + this.route.toString();
    }
}
