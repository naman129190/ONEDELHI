package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import com.google.firebase.messaging.C4334k;
import java.util.concurrent.TimeUnit;

public final class qw4 {

    /* renamed from: a */
    public static final long f34390a = TimeUnit.MINUTES.toMillis(1);
    @mj1("WakeLockHolder.syncObject")

    /* renamed from: a */
    public static ow4 f34391a = null;

    /* renamed from: a */
    public static final Object f34392a = new Object();

    /* renamed from: a */
    public static final String f34393a = "com.google.firebase.iid.WakeLockHolder.wakefulintent";

    @il3(allowedOnPath = ".*firebase(-|_)(iid|messaging)/.*", explanation = "To be used for testing purpose only", link = "")
    /* renamed from: b */
    public static void m63232b(Intent intent, long j) {
        synchronized (f34392a) {
            if (f34391a != null) {
                m63240j(intent, true);
                f34391a.mo22116a(j);
            }
        }
    }

    @mj1("WakeLockHolder.syncObject")
    /* renamed from: c */
    public static void m63233c(Context context) {
        if (f34391a == null) {
            ow4 ow4 = new ow4(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f34391a = ow4;
            ow4.mo22119d(true);
        }
    }

    /* renamed from: d */
    public static void m63234d(@mr2 Intent intent) {
        synchronized (f34392a) {
            if (f34391a != null && m63236f(intent)) {
                m63240j(intent, false);
                f34391a.mo22118c();
            }
        }
    }

    @il3(allowedOnPath = ".*firebase(-|_)(iid|messaging)/.*", explanation = "To be used for testing purpose only", link = "")
    /* renamed from: e */
    public static void m63235e(Context context) {
        synchronized (f34392a) {
            m63233c(context);
        }
    }

    @hw4
    /* renamed from: f */
    public static boolean m63236f(@mr2 Intent intent) {
        return intent.getBooleanExtra(f34393a, false);
    }

    @il3(allowedOnPath = ".*firebase(-|_)(iid|messaging)/.*", explanation = "To be used for testing purpose only", link = "")
    /* renamed from: h */
    public static void m63238h() {
        synchronized (f34392a) {
            f34391a = null;
        }
    }

    @SuppressLint({"TaskMainThread"})
    /* renamed from: i */
    public static void m63239i(Context context, C4334k kVar, Intent intent) {
        synchronized (f34392a) {
            m63233c(context);
            boolean f = m63236f(intent);
            m63240j(intent, true);
            if (!f) {
                f34391a.mo22116a(f34390a);
            }
            kVar.mo29832c(intent).mo17573e(new pw4(intent));
        }
    }

    /* renamed from: j */
    public static void m63240j(@mr2 Intent intent, boolean z) {
        intent.putExtra(f34393a, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        return r3;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.ComponentName m63241k(@com.onedelhi.secure.mr2 android.content.Context r3, @com.onedelhi.secure.mr2 android.content.Intent r4) {
        /*
            java.lang.Object r0 = f34392a
            monitor-enter(r0)
            m63233c(r3)     // Catch:{ all -> 0x0022 }
            boolean r1 = m63236f(r4)     // Catch:{ all -> 0x0022 }
            r2 = 1
            m63240j(r4, r2)     // Catch:{ all -> 0x0022 }
            android.content.ComponentName r3 = r3.startService(r4)     // Catch:{ all -> 0x0022 }
            if (r3 != 0) goto L_0x0017
            r3 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return r3
        L_0x0017:
            if (r1 != 0) goto L_0x0020
            com.onedelhi.secure.ow4 r4 = f34391a     // Catch:{ all -> 0x0022 }
            long r1 = f34390a     // Catch:{ all -> 0x0022 }
            r4.mo22116a(r1)     // Catch:{ all -> 0x0022 }
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return r3
        L_0x0022:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.qw4.m63241k(android.content.Context, android.content.Intent):android.content.ComponentName");
    }
}
