package com.onedelhi.secure;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.Preconditions;

public final class vn6 {

    /* renamed from: a */
    public final Context f21897a;

    public vn6(Context context) {
        Preconditions.checkNotNull(context);
        this.f21897a = context;
    }

    @bc2
    /* renamed from: a */
    public final int mo26177a(Intent intent, int i, int i2) {
        za6 H = za6.m32969H(this.f21897a, (nu5) null, (Long) null);
        a56 e = H.mo15136e();
        if (intent == null) {
            e.mo12731w().mo25379a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        H.mo15134c();
        e.mo12730v().mo25381c("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            mo26184h(new pn6(this, i2, e, intent));
        }
        return 2;
    }

    @bc2
    /* renamed from: b */
    public final IBinder mo26178b(Intent intent) {
        if (intent == null) {
            mo26187k().mo12726r().mo25379a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new bd6(qq6.m26061f0(this.f21897a), (String) null);
        }
        mo26187k().mo12731w().mo25380b("onBind received unknown action", action);
        return null;
    }

    /* renamed from: c */
    public final /* synthetic */ void mo26179c(int i, a56 a56, Intent intent) {
        if (((tn6) this.f21897a).mo10744a(i)) {
            a56.mo12730v().mo25380b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            mo26187k().mo12730v().mo25379a("Completed wakeful intent.");
            ((tn6) this.f21897a).mo10746c(intent);
        }
    }

    /* renamed from: d */
    public final /* synthetic */ void mo26180d(a56 a56, JobParameters jobParameters) {
        a56.mo12730v().mo25379a("AppMeasurementJobService processed last upload request.");
        ((tn6) this.f21897a).mo10745b(jobParameters, false);
    }

    @bc2
    /* renamed from: e */
    public final void mo26181e() {
        za6 H = za6.m32969H(this.f21897a, (nu5) null, (Long) null);
        a56 e = H.mo15136e();
        H.mo15134c();
        e.mo12730v().mo25379a("Local AppMeasurementService is starting up");
    }

    @bc2
    /* renamed from: f */
    public final void mo26182f() {
        za6 H = za6.m32969H(this.f21897a, (nu5) null, (Long) null);
        a56 e = H.mo15136e();
        H.mo15134c();
        e.mo12730v().mo25379a("Local AppMeasurementService is shutting down");
    }

    @bc2
    /* renamed from: g */
    public final void mo26183g(Intent intent) {
        if (intent == null) {
            mo26187k().mo12726r().mo25379a("onRebind called with null intent");
            return;
        }
        mo26187k().mo12730v().mo25380b("onRebind called. action", intent.getAction());
    }

    /* renamed from: h */
    public final void mo26184h(Runnable runnable) {
        qq6 f0 = qq6.m26061f0(this.f21897a);
        f0.mo15135d().mo23065z(new rn6(this, f0, runnable));
    }

    @bc2
    @TargetApi(24)
    /* renamed from: i */
    public final boolean mo26185i(JobParameters jobParameters) {
        za6 H = za6.m32969H(this.f21897a, (nu5) null, (Long) null);
        a56 e = H.mo15136e();
        String string = jobParameters.getExtras().getString("action");
        H.mo15134c();
        e.mo12730v().mo25380b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        mo26184h(new nn6(this, e, jobParameters));
        return true;
    }

    @bc2
    /* renamed from: j */
    public final boolean mo26186j(Intent intent) {
        if (intent == null) {
            mo26187k().mo12726r().mo25379a("onUnbind called with null intent");
            return true;
        }
        mo26187k().mo12730v().mo25380b("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    /* renamed from: k */
    public final a56 mo26187k() {
        return za6.m32969H(this.f21897a, (nu5) null, (Long) null).mo15136e();
    }
}
