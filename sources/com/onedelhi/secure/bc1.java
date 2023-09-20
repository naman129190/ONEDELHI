package com.onedelhi.secure;

import java.io.Serializable;

@gz3(version = "1.7")
public class bc1 extends gd1 implements Serializable {

    /* renamed from: b */
    public final Class f26262b;

    public bc1(Class cls) {
        super(1);
        this.f26262b = cls;
    }

    /* renamed from: F0 */
    public mx1 mo31550D0() {
        throw new UnsupportedOperationException("Functional interface constructor does not support reflection");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc1)) {
            return false;
        }
        return this.f26262b.equals(((bc1) obj).f26262b);
    }

    public int hashCode() {
        return this.f26262b.hashCode();
    }

    public String toString() {
        return "fun interface " + this.f26262b.getName();
    }
}
