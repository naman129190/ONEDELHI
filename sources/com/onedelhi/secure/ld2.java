package com.onedelhi.secure;

import android.view.ViewGroup;

public final class ld2 {

    @sj3(17)
    /* renamed from: com.onedelhi.secure.ld2$a */
    public static class C2731a {
        @pn0
        /* renamed from: a */
        public static int m20485a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getLayoutDirection();
        }

        @pn0
        /* renamed from: b */
        public static int m20486b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginEnd();
        }

        @pn0
        /* renamed from: c */
        public static int m20487c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginStart();
        }

        @pn0
        /* renamed from: d */
        public static boolean m20488d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.isMarginRelative();
        }

        @pn0
        /* renamed from: e */
        public static void m20489e(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.resolveLayoutDirection(i);
        }

        @pn0
        /* renamed from: f */
        public static void m20490f(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.setLayoutDirection(i);
        }

        @pn0
        /* renamed from: g */
        public static void m20491g(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.setMarginEnd(i);
        }

        @pn0
        /* renamed from: h */
        public static void m20492h(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.setMarginStart(i);
        }
    }

    /* renamed from: a */
    public static int m20477a(@mr2 ViewGroup.MarginLayoutParams marginLayoutParams) {
        int a = C2731a.m20485a(marginLayoutParams);
        if (a == 0 || a == 1) {
            return a;
        }
        return 0;
    }

    /* renamed from: b */
    public static int m20478b(@mr2 ViewGroup.MarginLayoutParams marginLayoutParams) {
        return C2731a.m20486b(marginLayoutParams);
    }

    /* renamed from: c */
    public static int m20479c(@mr2 ViewGroup.MarginLayoutParams marginLayoutParams) {
        return C2731a.m20487c(marginLayoutParams);
    }

    /* renamed from: d */
    public static boolean m20480d(@mr2 ViewGroup.MarginLayoutParams marginLayoutParams) {
        return C2731a.m20488d(marginLayoutParams);
    }

    /* renamed from: e */
    public static void m20481e(@mr2 ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        C2731a.m20489e(marginLayoutParams, i);
    }

    /* renamed from: f */
    public static void m20482f(@mr2 ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        C2731a.m20490f(marginLayoutParams, i);
    }

    /* renamed from: g */
    public static void m20483g(@mr2 ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        C2731a.m20491g(marginLayoutParams, i);
    }

    /* renamed from: h */
    public static void m20484h(@mr2 ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        C2731a.m20492h(marginLayoutParams, i);
    }
}
