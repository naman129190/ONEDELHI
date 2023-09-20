package com.delhitransport.onedelhi.pass;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;

public class ValidBusNumber {
    @nu3("is_valid")
    @qy0
    private Boolean is_valid;
    @nu3("message")
    @qy0
    private String message;

    public ValidBusNumber(String str, Boolean bool) {
        this.message = str;
        this.is_valid = bool;
    }

    public Boolean getIs_valid() {
        return this.is_valid;
    }

    public String getMessage() {
        return this.message;
    }

    public String toString() {
        return "ValidBusNumber{message='" + this.message + '\'' + ", is_valid=" + this.is_valid + '}';
    }
}
