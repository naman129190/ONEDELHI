package com.onedelhi.secure;

import android.graphics.Color;
import com.onedelhi.secure.wv1;
import java.io.IOException;

public class i10 implements is4<Integer> {

    /* renamed from: a */
    public static final i10 f13448a = new i10();

    /* renamed from: b */
    public Integer mo13530a(wv1 wv1, float f) throws IOException {
        boolean z = wv1.mo17955H() == wv1.C3877b.BEGIN_ARRAY;
        if (z) {
            wv1.mo17964b();
        }
        double m = wv1.mo17974m();
        double m2 = wv1.mo17974m();
        double m3 = wv1.mo17974m();
        double m4 = wv1.mo17974m();
        if (z) {
            wv1.mo17967d();
        }
        if (m <= 1.0d && m2 <= 1.0d && m3 <= 1.0d) {
            m *= 255.0d;
            m2 *= 255.0d;
            m3 *= 255.0d;
            if (m4 <= 1.0d) {
                m4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) m4, (int) m, (int) m2, (int) m3));
    }
}
