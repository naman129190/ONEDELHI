package com.onedelhi.secure;

import android.util.SizeF;

public final class sz3 {

    /* renamed from: a */
    public final float f20615a;

    /* renamed from: b */
    public final float f20616b;

    @sj3(21)
    /* renamed from: com.onedelhi.secure.sz3$a */
    public static final class C3562a {
        @mr2
        @pn0
        /* renamed from: a */
        public static SizeF m28042a(@mr2 sz3 sz3) {
            k43.m19455l(sz3);
            return new SizeF(sz3.mo24678b(), sz3.mo24677a());
        }

        @mr2
        @pn0
        /* renamed from: b */
        public static sz3 m28043b(@mr2 SizeF sizeF) {
            k43.m19455l(sizeF);
            return new sz3(sizeF.getWidth(), sizeF.getHeight());
        }
    }

    public sz3(float f, float f2) {
        this.f20615a = k43.m19447d(f, yz1.f38148j);
        this.f20616b = k43.m19447d(f2, "height");
    }

    @mr2
    @sj3(21)
    /* renamed from: d */
    public static sz3 m28038d(@mr2 SizeF sizeF) {
        return C3562a.m28043b(sizeF);
    }

    /* renamed from: a */
    public float mo24677a() {
        return this.f20616b;
    }

    /* renamed from: b */
    public float mo24678b() {
        return this.f20615a;
    }

    @mr2
    @sj3(21)
    /* renamed from: c */
    public SizeF mo24679c() {
        return C3562a.m28042a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sz3)) {
            return false;
        }
        sz3 sz3 = (sz3) obj;
        return sz3.f20615a == this.f20615a && sz3.f20616b == this.f20616b;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f20615a) ^ Float.floatToIntBits(this.f20616b);
    }

    @mr2
    public String toString() {
        return this.f20615a + "x" + this.f20616b;
    }
}
