package com.onedelhi.secure;

import com.onedelhi.secure.vs1;

public enum se0 implements vs1.C7081c {
    DAY_OF_WEEK_UNSPECIFIED(0),
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7),
    UNRECOGNIZED(-1);
    

    /* renamed from: a */
    public static final vs1.C7082d<se0> f34988a = null;

    /* renamed from: o */
    public static final int f34998o = 0;

    /* renamed from: p */
    public static final int f34999p = 1;

    /* renamed from: q */
    public static final int f35000q = 2;

    /* renamed from: r */
    public static final int f35001r = 3;

    /* renamed from: s */
    public static final int f35002s = 4;

    /* renamed from: t */
    public static final int f35003t = 5;

    /* renamed from: u */
    public static final int f35004u = 6;

    /* renamed from: v */
    public static final int f35005v = 7;

    /* renamed from: n */
    public final int f35006n;

    /* renamed from: com.onedelhi.secure.se0$a */
    public class C6757a implements vs1.C7082d<se0> {
        /* renamed from: b */
        public se0 mo32393a(int i) {
            return se0.m64473a(i);
        }
    }

    /* renamed from: com.onedelhi.secure.se0$b */
    public static final class C6758b implements vs1.C7083e {

        /* renamed from: a */
        public static final vs1.C7083e f35007a = null;

        static {
            f35007a = new C6758b();
        }

        /* renamed from: a */
        public boolean mo32395a(int i) {
            return se0.m64473a(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        f34988a = new C6757a();
    }

    /* access modifiers changed from: public */
    se0(int i) {
        this.f35006n = i;
    }

    /* renamed from: a */
    public static se0 m64473a(int i) {
        switch (i) {
            case 0:
                return DAY_OF_WEEK_UNSPECIFIED;
            case 1:
                return MONDAY;
            case 2:
                return TUESDAY;
            case 3:
                return WEDNESDAY;
            case 4:
                return THURSDAY;
            case 5:
                return FRIDAY;
            case 6:
                return SATURDAY;
            case 7:
                return SUNDAY;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static vs1.C7082d<se0> m64474b() {
        return f34988a;
    }

    /* renamed from: e */
    public static vs1.C7083e m64475e() {
        return C6758b.f35007a;
    }

    @Deprecated
    /* renamed from: g */
    public static se0 m64476g(int i) {
        return m64473a(i);
    }

    /* renamed from: j */
    public final int mo32392j() {
        if (this != UNRECOGNIZED) {
            return this.f35006n;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
