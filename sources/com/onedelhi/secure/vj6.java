package com.onedelhi.secure;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class vj6 extends f66 {
    @mj1("activityLock")

    /* renamed from: a */
    public Activity f21832a;

    /* renamed from: a */
    public volatile fj6 f21833a;

    /* renamed from: a */
    public final Object f21834a = new Object();

    /* renamed from: a */
    public final Map f21835a = new ConcurrentHashMap();

    /* renamed from: b */
    public volatile fj6 f21836b;
    @mj1("activityLock")

    /* renamed from: b */
    public volatile boolean f21837b;
    @VisibleForTesting

    /* renamed from: c */
    public fj6 f21838c;
    @mj1("activityLock")

    /* renamed from: c */
    public boolean f21839c;

    /* renamed from: d */
    public volatile fj6 f21840d;

    /* renamed from: e */
    public fj6 f21841e;

    public vj6(za6 za6) {
        super(za6);
    }

    /* renamed from: w */
    public static /* bridge */ /* synthetic */ void m30185w(vj6 vj6, Bundle bundle, fj6 fj6, fj6 fj62, long j) {
        bundle.remove(FirebaseAnalytics.C4305d.f24981l0);
        bundle.remove(FirebaseAnalytics.C4305d.f24979k0);
        vj6.mo26146o(fj6, fj62, j, true, vj6.f11205a.mo27871N().mo16898x0((String) null, FirebaseAnalytics.C4304c.f24897A, bundle, (List) null, false));
    }

    @bc2
    /* renamed from: A */
    public final void mo26139A(Activity activity) {
        synchronized (this.f21834a) {
            this.f21839c = false;
            this.f21837b = true;
        }
        long elapsedRealtime = this.f11205a.mo15133a().elapsedRealtime();
        if (!this.f11205a.mo27891z().mo14112D()) {
            this.f21833a = null;
            this.f11205a.mo15135d().mo23065z(new pj6(this, elapsedRealtime));
            return;
        }
        fj6 F = mo26144F(activity);
        this.f21836b = this.f21833a;
        this.f21833a = null;
        this.f11205a.mo15135d().mo23065z(new rj6(this, F, elapsedRealtime));
    }

    @bc2
    /* renamed from: B */
    public final void mo26140B(Activity activity) {
        synchronized (this.f21834a) {
            this.f21839c = true;
            if (activity != this.f21832a) {
                synchronized (this.f21834a) {
                    this.f21832a = activity;
                    this.f21837b = false;
                }
                if (this.f11205a.mo27891z().mo14112D()) {
                    this.f21840d = null;
                    this.f11205a.mo15135d().mo23065z(new tj6(this));
                }
            }
        }
        if (!this.f11205a.mo27891z().mo14112D()) {
            this.f21833a = this.f21840d;
            this.f11205a.mo15135d().mo23065z(new nj6(this));
            return;
        }
        mo26145G(activity, mo26144F(activity), false);
        jx5 y = this.f11205a.mo27890y();
        y.f11205a.mo15135d().mo23065z(new es5(y, y.f11205a.mo15133a().elapsedRealtime()));
    }

    @bc2
    /* renamed from: C */
    public final void mo26141C(Activity activity, Bundle bundle) {
        fj6 fj6;
        if (this.f11205a.mo27891z().mo14112D() && bundle != null && (fj6 = (fj6) this.f21835a.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", fj6.f12097a);
            bundle2.putString("name", fj6.f12098a);
            bundle2.putString("referrer_name", fj6.f12101b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0088, code lost:
        if (r1 <= 100) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b4, code lost:
        if (r1 <= 100) goto L_0x00cf;
     */
    @java.lang.Deprecated
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo26142D(@com.onedelhi.secure.mr2 android.app.Activity r4, @com.onedelhi.secure.qz3(max = 36, min = 1) java.lang.String r5, @com.onedelhi.secure.qz3(max = 36, min = 1) java.lang.String r6) {
        /*
            r3 = this;
            com.onedelhi.secure.za6 r0 = r3.f11205a
            com.onedelhi.secure.ce5 r0 = r0.mo27891z()
            boolean r0 = r0.mo14112D()
            if (r0 != 0) goto L_0x001c
            com.onedelhi.secure.za6 r4 = r3.f11205a
            com.onedelhi.secure.a56 r4 = r4.mo15136e()
            com.onedelhi.secure.u46 r4 = r4.mo12732x()
            java.lang.String r5 = "setCurrentScreen cannot be called while screen reporting is disabled."
            r4.mo25379a(r5)
            return
        L_0x001c:
            com.onedelhi.secure.fj6 r0 = r3.f21833a
            if (r0 != 0) goto L_0x0030
            com.onedelhi.secure.za6 r4 = r3.f11205a
            com.onedelhi.secure.a56 r4 = r4.mo15136e()
            com.onedelhi.secure.u46 r4 = r4.mo12732x()
            java.lang.String r5 = "setCurrentScreen cannot be called while no activity active"
            r4.mo25379a(r5)
            return
        L_0x0030:
            java.util.Map r1 = r3.f21835a
            java.lang.Object r1 = r1.get(r4)
            if (r1 != 0) goto L_0x0048
            com.onedelhi.secure.za6 r4 = r3.f11205a
            com.onedelhi.secure.a56 r4 = r4.mo15136e()
            com.onedelhi.secure.u46 r4 = r4.mo12732x()
            java.lang.String r5 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            r4.mo25379a(r5)
            return
        L_0x0048:
            if (r6 != 0) goto L_0x0054
            java.lang.Class r6 = r4.getClass()
            java.lang.String r1 = "Activity"
            java.lang.String r6 = r3.mo26150t(r6, r1)
        L_0x0054:
            java.lang.String r1 = r0.f12101b
            boolean r1 = com.onedelhi.secure.hj6.m16828a(r1, r6)
            java.lang.String r0 = r0.f12098a
            boolean r0 = com.onedelhi.secure.hj6.m16828a(r0, r5)
            if (r1 == 0) goto L_0x0075
            if (r0 != 0) goto L_0x0065
            goto L_0x0075
        L_0x0065:
            com.onedelhi.secure.za6 r4 = r3.f11205a
            com.onedelhi.secure.a56 r4 = r4.mo15136e()
            com.onedelhi.secure.u46 r4 = r4.mo12732x()
            java.lang.String r5 = "setCurrentScreen cannot be called with the same class and name"
            r4.mo25379a(r5)
            return
        L_0x0075:
            r0 = 100
            if (r5 == 0) goto L_0x00a3
            int r1 = r5.length()
            if (r1 <= 0) goto L_0x008b
            int r1 = r5.length()
            com.onedelhi.secure.za6 r2 = r3.f11205a
            r2.mo27891z()
            if (r1 > r0) goto L_0x008b
            goto L_0x00a3
        L_0x008b:
            com.onedelhi.secure.za6 r4 = r3.f11205a
            com.onedelhi.secure.a56 r4 = r4.mo15136e()
            com.onedelhi.secure.u46 r4 = r4.mo12732x()
            int r5 = r5.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid screen name length in setCurrentScreen. Length"
            r4.mo25380b(r6, r5)
            return
        L_0x00a3:
            if (r6 == 0) goto L_0x00cf
            int r1 = r6.length()
            if (r1 <= 0) goto L_0x00b7
            int r1 = r6.length()
            com.onedelhi.secure.za6 r2 = r3.f11205a
            r2.mo27891z()
            if (r1 > r0) goto L_0x00b7
            goto L_0x00cf
        L_0x00b7:
            com.onedelhi.secure.za6 r4 = r3.f11205a
            com.onedelhi.secure.a56 r4 = r4.mo15136e()
            com.onedelhi.secure.u46 r4 = r4.mo12732x()
            int r5 = r6.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid class name length in setCurrentScreen. Length"
            r4.mo25380b(r6, r5)
            return
        L_0x00cf:
            com.onedelhi.secure.za6 r0 = r3.f11205a
            com.onedelhi.secure.a56 r0 = r0.mo15136e()
            com.onedelhi.secure.u46 r0 = r0.mo12730v()
            if (r5 != 0) goto L_0x00de
            java.lang.String r1 = "null"
            goto L_0x00df
        L_0x00de:
            r1 = r5
        L_0x00df:
            java.lang.String r2 = "Setting current screen to name, class"
            r0.mo25381c(r2, r1, r6)
            com.onedelhi.secure.fj6 r0 = new com.onedelhi.secure.fj6
            com.onedelhi.secure.za6 r1 = r3.f11205a
            com.onedelhi.secure.gr6 r1 = r1.mo27871N()
            long r1 = r1.mo16891t0()
            r0.<init>(r5, r6, r1)
            java.util.Map r5 = r3.f21835a
            r5.put(r4, r0)
            r5 = 1
            r3.mo26145G(r4, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.vj6.mo26142D(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r2 > 100) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0063, code lost:
        if (r4 > 100) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c1, code lost:
        r0 = r12.f11205a.mo15136e().mo12730v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00cb, code lost:
        if (r3 != null) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00cd, code lost:
        r1 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d0, code lost:
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d1, code lost:
        if (r4 != null) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d3, code lost:
        r2 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d6, code lost:
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d7, code lost:
        r0.mo25381c("Logging screen view with name, class", r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00de, code lost:
        if (r12.f21833a != null) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e0, code lost:
        r0 = r12.f21836b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e3, code lost:
        r0 = r12.f21833a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e5, code lost:
        r2 = new com.onedelhi.secure.fj6(r3, r4, r12.f11205a.mo27871N().mo16891t0(), true, r14);
        r12.f21833a = r2;
        r12.f21836b = r0;
        r12.f21840d = r2;
        r12.f11205a.mo15135d().mo23065z(new com.onedelhi.secure.jj6(r12, r13, r2, r0, r12.f11205a.mo15133a().elapsedRealtime()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x011a, code lost:
        return;
     */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo26143E(android.os.Bundle r13, long r14) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f21834a
            monitor-enter(r0)
            boolean r1 = r12.f21839c     // Catch:{ all -> 0x011b }
            if (r1 != 0) goto L_0x0018
            com.onedelhi.secure.za6 r13 = r12.f11205a     // Catch:{ all -> 0x011b }
            com.onedelhi.secure.a56 r13 = r13.mo15136e()     // Catch:{ all -> 0x011b }
            com.onedelhi.secure.u46 r13 = r13.mo12732x()     // Catch:{ all -> 0x011b }
            java.lang.String r14 = "Cannot log screen view event when the app is in the background."
            r13.mo25379a(r14)     // Catch:{ all -> 0x011b }
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            return
        L_0x0018:
            java.lang.String r1 = "screen_name"
            java.lang.String r3 = r13.getString(r1)     // Catch:{ all -> 0x011b }
            r1 = 100
            if (r3 == 0) goto L_0x004c
            int r2 = r3.length()     // Catch:{ all -> 0x011b }
            if (r2 <= 0) goto L_0x0033
            int r2 = r3.length()     // Catch:{ all -> 0x011b }
            com.onedelhi.secure.za6 r4 = r12.f11205a     // Catch:{ all -> 0x011b }
            r4.mo27891z()     // Catch:{ all -> 0x011b }
            if (r2 <= r1) goto L_0x004c
        L_0x0033:
            com.onedelhi.secure.za6 r13 = r12.f11205a     // Catch:{ all -> 0x011b }
            com.onedelhi.secure.a56 r13 = r13.mo15136e()     // Catch:{ all -> 0x011b }
            com.onedelhi.secure.u46 r13 = r13.mo12732x()     // Catch:{ all -> 0x011b }
            java.lang.String r14 = "Invalid screen name length for screen view. Length"
            int r15 = r3.length()     // Catch:{ all -> 0x011b }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x011b }
            r13.mo25380b(r14, r15)     // Catch:{ all -> 0x011b }
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            return
        L_0x004c:
            java.lang.String r2 = "screen_class"
            java.lang.String r2 = r13.getString(r2)     // Catch:{ all -> 0x011b }
            if (r2 == 0) goto L_0x007e
            int r4 = r2.length()     // Catch:{ all -> 0x011b }
            if (r4 <= 0) goto L_0x0065
            int r4 = r2.length()     // Catch:{ all -> 0x011b }
            com.onedelhi.secure.za6 r5 = r12.f11205a     // Catch:{ all -> 0x011b }
            r5.mo27891z()     // Catch:{ all -> 0x011b }
            if (r4 <= r1) goto L_0x007e
        L_0x0065:
            com.onedelhi.secure.za6 r13 = r12.f11205a     // Catch:{ all -> 0x011b }
            com.onedelhi.secure.a56 r13 = r13.mo15136e()     // Catch:{ all -> 0x011b }
            com.onedelhi.secure.u46 r13 = r13.mo12732x()     // Catch:{ all -> 0x011b }
            java.lang.String r14 = "Invalid screen class length for screen view. Length"
            int r15 = r2.length()     // Catch:{ all -> 0x011b }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x011b }
            r13.mo25380b(r14, r15)     // Catch:{ all -> 0x011b }
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            return
        L_0x007e:
            if (r2 != 0) goto L_0x0093
            android.app.Activity r1 = r12.f21832a     // Catch:{ all -> 0x011b }
            if (r1 == 0) goto L_0x008f
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x011b }
            java.lang.String r2 = "Activity"
            java.lang.String r1 = r12.mo26150t(r1, r2)     // Catch:{ all -> 0x011b }
            goto L_0x0091
        L_0x008f:
            java.lang.String r1 = "Activity"
        L_0x0091:
            r4 = r1
            goto L_0x0094
        L_0x0093:
            r4 = r2
        L_0x0094:
            com.onedelhi.secure.fj6 r1 = r12.f21833a     // Catch:{ all -> 0x011b }
            boolean r2 = r12.f21837b     // Catch:{ all -> 0x011b }
            if (r2 == 0) goto L_0x00c0
            if (r1 == 0) goto L_0x00c0
            r2 = 0
            r12.f21837b = r2     // Catch:{ all -> 0x011b }
            java.lang.String r2 = r1.f12101b     // Catch:{ all -> 0x011b }
            boolean r2 = com.onedelhi.secure.hj6.m16828a(r2, r4)     // Catch:{ all -> 0x011b }
            java.lang.String r1 = r1.f12098a     // Catch:{ all -> 0x011b }
            boolean r1 = com.onedelhi.secure.hj6.m16828a(r1, r3)     // Catch:{ all -> 0x011b }
            if (r2 == 0) goto L_0x00c0
            if (r1 == 0) goto L_0x00c0
            com.onedelhi.secure.za6 r13 = r12.f11205a     // Catch:{ all -> 0x011b }
            com.onedelhi.secure.a56 r13 = r13.mo15136e()     // Catch:{ all -> 0x011b }
            com.onedelhi.secure.u46 r13 = r13.mo12732x()     // Catch:{ all -> 0x011b }
            java.lang.String r14 = "Ignoring call to log screen view event with duplicate parameters."
            r13.mo25379a(r14)     // Catch:{ all -> 0x011b }
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            return
        L_0x00c0:
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            com.onedelhi.secure.za6 r0 = r12.f11205a
            com.onedelhi.secure.a56 r0 = r0.mo15136e()
            com.onedelhi.secure.u46 r0 = r0.mo12730v()
            if (r3 != 0) goto L_0x00d0
            java.lang.String r1 = "null"
            goto L_0x00d1
        L_0x00d0:
            r1 = r3
        L_0x00d1:
            if (r4 != 0) goto L_0x00d6
            java.lang.String r2 = "null"
            goto L_0x00d7
        L_0x00d6:
            r2 = r4
        L_0x00d7:
            java.lang.String r5 = "Logging screen view with name, class"
            r0.mo25381c(r5, r1, r2)
            com.onedelhi.secure.fj6 r0 = r12.f21833a
            if (r0 != 0) goto L_0x00e3
            com.onedelhi.secure.fj6 r0 = r12.f21836b
            goto L_0x00e5
        L_0x00e3:
            com.onedelhi.secure.fj6 r0 = r12.f21833a
        L_0x00e5:
            com.onedelhi.secure.fj6 r1 = new com.onedelhi.secure.fj6
            com.onedelhi.secure.za6 r2 = r12.f11205a
            com.onedelhi.secure.gr6 r2 = r2.mo27871N()
            long r5 = r2.mo16891t0()
            r7 = 1
            r2 = r1
            r8 = r14
            r2.<init>(r3, r4, r5, r7, r8)
            r12.f21833a = r1
            r12.f21836b = r0
            r12.f21840d = r1
            com.onedelhi.secure.za6 r14 = r12.f11205a
            com.google.android.gms.common.util.Clock r14 = r14.mo15133a()
            long r10 = r14.elapsedRealtime()
            com.onedelhi.secure.za6 r14 = r12.f11205a
            com.onedelhi.secure.qa6 r14 = r14.mo15135d()
            com.onedelhi.secure.jj6 r15 = new com.onedelhi.secure.jj6
            r5 = r15
            r6 = r12
            r7 = r13
            r8 = r1
            r9 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            r14.mo23065z(r15)
            return
        L_0x011b:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.vj6.mo26143E(android.os.Bundle, long):void");
    }

    @bc2
    /* renamed from: F */
    public final fj6 mo26144F(@mr2 Activity activity) {
        Preconditions.checkNotNull(activity);
        fj6 fj6 = (fj6) this.f21835a.get(activity);
        if (fj6 == null) {
            fj6 fj62 = new fj6((String) null, mo26150t(activity.getClass(), "Activity"), this.f11205a.mo27871N().mo16891t0());
            this.f21835a.put(activity, fj62);
            fj6 = fj62;
        }
        return this.f21840d != null ? this.f21840d : fj6;
    }

    @bc2
    /* renamed from: G */
    public final void mo26145G(Activity activity, fj6 fj6, boolean z) {
        fj6 fj62;
        fj6 fj63 = fj6;
        fj6 fj64 = this.f21833a == null ? this.f21836b : this.f21833a;
        if (fj63.f12101b == null) {
            fj62 = new fj6(fj63.f12098a, activity != null ? mo26150t(activity.getClass(), "Activity") : null, fj63.f12097a, fj63.f12102b, fj63.f12100b);
        } else {
            fj62 = fj63;
        }
        this.f21836b = this.f21833a;
        this.f21833a = fj62;
        this.f11205a.mo15135d().mo23065z(new lj6(this, fj62, fj64, this.f11205a.mo15133a().elapsedRealtime(), z));
    }

    /* renamed from: n */
    public final boolean mo15779n() {
        return false;
    }

    @ly4
    /* renamed from: o */
    public final void mo26146o(fj6 fj6, fj6 fj62, long j, boolean z, Bundle bundle) {
        Bundle bundle2;
        long j2;
        fj6 fj63 = fj6;
        fj6 fj64 = fj62;
        long j3 = j;
        Bundle bundle3 = bundle;
        mo15139h();
        boolean z2 = false;
        boolean z3 = fj64 == null || fj64.f12097a != fj63.f12097a || !hj6.m16828a(fj64.f12101b, fj63.f12101b) || !hj6.m16828a(fj64.f12098a, fj63.f12098a);
        if (z && this.f21838c != null) {
            z2 = true;
        }
        if (z3) {
            if (bundle3 == null) {
                bundle2 = new Bundle();
            }
            Bundle bundle4 = bundle2;
            gr6.m16187y(fj63, bundle4, true);
            if (fj64 != null) {
                String str = fj64.f12098a;
                if (str != null) {
                    bundle4.putString("_pn", str);
                }
                String str2 = fj64.f12101b;
                if (str2 != null) {
                    bundle4.putString("_pc", str2);
                }
                bundle4.putLong("_pi", fj64.f12097a);
            }
            if (z2) {
                jo6 jo6 = this.f11205a.mo27870M().f17507a;
                long j4 = j3 - jo6.f14362b;
                jo6.f14362b = j3;
                if (j4 > 0) {
                    this.f11205a.mo27871N().mo16895w(bundle4, j4);
                }
            }
            if (!this.f11205a.mo27891z().mo14112D()) {
                bundle4.putLong("_mst", 1);
            }
            String str3 = true != fj63.f12102b ? bf0.f26274c : FirebaseMessaging.f25020d;
            long currentTimeMillis = this.f11205a.mo15133a().currentTimeMillis();
            if (fj63.f12102b) {
                long j5 = fj63.f12100b;
                if (j5 != 0) {
                    j2 = j5;
                    this.f11205a.mo27866I().mo23911v(str3, "_vs", j2, bundle4);
                }
            }
            j2 = currentTimeMillis;
            this.f11205a.mo27866I().mo23911v(str3, "_vs", j2, bundle4);
        }
        if (z2) {
            mo26147p(this.f21838c, true, j3);
        }
        this.f21838c = fj63;
        if (fj63.f12102b) {
            this.f21841e = fj63;
        }
        this.f11205a.mo27869L().mo22016u(fj63);
    }

    @ly4
    /* renamed from: p */
    public final void mo26147p(fj6 fj6, boolean z, long j) {
        this.f11205a.mo27890y().mo18714n(this.f11205a.mo15133a().elapsedRealtime());
        if (this.f11205a.mo27870M().f17507a.mo18533d(fj6 != null && fj6.f12099a, z, j) && fj6 != null) {
            fj6.f12099a = false;
        }
    }

    /* renamed from: r */
    public final fj6 mo26148r() {
        return this.f21833a;
    }

    @ly4
    /* renamed from: s */
    public final fj6 mo26149s(boolean z) {
        mo15845i();
        mo15139h();
        if (!z) {
            return this.f21838c;
        }
        fj6 fj6 = this.f21838c;
        return fj6 != null ? fj6 : this.f21841e;
    }

    @VisibleForTesting
    /* renamed from: t */
    public final String mo26150t(Class cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        String str2 = length > 0 ? split[length - 1] : "";
        int length2 = str2.length();
        this.f11205a.mo27891z();
        if (length2 <= 100) {
            return str2;
        }
        this.f11205a.mo27891z();
        return str2.substring(0, 100);
    }

    @bc2
    /* renamed from: y */
    public final void mo26151y(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (this.f11205a.mo27891z().mo14112D() && bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.f21835a.put(activity, new fj6(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
        }
    }

    @bc2
    /* renamed from: z */
    public final void mo26152z(Activity activity) {
        synchronized (this.f21834a) {
            if (activity == this.f21832a) {
                this.f21832a = null;
            }
        }
        if (this.f11205a.mo27891z().mo14112D()) {
            this.f21835a.remove(activity);
        }
    }
}
