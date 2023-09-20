package com.onedelhi.secure;

import android.graphics.RectF;

public class g71 {

    /* renamed from: a */
    public static final f71 f28994a = new C5364a();

    /* renamed from: b */
    public static final f71 f28995b = new C5365b();

    /* renamed from: com.onedelhi.secure.g71$a */
    public class C5364a implements f71 {
        /* renamed from: a */
        public void mo35786a(RectF rectF, float f, j71 j71) {
            rectF.bottom -= Math.abs(j71.f30589f - j71.f30587d) * f;
        }

        /* renamed from: b */
        public boolean mo35787b(j71 j71) {
            return j71.f30587d > j71.f30589f;
        }

        /* renamed from: c */
        public j71 mo35788c(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float m = sh4.m64587m(f4, f6, f2, f3, f, true);
            float f8 = m / f4;
            float f9 = m / f6;
            return new j71(f8, f9, m, f5 * f8, m, f7 * f9);
        }
    }

    /* renamed from: com.onedelhi.secure.g71$b */
    public class C5365b implements f71 {
        /* renamed from: a */
        public void mo35786a(RectF rectF, float f, j71 j71) {
            float abs = (Math.abs(j71.f30588e - j71.f30586c) / 2.0f) * f;
            rectF.left += abs;
            rectF.right -= abs;
        }

        /* renamed from: b */
        public boolean mo35787b(j71 j71) {
            return j71.f30586c > j71.f30588e;
        }

        /* renamed from: c */
        public j71 mo35788c(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float m = sh4.m64587m(f5, f7, f2, f3, f, true);
            float f8 = m / f5;
            float f9 = m / f7;
            return new j71(f8, f9, f4 * f8, m, f6 * f9, m);
        }
    }

    /* renamed from: a */
    public static f71 m49090a(int i, boolean z, RectF rectF, RectF rectF2) {
        if (i == 0) {
            return m49091b(z, rectF, rectF2) ? f28994a : f28995b;
        }
        if (i == 1) {
            return f28994a;
        }
        if (i == 2) {
            return f28995b;
        }
        throw new IllegalArgumentException("Invalid fit mode: " + i);
    }

    /* renamed from: b */
    public static boolean m49091b(boolean z, RectF rectF, RectF rectF2) {
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
