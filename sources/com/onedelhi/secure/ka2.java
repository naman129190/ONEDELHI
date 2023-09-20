package com.onedelhi.secure;

import android.view.animation.Interpolator;

public abstract class ka2 implements Interpolator {

    /* renamed from: a */
    public final float f14799a;

    /* renamed from: a */
    public final float[] f14800a;

    public ka2(float[] fArr) {
        this.f14800a = fArr;
        this.f14799a = 1.0f / ((float) (fArr.length - 1));
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f14800a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f), fArr.length - 2);
        float f2 = this.f14799a;
        float f3 = (f - (((float) min) * f2)) / f2;
        float[] fArr2 = this.f14800a;
        return fArr2[min] + (f3 * (fArr2[min + 1] - fArr2[min]));
    }
}
