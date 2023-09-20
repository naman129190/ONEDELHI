package com.delhitransport.onedelhi.models.directions;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import java.io.Serializable;
import java.util.ArrayList;

public class AllStopsResponse implements Serializable {
    @nu3("stops")
    @qy0
    private ArrayList<AllStops> all_stops;
    @nu3("description")
    @qy0
    private String description;
    @nu3("message")
    @qy0
    private String message;

    public AllStopsResponse() {
    }

    public AllStopsResponse(String str, String str2, ArrayList<AllStops> arrayList) {
        this.message = str;
        this.description = str2;
        this.all_stops = arrayList;
    }

    public ArrayList<AllStops> getAll_stops() {
        return this.all_stops;
    }

    public String getDescription() {
        return this.description;
    }

    public String getMessage() {
        return this.message;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public String toString() {
        return "AllStopsResponse{message='" + this.message + '\'' + ", description='" + this.description + '\'' + ", all_stops=" + this.all_stops + '}';
    }
}
