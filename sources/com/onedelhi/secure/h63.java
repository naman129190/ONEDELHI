package com.onedelhi.secure;

public abstract class h63 extends C7077vs implements ay1 {
    public h63() {
    }

    @gz3(version = "1.1")
    public h63(Object obj) {
        super(obj);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @gz3(version = "1.4")
    public h63(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
    }

    @gz3(version = "1.1")
    /* renamed from: D */
    public boolean mo31255D() {
        return mo31550D0().mo31255D();
    }

    @gz3(version = "1.1")
    /* renamed from: F0 */
    public ay1 mo31550D0() {
        return (ay1) super.mo31550D0();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h63) {
            h63 h63 = (h63) obj;
            return mo40700C0().equals(h63.mo40700C0()) && getName().equals(h63.getName()) && mo46320E0().equals(h63.mo46320E0()) && jt1.m53768g(mo46319B0(), h63.mo46319B0());
        } else if (obj instanceof ay1) {
            return obj.equals(mo46321z0());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((mo40700C0().hashCode() * 31) + getName().hashCode()) * 31) + mo46320E0().hashCode();
    }

    public String toString() {
        gx1 z0 = mo46321z0();
        if (z0 != this) {
            return z0.toString();
        }
        return "property " + getName() + ah3.f25851a;
    }

    @gz3(version = "1.1")
    /* renamed from: y */
    public boolean mo31257y() {
        return mo31550D0().mo31257y();
    }
}
