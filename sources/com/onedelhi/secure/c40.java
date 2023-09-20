package com.onedelhi.secure;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

public final class c40 {

    /* renamed from: a */
    public static final String f10098a = "CompoundButtonCompat";

    /* renamed from: a */
    public static Field f10099a;

    /* renamed from: a */
    public static boolean f10100a;

    @sj3(21)
    /* renamed from: com.onedelhi.secure.c40$a */
    public static class C1840a {
        @pn0
        /* renamed from: a */
        public static ColorStateList m12292a(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        @pn0
        /* renamed from: b */
        public static PorterDuff.Mode m12293b(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        @pn0
        /* renamed from: c */
        public static void m12294c(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        @pn0
        /* renamed from: d */
        public static void m12295d(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    @sj3(23)
    /* renamed from: com.onedelhi.secure.c40$b */
    public static class C1841b {
        @pn0
        /* renamed from: a */
        public static Drawable m12296a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    @ts2
    /* renamed from: a */
    public static Drawable m12287a(@mr2 CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C1841b.m12296a(compoundButton);
        }
        if (!f10100a) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f10099a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i(f10098a, "Failed to retrieve mButtonDrawable field", e);
            }
            f10100a = true;
        }
        Field field = f10099a;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e2) {
                Log.i(f10098a, "Failed to get button drawable via reflection", e2);
                f10099a = null;
            }
        }
        return null;
    }

    @ts2
    /* renamed from: b */
    public static ColorStateList m12288b(@mr2 CompoundButton compoundButton) {
        return C1840a.m12292a(compoundButton);
    }

    @ts2
    /* renamed from: c */
    public static PorterDuff.Mode m12289c(@mr2 CompoundButton compoundButton) {
        return C1840a.m12293b(compoundButton);
    }

    /* renamed from: d */
    public static void m12290d(@mr2 CompoundButton compoundButton, @ts2 ColorStateList colorStateList) {
        C1840a.m12294c(compoundButton, colorStateList);
    }

    /* renamed from: e */
    public static void m12291e(@mr2 CompoundButton compoundButton, @ts2 PorterDuff.Mode mode) {
        C1840a.m12295d(compoundButton, mode);
    }
}
