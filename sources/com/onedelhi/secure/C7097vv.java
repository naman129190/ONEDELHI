package com.onedelhi.secure;

import com.onedelhi.secure.vs1;

/* renamed from: com.onedelhi.secure.vv */
public enum C7097vv implements vs1.C7081c {
    CHANGE_TYPE_UNSPECIFIED(0),
    ADDED(1),
    REMOVED(2),
    MODIFIED(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: a */
    public static final vs1.C7082d<C7097vv> f36710a = null;

    /* renamed from: o */
    public static final int f36717o = 0;

    /* renamed from: p */
    public static final int f36718p = 1;

    /* renamed from: q */
    public static final int f36719q = 2;

    /* renamed from: r */
    public static final int f36720r = 3;

    /* renamed from: n */
    public final int f36721n;

    /* renamed from: com.onedelhi.secure.vv$a */
    public class C7098a implements vs1.C7082d<C7097vv> {
        /* renamed from: b */
        public C7097vv mo32393a(int i) {
            return C7097vv.m68513a(i);
        }
    }

    /* renamed from: com.onedelhi.secure.vv$b */
    public static final class C7099b implements vs1.C7083e {

        /* renamed from: a */
        public static final vs1.C7083e f36722a = null;

        static {
            f36722a = new C7099b();
        }

        /* renamed from: a */
        public boolean mo32395a(int i) {
            return C7097vv.m68513a(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        f36710a = new C7098a();
    }

    /* access modifiers changed from: public */
    C7097vv(int i) {
        this.f36721n = i;
    }

    /* renamed from: a */
    public static C7097vv m68513a(int i) {
        if (i == 0) {
            return CHANGE_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return ADDED;
        }
        if (i == 2) {
            return REMOVED;
        }
        if (i != 3) {
            return null;
        }
        return MODIFIED;
    }

    /* renamed from: b */
    public static vs1.C7082d<C7097vv> m68514b() {
        return f36710a;
    }

    /* renamed from: e */
    public static vs1.C7083e m68515e() {
        return C7099b.f36722a;
    }

    @Deprecated
    /* renamed from: g */
    public static C7097vv m68516g(int i) {
        return m68513a(i);
    }

    /* renamed from: j */
    public final int mo32392j() {
        if (this != UNRECOGNIZED) {
            return this.f36721n;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
