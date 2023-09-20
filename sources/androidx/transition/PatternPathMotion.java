package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import com.onedelhi.secure.xj4;
import com.onedelhi.secure.xz2;
import org.xmlpull.v1.XmlPullParser;

public class PatternPathMotion extends PathMotion {

    /* renamed from: a */
    public final Matrix f5541a;

    /* renamed from: a */
    public Path f5542a;

    /* renamed from: b */
    public final Path f5543b;

    public PatternPathMotion() {
        Path path = new Path();
        this.f5543b = path;
        this.f5541a = new Matrix();
        path.lineTo(1.0f, 0.0f);
        this.f5542a = path;
    }

    @SuppressLint({"RestrictedApi"})
    public PatternPathMotion(Context context, AttributeSet attributeSet) {
        this.f5543b = new Path();
        this.f5541a = new Matrix();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1072g.f5687k);
        try {
            String m = xj4.m31496m(obtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (m != null) {
                mo6885d(xz2.m31794e(m));
                return;
            }
            throw new RuntimeException("pathData must be supplied for patternPathMotion");
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public PatternPathMotion(Path path) {
        this.f5543b = new Path();
        this.f5541a = new Matrix();
        mo6885d(path);
    }

    /* renamed from: b */
    public static float m6929b(float f, float f2) {
        return (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
    }

    /* renamed from: a */
    public Path mo6787a(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float b = m6929b(f5, f6);
        double atan2 = Math.atan2((double) f6, (double) f5);
        this.f5541a.setScale(b, b);
        this.f5541a.postRotate((float) Math.toDegrees(atan2));
        this.f5541a.postTranslate(f, f2);
        Path path = new Path();
        this.f5543b.transform(this.f5541a, path);
        return path;
    }

    /* renamed from: c */
    public Path mo6884c() {
        return this.f5542a;
    }

    /* renamed from: d */
    public void mo6885d(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, (float[]) null);
        float f = fArr[0];
        float f2 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, (float[]) null);
        float f3 = fArr[0];
        float f4 = fArr[1];
        if (f3 == f && f4 == f2) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        this.f5541a.setTranslate(-f3, -f4);
        float f5 = f - f3;
        float f6 = f2 - f4;
        float b = 1.0f / m6929b(f5, f6);
        this.f5541a.postScale(b, b);
        this.f5541a.postRotate((float) Math.toDegrees(-Math.atan2((double) f6, (double) f5)));
        path.transform(this.f5541a, this.f5543b);
        this.f5542a = path;
    }
}
