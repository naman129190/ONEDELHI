package com.delhitransport.onedelhi.pass;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import java.util.ArrayList;

public class LastPassRequest {
    @nu3("user_lat_lon")
    @qy0
    private ArrayList<Float> user_lat_lon;
    @nu3("user_login_id")
    @qy0
    private String user_login_id;

    public LastPassRequest(String str, ArrayList<Float> arrayList) {
        this.user_login_id = str;
        this.user_lat_lon = arrayList;
    }

    public ArrayList<Float> getUser_lat_lon() {
        return this.user_lat_lon;
    }

    public String getUser_login_id() {
        return this.user_login_id;
    }

    public String toString() {
        return "LastPassRequest{user_login_id='" + this.user_login_id + '\'' + ", user_lat_lon=" + this.user_lat_lon + '}';
    }
}
