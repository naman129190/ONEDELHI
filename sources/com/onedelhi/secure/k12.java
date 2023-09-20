package com.onedelhi.secure;

import com.onedelhi.secure.vs1;

public enum k12 implements vs1.C7081c {
    LAUNCH_STAGE_UNSPECIFIED(0),
    EARLY_ACCESS(1),
    ALPHA(2),
    BETA(3),
    GA(4),
    DEPRECATED(5),
    UNRECOGNIZED(-1);
    

    /* renamed from: a */
    public static final vs1.C7082d<k12> f31061a = null;

    /* renamed from: o */
    public static final int f31069o = 0;

    /* renamed from: p */
    public static final int f31070p = 1;

    /* renamed from: q */
    public static final int f31071q = 2;

    /* renamed from: r */
    public static final int f31072r = 3;

    /* renamed from: s */
    public static final int f31073s = 4;

    /* renamed from: t */
    public static final int f31074t = 5;

    /* renamed from: n */
    public final int f31075n;

    /* renamed from: com.onedelhi.secure.k12$a */
    public class C5867a implements vs1.C7082d<k12> {
        /* renamed from: b */
        public k12 mo32393a(int i) {
            return k12.m54001a(i);
        }
    }

    /* renamed from: com.onedelhi.secure.k12$b */
    public static final class C5868b implements vs1.C7083e {

        /* renamed from: a */
        public static final vs1.C7083e f31076a = null;

        static {
            f31076a = new C5868b();
        }

        /* renamed from: a */
        public boolean mo32395a(int i) {
            return k12.m54001a(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        f31061a = new C5867a();
    }

    /* access modifiers changed from: public */
    k12(int i) {
        this.f31075n = i;
    }

    /* renamed from: a */
    public static k12 m54001a(int i) {
        if (i == 0) {
            return LAUNCH_STAGE_UNSPECIFIED;
        }
        if (i == 1) {
            return EARLY_ACCESS;
        }
        if (i == 2) {
            return ALPHA;
        }
        if (i == 3) {
            return BETA;
        }
        if (i == 4) {
            return GA;
        }
        if (i != 5) {
            return null;
        }
        return DEPRECATED;
    }

    /* renamed from: b */
    public static vs1.C7082d<k12> m54002b() {
        return f31061a;
    }

    /* renamed from: e */
    public static vs1.C7083e m54003e() {
        return C5868b.f31076a;
    }

    @Deprecated
    /* renamed from: g */
    public static k12 m54004g(int i) {
        return m54001a(i);
    }

    /* renamed from: j */
    public final int mo32392j() {
        if (this != UNRECOGNIZED) {
            return this.f31075n;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
