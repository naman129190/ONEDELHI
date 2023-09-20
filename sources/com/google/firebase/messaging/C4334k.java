package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.onedelhi.secure.ay4;
import com.onedelhi.secure.bi2;
import com.onedelhi.secure.hw4;
import com.onedelhi.secure.mj1;
import com.onedelhi.secure.qw4;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.w94;
import com.onedelhi.secure.x94;
import com.onedelhi.secure.zx4;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.messaging.k */
public class C4334k implements ServiceConnection {

    /* renamed from: n */
    public static final int f25216n = 9000;

    /* renamed from: a */
    public final Context f25217a;

    /* renamed from: a */
    public final Intent f25218a;
    @ts2

    /* renamed from: a */
    public C4332j f25219a;

    /* renamed from: a */
    public final Queue<C4335a> f25220a;

    /* renamed from: a */
    public final ScheduledExecutorService f25221a;
    @mj1("this")

    /* renamed from: b */
    public boolean f25222b;

    /* renamed from: com.google.firebase.messaging.k$a */
    public static class C4335a {

        /* renamed from: a */
        public final Intent f25223a;

        /* renamed from: a */
        public final x94<Void> f25224a = new x94<>();

        public C4335a(Intent intent) {
            this.f25223a = intent;
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m34896f() {
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + this.f25223a.getAction() + " Releasing WakeLock.");
            mo29837d();
        }

        /* renamed from: c */
        public void mo29836c(ScheduledExecutorService scheduledExecutorService) {
            mo29838e().mo17574f(scheduledExecutorService, new zx4(scheduledExecutorService.schedule(new ay4(this), (this.f25223a.getFlags() & bi2.f26358i) != 0 ? qw4.f34390a : 9000, TimeUnit.MILLISECONDS)));
        }

        /* renamed from: d */
        public void mo29837d() {
            this.f25224a.mo26839e(null);
        }

        /* renamed from: e */
        public w94<Void> mo29838e() {
            return this.f25224a.mo26835a();
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public C4334k(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    @hw4
    public C4334k(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f25220a = new ArrayDeque();
        this.f25222b = false;
        Context applicationContext = context.getApplicationContext();
        this.f25217a = applicationContext;
        this.f25218a = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f25221a = scheduledExecutorService;
    }

    @mj1("this")
    /* renamed from: a */
    public final void mo29830a() {
        while (!this.f25220a.isEmpty()) {
            this.f25220a.poll().mo29837d();
        }
    }

    /* renamed from: b */
    public final synchronized void mo29831b() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.f25220a.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            C4332j jVar = this.f25219a;
            if (jVar == null || !jVar.isBinderAlive()) {
                mo29833d();
                return;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
            }
            this.f25219a.mo29829c(this.f25220a.poll());
        }
    }

    /* renamed from: c */
    public synchronized w94<Void> mo29832c(Intent intent) {
        C4335a aVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
        }
        aVar = new C4335a(intent);
        aVar.mo29836c(this.f25221a);
        this.f25220a.add(aVar);
        mo29831b();
        return aVar.mo29838e();
    }

    @mj1("this")
    /* renamed from: d */
    public final void mo29833d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("binder is dead. start connection? ");
            sb.append(!this.f25222b);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (!this.f25222b) {
            this.f25222b = true;
            try {
                if (!ConnectionTracker.getInstance().bindService(this.f25217a, this.f25218a, this, 65)) {
                    Log.e("FirebaseMessaging", "binding to the service failed");
                    this.f25222b = false;
                    mo29830a();
                }
            } catch (SecurityException e) {
                Log.e("FirebaseMessaging", "Exception while binding the service", e);
            }
        }
    }

    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
        }
        this.f25222b = false;
        if (!(iBinder instanceof C4332j)) {
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            mo29830a();
            return;
        }
        this.f25219a = (C4332j) iBinder;
        mo29831b();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        mo29831b();
    }
}
