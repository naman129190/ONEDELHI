package com.onedelhi.secure;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.f13187b})
/* renamed from: com.onedelhi.secure.d7 */
public class C1947d7 {

    /* renamed from: a */
    public static final TimeInterpolator f10649a = new LinearInterpolator();

    /* renamed from: b */
    public static final TimeInterpolator f10650b = new b01();

    /* renamed from: c */
    public static final TimeInterpolator f10651c = new a01();

    /* renamed from: d */
    public static final TimeInterpolator f10652d = new o32();

    /* renamed from: e */
    public static final TimeInterpolator f10653e = new DecelerateInterpolator();

    /* renamed from: a */
    public static float m12985a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: b */
    public static float m12986b(float f, float f2, @d81(from = 0.0d, mo14561to = 1.0d) float f3, @d81(from = 0.0d, mo14561to = 1.0d) float f4, @d81(from = 0.0d, mo14561to = 1.0d) float f5) {
        return f5 < f3 ? f : f5 > f4 ? f2 : m12985a(f, f2, (f5 - f3) / (f4 - f3));
    }

    /* renamed from: c */
    public static int m12987c(int i, int i2, float f) {
        return i + Math.round(f * ((float) (i2 - i)));
    }
}
