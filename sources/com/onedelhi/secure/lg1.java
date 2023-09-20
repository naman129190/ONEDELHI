package com.onedelhi.secure;

import android.graphics.Bitmap;
import com.onedelhi.secure.mg1;

public final class lg1 implements mg1.C2858a {

    /* renamed from: a */
    public final C2355hm f15362a;
    @ts2

    /* renamed from: a */
    public final C3131pa f15363a;

    public lg1(C2355hm hmVar) {
        this(hmVar, (C3131pa) null);
    }

    public lg1(C2355hm hmVar, @ts2 C3131pa paVar) {
        this.f15362a = hmVar;
        this.f15363a = paVar;
    }

    /* renamed from: a */
    public void mo19545a(@mr2 Bitmap bitmap) {
        this.f15362a.mo16798c(bitmap);
    }

    /* renamed from: b */
    public void mo19546b(@mr2 int[] iArr) {
        C3131pa paVar = this.f15363a;
        if (paVar != null) {
            paVar.mo18218f(iArr);
        }
    }

    @mr2
    /* renamed from: c */
    public byte[] mo19547c(int i) {
        C3131pa paVar = this.f15363a;
        return paVar == null ? new byte[i] : (byte[]) paVar.mo18216d(i, byte[].class);
    }

    @mr2
    /* renamed from: d */
    public Bitmap mo19548d(int i, int i2, @mr2 Bitmap.Config config) {
        return this.f15362a.mo17346g(i, i2, config);
    }

    @mr2
    /* renamed from: e */
    public int[] mo19549e(int i) {
        C3131pa paVar = this.f15363a;
        return paVar == null ? new int[i] : (int[]) paVar.mo18216d(i, int[].class);
    }

    /* renamed from: f */
    public void mo19550f(@mr2 byte[] bArr) {
        C3131pa paVar = this.f15363a;
        if (paVar != null) {
            paVar.mo18218f(bArr);
        }
    }
}
