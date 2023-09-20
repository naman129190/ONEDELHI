package com.onedelhi.secure;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

public final class ik6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AppMeasurementDynamiteService f13728a;

    /* renamed from: a */
    public final /* synthetic */ pt5 f13729a;

    /* renamed from: a */
    public final /* synthetic */ xj5 f13730a;

    /* renamed from: b */
    public final /* synthetic */ String f13731b;

    public ik6(AppMeasurementDynamiteService appMeasurementDynamiteService, pt5 pt5, xj5 xj5, String str) {
        this.f13728a = appMeasurementDynamiteService;
        this.f13729a = pt5;
        this.f13730a = xj5;
        this.f13731b = str;
    }

    public final void run() {
        this.f13728a.f7589a.mo27869L().mo22011p(this.f13729a, this.f13730a, this.f13731b);
    }
}
