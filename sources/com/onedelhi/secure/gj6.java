package com.onedelhi.secure;

import java.util.Objects;
import javax.annotation.CheckForNull;

public final class gj6 implements aj6 {

    /* renamed from: b */
    public static final aj6 f12613b = ej6.f11259a;

    /* renamed from: a */
    public volatile aj6 f12614a;
    @CheckForNull

    /* renamed from: a */
    public Object f12615a;

    public gj6(aj6 aj6) {
        Objects.requireNonNull(aj6);
        this.f12614a = aj6;
    }

    /* renamed from: a */
    public final Object mo12477a() {
        aj6 aj6 = this.f12614a;
        aj6 aj62 = f12613b;
        if (aj6 != aj62) {
            synchronized (this) {
                if (this.f12614a != aj62) {
                    Object a = this.f12614a.mo12477a();
                    this.f12615a = a;
                    this.f12614a = aj62;
                    return a;
                }
            }
        }
        return this.f12615a;
    }

    public final String toString() {
        Object obj = this.f12614a;
        if (obj == f12613b) {
            obj = "<supplier that returned " + String.valueOf(this.f12615a) + ">";
        }
        return "Suppliers.memoize(" + String.valueOf(obj) + pl2.f33727d;
    }
}
