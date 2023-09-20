package com.onedelhi.secure;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

public final class rz2 {

    @sj3(21)
    /* renamed from: com.onedelhi.secure.rz2$a */
    public static class C3461a {
        @pn0
        /* renamed from: a */
        public static PathInterpolator m27165a(float f, float f2) {
            return new PathInterpolator(f, f2);
        }

        @pn0
        /* renamed from: b */
        public static PathInterpolator m27166b(float f, float f2, float f3, float f4) {
            return new PathInterpolator(f, f2, f3, f4);
        }

        @pn0
        /* renamed from: c */
        public static PathInterpolator m27167c(Path path) {
            return new PathInterpolator(path);
        }
    }

    @mr2
    /* renamed from: a */
    public static Interpolator m27162a(float f, float f2) {
        return C3461a.m27165a(f, f2);
    }

    @mr2
    /* renamed from: b */
    public static Interpolator m27163b(float f, float f2, float f3, float f4) {
        return C3461a.m27166b(f, f2, f3, f4);
    }

    @mr2
    /* renamed from: c */
    public static Interpolator m27164c(@mr2 Path path) {
        return C3461a.m27167c(path);
    }
}
