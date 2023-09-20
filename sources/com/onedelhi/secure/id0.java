package com.onedelhi.secure;

import java.security.MessageDigest;

public final class id0 implements ky1 {

    /* renamed from: a */
    public final ky1 f13624a;

    /* renamed from: b */
    public final ky1 f13625b;

    public id0(ky1 ky1, ky1 ky12) {
        this.f13624a = ky1;
        this.f13625b = ky12;
    }

    /* renamed from: a */
    public void mo13311a(@mr2 MessageDigest messageDigest) {
        this.f13624a.mo13311a(messageDigest);
        this.f13625b.mo13311a(messageDigest);
    }

    /* renamed from: c */
    public ky1 mo17717c() {
        return this.f13624a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof id0)) {
            return false;
        }
        id0 id0 = (id0) obj;
        return this.f13624a.equals(id0.f13624a) && this.f13625b.equals(id0.f13625b);
    }

    public int hashCode() {
        return (this.f13624a.hashCode() * 31) + this.f13625b.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f13624a + ", signature=" + this.f13625b + '}';
    }
}
