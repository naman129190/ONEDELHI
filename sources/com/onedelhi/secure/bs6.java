package com.onedelhi.secure;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

public final class bs6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AppMeasurementDynamiteService f9958a;

    /* renamed from: a */
    public final /* synthetic */ pt5 f9959a;

    /* renamed from: b */
    public final /* synthetic */ String f9960b;

    /* renamed from: c */
    public final /* synthetic */ String f9961c;

    public bs6(AppMeasurementDynamiteService appMeasurementDynamiteService, pt5 pt5, String str, String str2) {
        this.f9958a = appMeasurementDynamiteService;
        this.f9959a = pt5;
        this.f9960b = str;
        this.f9961c = str2;
    }

    public final void run() {
        this.f9958a.f7589a.mo27869L().mo22005T(this.f9959a, this.f9960b, this.f9961c);
    }
}
