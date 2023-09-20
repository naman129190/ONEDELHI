package com.onedelhi.secure;

public class kd0 {

    /* renamed from: a */
    public final int f31181a;

    /* renamed from: b */
    public final int f31182b;

    public kd0(int i, int i2) {
        this.f31181a = i;
        this.f31182b = i2;
    }

    /* renamed from: a */
    public final int mo39211a() {
        return this.f31182b;
    }

    /* renamed from: b */
    public final int mo39212b() {
        return this.f31181a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kd0)) {
            return false;
        }
        kd0 kd0 = (kd0) obj;
        return this.f31181a == kd0.f31181a && this.f31182b == kd0.f31182b;
    }

    public final int hashCode() {
        return this.f31181a ^ this.f31182b;
    }

    public final String toString() {
        return this.f31181a + pl2.f33726c + this.f31182b + ')';
    }
}
