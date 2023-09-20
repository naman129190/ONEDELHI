package com.delhitransport.onedelhi.models;

import com.delhitransport.onedelhi.live.LiveItem;
import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import java.io.Serializable;

public class LiveBusData implements Serializable {
    @nu3("description")
    @qy0
    private final String description;
    @nu3("data")
    @qy0
    private final LiveItem liveItem;
    @nu3("msg")
    @qy0
    private final String msg;

    public LiveBusData(String str, String str2, LiveItem liveItem2) {
        this.msg = str;
        this.description = str2;
        this.liveItem = liveItem2;
    }

    public String getDescription() {
        return this.description;
    }

    public LiveItem getLiveItem() {
        return this.liveItem;
    }

    public String getMsg() {
        return this.msg;
    }

    public String toString() {
        return "LiveStatus{msg='" + this.msg + '\'' + ", description='" + this.description + '\'' + '}';
    }
}
