package com.onedelhi.secure;

import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import com.onedelhi.secure.hl3;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: com.onedelhi.secure.y1 */
public final class C3958y1 {

    /* renamed from: A */
    public static final int f22831A = -1;
    @Deprecated

    /* renamed from: a */
    public static final int f22832a = 128;
    @Deprecated

    /* renamed from: b */
    public static final int f22833b = 256;
    @Deprecated

    /* renamed from: c */
    public static final int f22834c = 512;
    @Deprecated

    /* renamed from: d */
    public static final int f22835d = 1024;
    @Deprecated

    /* renamed from: e */
    public static final int f22836e = 2048;
    @Deprecated

    /* renamed from: f */
    public static final int f22837f = 4096;
    @Deprecated

    /* renamed from: g */
    public static final int f22838g = 8192;

    /* renamed from: h */
    public static final int f22839h = 16384;

    /* renamed from: i */
    public static final int f22840i = 32768;

    /* renamed from: j */
    public static final int f22841j = 65536;

    /* renamed from: k */
    public static final int f22842k = 131072;

    /* renamed from: l */
    public static final int f22843l = 262144;

    /* renamed from: m */
    public static final int f22844m = 524288;

    /* renamed from: n */
    public static final int f22845n = 1048576;

    /* renamed from: o */
    public static final int f22846o = 2097152;

    /* renamed from: p */
    public static final int f22847p = 4194304;

    /* renamed from: q */
    public static final int f22848q = 8388608;

    /* renamed from: r */
    public static final int f22849r = 16777216;

    /* renamed from: s */
    public static final int f22850s = 0;

    /* renamed from: t */
    public static final int f22851t = 1;

    /* renamed from: u */
    public static final int f22852u = 2;

    /* renamed from: v */
    public static final int f22853v = 4;

    /* renamed from: w */
    public static final int f22854w = 8;

    /* renamed from: x */
    public static final int f22855x = 16;

    /* renamed from: y */
    public static final int f22856y = 32;

    /* renamed from: z */
    public static final int f22857z = 64;

    @sj3(16)
    /* renamed from: com.onedelhi.secure.y1$a */
    public static class C3959a {
        @pn0
        /* renamed from: a */
        public static int m31842a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getAction();
        }

        @pn0
        /* renamed from: b */
        public static int m31843b(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getMovementGranularity();
        }

        @pn0
        /* renamed from: c */
        public static void m31844c(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setAction(i);
        }

        @pn0
        /* renamed from: d */
        public static void m31845d(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setMovementGranularity(i);
        }
    }

    @sj3(19)
    /* renamed from: com.onedelhi.secure.y1$b */
    public static class C3960b {
        @pn0
        /* renamed from: a */
        public static int m31846a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getContentChangeTypes();
        }

        @pn0
        /* renamed from: b */
        public static void m31847b(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.y1$c */
    public @interface C3961c {
    }

    @Deprecated
    /* renamed from: a */
    public static void m31832a(AccessibilityEvent accessibilityEvent, C1833c2 c2Var) {
        accessibilityEvent.appendRecord((AccessibilityRecord) c2Var.mo13932g());
    }

    @Deprecated
    /* renamed from: b */
    public static C1833c2 m31833b(AccessibilityEvent accessibilityEvent) {
        return new C1833c2(accessibilityEvent);
    }

    /* renamed from: c */
    public static int m31834c(@mr2 AccessibilityEvent accessibilityEvent) {
        return C3959a.m31842a(accessibilityEvent);
    }

    /* renamed from: d */
    public static int m31835d(@mr2 AccessibilityEvent accessibilityEvent) {
        return C3960b.m31846a(accessibilityEvent);
    }

    /* renamed from: e */
    public static int m31836e(@mr2 AccessibilityEvent accessibilityEvent) {
        return C3959a.m31843b(accessibilityEvent);
    }

    @Deprecated
    /* renamed from: f */
    public static C1833c2 m31837f(AccessibilityEvent accessibilityEvent, int i) {
        return new C1833c2(accessibilityEvent.getRecord(i));
    }

    @Deprecated
    /* renamed from: g */
    public static int m31838g(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getRecordCount();
    }

    /* renamed from: h */
    public static void m31839h(@mr2 AccessibilityEvent accessibilityEvent, int i) {
        C3959a.m31844c(accessibilityEvent, i);
    }

    /* renamed from: i */
    public static void m31840i(@mr2 AccessibilityEvent accessibilityEvent, int i) {
        C3960b.m31847b(accessibilityEvent, i);
    }

    /* renamed from: j */
    public static void m31841j(@mr2 AccessibilityEvent accessibilityEvent, int i) {
        C3959a.m31845d(accessibilityEvent, i);
    }
}
