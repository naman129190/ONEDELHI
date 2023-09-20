package com.onedelhi.secure;

public class sl2 {

    /* renamed from: a */
    public Class<?> f20424a;

    /* renamed from: b */
    public Class<?> f20425b;

    /* renamed from: c */
    public Class<?> f20426c;

    public sl2() {
    }

    public sl2(@mr2 Class<?> cls, @mr2 Class<?> cls2) {
        mo24476a(cls, cls2);
    }

    public sl2(@mr2 Class<?> cls, @mr2 Class<?> cls2, @ts2 Class<?> cls3) {
        mo24477b(cls, cls2, cls3);
    }

    /* renamed from: a */
    public void mo24476a(@mr2 Class<?> cls, @mr2 Class<?> cls2) {
        mo24477b(cls, cls2, (Class<?>) null);
    }

    /* renamed from: b */
    public void mo24477b(@mr2 Class<?> cls, @mr2 Class<?> cls2, @ts2 Class<?> cls3) {
        this.f20424a = cls;
        this.f20425b = cls2;
        this.f20426c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        sl2 sl2 = (sl2) obj;
        return this.f20424a.equals(sl2.f20424a) && this.f20425b.equals(sl2.f20425b) && oq4.m24016d(this.f20426c, sl2.f20426c);
    }

    public int hashCode() {
        int hashCode = ((this.f20424a.hashCode() * 31) + this.f20425b.hashCode()) * 31;
        Class<?> cls = this.f20426c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f20424a + ", second=" + this.f20425b + '}';
    }
}
