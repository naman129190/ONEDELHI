package com.onedelhi.secure;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import java.lang.reflect.Field;

public final class q12 {

    /* renamed from: a */
    public static final String f18850a = "LayoutInflaterCompatHC";

    /* renamed from: a */
    public static Field f18851a;

    /* renamed from: a */
    public static boolean f18852a;

    /* renamed from: com.onedelhi.secure.q12$a */
    public static class C3221a implements LayoutInflater.Factory2 {

        /* renamed from: a */
        public final r12 f18853a;

        public C3221a(r12 r12) {
            this.f18853a = r12;
        }

        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            return this.f18853a.onCreateView(view, str, context, attributeSet);
        }

        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            return this.f18853a.onCreateView((View) null, str, context, attributeSet);
        }

        @mr2
        public String toString() {
            return getClass().getName() + to1.f35745h + this.f18853a + "}";
        }
    }

    /* renamed from: a */
    public static void m25251a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f18852a) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f18851a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e(f18850a, "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e);
            }
            f18852a = true;
        }
        Field field = f18851a;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e2) {
                Log.e(f18850a, "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e2);
            }
        }
    }

    @Deprecated
    /* renamed from: b */
    public static r12 m25252b(LayoutInflater layoutInflater) {
        LayoutInflater.Factory factory = layoutInflater.getFactory();
        if (factory instanceof C3221a) {
            return ((C3221a) factory).f18853a;
        }
        return null;
    }

    @Deprecated
    /* renamed from: c */
    public static void m25253c(@mr2 LayoutInflater layoutInflater, @mr2 r12 r12) {
        layoutInflater.setFactory2(new C3221a(r12));
    }

    /* renamed from: d */
    public static void m25254d(@mr2 LayoutInflater layoutInflater, @mr2 LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
    }
}
