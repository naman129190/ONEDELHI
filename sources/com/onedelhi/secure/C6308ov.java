package com.onedelhi.secure;

import android.graphics.Rect;
import android.util.Log;

/* renamed from: com.onedelhi.secure.ov */
public class C6308ov extends v43 {

    /* renamed from: b */
    public static final String f33187b = "ov";

    /* renamed from: c */
    public float mo34241c(pz3 pz3, pz3 pz32) {
        if (pz3.f33850n <= 0 || pz3.f33851o <= 0) {
            return 0.0f;
        }
        pz3 l = pz3.mo42991l(pz32);
        float f = (((float) l.f33850n) * 1.0f) / ((float) pz3.f33850n);
        if (f > 1.0f) {
            f = (float) Math.pow((double) (1.0f / f), 1.1d);
        }
        float f2 = ((((float) l.f33850n) * 1.0f) / ((float) pz32.f33850n)) + ((((float) l.f33851o) * 1.0f) / ((float) pz32.f33851o));
        return f * ((1.0f / f2) / f2);
    }

    /* renamed from: d */
    public Rect mo34242d(pz3 pz3, pz3 pz32) {
        pz3 l = pz3.mo42991l(pz32);
        String str = f33187b;
        Log.i(str, "Preview: " + pz3 + "; Scaled: " + l + "; Want: " + pz32);
        int i = (l.f33850n - pz32.f33850n) / 2;
        int i2 = (l.f33851o - pz32.f33851o) / 2;
        return new Rect(-i, -i2, l.f33850n - i, l.f33851o - i2);
    }
}
