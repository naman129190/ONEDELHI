package com.onedelhi.secure;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

public final class lt4 {

    /* renamed from: a */
    public static final String f15623a = "ViewConfigCompat";

    /* renamed from: a */
    public static Method f15624a;

    @sj3(26)
    /* renamed from: com.onedelhi.secure.lt4$a */
    public static class C2782a {
        @pn0
        /* renamed from: a */
        public static float m20984a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        @pn0
        /* renamed from: b */
        public static float m20985b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    @sj3(28)
    /* renamed from: com.onedelhi.secure.lt4$b */
    public static class C2783b {
        @pn0
        /* renamed from: a */
        public static int m20986a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHoverSlop();
        }

        @pn0
        /* renamed from: b */
        public static boolean m20987b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f15624a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
            } catch (Exception unused) {
                Log.i(f15623a, "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    /* renamed from: a */
    public static float m20977a(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = f15624a) != null) {
            try {
                return (float) ((Integer) method.invoke(viewConfiguration, new Object[0])).intValue();
            } catch (Exception unused) {
                Log.i(f15623a, "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    /* renamed from: b */
    public static float m20978b(@mr2 ViewConfiguration viewConfiguration, @mr2 Context context) {
        return Build.VERSION.SDK_INT >= 26 ? C2782a.m20984a(viewConfiguration) : m20977a(viewConfiguration, context);
    }

    /* renamed from: c */
    public static int m20979c(@mr2 ViewConfiguration viewConfiguration) {
        return Build.VERSION.SDK_INT >= 28 ? C2783b.m20986a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
    }

    @Deprecated
    /* renamed from: d */
    public static int m20980d(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledPagingTouchSlop();
    }

    /* renamed from: e */
    public static float m20981e(@mr2 ViewConfiguration viewConfiguration, @mr2 Context context) {
        return Build.VERSION.SDK_INT >= 26 ? C2782a.m20985b(viewConfiguration) : m20977a(viewConfiguration, context);
    }

    @Deprecated
    /* renamed from: f */
    public static boolean m20982f(ViewConfiguration viewConfiguration) {
        return viewConfiguration.hasPermanentMenuKey();
    }

    /* renamed from: g */
    public static boolean m20983g(@mr2 ViewConfiguration viewConfiguration, @mr2 Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C2783b.m20987b(viewConfiguration);
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
        return identifier != 0 && resources.getBoolean(identifier);
    }
}
