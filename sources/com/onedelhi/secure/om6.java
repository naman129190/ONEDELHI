package com.onedelhi.secure;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@VisibleForTesting
public final class om6 extends f66 {

    /* renamed from: a */
    public final mm6 f18020a;

    /* renamed from: a */
    public final po6 f18021a;

    /* renamed from: a */
    public final th5 f18022a;

    /* renamed from: a */
    public w36 f18023a;

    /* renamed from: a */
    public volatile Boolean f18024a;

    /* renamed from: a */
    public final List f18025a = new ArrayList();

    /* renamed from: b */
    public final th5 f18026b;

    public om6(za6 za6) {
        super(za6);
        this.f18021a = new po6(za6.mo15133a());
        this.f18020a = new mm6(this);
        this.f18022a = new il6(this, za6);
        this.f18026b = new ml6(this, za6);
    }

    /* renamed from: M */
    public static /* bridge */ /* synthetic */ void m23882M(om6 om6, ComponentName componentName) {
        om6.mo15139h();
        if (om6.f18023a != null) {
            om6.f18023a = null;
            om6.f11205a.mo15136e().mo12730v().mo25380b("Disconnected from device MeasurementService", componentName);
            om6.mo15139h();
            om6.mo22001P();
        }
    }

    @ly4
    /* renamed from: A */
    public final boolean mo21992A() {
        mo15139h();
        mo15845i();
        return !mo21993B() || this.f11205a.mo27871N().mo16887q0() >= ((Integer) n36.f17060h0.mo18887a((Object) null)).intValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0123  */
    @com.onedelhi.secure.ly4
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo21993B() {
        /*
            r6 = this;
            r6.mo15139h()
            r6.mo15845i()
            java.lang.Boolean r0 = r6.f18024a
            if (r0 != 0) goto L_0x0143
            r6.mo15139h()
            r6.mo15845i()
            com.onedelhi.secure.za6 r0 = r6.f11205a
            com.onedelhi.secure.q76 r0 = r0.mo27864F()
            r0.mo15139h()
            android.content.SharedPreferences r1 = r0.mo22924o()
            java.lang.String r2 = "use_service"
            boolean r1 = r1.contains(r2)
            r3 = 0
            if (r1 != 0) goto L_0x0028
            r0 = 0
            goto L_0x0034
        L_0x0028:
            android.content.SharedPreferences r0 = r0.mo22924o()
            boolean r0 = r0.getBoolean(r2, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0034:
            r1 = 1
            if (r0 == 0) goto L_0x003f
            boolean r4 = r0.booleanValue()
            if (r4 == 0) goto L_0x003f
            goto L_0x013d
        L_0x003f:
            com.onedelhi.secure.za6 r4 = r6.f11205a
            r4.mo15134c()
            com.onedelhi.secure.za6 r4 = r6.f11205a
            com.onedelhi.secure.z36 r4 = r4.mo27860B()
            int r4 = r4.mo27791o()
            if (r4 != r1) goto L_0x0053
        L_0x0050:
            r3 = 1
            goto L_0x0105
        L_0x0053:
            com.onedelhi.secure.za6 r4 = r6.f11205a
            com.onedelhi.secure.a56 r4 = r4.mo15136e()
            com.onedelhi.secure.u46 r4 = r4.mo12730v()
            java.lang.String r5 = "Checking service availability"
            r4.mo25379a(r5)
            com.onedelhi.secure.za6 r4 = r6.f11205a
            com.onedelhi.secure.gr6 r4 = r4.mo27871N()
            r5 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r4 = r4.mo16889r0(r5)
            if (r4 == 0) goto L_0x00f4
            if (r4 == r1) goto L_0x00e4
            r5 = 2
            if (r4 == r5) goto L_0x00c0
            r0 = 3
            if (r4 == r0) goto L_0x00af
            r0 = 9
            if (r4 == r0) goto L_0x00a2
            r0 = 18
            if (r4 == r0) goto L_0x0095
            com.onedelhi.secure.za6 r0 = r6.f11205a
            com.onedelhi.secure.a56 r0 = r0.mo15136e()
            com.onedelhi.secure.u46 r0 = r0.mo12731w()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.String r4 = "Unexpected service status"
            r0.mo25380b(r4, r1)
            goto L_0x00be
        L_0x0095:
            com.onedelhi.secure.za6 r0 = r6.f11205a
            com.onedelhi.secure.a56 r0 = r0.mo15136e()
            com.onedelhi.secure.u46 r0 = r0.mo12731w()
            java.lang.String r3 = "Service updating"
            goto L_0x0100
        L_0x00a2:
            com.onedelhi.secure.za6 r0 = r6.f11205a
            com.onedelhi.secure.a56 r0 = r0.mo15136e()
            com.onedelhi.secure.u46 r0 = r0.mo12731w()
            java.lang.String r1 = "Service invalid"
            goto L_0x00bb
        L_0x00af:
            com.onedelhi.secure.za6 r0 = r6.f11205a
            com.onedelhi.secure.a56 r0 = r0.mo15136e()
            com.onedelhi.secure.u46 r0 = r0.mo12731w()
            java.lang.String r1 = "Service disabled"
        L_0x00bb:
            r0.mo25379a(r1)
        L_0x00be:
            r1 = 0
            goto L_0x0105
        L_0x00c0:
            com.onedelhi.secure.za6 r4 = r6.f11205a
            com.onedelhi.secure.a56 r4 = r4.mo15136e()
            com.onedelhi.secure.u46 r4 = r4.mo12725q()
            java.lang.String r5 = "Service container out of date"
            r4.mo25379a(r5)
            com.onedelhi.secure.za6 r4 = r6.f11205a
            com.onedelhi.secure.gr6 r4 = r4.mo27871N()
            int r4 = r4.mo16887q0()
            r5 = 17443(0x4423, float:2.4443E-41)
            if (r4 >= r5) goto L_0x00de
            goto L_0x0105
        L_0x00de:
            if (r0 != 0) goto L_0x00e1
            goto L_0x00e2
        L_0x00e1:
            r1 = 0
        L_0x00e2:
            r3 = r1
            goto L_0x00be
        L_0x00e4:
            com.onedelhi.secure.za6 r0 = r6.f11205a
            com.onedelhi.secure.a56 r0 = r0.mo15136e()
            com.onedelhi.secure.u46 r0 = r0.mo12730v()
            java.lang.String r4 = "Service missing"
            r0.mo25379a(r4)
            goto L_0x0105
        L_0x00f4:
            com.onedelhi.secure.za6 r0 = r6.f11205a
            com.onedelhi.secure.a56 r0 = r0.mo15136e()
            com.onedelhi.secure.u46 r0 = r0.mo12730v()
            java.lang.String r3 = "Service available"
        L_0x0100:
            r0.mo25379a(r3)
            goto L_0x0050
        L_0x0105:
            if (r3 != 0) goto L_0x0123
            com.onedelhi.secure.za6 r0 = r6.f11205a
            com.onedelhi.secure.ce5 r0 = r0.mo27891z()
            boolean r0 = r0.mo14115G()
            if (r0 == 0) goto L_0x0123
            com.onedelhi.secure.za6 r0 = r6.f11205a
            com.onedelhi.secure.a56 r0 = r0.mo15136e()
            com.onedelhi.secure.u46 r0 = r0.mo12726r()
            java.lang.String r1 = "No way to upload. Consider using the full version of Analytics"
            r0.mo25379a(r1)
            goto L_0x013c
        L_0x0123:
            if (r1 == 0) goto L_0x013c
            com.onedelhi.secure.za6 r0 = r6.f11205a
            com.onedelhi.secure.q76 r0 = r0.mo27864F()
            r0.mo15139h()
            android.content.SharedPreferences r0 = r0.mo22924o()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putBoolean(r2, r3)
            r0.apply()
        L_0x013c:
            r1 = r3
        L_0x013d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r6.f18024a = r0
        L_0x0143:
            java.lang.Boolean r0 = r6.f18024a
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.om6.mo21993B():boolean");
    }

    @ly4
    /* renamed from: C */
    public final uy6 mo21994C(boolean z) {
        Pair a;
        this.f11205a.mo15134c();
        z36 B = this.f11205a.mo27860B();
        String str = null;
        if (z) {
            a56 e = this.f11205a.mo15136e();
            if (!(e.f11205a.mo27864F().f18944a == null || (a = e.f11205a.mo27864F().f18944a.mo18943a()) == null || a == q76.f18939a)) {
                str = String.valueOf(a.second) + ar4.f25981a + ((String) a.first);
            }
        }
        return B.mo27793q(str);
    }

    @ly4
    /* renamed from: D */
    public final void mo21995D() {
        mo15139h();
        this.f11205a.mo15136e().mo12730v().mo25380b("Processing queued up service tasks", Integer.valueOf(this.f18025a.size()));
        for (Runnable run : this.f18025a) {
            try {
                run.run();
            } catch (RuntimeException e) {
                this.f11205a.mo15136e().mo12726r().mo25380b("Task exception while flushing queue", e);
            }
        }
        this.f18025a.clear();
        this.f18026b.mo25025b();
    }

    @ly4
    /* renamed from: E */
    public final void mo21996E() {
        mo15139h();
        this.f18021a.mo22529b();
        th5 th5 = this.f18022a;
        this.f11205a.mo27891z();
        th5.mo25026d(((Long) n36.f17026J.mo18887a((Object) null)).longValue());
    }

    @ly4
    /* renamed from: F */
    public final void mo21997F(Runnable runnable) throws IllegalStateException {
        mo15139h();
        if (mo22021z()) {
            runnable.run();
            return;
        }
        this.f11205a.mo27891z();
        if (((long) this.f18025a.size()) >= 1000) {
            this.f11205a.mo15136e().mo12726r().mo25379a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.f18025a.add(runnable);
        this.f18026b.mo25026d(jg3.f30769e);
        mo22001P();
    }

    /* renamed from: G */
    public final boolean mo21998G() {
        this.f11205a.mo15134c();
        return true;
    }

    /* renamed from: J */
    public final Boolean mo21999J() {
        return this.f18024a;
    }

    @ly4
    /* renamed from: O */
    public final void mo22000O() {
        mo15139h();
        mo15845i();
        uy6 C = mo21994C(true);
        this.f11205a.mo27861C().mo15783r();
        mo21997F(new cl6(this, C));
    }

    @ly4
    /* renamed from: P */
    public final void mo22001P() {
        mo15139h();
        mo15845i();
        if (!mo22021z()) {
            if (mo21993B()) {
                this.f18020a.mo20533c();
            } else if (!this.f11205a.mo27891z().mo14115G()) {
                this.f11205a.mo15134c();
                List<ResolveInfo> queryIntentServices = this.f11205a.mo15137f().getPackageManager().queryIntentServices(new Intent().setClassName(this.f11205a.mo15137f(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                    this.f11205a.mo15136e().mo12726r().mo25379a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                    return;
                }
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                Context f = this.f11205a.mo15137f();
                this.f11205a.mo15134c();
                intent.setComponent(new ComponentName(f, "com.google.android.gms.measurement.AppMeasurementService"));
                this.f18020a.mo20532b(intent);
            }
        }
    }

    @ly4
    /* renamed from: Q */
    public final void mo22002Q() {
        mo15139h();
        mo15845i();
        this.f18020a.mo20534d();
        try {
            ConnectionTracker.getInstance().unbindService(this.f11205a.mo15137f(), this.f18020a);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f18023a = null;
    }

    @ly4
    /* renamed from: R */
    public final void mo22003R(pt5 pt5) {
        mo15139h();
        mo15845i();
        mo21997F(new al6(this, mo21994C(false), pt5));
    }

    @ly4
    /* renamed from: S */
    public final void mo22004S(AtomicReference atomicReference) {
        mo15139h();
        mo15845i();
        mo21997F(new yk6(this, atomicReference, mo21994C(false)));
    }

    @ly4
    /* renamed from: T */
    public final void mo22005T(pt5 pt5, String str, String str2) {
        mo15139h();
        mo15845i();
        mo21997F(new yl6(this, str, str2, mo21994C(false), pt5));
    }

    @ly4
    /* renamed from: U */
    public final void mo22006U(AtomicReference atomicReference, String str, String str2, String str3) {
        mo15139h();
        mo15845i();
        mo21997F(new wl6(this, atomicReference, (String) null, str2, str3, mo21994C(false)));
    }

    @ly4
    /* renamed from: V */
    public final void mo22007V(AtomicReference atomicReference, boolean z) {
        mo15139h();
        mo15845i();
        mo21997F(new zj6(this, atomicReference, mo21994C(false), z));
    }

    @ly4
    /* renamed from: W */
    public final void mo22008W(pt5 pt5, String str, String str2, boolean z) {
        mo15139h();
        mo15845i();
        mo21997F(new xj6(this, str, str2, mo21994C(false), z, pt5));
    }

    @ly4
    /* renamed from: X */
    public final void mo22009X(AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        mo15139h();
        mo15845i();
        mo21997F(new am6(this, atomicReference, (String) null, str2, str3, mo21994C(false), z));
    }

    /* renamed from: n */
    public final boolean mo15779n() {
        return false;
    }

    @ly4
    /* renamed from: o */
    public final void mo22010o(xj5 xj5, String str) {
        Preconditions.checkNotNull(xj5);
        mo15139h();
        mo15845i();
        mo21998G();
        mo21997F(new sl6(this, true, mo21994C(true), this.f11205a.mo27861C().mo15787v(xj5), xj5, str));
    }

    @ly4
    /* renamed from: p */
    public final void mo22011p(pt5 pt5, xj5 xj5, String str) {
        mo15139h();
        mo15845i();
        if (this.f11205a.mo27871N().mo16889r0(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE) != 0) {
            this.f11205a.mo15136e().mo12731w().mo25379a("Not bundling data. Service unavailable or out of date");
            this.f11205a.mo27871N().mo16857H(pt5, new byte[0]);
            return;
        }
        mo21997F(new kl6(this, xj5, str, pt5));
    }

    @ly4
    /* renamed from: q */
    public final void mo22012q() {
        mo15139h();
        mo15845i();
        uy6 C = mo21994C(false);
        mo21998G();
        this.f11205a.mo27861C().mo15782q();
        mo21997F(new wk6(this, C));
    }

    @VisibleForTesting
    @ly4
    /* renamed from: r */
    public final void mo22013r(w36 w36, AbstractSafeParcelable abstractSafeParcelable, uy6 uy6) {
        int i;
        int i2;
        u46 r;
        String str;
        mo15139h();
        mo15845i();
        mo21998G();
        this.f11205a.mo27891z();
        int i3 = 0;
        int i4 = 100;
        while (i3 < 1001 && i4 == 100) {
            ArrayList arrayList = new ArrayList();
            List p = this.f11205a.mo27861C().mo15781p(100);
            if (p != null) {
                arrayList.addAll(p);
                i = p.size();
            } else {
                i = 0;
            }
            if (abstractSafeParcelable != null && i < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size = arrayList.size();
            for (i2 = 0; i2 < size; i2++) {
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) arrayList.get(i2);
                if (abstractSafeParcelable2 instanceof xj5) {
                    try {
                        w36.mo13649T0((xj5) abstractSafeParcelable2, uy6);
                    } catch (RemoteException e) {
                        e = e;
                        r = this.f11205a.mo15136e().mo12726r();
                        str = "Failed to send event to the service";
                    }
                } else if (abstractSafeParcelable2 instanceof wq6) {
                    try {
                        w36.mo13642B2((wq6) abstractSafeParcelable2, uy6);
                    } catch (RemoteException e2) {
                        e = e2;
                        r = this.f11205a.mo15136e().mo12726r();
                        str = "Failed to send user property to the service";
                    }
                } else if (abstractSafeParcelable2 instanceof fc5) {
                    try {
                        w36.mo13664u3((fc5) abstractSafeParcelable2, uy6);
                    } catch (RemoteException e3) {
                        e = e3;
                        r = this.f11205a.mo15136e().mo12726r();
                        str = "Failed to send conditional user property to the service";
                    }
                } else {
                    this.f11205a.mo15136e().mo12726r().mo25379a("Discarding data. Unrecognized parcel type.");
                }
            }
            i3++;
            i4 = i;
        }
        return;
        r.mo25380b(str, e);
    }

    @ly4
    /* renamed from: s */
    public final void mo22014s(fc5 fc5) {
        Preconditions.checkNotNull(fc5);
        mo15139h();
        mo15845i();
        this.f11205a.mo15134c();
        mo21997F(new ul6(this, true, mo21994C(true), this.f11205a.mo27861C().mo15786u(fc5), new fc5(fc5), fc5));
    }

    @ly4
    /* renamed from: t */
    public final void mo22015t(boolean z) {
        mo15139h();
        mo15845i();
        if (z) {
            mo21998G();
            this.f11205a.mo27861C().mo15782q();
        }
        if (mo21992A()) {
            mo21997F(new ql6(this, mo21994C(false)));
        }
    }

    @ly4
    /* renamed from: u */
    public final void mo22016u(fj6 fj6) {
        mo15139h();
        mo15845i();
        mo21997F(new el6(this, fj6));
    }

    @ly4
    /* renamed from: v */
    public final void mo22017v(Bundle bundle) {
        mo15139h();
        mo15845i();
        mo21997F(new gl6(this, mo21994C(false), bundle));
    }

    @ly4
    /* renamed from: w */
    public final void mo22018w() {
        mo15139h();
        mo15845i();
        mo21997F(new ol6(this, mo21994C(true)));
    }

    @VisibleForTesting
    @ly4
    /* renamed from: x */
    public final void mo22019x(w36 w36) {
        mo15139h();
        Preconditions.checkNotNull(w36);
        this.f18023a = w36;
        mo21996E();
        mo21995D();
    }

    @ly4
    /* renamed from: y */
    public final void mo22020y(wq6 wq6) {
        mo15139h();
        mo15845i();
        mo21998G();
        mo21997F(new uk6(this, mo21994C(true), this.f11205a.mo27861C().mo15788w(wq6), wq6));
    }

    @ly4
    /* renamed from: z */
    public final boolean mo22021z() {
        mo15139h();
        mo15845i();
        return this.f18023a != null;
    }
}
