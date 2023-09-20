package com.onedelhi.secure;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@sj3(21)
public class jg1 implements ig1 {

    /* renamed from: a */
    public static Class<?> f14132a = null;

    /* renamed from: a */
    public static Method f14133a = null;

    /* renamed from: b */
    public static final String f14134b = "GhostViewApi21";

    /* renamed from: b */
    public static Method f14135b;

    /* renamed from: b */
    public static boolean f14136b;

    /* renamed from: c */
    public static boolean f14137c;

    /* renamed from: d */
    public static boolean f14138d;

    /* renamed from: a */
    public final View f14139a;

    public jg1(@mr2 View view) {
        this.f14139a = view;
    }

    /* renamed from: b */
    public static ig1 m18537b(View view, ViewGroup viewGroup, Matrix matrix) {
        m18538c();
        Method method = f14133a;
        if (method != null) {
            try {
                return new jg1((View) method.invoke((Object) null, new Object[]{view, viewGroup, matrix}));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return null;
    }

    /* renamed from: c */
    public static void m18538c() {
        if (!f14137c) {
            try {
                m18539d();
                Method declaredMethod = f14132a.getDeclaredMethod("addGhost", new Class[]{View.class, ViewGroup.class, Matrix.class});
                f14133a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i(f14134b, "Failed to retrieve addGhost method", e);
            }
            f14137c = true;
        }
    }

    /* renamed from: d */
    public static void m18539d() {
        if (!f14136b) {
            try {
                f14132a = Class.forName("android.view.GhostView");
            } catch (ClassNotFoundException e) {
                Log.i(f14134b, "Failed to retrieve GhostView class", e);
            }
            f14136b = true;
        }
    }

    /* renamed from: e */
    public static void m18540e() {
        if (!f14138d) {
            try {
                m18539d();
                Method declaredMethod = f14132a.getDeclaredMethod("removeGhost", new Class[]{View.class});
                f14135b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i(f14134b, "Failed to retrieve removeGhost method", e);
            }
            f14138d = true;
        }
    }

    /* renamed from: f */
    public static void m18541f(View view) {
        m18540e();
        Method method = f14135b;
        if (method != null) {
            try {
                method.invoke((Object) null, new Object[]{view});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    /* renamed from: a */
    public void mo7023a(ViewGroup viewGroup, View view) {
    }

    public void setVisibility(int i) {
        this.f14139a.setVisibility(i);
    }
}
