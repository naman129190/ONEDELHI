package com.onedelhi.secure;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* renamed from: com.onedelhi.secure.pv */
public class C3195pv extends C2985nm {

    /* renamed from: a */
    public static final byte[] f18718a = f18719b.getBytes(ky1.f15108a);

    /* renamed from: b */
    public static final String f18719b = "com.bumptech.glide.load.resource.bitmap.CenterInside";

    /* renamed from: a */
    public void mo13311a(@mr2 MessageDigest messageDigest) {
        messageDigest.update(f18718a);
    }

    /* renamed from: c */
    public Bitmap mo13312c(@mr2 C2355hm hmVar, @mr2 Bitmap bitmap, int i, int i2) {
        return ug4.m29331c(hmVar, bitmap, i, i2);
    }

    public boolean equals(Object obj) {
        return obj instanceof C3195pv;
    }

    public int hashCode() {
        return -670243078;
    }
}
