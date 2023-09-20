package com.onedelhi.secure;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.concurrent.Executor;

public final class l73 {

    /* renamed from: a */
    public static final String f31582a = "firebase_messaging_notification_delegation_enabled";

    /* renamed from: b */
    public static boolean m55313b(Context context) {
        return Binder.getCallingUid() == context.getApplicationInfo().uid;
    }

    @ly4
    /* renamed from: c */
    public static void m55314c(Context context) {
        if (!m73.m56965b(context)) {
            m55317f(t40.f35420a, context, m55318g(context));
        }
    }

    /* renamed from: d */
    public static boolean m55315d(Context context) {
        if (!PlatformVersion.isAtLeastQ()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
            }
            return false;
        } else if (!m55313b(context)) {
            Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
            return false;
        } else if (!"com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
            return false;
        } else {
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "GMS core is set for proxying");
            return true;
        }
    }

    /* renamed from: e */
    public static /* synthetic */ void m55316e(Context context, boolean z, x94 x94) {
        try {
            if (!m55313b(context)) {
                Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                return;
            }
            m73.m56966c(context, true);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (z) {
                notificationManager.setNotificationDelegate("com.google.android.gms");
            } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                notificationManager.setNotificationDelegate((String) null);
            }
            x94.mo26839e(null);
        } finally {
            x94.mo26839e(null);
        }
    }

    @TargetApi(29)
    /* renamed from: f */
    public static w94<Void> m55317f(Executor executor, Context context, boolean z) {
        if (!PlatformVersion.isAtLeastQ()) {
            return ha4.m16572g(null);
        }
        x94 x94 = new x94();
        executor.execute(new k73(context, z, x94));
        return x94.mo26835a();
    }

    /* renamed from: g */
    public static boolean m55318g(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(f31582a)) {
                return true;
            }
            return applicationInfo.metaData.getBoolean(f31582a);
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
