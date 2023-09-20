package com.onedelhi.secure;

import java.security.MessageDigest;

public final class zw2 implements ky1 {

    /* renamed from: a */
    public final C3042oa<ow2<?>, Object> f23922a = new C2460is();

    /* renamed from: f */
    public static <T> void m33494f(@mr2 ow2<T> ow2, @mr2 Object obj, @mr2 MessageDigest messageDigest) {
        ow2.mo22113h(obj, messageDigest);
    }

    /* renamed from: a */
    public void mo13311a(@mr2 MessageDigest messageDigest) {
        for (int i = 0; i < this.f23922a.size(); i++) {
            m33494f(this.f23922a.mo25350m(i), this.f23922a.mo25352q(i), messageDigest);
        }
    }

    @ts2
    /* renamed from: c */
    public <T> T mo28148c(@mr2 ow2<T> ow2) {
        return this.f23922a.containsKey(ow2) ? this.f23922a.get(ow2) : ow2.mo22110d();
    }

    /* renamed from: d */
    public void mo28149d(@mr2 zw2 zw2) {
        this.f23922a.mo17950n(zw2.f23922a);
    }

    @mr2
    /* renamed from: e */
    public <T> zw2 mo28150e(@mr2 ow2<T> ow2, @mr2 T t) {
        this.f23922a.put(ow2, t);
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof zw2) {
            return this.f23922a.equals(((zw2) obj).f23922a);
        }
        return false;
    }

    public int hashCode() {
        return this.f23922a.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f23922a + '}';
    }
}
