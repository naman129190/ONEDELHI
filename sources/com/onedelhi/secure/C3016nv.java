package com.onedelhi.secure;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* renamed from: com.onedelhi.secure.nv */
public class C3016nv extends C2985nm {

    /* renamed from: a */
    public static final byte[] f17607a = f17608b.getBytes(ky1.f15108a);

    /* renamed from: b */
    public static final String f17608b = "com.bumptech.glide.load.resource.bitmap.CenterCrop";

    /* renamed from: a */
    public void mo13311a(@mr2 MessageDigest messageDigest) {
        messageDigest.update(f17607a);
    }

    /* renamed from: c */
    public Bitmap mo13312c(@mr2 C2355hm hmVar, @mr2 Bitmap bitmap, int i, int i2) {
        return ug4.m29330b(hmVar, bitmap, i, i2);
    }

    public boolean equals(Object obj) {
        return obj instanceof C3016nv;
    }

    public int hashCode() {
        return -599754482;
    }
}
