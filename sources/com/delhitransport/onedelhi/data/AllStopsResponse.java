package com.delhitransport.onedelhi.data;

import com.onedelhi.secure.mr2;
import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import java.util.ArrayList;

public class AllStopsResponse {
    @nu3("stops")
    @qy0
    private ArrayList<AllStops> all_stops;

    public AllStopsResponse() {
    }

    public AllStopsResponse(ArrayList<AllStops> arrayList) {
        this.all_stops = arrayList;
    }

    public ArrayList<AllStops> getAll_stops() {
        return this.all_stops;
    }

    public void setAll_stops(ArrayList<AllStops> arrayList) {
        this.all_stops = arrayList;
    }

    @mr2
    public String toString() {
        return "All stops: " + this.all_stops.toString();
    }
}
