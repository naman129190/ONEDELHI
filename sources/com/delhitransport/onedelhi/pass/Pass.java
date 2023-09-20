package com.delhitransport.onedelhi.pass;

import com.onedelhi.secure.nu3;
import com.onedelhi.secure.qy0;

public class Pass {
    @nu3("daily_pass")
    @qy0
    private DailyPassForm dailyPassForm;
    @nu3("is_valid_bus")
    @qy0
    private Boolean is_valid_bus;

    public Pass() {
    }

    public Pass(DailyPassForm dailyPassForm2, Boolean bool) {
        this.dailyPassForm = dailyPassForm2;
        this.is_valid_bus = bool;
    }

    public DailyPassForm getDailyPassForm() {
        return this.dailyPassForm;
    }

    public Boolean getIs_valid_bus() {
        return this.is_valid_bus;
    }

    public void setIs_valid_bus(Boolean bool) {
        this.is_valid_bus = bool;
    }

    public String toString() {
        return "Pass{dailyPassForm=" + this.dailyPassForm + ", is_valid_bus=" + this.is_valid_bus + '}';
    }
}
