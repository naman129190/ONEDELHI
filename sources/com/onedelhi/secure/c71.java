package com.onedelhi.secure;

import android.graphics.Bitmap;
import java.security.MessageDigest;

public class c71 extends C2985nm {

    /* renamed from: a */
    public static final byte[] f10179a = f10180b.getBytes(ky1.f15108a);

    /* renamed from: b */
    public static final String f10180b = "com.bumptech.glide.load.resource.bitmap.FitCenter";

    /* renamed from: a */
    public void mo13311a(@mr2 MessageDigest messageDigest) {
        messageDigest.update(f10179a);
    }

    /* renamed from: c */
    public Bitmap mo13312c(@mr2 C2355hm hmVar, @mr2 Bitmap bitmap, int i, int i2) {
        return ug4.m29334f(hmVar, bitmap, i, i2);
    }

    public boolean equals(Object obj) {
        return obj instanceof c71;
    }

    public int hashCode() {
        return 1572326941;
    }
}
