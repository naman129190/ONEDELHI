package com.onedelhi.secure;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

public final class pi1 extends C2985nm {

    /* renamed from: a */
    public static final byte[] f18537a = f18538b.getBytes(ky1.f15108a);

    /* renamed from: b */
    public static final String f18538b = "com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners";

    /* renamed from: a */
    public final float f18539a;

    /* renamed from: b */
    public final float f18540b;

    /* renamed from: c */
    public final float f18541c;

    /* renamed from: d */
    public final float f18542d;

    public pi1(float f, float f2, float f3, float f4) {
        this.f18539a = f;
        this.f18540b = f2;
        this.f18541c = f3;
        this.f18542d = f4;
    }

    /* renamed from: a */
    public void mo13311a(@mr2 MessageDigest messageDigest) {
        messageDigest.update(f18537a);
        messageDigest.update(ByteBuffer.allocate(16).putFloat(this.f18539a).putFloat(this.f18540b).putFloat(this.f18541c).putFloat(this.f18542d).array());
    }

    /* renamed from: c */
    public Bitmap mo13312c(@mr2 C2355hm hmVar, @mr2 Bitmap bitmap, int i, int i2) {
        return ug4.m29344p(hmVar, bitmap, this.f18539a, this.f18540b, this.f18541c, this.f18542d);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof pi1)) {
            return false;
        }
        pi1 pi1 = (pi1) obj;
        return this.f18539a == pi1.f18539a && this.f18540b == pi1.f18540b && this.f18541c == pi1.f18541c && this.f18542d == pi1.f18542d;
    }

    public int hashCode() {
        return oq4.m24026n(this.f18542d, oq4.m24026n(this.f18541c, oq4.m24026n(this.f18540b, oq4.m24028p(-2013597734, oq4.m24025m(this.f18539a)))));
    }
}
