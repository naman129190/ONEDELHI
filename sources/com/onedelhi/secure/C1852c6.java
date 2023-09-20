package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.app.Application;

/* renamed from: com.onedelhi.secure.c6 */
public class C1852c6 extends au4 {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a */
    public Application f10154a;

    public C1852c6(@mr2 Application application) {
        this.f10154a = application;
    }

    @mr2
    /* renamed from: b */
    public <T extends Application> T mo14018b() {
        return this.f10154a;
    }
}
