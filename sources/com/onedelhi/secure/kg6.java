package com.onedelhi.secure;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.onedelhi.secure.C1767b9;

public final class kg6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Bundle f14896a;

    /* renamed from: a */
    public final /* synthetic */ ri6 f14897a;

    public kg6(ri6 ri6, Bundle bundle) {
        this.f14897a = ri6;
        this.f14896a = bundle;
    }

    public final void run() {
        ri6 ri6 = this.f14897a;
        Bundle bundle = this.f14896a;
        ri6.mo15139h();
        ri6.mo15845i();
        Preconditions.checkNotNull(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        Preconditions.checkNotEmpty(string);
        Preconditions.checkNotEmpty(string2);
        Preconditions.checkNotNull(bundle.get("value"));
        if (!ri6.f11205a.mo27884o()) {
            ri6.f11205a.mo15136e().mo12730v().mo25379a("Conditional property not set since app measurement is disabled");
            return;
        }
        wq6 wq6 = new wq6(string, bundle.getLong(C1767b9.C1768a.f9766o), bundle.get("value"), string2);
        try {
            xj5 y0 = ri6.f11205a.mo27871N().mo16899y0(bundle.getString("app_id"), bundle.getString(C1767b9.C1768a.f9759h), bundle.getBundle(C1767b9.C1768a.f9760i), string2, 0, true, true);
            xj5 y02 = ri6.f11205a.mo27871N().mo16899y0(bundle.getString("app_id"), bundle.getString(C1767b9.C1768a.f9757f), bundle.getBundle(C1767b9.C1768a.f9758g), string2, 0, true, true);
            xj5 y03 = ri6.f11205a.mo27871N().mo16899y0(bundle.getString("app_id"), bundle.getString(C1767b9.C1768a.f9762k), bundle.getBundle(C1767b9.C1768a.f9763l), string2, 0, true, true);
            ri6.f11205a.mo27869L().mo22014s(new fc5(bundle.getString("app_id"), string2, wq6, bundle.getLong(C1767b9.C1768a.f9764m), false, bundle.getString(C1767b9.C1768a.f9755d), y02, bundle.getLong(C1767b9.C1768a.f9756e), y0, bundle.getLong(C1767b9.C1768a.f9761j), y03));
        } catch (IllegalArgumentException unused) {
        }
    }
}
