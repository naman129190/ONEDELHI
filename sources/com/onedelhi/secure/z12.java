package com.onedelhi.secure;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.C1173a;

public final class z12 implements ck3<BitmapDrawable>, kq1 {

    /* renamed from: a */
    public final Resources f23377a;

    /* renamed from: a */
    public final ck3<Bitmap> f23378a;

    public z12(@mr2 Resources resources, @mr2 ck3<Bitmap> ck3) {
        this.f23377a = (Resources) g43.m15509d(resources);
        this.f23378a = (ck3) g43.m15509d(ck3);
    }

    @Deprecated
    /* renamed from: f */
    public static z12 m32790f(Context context, Bitmap bitmap) {
        return (z12) m32792h(context.getResources(), C2768lm.m20843f(bitmap, C1173a.m7529e(context).mo7457h()));
    }

    @Deprecated
    /* renamed from: g */
    public static z12 m32791g(Resources resources, C2355hm hmVar, Bitmap bitmap) {
        return (z12) m32792h(resources, C2768lm.m20843f(bitmap, hmVar));
    }

    @ts2
    /* renamed from: h */
    public static ck3<BitmapDrawable> m32792h(@mr2 Resources resources, @ts2 ck3<Bitmap> ck3) {
        if (ck3 == null) {
            return null;
        }
        return new z12(resources, ck3);
    }

    /* renamed from: a */
    public void mo13177a() {
        this.f23378a.mo13177a();
    }

    /* renamed from: b */
    public void mo13178b() {
        ck3<Bitmap> ck3 = this.f23378a;
        if (ck3 instanceof kq1) {
            ((kq1) ck3).mo13178b();
        }
    }

    /* renamed from: c */
    public int mo13179c() {
        return this.f23378a.mo13179c();
    }

    @mr2
    /* renamed from: d */
    public Class<BitmapDrawable> mo13180d() {
        return BitmapDrawable.class;
    }

    @mr2
    /* renamed from: e */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f23377a, this.f23378a.get());
    }
}
