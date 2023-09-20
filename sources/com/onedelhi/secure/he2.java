package com.onedelhi.secure;

import android.graphics.Path;
import android.graphics.PointF;
import android.transition.PathMotion;

@sj3(21)
public final class he2 extends PathMotion {
    /* renamed from: a */
    public static PointF m50471a(float f, float f2, float f3, float f4) {
        return f2 > f4 ? new PointF(f3, f2) : new PointF(f, f4);
    }

    @mr2
    public Path getPath(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        PointF a = m50471a(f, f2, f3, f4);
        path.quadTo(a.x, a.y, f3, f4);
        return path;
    }
}
