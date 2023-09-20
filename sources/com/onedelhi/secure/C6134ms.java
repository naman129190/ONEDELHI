package com.onedelhi.secure;

import com.onedelhi.secure.vs1;

/* renamed from: com.onedelhi.secure.ms */
public enum C6134ms implements vs1.C7081c {
    CALENDAR_PERIOD_UNSPECIFIED(0),
    DAY(1),
    WEEK(2),
    FORTNIGHT(3),
    MONTH(4),
    QUARTER(5),
    HALF(6),
    YEAR(7),
    UNRECOGNIZED(-1);
    

    /* renamed from: a */
    public static final vs1.C7082d<C6134ms> f32227a = null;

    /* renamed from: o */
    public static final int f32237o = 0;

    /* renamed from: p */
    public static final int f32238p = 1;

    /* renamed from: q */
    public static final int f32239q = 2;

    /* renamed from: r */
    public static final int f32240r = 3;

    /* renamed from: s */
    public static final int f32241s = 4;

    /* renamed from: t */
    public static final int f32242t = 5;

    /* renamed from: u */
    public static final int f32243u = 6;

    /* renamed from: v */
    public static final int f32244v = 7;

    /* renamed from: n */
    public final int f32245n;

    /* renamed from: com.onedelhi.secure.ms$a */
    public class C6135a implements vs1.C7082d<C6134ms> {
        /* renamed from: b */
        public C6134ms mo32393a(int i) {
            return C6134ms.m57507a(i);
        }
    }

    /* renamed from: com.onedelhi.secure.ms$b */
    public static final class C6136b implements vs1.C7083e {

        /* renamed from: a */
        public static final vs1.C7083e f32246a = null;

        static {
            f32246a = new C6136b();
        }

        /* renamed from: a */
        public boolean mo32395a(int i) {
            return C6134ms.m57507a(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        f32227a = new C6135a();
    }

    /* access modifiers changed from: public */
    C6134ms(int i) {
        this.f32245n = i;
    }

    /* renamed from: a */
    public static C6134ms m57507a(int i) {
        switch (i) {
            case 0:
                return CALENDAR_PERIOD_UNSPECIFIED;
            case 1:
                return DAY;
            case 2:
                return WEEK;
            case 3:
                return FORTNIGHT;
            case 4:
                return MONTH;
            case 5:
                return QUARTER;
            case 6:
                return HALF;
            case 7:
                return YEAR;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static vs1.C7082d<C6134ms> m57508b() {
        return f32227a;
    }

    /* renamed from: e */
    public static vs1.C7083e m57509e() {
        return C6136b.f32246a;
    }

    @Deprecated
    /* renamed from: g */
    public static C6134ms m57510g(int i) {
        return m57507a(i);
    }

    /* renamed from: j */
    public final int mo32392j() {
        if (this != UNRECOGNIZED) {
            return this.f32245n;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
