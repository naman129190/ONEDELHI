package com.onedelhi.secure;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.onedelhi.secure.C1767b9;

public final class ng6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Bundle f17426a;

    /* renamed from: a */
    public final /* synthetic */ ri6 f17427a;

    public ng6(ri6 ri6, Bundle bundle) {
        this.f17427a = ri6;
        this.f17426a = bundle;
    }

    public final void run() {
        ri6 ri6 = this.f17427a;
        Bundle bundle = this.f17426a;
        ri6.mo15139h();
        ri6.mo15845i();
        Preconditions.checkNotNull(bundle);
        String checkNotEmpty = Preconditions.checkNotEmpty(bundle.getString("name"));
        if (!ri6.f11205a.mo27884o()) {
            ri6.f11205a.mo15136e().mo12730v().mo25379a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        wq6 wq6 = new wq6(checkNotEmpty, 0, (Object) null, "");
        try {
            fc5 fc5 = r4;
            fc5 fc52 = new fc5(bundle.getString("app_id"), "", wq6, bundle.getLong(C1767b9.C1768a.f9764m), bundle.getBoolean(C1767b9.C1768a.f9765n), bundle.getString(C1767b9.C1768a.f9755d), (xj5) null, bundle.getLong(C1767b9.C1768a.f9756e), (xj5) null, bundle.getLong(C1767b9.C1768a.f9761j), ri6.f11205a.mo27871N().mo16899y0(bundle.getString("app_id"), bundle.getString(C1767b9.C1768a.f9762k), bundle.getBundle(C1767b9.C1768a.f9763l), "", bundle.getLong(C1767b9.C1768a.f9764m), true, true));
            ri6.f11205a.mo27869L().mo22014s(fc5);
        } catch (IllegalArgumentException unused) {
        }
    }
}
