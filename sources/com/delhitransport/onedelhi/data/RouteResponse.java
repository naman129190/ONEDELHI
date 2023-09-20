package com.delhitransport.onedelhi.data;

import com.onedelhi.secure.mr2;
import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import java.util.ArrayList;

public class RouteResponse {
    @nu3("msg")
    @qy0
    private String msg;
    @nu3("transit_route")
    @qy0
    private ArrayList<TripRoute> transit_routes;

    public RouteResponse() {
    }

    public RouteResponse(String str, ArrayList<TripRoute> arrayList) {
        this.msg = str;
        this.transit_routes = arrayList;
    }

    public String getMsg() {
        return this.msg;
    }

    public ArrayList<TripRoute> getTransit_routes() {
        return this.transit_routes;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setTransit_routes(ArrayList<TripRoute> arrayList) {
        this.transit_routes = arrayList;
    }

    @mr2
    public String toString() {
        StringBuilder sb;
        String str;
        if (this.transit_routes != null) {
            sb = new StringBuilder();
            sb.append("msg: ");
            sb.append(this.msg);
            sb.append("\n transit_route: ");
            str = this.transit_routes.toString();
        } else {
            sb = new StringBuilder();
            sb.append("msg: ");
            str = this.msg;
        }
        sb.append(str);
        return sb.toString();
    }
}
