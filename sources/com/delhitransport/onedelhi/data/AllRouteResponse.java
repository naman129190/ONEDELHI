package com.delhitransport.onedelhi.data;

import com.onedelhi.secure.mr2;
import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import java.util.ArrayList;

public class AllRouteResponse {
    @nu3("routes")
    @qy0
    private ArrayList<AllRoutes> all_routes;

    public AllRouteResponse() {
    }

    public AllRouteResponse(ArrayList<AllRoutes> arrayList) {
        this.all_routes = arrayList;
    }

    public ArrayList<AllRoutes> getAll_routes() {
        return this.all_routes;
    }

    public void setAll_routes(ArrayList<AllRoutes> arrayList) {
        this.all_routes = arrayList;
    }

    @mr2
    public String toString() {
        return "All routes: " + this.all_routes.toString();
    }
}
