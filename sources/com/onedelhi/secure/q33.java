package com.onedelhi.secure;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class q33 {

    /* renamed from: a */
    public static final String f18860a = "PopupWindowCompatApi21";

    /* renamed from: a */
    public static Field f18861a;

    /* renamed from: a */
    public static Method f18862a;

    /* renamed from: a */
    public static boolean f18863a;

    /* renamed from: b */
    public static Method f18864b;

    /* renamed from: b */
    public static boolean f18865b;

    /* renamed from: c */
    public static boolean f18866c;

    @sj3(19)
    /* renamed from: com.onedelhi.secure.q33$a */
    public static class C3224a {
        @pn0
        /* renamed from: a */
        public static void m25276a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            popupWindow.showAsDropDown(view, i, i2, i3);
        }
    }

    @sj3(23)
    /* renamed from: com.onedelhi.secure.q33$b */
    public static class C3225b {
        @pn0
        /* renamed from: a */
        public static boolean m25277a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        @pn0
        /* renamed from: b */
        public static int m25278b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        @pn0
        /* renamed from: c */
        public static void m25279c(PopupWindow popupWindow, boolean z) {
            popupWindow.setOverlapAnchor(z);
        }

        @pn0
        /* renamed from: d */
        public static void m25280d(PopupWindow popupWindow, int i) {
            popupWindow.setWindowLayoutType(i);
        }
    }

    /* renamed from: a */
    public static boolean m25271a(@mr2 PopupWindow popupWindow) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C3225b.m25277a(popupWindow);
        }
        if (!f18866c) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f18861a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i(f18860a, "Could not fetch mOverlapAnchor field from PopupWindow", e);
            }
            f18866c = true;
        }
        Field field = f18861a;
        if (field == null) {
            return false;
        }
        try {
            return ((Boolean) field.get(popupWindow)).booleanValue();
        } catch (IllegalAccessException e2) {
            Log.i(f18860a, "Could not get overlap anchor field in PopupWindow", e2);
            return false;
        }
    }

    /* renamed from: b */
    public static int m25272b(@mr2 PopupWindow popupWindow) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C3225b.m25278b(popupWindow);
        }
        if (!f18865b) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("getWindowLayoutType", new Class[0]);
                f18864b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f18865b = true;
        }
        Method method = f18864b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(popupWindow, new Object[0])).intValue();
            } catch (Exception unused2) {
            }
        }
        return 0;
    }

    /* renamed from: c */
    public static void m25273c(@mr2 PopupWindow popupWindow, boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            C3225b.m25279c(popupWindow, z);
            return;
        }
        if (!f18866c) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f18861a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i(f18860a, "Could not fetch mOverlapAnchor field from PopupWindow", e);
            }
            f18866c = true;
        }
        Field field = f18861a;
        if (field != null) {
            try {
                field.set(popupWindow, Boolean.valueOf(z));
            } catch (IllegalAccessException e2) {
                Log.i(f18860a, "Could not set overlap anchor field in PopupWindow", e2);
            }
        }
    }

    /* renamed from: d */
    public static void m25274d(@mr2 PopupWindow popupWindow, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            C3225b.m25280d(popupWindow, i);
            return;
        }
        if (!f18863a) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                Method declaredMethod = cls.getDeclaredMethod("setWindowLayoutType", new Class[]{Integer.TYPE});
                f18862a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f18863a = true;
        }
        Method method = f18862a;
        if (method != null) {
            try {
                method.invoke(popupWindow, new Object[]{Integer.valueOf(i)});
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: e */
    public static void m25275e(@mr2 PopupWindow popupWindow, @mr2 View view, int i, int i2, int i3) {
        C3224a.m25276a(popupWindow, view, i, i2, i3);
    }
}
