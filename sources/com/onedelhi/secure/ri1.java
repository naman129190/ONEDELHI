package com.onedelhi.secure;

import android.graphics.Rect;
import android.view.Gravity;

public final class ri1 {

    /* renamed from: a */
    public static final int f19868a = 8388608;

    /* renamed from: b */
    public static final int f19869b = 8388611;

    /* renamed from: c */
    public static final int f19870c = 8388613;

    /* renamed from: d */
    public static final int f19871d = 8388615;

    @sj3(17)
    /* renamed from: com.onedelhi.secure.ri1$a */
    public static class C3417a {
        @pn0
        /* renamed from: a */
        public static void m26763a(int i, int i2, int i3, Rect rect, int i4, int i5, Rect rect2, int i6) {
            Gravity.apply(i, i2, i3, rect, i4, i5, rect2, i6);
        }

        @pn0
        /* renamed from: b */
        public static void m26764b(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
            Gravity.apply(i, i2, i3, rect, rect2, i4);
        }

        @pn0
        /* renamed from: c */
        public static void m26765c(int i, Rect rect, Rect rect2, int i2) {
            Gravity.applyDisplay(i, rect, rect2, i2);
        }
    }

    /* renamed from: a */
    public static void m26759a(int i, int i2, int i3, @mr2 Rect rect, int i4, int i5, @mr2 Rect rect2, int i6) {
        C3417a.m26763a(i, i2, i3, rect, i4, i5, rect2, i6);
    }

    /* renamed from: b */
    public static void m26760b(int i, int i2, int i3, @mr2 Rect rect, @mr2 Rect rect2, int i4) {
        C3417a.m26764b(i, i2, i3, rect, rect2, i4);
    }

    /* renamed from: c */
    public static void m26761c(int i, @mr2 Rect rect, @mr2 Rect rect2, int i2) {
        C3417a.m26765c(i, rect, rect2, i2);
    }

    /* renamed from: d */
    public static int m26762d(int i, int i2) {
        return Gravity.getAbsoluteGravity(i, i2);
    }
}
