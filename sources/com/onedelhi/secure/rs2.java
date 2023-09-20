package com.onedelhi.secure;

import com.onedelhi.secure.vs1;

public enum rs2 implements vs1.C7081c {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);
    

    /* renamed from: a */
    public static final vs1.C7082d<rs2> f34741a = null;

    /* renamed from: o */
    public static final int f34744o = 0;

    /* renamed from: n */
    public final int f34745n;

    /* renamed from: com.onedelhi.secure.rs2$a */
    public static class C6710a implements vs1.C7082d<rs2> {
        /* renamed from: b */
        public rs2 mo32393a(int i) {
            return rs2.m63825a(i);
        }
    }

    /* renamed from: com.onedelhi.secure.rs2$b */
    public static final class C6711b implements vs1.C7083e {

        /* renamed from: a */
        public static final vs1.C7083e f34746a = null;

        static {
            f34746a = new C6711b();
        }

        /* renamed from: a */
        public boolean mo32395a(int i) {
            return rs2.m63825a(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        f34741a = new C6710a();
    }

    /* access modifiers changed from: public */
    rs2(int i) {
        this.f34745n = i;
    }

    /* renamed from: a */
    public static rs2 m63825a(int i) {
        if (i != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    /* renamed from: b */
    public static vs1.C7082d<rs2> m63826b() {
        return f34741a;
    }

    /* renamed from: e */
    public static vs1.C7083e m63827e() {
        return C6711b.f34746a;
    }

    @Deprecated
    /* renamed from: g */
    public static rs2 m63828g(int i) {
        return m63825a(i);
    }

    /* renamed from: j */
    public final int mo32392j() {
        if (this != UNRECOGNIZED) {
            return this.f34745n;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
