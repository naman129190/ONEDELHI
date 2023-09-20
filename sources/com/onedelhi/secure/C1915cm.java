package com.onedelhi.secure;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

@Deprecated
/* renamed from: com.onedelhi.secure.cm */
public class C1915cm implements sg4<BitmapDrawable> {

    /* renamed from: a */
    public final sg4<Drawable> f10394a;

    public C1915cm(sg4<Bitmap> sg4) {
        this.f10394a = (sg4) g43.m15509d(new hp0(sg4, false));
    }

    /* renamed from: c */
    public static ck3<BitmapDrawable> m12607c(ck3<Drawable> ck3) {
        if (ck3.get() instanceof BitmapDrawable) {
            return ck3;
        }
        throw new IllegalArgumentException("Wrapped transformation unexpectedly returned a non BitmapDrawable resource: " + ck3.get());
    }

    /* renamed from: d */
    public static ck3<Drawable> m12608d(ck3<BitmapDrawable> ck3) {
        return ck3;
    }

    /* renamed from: a */
    public void mo13311a(@mr2 MessageDigest messageDigest) {
        this.f10394a.mo13311a(messageDigest);
    }

    @mr2
    /* renamed from: b */
    public ck3<BitmapDrawable> mo13753b(@mr2 Context context, @mr2 ck3<BitmapDrawable> ck3, int i, int i2) {
        return m12607c(this.f10394a.mo13753b(context, m12608d(ck3), i, i2));
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1915cm) {
            return this.f10394a.equals(((C1915cm) obj).f10394a);
        }
        return false;
    }

    public int hashCode() {
        return this.f10394a.hashCode();
    }
}
