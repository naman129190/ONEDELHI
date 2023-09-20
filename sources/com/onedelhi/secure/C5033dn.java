package com.onedelhi.secure;

import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.onedelhi.secure.dn */
public class C5033dn implements C5663i5, C5479h5 {

    /* renamed from: a */
    public static final String f27504a = "_ae";

    /* renamed from: a */
    public final int f27505a;

    /* renamed from: a */
    public final na0 f27506a;

    /* renamed from: a */
    public final Object f27507a = new Object();

    /* renamed from: a */
    public CountDownLatch f27508a;

    /* renamed from: a */
    public final TimeUnit f27509a;

    /* renamed from: a */
    public boolean f27510a = false;

    public C5033dn(@mr2 na0 na0, int i, TimeUnit timeUnit) {
        this.f27506a = na0;
        this.f27505a = i;
        this.f27509a = timeUnit;
    }

    /* renamed from: W */
    public void mo34506W(@mr2 String str, @mr2 Bundle bundle) {
        CountDownLatch countDownLatch = this.f27508a;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        com.onedelhi.secure.o92.m59120f().mo41615d("Interrupted while awaiting app exception callback from Analytics listener.");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x005f */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo34224a(@com.onedelhi.secure.mr2 java.lang.String r6, @com.onedelhi.secure.ts2 android.os.Bundle r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f27507a
            monitor-enter(r0)
            com.onedelhi.secure.o92 r1 = com.onedelhi.secure.o92.m59120f()     // Catch:{ all -> 0x006d }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x006d }
            r2.<init>()     // Catch:{ all -> 0x006d }
            java.lang.String r3 = "Logging event "
            r2.append(r3)     // Catch:{ all -> 0x006d }
            r2.append(r6)     // Catch:{ all -> 0x006d }
            java.lang.String r3 = " to Firebase Analytics with params "
            r2.append(r3)     // Catch:{ all -> 0x006d }
            r2.append(r7)     // Catch:{ all -> 0x006d }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x006d }
            r1.mo41621k(r2)     // Catch:{ all -> 0x006d }
            java.util.concurrent.CountDownLatch r1 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x006d }
            r2 = 1
            r1.<init>(r2)     // Catch:{ all -> 0x006d }
            r5.f27508a = r1     // Catch:{ all -> 0x006d }
            r1 = 0
            r5.f27510a = r1     // Catch:{ all -> 0x006d }
            com.onedelhi.secure.na0 r1 = r5.f27506a     // Catch:{ all -> 0x006d }
            r1.mo34224a(r6, r7)     // Catch:{ all -> 0x006d }
            com.onedelhi.secure.o92 r6 = com.onedelhi.secure.o92.m59120f()     // Catch:{ all -> 0x006d }
            java.lang.String r7 = "Awaiting app exception callback from Analytics..."
            r6.mo41621k(r7)     // Catch:{ all -> 0x006d }
            java.util.concurrent.CountDownLatch r6 = r5.f27508a     // Catch:{ InterruptedException -> 0x005f }
            int r7 = r5.f27505a     // Catch:{ InterruptedException -> 0x005f }
            long r3 = (long) r7     // Catch:{ InterruptedException -> 0x005f }
            java.util.concurrent.TimeUnit r7 = r5.f27509a     // Catch:{ InterruptedException -> 0x005f }
            boolean r6 = r6.await(r3, r7)     // Catch:{ InterruptedException -> 0x005f }
            if (r6 == 0) goto L_0x0055
            r5.f27510a = r2     // Catch:{ InterruptedException -> 0x005f }
            com.onedelhi.secure.o92 r6 = com.onedelhi.secure.o92.m59120f()     // Catch:{ InterruptedException -> 0x005f }
            java.lang.String r7 = "App exception callback received from Analytics listener."
            r6.mo41621k(r7)     // Catch:{ InterruptedException -> 0x005f }
            goto L_0x0068
        L_0x0055:
            com.onedelhi.secure.o92 r6 = com.onedelhi.secure.o92.m59120f()     // Catch:{ InterruptedException -> 0x005f }
            java.lang.String r7 = "Timeout exceeded while awaiting app exception callback from Analytics listener."
            r6.mo41623m(r7)     // Catch:{ InterruptedException -> 0x005f }
            goto L_0x0068
        L_0x005f:
            com.onedelhi.secure.o92 r6 = com.onedelhi.secure.o92.m59120f()     // Catch:{ all -> 0x006d }
            java.lang.String r7 = "Interrupted while awaiting app exception callback from Analytics listener."
            r6.mo41615d(r7)     // Catch:{ all -> 0x006d }
        L_0x0068:
            r6 = 0
            r5.f27508a = r6     // Catch:{ all -> 0x006d }
            monitor-exit(r0)     // Catch:{ all -> 0x006d }
            return
        L_0x006d:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006d }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C5033dn.mo34224a(java.lang.String, android.os.Bundle):void");
    }

    /* renamed from: b */
    public boolean mo34507b() {
        return this.f27510a;
    }
}
