package com.onedelhi.secure;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.onedelhi.secure.b2 */
public class C1740b2 {

    /* renamed from: a */
    public static final int f9605a = -1;
    @ts2

    /* renamed from: a */
    public final Object f9606a;

    @sj3(16)
    /* renamed from: com.onedelhi.secure.b2$a */
    public static class C1741a extends AccessibilityNodeProvider {

        /* renamed from: a */
        public final C1740b2 f9607a;

        public C1741a(C1740b2 b2Var) {
            this.f9607a = b2Var;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C1638a2 b = this.f9607a.mo13373b(i);
            if (b == null) {
                return null;
            }
            return b.mo12549W1();
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<C1638a2> c = this.f9607a.mo13374c(str, i);
            if (c == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = c.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(c.get(i2).mo12549W1());
            }
            return arrayList;
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f9607a.mo13377f(i, i2, bundle);
        }
    }

    @sj3(19)
    /* renamed from: com.onedelhi.secure.b2$b */
    public static class C1742b extends C1741a {
        public C1742b(C1740b2 b2Var) {
            super(b2Var);
        }

        public AccessibilityNodeInfo findFocus(int i) {
            C1638a2 d = this.f9607a.mo13375d(i);
            if (d == null) {
                return null;
            }
            return d.mo12549W1();
        }
    }

    @sj3(26)
    /* renamed from: com.onedelhi.secure.b2$c */
    public static class C1743c extends C1742b {
        public C1743c(C1740b2 b2Var) {
            super(b2Var);
        }

        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f9607a.mo13372a(i, C1638a2.m10547X1(accessibilityNodeInfo), str, bundle);
        }
    }

    public C1740b2() {
        this.f9606a = Build.VERSION.SDK_INT >= 26 ? new C1743c(this) : new C1742b(this);
    }

    public C1740b2(@ts2 Object obj) {
        this.f9606a = obj;
    }

    /* renamed from: a */
    public void mo13372a(int i, @mr2 C1638a2 a2Var, @mr2 String str, @ts2 Bundle bundle) {
    }

    @ts2
    /* renamed from: b */
    public C1638a2 mo13373b(int i) {
        return null;
    }

    @ts2
    /* renamed from: c */
    public List<C1638a2> mo13374c(@mr2 String str, int i) {
        return null;
    }

    @ts2
    /* renamed from: d */
    public C1638a2 mo13375d(int i) {
        return null;
    }

    @ts2
    /* renamed from: e */
    public Object mo13376e() {
        return this.f9606a;
    }

    /* renamed from: f */
    public boolean mo13377f(int i, int i2, @ts2 Bundle bundle) {
        return false;
    }
}
