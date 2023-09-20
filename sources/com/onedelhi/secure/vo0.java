package com.onedelhi.secure;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

public final class vo0 implements xk3<Drawable, byte[]> {

    /* renamed from: a */
    public final C2355hm f21898a;

    /* renamed from: a */
    public final xk3<Bitmap, byte[]> f21899a;

    /* renamed from: b */
    public final xk3<ng1, byte[]> f21900b;

    public vo0(@mr2 C2355hm hmVar, @mr2 xk3<Bitmap, byte[]> xk3, @mr2 xk3<ng1, byte[]> xk32) {
        this.f21898a = hmVar;
        this.f21899a = xk3;
        this.f21900b = xk32;
    }

    @mr2
    /* renamed from: b */
    public static ck3<ng1> m30257b(@mr2 ck3<Drawable> ck3) {
        return ck3;
    }

    @ts2
    /* renamed from: a */
    public ck3<byte[]> mo13752a(@mr2 ck3<Drawable> ck3, @mr2 zw2 zw2) {
        Drawable drawable = ck3.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f21899a.mo13752a(C2768lm.m20843f(((BitmapDrawable) drawable).getBitmap(), this.f21898a), zw2);
        }
        if (drawable instanceof ng1) {
            return this.f21900b.mo13752a(m30257b(ck3), zw2);
        }
        return null;
    }
}
