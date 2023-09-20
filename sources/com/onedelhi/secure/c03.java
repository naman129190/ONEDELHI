package com.onedelhi.secure;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collection;

public final class c03 {

    @sj3(26)
    /* renamed from: com.onedelhi.secure.c03$a */
    public static class C1831a {
        @pn0
        /* renamed from: a */
        public static float[] m12184a(Path path, float f) {
            return path.approximate(f);
        }
    }

    @mr2
    @sj3(26)
    /* renamed from: a */
    public static Collection<b03> m12182a(@mr2 Path path) {
        return m12183b(path, 0.5f);
    }

    @mr2
    @sj3(26)
    /* renamed from: b */
    public static Collection<b03> m12183b(@mr2 Path path, @d81(from = 0.0d) float f) {
        float[] a = C1831a.m12184a(path, f);
        int length = a.length / 3;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 1; i < length; i++) {
            int i2 = i * 3;
            int i3 = (i - 1) * 3;
            float f2 = a[i2];
            float f3 = a[i2 + 1];
            float f4 = a[i2 + 2];
            float f5 = a[i3];
            float f6 = a[i3 + 1];
            float f7 = a[i3 + 2];
            if (!(f2 == f5 || (f3 == f6 && f4 == f7))) {
                arrayList.add(new b03(new PointF(f6, f7), f5, new PointF(f3, f4), f2));
            }
        }
        return arrayList;
    }
}
