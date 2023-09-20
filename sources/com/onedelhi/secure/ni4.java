package com.onedelhi.secure;

import android.content.Context;
import com.onedelhi.secure.hl3;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Callable;

@nz3
public class ni4 implements ei4 {

    /* renamed from: a */
    public static volatile oi4 f17442a;

    /* renamed from: a */
    public final C2106ez f17443a;

    /* renamed from: a */
    public final fp4 f17444a;

    /* renamed from: a */
    public final or3 f17445a;

    /* renamed from: b */
    public final C2106ez f17446b;

    @qq1
    public ni4(@rw4 C2106ez ezVar, @uk2 C2106ez ezVar2, or3 or3, fp4 fp4, gy4 gy4) {
        this.f17443a = ezVar;
        this.f17446b = ezVar2;
        this.f17445a = or3;
        this.f17444a = fp4;
        gy4.mo17022c();
    }

    /* renamed from: c */
    public static ni4 m22859c() {
        oi4 oi4 = f17442a;
        if (oi4 != null) {
            return oi4.mo13005b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* renamed from: d */
    public static Set<hu0> m22860d(ek0 ek0) {
        return ek0 instanceof wt0 ? Collections.unmodifiableSet(((wt0) ek0).mo21446b()) : Collections.singleton(hu0.m16939b("proto"));
    }

    /* renamed from: f */
    public static void m22861f(Context context) {
        if (f17442a == null) {
            synchronized (ni4.class) {
                if (f17442a == null) {
                    f17442a = ad0.m11091c().mo13007a(context).mo13008b();
                }
            }
        }
    }

    @hw4
    @hl3({hl3.C2354a.TESTS})
    /* renamed from: i */
    public static void m22862i(oi4 oi4, Callable<Void> callable) throws Throwable {
        oi4 oi42;
        Class<ni4> cls = ni4.class;
        synchronized (cls) {
            oi42 = f17442a;
            f17442a = oi4;
        }
        try {
            callable.call();
            synchronized (cls) {
                f17442a = oi42;
            }
        } catch (Throwable th) {
            synchronized (cls) {
                f17442a = oi42;
                throw th;
            }
        }
    }

    /* renamed from: a */
    public void mo15194a(wt3 wt3, qi4 qi4) {
        this.f17445a.mo22059a(wt3.mo18410f().mo26924f(wt3.mo18407c().mo23459c()), mo21296b(wt3), qi4);
    }

    /* renamed from: b */
    public final uv0 mo21296b(wt3 wt3) {
        return uv0.m29608a().mo25594i(this.f17443a.mo15656a()).mo25596k(this.f17446b.mo15656a()).mo25595j(wt3.mo18411g()).mo25593h(new xt0(wt3.mo18406b(), wt3.mo26684d())).mo25592g(wt3.mo18407c().mo23457a()).mo25589d();
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    /* renamed from: e */
    public fp4 mo21297e() {
        return this.f17444a;
    }

    /* renamed from: g */
    public yh4 mo21298g(ek0 ek0) {
        return new zh4(m22860d(ek0), xh4.m31443a().mo23183b(ek0.getName()).mo23184c(ek0.mo15217a()).mo23182a(), this);
    }

    @Deprecated
    /* renamed from: h */
    public yh4 mo21299h(String str) {
        return new zh4(m22860d((ek0) null), xh4.m31443a().mo23183b(str).mo23182a(), this);
    }
}
