package com.onedelhi.secure;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.FirebaseMessaging;
import com.onedelhi.secure.C1767b9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class ri6 extends f66 {
    @mj1("consentLock")

    /* renamed from: a */
    public int f19885a = 100;

    /* renamed from: a */
    public long f19886a = -1;

    /* renamed from: a */
    public final er6 f19887a = new ah6(this);
    @VisibleForTesting

    /* renamed from: a */
    public pi6 f19888a;

    /* renamed from: a */
    public final s17 f19889a;

    /* renamed from: a */
    public ue6 f19890a;
    @mj1("consentLock")

    /* renamed from: a */
    public ye5 f19891a = new ye5((Boolean) null, (Boolean) null);

    /* renamed from: a */
    public final Object f19892a = new Object();

    /* renamed from: a */
    public final Set f19893a = new CopyOnWriteArraySet();

    /* renamed from: a */
    public final AtomicLong f19894a = new AtomicLong(0);

    /* renamed from: a */
    public final AtomicReference f19895a = new AtomicReference();

    /* renamed from: b */
    public int f19896b = 100;

    /* renamed from: b */
    public boolean f19897b;
    @VisibleForTesting

    /* renamed from: c */
    public boolean f19898c = true;

    public ri6(za6 za6) {
        super(za6);
        this.f19889a = new s17(za6);
    }

    /* renamed from: c0 */
    public static /* bridge */ /* synthetic */ void m26787c0(ri6 ri6, ye5 ye5, ye5 ye52) {
        boolean z;
        ne5[] ne5Arr = {ne5.ANALYTICS_STORAGE, ne5.AD_STORAGE};
        int i = 0;
        while (true) {
            if (i >= 2) {
                z = false;
                break;
            }
            ne5 ne5 = ne5Arr[i];
            if (!ye52.mo27438i(ne5) && ye5.mo27438i(ne5)) {
                z = true;
                break;
            }
            i++;
        }
        boolean l = ye5.mo27440l(ye52, ne5.ANALYTICS_STORAGE, ne5.AD_STORAGE);
        if (z || l) {
            ri6.f11205a.mo27860B().mo27798v();
        }
    }

    /* renamed from: d0 */
    public static /* synthetic */ void m26788d0(ri6 ri6, ye5 ye5, int i, long j, boolean z, boolean z2) {
        ri6.mo15139h();
        ri6.mo15845i();
        if (j > ri6.f19886a || !ye5.m32307j(ri6.f19896b, i)) {
            q76 F = ri6.f11205a.mo27864F();
            za6 za6 = F.f11205a;
            F.mo15139h();
            if (F.mo22932w(i)) {
                SharedPreferences.Editor edit = F.mo22924o().edit();
                edit.putString("consent_settings", ye5.mo27436h());
                edit.putInt("consent_source", i);
                edit.apply();
                ri6.f19886a = j;
                ri6.f19896b = i;
                ri6.f11205a.mo27869L().mo22015t(z);
                if (z2) {
                    ri6.f11205a.mo27869L().mo22004S(new AtomicReference());
                    return;
                }
                return;
            }
            ri6.f11205a.mo15136e().mo12729u().mo25380b("Lower precedence consent source ignored, proposed source", Integer.valueOf(i));
            return;
        }
        ri6.f11205a.mo15136e().mo12729u().mo25380b("Dropped out-of-date consent setting, proposed settings", ye5);
    }

    /* renamed from: A */
    public final void mo23875A(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        this.f11205a.mo15135d().mo23065z(new yf6(this, str, str2, j, bundle2, z, z2, z3, str3));
    }

    /* renamed from: B */
    public final void mo23876B(String str, String str2, long j, Object obj) {
        this.f11205a.mo15135d().mo23065z(new bg6(this, str, str2, obj, j));
    }

    /* renamed from: C */
    public final void mo23877C(String str) {
        this.f19895a.set(str);
    }

    /* renamed from: D */
    public final void mo23878D(Bundle bundle) {
        mo23879E(bundle, this.f11205a.mo15133a().currentTimeMillis());
    }

    /* renamed from: E */
    public final void mo23879E(Bundle bundle, long j) {
        Class<Long> cls = Long.class;
        Class<String> cls2 = String.class;
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.f11205a.mo15136e().mo12731w().mo25379a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Preconditions.checkNotNull(bundle2);
        nd6.m22703a(bundle2, "app_id", cls2, (Object) null);
        nd6.m22703a(bundle2, "origin", cls2, (Object) null);
        nd6.m22703a(bundle2, "name", cls2, (Object) null);
        nd6.m22703a(bundle2, "value", Object.class, (Object) null);
        nd6.m22703a(bundle2, C1767b9.C1768a.f9755d, cls2, (Object) null);
        nd6.m22703a(bundle2, C1767b9.C1768a.f9756e, cls, 0L);
        nd6.m22703a(bundle2, C1767b9.C1768a.f9757f, cls2, (Object) null);
        nd6.m22703a(bundle2, C1767b9.C1768a.f9758g, Bundle.class, (Object) null);
        nd6.m22703a(bundle2, C1767b9.C1768a.f9759h, cls2, (Object) null);
        nd6.m22703a(bundle2, C1767b9.C1768a.f9760i, Bundle.class, (Object) null);
        nd6.m22703a(bundle2, C1767b9.C1768a.f9761j, cls, 0L);
        nd6.m22703a(bundle2, C1767b9.C1768a.f9762k, cls2, (Object) null);
        nd6.m22703a(bundle2, C1767b9.C1768a.f9763l, Bundle.class, (Object) null);
        Preconditions.checkNotEmpty(bundle2.getString("name"));
        Preconditions.checkNotEmpty(bundle2.getString("origin"));
        Preconditions.checkNotNull(bundle2.get("value"));
        bundle2.putLong(C1767b9.C1768a.f9764m, j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (this.f11205a.mo27871N().mo16885p0(string) != 0) {
            this.f11205a.mo15136e().mo12726r().mo25380b("Invalid conditional user property name", this.f11205a.mo27862D().mo19282f(string));
        } else if (this.f11205a.mo27871N().mo16879l0(string, obj) == 0) {
            Object p = this.f11205a.mo27871N().mo16884p(string, obj);
            if (p == null) {
                this.f11205a.mo15136e().mo12726r().mo25381c("Unable to normalize conditional user property value", this.f11205a.mo27862D().mo19282f(string), obj);
                return;
            }
            nd6.m22704b(bundle2, p);
            long j2 = bundle2.getLong(C1767b9.C1768a.f9756e);
            if (!TextUtils.isEmpty(bundle2.getString(C1767b9.C1768a.f9755d))) {
                this.f11205a.mo27891z();
                if (j2 > 15552000000L || j2 < 1) {
                    this.f11205a.mo15136e().mo12726r().mo25381c("Invalid conditional user property timeout", this.f11205a.mo27862D().mo19282f(string), Long.valueOf(j2));
                    return;
                }
            }
            long j3 = bundle2.getLong(C1767b9.C1768a.f9761j);
            this.f11205a.mo27891z();
            if (j3 > 15552000000L || j3 < 1) {
                this.f11205a.mo15136e().mo12726r().mo25381c("Invalid conditional user property time to live", this.f11205a.mo27862D().mo19282f(string), Long.valueOf(j3));
            } else {
                this.f11205a.mo15135d().mo23065z(new kg6(this, bundle2));
            }
        } else {
            this.f11205a.mo15136e().mo12726r().mo25381c("Invalid conditional user property value", this.f11205a.mo27862D().mo19282f(string), obj);
        }
    }

    /* renamed from: F */
    public final void mo23880F(Bundle bundle, int i, long j) {
        mo15845i();
        String g = ye5.m32306g(bundle);
        if (g != null) {
            this.f11205a.mo15136e().mo12732x().mo25380b("Ignoring invalid consent setting", g);
            this.f11205a.mo15136e().mo12732x().mo25379a("Valid consent values are 'granted', 'denied'");
        }
        mo23881G(ye5.m32304a(bundle), i, j);
    }

    /* renamed from: G */
    public final void mo23881G(ye5 ye5, int i, long j) {
        ye5 ye52;
        boolean z;
        boolean z2;
        boolean z3;
        ye5 ye53 = ye5;
        int i2 = i;
        mo15845i();
        if (i2 != -10 && ye5.mo27433e() == null && ye5.mo27435f() == null) {
            this.f11205a.mo15136e().mo12732x().mo25379a("Discarding empty consent settings");
            return;
        }
        synchronized (this.f19892a) {
            ye52 = this.f19891a;
            z = true;
            z2 = false;
            if (ye5.m32307j(i2, this.f19885a)) {
                boolean k = ye53.mo27439k(this.f19891a);
                ne5 ne5 = ne5.ANALYTICS_STORAGE;
                if (ye53.mo27438i(ne5) && !this.f19891a.mo27438i(ne5)) {
                    z2 = true;
                }
                ye53 = ye53.mo27432d(this.f19891a);
                this.f19891a = ye53;
                this.f19885a = i2;
                z3 = z2;
                z2 = k;
            } else {
                z = false;
                z3 = false;
            }
        }
        if (!z) {
            this.f11205a.mo15136e().mo12729u().mo25380b("Ignoring lower-priority consent settings, proposed settings", ye53);
            return;
        }
        long andIncrement = this.f19894a.getAndIncrement();
        if (z2) {
            this.f19895a.set((Object) null);
            this.f11205a.mo15135d().mo23058A(new hi6(this, ye53, j, i, andIncrement, z3, ye52));
            return;
        }
        ji6 ji6 = new ji6(this, ye53, i, andIncrement, z3, ye52);
        if (i2 == 30 || i2 == -10) {
            this.f11205a.mo15135d().mo23058A(ji6);
        } else {
            this.f11205a.mo15135d().mo23065z(ji6);
        }
    }

    @ly4
    /* renamed from: H */
    public final void mo23882H(ue6 ue6) {
        ue6 ue62;
        mo15139h();
        mo15845i();
        if (!(ue6 == null || ue6 == (ue62 = this.f19890a))) {
            Preconditions.checkState(ue62 == null, "EventInterceptor already set.");
        }
        this.f19890a = ue6;
    }

    /* renamed from: I */
    public final void mo23883I(Boolean bool) {
        mo15845i();
        this.f11205a.mo15135d().mo23065z(new fi6(this, bool));
    }

    @ly4
    /* renamed from: J */
    public final void mo23884J(ye5 ye5) {
        mo15139h();
        boolean z = (ye5.mo27438i(ne5.ANALYTICS_STORAGE) && ye5.mo27438i(ne5.AD_STORAGE)) || this.f11205a.mo27869L().mo21992A();
        if (z != this.f11205a.mo27885p()) {
            this.f11205a.mo27881l(z);
            q76 F = this.f11205a.mo27864F();
            za6 za6 = F.f11205a;
            F.mo15139h();
            Boolean valueOf = F.mo22924o().contains("measurement_enabled_from_api") ? Boolean.valueOf(F.mo22924o().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || valueOf == null || valueOf.booleanValue()) {
                mo23889O(Boolean.valueOf(z), false);
            }
        }
    }

    /* renamed from: K */
    public final void mo23885K(String str, String str2, Object obj, boolean z) {
        mo23886L(bf0.f26274c, "_ldl", obj, true, this.f11205a.mo15133a().currentTimeMillis());
    }

    /* renamed from: L */
    public final void mo23886L(String str, String str2, Object obj, boolean z, long j) {
        int i;
        String str3 = str2;
        Object obj2 = obj;
        if (z) {
            i = this.f11205a.mo27871N().mo16885p0(str3);
        } else {
            gr6 N = this.f11205a.mo27871N();
            if (N.mo16868S("user property", str3)) {
                if (!N.mo16865P("user property", re6.f19810a, (String[]) null, str3)) {
                    i = 15;
                } else {
                    N.f11205a.mo27891z();
                    if (N.mo16863N("user property", 24, str3)) {
                        i = 0;
                    }
                }
            }
            i = 6;
        }
        if (i != 0) {
            gr6 N2 = this.f11205a.mo27871N();
            this.f11205a.mo27891z();
            this.f11205a.mo27871N().mo16852C(this.f19887a, (String) null, i, "_ev", N2.mo16888r(str3, 24, true), str3 != null ? str2.length() : 0);
            return;
        }
        String str4 = str == null ? FirebaseMessaging.f25020d : str;
        if (obj2 != null) {
            int l0 = this.f11205a.mo27871N().mo16879l0(str3, obj2);
            if (l0 != 0) {
                gr6 N3 = this.f11205a.mo27871N();
                this.f11205a.mo27891z();
                this.f11205a.mo27871N().mo16852C(this.f19887a, (String) null, l0, "_ev", N3.mo16888r(str3, 24, true), ((obj2 instanceof String) || (obj2 instanceof CharSequence)) ? obj.toString().length() : 0);
                return;
            }
            Object p = this.f11205a.mo27871N().mo16884p(str3, obj2);
            if (p != null) {
                mo23876B(str4, str2, j, p);
                return;
            }
            return;
        }
        mo23876B(str4, str2, j, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007b  */
    @com.onedelhi.secure.ly4
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23887M(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r10)
            r8.mo15139h()
            r8.mo15845i()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L_0x0061
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L_0x004f
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x004f
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            r11 = 1
            java.lang.String r0 = "false"
            boolean r10 = r0.equals(r10)
            r2 = 1
            if (r11 == r10) goto L_0x0037
            r10 = 0
            goto L_0x0038
        L_0x0037:
            r10 = r2
        L_0x0038:
            java.lang.Long r11 = java.lang.Long.valueOf(r10)
            com.onedelhi.secure.za6 r10 = r8.f11205a
            com.onedelhi.secure.q76 r10 = r10.mo27864F()
            com.onedelhi.secure.n76 r10 = r10.f18949b
            long r4 = r11.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x005b
            java.lang.String r0 = "true"
            goto L_0x005b
        L_0x004f:
            if (r11 != 0) goto L_0x0061
            com.onedelhi.secure.za6 r10 = r8.f11205a
            com.onedelhi.secure.q76 r10 = r10.mo27864F()
            com.onedelhi.secure.n76 r10 = r10.f18949b
            java.lang.String r0 = "unset"
        L_0x005b:
            r10.mo20990b(r0)
            r6 = r11
            r3 = r1
            goto L_0x0063
        L_0x0061:
            r3 = r10
            r6 = r11
        L_0x0063:
            com.onedelhi.secure.za6 r10 = r8.f11205a
            boolean r10 = r10.mo27884o()
            if (r10 != 0) goto L_0x007b
            com.onedelhi.secure.za6 r9 = r8.f11205a
            com.onedelhi.secure.a56 r9 = r9.mo15136e()
            com.onedelhi.secure.u46 r9 = r9.mo12730v()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.mo25379a(r10)
            return
        L_0x007b:
            com.onedelhi.secure.za6 r10 = r8.f11205a
            boolean r10 = r10.mo27887r()
            if (r10 != 0) goto L_0x0084
            return
        L_0x0084:
            com.onedelhi.secure.wq6 r10 = new com.onedelhi.secure.wq6
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.onedelhi.secure.za6 r9 = r8.f11205a
            com.onedelhi.secure.om6 r9 = r9.mo27869L()
            r9.mo22020y(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ri6.mo23887M(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    /* renamed from: N */
    public final void mo23888N(xe6 xe6) {
        mo15845i();
        Preconditions.checkNotNull(xe6);
        if (!this.f19893a.remove(xe6)) {
            this.f11205a.mo15136e().mo12731w().mo25379a("OnEventListener had not been registered");
        }
    }

    @ly4
    /* renamed from: O */
    public final void mo23889O(Boolean bool, boolean z) {
        mo15139h();
        mo15845i();
        this.f11205a.mo15136e().mo12725q().mo25380b("Setting app measurement enabled (FE)", bool);
        this.f11205a.mo27864F().mo22928s(bool);
        if (z) {
            q76 F = this.f11205a.mo27864F();
            za6 za6 = F.f11205a;
            F.mo15139h();
            SharedPreferences.Editor edit = F.mo22924o().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (this.f11205a.mo27885p() || (bool != null && !bool.booleanValue())) {
            mo23890P();
        }
    }

    @ly4
    /* renamed from: P */
    public final void mo23890P() {
        mo15139h();
        String a = this.f11205a.mo27864F().f18949b.mo20989a();
        if (a != null) {
            if ("unset".equals(a)) {
                mo23887M(FirebaseMessaging.f25020d, "_npa", (Object) null, this.f11205a.mo15133a().currentTimeMillis());
            } else {
                mo23887M(FirebaseMessaging.f25020d, "_npa", Long.valueOf(true != h60.f29487F.equals(a) ? 0 : 1), this.f11205a.mo15133a().currentTimeMillis());
            }
        }
        if (!this.f11205a.mo27884o() || !this.f19898c) {
            this.f11205a.mo15136e().mo12725q().mo25379a("Updating Scion state (FE)");
            this.f11205a.mo27869L().mo22018w();
            return;
        }
        this.f11205a.mo15136e().mo12725q().mo25379a("Recording app launch after enabling measurement for the first time (FE)");
        mo23903g0();
        sx6.m28019c();
        if (this.f11205a.mo27891z().mo14110B((String) null, n36.f17056f0)) {
            this.f11205a.mo27870M().f17508a.mo19745a();
        }
        this.f11205a.mo15135d().mo23065z(new sf6(this));
    }

    /* renamed from: Q */
    public final int mo23891Q(String str) {
        Preconditions.checkNotEmpty(str);
        this.f11205a.mo27891z();
        return 25;
    }

    /* renamed from: R */
    public final Boolean mo23892R() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.f11205a.mo15135d().mo23061r(atomicReference, rf4.f19824c, "boolean test flag value", new tg6(this, atomicReference));
    }

    /* renamed from: S */
    public final Double mo23893S() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.f11205a.mo15135d().mo23061r(atomicReference, rf4.f19824c, "double test flag value", new di6(this, atomicReference));
    }

    /* renamed from: T */
    public final Integer mo23894T() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.f11205a.mo15135d().mo23061r(atomicReference, rf4.f19824c, "int test flag value", new bi6(this, atomicReference));
    }

    /* renamed from: U */
    public final Long mo23895U() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.f11205a.mo15135d().mo23061r(atomicReference, rf4.f19824c, "long test flag value", new eh6(this, atomicReference));
    }

    /* renamed from: V */
    public final String mo23896V() {
        return (String) this.f19895a.get();
    }

    /* renamed from: W */
    public final String mo23897W() {
        fj6 r = this.f11205a.mo27868K().mo26148r();
        if (r != null) {
            return r.f12101b;
        }
        return null;
    }

    /* renamed from: X */
    public final String mo23898X() {
        fj6 r = this.f11205a.mo27868K().mo26148r();
        if (r != null) {
            return r.f12098a;
        }
        return null;
    }

    /* renamed from: Y */
    public final String mo23899Y() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.f11205a.mo15135d().mo23061r(atomicReference, rf4.f19824c, "String test flag value", new ch6(this, atomicReference));
    }

    /* renamed from: Z */
    public final ArrayList mo23900Z(String str, String str2) {
        if (this.f11205a.mo15135d().mo23059C()) {
            this.f11205a.mo15136e().mo12726r().mo25379a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        this.f11205a.mo15134c();
        if (rb5.m26621a()) {
            this.f11205a.mo15136e().mo12726r().mo25379a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f11205a.mo15135d().mo23061r(atomicReference, 5000, "get conditional user properties", new qg6(this, atomicReference, (String) null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return gr6.m16186v(list);
        }
        this.f11205a.mo15136e().mo12726r().mo25380b("Timed out waiting for get conditional user properties", (Object) null);
        return new ArrayList();
    }

    /* renamed from: a0 */
    public final List mo23901a0(boolean z) {
        u46 r;
        String str;
        mo15845i();
        this.f11205a.mo15136e().mo12730v().mo25379a("Getting user properties (FE)");
        if (!this.f11205a.mo15135d().mo23059C()) {
            this.f11205a.mo15134c();
            if (rb5.m26621a()) {
                r = this.f11205a.mo15136e().mo12726r();
                str = "Cannot get all user properties from main thread";
            } else {
                AtomicReference atomicReference = new AtomicReference();
                this.f11205a.mo15135d().mo23061r(atomicReference, 5000, "get user properties", new eg6(this, atomicReference, z));
                List list = (List) atomicReference.get();
                if (list != null) {
                    return list;
                }
                this.f11205a.mo15136e().mo12726r().mo25380b("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z));
                return Collections.emptyList();
            }
        } else {
            r = this.f11205a.mo15136e().mo12726r();
            str = "Cannot get all user properties from analytics worker thread";
        }
        r.mo25379a(str);
        return Collections.emptyList();
    }

    /* renamed from: b0 */
    public final Map mo23902b0(String str, String str2, boolean z) {
        u46 r;
        String str3;
        if (this.f11205a.mo15135d().mo23059C()) {
            r = this.f11205a.mo15136e().mo12726r();
            str3 = "Cannot get user properties from analytics worker thread";
        } else {
            this.f11205a.mo15134c();
            if (rb5.m26621a()) {
                r = this.f11205a.mo15136e().mo12726r();
                str3 = "Cannot get user properties from main thread";
            } else {
                AtomicReference atomicReference = new AtomicReference();
                this.f11205a.mo15135d().mo23061r(atomicReference, 5000, "get user properties", new wg6(this, atomicReference, (String) null, str, str2, z));
                List<wq6> list = (List) atomicReference.get();
                if (list == null) {
                    this.f11205a.mo15136e().mo12726r().mo25380b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
                    return Collections.emptyMap();
                }
                C3042oa oaVar = new C3042oa(list.size());
                for (wq6 wq6 : list) {
                    Object K2 = wq6.mo26660K2();
                    if (K2 != null) {
                        oaVar.put(wq6.f22256b, K2);
                    }
                }
                return oaVar;
            }
        }
        r.mo25379a(str3);
        return Collections.emptyMap();
    }

    @ly4
    /* renamed from: g0 */
    public final void mo23903g0() {
        mo15139h();
        mo15845i();
        if (this.f11205a.mo27887r()) {
            if (this.f11205a.mo27891z().mo14110B((String) null, n36.f17042Z)) {
                ce5 z = this.f11205a.mo27891z();
                z.f11205a.mo15134c();
                Boolean t = z.mo14127t("google_analytics_deferred_deep_link_enabled");
                if (t != null && t.booleanValue()) {
                    this.f11205a.mo15136e().mo12725q().mo25379a("Deferred Deep Link feature enabled.");
                    this.f11205a.mo15135d().mo23065z(new pf6(this));
                }
            }
            this.f11205a.mo27869L().mo22000O();
            this.f19898c = false;
            q76 F = this.f11205a.mo27864F();
            F.mo15139h();
            String string = F.mo22924o().getString("previous_os_version", (String) null);
            F.f11205a.mo27859A().mo17201k();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = F.mo22924o().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                this.f11205a.mo27859A().mo17201k();
                if (!string.equals(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    mo23910u(bf0.f26274c, "_ou", bundle);
                }
            }
        }
    }

    /* renamed from: n */
    public final boolean mo15779n() {
        return false;
    }

    /* renamed from: o */
    public final void mo23904o(String str, String str2, Bundle bundle) {
        long currentTimeMillis = this.f11205a.mo15133a().currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong(C1767b9.C1768a.f9764m, currentTimeMillis);
        if (str2 != null) {
            bundle2.putString(C1767b9.C1768a.f9762k, str2);
            bundle2.putBundle(C1767b9.C1768a.f9763l, bundle);
        }
        this.f11205a.mo15135d().mo23065z(new ng6(this, bundle2));
    }

    /* renamed from: p */
    public final void mo23905p() {
        if ((this.f11205a.mo15137f().getApplicationContext() instanceof Application) && this.f19888a != null) {
            ((Application) this.f11205a.mo15137f().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f19888a);
        }
    }

    /* renamed from: q */
    public final /* synthetic */ void mo23906q(Bundle bundle) {
        if (bundle == null) {
            this.f11205a.mo27864F().f18942a.mo13518b(new Bundle());
            return;
        }
        Bundle a = this.f11205a.mo27864F().f18942a.mo13517a();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.f11205a.mo27871N().mo16871V(obj)) {
                    this.f11205a.mo27871N().mo16852C(this.f19887a, (String) null, 27, (String) null, (String) null, 0);
                }
                this.f11205a.mo15136e().mo12732x().mo25381c("Invalid default event parameter type. Name, value", str, obj);
            } else if (gr6.m16175Y(str)) {
                this.f11205a.mo15136e().mo12732x().mo25380b("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                a.remove(str);
            } else {
                gr6 N = this.f11205a.mo27871N();
                this.f11205a.mo27891z();
                if (N.mo16866Q("param", str, 100, obj)) {
                    this.f11205a.mo27871N().mo16853D(a, str, obj);
                }
            }
        }
        this.f11205a.mo27871N();
        int m = this.f11205a.mo27891z().mo14120m();
        if (a.size() > m) {
            int i = 0;
            for (String str2 : new TreeSet(a.keySet())) {
                i++;
                if (i > m) {
                    a.remove(str2);
                }
            }
            this.f11205a.mo27871N().mo16852C(this.f19887a, (String) null, 26, (String) null, (String) null, 0);
            this.f11205a.mo15136e().mo12732x().mo25379a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.f11205a.mo27864F().f18942a.mo13518b(a);
        this.f11205a.mo27869L().mo22017v(a);
    }

    /* renamed from: r */
    public final void mo23907r(String str, String str2, Bundle bundle) {
        mo23908s(str, str2, bundle, true, true, this.f11205a.mo15133a().currentTimeMillis());
    }

    /* renamed from: s */
    public final void mo23908s(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        String str3 = str2;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (str3 == FirebaseAnalytics.C4304c.f24897A || (str3 != null && str2.equals(FirebaseAnalytics.C4304c.f24897A))) {
            this.f11205a.mo27868K().mo26143E(bundle2, j);
            return;
        }
        mo23875A(str == null ? FirebaseMessaging.f25020d : str, str2, j, bundle2, z2, !z2 || this.f19890a == null || gr6.m16175Y(str2), z, (String) null);
    }

    /* renamed from: t */
    public final void mo23909t(String str, String str2, Bundle bundle, String str3) {
        za6.m32971t();
        mo23875A(bf0.f26274c, str2, this.f11205a.mo15133a().currentTimeMillis(), bundle, false, true, true, str3);
    }

    @ly4
    /* renamed from: u */
    public final void mo23910u(String str, String str2, Bundle bundle) {
        mo15139h();
        mo23911v(str, str2, this.f11205a.mo15133a().currentTimeMillis(), bundle);
    }

    @ly4
    /* renamed from: v */
    public final void mo23911v(String str, String str2, long j, Bundle bundle) {
        mo15139h();
        mo23912w(str, str2, j, bundle, true, this.f19890a == null || gr6.m16175Y(str2), true, (String) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: android.os.Bundle[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: android.os.Bundle[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: android.os.Bundle[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: android.os.Bundle[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    @com.onedelhi.secure.ly4
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23912w(java.lang.String r20, java.lang.String r21, long r22, android.os.Bundle r24, boolean r25, boolean r26, boolean r27, java.lang.String r28) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r12 = r24
            java.lang.String r0 = "com.google.android.gms.tagmanager.TagManagerService"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r20)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r24)
            r19.mo15139h()
            r19.mo15845i()
            com.onedelhi.secure.za6 r1 = r7.f11205a
            boolean r1 = r1.mo27884o()
            if (r1 == 0) goto L_0x04ee
            com.onedelhi.secure.za6 r1 = r7.f11205a
            com.onedelhi.secure.z36 r1 = r1.mo27860B()
            java.util.List r1 = r1.mo27797u()
            if (r1 == 0) goto L_0x0043
            boolean r1 = r1.contains(r9)
            if (r1 == 0) goto L_0x0033
            goto L_0x0043
        L_0x0033:
            com.onedelhi.secure.za6 r0 = r7.f11205a
            com.onedelhi.secure.a56 r0 = r0.mo15136e()
            com.onedelhi.secure.u46 r0 = r0.mo12725q()
            java.lang.String r1 = "Dropping non-safelisted event. event name, origin"
            r0.mo25381c(r1, r9, r8)
            return
        L_0x0043:
            boolean r1 = r7.f19897b
            r13 = 0
            r14 = 0
            r15 = 1
            if (r1 != 0) goto L_0x00a1
            r7.f19897b = r15
            com.onedelhi.secure.za6 r1 = r7.f11205a     // Catch:{ ClassNotFoundException -> 0x0092 }
            boolean r1 = r1.mo27888s()     // Catch:{ ClassNotFoundException -> 0x0092 }
            if (r1 != 0) goto L_0x0063
            com.onedelhi.secure.za6 r1 = r7.f11205a     // Catch:{ ClassNotFoundException -> 0x0092 }
            android.content.Context r1 = r1.mo15137f()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.Class r0 = java.lang.Class.forName(r0, r15, r1)     // Catch:{ ClassNotFoundException -> 0x0092 }
            goto L_0x0067
        L_0x0063:
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0092 }
        L_0x0067:
            java.lang.String r1 = "initialize"
            java.lang.Class[] r2 = new java.lang.Class[r15]     // Catch:{ Exception -> 0x0081 }
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r2[r14] = r3     // Catch:{ Exception -> 0x0081 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch:{ Exception -> 0x0081 }
            java.lang.Object[] r1 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x0081 }
            com.onedelhi.secure.za6 r2 = r7.f11205a     // Catch:{ Exception -> 0x0081 }
            android.content.Context r2 = r2.mo15137f()     // Catch:{ Exception -> 0x0081 }
            r1[r14] = r2     // Catch:{ Exception -> 0x0081 }
            r0.invoke(r13, r1)     // Catch:{ Exception -> 0x0081 }
            goto L_0x00a1
        L_0x0081:
            r0 = move-exception
            com.onedelhi.secure.za6 r1 = r7.f11205a     // Catch:{ ClassNotFoundException -> 0x0092 }
            com.onedelhi.secure.a56 r1 = r1.mo15136e()     // Catch:{ ClassNotFoundException -> 0x0092 }
            com.onedelhi.secure.u46 r1 = r1.mo12731w()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.String r2 = "Failed to invoke Tag Manager's initialize() method"
            r1.mo25380b(r2, r0)     // Catch:{ ClassNotFoundException -> 0x0092 }
            goto L_0x00a1
        L_0x0092:
            com.onedelhi.secure.za6 r0 = r7.f11205a
            com.onedelhi.secure.a56 r0 = r0.mo15136e()
            com.onedelhi.secure.u46 r0 = r0.mo12729u()
            java.lang.String r1 = "Tag Manager is not found and thus will not be used"
            r0.mo25379a(r1)
        L_0x00a1:
            java.lang.String r0 = "_cmp"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x00cd
            java.lang.String r0 = "gclid"
            boolean r1 = r12.containsKey(r0)
            if (r1 == 0) goto L_0x00cd
            com.onedelhi.secure.za6 r1 = r7.f11205a
            r1.mo15134c()
            java.lang.String r4 = r12.getString(r0)
            com.onedelhi.secure.za6 r0 = r7.f11205a
            com.google.android.gms.common.util.Clock r0 = r0.mo15133a()
            long r5 = r0.currentTimeMillis()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_lgclid"
            r1 = r19
            r1.mo23887M(r2, r3, r4, r5)
        L_0x00cd:
            com.onedelhi.secure.za6 r0 = r7.f11205a
            r0.mo15134c()
            if (r25 == 0) goto L_0x00ef
            boolean r0 = com.onedelhi.secure.gr6.m16179c0(r21)
            if (r0 == 0) goto L_0x00ef
            com.onedelhi.secure.za6 r0 = r7.f11205a
            com.onedelhi.secure.gr6 r0 = r0.mo27871N()
            com.onedelhi.secure.za6 r1 = r7.f11205a
            com.onedelhi.secure.q76 r1 = r1.mo27864F()
            com.onedelhi.secure.b76 r1 = r1.f18942a
            android.os.Bundle r1 = r1.mo13517a()
            r0.mo16900z(r12, r1)
        L_0x00ef:
            r0 = 40
            if (r27 != 0) goto L_0x0177
            com.onedelhi.secure.za6 r1 = r7.f11205a
            r1.mo15134c()
            java.lang.String r1 = "_iap"
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x0177
            com.onedelhi.secure.za6 r1 = r7.f11205a
            com.onedelhi.secure.gr6 r1 = r1.mo27871N()
            java.lang.String r2 = "event"
            boolean r3 = r1.mo16868S(r2, r9)
            r4 = 2
            if (r3 != 0) goto L_0x0110
            goto L_0x012a
        L_0x0110:
            java.lang.String[] r3 = com.onedelhi.secure.le6.f15331a
            java.lang.String[] r5 = com.onedelhi.secure.le6.f15332b
            boolean r3 = r1.mo16865P(r2, r3, r5, r9)
            if (r3 != 0) goto L_0x011d
            r4 = 13
            goto L_0x012a
        L_0x011d:
            com.onedelhi.secure.za6 r3 = r1.f11205a
            r3.mo27891z()
            boolean r1 = r1.mo16863N(r2, r0, r9)
            if (r1 != 0) goto L_0x0129
            goto L_0x012a
        L_0x0129:
            r4 = 0
        L_0x012a:
            if (r4 == 0) goto L_0x0177
            com.onedelhi.secure.za6 r1 = r7.f11205a
            com.onedelhi.secure.a56 r1 = r1.mo15136e()
            com.onedelhi.secure.u46 r1 = r1.mo12727s()
            com.onedelhi.secure.za6 r2 = r7.f11205a
            com.onedelhi.secure.l46 r2 = r2.mo27862D()
            java.lang.String r2 = r2.mo19280d(r9)
            java.lang.String r3 = "Invalid public event name. Event will not be logged (FE)"
            r1.mo25380b(r3, r2)
            com.onedelhi.secure.za6 r1 = r7.f11205a
            com.onedelhi.secure.gr6 r1 = r1.mo27871N()
            com.onedelhi.secure.za6 r2 = r7.f11205a
            r2.mo27891z()
            java.lang.String r0 = r1.mo16888r(r9, r0, r15)
            if (r9 == 0) goto L_0x015a
            int r14 = r21.length()
        L_0x015a:
            com.onedelhi.secure.za6 r1 = r7.f11205a
            com.onedelhi.secure.gr6 r1 = r1.mo27871N()
            com.onedelhi.secure.er6 r2 = r7.f19887a
            r3 = 0
            java.lang.String r5 = "_ev"
            r20 = r1
            r21 = r2
            r22 = r3
            r23 = r4
            r24 = r5
            r25 = r0
            r26 = r14
            r20.mo16852C(r21, r22, r23, r24, r25, r26)
            return
        L_0x0177:
            com.onedelhi.secure.za6 r1 = r7.f11205a
            r1.mo15134c()
            com.onedelhi.secure.za6 r1 = r7.f11205a
            com.onedelhi.secure.vj6 r1 = r1.mo27868K()
            com.onedelhi.secure.fj6 r1 = r1.mo26149s(r14)
            java.lang.String r2 = "_sc"
            if (r1 == 0) goto L_0x0192
            boolean r3 = r12.containsKey(r2)
            if (r3 != 0) goto L_0x0192
            r1.f12099a = r15
        L_0x0192:
            if (r25 == 0) goto L_0x0198
            if (r27 != 0) goto L_0x0198
            r3 = 1
            goto L_0x0199
        L_0x0198:
            r3 = 0
        L_0x0199:
            com.onedelhi.secure.gr6.m16187y(r1, r12, r3)
            java.lang.String r1 = "am"
            boolean r1 = r1.equals(r8)
            boolean r3 = com.onedelhi.secure.gr6.m16175Y(r21)
            if (r25 == 0) goto L_0x01e9
            com.onedelhi.secure.ue6 r4 = r7.f19890a
            if (r4 == 0) goto L_0x01e9
            if (r3 != 0) goto L_0x01e9
            if (r1 == 0) goto L_0x01b3
            r16 = 1
            goto L_0x01eb
        L_0x01b3:
            com.onedelhi.secure.za6 r0 = r7.f11205a
            com.onedelhi.secure.a56 r0 = r0.mo15136e()
            com.onedelhi.secure.u46 r0 = r0.mo12725q()
            com.onedelhi.secure.za6 r1 = r7.f11205a
            com.onedelhi.secure.l46 r1 = r1.mo27862D()
            java.lang.String r1 = r1.mo19280d(r9)
            com.onedelhi.secure.za6 r2 = r7.f11205a
            com.onedelhi.secure.l46 r2 = r2.mo27862D()
            java.lang.String r2 = r2.mo19278b(r12)
            java.lang.String r3 = "Passing event to registered event handler (FE)"
            r0.mo25381c(r3, r1, r2)
            com.onedelhi.secure.ue6 r0 = r7.f19890a
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.onedelhi.secure.ue6 r1 = r7.f19890a
            r2 = r20
            r3 = r21
            r4 = r24
            r5 = r22
            r1.mo10735a(r2, r3, r4, r5)
            return
        L_0x01e9:
            r16 = r1
        L_0x01eb:
            com.onedelhi.secure.za6 r1 = r7.f11205a
            boolean r1 = r1.mo27887r()
            if (r1 == 0) goto L_0x04ed
            com.onedelhi.secure.za6 r1 = r7.f11205a
            com.onedelhi.secure.gr6 r1 = r1.mo27871N()
            int r1 = r1.mo16880m0(r9)
            if (r1 == 0) goto L_0x0249
            com.onedelhi.secure.za6 r2 = r7.f11205a
            com.onedelhi.secure.a56 r2 = r2.mo15136e()
            com.onedelhi.secure.u46 r2 = r2.mo12727s()
            com.onedelhi.secure.za6 r3 = r7.f11205a
            com.onedelhi.secure.l46 r3 = r3.mo27862D()
            java.lang.String r3 = r3.mo19280d(r9)
            java.lang.String r4 = "Invalid event name. Event will not be logged (FE)"
            r2.mo25380b(r4, r3)
            com.onedelhi.secure.za6 r2 = r7.f11205a
            com.onedelhi.secure.gr6 r2 = r2.mo27871N()
            com.onedelhi.secure.za6 r3 = r7.f11205a
            r3.mo27891z()
            java.lang.String r0 = r2.mo16888r(r9, r0, r15)
            if (r9 == 0) goto L_0x022d
            int r14 = r21.length()
        L_0x022d:
            com.onedelhi.secure.za6 r2 = r7.f11205a
            com.onedelhi.secure.gr6 r2 = r2.mo27871N()
            com.onedelhi.secure.er6 r3 = r7.f19887a
            java.lang.String r4 = "_ev"
            r20 = r2
            r21 = r3
            r22 = r28
            r23 = r1
            r24 = r4
            r25 = r0
            r26 = r14
            r20.mo16852C(r21, r22, r23, r24, r25, r26)
            return
        L_0x0249:
            java.lang.String r0 = "_o"
            java.lang.String r1 = "_sn"
            java.lang.String r3 = "_si"
            java.lang.String[] r1 = new java.lang.String[]{r0, r1, r2, r3}
            java.util.List r5 = com.google.android.gms.common.util.CollectionUtils.listOf((T[]) r1)
            com.onedelhi.secure.za6 r1 = r7.f11205a
            com.onedelhi.secure.gr6 r1 = r1.mo27871N()
            r2 = r28
            r3 = r21
            r4 = r24
            r6 = r27
            android.os.Bundle r12 = r1.mo16898x0(r2, r3, r4, r5, r6)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r12)
            com.onedelhi.secure.za6 r1 = r7.f11205a
            r1.mo15134c()
            com.onedelhi.secure.za6 r1 = r7.f11205a
            com.onedelhi.secure.vj6 r1 = r1.mo27868K()
            com.onedelhi.secure.fj6 r1 = r1.mo26149s(r14)
            java.lang.String r5 = "_ae"
            if (r1 == 0) goto L_0x02ae
            boolean r1 = r5.equals(r9)
            if (r1 == 0) goto L_0x02ae
            com.onedelhi.secure.za6 r1 = r7.f11205a
            com.onedelhi.secure.no6 r1 = r1.mo27870M()
            com.onedelhi.secure.jo6 r1 = r1.f17507a
            com.onedelhi.secure.no6 r2 = r1.f14360a
            com.onedelhi.secure.za6 r2 = r2.f11205a
            com.google.android.gms.common.util.Clock r2 = r2.mo15133a()
            long r14 = r2.elapsedRealtime()
            long r3 = r1.f14362b
            long r2 = r14 - r3
            r1.f14362b = r14
            r14 = 0
            int r1 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r1 <= 0) goto L_0x02ae
            com.onedelhi.secure.za6 r1 = r7.f11205a
            com.onedelhi.secure.gr6 r1 = r1.mo27871N()
            r1.mo16895w(r12, r2)
        L_0x02ae:
            com.onedelhi.secure.ow6.m24151c()
            com.onedelhi.secure.za6 r1 = r7.f11205a
            com.onedelhi.secure.ce5 r1 = r1.mo27891z()
            com.onedelhi.secure.k36 r2 = com.onedelhi.secure.n36.f17054e0
            boolean r1 = r1.mo14110B(r13, r2)
            if (r1 == 0) goto L_0x0338
            java.lang.String r1 = "auto"
            boolean r1 = r1.equals(r8)
            java.lang.String r2 = "_ffr"
            if (r1 != 0) goto L_0x0317
            java.lang.String r1 = "_ssr"
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x0317
            com.onedelhi.secure.za6 r1 = r7.f11205a
            com.onedelhi.secure.gr6 r1 = r1.mo27871N()
            java.lang.String r2 = r12.getString(r2)
            boolean r3 = com.google.android.gms.common.util.Strings.isEmptyOrWhitespace(r2)
            if (r3 == 0) goto L_0x02e3
            r2 = r13
            goto L_0x02e9
        L_0x02e3:
            if (r2 == 0) goto L_0x02e9
            java.lang.String r2 = r2.trim()
        L_0x02e9:
            com.onedelhi.secure.za6 r3 = r1.f11205a
            com.onedelhi.secure.q76 r3 = r3.mo27864F()
            com.onedelhi.secure.n76 r3 = r3.f18953c
            java.lang.String r3 = r3.mo20989a()
            boolean r3 = com.onedelhi.secure.cr6.m12719a(r2, r3)
            if (r3 != 0) goto L_0x0307
            com.onedelhi.secure.za6 r1 = r1.f11205a
            com.onedelhi.secure.q76 r1 = r1.mo27864F()
            com.onedelhi.secure.n76 r1 = r1.f18953c
            r1.mo20990b(r2)
            goto L_0x0338
        L_0x0307:
            com.onedelhi.secure.za6 r0 = r1.f11205a
            com.onedelhi.secure.a56 r0 = r0.mo15136e()
            com.onedelhi.secure.u46 r0 = r0.mo12725q()
            java.lang.String r1 = "Not logging duplicate session_start_with_rollout event"
            r0.mo25379a(r1)
            return
        L_0x0317:
            boolean r1 = r5.equals(r9)
            if (r1 == 0) goto L_0x0338
            com.onedelhi.secure.za6 r1 = r7.f11205a
            com.onedelhi.secure.gr6 r1 = r1.mo27871N()
            com.onedelhi.secure.za6 r1 = r1.f11205a
            com.onedelhi.secure.q76 r1 = r1.mo27864F()
            com.onedelhi.secure.n76 r1 = r1.f18953c
            java.lang.String r1 = r1.mo20989a()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x0338
            r12.putString(r2, r1)
        L_0x0338:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r14.add(r12)
            com.onedelhi.secure.za6 r1 = r7.f11205a
            com.onedelhi.secure.q76 r1 = r1.mo27864F()
            com.onedelhi.secure.e76 r1 = r1.f18956d
            long r1 = r1.mo15075a()
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 <= 0) goto L_0x03ca
            com.onedelhi.secure.za6 r1 = r7.f11205a
            com.onedelhi.secure.q76 r1 = r1.mo27864F()
            boolean r1 = r1.mo22931v(r10)
            if (r1 == 0) goto L_0x03ca
            com.onedelhi.secure.za6 r1 = r7.f11205a
            com.onedelhi.secure.q76 r1 = r1.mo27864F()
            com.onedelhi.secure.y66 r1 = r1.f18954c
            boolean r1 = r1.mo27238b()
            if (r1 == 0) goto L_0x03ca
            com.onedelhi.secure.za6 r1 = r7.f11205a
            com.onedelhi.secure.a56 r1 = r1.mo15136e()
            com.onedelhi.secure.u46 r1 = r1.mo12730v()
            java.lang.String r2 = "Current session is expired, remove the session number, ID, and engagement time"
            r1.mo25379a(r2)
            com.onedelhi.secure.za6 r1 = r7.f11205a
            com.google.android.gms.common.util.Clock r1 = r1.mo15133a()
            long r17 = r1.currentTimeMillis()
            r6 = 0
            java.lang.String r2 = "auto"
            java.lang.String r15 = "_sid"
            r1 = r19
            r24 = r14
            r13 = r3
            r3 = r15
            r4 = r6
            r15 = r5
            r5 = r17
            r1.mo23887M(r2, r3, r4, r5)
            com.onedelhi.secure.za6 r1 = r7.f11205a
            com.google.android.gms.common.util.Clock r1 = r1.mo15133a()
            long r5 = r1.currentTimeMillis()
            r4 = 0
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_sno"
            r1 = r19
            r1.mo23887M(r2, r3, r4, r5)
            com.onedelhi.secure.za6 r1 = r7.f11205a
            com.google.android.gms.common.util.Clock r1 = r1.mo15133a()
            long r5 = r1.currentTimeMillis()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_se"
            r1 = r19
            r1.mo23887M(r2, r3, r4, r5)
            com.onedelhi.secure.za6 r1 = r7.f11205a
            com.onedelhi.secure.q76 r1 = r1.mo27864F()
            com.onedelhi.secure.e76 r1 = r1.f18959e
            r1.mo15076b(r13)
            goto L_0x03ce
        L_0x03ca:
            r15 = r5
            r24 = r14
            r13 = r3
        L_0x03ce:
            java.lang.String r1 = "extend_session"
            long r1 = r12.getLong(r1, r13)
            r3 = 1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x03f5
            com.onedelhi.secure.za6 r1 = r7.f11205a
            com.onedelhi.secure.a56 r1 = r1.mo15136e()
            com.onedelhi.secure.u46 r1 = r1.mo12730v()
            java.lang.String r2 = "EXTEND_SESSION param attached: initiate a new session or extend the current active session"
            r1.mo25379a(r2)
            com.onedelhi.secure.za6 r1 = r7.f11205a
            com.onedelhi.secure.no6 r1 = r1.mo27870M()
            com.onedelhi.secure.lo6 r1 = r1.f17508a
            r2 = 1
            r1.mo19746b(r10, r2)
        L_0x03f5:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Set r2 = r12.keySet()
            r1.<init>(r2)
            java.util.Collections.sort(r1)
            int r2 = r1.size()
            r3 = 0
        L_0x0406:
            if (r3 >= r2) goto L_0x0451
            java.lang.Object r4 = r1.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x044e
            com.onedelhi.secure.za6 r5 = r7.f11205a
            r5.mo27871N()
            java.lang.Object r5 = r12.get(r4)
            boolean r6 = r5 instanceof android.os.Bundle
            if (r6 == 0) goto L_0x0426
            r6 = 1
            android.os.Bundle[] r13 = new android.os.Bundle[r6]
            android.os.Bundle r5 = (android.os.Bundle) r5
            r6 = 0
            r13[r6] = r5
            goto L_0x0449
        L_0x0426:
            boolean r6 = r5 instanceof android.os.Parcelable[]
            if (r6 == 0) goto L_0x0437
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            int r6 = r5.length
            java.lang.Class<android.os.Bundle[]> r13 = android.os.Bundle[].class
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r6, r13)
        L_0x0433:
            r13 = r5
            android.os.Bundle[] r13 = (android.os.Bundle[]) r13
            goto L_0x0449
        L_0x0437:
            boolean r6 = r5 instanceof java.util.ArrayList
            if (r6 == 0) goto L_0x0448
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r6 = r5.size()
            android.os.Bundle[] r6 = new android.os.Bundle[r6]
            java.lang.Object[] r5 = r5.toArray(r6)
            goto L_0x0433
        L_0x0448:
            r13 = 0
        L_0x0449:
            if (r13 == 0) goto L_0x044e
            r12.putParcelableArray(r4, r13)
        L_0x044e:
            int r3 = r3 + 1
            goto L_0x0406
        L_0x0451:
            r12 = 0
        L_0x0452:
            int r1 = r24.size()
            if (r12 >= r1) goto L_0x04bf
            r13 = r24
            java.lang.Object r1 = r13.get(r12)
            android.os.Bundle r1 = (android.os.Bundle) r1
            if (r12 == 0) goto L_0x0465
            java.lang.String r2 = "_ep"
            goto L_0x0466
        L_0x0465:
            r2 = r9
        L_0x0466:
            r1.putString(r0, r8)
            if (r26 == 0) goto L_0x0475
            com.onedelhi.secure.za6 r3 = r7.f11205a
            com.onedelhi.secure.gr6 r3 = r3.mo27871N()
            android.os.Bundle r1 = r3.mo16896w0(r1)
        L_0x0475:
            r14 = r1
            com.onedelhi.secure.xj5 r5 = new com.onedelhi.secure.xj5
            com.onedelhi.secure.hj5 r3 = new com.onedelhi.secure.hj5
            r3.<init>(r14)
            r1 = r5
            r4 = r20
            r25 = r0
            r0 = r5
            r5 = r22
            r1.<init>(r2, r3, r4, r5)
            com.onedelhi.secure.za6 r1 = r7.f11205a
            com.onedelhi.secure.om6 r1 = r1.mo27869L()
            r5 = r28
            r1.mo22010o(r0, r5)
            if (r16 != 0) goto L_0x04b8
            java.util.Set r0 = r7.f19893a
            java.util.Iterator r0 = r0.iterator()
        L_0x049b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x04b8
            java.lang.Object r1 = r0.next()
            com.onedelhi.secure.xe6 r1 = (com.onedelhi.secure.xe6) r1
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r14)
            r2 = r20
            r3 = r21
            r5 = r22
            r1.mo10736a(r2, r3, r4, r5)
            r5 = r28
            goto L_0x049b
        L_0x04b8:
            int r12 = r12 + 1
            r0 = r25
            r24 = r13
            goto L_0x0452
        L_0x04bf:
            com.onedelhi.secure.za6 r0 = r7.f11205a
            r0.mo15134c()
            com.onedelhi.secure.za6 r0 = r7.f11205a
            com.onedelhi.secure.vj6 r0 = r0.mo27868K()
            r1 = 0
            com.onedelhi.secure.fj6 r0 = r0.mo26149s(r1)
            if (r0 == 0) goto L_0x04ed
            boolean r0 = r15.equals(r9)
            if (r0 == 0) goto L_0x04ed
            com.onedelhi.secure.za6 r0 = r7.f11205a
            com.onedelhi.secure.no6 r0 = r0.mo27870M()
            com.onedelhi.secure.za6 r1 = r7.f11205a
            com.google.android.gms.common.util.Clock r1 = r1.mo15133a()
            long r1 = r1.elapsedRealtime()
            com.onedelhi.secure.jo6 r0 = r0.f17507a
            r3 = 1
            r0.mo18533d(r3, r3, r1)
        L_0x04ed:
            return
        L_0x04ee:
            com.onedelhi.secure.za6 r0 = r7.f11205a
            com.onedelhi.secure.a56 r0 = r0.mo15136e()
            com.onedelhi.secure.u46 r0 = r0.mo12725q()
            java.lang.String r1 = "Event not sent since app measurement is disabled"
            r0.mo25379a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ri6.mo23912w(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    /* renamed from: x */
    public final void mo23913x(xe6 xe6) {
        mo15845i();
        Preconditions.checkNotNull(xe6);
        if (!this.f19893a.add(xe6)) {
            this.f11205a.mo15136e().mo12731w().mo25379a("OnEventListener already registered");
        }
    }

    /* renamed from: y */
    public final void mo23914y(long j) {
        this.f19895a.set((Object) null);
        this.f11205a.mo15135d().mo23065z(new hg6(this, j));
    }

    /* renamed from: z */
    public final void mo23915z(long j, boolean z) {
        mo15139h();
        mo15845i();
        this.f11205a.mo15136e().mo12725q().mo25379a("Resetting analytics data (FE)");
        no6 M = this.f11205a.mo27870M();
        M.mo15139h();
        M.f17507a.mo18530a();
        xz6.m31807c();
        if (this.f11205a.mo27891z().mo14110B((String) null, n36.f17072n0)) {
            this.f11205a.mo27860B().mo27798v();
        }
        boolean o = this.f11205a.mo27884o();
        q76 F = this.f11205a.mo27864F();
        F.f18943a.mo15076b(j);
        if (!TextUtils.isEmpty(F.f11205a.mo27864F().f18953c.mo20989a())) {
            F.f18953c.mo20990b((String) null);
        }
        sx6.m28019c();
        ce5 z2 = F.f11205a.mo27891z();
        k36 k36 = n36.f17056f0;
        if (z2.mo14110B((String) null, k36)) {
            F.f18956d.mo15076b(0);
        }
        F.f18959e.mo15076b(0);
        if (!F.f11205a.mo27891z().mo14113E()) {
            F.mo22929t(!o);
        }
        F.f18957d.mo20990b((String) null);
        F.f18961g.mo15076b(0);
        F.f18942a.mo13518b((Bundle) null);
        if (z) {
            this.f11205a.mo27869L().mo22012q();
        }
        sx6.m28019c();
        if (this.f11205a.mo27891z().mo14110B((String) null, k36)) {
            this.f11205a.mo27870M().f17508a.mo19745a();
        }
        this.f19898c = !o;
    }
}
