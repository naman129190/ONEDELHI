package com.onedelhi.secure;

import android.graphics.drawable.BitmapDrawable;

/* renamed from: com.onedelhi.secure.am */
public class C1719am extends ep0<BitmapDrawable> implements kq1 {

    /* renamed from: a */
    public final C2355hm f9405a;

    public C1719am(BitmapDrawable bitmapDrawable, C2355hm hmVar) {
        super(bitmapDrawable);
        this.f9405a = hmVar;
    }

    /* renamed from: a */
    public void mo13177a() {
        this.f9405a.mo16798c(((BitmapDrawable) this.f11314a).getBitmap());
    }

    /* renamed from: b */
    public void mo13178b() {
        ((BitmapDrawable) this.f11314a).getBitmap().prepareToDraw();
    }

    /* renamed from: c */
    public int mo13179c() {
        return oq4.m24020h(((BitmapDrawable) this.f11314a).getBitmap());
    }

    @mr2
    /* renamed from: d */
    public Class<BitmapDrawable> mo13180d() {
        return BitmapDrawable.class;
    }
}
