package com.onedelhi.secure;

import android.graphics.Bitmap;

/* renamed from: com.onedelhi.secure.im */
public class C2451im implements C2355hm {
    /* renamed from: a */
    public void mo17341a(int i) {
    }

    /* renamed from: b */
    public void mo17342b() {
    }

    /* renamed from: c */
    public void mo16798c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @mr2
    /* renamed from: d */
    public Bitmap mo17343d(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    /* renamed from: e */
    public long mo17344e() {
        return 0;
    }

    /* renamed from: f */
    public void mo17345f(float f) {
    }

    @mr2
    /* renamed from: g */
    public Bitmap mo17346g(int i, int i2, Bitmap.Config config) {
        return mo17343d(i, i2, config);
    }
}
