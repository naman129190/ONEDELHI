package com.onedelhi.secure;

import java.io.InputStream;

public class nj0 extends i31 {

    /* renamed from: b */
    public static final /* synthetic */ boolean f32565b = false;

    /* renamed from: o */
    public static final int f32566o = 1;

    /* renamed from: p */
    public static final int f32567p = 256;

    /* renamed from: n */
    public int f32568n = 1;

    static {
        Class<nj0> cls = nj0.class;
    }

    public nj0() {
    }

    public nj0(int i) throws no4 {
        mo41077k(i);
    }

    /* renamed from: a */
    public int mo32375a() {
        return 1;
    }

    /* renamed from: c */
    public int mo32376c() {
        return oj0.m59421b();
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
        return new lj0(this);
    }

    /* renamed from: g */
    public InputStream mo37822g(InputStream inputStream, C4477aa aaVar) {
        return new mj0(inputStream, this.f32568n);
    }

    /* renamed from: i */
    public q31 mo37824i(q31 q31, C4477aa aaVar) {
        return new oj0(q31, this);
    }

    /* renamed from: j */
    public int mo41076j() {
        return this.f32568n;
    }

    /* renamed from: k */
    public void mo41077k(int i) throws no4 {
        if (i < 1 || i > 256) {
            throw new no4("Delta distance must be in the range [1, 256]: " + i);
        }
        this.f32568n = i;
    }
}
