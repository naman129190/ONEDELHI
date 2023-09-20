package com.onedelhi.secure;

import java.io.IOException;
import java.io.InputStream;

public class p02 extends i31 {

    /* renamed from: A */
    public static final int f33404A = 8388608;

    /* renamed from: B */
    public static final int f33405B = 4;

    /* renamed from: C */
    public static final int f33406C = 3;

    /* renamed from: D */
    public static final int f33407D = 0;

    /* renamed from: E */
    public static final int f33408E = 4;

    /* renamed from: F */
    public static final int f33409F = 2;

    /* renamed from: G */
    public static final int f33410G = 0;

    /* renamed from: H */
    public static final int f33411H = 1;

    /* renamed from: I */
    public static final int f33412I = 2;

    /* renamed from: J */
    public static final int f33413J = 8;

    /* renamed from: K */
    public static final int f33414K = 273;

    /* renamed from: L */
    public static final int f33415L = 4;

    /* renamed from: M */
    public static final int f33416M = 20;

    /* renamed from: a */
    public static final int[] f33417a = {262144, 1048576, 2097152, 4194304, 4194304, 8388608, 8388608, 16777216, 33554432, 67108864};

    /* renamed from: b */
    public static final /* synthetic */ boolean f33418b = false;

    /* renamed from: b */
    public static final int[] f33419b = {4, 8, 24, 48};

    /* renamed from: v */
    public static final int f33420v = 0;

    /* renamed from: w */
    public static final int f33421w = 9;

    /* renamed from: x */
    public static final int f33422x = 6;

    /* renamed from: y */
    public static final int f33423y = 4096;

    /* renamed from: z */
    public static final int f33424z = 805306368;

    /* renamed from: a */
    public byte[] f33425a = null;

    /* renamed from: n */
    public int f33426n;

    /* renamed from: o */
    public int f33427o;

    /* renamed from: p */
    public int f33428p;

    /* renamed from: q */
    public int f33429q;

    /* renamed from: r */
    public int f33430r;

    /* renamed from: s */
    public int f33431s;

    /* renamed from: t */
    public int f33432t;

    /* renamed from: u */
    public int f33433u;

    static {
        Class<p02> cls = p02.class;
    }

    public p02() {
        try {
            mo42324B(6);
        } catch (no4 unused) {
            throw new RuntimeException();
        }
    }

    public p02(int i) throws no4 {
        mo42324B(i);
    }

    public p02(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) throws no4 {
        mo42337t(i);
        mo42339v(i2, i3);
        mo42323A(i4);
        mo42342y(i5);
        mo42343z(i6);
        mo42341x(i7);
        mo42336s(i8);
    }

    /* renamed from: A */
    public void mo42323A(int i) throws no4 {
        if (i < 0 || i > 4) {
            throw new no4("pb must not exceed 4: " + i);
        }
        this.f33429q = i;
    }

    /* renamed from: B */
    public void mo42324B(int i) throws no4 {
        if (i < 0 || i > 9) {
            throw new no4("Unsupported preset: " + i);
        }
        this.f33427o = 3;
        this.f33428p = 0;
        this.f33429q = 2;
        this.f33426n = f33417a[i];
        if (i <= 3) {
            this.f33430r = 1;
            this.f33432t = 4;
            this.f33431s = i <= 1 ? 128 : 273;
            this.f33433u = f33419b[i];
            return;
        }
        this.f33430r = 2;
        this.f33432t = 20;
        this.f33431s = i == 4 ? 16 : i == 5 ? 32 : 64;
        this.f33433u = 0;
    }

    /* renamed from: C */
    public void mo42325C(byte[] bArr) {
        this.f33425a = bArr;
    }

    /* renamed from: a */
    public int mo32375a() {
        int i = this.f33426n - 1;
        int i2 = i | (i >>> 2);
        int i3 = i2 | (i2 >>> 3);
        int i4 = i3 | (i3 >>> 4);
        int i5 = i4 | (i4 >>> 8);
        return o02.m58882d((i5 | (i5 >>> 16)) + 1);
    }

    /* renamed from: c */
    public int mo32376c() {
        return this.f33430r == 0 ? kn4.m54599b() : q02.m61797c(this);
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new RuntimeException();
        }
    }

    /* renamed from: e */
    public h31 mo37820e() {
        return new n02(this);
    }

    /* renamed from: g */
    public InputStream mo37822g(InputStream inputStream, C4477aa aaVar) throws IOException {
        return new o02(inputStream, this.f33426n, this.f33425a, aaVar);
    }

    /* renamed from: i */
    public q31 mo37824i(q31 q31, C4477aa aaVar) {
        return this.f33430r == 0 ? new kn4(q31, aaVar) : new q02(q31, this, aaVar);
    }

    /* renamed from: j */
    public int mo42327j() {
        return this.f33433u;
    }

    /* renamed from: k */
    public int mo42328k() {
        return this.f33426n;
    }

    /* renamed from: l */
    public int mo42329l() {
        return this.f33427o;
    }

    /* renamed from: m */
    public int mo42330m() {
        return this.f33428p;
    }

    /* renamed from: n */
    public int mo42331n() {
        return this.f33432t;
    }

    /* renamed from: o */
    public int mo42332o() {
        return this.f33430r;
    }

    /* renamed from: p */
    public int mo42333p() {
        return this.f33431s;
    }

    /* renamed from: q */
    public int mo42334q() {
        return this.f33429q;
    }

    /* renamed from: r */
    public byte[] mo42335r() {
        return this.f33425a;
    }

    /* renamed from: s */
    public void mo42336s(int i) throws no4 {
        if (i >= 0) {
            this.f33433u = i;
            return;
        }
        throw new no4("Depth limit cannot be negative: " + i);
    }

    /* renamed from: t */
    public void mo42337t(int i) throws no4 {
        if (i < 4096) {
            throw new no4("LZMA2 dictionary size must be at least 4 KiB: " + i + " B");
        } else if (i <= 805306368) {
            this.f33426n = i;
        } else {
            throw new no4("LZMA2 dictionary size must not exceed 768 MiB: " + i + " B");
        }
    }

    /* renamed from: u */
    public void mo42338u(int i) throws no4 {
        mo42339v(i, this.f33428p);
    }

    /* renamed from: v */
    public void mo42339v(int i, int i2) throws no4 {
        if (i < 0 || i2 < 0 || i > 4 || i2 > 4 || i + i2 > 4) {
            throw new no4("lc + lp must not exceed 4: " + i + " + " + i2);
        }
        this.f33427o = i;
        this.f33428p = i2;
    }

    /* renamed from: w */
    public void mo42340w(int i) throws no4 {
        mo42339v(this.f33427o, i);
    }

    /* renamed from: x */
    public void mo42341x(int i) throws no4 {
        if (i == 4 || i == 20) {
            this.f33432t = i;
            return;
        }
        throw new no4("Unsupported match finder: " + i);
    }

    /* renamed from: y */
    public void mo42342y(int i) throws no4 {
        if (i < 0 || i > 2) {
            throw new no4("Unsupported compression mode: " + i);
        }
        this.f33430r = i;
    }

    /* renamed from: z */
    public void mo42343z(int i) throws no4 {
        if (i < 8) {
            throw new no4("Minimum nice length of matches is 8 bytes: " + i);
        } else if (i <= 273) {
            this.f33431s = i;
        } else {
            throw new no4("Maximum nice length of matches is 273: " + i);
        }
    }
}
