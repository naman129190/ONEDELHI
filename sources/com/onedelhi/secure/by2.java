package com.onedelhi.secure;

import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;

public final class by2 {

    /* renamed from: a */
    public static final String f10021a = "󟿽";

    /* renamed from: a */
    public static final ThreadLocal<fy2<Rect, Rect>> f10022a = new ThreadLocal<>();

    /* renamed from: b */
    public static final String f10023b = "m";

    @sj3(23)
    /* renamed from: com.onedelhi.secure.by2$a */
    public static class C1826a {
        @pn0
        /* renamed from: a */
        public static boolean m12142a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    @sj3(29)
    /* renamed from: com.onedelhi.secure.by2$b */
    public static class C1827b {
        @pn0
        /* renamed from: a */
        public static void m12143a(Paint paint, Object obj) {
            paint.setBlendMode((BlendMode) obj);
        }
    }

    /* renamed from: a */
    public static boolean m12139a(@mr2 Paint paint, @mr2 String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C1826a.m12142a(paint, str);
        }
        int length = str.length();
        if (length == 1 && Character.isWhitespace(str.charAt(0))) {
            return true;
        }
        float measureText = paint.measureText(f10021a);
        float measureText2 = paint.measureText(f10023b);
        float measureText3 = paint.measureText(str);
        float f = 0.0f;
        if (measureText3 == 0.0f) {
            return false;
        }
        if (str.codePointCount(0, str.length()) > 1) {
            if (measureText3 > measureText2 * 2.0f) {
                return false;
            }
            int i = 0;
            while (i < length) {
                int charCount = Character.charCount(str.codePointAt(i)) + i;
                f += paint.measureText(str, i, charCount);
                i = charCount;
            }
            if (measureText3 >= f) {
                return false;
            }
        }
        if (measureText3 != measureText) {
            return true;
        }
        fy2<Rect, Rect> b = m12140b();
        paint.getTextBounds(f10021a, 0, 2, (Rect) b.f12385a);
        paint.getTextBounds(str, 0, length, (Rect) b.f12386b);
        return !((Rect) b.f12385a).equals(b.f12386b);
    }

    /* renamed from: b */
    public static fy2<Rect, Rect> m12140b() {
        ThreadLocal<fy2<Rect, Rect>> threadLocal = f10022a;
        fy2<Rect, Rect> fy2 = threadLocal.get();
        if (fy2 == null) {
            fy2<Rect, Rect> fy22 = new fy2<>(new Rect(), new Rect());
            threadLocal.set(fy22);
            return fy22;
        }
        ((Rect) fy2.f12385a).setEmpty();
        ((Rect) fy2.f12386b).setEmpty();
        return fy2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: android.graphics.PorterDuffXfermode} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: android.graphics.PorterDuffXfermode} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: android.graphics.PorterDuffXfermode} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: android.graphics.PorterDuffXfermode} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: android.graphics.PorterDuffXfermode} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m12141c(@com.onedelhi.secure.mr2 android.graphics.Paint r4, @com.onedelhi.secure.ts2 com.onedelhi.secure.C3799vm r5) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 0
            r3 = 29
            if (r0 < r3) goto L_0x0012
            if (r5 == 0) goto L_0x000e
            java.lang.Object r2 = com.onedelhi.secure.C3859wm.C3861b.m30948a(r5)
        L_0x000e:
            com.onedelhi.secure.by2.C1827b.m12143a(r4, r2)
            return r1
        L_0x0012:
            if (r5 == 0) goto L_0x0027
            android.graphics.PorterDuff$Mode r5 = com.onedelhi.secure.C3859wm.m30947a(r5)
            if (r5 == 0) goto L_0x001f
            android.graphics.PorterDuffXfermode r2 = new android.graphics.PorterDuffXfermode
            r2.<init>(r5)
        L_0x001f:
            r4.setXfermode(r2)
            if (r5 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r1 = 0
        L_0x0026:
            return r1
        L_0x0027:
            r4.setXfermode(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.by2.m12141c(android.graphics.Paint, com.onedelhi.secure.vm):boolean");
    }
}
