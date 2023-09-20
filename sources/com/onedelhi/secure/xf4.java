package com.onedelhi.secure;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class xf4 {

    /* renamed from: a */
    public static final long f37439a = 30;

    /* renamed from: a */
    public static final String f37440a = "INTERNAL_SERVER_ERROR";

    /* renamed from: b */
    public static final long f37441b = 30;

    /* renamed from: b */
    public static final String f37442b = "SERVICE_NOT_AVAILABLE";

    /* renamed from: c */
    public static final long f37443c = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a */
    public final Context f37444a;

    /* renamed from: a */
    public final FirebaseMessaging f37445a;

    /* renamed from: a */
    public final ji2 f37446a;

    /* renamed from: a */
    public final nh1 f37447a;

    /* renamed from: a */
    public final vf4 f37448a;
    @mj1("pendingOperations")

    /* renamed from: a */
    public final Map<String, ArrayDeque<x94<Void>>> f37449a = new C3042oa();

    /* renamed from: a */
    public final ScheduledExecutorService f37450a;
    @mj1("this")

    /* renamed from: a */
    public boolean f37451a = false;

    public xf4(FirebaseMessaging firebaseMessaging, ji2 ji2, vf4 vf4, nh1 nh1, Context context, @mr2 ScheduledExecutorService scheduledExecutorService) {
        this.f37445a = firebaseMessaging;
        this.f37446a = ji2;
        this.f37448a = vf4;
        this.f37447a = nh1;
        this.f37444a = context;
        this.f37450a = scheduledExecutorService;
    }

    @ly4
    /* renamed from: c */
    public static <T> void m70219c(w94<T> w94) throws IOException {
        try {
            ha4.m16567b(w94, 30, TimeUnit.SECONDS);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e);
            }
        } catch (InterruptedException | TimeoutException e2) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e2);
        }
    }

    @hw4
    /* renamed from: f */
    public static w94<xf4> m70220f(FirebaseMessaging firebaseMessaging, ji2 ji2, nh1 nh1, Context context, @mr2 ScheduledExecutorService scheduledExecutorService) {
        return ha4.m16569d(scheduledExecutorService, new wf4(context, scheduledExecutorService, firebaseMessaging, ji2, nh1));
    }

    /* renamed from: i */
    public static boolean m70221i() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    /* renamed from: k */
    public static /* synthetic */ xf4 m70222k(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, ji2 ji2, nh1 nh1) throws Exception {
        return new xf4(firebaseMessaging, ji2, vf4.m68066d(context, scheduledExecutorService), nh1, context, scheduledExecutorService);
    }

    /* renamed from: b */
    public final void mo47147b(uf4 uf4, x94<Void> x94) {
        ArrayDeque arrayDeque;
        synchronized (this.f37449a) {
            String e = uf4.mo45582e();
            if (this.f37449a.containsKey(e)) {
                arrayDeque = this.f37449a.get(e);
            } else {
                ArrayDeque arrayDeque2 = new ArrayDeque();
                this.f37449a.put(e, arrayDeque2);
                arrayDeque = arrayDeque2;
            }
            arrayDeque.add(x94);
        }
    }

    @ly4
    /* renamed from: d */
    public final void mo47148d(String str) throws IOException {
        m70219c(this.f37447a.mo41073l(this.f37445a.mo29705n(), str));
    }

    @ly4
    /* renamed from: e */
    public final void mo47149e(String str) throws IOException {
        m70219c(this.f37447a.mo41074m(this.f37445a.mo29705n(), str));
    }

    @hw4
    /* renamed from: g */
    public vf4 mo47150g() {
        return this.f37448a;
    }

    /* renamed from: h */
    public boolean mo47151h() {
        return this.f37448a.mo46142e() != null;
    }

    /* renamed from: j */
    public synchronized boolean mo47152j() {
        return this.f37451a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        return;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47153l(com.onedelhi.secure.uf4 r5) {
        /*
            r4 = this;
            java.util.Map<java.lang.String, java.util.ArrayDeque<com.onedelhi.secure.x94<java.lang.Void>>> r0 = r4.f37449a
            monitor-enter(r0)
            java.lang.String r5 = r5.mo45582e()     // Catch:{ all -> 0x0032 }
            java.util.Map<java.lang.String, java.util.ArrayDeque<com.onedelhi.secure.x94<java.lang.Void>>> r1 = r4.f37449a     // Catch:{ all -> 0x0032 }
            boolean r1 = r1.containsKey(r5)     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0011:
            java.util.Map<java.lang.String, java.util.ArrayDeque<com.onedelhi.secure.x94<java.lang.Void>>> r1 = r4.f37449a     // Catch:{ all -> 0x0032 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0032 }
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x0032 }
            java.lang.Object r2 = r1.poll()     // Catch:{ all -> 0x0032 }
            com.onedelhi.secure.x94 r2 = (com.onedelhi.secure.x94) r2     // Catch:{ all -> 0x0032 }
            if (r2 == 0) goto L_0x0025
            r3 = 0
            r2.mo26837c(r3)     // Catch:{ all -> 0x0032 }
        L_0x0025:
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0030
            java.util.Map<java.lang.String, java.util.ArrayDeque<com.onedelhi.secure.x94<java.lang.Void>>> r1 = r4.f37449a     // Catch:{ all -> 0x0032 }
            r1.remove(r5)     // Catch:{ all -> 0x0032 }
        L_0x0030:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0032:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.xf4.mo47153l(com.onedelhi.secure.uf4):void");
    }

    @ly4
    /* renamed from: m */
    public boolean mo47154m(uf4 uf4) throws IOException {
        String str;
        String str2;
        try {
            String b = uf4.mo45580b();
            char c = 65535;
            int hashCode = b.hashCode();
            if (hashCode != 83) {
                if (hashCode == 85) {
                    if (b.equals("U")) {
                        c = 1;
                    }
                }
            } else if (b.equals(mx0.f16693i2)) {
                c = 0;
            }
            if (c == 0) {
                mo47148d(uf4.mo45581c());
                if (m70221i()) {
                    str2 = "Subscribe to topic: " + uf4.mo45581c() + " succeeded.";
                }
                return true;
            } else if (c != 1) {
                if (m70221i()) {
                    str2 = "Unknown topic operation" + uf4 + ".";
                }
                return true;
            } else {
                mo47149e(uf4.mo45581c());
                if (m70221i()) {
                    str2 = "Unsubscribe from topic: " + uf4.mo45581c() + " succeeded.";
                }
                return true;
            }
            Log.d("FirebaseMessaging", str2);
            return true;
        } catch (IOException e) {
            if ("SERVICE_NOT_AVAILABLE".equals(e.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e.getMessage())) {
                str = "Topic operation failed: " + e.getMessage() + ". Will retry Topic operation.";
            } else if (e.getMessage() == null) {
                str = "Topic operation failed without exception message. Will retry Topic operation.";
            } else {
                throw e;
            }
            Log.e("FirebaseMessaging", str);
            return false;
        }
    }

    /* renamed from: n */
    public void mo47155n(Runnable runnable, long j) {
        this.f37450a.schedule(runnable, j, TimeUnit.SECONDS);
    }

    @hw4
    /* renamed from: o */
    public w94<Void> mo47156o(uf4 uf4) {
        this.f37448a.mo46140a(uf4);
        x94 x94 = new x94();
        mo47147b(uf4, x94);
        return x94.mo26835a();
    }

    /* renamed from: p */
    public synchronized void mo47157p(boolean z) {
        this.f37451a = z;
    }

    /* renamed from: q */
    public final void mo47158q() {
        if (!mo47152j()) {
            mo47162u(0);
        }
    }

    /* renamed from: r */
    public void mo47159r() {
        if (mo47151h()) {
            mo47158q();
        }
    }

    /* renamed from: s */
    public w94<Void> mo47160s(String str) {
        w94<Void> o = mo47156o(uf4.m67011f(str));
        mo47159r();
        return o;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        if (mo47154m(r0) != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        return false;
     */
    @com.onedelhi.secure.ly4
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo47161t() throws java.io.IOException {
        /*
            r2 = this;
        L_0x0000:
            monitor-enter(r2)
            com.onedelhi.secure.vf4 r0 = r2.f37448a     // Catch:{ all -> 0x002b }
            com.onedelhi.secure.uf4 r0 = r0.mo46142e()     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0019
            boolean r0 = m70221i()     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x002b }
        L_0x0016:
            r0 = 1
            monitor-exit(r2)     // Catch:{ all -> 0x002b }
            return r0
        L_0x0019:
            monitor-exit(r2)     // Catch:{ all -> 0x002b }
            boolean r1 = r2.mo47154m(r0)
            if (r1 != 0) goto L_0x0022
            r0 = 0
            return r0
        L_0x0022:
            com.onedelhi.secure.vf4 r1 = r2.f37448a
            r1.mo46146i(r0)
            r2.mo47153l(r0)
            goto L_0x0000
        L_0x002b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.xf4.mo47161t():boolean");
    }

    /* renamed from: u */
    public void mo47162u(long j) {
        mo47155n(new yf4(this, this.f37444a, this.f37446a, Math.min(Math.max(30, 2 * j), f37443c)), j);
        mo47157p(true);
    }

    /* renamed from: v */
    public w94<Void> mo47163v(String str) {
        w94<Void> o = mo47156o(uf4.m67012g(str));
        mo47159r();
        return o;
    }
}
