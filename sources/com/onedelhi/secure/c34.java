package com.onedelhi.secure;

public final class c34 {

    /* renamed from: b */
    public static final int f26621b = 12;

    /* renamed from: c */
    public static final int f26622c = 7;

    /* renamed from: d */
    public static final int f26623d = 0;

    /* renamed from: e */
    public static final int f26624e = 1;

    /* renamed from: f */
    public static final int f26625f = 2;

    /* renamed from: g */
    public static final int f26626g = 3;

    /* renamed from: h */
    public static final int f26627h = 4;

    /* renamed from: i */
    public static final int f26628i = 5;

    /* renamed from: j */
    public static final int f26629j = 6;

    /* renamed from: k */
    public static final int f26630k = 7;

    /* renamed from: l */
    public static final int f26631l = 8;

    /* renamed from: m */
    public static final int f26632m = 9;

    /* renamed from: n */
    public static final int f26633n = 10;

    /* renamed from: o */
    public static final int f26634o = 11;

    /* renamed from: a */
    public int f26635a;

    public c34() {
    }

    public c34(c34 c34) {
        this.f26635a = c34.f26635a;
    }

    /* renamed from: a */
    public int mo32226a() {
        return this.f26635a;
    }

    /* renamed from: b */
    public boolean mo32227b() {
        return this.f26635a < 7;
    }

    /* renamed from: c */
    public void mo32228c() {
        this.f26635a = 0;
    }

    /* renamed from: d */
    public void mo32229d(c34 c34) {
        this.f26635a = c34.f26635a;
    }

    /* renamed from: e */
    public void mo32230e() {
        int i = this.f26635a;
        this.f26635a = i <= 3 ? 0 : i <= 9 ? i - 3 : i - 6;
    }

    /* renamed from: f */
    public void mo32231f() {
        this.f26635a = this.f26635a < 7 ? 8 : 11;
    }

    /* renamed from: g */
    public void mo32232g() {
        int i = 7;
        if (this.f26635a >= 7) {
            i = 10;
        }
        this.f26635a = i;
    }

    /* renamed from: h */
    public void mo32233h() {
        this.f26635a = this.f26635a < 7 ? 9 : 11;
    }
}
