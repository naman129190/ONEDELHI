package com.onedelhi.secure;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

public class hg2 implements ky1 {

    /* renamed from: a */
    public final int f13068a;

    /* renamed from: a */
    public final long f13069a;
    @mr2

    /* renamed from: b */
    public final String f13070b;

    public hg2(@ts2 String str, long j, int i) {
        this.f13070b = str == null ? "" : str;
        this.f13069a = j;
        this.f13068a = i;
    }

    /* renamed from: a */
    public void mo13311a(@mr2 MessageDigest messageDigest) {
        messageDigest.update(ByteBuffer.allocate(12).putLong(this.f13069a).putInt(this.f13068a).array());
        messageDigest.update(this.f13070b.getBytes(ky1.f15108a));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        hg2 hg2 = (hg2) obj;
        return this.f13069a == hg2.f13069a && this.f13068a == hg2.f13068a && this.f13070b.equals(hg2.f13070b);
    }

    public int hashCode() {
        long j = this.f13069a;
        return (((this.f13070b.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f13068a;
    }
}
