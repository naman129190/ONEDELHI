package com.onedelhi.secure;

import com.onedelhi.secure.vs1;

/* renamed from: com.onedelhi.secure.o9 */
public enum C6256o9 implements vs1.C7081c {
    APPLICATION_PROCESS_STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGROUND(2),
    FOREGROUND_BACKGROUND(3);
    

    /* renamed from: a */
    public static final vs1.C7082d<C6256o9> f32929a = null;

    /* renamed from: o */
    public static final int f32934o = 0;

    /* renamed from: p */
    public static final int f32935p = 1;

    /* renamed from: q */
    public static final int f32936q = 2;

    /* renamed from: r */
    public static final int f32937r = 3;

    /* renamed from: n */
    public final int f32938n;

    /* renamed from: com.onedelhi.secure.o9$a */
    public class C6257a implements vs1.C7082d<C6256o9> {
        /* renamed from: b */
        public C6256o9 mo32393a(int i) {
            return C6256o9.m59111a(i);
        }
    }

    /* renamed from: com.onedelhi.secure.o9$b */
    public static final class C6258b implements vs1.C7083e {

        /* renamed from: a */
        public static final vs1.C7083e f32939a = null;

        static {
            f32939a = new C6258b();
        }

        /* renamed from: a */
        public boolean mo32395a(int i) {
            return C6256o9.m59111a(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        f32929a = new C6257a();
    }

    /* access modifiers changed from: public */
    C6256o9(int i) {
        this.f32938n = i;
    }

    /* renamed from: a */
    public static C6256o9 m59111a(int i) {
        if (i == 0) {
            return APPLICATION_PROCESS_STATE_UNKNOWN;
        }
        if (i == 1) {
            return FOREGROUND;
        }
        if (i == 2) {
            return BACKGROUND;
        }
        if (i != 3) {
            return null;
        }
        return FOREGROUND_BACKGROUND;
    }

    /* renamed from: b */
    public static vs1.C7082d<C6256o9> m59112b() {
        return f32929a;
    }

    /* renamed from: e */
    public static vs1.C7083e m59113e() {
        return C6258b.f32939a;
    }

    @Deprecated
    /* renamed from: g */
    public static C6256o9 m59114g(int i) {
        return m59111a(i);
    }

    /* renamed from: j */
    public final int mo32392j() {
        return this.f32938n;
    }
}
