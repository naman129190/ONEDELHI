package com.onedelhi.secure;

import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.transition.Transition;

/* renamed from: com.onedelhi.secure.ky */
public class C2681ky extends gw4 {

    /* renamed from: a */
    public float f15106a = 3.0f;

    /* renamed from: h */
    public static float m20077h(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        return (float) Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
    }

    /* renamed from: c */
    public long mo19242c(ViewGroup viewGroup, Transition transition, th4 th4, th4 th42) {
        int i;
        int i2;
        int i3;
        if (th4 == null && th42 == null) {
            return 0;
        }
        if (th42 == null || mo16960e(th4) == 0) {
            i = -1;
        } else {
            th4 = th42;
            i = 1;
        }
        int f = mo16961f(th4);
        int g = mo16962g(th4);
        Rect G = transition.mo6896G();
        if (G != null) {
            i3 = G.centerX();
            i2 = G.centerY();
        } else {
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            int round = Math.round(((float) (iArr[0] + (viewGroup.getWidth() / 2))) + viewGroup.getTranslationX());
            i2 = Math.round(((float) (iArr[1] + (viewGroup.getHeight() / 2))) + viewGroup.getTranslationY());
            i3 = round;
        }
        float h = m20077h((float) f, (float) g, (float) i3, (float) i2) / m20077h(0.0f, 0.0f, (float) viewGroup.getWidth(), (float) viewGroup.getHeight());
        long F = transition.mo6895F();
        if (F < 0) {
            F = 300;
        }
        return (long) Math.round((((float) (F * ((long) i))) / this.f15106a) * h);
    }

    /* renamed from: i */
    public void mo19243i(float f) {
        if (f != 0.0f) {
            this.f15106a = f;
            return;
        }
        throw new IllegalArgumentException("propagationSpeed may not be 0");
    }
}
