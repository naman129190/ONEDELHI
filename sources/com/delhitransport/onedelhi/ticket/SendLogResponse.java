package com.delhitransport.onedelhi.ticket;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;

public class SendLogResponse {
    @nu3("description")
    @qy0
    public String description;
    @nu3("message")
    @qy0
    public String message;

    public SendLogResponse(String str, String str2) {
        this.message = str;
        this.description = str2;
    }

    public String getDescription() {
        return this.description;
    }

    public String getMessage() {
        return this.message;
    }

    public String toString() {
        return "SendLogResponse{message='" + this.message + '\'' + ", description='" + this.description + '\'' + '}';
    }
}
