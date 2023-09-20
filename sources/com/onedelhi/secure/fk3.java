package com.onedelhi.secure;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

public final class fk3 implements ky1 {

    /* renamed from: a */
    public static final lb2<Class<?>, byte[]> f12116a = new lb2<>(50);

    /* renamed from: a */
    public final int f12117a;

    /* renamed from: a */
    public final ky1 f12118a;

    /* renamed from: a */
    public final C3131pa f12119a;

    /* renamed from: a */
    public final sg4<?> f12120a;

    /* renamed from: a */
    public final zw2 f12121a;

    /* renamed from: a */
    public final Class<?> f12122a;

    /* renamed from: b */
    public final int f12123b;

    /* renamed from: b */
    public final ky1 f12124b;

    public fk3(C3131pa paVar, ky1 ky1, ky1 ky12, int i, int i2, sg4<?> sg4, Class<?> cls, zw2 zw2) {
        this.f12119a = paVar;
        this.f12118a = ky1;
        this.f12124b = ky12;
        this.f12117a = i;
        this.f12123b = i2;
        this.f12120a = sg4;
        this.f12122a = cls;
        this.f12121a = zw2;
    }

    /* renamed from: a */
    public void mo13311a(@mr2 MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f12119a.mo18217e(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f12117a).putInt(this.f12123b).array();
        this.f12124b.mo13311a(messageDigest);
        this.f12118a.mo13311a(messageDigest);
        messageDigest.update(bArr);
        sg4<?> sg4 = this.f12120a;
        if (sg4 != null) {
            sg4.mo13311a(messageDigest);
        }
        this.f12121a.mo13311a(messageDigest);
        messageDigest.update(mo16033c());
        this.f12119a.mo18218f(bArr);
    }

    /* renamed from: c */
    public final byte[] mo16033c() {
        lb2<Class<?>, byte[]> lb2 = f12116a;
        byte[] k = lb2.mo19405k(this.f12122a);
        if (k != null) {
            return k;
        }
        byte[] bytes = this.f12122a.getName().getBytes(ky1.f15108a);
        lb2.mo19409o(this.f12122a, bytes);
        return bytes;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof fk3)) {
            return false;
        }
        fk3 fk3 = (fk3) obj;
        return this.f12123b == fk3.f12123b && this.f12117a == fk3.f12117a && oq4.m24016d(this.f12120a, fk3.f12120a) && this.f12122a.equals(fk3.f12122a) && this.f12118a.equals(fk3.f12118a) && this.f12124b.equals(fk3.f12124b) && this.f12121a.equals(fk3.f12121a);
    }

    public int hashCode() {
        int hashCode = (((((this.f12118a.hashCode() * 31) + this.f12124b.hashCode()) * 31) + this.f12117a) * 31) + this.f12123b;
        sg4<?> sg4 = this.f12120a;
        if (sg4 != null) {
            hashCode = (hashCode * 31) + sg4.hashCode();
        }
        return (((hashCode * 31) + this.f12122a.hashCode()) * 31) + this.f12121a.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f12118a + ", signature=" + this.f12124b + ", width=" + this.f12117a + ", height=" + this.f12123b + ", decodedResourceClass=" + this.f12122a + ", transformation='" + this.f12120a + '\'' + ", options=" + this.f12121a + '}';
    }
}
