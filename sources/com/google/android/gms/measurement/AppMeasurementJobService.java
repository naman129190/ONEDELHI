package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.onedelhi.secure.bc2;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.tn6;
import com.onedelhi.secure.vn6;

@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements tn6 {

    /* renamed from: a */
    public vn6 f7586a;

    /* renamed from: a */
    public final boolean mo10744a(int i) {
        throw new UnsupportedOperationException();
    }

    @TargetApi(24)
    /* renamed from: b */
    public final void mo10745b(@mr2 JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    /* renamed from: c */
    public final void mo10746c(@mr2 Intent intent) {
    }

    /* renamed from: d */
    public final vn6 mo10747d() {
        if (this.f7586a == null) {
            this.f7586a = new vn6(this);
        }
        return this.f7586a;
    }

    @bc2
    public void onCreate() {
        super.onCreate();
        mo10747d().mo26181e();
    }

    @bc2
    public void onDestroy() {
        mo10747d().mo26182f();
        super.onDestroy();
    }

    @bc2
    public void onRebind(@mr2 Intent intent) {
        mo10747d().mo26183g(intent);
    }

    public boolean onStartJob(@mr2 JobParameters jobParameters) {
        mo10747d().mo26185i(jobParameters);
        return true;
    }

    public boolean onStopJob(@mr2 JobParameters jobParameters) {
        return false;
    }

    @bc2
    public boolean onUnbind(@mr2 Intent intent) {
        mo10747d().mo26186j(intent);
        return true;
    }
}
