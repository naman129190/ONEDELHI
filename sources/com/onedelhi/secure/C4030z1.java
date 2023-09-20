package com.onedelhi.secure;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.view.accessibility.AccessibilityManager;
import java.util.List;

/* renamed from: com.onedelhi.secure.z1 */
public final class C4030z1 {

    @Deprecated
    /* renamed from: com.onedelhi.secure.z1$a */
    public interface C4031a {
        @Deprecated
        void onAccessibilityStateChanged(boolean z);
    }

    @Deprecated
    /* renamed from: com.onedelhi.secure.z1$b */
    public static abstract class C4032b implements C4031a {
    }

    /* renamed from: com.onedelhi.secure.z1$c */
    public static class C4033c implements AccessibilityManager.AccessibilityStateChangeListener {

        /* renamed from: a */
        public C4031a f23375a;

        public C4033c(@mr2 C4031a aVar) {
            this.f23375a = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C4033c)) {
                return false;
            }
            return this.f23375a.equals(((C4033c) obj).f23375a);
        }

        public int hashCode() {
            return this.f23375a.hashCode();
        }

        public void onAccessibilityStateChanged(boolean z) {
            this.f23375a.onAccessibilityStateChanged(z);
        }
    }

    @sj3(19)
    /* renamed from: com.onedelhi.secure.z1$d */
    public static class C4034d {
        @pn0
        /* renamed from: a */
        public static boolean m32788a(AccessibilityManager accessibilityManager, C4035e eVar) {
            return accessibilityManager.addTouchExplorationStateChangeListener(new C4036f(eVar));
        }

        @pn0
        /* renamed from: b */
        public static boolean m32789b(AccessibilityManager accessibilityManager, C4035e eVar) {
            return accessibilityManager.removeTouchExplorationStateChangeListener(new C4036f(eVar));
        }
    }

    /* renamed from: com.onedelhi.secure.z1$e */
    public interface C4035e {
        void onTouchExplorationStateChanged(boolean z);
    }

    @sj3(19)
    /* renamed from: com.onedelhi.secure.z1$f */
    public static final class C4036f implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a */
        public final C4035e f23376a;

        public C4036f(@mr2 C4035e eVar) {
            this.f23376a = eVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C4036f)) {
                return false;
            }
            return this.f23376a.equals(((C4036f) obj).f23376a);
        }

        public int hashCode() {
            return this.f23376a.hashCode();
        }

        public void onTouchExplorationStateChanged(boolean z) {
            this.f23376a.onTouchExplorationStateChanged(z);
        }
    }

    @Deprecated
    /* renamed from: a */
    public static boolean m32781a(AccessibilityManager accessibilityManager, C4031a aVar) {
        if (aVar == null) {
            return false;
        }
        return accessibilityManager.addAccessibilityStateChangeListener(new C4033c(aVar));
    }

    /* renamed from: b */
    public static boolean m32782b(@mr2 AccessibilityManager accessibilityManager, @mr2 C4035e eVar) {
        return C4034d.m32788a(accessibilityManager, eVar);
    }

    @Deprecated
    /* renamed from: c */
    public static List<AccessibilityServiceInfo> m32783c(AccessibilityManager accessibilityManager, int i) {
        return accessibilityManager.getEnabledAccessibilityServiceList(i);
    }

    @Deprecated
    /* renamed from: d */
    public static List<AccessibilityServiceInfo> m32784d(AccessibilityManager accessibilityManager) {
        return accessibilityManager.getInstalledAccessibilityServiceList();
    }

    @Deprecated
    /* renamed from: e */
    public static boolean m32785e(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isTouchExplorationEnabled();
    }

    @Deprecated
    /* renamed from: f */
    public static boolean m32786f(AccessibilityManager accessibilityManager, C4031a aVar) {
        if (aVar == null) {
            return false;
        }
        return accessibilityManager.removeAccessibilityStateChangeListener(new C4033c(aVar));
    }

    /* renamed from: g */
    public static boolean m32787g(@mr2 AccessibilityManager accessibilityManager, @mr2 C4035e eVar) {
        return C4034d.m32789b(accessibilityManager, eVar);
    }
}
