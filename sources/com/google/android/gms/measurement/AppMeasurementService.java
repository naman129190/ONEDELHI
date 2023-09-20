package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.onedelhi.secure.bc2;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.tn6;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.vn6;

public final class AppMeasurementService extends Service implements tn6 {

    /* renamed from: a */
    public vn6 f7588a;

    /* renamed from: a */
    public final boolean mo10744a(int i) {
        return stopSelfResult(i);
    }

    /* renamed from: b */
    public final void mo10745b(@mr2 JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final void mo10746c(@mr2 Intent intent) {
        WakefulBroadcastReceiver.m4719b(intent);
    }

    /* renamed from: d */
    public final vn6 mo10757d() {
        if (this.f7588a == null) {
            this.f7588a = new vn6(this);
        }
        return this.f7588a;
    }

    @bc2
    @ts2
    public IBinder onBind(@mr2 Intent intent) {
        return mo10757d().mo26178b(intent);
    }

    @bc2
    public void onCreate() {
        super.onCreate();
        mo10757d().mo26181e();
    }

    @bc2
    public void onDestroy() {
        mo10757d().mo26182f();
        super.onDestroy();
    }

    @bc2
    public void onRebind(@mr2 Intent intent) {
        mo10757d().mo26183g(intent);
    }

    @bc2
    public int onStartCommand(@mr2 Intent intent, int i, int i2) {
        mo10757d().mo26177a(intent, i, i2);
        return 2;
    }

    @bc2
    public boolean onUnbind(@mr2 Intent intent) {
        mo10757d().mo26186j(intent);
        return true;
    }
}
