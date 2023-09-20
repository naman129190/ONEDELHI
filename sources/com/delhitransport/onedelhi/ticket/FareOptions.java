package com.delhitransport.onedelhi.ticket;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class FareOptions implements Serializable {
    @nu3("fare_options")
    @qy0
    private ArrayList<HashMap<String, FareOptionsEntry>> fare_options;
    @nu3("message")
    @qy0
    private final String message;
    @nu3("start_stop_index")
    @qy0
    private int start_stop_idx;
    @nu3("start_stop_name")
    @qy0
    private String start_stop_name;

    public FareOptions(String str, ArrayList<HashMap<String, FareOptionsEntry>> arrayList) {
        this.message = str;
        this.fare_options = arrayList;
    }

    public ArrayList<HashMap<String, FareOptionsEntry>> getFare_options() {
        return this.fare_options;
    }

    public String getMessage() {
        return this.message;
    }

    public void setFare_options(ArrayList<HashMap<String, FareOptionsEntry>> arrayList) {
        this.fare_options = arrayList;
    }

    public String toString() {
        return "FareOptions{message='" + this.message + '\'' + ", fare_options=" + this.fare_options + '}';
    }
}
