package com.onedelhi.secure;

import java.io.Serializable;

public final class kj6 {
    /* renamed from: a */
    public static aj6 m19823a(aj6 aj6) {
        return ((aj6 instanceof gj6) || (aj6 instanceof cj6)) ? aj6 : aj6 instanceof Serializable ? new cj6(aj6) : new gj6(aj6);
    }

    /* renamed from: b */
    public static aj6 m19824b(Object obj) {
        return new ij6(obj);
    }
}
