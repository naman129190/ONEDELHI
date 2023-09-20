package com.onedelhi.secure;

import android.graphics.Rect;
import android.util.Log;

public class d71 extends v43 {

    /* renamed from: b */
    public static final String f27272b = "d71";

    /* renamed from: c */
    public float mo34241c(pz3 pz3, pz3 pz32) {
        if (pz3.f33850n <= 0 || pz3.f33851o <= 0) {
            return 0.0f;
        }
        pz3 q = pz3.mo42992q(pz32);
        float f = (((float) q.f33850n) * 1.0f) / ((float) pz3.f33850n);
        if (f > 1.0f) {
            f = (float) Math.pow((double) (1.0f / f), 1.1d);
        }
        float f2 = ((((float) pz32.f33850n) * 1.0f) / ((float) q.f33850n)) * ((((float) pz32.f33851o) * 1.0f) / ((float) q.f33851o));
        return f * (((1.0f / f2) / f2) / f2);
    }

    /* renamed from: d */
    public Rect mo34242d(pz3 pz3, pz3 pz32) {
        pz3 q = pz3.mo42992q(pz32);
        String str = f27272b;
        Log.i(str, "Preview: " + pz3 + "; Scaled: " + q + "; Want: " + pz32);
        int i = (q.f33850n - pz32.f33850n) / 2;
        int i2 = (q.f33851o - pz32.f33851o) / 2;
        return new Rect(-i, -i2, q.f33850n - i, q.f33851o - i2);
    }
}
