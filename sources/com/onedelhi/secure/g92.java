package com.onedelhi.secure;

import com.onedelhi.secure.vs1;

public enum g92 implements vs1.C7081c {
    DEFAULT(0),
    DEBUG(100),
    INFO(200),
    NOTICE(300),
    WARNING(400),
    ERROR(500),
    CRITICAL(600),
    ALERT(700),
    EMERGENCY(800),
    UNRECOGNIZED(-1);
    

    /* renamed from: a */
    public static final vs1.C7082d<g92> f29073a = null;

    /* renamed from: o */
    public static final int f29084o = 0;

    /* renamed from: p */
    public static final int f29085p = 100;

    /* renamed from: q */
    public static final int f29086q = 200;

    /* renamed from: r */
    public static final int f29087r = 300;

    /* renamed from: s */
    public static final int f29088s = 400;

    /* renamed from: t */
    public static final int f29089t = 500;

    /* renamed from: u */
    public static final int f29090u = 600;

    /* renamed from: v */
    public static final int f29091v = 700;

    /* renamed from: w */
    public static final int f29092w = 800;

    /* renamed from: n */
    public final int f29093n;

    /* renamed from: com.onedelhi.secure.g92$a */
    public class C5394a implements vs1.C7082d<g92> {
        /* renamed from: b */
        public g92 mo32393a(int i) {
            return g92.m49174a(i);
        }
    }

    /* renamed from: com.onedelhi.secure.g92$b */
    public static final class C5395b implements vs1.C7083e {

        /* renamed from: a */
        public static final vs1.C7083e f29094a = null;

        static {
            f29094a = new C5395b();
        }

        /* renamed from: a */
        public boolean mo32395a(int i) {
            return g92.m49174a(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        f29073a = new C5394a();
    }

    /* access modifiers changed from: public */
    g92(int i) {
        this.f29093n = i;
    }

    /* renamed from: a */
    public static g92 m49174a(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i == 100) {
            return DEBUG;
        }
        if (i == 200) {
            return INFO;
        }
        if (i == 300) {
            return NOTICE;
        }
        if (i == 400) {
            return WARNING;
        }
        if (i == 500) {
            return ERROR;
        }
        if (i == 600) {
            return CRITICAL;
        }
        if (i == 700) {
            return ALERT;
        }
        if (i != 800) {
            return null;
        }
        return EMERGENCY;
    }

    /* renamed from: b */
    public static vs1.C7082d<g92> m49175b() {
        return f29073a;
    }

    /* renamed from: e */
    public static vs1.C7083e m49176e() {
        return C5395b.f29094a;
    }

    @Deprecated
    /* renamed from: g */
    public static g92 m49177g(int i) {
        return m49174a(i);
    }

    /* renamed from: j */
    public final int mo32392j() {
        if (this != UNRECOGNIZED) {
            return this.f29093n;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
