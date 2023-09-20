package com.onedelhi.secure;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

public class qz2 implements Interpolator {

    /* renamed from: a */
    public static final float f19507a = 0.002f;

    /* renamed from: a */
    public final float[] f19508a;

    /* renamed from: b */
    public final float[] f19509b;

    public qz2(float f, float f2) {
        this(m26244b(f, f2));
    }

    public qz2(float f, float f2, float f3, float f4) {
        this(m26243a(f, f2, f3, f4));
    }

    public qz2(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i = ((int) (length / 0.002f)) + 1;
        this.f19508a = new float[i];
        this.f19509b = new float[i];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < i; i2++) {
            pathMeasure.getPosTan((((float) i2) * length) / ((float) (i - 1)), fArr, (float[]) null);
            this.f19508a[i2] = fArr[0];
            this.f19509b[i2] = fArr[1];
        }
    }

    /* renamed from: a */
    public static Path m26243a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        return path;
    }

    /* renamed from: b */
    public static Path m26244b(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        return path;
    }

    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f19508a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f19508a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f19508a;
        float f2 = fArr[length] - fArr[i];
        if (f2 == 0.0f) {
            return this.f19509b[i];
        }
        float[] fArr2 = this.f19509b;
        float f3 = fArr2[i];
        return f3 + (((f - fArr[i]) / f2) * (fArr2[length] - f3));
    }
}
