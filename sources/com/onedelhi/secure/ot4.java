package com.onedelhi.secure;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

public final class ot4 {

    /* renamed from: a */
    public static final int f18094a = 0;

    /* renamed from: b */
    public static final int f18095b = 1;

    @sj3(18)
    /* renamed from: com.onedelhi.secure.ot4$a */
    public static class C3089a {
        @pn0
        /* renamed from: a */
        public static int m24071a(ViewGroup viewGroup) {
            return viewGroup.getLayoutMode();
        }

        @pn0
        /* renamed from: b */
        public static void m24072b(ViewGroup viewGroup, int i) {
            viewGroup.setLayoutMode(i);
        }
    }

    @sj3(21)
    /* renamed from: com.onedelhi.secure.ot4$b */
    public static class C3090b {
        @pn0
        /* renamed from: a */
        public static int m24073a(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        @pn0
        /* renamed from: b */
        public static boolean m24074b(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        @pn0
        /* renamed from: c */
        public static void m24075c(ViewGroup viewGroup, boolean z) {
            viewGroup.setTransitionGroup(z);
        }
    }

    /* renamed from: a */
    public static int m24064a(@mr2 ViewGroup viewGroup) {
        return C3089a.m24071a(viewGroup);
    }

    /* renamed from: b */
    public static int m24065b(@mr2 ViewGroup viewGroup) {
        return C3090b.m24073a(viewGroup);
    }

    /* renamed from: c */
    public static boolean m24066c(@mr2 ViewGroup viewGroup) {
        return C3090b.m24074b(viewGroup);
    }

    @Deprecated
    /* renamed from: d */
    public static boolean m24067d(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return viewGroup.onRequestSendAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: e */
    public static void m24068e(@mr2 ViewGroup viewGroup, int i) {
        C3089a.m24072b(viewGroup, i);
    }

    @Deprecated
    /* renamed from: f */
    public static void m24069f(ViewGroup viewGroup, boolean z) {
        viewGroup.setMotionEventSplittingEnabled(z);
    }

    /* renamed from: g */
    public static void m24070g(@mr2 ViewGroup viewGroup, boolean z) {
        C3090b.m24075c(viewGroup, z);
    }
}
