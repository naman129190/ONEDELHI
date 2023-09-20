package com.onedelhi.secure;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.onedelhi.secure.hl3;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public class jp0 {

    /* renamed from: a */
    public static final Rect f14363a = new Rect();

    /* renamed from: a */
    public static final int[] f14364a = {16842912};

    /* renamed from: b */
    public static final int[] f14365b = new int[0];

    @sj3(18)
    /* renamed from: com.onedelhi.secure.jp0$a */
    public static class C2537a {

        /* renamed from: a */
        public static final Field f14366a;

        /* renamed from: a */
        public static final Method f14367a;

        /* renamed from: a */
        public static final boolean f14368a;

        /* renamed from: b */
        public static final Field f14369b;

        /* renamed from: c */
        public static final Field f14370c;

        /* renamed from: d */
        public static final Field f14371d;

        /* JADX WARNING: Removed duplicated region for block: B:43:0x004b  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0058  */
        static {
            /*
                r0 = 1
                r1 = 0
                r2 = 0
                java.lang.String r3 = "android.graphics.Insets"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ NoSuchMethodException -> 0x0043, ClassNotFoundException -> 0x003f, NoSuchFieldException -> 0x003b }
                java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
                java.lang.String r5 = "getOpticalInsets"
                java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x0043, ClassNotFoundException -> 0x003f, NoSuchFieldException -> 0x003b }
                java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch:{ NoSuchMethodException -> 0x0043, ClassNotFoundException -> 0x003f, NoSuchFieldException -> 0x003b }
                java.lang.String r5 = "left"
                java.lang.reflect.Field r5 = r3.getField(r5)     // Catch:{ NoSuchMethodException -> 0x0039, ClassNotFoundException -> 0x0037, NoSuchFieldException -> 0x0035 }
                java.lang.String r6 = "top"
                java.lang.reflect.Field r6 = r3.getField(r6)     // Catch:{ NoSuchMethodException -> 0x0033, ClassNotFoundException -> 0x0031, NoSuchFieldException -> 0x002f }
                java.lang.String r7 = "right"
                java.lang.reflect.Field r7 = r3.getField(r7)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException -> 0x002d }
                java.lang.String r8 = "bottom"
                java.lang.reflect.Field r3 = r3.getField(r8)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException -> 0x0047 }
                r8 = 1
                goto L_0x0049
            L_0x002d:
                r7 = r2
                goto L_0x0047
            L_0x002f:
                r6 = r2
                goto L_0x0046
            L_0x0031:
                r6 = r2
                goto L_0x0046
            L_0x0033:
                r6 = r2
                goto L_0x0046
            L_0x0035:
                r5 = r2
                goto L_0x003d
            L_0x0037:
                r5 = r2
                goto L_0x0041
            L_0x0039:
                r5 = r2
                goto L_0x0045
            L_0x003b:
                r4 = r2
                r5 = r4
            L_0x003d:
                r6 = r5
                goto L_0x0046
            L_0x003f:
                r4 = r2
                r5 = r4
            L_0x0041:
                r6 = r5
                goto L_0x0046
            L_0x0043:
                r4 = r2
                r5 = r4
            L_0x0045:
                r6 = r5
            L_0x0046:
                r7 = r6
            L_0x0047:
                r3 = r2
                r8 = 0
            L_0x0049:
                if (r8 == 0) goto L_0x0058
                f14367a = r4
                f14366a = r5
                f14369b = r6
                f14370c = r7
                f14371d = r3
                f14368a = r0
                goto L_0x0064
            L_0x0058:
                f14367a = r2
                f14366a = r2
                f14369b = r2
                f14370c = r2
                f14371d = r2
                f14368a = r1
            L_0x0064:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.jp0.C2537a.<clinit>():void");
        }

        @mr2
        /* renamed from: a */
        public static Rect m18735a(@mr2 Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && f14368a) {
                try {
                    Object invoke = f14367a.invoke(drawable, new Object[0]);
                    if (invoke != null) {
                        return new Rect(f14366a.getInt(invoke), f14369b.getInt(invoke), f14370c.getInt(invoke), f14371d.getInt(invoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return jp0.f14363a;
        }
    }

    @sj3(29)
    /* renamed from: com.onedelhi.secure.jp0$b */
    public static class C2538b {
        @pn0
        /* renamed from: a */
        public static Insets m18736a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    /* renamed from: a */
    public static boolean m18730a(@mr2 Drawable drawable) {
        return true;
    }

    /* renamed from: b */
    public static void m18731b(@mr2 Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if ((i == 21 && sk3.f20414c.equals(name)) || (i >= 29 && i < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name))) {
            m18732c(drawable);
        }
    }

    /* renamed from: c */
    public static void m18732c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f14364a);
        } else {
            drawable.setState(f14365b);
        }
        drawable.setState(state);
    }

    @mr2
    /* renamed from: d */
    public static Rect m18733d(@mr2 Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29) {
            return C2537a.m18735a(wo0.m30988q(drawable));
        }
        Insets a = C2538b.m18736a(drawable);
        return new Rect(a.left, a.top, a.right, a.bottom);
    }

    /* renamed from: e */
    public static PorterDuff.Mode m18734e(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
