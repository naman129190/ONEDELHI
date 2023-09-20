package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import com.onedelhi.secure.xj4;
import org.xmlpull.v1.XmlPullParser;

public class ArcMotion extends PathMotion {

    /* renamed from: g */
    public static final float f5428g = 0.0f;

    /* renamed from: h */
    public static final float f5429h = 70.0f;

    /* renamed from: i */
    public static final float f5430i = ((float) Math.tan(Math.toRadians(35.0d)));

    /* renamed from: a */
    public float f5431a = 0.0f;

    /* renamed from: b */
    public float f5432b = 0.0f;

    /* renamed from: c */
    public float f5433c = 70.0f;

    /* renamed from: d */
    public float f5434d = 0.0f;

    /* renamed from: e */
    public float f5435e = 0.0f;

    /* renamed from: f */
    public float f5436f = f5430i;

    public ArcMotion() {
    }

    @SuppressLint({"RestrictedApi"})
    public ArcMotion(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1072g.f5686j);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        mo6793g(xj4.m31493j(obtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, 0.0f));
        mo6792f(xj4.m31493j(obtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, 0.0f));
        mo6791e(xj4.m31493j(obtainStyledAttributes, xmlPullParser, "maximumAngle", 2, 70.0f));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: h */
    public static float m6827h(float f) {
        if (f >= 0.0f && f <= 90.0f) {
            return (float) Math.tan(Math.toRadians((double) (f / 2.0f)));
        }
        throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
    }

    /* renamed from: a */
    public Path mo6787a(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        Path path = new Path();
        path.moveTo(f, f2);
        float f10 = f3 - f;
        float f11 = f4 - f2;
        float f12 = (f10 * f10) + (f11 * f11);
        float f13 = (f + f3) / 2.0f;
        float f14 = (f2 + f4) / 2.0f;
        float f15 = 0.25f * f12;
        boolean z = f2 > f4;
        if (Math.abs(f10) < Math.abs(f11)) {
            float abs = Math.abs(f12 / (f11 * 2.0f));
            if (z) {
                f7 = abs + f4;
                f6 = f3;
            } else {
                f7 = abs + f2;
                f6 = f;
            }
            f5 = this.f5435e;
        } else {
            float f16 = f12 / (f10 * 2.0f);
            if (z) {
                f9 = f2;
                f8 = f16 + f;
            } else {
                f8 = f3 - f16;
                f9 = f4;
            }
            f5 = this.f5434d;
        }
        float f17 = f15 * f5 * f5;
        float f18 = f13 - f6;
        float f19 = f14 - f7;
        float f20 = (f18 * f18) + (f19 * f19);
        float f21 = this.f5436f;
        float f22 = f15 * f21 * f21;
        if (f20 >= f17) {
            f17 = f20 > f22 ? f22 : 0.0f;
        }
        if (f17 != 0.0f) {
            float sqrt = (float) Math.sqrt((double) (f17 / f20));
            f6 = ((f6 - f13) * sqrt) + f13;
            f7 = f14 + (sqrt * (f7 - f14));
        }
        path.cubicTo((f + f6) / 2.0f, (f2 + f7) / 2.0f, (f6 + f3) / 2.0f, (f7 + f4) / 2.0f, f3, f4);
        return path;
    }

    /* renamed from: b */
    public float mo6788b() {
        return this.f5433c;
    }

    /* renamed from: c */
    public float mo6789c() {
        return this.f5431a;
    }

    /* renamed from: d */
    public float mo6790d() {
        return this.f5432b;
    }

    /* renamed from: e */
    public void mo6791e(float f) {
        this.f5433c = f;
        this.f5436f = m6827h(f);
    }

    /* renamed from: f */
    public void mo6792f(float f) {
        this.f5431a = f;
        this.f5434d = m6827h(f);
    }

    /* renamed from: g */
    public void mo6793g(float f) {
        this.f5432b = f;
        this.f5435e = m6827h(f);
    }
}
