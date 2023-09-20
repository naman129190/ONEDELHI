package com.onedelhi.secure;

import android.animation.TypeEvaluator;

public class v71 implements TypeEvaluator<float[]> {

    /* renamed from: a */
    public float[] f21690a;

    public v71(float[] fArr) {
        this.f21690a = fArr;
    }

    /* renamed from: a */
    public float[] evaluate(float f, float[] fArr, float[] fArr2) {
        float[] fArr3 = this.f21690a;
        if (fArr3 == null) {
            fArr3 = new float[fArr.length];
        }
        for (int i = 0; i < fArr3.length; i++) {
            float f2 = fArr[i];
            fArr3[i] = f2 + ((fArr2[i] - f2) * f);
        }
        return fArr3;
    }
}
