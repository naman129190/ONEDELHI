package com.onedelhi.secure;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.transition.PathMotion;

public final class ie2 extends PathMotion {
    /* renamed from: b */
    public static PointF m52159b(float f, float f2, float f3, float f4) {
        return f2 > f4 ? new PointF(f3, f2) : new PointF(f, f4);
    }

    @mr2
    /* renamed from: a */
    public Path mo6787a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        PointF b = m52159b(f, f2, f3, f4);
        path.quadTo(b.x, b.y, f3, f4);
        return path;
    }
}
