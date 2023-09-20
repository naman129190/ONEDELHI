package com.onedelhi.secure;

public final class bl0 {

    /* renamed from: a */
    public final int f26403a;

    /* renamed from: b */
    public final int f26404b;

    public bl0(int i, int i2) {
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException();
        }
        this.f26403a = i;
        this.f26404b = i2;
    }

    /* renamed from: a */
    public int mo31916a() {
        return this.f26404b;
    }

    /* renamed from: b */
    public int mo31917b() {
        return this.f26403a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof bl0) {
            bl0 bl0 = (bl0) obj;
            return this.f26403a == bl0.f26403a && this.f26404b == bl0.f26404b;
        }
    }

    public int hashCode() {
        return (this.f26403a * 32713) + this.f26404b;
    }

    public String toString() {
        return this.f26403a + "x" + this.f26404b;
    }
}
