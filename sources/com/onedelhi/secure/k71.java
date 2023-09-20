package com.onedelhi.secure;

import android.graphics.Rect;

public class k71 extends v43 {

    /* renamed from: b */
    public static final String f31116b = "k71";

    /* renamed from: e */
    public static float m54092e(float f) {
        return f < 1.0f ? 1.0f / f : f;
    }

    /* renamed from: c */
    public float mo34241c(pz3 pz3, pz3 pz32) {
        int i = pz3.f33850n;
        if (i <= 0 || pz3.f33851o <= 0) {
            return 0.0f;
        }
        float e = (1.0f / m54092e((((float) i) * 1.0f) / ((float) pz32.f33850n))) / m54092e((((float) pz3.f33851o) * 1.0f) / ((float) pz32.f33851o));
        float e2 = m54092e(((((float) pz3.f33850n) * 1.0f) / ((float) pz3.f33851o)) / ((((float) pz32.f33850n) * 1.0f) / ((float) pz32.f33851o)));
        return e * (((1.0f / e2) / e2) / e2);
    }

    /* renamed from: d */
    public Rect mo34242d(pz3 pz3, pz3 pz32) {
        return new Rect(0, 0, pz32.f33850n, pz32.f33851o);
    }
}
