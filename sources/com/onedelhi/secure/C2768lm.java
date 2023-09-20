package com.onedelhi.secure;

import android.graphics.Bitmap;

/* renamed from: com.onedelhi.secure.lm */
public class C2768lm implements ck3<Bitmap>, kq1 {

    /* renamed from: a */
    public final Bitmap f15497a;

    /* renamed from: a */
    public final C2355hm f15498a;

    public C2768lm(@mr2 Bitmap bitmap, @mr2 C2355hm hmVar) {
        this.f15497a = (Bitmap) g43.m15510e(bitmap, "Bitmap must not be null");
        this.f15498a = (C2355hm) g43.m15510e(hmVar, "BitmapPool must not be null");
    }

    @ts2
    /* renamed from: f */
    public static C2768lm m20843f(@ts2 Bitmap bitmap, @mr2 C2355hm hmVar) {
        if (bitmap == null) {
            return null;
        }
        return new C2768lm(bitmap, hmVar);
    }

    /* renamed from: a */
    public void mo13177a() {
        this.f15498a.mo16798c(this.f15497a);
    }

    /* renamed from: b */
    public void mo13178b() {
        this.f15497a.prepareToDraw();
    }

    /* renamed from: c */
    public int mo13179c() {
        return oq4.m24020h(this.f15497a);
    }

    @mr2
    /* renamed from: d */
    public Class<Bitmap> mo13180d() {
        return Bitmap.class;
    }

    @mr2
    /* renamed from: e */
    public Bitmap get() {
        return this.f15497a;
    }
}
