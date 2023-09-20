package com.onedelhi.secure;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;

public final class d86 {

    /* renamed from: a */
    public final b86 f10661a;

    public d86(b86 b86) {
        Preconditions.checkNotNull(b86);
        this.f10661a = b86;
    }

    @bc2
    /* renamed from: a */
    public final void mo14566a(Context context, Intent intent) {
        za6 H = za6.m32969H(context, (nu5) null, (Long) null);
        a56 e = H.mo15136e();
        if (intent == null) {
            e.mo12731w().mo25379a("Receiver called with null intent");
            return;
        }
        H.mo15134c();
        String action = intent.getAction();
        e.mo12730v().mo25380b("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            e.mo12730v().mo25379a("Starting wakeful intent.");
            this.f10661a.mo10754a(context, className);
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            e.mo12731w().mo25379a("Install Referrer Broadcasts are deprecated");
        }
    }
}
