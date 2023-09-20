package com.onedelhi.secure;

import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.CheckForNull;

public final class wz5 implements Serializable, kz5 {

    /* renamed from: a */
    public final Object f22365a;

    public wz5(Object obj) {
        this.f22365a = obj;
    }

    /* renamed from: a */
    public final Object mo19246a() {
        return this.f22365a;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof wz5)) {
            return false;
        }
        Object obj2 = this.f22365a;
        Object obj3 = ((wz5) obj).f22365a;
        return obj2 == obj3 || obj2.equals(obj3);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f22365a});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f22365a + pl2.f33727d;
    }
}
