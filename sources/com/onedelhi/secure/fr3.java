package com.onedelhi.secure;

import android.view.ScaleGestureDetector;

public final class fr3 {

    @sj3(19)
    /* renamed from: com.onedelhi.secure.fr3$a */
    public static class C2194a {
        @pn0
        /* renamed from: a */
        public static boolean m15252a(ScaleGestureDetector scaleGestureDetector) {
            return scaleGestureDetector.isQuickScaleEnabled();
        }

        @pn0
        /* renamed from: b */
        public static void m15253b(ScaleGestureDetector scaleGestureDetector, boolean z) {
            scaleGestureDetector.setQuickScaleEnabled(z);
        }
    }

    /* renamed from: a */
    public static boolean m15248a(@mr2 ScaleGestureDetector scaleGestureDetector) {
        return C2194a.m15252a(scaleGestureDetector);
    }

    @Deprecated
    /* renamed from: b */
    public static boolean m15249b(Object obj) {
        return m15248a((ScaleGestureDetector) obj);
    }

    /* renamed from: c */
    public static void m15250c(@mr2 ScaleGestureDetector scaleGestureDetector, boolean z) {
        C2194a.m15253b(scaleGestureDetector, z);
    }

    @Deprecated
    /* renamed from: d */
    public static void m15251d(Object obj, boolean z) {
        m15250c((ScaleGestureDetector) obj, z);
    }
}
