package com.delhitransport.onedelhi.pass;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;

public class LastPass {
    @nu3("pass")
    @qy0
    private DailyPass dailyPass;
    @nu3("message")
    @qy0
    private String message;

    public LastPass(String str, DailyPass dailyPass2) {
        this.message = str;
        this.dailyPass = dailyPass2;
    }

    public DailyPass getDailyPass() {
        return this.dailyPass;
    }

    public String getMessage() {
        return this.message;
    }

    public String toString() {
        return "LastPass{message='" + this.message + '\'' + ", dailyPasses=" + this.dailyPass + '}';
    }
}
