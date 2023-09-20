package com.onedelhi.secure;

import java.util.Objects;
import javax.annotation.CheckForNull;

public final class sz5 implements kz5 {
    @CheckForNull

    /* renamed from: a */
    public volatile kz5 f20617a;
    @CheckForNull

    /* renamed from: a */
    public Object f20618a;

    /* renamed from: b */
    public volatile boolean f20619b;

    public sz5(kz5 kz5) {
        Objects.requireNonNull(kz5);
        this.f20617a = kz5;
    }

    /* renamed from: a */
    public final Object mo19246a() {
        if (!this.f20619b) {
            synchronized (this) {
                if (!this.f20619b) {
                    kz5 kz5 = this.f20617a;
                    kz5.getClass();
                    Object a = kz5.mo19246a();
                    this.f20618a = a;
                    this.f20619b = true;
                    this.f20617a = null;
                    return a;
                }
            }
        }
        return this.f20618a;
    }

    public final String toString() {
        Object obj = this.f20617a;
        StringBuilder sb = new StringBuilder();
        sb.append("Suppliers.memoize(");
        if (obj == null) {
            obj = "<supplier that returned " + this.f20618a + ">";
        }
        sb.append(obj);
        sb.append(pl2.f33727d);
        return sb.toString();
    }
}
