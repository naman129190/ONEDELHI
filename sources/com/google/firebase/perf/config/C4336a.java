package com.google.firebase.perf.config;

import android.content.Context;
import com.google.firebase.perf.config.C4337b;
import com.onedelhi.secure.C4898cp;
import com.onedelhi.secure.C7012v5;
import com.onedelhi.secure.br4;
import com.onedelhi.secure.hw4;
import com.onedelhi.secure.kp1;
import com.onedelhi.secure.m50;
import com.onedelhi.secure.rk0;
import com.onedelhi.secure.rw2;
import com.onedelhi.secure.ts2;

/* renamed from: com.google.firebase.perf.config.a */
public class C4336a {

    /* renamed from: a */
    public static volatile C4336a f25225a;

    /* renamed from: a */
    public static final C7012v5 f25226a = C7012v5.m67717e();

    /* renamed from: a */
    public final RemoteConfigManager f25227a;

    /* renamed from: a */
    public kp1 f25228a;

    /* renamed from: a */
    public rk0 f25229a;

    @hw4
    public C4336a(@ts2 RemoteConfigManager remoteConfigManager, @ts2 kp1 kp1, @ts2 rk0 rk0) {
        this.f25227a = remoteConfigManager == null ? RemoteConfigManager.getInstance() : remoteConfigManager;
        this.f25228a = kp1 == null ? new kp1() : kp1;
        this.f25229a = rk0 == null ? rk0.m63697h() : rk0;
    }

    @hw4
    /* renamed from: a */
    public static void m34907a() {
        f25225a = null;
    }

    /* renamed from: h */
    public static synchronized C4336a m34908h() {
        C4336a aVar;
        synchronized (C4336a.class) {
            if (f25225a == null) {
                f25225a = new C4336a((RemoteConfigManager) null, (kp1) null, (rk0) null);
            }
            aVar = f25225a;
        }
        return aVar;
    }

    /* renamed from: A */
    public long mo29849A() {
        Long e;
        C4337b.C4350l f = C4337b.C4350l.m35012f();
        rw2<Long> q = mo29884q(f);
        if (!q.mo44068d() || !mo29860L(q.mo44067c().longValue())) {
            q = mo29891x(f);
            if (!q.mo44068d() || !mo29860L(q.mo44067c().longValue())) {
                q = mo29873e(f);
                if (!q.mo44068d() || !mo29860L(q.mo44067c().longValue())) {
                    e = f.mo29894a();
                    return e.longValue();
                }
            } else {
                this.f25229a.mo43932n(f.mo29897b(), q.mo44067c().longValue());
            }
        }
        e = q.mo44067c();
        return e.longValue();
    }

    /* renamed from: B */
    public long mo29850B() {
        Long e;
        C4337b.C4351m f = C4337b.C4351m.m35018f();
        rw2<Long> q = mo29884q(f);
        if (!q.mo44068d() || !mo29860L(q.mo44067c().longValue())) {
            q = mo29891x(f);
            if (!q.mo44068d() || !mo29860L(q.mo44067c().longValue())) {
                q = mo29873e(f);
                if (!q.mo44068d() || !mo29860L(q.mo44067c().longValue())) {
                    e = f.mo29894a();
                    return e.longValue();
                }
            } else {
                this.f25229a.mo43932n(f.mo29897b(), q.mo44067c().longValue());
            }
        }
        e = q.mo44067c();
        return e.longValue();
    }

    /* renamed from: C */
    public long mo29851C() {
        Long e;
        C4337b.C4352n f = C4337b.C4352n.m35024f();
        rw2<Long> q = mo29884q(f);
        if (!q.mo44068d() || !mo29863O(q.mo44067c().longValue())) {
            q = mo29891x(f);
            if (!q.mo44068d() || !mo29863O(q.mo44067c().longValue())) {
                q = mo29873e(f);
                if (!q.mo44068d() || !mo29863O(q.mo44067c().longValue())) {
                    e = f.mo29894a();
                    return e.longValue();
                }
            } else {
                this.f25229a.mo43932n(f.mo29897b(), q.mo44067c().longValue());
            }
        }
        e = q.mo44067c();
        return e.longValue();
    }

    /* renamed from: D */
    public long mo29852D() {
        Long e;
        C4337b.C4353o f = C4337b.C4353o.m35030f();
        rw2<Long> q = mo29884q(f);
        if (!q.mo44068d() || !mo29860L(q.mo44067c().longValue())) {
            q = mo29891x(f);
            if (!q.mo44068d() || !mo29860L(q.mo44067c().longValue())) {
                q = mo29873e(f);
                if (!q.mo44068d() || !mo29860L(q.mo44067c().longValue())) {
                    e = f.mo29894a();
                    return e.longValue();
                }
            } else {
                this.f25229a.mo43932n(f.mo29897b(), q.mo44067c().longValue());
            }
        }
        e = q.mo44067c();
        return e.longValue();
    }

    /* renamed from: E */
    public long mo29853E() {
        Long e;
        C4337b.C4354p f = C4337b.C4354p.m35036f();
        rw2<Long> q = mo29884q(f);
        if (!q.mo44068d() || !mo29860L(q.mo44067c().longValue())) {
            q = mo29891x(f);
            if (!q.mo44068d() || !mo29860L(q.mo44067c().longValue())) {
                q = mo29873e(f);
                if (!q.mo44068d() || !mo29860L(q.mo44067c().longValue())) {
                    e = f.mo29894a();
                    return e.longValue();
                }
            } else {
                this.f25229a.mo43932n(f.mo29897b(), q.mo44067c().longValue());
            }
        }
        e = q.mo44067c();
        return e.longValue();
    }

    /* renamed from: F */
    public float mo29854F() {
        Float e;
        C4337b.C4355q f = C4337b.C4355q.m35042f();
        rw2<Float> p = mo29883p(f);
        if (p.mo44068d()) {
            float floatValue = p.mo44067c().floatValue() / 100.0f;
            if (mo29862N(floatValue)) {
                return floatValue;
            }
        }
        rw2<Float> w = mo29890w(f);
        if (!w.mo44068d() || !mo29862N(w.mo44067c().floatValue())) {
            w = mo29872d(f);
            if (!w.mo44068d() || !mo29862N(w.mo44067c().floatValue())) {
                e = f.mo29894a();
                return e.floatValue();
            }
        } else {
            this.f25229a.mo43931m(f.mo29897b(), w.mo44067c().floatValue());
        }
        e = w.mo44067c();
        return e.floatValue();
    }

    /* renamed from: G */
    public long mo29855G() {
        Long e;
        C4337b.C4356r f = C4337b.C4356r.m35048f();
        rw2<Long> x = mo29891x(f);
        if (!x.mo44068d() || !mo29858J(x.mo44067c().longValue())) {
            x = mo29873e(f);
            if (!x.mo44068d() || !mo29858J(x.mo44067c().longValue())) {
                e = f.mo29894a();
                return e.longValue();
            }
        } else {
            this.f25229a.mo43932n(f.mo29897b(), x.mo44067c().longValue());
        }
        e = x.mo44067c();
        return e.longValue();
    }

    /* renamed from: H */
    public long mo29856H() {
        Long e;
        C4337b.C4357s f = C4337b.C4357s.m35053f();
        rw2<Long> x = mo29891x(f);
        if (!x.mo44068d() || !mo29858J(x.mo44067c().longValue())) {
            x = mo29873e(f);
            if (!x.mo44068d() || !mo29858J(x.mo44067c().longValue())) {
                e = f.mo29894a();
                return e.longValue();
            }
        } else {
            this.f25229a.mo43932n(f.mo29897b(), x.mo44067c().longValue());
        }
        e = x.mo44067c();
        return e.longValue();
    }

    /* renamed from: I */
    public float mo29857I() {
        Float e;
        C4337b.C4358t f = C4337b.C4358t.m35058f();
        rw2<Float> w = mo29890w(f);
        if (!w.mo44068d() || !mo29862N(w.mo44067c().floatValue())) {
            w = mo29872d(f);
            if (!w.mo44068d() || !mo29862N(w.mo44067c().floatValue())) {
                e = f.mo29894a();
                return e.floatValue();
            }
        } else {
            this.f25229a.mo43931m(f.mo29897b(), w.mo44067c().floatValue());
        }
        e = w.mo44067c();
        return e.floatValue();
    }

    /* renamed from: J */
    public final boolean mo29858J(long j) {
        return j >= 0;
    }

    /* renamed from: K */
    public final boolean mo29859K(String str) {
        if (str.trim().isEmpty()) {
            return false;
        }
        for (String trim : str.split(";")) {
            if (trim.trim().equals(C4898cp.f27022c)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: L */
    public final boolean mo29860L(long j) {
        return j >= 0;
    }

    /* renamed from: M */
    public boolean mo29861M() {
        Boolean k = mo29878k();
        return (k == null || k.booleanValue()) && mo29881n();
    }

    /* renamed from: N */
    public final boolean mo29862N(float f) {
        return 0.0f <= f && f <= 1.0f;
    }

    /* renamed from: O */
    public final boolean mo29863O(long j) {
        return j > 0;
    }

    /* renamed from: P */
    public final boolean mo29864P(long j) {
        return j > 0;
    }

    /* renamed from: Q */
    public void mo29865Q(Context context) {
        f25226a.mo46007i(br4.m40322c(context));
        this.f25229a.mo43930l(context);
    }

    /* renamed from: R */
    public void mo29866R(Context context) {
        mo29865Q(context.getApplicationContext());
    }

    @hw4
    /* renamed from: S */
    public void mo29867S(rk0 rk0) {
        this.f25229a = rk0;
    }

    /* renamed from: T */
    public void mo29868T(Boolean bool) {
        String b;
        if (mo29877j().booleanValue() || (b = C4337b.C4339b.m34958f().mo29897b()) == null) {
            return;
        }
        if (bool != null) {
            this.f25229a.mo43934p(b, Boolean.TRUE.equals(bool));
        } else {
            this.f25229a.mo43923b(b);
        }
    }

    /* renamed from: U */
    public void mo29869U(kp1 kp1) {
        this.f25228a = kp1;
    }

    /* renamed from: b */
    public String mo29870b() {
        String g;
        C4337b.C4342e f = C4337b.C4342e.m34975f();
        if (C4898cp.f27018a.booleanValue()) {
            return f.mo29894a();
        }
        String d = f.mo29899d();
        long j = -1;
        if (d != null) {
            j = ((Long) this.f25227a.getRemoteConfigValueOrDefault(d, -1L)).longValue();
        }
        String b = f.mo29897b();
        if (!C4337b.C4342e.m34977h(j) || (g = C4337b.C4342e.m34976g(j)) == null) {
            rw2<String> f2 = mo29874f(f);
            return f2.mo44068d() ? f2.mo44067c() : f.mo29894a();
        }
        this.f25229a.mo43933o(b, g);
        return g;
    }

    /* renamed from: c */
    public final rw2<Boolean> mo29871c(m50<Boolean> m50) {
        return this.f25229a.mo43925e(m50.mo29897b());
    }

    /* renamed from: d */
    public final rw2<Float> mo29872d(m50<Float> m50) {
        return this.f25229a.mo43927g(m50.mo29897b());
    }

    /* renamed from: e */
    public final rw2<Long> mo29873e(m50<Long> m50) {
        return this.f25229a.mo43928i(m50.mo29897b());
    }

    /* renamed from: f */
    public final rw2<String> mo29874f(m50<String> m50) {
        return this.f25229a.mo43929j(m50.mo29897b());
    }

    /* renamed from: g */
    public float mo29875g() {
        Float e;
        C4337b.C4341d f = C4337b.C4341d.m34969f();
        rw2<Float> p = mo29883p(f);
        if (p.mo44068d()) {
            float floatValue = p.mo44067c().floatValue() / 100.0f;
            if (mo29862N(floatValue)) {
                return floatValue;
            }
        }
        rw2<Float> w = mo29890w(f);
        if (!w.mo44068d() || !mo29862N(w.mo44067c().floatValue())) {
            w = mo29872d(f);
            if (!w.mo44068d() || !mo29862N(w.mo44067c().floatValue())) {
                e = f.mo29894a();
                return e.floatValue();
            }
        } else {
            this.f25229a.mo43931m(f.mo29897b(), w.mo44067c().floatValue());
        }
        e = w.mo44067c();
        return e.floatValue();
    }

    /* renamed from: i */
    public boolean mo29876i() {
        Boolean e;
        C4337b.C4340c f = C4337b.C4340c.m34963f();
        rw2<Boolean> o = mo29882o(f);
        if (!o.mo44068d()) {
            o = mo29889v(f);
            if (o.mo44068d()) {
                this.f25229a.mo43934p(f.mo29897b(), o.mo44067c().booleanValue());
            } else {
                o = mo29871c(f);
                if (!o.mo44068d()) {
                    e = f.mo29894a();
                    return e.booleanValue();
                }
            }
        }
        e = o.mo44067c();
        return e.booleanValue();
    }

    @ts2
    /* renamed from: j */
    public Boolean mo29877j() {
        C4337b.C4338a f = C4337b.C4338a.m34954f();
        rw2<Boolean> o = mo29882o(f);
        return o.mo44068d() ? o.mo44067c() : f.mo29894a();
    }

    @ts2
    /* renamed from: k */
    public Boolean mo29878k() {
        Object c;
        if (mo29877j().booleanValue()) {
            return Boolean.FALSE;
        }
        C4337b.C4339b f = C4337b.C4339b.m34958f();
        rw2 c2 = mo29871c(f);
        if (c2.mo44068d()) {
            c = c2.mo44067c();
        } else {
            rw2 o = mo29882o(f);
            if (!o.mo44068d()) {
                return null;
            }
            c = o.mo44067c();
        }
        return (Boolean) c;
    }

    /* renamed from: l */
    public final boolean mo29879l() {
        Boolean e;
        C4337b.C4349k f = C4337b.C4349k.m35007f();
        rw2<Boolean> v = mo29889v(f);
        if (!v.mo44068d()) {
            v = mo29871c(f);
            if (!v.mo44068d()) {
                e = f.mo29894a();
                return e.booleanValue();
            }
        } else if (this.f25227a.isLastFetchFailed()) {
            return false;
        } else {
            this.f25229a.mo43934p(f.mo29897b(), v.mo44067c().booleanValue());
        }
        e = v.mo44067c();
        return e.booleanValue();
    }

    /* renamed from: m */
    public final boolean mo29880m() {
        String e;
        C4337b.C4348j f = C4337b.C4348j.m35002f();
        rw2<String> y = mo29892y(f);
        if (y.mo44068d()) {
            this.f25229a.mo43933o(f.mo29897b(), y.mo44067c());
        } else {
            y = mo29874f(f);
            if (!y.mo44068d()) {
                e = f.mo29894a();
                return mo29859K(e);
            }
        }
        e = y.mo44067c();
        return mo29859K(e);
    }

    /* renamed from: n */
    public boolean mo29881n() {
        return mo29879l() && !mo29880m();
    }

    /* renamed from: o */
    public final rw2<Boolean> mo29882o(m50<Boolean> m50) {
        return this.f25228a.mo39396b(m50.mo29895c());
    }

    /* renamed from: p */
    public final rw2<Float> mo29883p(m50<Float> m50) {
        return this.f25228a.mo39397c(m50.mo29895c());
    }

    /* renamed from: q */
    public final rw2<Long> mo29884q(m50<Long> m50) {
        return this.f25228a.mo39399e(m50.mo29895c());
    }

    /* renamed from: r */
    public long mo29885r() {
        Long e;
        C4337b.C4344f f = C4337b.C4344f.m34982f();
        rw2<Long> x = mo29891x(f);
        if (!x.mo44068d() || !mo29858J(x.mo44067c().longValue())) {
            x = mo29873e(f);
            if (!x.mo44068d() || !mo29858J(x.mo44067c().longValue())) {
                e = f.mo29894a();
                return e.longValue();
            }
        } else {
            this.f25229a.mo43932n(f.mo29897b(), x.mo44067c().longValue());
        }
        e = x.mo44067c();
        return e.longValue();
    }

    /* renamed from: s */
    public long mo29886s() {
        Long e;
        C4337b.C4345g f = C4337b.C4345g.m34987f();
        rw2<Long> x = mo29891x(f);
        if (!x.mo44068d() || !mo29858J(x.mo44067c().longValue())) {
            x = mo29873e(f);
            if (!x.mo44068d() || !mo29858J(x.mo44067c().longValue())) {
                e = f.mo29894a();
                return e.longValue();
            }
        } else {
            this.f25229a.mo43932n(f.mo29897b(), x.mo44067c().longValue());
        }
        e = x.mo44067c();
        return e.longValue();
    }

    /* renamed from: t */
    public float mo29887t() {
        Float e;
        C4337b.C4346h f = C4337b.C4346h.m34992f();
        rw2<Float> w = mo29890w(f);
        if (!w.mo44068d() || !mo29862N(w.mo44067c().floatValue())) {
            w = mo29872d(f);
            if (!w.mo44068d() || !mo29862N(w.mo44067c().floatValue())) {
                e = f.mo29894a();
                return e.floatValue();
            }
        } else {
            this.f25229a.mo43931m(f.mo29897b(), w.mo44067c().floatValue());
        }
        e = w.mo44067c();
        return e.floatValue();
    }

    /* renamed from: u */
    public long mo29888u() {
        Long e;
        C4337b.C4347i f = C4337b.C4347i.m34997f();
        rw2<Long> x = mo29891x(f);
        if (!x.mo44068d() || !mo29864P(x.mo44067c().longValue())) {
            x = mo29873e(f);
            if (!x.mo44068d() || !mo29864P(x.mo44067c().longValue())) {
                e = f.mo29894a();
                return e.longValue();
            }
        } else {
            this.f25229a.mo43932n(f.mo29897b(), x.mo44067c().longValue());
        }
        e = x.mo44067c();
        return e.longValue();
    }

    /* renamed from: v */
    public final rw2<Boolean> mo29889v(m50<Boolean> m50) {
        return this.f25227a.getBoolean(m50.mo29899d());
    }

    /* renamed from: w */
    public final rw2<Float> mo29890w(m50<Float> m50) {
        return this.f25227a.getFloat(m50.mo29899d());
    }

    /* renamed from: x */
    public final rw2<Long> mo29891x(m50<Long> m50) {
        return this.f25227a.getLong(m50.mo29899d());
    }

    /* renamed from: y */
    public final rw2<String> mo29892y(m50<String> m50) {
        return this.f25227a.getString(m50.mo29899d());
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.onedelhi.secure.m50, com.onedelhi.secure.m50<java.lang.Long>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Long mo29893z(com.onedelhi.secure.m50<java.lang.Long> r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.mo29899d()
            if (r0 != 0) goto L_0x000b
            java.lang.Object r3 = r3.mo29894a()
            goto L_0x0017
        L_0x000b:
            com.google.firebase.perf.config.RemoteConfigManager r1 = r2.f25227a
            java.lang.Object r3 = r3.mo29894a()
            java.lang.Long r3 = (java.lang.Long) r3
            java.lang.Object r3 = r1.getRemoteConfigValueOrDefault(r0, r3)
        L_0x0017:
            java.lang.Long r3 = (java.lang.Long) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.config.C4336a.mo29893z(com.onedelhi.secure.m50):java.lang.Long");
    }
}
