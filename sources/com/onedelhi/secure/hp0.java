package com.onedelhi.secure;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.C1173a;
import java.security.MessageDigest;

public class hp0 implements sg4<Drawable> {

    /* renamed from: a */
    public final sg4<Bitmap> f13218a;

    /* renamed from: a */
    public final boolean f13219a;

    public hp0(sg4<Bitmap> sg4, boolean z) {
        this.f13218a = sg4;
        this.f13219a = z;
    }

    /* renamed from: a */
    public void mo13311a(@mr2 MessageDigest messageDigest) {
        this.f13218a.mo13311a(messageDigest);
    }

    @mr2
    /* renamed from: b */
    public ck3<Drawable> mo13753b(@mr2 Context context, @mr2 ck3<Drawable> ck3, int i, int i2) {
        C2355hm h = C1173a.m7529e(context).mo7457h();
        Drawable drawable = ck3.get();
        ck3<Bitmap> a = gp0.m16022a(h, drawable, i, i2);
        if (a != null) {
            ck3<Bitmap> b = this.f13218a.mo13753b(context, a, i, i2);
            if (!b.equals(a)) {
                return mo17369d(context, b);
            }
            b.mo13177a();
            return ck3;
        } else if (!this.f13219a) {
            return ck3;
        } else {
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
    }

    /* renamed from: c */
    public sg4<BitmapDrawable> mo17368c() {
        return this;
    }

    /* renamed from: d */
    public final ck3<Drawable> mo17369d(Context context, ck3<Bitmap> ck3) {
        return z12.m32792h(context.getResources(), ck3);
    }

    public boolean equals(Object obj) {
        if (obj instanceof hp0) {
            return this.f13218a.equals(((hp0) obj).f13218a);
        }
        return false;
    }

    public int hashCode() {
        return this.f13218a.hashCode();
    }
}
