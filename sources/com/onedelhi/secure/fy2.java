package com.onedelhi.secure;

public class fy2<F, S> {

    /* renamed from: a */
    public final F f12385a;

    /* renamed from: b */
    public final S f12386b;

    public fy2(F f, S s) {
        this.f12385a = f;
        this.f12386b = s;
    }

    @mr2
    /* renamed from: a */
    public static <A, B> fy2<A, B> m15425a(A a, B b) {
        return new fy2<>(a, b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof fy2)) {
            return false;
        }
        fy2 fy2 = (fy2) obj;
        return ot2.m24056a(fy2.f12385a, this.f12385a) && ot2.m24056a(fy2.f12386b, this.f12386b);
    }

    public int hashCode() {
        F f = this.f12385a;
        int i = 0;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.f12386b;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }

    @mr2
    public String toString() {
        return "Pair{" + this.f12385a + " " + this.f12386b + "}";
    }
}
