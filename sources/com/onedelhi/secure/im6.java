package com.onedelhi.secure;

import android.content.ComponentName;
import android.content.Context;

public final class im6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ mm6 f13756a;

    public im6(mm6 mm6) {
        this.f13756a = mm6;
    }

    public final void run() {
        om6 om6 = this.f13756a.f16257a;
        Context f = om6.f11205a.mo15137f();
        this.f13756a.f16257a.f11205a.mo15134c();
        om6.m23882M(om6, new ComponentName(f, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
