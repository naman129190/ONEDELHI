package com.delhitransport.onedelhi.models.auth;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import java.io.Serializable;

public class VerifyResponse implements Serializable {
    @nu3("data")
    @qy0
    private String data;
    @nu3("description")
    @qy0
    private String description;
    @nu3("error")
    @qy0
    private String error;
    @nu3("signature")
    @qy0
    private String long_signature;
    @nu3("message")
    @qy0
    private String message;

    public VerifyResponse() {
    }

    public VerifyResponse(String str, String str2, String str3) {
        this.message = str;
        this.description = str2;
        this.error = str3;
    }

    public VerifyResponse(String str, String str2, String str3, String str4) {
        this.long_signature = str3;
        this.description = str2;
        this.data = str;
        this.message = str4;
    }

    public String getData() {
        return this.data;
    }

    public String getDescription() {
        return this.description;
    }

    public String getError() {
        return this.error;
    }

    public String getLong_signature() {
        return this.long_signature;
    }

    public String getMessage() {
        return this.message;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setError(String str) {
        this.error = str;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public String toString() {
        return "VerifyResponse{message='" + this.message + '\'' + ", description='" + this.description + '\'' + ", error='" + this.error + '\'' + ", long_signature='" + this.long_signature + '\'' + ", data='" + this.data + '\'' + '}';
    }
}
