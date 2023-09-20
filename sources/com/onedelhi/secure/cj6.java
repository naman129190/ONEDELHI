package com.onedelhi.secure;

import java.io.Serializable;
import java.util.Objects;
import javax.annotation.CheckForNull;

public final class cj6 implements Serializable, aj6 {

    /* renamed from: a */
    public final aj6 f10310a;
    @CheckForNull

    /* renamed from: a */
    public transient Object f10311a;

    /* renamed from: b */
    public volatile transient boolean f10312b;

    public cj6(aj6 aj6) {
        Objects.requireNonNull(aj6);
        this.f10310a = aj6;
    }

    /* renamed from: a */
    public final Object mo12477a() {
        if (!this.f10312b) {
            synchronized (this) {
                if (!this.f10312b) {
                    Object a = this.f10310a.mo12477a();
                    this.f10311a = a;
                    this.f10312b = true;
                    return a;
                }
            }
        }
        return this.f10311a;
    }

    public final String toString() {
        Object obj;
        if (this.f10312b) {
            obj = "<supplier that returned " + String.valueOf(this.f10311a) + ">";
        } else {
            obj = this.f10310a;
        }
        return "Suppliers.memoize(" + obj.toString() + pl2.f33727d;
    }
}
