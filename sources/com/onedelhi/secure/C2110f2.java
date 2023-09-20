package com.onedelhi.secure;

import android.graphics.Rect;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;

/* renamed from: com.onedelhi.secure.f2 */
public class C2110f2 {

    /* renamed from: a */
    public static final int f11799a = -1;

    /* renamed from: b */
    public static final int f11800b = 1;

    /* renamed from: c */
    public static final int f11801c = 2;

    /* renamed from: d */
    public static final int f11802d = 3;

    /* renamed from: e */
    public static final int f11803e = 4;

    /* renamed from: f */
    public static final int f11804f = 5;

    /* renamed from: a */
    public final Object f11805a;

    @sj3(21)
    /* renamed from: com.onedelhi.secure.f2$a */
    public static class C2111a {
        @pn0
        /* renamed from: a */
        public static void m14546a(AccessibilityWindowInfo accessibilityWindowInfo, Rect rect) {
            accessibilityWindowInfo.getBoundsInScreen(rect);
        }

        @pn0
        /* renamed from: b */
        public static AccessibilityWindowInfo m14547b(AccessibilityWindowInfo accessibilityWindowInfo, int i) {
            return accessibilityWindowInfo.getChild(i);
        }

        @pn0
        /* renamed from: c */
        public static int m14548c(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getChildCount();
        }

        @pn0
        /* renamed from: d */
        public static int m14549d(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getId();
        }

        @pn0
        /* renamed from: e */
        public static int m14550e(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getLayer();
        }

        @pn0
        /* renamed from: f */
        public static AccessibilityWindowInfo m14551f(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getParent();
        }

        @pn0
        /* renamed from: g */
        public static AccessibilityNodeInfo m14552g(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getRoot();
        }

        @pn0
        /* renamed from: h */
        public static int m14553h(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getType();
        }

        @pn0
        /* renamed from: i */
        public static boolean m14554i(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isAccessibilityFocused();
        }

        @pn0
        /* renamed from: j */
        public static boolean m14555j(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isActive();
        }

        @pn0
        /* renamed from: k */
        public static boolean m14556k(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isFocused();
        }

        @pn0
        /* renamed from: l */
        public static AccessibilityWindowInfo m14557l() {
            return AccessibilityWindowInfo.obtain();
        }

        @pn0
        /* renamed from: m */
        public static AccessibilityWindowInfo m14558m(AccessibilityWindowInfo accessibilityWindowInfo) {
            return AccessibilityWindowInfo.obtain(accessibilityWindowInfo);
        }

        @pn0
        /* renamed from: n */
        public static void m14559n(AccessibilityWindowInfo accessibilityWindowInfo) {
            accessibilityWindowInfo.recycle();
        }
    }

    @sj3(24)
    /* renamed from: com.onedelhi.secure.f2$b */
    public static class C2112b {
        @pn0
        /* renamed from: a */
        public static AccessibilityNodeInfo m14560a(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getAnchor();
        }

        @pn0
        /* renamed from: b */
        public static CharSequence m14561b(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getTitle();
        }
    }

    public C2110f2(Object obj) {
        this.f11805a = obj;
    }

    @ts2
    /* renamed from: n */
    public static C2110f2 m14528n() {
        return m14531r(C2111a.m14557l());
    }

    @ts2
    /* renamed from: o */
    public static C2110f2 m14529o(@ts2 C2110f2 f2Var) {
        if (f2Var == null) {
            return null;
        }
        return m14531r(C2111a.m14558m((AccessibilityWindowInfo) f2Var.f11805a));
    }

    /* renamed from: q */
    public static String m14530q(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "<UNKNOWN>" : "TYPE_ACCESSIBILITY_OVERLAY" : "TYPE_SYSTEM" : "TYPE_INPUT_METHOD" : "TYPE_APPLICATION";
    }

    /* renamed from: r */
    public static C2110f2 m14531r(Object obj) {
        if (obj != null) {
            return new C2110f2(obj);
        }
        return null;
    }

    @ts2
    /* renamed from: a */
    public C1638a2 mo15699a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return C1638a2.m10548Y1(C2112b.m14560a((AccessibilityWindowInfo) this.f11805a));
        }
        return null;
    }

    /* renamed from: b */
    public void mo15700b(@mr2 Rect rect) {
        C2111a.m14546a((AccessibilityWindowInfo) this.f11805a, rect);
    }

    @ts2
    /* renamed from: c */
    public C2110f2 mo15701c(int i) {
        return m14531r(C2111a.m14547b((AccessibilityWindowInfo) this.f11805a, i));
    }

    /* renamed from: d */
    public int mo15702d() {
        return C2111a.m14548c((AccessibilityWindowInfo) this.f11805a);
    }

    /* renamed from: e */
    public int mo15703e() {
        return C2111a.m14549d((AccessibilityWindowInfo) this.f11805a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2110f2)) {
            return false;
        }
        Object obj2 = this.f11805a;
        Object obj3 = ((C2110f2) obj).f11805a;
        return obj2 == null ? obj3 == null : obj2.equals(obj3);
    }

    /* renamed from: f */
    public int mo15705f() {
        return C2111a.m14550e((AccessibilityWindowInfo) this.f11805a);
    }

    @ts2
    /* renamed from: g */
    public C2110f2 mo15706g() {
        return m14531r(C2111a.m14551f((AccessibilityWindowInfo) this.f11805a));
    }

    @ts2
    /* renamed from: h */
    public C1638a2 mo15707h() {
        return C1638a2.m10548Y1(C2111a.m14552g((AccessibilityWindowInfo) this.f11805a));
    }

    public int hashCode() {
        Object obj = this.f11805a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @ts2
    /* renamed from: i */
    public CharSequence mo15709i() {
        if (Build.VERSION.SDK_INT >= 24) {
            return C2112b.m14561b((AccessibilityWindowInfo) this.f11805a);
        }
        return null;
    }

    /* renamed from: j */
    public int mo15710j() {
        return C2111a.m14553h((AccessibilityWindowInfo) this.f11805a);
    }

    /* renamed from: k */
    public boolean mo15711k() {
        return C2111a.m14554i((AccessibilityWindowInfo) this.f11805a);
    }

    /* renamed from: l */
    public boolean mo15712l() {
        return C2111a.m14555j((AccessibilityWindowInfo) this.f11805a);
    }

    /* renamed from: m */
    public boolean mo15713m() {
        return C2111a.m14556k((AccessibilityWindowInfo) this.f11805a);
    }

    /* renamed from: p */
    public void mo15714p() {
        C2111a.m14559n((AccessibilityWindowInfo) this.f11805a);
    }

    @mr2
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Rect rect = new Rect();
        mo15700b(rect);
        sb.append("AccessibilityWindowInfo[");
        sb.append("id=");
        sb.append(mo15703e());
        sb.append(", type=");
        sb.append(m14530q(mo15710j()));
        sb.append(", layer=");
        sb.append(mo15705f());
        sb.append(", bounds=");
        sb.append(rect);
        sb.append(", focused=");
        sb.append(mo15713m());
        sb.append(", active=");
        sb.append(mo15712l());
        sb.append(", hasParent=");
        boolean z = true;
        sb.append(mo15706g() != null);
        sb.append(", hasChildren=");
        if (mo15702d() <= 0) {
            z = false;
        }
        sb.append(z);
        sb.append(']');
        return sb.toString();
    }
}
