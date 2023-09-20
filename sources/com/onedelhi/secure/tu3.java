package com.onedelhi.secure;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayDeque;
import java.util.Queue;

@KeepForSdk
public class tu3 {

    /* renamed from: a */
    public static final int f35791a = -1;

    /* renamed from: a */
    public static tu3 f35792a = null;
    @KeepForSdk

    /* renamed from: b */
    public static final int f35793b = 500;

    /* renamed from: b */
    public static final String f35794b = "com.google.firebase.MESSAGING_EVENT";

    /* renamed from: c */
    public static final int f35795c = 404;

    /* renamed from: c */
    public static final String f35796c = "wrapped_intent";

    /* renamed from: d */
    public static final int f35797d = 401;

    /* renamed from: d */
    public static final String f35798d = "this should normally be included by the manifest merger, but may needed to be manually added to your manifest";

    /* renamed from: e */
    public static final int f35799e = 402;

    /* renamed from: f */
    public static final int f35800f = 403;

    /* renamed from: a */
    public Boolean f35801a = null;
    @mj1("this")
    @ts2

    /* renamed from: a */
    public String f35802a = null;

    /* renamed from: a */
    public final Queue<Intent> f35803a = new ArrayDeque();

    /* renamed from: b */
    public Boolean f35804b = null;

    /* renamed from: b */
    public static synchronized tu3 m66209b() {
        tu3 tu3;
        synchronized (tu3.class) {
            if (f35792a == null) {
                f35792a = new tu3();
            }
            tu3 = f35792a;
        }
        return tu3;
    }

    @hw4
    /* renamed from: g */
    public static void m66210g(tu3 tu3) {
        f35792a = tu3;
    }

    /* renamed from: a */
    public final int mo45316a(Context context, Intent intent) {
        ComponentName componentName;
        String f = mo45320f(context, intent);
        if (f != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Restricting intent to a specific service: " + f);
            }
            intent.setClassName(context.getPackageName(), f);
        }
        try {
            if (mo45319e(context)) {
                componentName = qw4.m63241k(context, intent);
            } else {
                componentName = context.startService(intent);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (componentName != null) {
                return -1;
            }
            Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
            return f35795c;
        } catch (SecurityException e) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e);
            return 401;
        } catch (IllegalStateException e2) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: " + e2);
            return 402;
        }
    }

    @bc2
    /* renamed from: c */
    public Intent mo45317c() {
        return this.f35803a.poll();
    }

    /* renamed from: d */
    public boolean mo45318d(Context context) {
        if (this.f35804b == null) {
            this.f35804b = Boolean.valueOf(context.checkCallingOrSelfPermission(vg0.f21757b) == 0);
        }
        if (!this.f35801a.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f35804b.booleanValue();
    }

    /* renamed from: e */
    public boolean mo45319e(Context context) {
        if (this.f35801a == null) {
            this.f35801a = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f35801a.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f35801a.booleanValue();
    }

    @ts2
    /* renamed from: f */
    public final synchronized String mo45320f(Context context, Intent intent) {
        String str;
        String str2 = this.f35802a;
        if (str2 != null) {
            return str2;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService != null) {
            ServiceInfo serviceInfo = resolveService.serviceInfo;
            if (serviceInfo != null) {
                if (context.getPackageName().equals(serviceInfo.packageName)) {
                    String str3 = serviceInfo.name;
                    if (str3 != null) {
                        if (str3.startsWith(".")) {
                            str = context.getPackageName() + serviceInfo.name;
                        } else {
                            str = serviceInfo.name;
                        }
                        this.f35802a = str;
                        return this.f35802a;
                    }
                }
                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                return null;
            }
        }
        Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
        return null;
    }

    @bc2
    /* renamed from: h */
    public int mo45321h(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        this.f35803a.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return mo45316a(context, intent2);
    }
}
