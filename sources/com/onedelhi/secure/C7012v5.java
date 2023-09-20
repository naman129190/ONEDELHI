package com.onedelhi.secure;

import java.util.Locale;

/* renamed from: com.onedelhi.secure.v5 */
public class C7012v5 {

    /* renamed from: a */
    public static volatile C7012v5 f36428a;

    /* renamed from: a */
    public final k92 f36429a;

    /* renamed from: a */
    public boolean f36430a;

    public C7012v5() {
        this((k92) null);
    }

    @hw4
    public C7012v5(k92 k92) {
        this.f36430a = false;
        this.f36429a = k92 == null ? k92.m54160c() : k92;
    }

    /* renamed from: e */
    public static C7012v5 m67717e() {
        if (f36428a == null) {
            synchronized (C7012v5.class) {
                if (f36428a == null) {
                    f36428a = new C7012v5();
                }
            }
        }
        return f36428a;
    }

    /* renamed from: a */
    public void mo46000a(String str) {
        if (this.f36430a) {
            this.f36429a.mo39125a(str);
        }
    }

    /* renamed from: b */
    public void mo46001b(String str, Object... objArr) {
        if (this.f36430a) {
            this.f36429a.mo39125a(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    /* renamed from: c */
    public void mo46002c(String str) {
        if (this.f36430a) {
            this.f36429a.mo39126b(str);
        }
    }

    /* renamed from: d */
    public void mo46003d(String str, Object... objArr) {
        if (this.f36430a) {
            this.f36429a.mo39126b(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    /* renamed from: f */
    public void mo46004f(String str) {
        if (this.f36430a) {
            this.f36429a.mo39127d(str);
        }
    }

    /* renamed from: g */
    public void mo46005g(String str, Object... objArr) {
        if (this.f36430a) {
            this.f36429a.mo39127d(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    /* renamed from: h */
    public boolean mo46006h() {
        return this.f36430a;
    }

    /* renamed from: i */
    public void mo46007i(boolean z) {
        this.f36430a = z;
    }

    /* renamed from: j */
    public void mo46008j(String str) {
        if (this.f36430a) {
            this.f36429a.mo39128e(str);
        }
    }

    /* renamed from: k */
    public void mo46009k(String str, Object... objArr) {
        if (this.f36430a) {
            this.f36429a.mo39128e(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    /* renamed from: l */
    public void mo46010l(String str) {
        if (this.f36430a) {
            this.f36429a.mo39129f(str);
        }
    }

    /* renamed from: m */
    public void mo46011m(String str, Object... objArr) {
        if (this.f36430a) {
            this.f36429a.mo39129f(String.format(Locale.ENGLISH, str, objArr));
        }
    }
}
