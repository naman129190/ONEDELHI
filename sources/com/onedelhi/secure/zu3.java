package com.onedelhi.secure;

import com.onedelhi.secure.vs1;

public enum zu3 implements vs1.C7081c {
    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);
    

    /* renamed from: a */
    public static final vs1.C7082d<zu3> f38435a = null;

    /* renamed from: o */
    public static final int f38439o = 0;

    /* renamed from: p */
    public static final int f38440p = 1;

    /* renamed from: n */
    public final int f38441n;

    /* renamed from: com.onedelhi.secure.zu3$a */
    public class C7515a implements vs1.C7082d<zu3> {
        /* renamed from: b */
        public zu3 mo32393a(int i) {
            return zu3.m74329a(i);
        }
    }

    /* renamed from: com.onedelhi.secure.zu3$b */
    public static final class C7516b implements vs1.C7083e {

        /* renamed from: a */
        public static final vs1.C7083e f38442a = null;

        static {
            f38442a = new C7516b();
        }

        /* renamed from: a */
        public boolean mo32395a(int i) {
            return zu3.m74329a(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        f38435a = new C7515a();
    }

    /* access modifiers changed from: public */
    zu3(int i) {
        this.f38441n = i;
    }

    /* renamed from: a */
    public static zu3 m74329a(int i) {
        if (i == 0) {
            return SESSION_VERBOSITY_NONE;
        }
        if (i != 1) {
            return null;
        }
        return GAUGES_AND_SYSTEM_EVENTS;
    }

    /* renamed from: b */
    public static vs1.C7082d<zu3> m74330b() {
        return f38435a;
    }

    /* renamed from: e */
    public static vs1.C7083e m74331e() {
        return C7516b.f38442a;
    }

    @Deprecated
    /* renamed from: g */
    public static zu3 m74332g(int i) {
        return m74329a(i);
    }

    /* renamed from: j */
    public final int mo32392j() {
        return this.f38441n;
    }
}
