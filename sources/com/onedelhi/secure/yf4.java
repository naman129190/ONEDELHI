package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.C4311b;
import java.io.IOException;

public class yf4 implements Runnable {
    @mj1("TOPIC_SYNC_TASK_LOCK")

    /* renamed from: a */
    public static Boolean f37885a;

    /* renamed from: a */
    public static final Object f37886a = new Object();
    @mj1("TOPIC_SYNC_TASK_LOCK")

    /* renamed from: b */
    public static Boolean f37887b;

    /* renamed from: a */
    public final Context f37888a;

    /* renamed from: a */
    public final PowerManager.WakeLock f37889a;

    /* renamed from: a */
    public final ji2 f37890a;

    /* renamed from: a */
    public final xf4 f37891a;

    /* renamed from: b */
    public final long f37892b;

    @hw4
    /* renamed from: com.onedelhi.secure.yf4$a */
    public class C7346a extends BroadcastReceiver {
        @mj1("this")
        @ts2

        /* renamed from: a */
        public yf4 f37893a;

        public C7346a(yf4 yf4) {
            this.f37893a = yf4;
        }

        /* renamed from: a */
        public void mo47787a() {
            if (yf4.m71723j()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            yf4.this.f37888a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public synchronized void onReceive(Context context, Intent intent) {
            yf4 yf4 = this.f37893a;
            if (yf4 != null) {
                if (yf4.mo47785i()) {
                    if (yf4.m71723j()) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    this.f37893a.f37891a.mo47155n(this.f37893a, 0);
                    context.unregisterReceiver(this);
                    this.f37893a = null;
                }
            }
        }
    }

    public yf4(xf4 xf4, Context context, ji2 ji2, long j) {
        this.f37891a = xf4;
        this.f37888a = context;
        this.f37892b = j;
        this.f37890a = ji2;
        this.f37889a = ((PowerManager) context.getSystemService("power")).newWakeLock(1, C4311b.f25065b);
    }

    /* renamed from: e */
    public static String m71719e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    /* renamed from: f */
    public static boolean m71720f(Context context) {
        boolean booleanValue;
        synchronized (f37886a) {
            Boolean bool = f37887b;
            Boolean valueOf = Boolean.valueOf(bool == null ? m71721g(context, vg0.f21757b, bool) : bool.booleanValue());
            f37887b = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: g */
    public static boolean m71721g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", m71719e(str));
        }
        return z;
    }

    /* renamed from: h */
    public static boolean m71722h(Context context) {
        boolean booleanValue;
        synchronized (f37886a) {
            Boolean bool = f37885a;
            Boolean valueOf = Boolean.valueOf(bool == null ? m71721g(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
            f37885a = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: j */
    public static boolean m71723j() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    /* renamed from: i */
    public final synchronized boolean mo47785i() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f37888a.getSystemService("connectivity");
        activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @SuppressLint({"Wakelock"})
    public void run() {
        PowerManager.WakeLock wakeLock;
        if (m71722h(this.f37888a)) {
            this.f37889a.acquire(C4311b.f25063a);
        }
        try {
            this.f37891a.mo47157p(true);
            if (!this.f37890a.mo38677g()) {
                this.f37891a.mo47157p(false);
                if (m71722h(this.f37888a)) {
                    try {
                        this.f37889a.release();
                    } catch (RuntimeException unused) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } else if (!m71720f(this.f37888a) || mo47785i()) {
                if (this.f37891a.mo47161t()) {
                    this.f37891a.mo47157p(false);
                } else {
                    this.f37891a.mo47162u(this.f37892b);
                }
                if (m71722h(this.f37888a)) {
                    try {
                        wakeLock = this.f37889a;
                        wakeLock.release();
                    } catch (RuntimeException unused2) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } else {
                new C7346a(this).mo47787a();
                if (m71722h(this.f37888a)) {
                    try {
                        this.f37889a.release();
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            }
        } catch (IOException e) {
            Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e.getMessage());
            this.f37891a.mo47157p(false);
            if (m71722h(this.f37888a)) {
                wakeLock = this.f37889a;
            }
        } catch (Throwable th) {
            if (m71722h(this.f37888a)) {
                try {
                    this.f37889a.release();
                } catch (RuntimeException unused4) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th;
        }
    }
}
