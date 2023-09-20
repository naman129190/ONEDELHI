package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.messaging.C4334k;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

@KeepForSdk
public class j01 {
    @mj1("lock")

    /* renamed from: a */
    public static C4334k f30535a = null;

    /* renamed from: a */
    public static final Object f30536a = new Object();

    /* renamed from: a */
    public static final String f30537a = "rawData";

    /* renamed from: b */
    public static final String f30538b = "gcm.rawData64";

    /* renamed from: a */
    public final Context f30539a;

    /* renamed from: a */
    public final Executor f30540a;

    public j01(Context context) {
        this.f30539a = context;
        this.f30540a = t40.f35420a;
    }

    public j01(Context context, ExecutorService executorService) {
        this.f30539a = context;
        this.f30540a = executorService;
    }

    /* renamed from: d */
    public static w94<Integer> m52851d(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        if (tu3.m66209b().mo45319e(context)) {
            qw4.m63239i(context, m52852e(context, "com.google.firebase.MESSAGING_EVENT"), intent);
        } else {
            m52852e(context, "com.google.firebase.MESSAGING_EVENT").mo29832c(intent);
        }
        return ha4.m16572g(-1);
    }

    /* renamed from: e */
    public static C4334k m52852e(Context context, String str) {
        C4334k kVar;
        synchronized (f30536a) {
            if (f30535a == null) {
                f30535a = new C4334k(context, str);
            }
            kVar = f30535a;
        }
        return kVar;
    }

    /* renamed from: g */
    public static /* synthetic */ Integer m52854g(w94 w94) throws Exception {
        return 403;
    }

    /* renamed from: h */
    public static /* synthetic */ w94 m52855h(Context context, Intent intent, w94 w94) throws Exception {
        return (!PlatformVersion.isAtLeastO() || ((Integer) w94.mo17586r()).intValue() != 402) ? w94 : m52851d(context, intent).mo17582n(t40.f35420a, h01.f29356a);
    }

    @VisibleForTesting
    /* renamed from: j */
    public static void m52856j() {
        synchronized (f30536a) {
            f30535a = null;
        }
    }

    @KeepForSdk
    /* renamed from: i */
    public w94<Integer> mo38366i(Intent intent) {
        String stringExtra = intent.getStringExtra(f30538b);
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra(f30538b);
        }
        return mo38367k(this.f30539a, intent);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: k */
    public w94<Integer> mo38367k(Context context, Intent intent) {
        boolean z = true;
        boolean z2 = PlatformVersion.isAtLeastO() && context.getApplicationInfo().targetSdkVersion >= 26;
        if ((intent.getFlags() & bi2.f26358i) == 0) {
            z = false;
        }
        return (!z2 || z) ? ha4.m16569d(this.f30540a, new i01(context, intent)).mo17584p(this.f30540a, new g01(context, intent)) : m52851d(context, intent);
    }
}
