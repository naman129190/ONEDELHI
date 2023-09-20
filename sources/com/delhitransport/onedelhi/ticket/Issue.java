package com.delhitransport.onedelhi.ticket;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;

public class Issue {
    @nu3("display_message")
    @qy0
    public String display_message;
    @nu3("message")
    @qy0
    public String message;

    public Issue(String str, String str2) {
        this.message = str;
        this.display_message = str2;
    }

    public String getDisplay_message() {
        return this.display_message;
    }

    public String getMessage() {
        return this.message;
    }
}
