package com.onedelhi.secure;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

public class en3 extends C2985nm {

    /* renamed from: a */
    public static final byte[] f11302a = f11303b.getBytes(ky1.f15108a);

    /* renamed from: b */
    public static final String f11303b = "com.bumptech.glide.load.resource.bitmap.Rotate";

    /* renamed from: a */
    public final int f11304a;

    public en3(int i) {
        this.f11304a = i;
    }

    /* renamed from: a */
    public void mo13311a(@mr2 MessageDigest messageDigest) {
        messageDigest.update(f11302a);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f11304a).array());
    }

    /* renamed from: c */
    public Bitmap mo13312c(@mr2 C2355hm hmVar, @mr2 Bitmap bitmap, int i, int i2) {
        return ug4.m29342n(bitmap, this.f11304a);
    }

    public boolean equals(Object obj) {
        return (obj instanceof en3) && this.f11304a == ((en3) obj).f11304a;
    }

    public int hashCode() {
        return oq4.m24028p(-950519196, oq4.m24027o(this.f11304a));
    }
}
