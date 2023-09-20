package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.messaging.C4332j;
import com.onedelhi.secure.C3740us;
import com.onedelhi.secure.bc2;
import com.onedelhi.secure.ha4;
import com.onedelhi.secure.hw4;
import com.onedelhi.secure.k01;
import com.onedelhi.secure.qw4;
import com.onedelhi.secure.t40;
import com.onedelhi.secure.tu0;
import com.onedelhi.secure.uu0;
import com.onedelhi.secure.w94;
import com.onedelhi.secure.x94;
import java.util.concurrent.ExecutorService;

@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
public abstract class EnhancedIntentService extends Service {

    /* renamed from: b */
    public static final String f25005b = "EnhancedIntentService";

    /* renamed from: a */
    public Binder f25006a;

    /* renamed from: a */
    public final Object f25007a = new Object();
    @hw4

    /* renamed from: a */
    public final ExecutorService f25008a = k01.m53919e();

    /* renamed from: n */
    public int f25009n;

    /* renamed from: o */
    public int f25010o = 0;

    /* renamed from: com.google.firebase.messaging.EnhancedIntentService$a */
    public class C4307a implements C4332j.C4333a {
        public C4307a() {
        }

        @KeepForSdk
        /* renamed from: a */
        public w94<Void> mo29689a(Intent intent) {
            return EnhancedIntentService.this.mo29684j(intent);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m34647h(Intent intent, w94 w94) {
        mo29680d(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m34648i(Intent intent, x94 x94) {
        try {
            mo29682f(intent);
        } finally {
            x94.mo26837c(null);
        }
    }

    /* renamed from: d */
    public final void mo29680d(Intent intent) {
        if (intent != null) {
            qw4.m63234d(intent);
        }
        synchronized (this.f25007a) {
            int i = this.f25010o - 1;
            this.f25010o = i;
            if (i == 0) {
                mo29685k(this.f25009n);
            }
        }
    }

    /* renamed from: e */
    public Intent mo29681e(Intent intent) {
        return intent;
    }

    /* renamed from: f */
    public abstract void mo29682f(Intent intent);

    /* renamed from: g */
    public boolean mo29683g(Intent intent) {
        return false;
    }

    @bc2
    /* renamed from: j */
    public final w94<Void> mo29684j(Intent intent) {
        if (mo29683g(intent)) {
            return ha4.m16572g(null);
        }
        x94 x94 = new x94();
        this.f25008a.execute(new uu0(this, intent, x94));
        return x94.mo26835a();
    }

    /* renamed from: k */
    public boolean mo29685k(int i) {
        return stopSelfResult(i);
    }

    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable(f25005b, 3)) {
            Log.d(f25005b, "Service received bind request");
        }
        if (this.f25006a == null) {
            this.f25006a = new C4332j(new C4307a());
        }
        return this.f25006a;
    }

    @C3740us
    public void onDestroy() {
        this.f25008a.shutdown();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.f25007a) {
            this.f25009n = i2;
            this.f25010o++;
        }
        Intent e = mo29681e(intent);
        if (e == null) {
            mo29680d(intent);
            return 2;
        }
        w94<Void> j = mo29684j(e);
        if (j.mo17589u()) {
            mo29680d(intent);
            return 2;
        }
        j.mo17574f(t40.f35420a, new tu0(this, intent));
        return 3;
    }
}
