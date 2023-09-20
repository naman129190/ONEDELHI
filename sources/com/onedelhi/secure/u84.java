package com.onedelhi.secure;

import com.onedelhi.secure.vs1;

public enum u84 implements vs1.C7081c {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    UNRECOGNIZED(-1);
    

    /* renamed from: a */
    public static final vs1.C7082d<u84> f36006a = null;

    /* renamed from: o */
    public static final int f36010o = 0;

    /* renamed from: p */
    public static final int f36011p = 1;

    /* renamed from: n */
    public final int f36012n;

    /* renamed from: com.onedelhi.secure.u84$a */
    public static class C6942a implements vs1.C7082d<u84> {
        /* renamed from: b */
        public u84 mo32393a(int i) {
            return u84.m66907a(i);
        }
    }

    /* renamed from: com.onedelhi.secure.u84$b */
    public static final class C6943b implements vs1.C7083e {

        /* renamed from: a */
        public static final vs1.C7083e f36013a = null;

        static {
            f36013a = new C6943b();
        }

        /* renamed from: a */
        public boolean mo32395a(int i) {
            return u84.m66907a(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        f36006a = new C6942a();
    }

    /* access modifiers changed from: public */
    u84(int i) {
        this.f36012n = i;
    }

    /* renamed from: a */
    public static u84 m66907a(int i) {
        if (i == 0) {
            return SYNTAX_PROTO2;
        }
        if (i != 1) {
            return null;
        }
        return SYNTAX_PROTO3;
    }

    /* renamed from: b */
    public static vs1.C7082d<u84> m66908b() {
        return f36006a;
    }

    /* renamed from: e */
    public static vs1.C7083e m66909e() {
        return C6943b.f36013a;
    }

    @Deprecated
    /* renamed from: g */
    public static u84 m66910g(int i) {
        return m66907a(i);
    }

    /* renamed from: j */
    public final int mo32392j() {
        if (this != UNRECOGNIZED) {
            return this.f36012n;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
