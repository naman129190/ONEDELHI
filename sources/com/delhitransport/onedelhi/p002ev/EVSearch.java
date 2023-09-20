package com.delhitransport.onedelhi.p002ev;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import java.util.ArrayList;

/* renamed from: com.delhitransport.onedelhi.ev.EVSearch */
public class EVSearch {
    @nu3("data")
    @qy0
    public ArrayList<EVSearchData> data;
    @nu3("status")
    @qy0
    public Integer status_code;
    @nu3("status_message")
    @qy0
    public String status_msg;

    public EVSearch(ArrayList<EVSearchData> arrayList, Integer num, String str) {
        this.data = arrayList;
        this.status_code = num;
        this.status_msg = str;
    }

    public ArrayList<EVSearchData> getData() {
        return this.data;
    }

    public Integer getStatus_code() {
        return this.status_code;
    }

    public String getStatus_msg() {
        return this.status_msg;
    }

    public void setData(ArrayList<EVSearchData> arrayList) {
        this.data = arrayList;
    }

    public void setStatus_code(Integer num) {
        this.status_code = num;
    }

    public void setStatus_msg(String str) {
        this.status_msg = str;
    }
}
