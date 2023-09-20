package com.delhitransport.onedelhi.data;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;

public class GenericRequest {
    @nu3("device_id")
    @qy0
    public String device_id;
    @nu3("session_id")
    @qy0
    public String session_id;

    public GenericRequest(String str, String str2) {
        this.device_id = str;
        this.session_id = str2;
    }

    public String getDevice_id() {
        return this.device_id;
    }

    public String getSession_id() {
        return this.session_id;
    }

    public String toString() {
        return "GenericRequest{device_id='" + this.device_id + '\'' + ", session_id='" + this.session_id + '\'' + '}';
    }
}
