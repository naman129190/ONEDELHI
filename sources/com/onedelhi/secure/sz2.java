package com.onedelhi.secure;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import com.onedelhi.secure.hl3;
import org.xmlpull.v1.XmlPullParser;

@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public class sz2 implements Interpolator {

    /* renamed from: a */
    public static final double f20610a = 1.0E-5d;

    /* renamed from: a */
    public static final float f20611a = 0.002f;

    /* renamed from: a */
    public static final int f20612a = 3000;

    /* renamed from: a */
    public float[] f20613a;

    /* renamed from: b */
    public float[] f20614b;

    public sz2(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    public sz2(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray s = xj4.m31502s(resources, theme, attributeSet, C1652a6.f8818l);
        mo24675d(s, xmlPullParser);
        s.recycle();
    }

    /* renamed from: a */
    public final void mo24672a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        mo24673b(path);
    }

    /* renamed from: b */
    public final void mo24673b(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min > 0) {
            this.f20613a = new float[min];
            this.f20614b = new float[min];
            float[] fArr = new float[2];
            for (int i2 = 0; i2 < min; i2++) {
                pathMeasure.getPosTan((((float) i2) * length) / ((float) (min - 1)), fArr, (float[]) null);
                this.f20613a[i2] = fArr[0];
                this.f20614b[i2] = fArr[1];
            }
            if (((double) Math.abs(this.f20613a[0])) <= 1.0E-5d && ((double) Math.abs(this.f20614b[0])) <= 1.0E-5d) {
                int i3 = min - 1;
                if (((double) Math.abs(this.f20613a[i3] - 1.0f)) <= 1.0E-5d && ((double) Math.abs(this.f20614b[i3] - 1.0f)) <= 1.0E-5d) {
                    float f = 0.0f;
                    int i4 = 0;
                    while (i < min) {
                        float[] fArr2 = this.f20613a;
                        int i5 = i4 + 1;
                        float f2 = fArr2[i4];
                        if (f2 >= f) {
                            fArr2[i] = f2;
                            i++;
                            f = f2;
                            i4 = i5;
                        } else {
                            throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f2);
                        }
                    }
                    if (pathMeasure.nextContour()) {
                        throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                    }
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("The Path must start at (0,0) and end at (1,1) start: ");
            sb.append(this.f20613a[0]);
            sb.append(vf4.f36537c);
            sb.append(this.f20614b[0]);
            sb.append(" end:");
            int i6 = min - 1;
            sb.append(this.f20613a[i6]);
            sb.append(vf4.f36537c);
            sb.append(this.f20614b[i6]);
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IllegalArgumentException("The Path has a invalid length " + length);
    }

    /* renamed from: c */
    public final void mo24674c(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        mo24673b(path);
    }

    /* renamed from: d */
    public final void mo24675d(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (xj4.m31501r(xmlPullParser, "pathData")) {
            String m = xj4.m31496m(typedArray, xmlPullParser, "pathData", 4);
            Path e = xz2.m31794e(m);
            if (e != null) {
                mo24673b(e);
                return;
            }
            throw new InflateException("The path is null, which is created from " + m);
        } else if (!xj4.m31501r(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else if (xj4.m31501r(xmlPullParser, "controlY1")) {
            float j = xj4.m31493j(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
            float j2 = xj4.m31493j(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
            boolean r = xj4.m31501r(xmlPullParser, "controlX2");
            if (r != xj4.m31501r(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            } else if (!r) {
                mo24674c(j, j2);
            } else {
                mo24672a(j, j2, xj4.m31493j(typedArray, xmlPullParser, "controlX2", 2, 0.0f), xj4.m31493j(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
            }
        } else {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
    }

    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f20613a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f20613a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f20613a;
        float f2 = fArr[length] - fArr[i];
        if (f2 == 0.0f) {
            return this.f20614b[i];
        }
        float[] fArr2 = this.f20614b;
        float f3 = fArr2[i];
        return f3 + (((f - fArr[i]) / f2) * (fArr2[length] - f3));
    }
}
