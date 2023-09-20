package com.onedelhi.secure;

import java.io.Serializable;
import java.util.Objects;
import javax.annotation.CheckForNull;

public final class oz5 implements Serializable, kz5 {

    /* renamed from: a */
    public final kz5 f18258a;
    @CheckForNull

    /* renamed from: a */
    public transient Object f18259a;

    /* renamed from: b */
    public volatile transient boolean f18260b;

    public oz5(kz5 kz5) {
        Objects.requireNonNull(kz5);
        this.f18258a = kz5;
    }

    /* renamed from: a */
    public final Object mo19246a() {
        if (!this.f18260b) {
            synchronized (this) {
                if (!this.f18260b) {
                    Object a = this.f18258a.mo19246a();
                    this.f18259a = a;
                    this.f18260b = true;
                    return a;
                }
            }
        }
        return this.f18259a;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("Suppliers.memoize(");
        if (this.f18260b) {
            obj = "<supplier that returned " + this.f18259a + ">";
        } else {
            obj = this.f18258a;
        }
        sb.append(obj);
        sb.append(pl2.f33727d);
        return sb.toString();
    }
}
