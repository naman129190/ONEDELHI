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
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class o84 implements Runnable {

    /* renamed from: a */
    public final PowerManager.WakeLock f32923a;

    /* renamed from: a */
    public final FirebaseMessaging f32924a;
    @SuppressLint({"ThreadPoolCreation"})
    @VisibleForTesting

    /* renamed from: a */
    public ExecutorService f32925a = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));

    /* renamed from: b */
    public final long f32926b;

    @VisibleForTesting
    /* renamed from: com.onedelhi.secure.o84$a */
    public static class C6255a extends BroadcastReceiver {
        @ts2

        /* renamed from: a */
        public o84 f32927a;

        public C6255a(o84 o84) {
            this.f32927a = o84;
        }

        /* renamed from: a */
        public void mo41609a() {
            if (o84.m59106c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f32927a.mo41605b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public void onReceive(Context context, Intent intent) {
            o84 o84 = this.f32927a;
            if (o84 != null && o84.mo41606d()) {
                if (o84.m59106c()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f32927a.f32924a.mo29708s(this.f32927a, 0);
                this.f32927a.mo41605b().unregisterReceiver(this);
                this.f32927a = null;
            }
        }
    }

    @SuppressLint({"InvalidWakeLockTag"})
    @VisibleForTesting
    public o84(FirebaseMessaging firebaseMessaging, long j) {
        this.f32924a = firebaseMessaging;
        this.f32926b = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) mo41605b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f32923a = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* renamed from: c */
    public static boolean m59106c() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    /* renamed from: b */
    public Context mo41605b() {
        return this.f32924a.mo29709t();
    }

    /* renamed from: d */
    public boolean mo41606d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) mo41605b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @VisibleForTesting
    /* renamed from: e */
    public boolean mo41607e() throws IOException {
        String str;
        try {
            if (this.f32924a.mo29705n() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            } else if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            } else {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
                return true;
            }
        } catch (IOException e) {
            if (nh1.m58096h(e.getMessage())) {
                str = "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval";
            } else if (e.getMessage() == null) {
                str = "Token retrieval failed without exception message. Will retry token retrieval";
            } else {
                throw e;
            }
            Log.w("FirebaseMessaging", str);
            return false;
        } catch (SecurityException unused) {
            str = "Token retrieval failed with SecurityException. Will retry token retrieval";
            Log.w("FirebaseMessaging", str);
            return false;
        }
    }

    @SuppressLint({"WakelockTimeout"})
    public void run() {
        if (tu3.m66209b().mo45319e(mo41605b())) {
            this.f32923a.acquire();
        }
        try {
            this.f32924a.mo29698U(true);
            if (!this.f32924a.mo29692D()) {
                this.f32924a.mo29698U(false);
                if (tu3.m66209b().mo45319e(mo41605b())) {
                    this.f32923a.release();
                }
            } else if (!tu3.m66209b().mo45318d(mo41605b()) || mo41606d()) {
                if (mo41607e()) {
                    this.f32924a.mo29698U(false);
                } else {
                    this.f32924a.mo29702Y(this.f32926b);
                }
                if (!tu3.m66209b().mo45319e(mo41605b())) {
                    return;
                }
                this.f32923a.release();
            } else {
                new C6255a(this).mo41609a();
                if (tu3.m66209b().mo45319e(mo41605b())) {
                    this.f32923a.release();
                }
            }
        } catch (IOException e) {
            Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
            this.f32924a.mo29698U(false);
            if (!tu3.m66209b().mo45319e(mo41605b())) {
            }
        } catch (Throwable th) {
            if (tu3.m66209b().mo45319e(mo41605b())) {
                this.f32923a.release();
            }
            throw th;
        }
    }
}
