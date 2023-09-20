package com.onedelhi.secure;

import android.os.Build;
import android.view.View;
import android.view.Window;
import com.onedelhi.secure.C3155pk;

public final class lx4 {

    /* renamed from: a */
    public static final int f15658a = 8;

    /* renamed from: b */
    public static final int f15659b = 9;

    /* renamed from: c */
    public static final int f15660c = 10;

    @sj3(16)
    /* renamed from: com.onedelhi.secure.lx4$a */
    public static class C2790a {
        @pn0
        /* renamed from: a */
        public static void m21047a(@mr2 Window window, boolean z) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & -1793 : systemUiVisibility | C3155pk.C3157b.f18593c);
        }
    }

    @sj3(28)
    /* renamed from: com.onedelhi.secure.lx4$b */
    public static class C2791b {
        @pn0
        /* renamed from: a */
        public static <T> T m21048a(Window window, int i) {
            return window.requireViewById(i);
        }
    }

    @sj3(30)
    /* renamed from: com.onedelhi.secure.lx4$c */
    public static class C2792c {
        @pn0
        /* renamed from: a */
        public static void m21049a(@mr2 Window window, boolean z) {
            window.setDecorFitsSystemWindows(z);
        }
    }

    @mr2
    /* renamed from: a */
    public static ux4 m21044a(@mr2 Window window, @mr2 View view) {
        return new ux4(window, view);
    }

    @mr2
    /* renamed from: b */
    public static <T extends View> T m21045b(@mr2 Window window, @mo1 int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (View) C2791b.m21048a(window, i);
        }
        T findViewById = window.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Window");
    }

    /* renamed from: c */
    public static void m21046c(@mr2 Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            C2792c.m21049a(window, z);
        } else {
            C2790a.m21047a(window, z);
        }
    }
}
