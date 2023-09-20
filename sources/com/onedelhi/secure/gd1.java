package com.onedelhi.secure;

public class gd1 extends C7077vs implements dd1, mx1 {

    /* renamed from: n */
    public final int f29135n;
    @gz3(version = "1.4")

    /* renamed from: o */
    public final int f29136o;

    public gd1(int i) {
        this(i, C7077vs.f36654b, (Class) null, (String) null, (String) null, 0);
    }

    @gz3(version = "1.1")
    public gd1(int i, Object obj) {
        this(i, obj, (Class) null, (String) null, (String) null, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @gz3(version = "1.4")
    public gd1(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.f29135n = i;
        this.f29136o = i2 >> 1;
    }

    @gz3(version = "1.1")
    /* renamed from: A0 */
    public gx1 mo31435A0() {
        return ah3.m38680c(this);
    }

    @gz3(version = "1.1")
    /* renamed from: F0 */
    public mx1 mo31550D0() {
        return (mx1) super.mo31550D0();
    }

    @gz3(version = "1.1")
    /* renamed from: Y */
    public boolean mo36682Y() {
        return mo31550D0().mo36682Y();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gd1) {
            gd1 gd1 = (gd1) obj;
            return getName().equals(gd1.getName()) && mo46320E0().equals(gd1.mo46320E0()) && this.f29136o == gd1.f29136o && this.f29135n == gd1.f29135n && jt1.m53768g(mo46319B0(), gd1.mo46319B0()) && jt1.m53768g(mo40700C0(), gd1.mo40700C0());
        } else if (obj instanceof mx1) {
            return obj.equals(mo46321z0());
        } else {
            return false;
        }
    }

    @gz3(version = "1.1")
    /* renamed from: g */
    public boolean mo36683g() {
        return mo31550D0().mo36683g();
    }

    public int getArity() {
        return this.f29135n;
    }

    public int hashCode() {
        return (((mo40700C0() == null ? 0 : mo40700C0().hashCode() * 31) + getName().hashCode()) * 31) + mo46320E0().hashCode();
    }

    public String toString() {
        gx1 z0 = mo46321z0();
        if (z0 != this) {
            return z0.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + ah3.f25851a;
    }

    @gz3(version = "1.1")
    /* renamed from: u0 */
    public boolean mo36684u0() {
        return mo31550D0().mo36684u0();
    }

    @gz3(version = "1.1")
    /* renamed from: v */
    public boolean mo36685v() {
        return mo31550D0().mo36685v();
    }

    @gz3(version = "1.1")
    /* renamed from: x */
    public boolean mo36686x() {
        return mo31550D0().mo36686x();
    }
}
