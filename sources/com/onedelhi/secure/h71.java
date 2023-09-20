package com.onedelhi.secure;

import android.graphics.RectF;

@sj3(21)
public class h71 {

    /* renamed from: a */
    public static final e71 f29534a = new C5484a();

    /* renamed from: b */
    public static final e71 f29535b = new C5485b();

    /* renamed from: com.onedelhi.secure.h71$a */
    public class C5484a implements e71 {
        /* renamed from: a */
        public void mo34858a(RectF rectF, float f, i71 i71) {
            rectF.bottom -= Math.abs(i71.f30100f - i71.f30098d) * f;
        }

        /* renamed from: b */
        public boolean mo34859b(i71 i71) {
            return i71.f30098d > i71.f30100f;
        }

        /* renamed from: c */
        public i71 mo34860c(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float m = rh4.m63622m(f4, f6, f2, f3, f, true);
            float f8 = m / f4;
            float f9 = m / f6;
            return new i71(f8, f9, m, f5 * f8, m, f7 * f9);
        }
    }

    /* renamed from: com.onedelhi.secure.h71$b */
    public class C5485b implements e71 {
        /* renamed from: a */
        public void mo34858a(RectF rectF, float f, i71 i71) {
            float abs = (Math.abs(i71.f30099e - i71.f30097c) / 2.0f) * f;
            rectF.left += abs;
            rectF.right -= abs;
        }

        /* renamed from: b */
        public boolean mo34859b(i71 i71) {
            return i71.f30097c > i71.f30099e;
        }

        /* renamed from: c */
        public i71 mo34860c(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float m = rh4.m63622m(f5, f7, f2, f3, f, true);
            float f8 = m / f5;
            float f9 = m / f7;
            return new i71(f8, f9, f4 * f8, m, f6 * f9, m);
        }
    }

    /* renamed from: a */
    public static e71 m50293a(int i, boolean z, RectF rectF, RectF rectF2) {
        if (i == 0) {
            return m50294b(z, rectF, rectF2) ? f29534a : f29535b;
        }
        if (i == 1) {
            return f29534a;
        }
        if (i == 2) {
            return f29535b;
        }
        throw new IllegalArgumentException("Invalid fit mode: " + i);
    }

    /* renamed from: b */
    public static boolean m50294b(boolean z, RectF rectF, RectF rectF2) {
        float width = rectF.width();
        float height = rectF.height();
        float width2 = rectF2.width();
        float height2 = rectF2.height();
        float f = (height2 * width) / width2;
        float f2 = (width2 * height) / width;
        if (z) {
            if (f >= height) {
                return true;
            }
        } else if (f2 >= height2) {
            return true;
        }
        return false;
    }
}
