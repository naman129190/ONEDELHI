package com.delhitransport.onedelhi.ticket;

import com.delhitransport.onedelhi.models.track.LogItem;
import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import java.util.ArrayList;

public class SendLog {
    @nu3("device_id")
    @qy0
    private String device_id;
    @nu3("logs")
    @qy0
    private ArrayList<LogItem> logs;

    public SendLog() {
    }

    public SendLog(String str, ArrayList<LogItem> arrayList) {
        this.device_id = str;
        this.logs = arrayList;
    }

    public void setDevice_id(String str) {
        this.device_id = str;
    }

    public void setLogs(ArrayList<LogItem> arrayList) {
        this.logs = arrayList;
    }

    public String toString() {
        return "SendLog{device_id='" + this.device_id + '\'' + '}';
    }
}
