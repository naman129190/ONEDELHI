package com.onedelhi.secure;

import android.content.res.Configuration;

public final class cm2 {

    /* renamed from: a */
    public final Configuration f10395a;

    /* renamed from: a */
    public final boolean f10396a;

    public cm2(boolean z) {
        this.f10396a = z;
        this.f10395a = null;
    }

    @sj3(26)
    public cm2(boolean z, @mr2 Configuration configuration) {
        this.f10396a = z;
        this.f10395a = configuration;
    }

    @mr2
    @sj3(26)
    /* renamed from: a */
    public Configuration mo14255a() {
        Configuration configuration = this.f10395a;
        if (configuration != null) {
            return configuration;
        }
        throw new IllegalStateException("MultiWindowModeChangedInfo must be constructed with the constructor that takes a Configuration to call getNewConfig(). Are you running on an API 26 or higher device that makes this information available?");
    }

    /* renamed from: b */
    public boolean mo14256b() {
        return this.f10396a;
    }
}
