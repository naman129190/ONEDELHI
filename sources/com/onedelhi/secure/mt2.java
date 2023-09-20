package com.onedelhi.secure;

import java.security.MessageDigest;

public final class mt2 implements ky1 {

    /* renamed from: a */
    public final Object f16283a;

    public mt2(@mr2 Object obj) {
        this.f16283a = g43.m15509d(obj);
    }

    /* renamed from: a */
    public void mo13311a(@mr2 MessageDigest messageDigest) {
        messageDigest.update(this.f16283a.toString().getBytes(ky1.f15108a));
    }

    public boolean equals(Object obj) {
        if (obj instanceof mt2) {
            return this.f16283a.equals(((mt2) obj).f16283a);
        }
        return false;
    }

    public int hashCode() {
        return this.f16283a.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f16283a + '}';
    }
}
