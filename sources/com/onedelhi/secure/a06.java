package com.onedelhi.secure;

import java.io.Serializable;

public final class a06 {
    /* renamed from: a */
    public static kz5 m10533a(kz5 kz5) {
        return ((kz5 instanceof sz5) || (kz5 instanceof oz5)) ? kz5 : kz5 instanceof Serializable ? new oz5(kz5) : new sz5(kz5);
    }

    /* renamed from: b */
    public static kz5 m10534b(Object obj) {
        return new wz5(obj);
    }
}
