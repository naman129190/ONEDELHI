package com.onedelhi.secure;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

public final class bn6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AppMeasurementDynamiteService f9908a;

    /* renamed from: a */
    public final /* synthetic */ pt5 f9909a;

    /* renamed from: b */
    public final /* synthetic */ String f9910b;

    /* renamed from: b */
    public final /* synthetic */ boolean f9911b;

    /* renamed from: c */
    public final /* synthetic */ String f9912c;

    public bn6(AppMeasurementDynamiteService appMeasurementDynamiteService, pt5 pt5, String str, String str2, boolean z) {
        this.f9908a = appMeasurementDynamiteService;
        this.f9909a = pt5;
        this.f9910b = str;
        this.f9912c = str2;
        this.f9911b = z;
    }

    public final void run() {
        this.f9908a.f7589a.mo27869L().mo22008W(this.f9909a, this.f9910b, this.f9912c, this.f9911b);
    }
}
