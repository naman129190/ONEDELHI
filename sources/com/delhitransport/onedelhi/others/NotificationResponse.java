package com.delhitransport.onedelhi.others;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import java.util.ArrayList;

public class NotificationResponse {
    @nu3("notifications")
    @qy0
    private ArrayList<Notifications> data;
    @nu3("description")
    @qy0
    private String description;
    @nu3("message")
    @qy0
    private String message;

    public NotificationResponse() {
    }

    public NotificationResponse(String str, String str2, ArrayList<Notifications> arrayList) {
        this.description = str;
        this.message = str2;
        this.data = arrayList;
    }

    public ArrayList<Notifications> getData() {
        return this.data;
    }

    public String getDescription() {
        return this.description;
    }

    public String getMessage() {
        return this.message;
    }
}
