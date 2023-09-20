package com.onedelhi.secure;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;

public final class to6 extends xo6 {

    /* renamed from: a */
    public final AlarmManager f21042a = ((AlarmManager) this.f11205a.mo15137f().getSystemService(es2.f11372W));

    /* renamed from: a */
    public th5 f21043a;

    /* renamed from: a */
    public Integer f21044a;

    public to6(qq6 qq6) {
        super(qq6);
    }

    /* renamed from: l */
    public final boolean mo13582l() {
        AlarmManager alarmManager = this.f21042a;
        if (alarmManager != null) {
            alarmManager.cancel(mo25243p());
        }
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        mo25245r();
        return false;
    }

    /* renamed from: m */
    public final void mo25240m() {
        mo27038i();
        this.f11205a.mo15136e().mo12730v().mo25379a("Unscheduling upload");
        AlarmManager alarmManager = this.f21042a;
        if (alarmManager != null) {
            alarmManager.cancel(mo25243p());
        }
        mo25244q().mo25025b();
        if (Build.VERSION.SDK_INT >= 24) {
            mo25245r();
        }
    }

    /* renamed from: n */
    public final void mo25241n(long j) {
        mo27038i();
        this.f11205a.mo15134c();
        Context f = this.f11205a.mo15137f();
        if (!gr6.m16177a0(f)) {
            this.f11205a.mo15136e().mo12725q().mo25379a("Receiver not registered/enabled");
        }
        if (!gr6.m16178b0(f, false)) {
            this.f11205a.mo15136e().mo12725q().mo25379a("Service not registered/enabled");
        }
        mo25240m();
        this.f11205a.mo15136e().mo12730v().mo25380b("Scheduling upload, millis", Long.valueOf(j));
        long elapsedRealtime = this.f11205a.mo15133a().elapsedRealtime() + j;
        this.f11205a.mo27891z();
        if (j < Math.max(0, ((Long) n36.f17091x.mo18887a((Object) null)).longValue()) && !mo25244q().mo25027e()) {
            mo25244q().mo25026d(j);
        }
        this.f11205a.mo15134c();
        if (Build.VERSION.SDK_INT >= 24) {
            Context f2 = this.f11205a.mo15137f();
            ComponentName componentName = new ComponentName(f2, "com.google.android.gms.measurement.AppMeasurementJobService");
            int o = mo25242o();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            hq5.m16901a(f2, new JobInfo.Builder(o, componentName).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
            return;
        }
        AlarmManager alarmManager = this.f21042a;
        if (alarmManager != null) {
            this.f11205a.mo27891z();
            alarmManager.setInexactRepeating(2, elapsedRealtime, Math.max(((Long) n36.f17081s.mo18887a((Object) null)).longValue(), j), mo25243p());
        }
    }

    /* renamed from: o */
    public final int mo25242o() {
        if (this.f21044a == null) {
            this.f21044a = Integer.valueOf("measurement".concat(String.valueOf(this.f11205a.mo15137f().getPackageName())).hashCode());
        }
        return this.f21044a.intValue();
    }

    /* renamed from: p */
    public final PendingIntent mo25243p() {
        Context f = this.f11205a.mo15137f();
        return PendingIntent.getBroadcast(f, 0, new Intent().setClassName(f, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), cq5.f10464a);
    }

    /* renamed from: q */
    public final th5 mo25244q() {
        if (this.f21043a == null) {
            this.f21043a = new ro6(this, this.f21907a.mo23376c0());
        }
        return this.f21043a;
    }

    @TargetApi(24)
    /* renamed from: r */
    public final void mo25245r() {
        JobScheduler jobScheduler = (JobScheduler) this.f11205a.mo15137f().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(mo25242o());
        }
    }
}
