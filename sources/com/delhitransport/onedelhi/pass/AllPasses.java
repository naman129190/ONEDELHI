package com.delhitransport.onedelhi.pass;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;
import java.util.List;

public class AllPasses {
    @nu3("message")
    @qy0
    private String message;
    @nu3("passes")
    @qy0
    private List<DailyPass> passes;

    public AllPasses() {
    }

    public AllPasses(String str, List<DailyPass> list) {
        this.message = str;
        this.passes = list;
    }

    public String getMessage() {
        return this.message;
    }

    public List<DailyPass> getPasses() {
        return this.passes;
    }

    public String toString() {
        return "AllPasses{message='" + this.message + '\'' + ", passes=" + this.passes + '}';
    }
}
