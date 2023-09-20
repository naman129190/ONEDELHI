package com.delhitransport.onedelhi.models.auth;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import java.io.Serializable;

public class VerifyRequest implements Serializable {
    @nu3("otp")
    @qy0
    private final String otp;

    public VerifyRequest(String str) {
        this.otp = str;
    }

    public String getOtp() {
        return this.otp;
    }

    public String toString() {
        return "VerifyRequest{otp='" + this.otp + '\'' + '}';
    }
}
