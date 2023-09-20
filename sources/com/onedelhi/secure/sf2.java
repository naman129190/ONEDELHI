package com.onedelhi.secure;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

public class sf2 implements TypeEvaluator<Matrix> {

    /* renamed from: a */
    public final Matrix f20339a = new Matrix();

    /* renamed from: a */
    public final float[] f20340a = new float[9];

    /* renamed from: b */
    public final float[] f20341b = new float[9];

    @mr2
    /* renamed from: a */
    public Matrix evaluate(float f, @mr2 Matrix matrix, @mr2 Matrix matrix2) {
        matrix.getValues(this.f20340a);
        matrix2.getValues(this.f20341b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f20341b;
            float f2 = fArr[i];
            float[] fArr2 = this.f20340a;
            fArr[i] = fArr2[i] + ((f2 - fArr2[i]) * f);
        }
        this.f20339a.setValues(this.f20341b);
        return this.f20339a;
    }
}
