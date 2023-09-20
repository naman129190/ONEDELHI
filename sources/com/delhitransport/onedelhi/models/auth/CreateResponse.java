package com.delhitransport.onedelhi.models.auth;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import java.io.Serializable;

public class CreateResponse implements Serializable {
    @nu3("description")
    @qy0
    private String description;
    @nu3("expires_after")
    @qy0
    private int expires_after;
    @nu3("message")
    @qy0
    private String message;

    public String getDescription() {
        return this.description;
    }

    public int getExpires_after() {
        return this.expires_after;
    }

    public String getMessage() {
        return this.message;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setExpires_after(int i) {
        this.expires_after = i;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public String toString() {
        return "CreateResponse{message='" + this.message + '\'' + ", description='" + this.description + '\'' + ", expires_after=" + this.expires_after + '}';
    }
}
