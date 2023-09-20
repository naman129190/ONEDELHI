package com.onedelhi.secure;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import com.onedelhi.secure.hl3;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public class rv4 {

    /* renamed from: a */
    public static final String f20101a = "ViewUtils";

    /* renamed from: a */
    public static Method f20102a;

    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{Rect.class, Rect.class});
            f20102a = declaredMethod;
            if (!declaredMethod.isAccessible()) {
                f20102a.setAccessible(true);
            }
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    /* renamed from: a */
    public static void m27092a(View view, Rect rect, Rect rect2) {
        Method method = f20102a;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{rect, rect2});
            } catch (Exception e) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
            }
        }
    }

    /* renamed from: b */
    public static boolean m27093b(View view) {
        return jt4.m18928Z(view) == 1;
    }

    /* renamed from: c */
    public static void m27094c(View view) {
        try {
            Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, new Object[0]);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (IllegalAccessException | InvocationTargetException e) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        }
    }
}
