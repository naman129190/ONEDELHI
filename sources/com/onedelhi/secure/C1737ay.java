package com.onedelhi.secure;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* renamed from: com.onedelhi.secure.ay */
public class C1737ay extends C2985nm {

    /* renamed from: a */
    public static final int f9566a = 1;

    /* renamed from: a */
    public static final byte[] f9567a = f9568b.getBytes(ky1.f15108a);

    /* renamed from: b */
    public static final String f9568b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1";

    /* renamed from: a */
    public void mo13311a(@mr2 MessageDigest messageDigest) {
        messageDigest.update(f9567a);
    }

    /* renamed from: c */
    public Bitmap mo13312c(@mr2 C2355hm hmVar, @mr2 Bitmap bitmap, int i, int i2) {
        return ug4.m29332d(hmVar, bitmap, i, i2);
    }

    public boolean equals(Object obj) {
        return obj instanceof C1737ay;
    }

    public int hashCode() {
        return 1101716364;
    }
}
