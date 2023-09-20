package com.onedelhi.secure;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

public final class on3 extends C2985nm {

    /* renamed from: a */
    public static final byte[] f18027a = f18028b.getBytes(ky1.f15108a);

    /* renamed from: b */
    public static final String f18028b = "com.bumptech.glide.load.resource.bitmap.RoundedCorners";

    /* renamed from: a */
    public final int f18029a;

    public on3(int i) {
        g43.m15506a(i > 0, "roundingRadius must be greater than 0.");
        this.f18029a = i;
    }

    /* renamed from: a */
    public void mo13311a(@mr2 MessageDigest messageDigest) {
        messageDigest.update(f18027a);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f18029a).array());
    }

    /* renamed from: c */
    public Bitmap mo13312c(@mr2 C2355hm hmVar, @mr2 Bitmap bitmap, int i, int i2) {
        return ug4.m29345q(hmVar, bitmap, this.f18029a);
    }

    public boolean equals(Object obj) {
        return (obj instanceof on3) && this.f18029a == ((on3) obj).f18029a;
    }

    public int hashCode() {
        return oq4.m24028p(-569625254, oq4.m24027o(this.f18029a));
    }
}
