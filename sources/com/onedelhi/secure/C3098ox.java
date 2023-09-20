package com.onedelhi.secure;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.CheckedTextView;
import java.lang.reflect.Field;

/* renamed from: com.onedelhi.secure.ox */
public final class C3098ox {

    /* renamed from: a */
    public static final String f18168a = "CheckedTextViewCompat";

    /* renamed from: com.onedelhi.secure.ox$a */
    public static class C3099a {

        /* renamed from: a */
        public static Field f18169a;

        /* renamed from: a */
        public static boolean f18170a;

        @ts2
        /* renamed from: a */
        public static Drawable m24160a(@mr2 CheckedTextView checkedTextView) {
            if (!f18170a) {
                try {
                    Field declaredField = CheckedTextView.class.getDeclaredField("mCheckMarkDrawable");
                    f18169a = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e) {
                    Log.i(C3098ox.f18168a, "Failed to retrieve mCheckMarkDrawable field", e);
                }
                f18170a = true;
            }
            Field field = f18169a;
            if (field != null) {
                try {
                    return (Drawable) field.get(checkedTextView);
                } catch (IllegalAccessException e2) {
                    Log.i(C3098ox.f18168a, "Failed to get check mark drawable via reflection", e2);
                    f18169a = null;
                }
            }
            return null;
        }
    }

    @sj3(16)
    /* renamed from: com.onedelhi.secure.ox$b */
    public static class C3100b {
        @ts2
        /* renamed from: a */
        public static Drawable m24161a(@mr2 CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkDrawable();
        }
    }

    @sj3(21)
    /* renamed from: com.onedelhi.secure.ox$c */
    public static class C3101c {
        @ts2
        /* renamed from: a */
        public static ColorStateList m24162a(@mr2 CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkTintList();
        }

        @ts2
        /* renamed from: b */
        public static PorterDuff.Mode m24163b(@mr2 CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkTintMode();
        }

        /* renamed from: c */
        public static void m24164c(@mr2 CheckedTextView checkedTextView, @ts2 ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        /* renamed from: d */
        public static void m24165d(@mr2 CheckedTextView checkedTextView, @ts2 PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }
    }

    @ts2
    /* renamed from: a */
    public static Drawable m24155a(@mr2 CheckedTextView checkedTextView) {
        return C3100b.m24161a(checkedTextView);
    }

    @ts2
    /* renamed from: b */
    public static ColorStateList m24156b(@mr2 CheckedTextView checkedTextView) {
        return C3101c.m24162a(checkedTextView);
    }

    @ts2
    /* renamed from: c */
    public static PorterDuff.Mode m24157c(@mr2 CheckedTextView checkedTextView) {
        return C3101c.m24163b(checkedTextView);
    }

    /* renamed from: d */
    public static void m24158d(@mr2 CheckedTextView checkedTextView, @ts2 ColorStateList colorStateList) {
        C3101c.m24164c(checkedTextView, colorStateList);
    }

    /* renamed from: e */
    public static void m24159e(@mr2 CheckedTextView checkedTextView, @ts2 PorterDuff.Mode mode) {
        C3101c.m24165d(checkedTextView, mode);
    }
}
