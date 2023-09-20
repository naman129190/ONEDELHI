package com.delhitransport.onedelhi.models.payment;

import android.graphics.drawable.Drawable;

public class UPIOptions {
    private Drawable app_logo;
    private String app_name;
    private String package_name;

    public UPIOptions() {
    }

    public UPIOptions(String str, String str2, Drawable drawable) {
        this.app_name = str;
        this.app_logo = drawable;
        this.package_name = str2;
    }

    public Drawable getApp_logo() {
        return this.app_logo;
    }

    public String getApp_name() {
        return this.app_name;
    }

    public String getPackage_name() {
        return this.package_name;
    }

    public void setApp_logo(Drawable drawable) {
        this.app_logo = drawable;
    }

    public void setApp_name(String str) {
        this.app_name = str;
    }

    public void setPackage_name(String str) {
        this.package_name = str;
    }
}
