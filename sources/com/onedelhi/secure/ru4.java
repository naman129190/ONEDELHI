package com.onedelhi.secure;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

public final class ru4 {

    /* renamed from: a */
    public static final String f20097a = "ViewParentCompat";

    /* renamed from: a */
    public static int[] f20098a;

    @sj3(19)
    /* renamed from: com.onedelhi.secure.ru4$a */
    public static class C3453a {
        @pn0
        /* renamed from: a */
        public static void m27073a(ViewParent viewParent, View view, View view2, int i) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
        }
    }

    @sj3(21)
    /* renamed from: com.onedelhi.secure.ru4$b */
    public static class C3454b {
        @pn0
        /* renamed from: a */
        public static boolean m27074a(ViewParent viewParent, View view, float f, float f2, boolean z) {
            return viewParent.onNestedFling(view, f, f2, z);
        }

        @pn0
        /* renamed from: b */
        public static boolean m27075b(ViewParent viewParent, View view, float f, float f2) {
            return viewParent.onNestedPreFling(view, f, f2);
        }

        @pn0
        /* renamed from: c */
        public static void m27076c(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            viewParent.onNestedPreScroll(view, i, i2, iArr);
        }

        @pn0
        /* renamed from: d */
        public static void m27077d(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            viewParent.onNestedScroll(view, i, i2, i3, i4);
        }

        @pn0
        /* renamed from: e */
        public static void m27078e(ViewParent viewParent, View view, View view2, int i) {
            viewParent.onNestedScrollAccepted(view, view2, i);
        }

        @pn0
        /* renamed from: f */
        public static boolean m27079f(ViewParent viewParent, View view, View view2, int i) {
            return viewParent.onStartNestedScroll(view, view2, i);
        }

        @pn0
        /* renamed from: g */
        public static void m27080g(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }
    }

    /* renamed from: a */
    public static int[] m27057a() {
        int[] iArr = f20098a;
        if (iArr == null) {
            f20098a = new int[2];
        } else {
            iArr[0] = 0;
            iArr[1] = 0;
        }
        return f20098a;
    }

    /* renamed from: b */
    public static void m27058b(@mr2 ViewParent viewParent, @mr2 View view, @mr2 View view2, int i) {
        C3453a.m27073a(viewParent, view, view2, i);
    }

    /* renamed from: c */
    public static boolean m27059c(@mr2 ViewParent viewParent, @mr2 View view, float f, float f2, boolean z) {
        try {
            return C3454b.m27074a(viewParent, view, f, f2, z);
        } catch (AbstractMethodError e) {
            Log.e(f20097a, "ViewParent " + viewParent + " does not implement interface method onNestedFling", e);
            return false;
        }
    }

    /* renamed from: d */
    public static boolean m27060d(@mr2 ViewParent viewParent, @mr2 View view, float f, float f2) {
        try {
            return C3454b.m27075b(viewParent, view, f, f2);
        } catch (AbstractMethodError e) {
            Log.e(f20097a, "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e);
            return false;
        }
    }

    /* renamed from: e */
    public static void m27061e(@mr2 ViewParent viewParent, @mr2 View view, int i, int i2, @mr2 int[] iArr) {
        m27062f(viewParent, view, i, i2, iArr, 0);
    }

    /* renamed from: f */
    public static void m27062f(@mr2 ViewParent viewParent, @mr2 View view, int i, int i2, @mr2 int[] iArr, int i3) {
        if (viewParent instanceof do2) {
            ((do2) viewParent).mo1562b(view, i, i2, iArr, i3);
        } else if (i3 == 0) {
            try {
                C3454b.m27076c(viewParent, view, i, i2, iArr);
            } catch (AbstractMethodError e) {
                Log.e(f20097a, "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e);
            }
        }
    }

    /* renamed from: g */
    public static void m27063g(@mr2 ViewParent viewParent, @mr2 View view, int i, int i2, int i3, int i4) {
        m27065i(viewParent, view, i, i2, i3, i4, 0, m27057a());
    }

    /* renamed from: h */
    public static void m27064h(@mr2 ViewParent viewParent, @mr2 View view, int i, int i2, int i3, int i4, int i5) {
        m27065i(viewParent, view, i, i2, i3, i4, i5, m27057a());
    }

    /* renamed from: i */
    public static void m27065i(@mr2 ViewParent viewParent, @mr2 View view, int i, int i2, int i3, int i4, int i5, @mr2 int[] iArr) {
        ViewParent viewParent2 = viewParent;
        if (viewParent2 instanceof eo2) {
            ((eo2) viewParent2).mo1581l(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent2 instanceof do2) {
            ((do2) viewParent2).mo1583n(view, i, i2, i3, i4, i5);
        } else if (i5 == 0) {
            try {
                C3454b.m27077d(viewParent, view, i, i2, i3, i4);
            } catch (AbstractMethodError e) {
                AbstractMethodError abstractMethodError = e;
                Log.e(f20097a, "ViewParent " + viewParent + " does not implement interface method onNestedScroll", abstractMethodError);
            }
        }
    }

    /* renamed from: j */
    public static void m27066j(@mr2 ViewParent viewParent, @mr2 View view, @mr2 View view2, int i) {
        m27067k(viewParent, view, view2, i, 0);
    }

    /* renamed from: k */
    public static void m27067k(@mr2 ViewParent viewParent, @mr2 View view, @mr2 View view2, int i, int i2) {
        if (viewParent instanceof do2) {
            ((do2) viewParent).mo1599p(view, view2, i, i2);
        } else if (i2 == 0) {
            try {
                C3454b.m27078e(viewParent, view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e(f20097a, "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e);
            }
        }
    }

    /* renamed from: l */
    public static boolean m27068l(@mr2 ViewParent viewParent, @mr2 View view, @mr2 View view2, int i) {
        return m27069m(viewParent, view, view2, i, 0);
    }

    /* renamed from: m */
    public static boolean m27069m(@mr2 ViewParent viewParent, @mr2 View view, @mr2 View view2, int i, int i2) {
        if (viewParent instanceof do2) {
            return ((do2) viewParent).mo1601r(view, view2, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        try {
            return C3454b.m27079f(viewParent, view, view2, i);
        } catch (AbstractMethodError e) {
            Log.e(f20097a, "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e);
            return false;
        }
    }

    /* renamed from: n */
    public static void m27070n(@mr2 ViewParent viewParent, @mr2 View view) {
        m27071o(viewParent, view, 0);
    }

    /* renamed from: o */
    public static void m27071o(@mr2 ViewParent viewParent, @mr2 View view, int i) {
        if (viewParent instanceof do2) {
            ((do2) viewParent).mo1580k(view, i);
        } else if (i == 0) {
            try {
                C3454b.m27080g(viewParent, view);
            } catch (AbstractMethodError e) {
                Log.e(f20097a, "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e);
            }
        }
    }

    @Deprecated
    /* renamed from: p */
    public static boolean m27072p(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }
}
