package com.onedelhi.secure;

import android.graphics.Bitmap;

public final class vn4 implements ik3<Bitmap, Bitmap> {

    /* renamed from: com.onedelhi.secure.vn4$a */
    public static final class C3803a implements ck3<Bitmap> {

        /* renamed from: a */
        public final Bitmap f21894a;

        public C3803a(@mr2 Bitmap bitmap) {
            this.f21894a = bitmap;
        }

        /* renamed from: a */
        public void mo13177a() {
        }

        @mr2
        /* renamed from: b */
        public Bitmap get() {
            return this.f21894a;
        }

        /* renamed from: c */
        public int mo13179c() {
            return oq4.m24020h(this.f21894a);
        }

        @mr2
        /* renamed from: d */
        public Class<Bitmap> mo13180d() {
            return Bitmap.class;
        }
    }

    /* renamed from: c */
    public ck3<Bitmap> mo14336a(@mr2 Bitmap bitmap, int i, int i2, @mr2 zw2 zw2) {
        return new C3803a(bitmap);
    }

    /* renamed from: d */
    public boolean mo14337b(@mr2 Bitmap bitmap, @mr2 zw2 zw2) {
        return true;
    }
}
