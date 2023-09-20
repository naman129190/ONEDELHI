package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class wt4 {

    /* renamed from: a */
    public static Method f22289a = null;

    /* renamed from: a */
    public static boolean f22290a = true;

    /* renamed from: b */
    public static boolean f22291b;

    /* renamed from: a */
    public static int m31098a(@mr2 ViewGroup viewGroup, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            return viewGroup.getChildDrawingOrder(i);
        }
        if (!f22291b) {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                Class cls2 = Integer.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("getChildDrawingOrder", new Class[]{cls2, cls2});
                f22289a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f22291b = true;
        }
        Method method = f22289a;
        if (method != null) {
            try {
                return ((Integer) method.invoke(viewGroup, new Object[]{Integer.valueOf(viewGroup.getChildCount()), Integer.valueOf(i)})).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return i;
    }

    /* renamed from: b */
    public static vt4 m31099b(@mr2 ViewGroup viewGroup) {
        return new tt4(viewGroup);
    }

    @sj3(18)
    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public static void m31100c(@mr2 ViewGroup viewGroup, boolean z) {
        if (f22290a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f22290a = false;
            }
        }
    }

    /* renamed from: d */
    public static void m31101d(@mr2 ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else {
            m31100c(viewGroup, z);
        }
    }
}
