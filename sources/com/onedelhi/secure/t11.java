package com.onedelhi.secure;

import com.onedelhi.secure.vs1;

public enum t11 implements vs1.C7081c {
    FIELD_BEHAVIOR_UNSPECIFIED(0),
    OPTIONAL(1),
    REQUIRED(2),
    OUTPUT_ONLY(3),
    INPUT_ONLY(4),
    IMMUTABLE(5),
    UNRECOGNIZED(-1);
    

    /* renamed from: a */
    public static final vs1.C7082d<t11> f35344a = null;

    /* renamed from: o */
    public static final int f35352o = 0;

    /* renamed from: p */
    public static final int f35353p = 1;

    /* renamed from: q */
    public static final int f35354q = 2;

    /* renamed from: r */
    public static final int f35355r = 3;

    /* renamed from: s */
    public static final int f35356s = 4;

    /* renamed from: t */
    public static final int f35357t = 5;

    /* renamed from: n */
    public final int f35358n;

    /* renamed from: com.onedelhi.secure.t11$a */
    public class C6824a implements vs1.C7082d<t11> {
        /* renamed from: b */
        public t11 mo32393a(int i) {
            return t11.m65143a(i);
        }
    }

    /* renamed from: com.onedelhi.secure.t11$b */
    public static final class C6825b implements vs1.C7083e {

        /* renamed from: a */
        public static final vs1.C7083e f35359a = null;

        static {
            f35359a = new C6825b();
        }

        /* renamed from: a */
        public boolean mo32395a(int i) {
            return t11.m65143a(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        f35344a = new C6824a();
    }

    /* access modifiers changed from: public */
    t11(int i) {
        this.f35358n = i;
    }

    /* renamed from: a */
    public static t11 m65143a(int i) {
        if (i == 0) {
            return FIELD_BEHAVIOR_UNSPECIFIED;
        }
        if (i == 1) {
            return OPTIONAL;
        }
        if (i == 2) {
            return REQUIRED;
        }
        if (i == 3) {
            return OUTPUT_ONLY;
        }
        if (i == 4) {
            return INPUT_ONLY;
        }
        if (i != 5) {
            return null;
        }
        return IMMUTABLE;
    }

    /* renamed from: b */
    public static vs1.C7082d<t11> m65144b() {
        return f35344a;
    }

    /* renamed from: e */
    public static vs1.C7083e m65145e() {
        return C6825b.f35359a;
    }

    @Deprecated
    /* renamed from: g */
    public static t11 m65146g(int i) {
        return m65143a(i);
    }

    /* renamed from: j */
    public final int mo32392j() {
        if (this != UNRECOGNIZED) {
            return this.f35358n;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
