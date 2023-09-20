package com.onedelhi.secure;

import android.graphics.drawable.Drawable;

public final class nr2 extends ep0<Drawable> {
    public nr2(Drawable drawable) {
        super(drawable);
    }

    @ts2
    /* renamed from: f */
    public static ck3<Drawable> m23142f(@ts2 Drawable drawable) {
        if (drawable != null) {
            return new nr2(drawable);
        }
        return null;
    }

    /* renamed from: a */
    public void mo13177a() {
    }

    /* renamed from: c */
    public int mo13179c() {
        return Math.max(1, this.f11314a.getIntrinsicWidth() * this.f11314a.getIntrinsicHeight() * 4);
    }

    @mr2
    /* renamed from: d */
    public Class<Drawable> mo13180d() {
        return this.f11314a.getClass();
    }
}
