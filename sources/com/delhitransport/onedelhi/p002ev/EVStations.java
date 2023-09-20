package com.delhitransport.onedelhi.p002ev;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: com.delhitransport.onedelhi.ev.EVStations */
public class EVStations implements Serializable {
    @nu3("data")
    @qy0
    private ArrayList<EVdata> data;
    @nu3("search_hint")
    @qy0
    private String search_hint;
    @nu3("status")
    @qy0
    private int status_code;
    @nu3("status_message")
    @qy0
    private String status_message;
    @nu3("timestamp")
    @qy0
    private String timestamp;

    public EVStations() {
    }

    public EVStations(int i, String str, String str2, String str3, ArrayList<EVdata> arrayList) {
        this.status_code = i;
        this.status_message = str;
        this.timestamp = str2;
        this.search_hint = str3;
        this.data = arrayList;
    }

    public ArrayList<EVdata> getData() {
        return this.data;
    }

    public String getSearch_hint() {
        return this.search_hint;
    }

    public int getStatus_code() {
        return this.status_code;
    }

    public String getStatus_message() {
        return this.status_message;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public void setData(ArrayList<EVdata> arrayList) {
        this.data = arrayList;
    }

    public void setSearch_hint(String str) {
        this.search_hint = str;
    }

    public void setStatus_code(int i) {
        this.status_code = i;
    }

    public void setStatus_message(String str) {
        this.status_message = str;
    }

    public void setTimestamp(String str) {
        this.timestamp = str;
    }

    public String toString() {
        return "EVStations{status_code=" + this.status_code + ", status_message='" + this.status_message + '\'' + ", timestamp='" + this.timestamp + '\'' + ", data=" + this.data + '}';
    }
}
