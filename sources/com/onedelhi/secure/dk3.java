package com.onedelhi.secure;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;

public class dk3 implements ik3<Uri, Bitmap> {

    /* renamed from: a */
    public final C2355hm f10798a;

    /* renamed from: a */
    public final mk3 f10799a;

    public dk3(mk3 mk3, C2355hm hmVar) {
        this.f10799a = mk3;
        this.f10798a = hmVar;
    }

    @ts2
    /* renamed from: c */
    public ck3<Bitmap> mo14336a(@mr2 Uri uri, int i, int i2, @mr2 zw2 zw2) {
        ck3<Drawable> c = this.f10799a.mo14336a(uri, i, i2, zw2);
        if (c == null) {
            return null;
        }
        return gp0.m16022a(this.f10798a, c.get(), i, i2);
    }

    /* renamed from: d */
    public boolean mo14337b(@mr2 Uri uri, @mr2 zw2 zw2) {
        return "android.resource".equals(uri.getScheme());
    }
}
