package com.onedelhi.secure;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.onedelhi.secure.C1638a2;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.nd3;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: com.onedelhi.secure.x1 */
public class C3884x1 {

    /* renamed from: c */
    public static final View.AccessibilityDelegate f22372c = new View.AccessibilityDelegate();

    /* renamed from: a */
    public final View.AccessibilityDelegate f22373a;

    /* renamed from: b */
    public final View.AccessibilityDelegate f22374b;

    /* renamed from: com.onedelhi.secure.x1$a */
    public static final class C3885a extends View.AccessibilityDelegate {

        /* renamed from: a */
        public final C3884x1 f22375a;

        public C3885a(C3884x1 x1Var) {
            this.f22375a = x1Var;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f22375a.mo4112a(view, accessibilityEvent);
        }

        @sj3(16)
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C1740b2 b = this.f22375a.mo6530b(view);
            if (b != null) {
                return (AccessibilityNodeProvider) b.mo13376e();
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f22375a.mo3892f(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            C1638a2 X1 = C1638a2.m10547X1(accessibilityNodeInfo);
            X1.mo12496E1(jt4.m18929Z0(view));
            X1.mo12590k1(jt4.m18893N0(view));
            X1.mo12631y1(jt4.m18879J(view));
            X1.mo12513K1(jt4.m19016v0(view));
            this.f22375a.mo3893g(view, X1);
            X1.mo12572f(accessibilityNodeInfo.getText(), view);
            List<C1638a2.C1639a> c = C3884x1.m31202c(view);
            for (int i = 0; i < c.size(); i++) {
                X1.mo12559b(c.get(i));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f22375a.mo6531h(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f22375a.mo4113i(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f22375a.mo3894j(view, i, bundle);
        }

        public void sendAccessibilityEvent(View view, int i) {
            this.f22375a.mo6532l(view, i);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f22375a.mo6533m(view, accessibilityEvent);
        }
    }

    @sj3(16)
    /* renamed from: com.onedelhi.secure.x1$b */
    public static class C3886b {
        @pn0
        /* renamed from: a */
        public static AccessibilityNodeProvider m31215a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        @pn0
        /* renamed from: b */
        public static boolean m31216b(View.AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
        }
    }

    public C3884x1() {
        this(f22372c);
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    public C3884x1(@mr2 View.AccessibilityDelegate accessibilityDelegate) {
        this.f22373a = accessibilityDelegate;
        this.f22374b = new C3885a(this);
    }

    /* renamed from: c */
    public static List<C1638a2.C1639a> m31202c(View view) {
        List<C1638a2.C1639a> list = (List) view.getTag(nd3.C2969e.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: a */
    public boolean mo4112a(@mr2 View view, @mr2 AccessibilityEvent accessibilityEvent) {
        return this.f22373a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @ts2
    /* renamed from: b */
    public C1740b2 mo6530b(@mr2 View view) {
        AccessibilityNodeProvider a = C3886b.m31215a(this.f22373a, view);
        if (a != null) {
            return new C1740b2(a);
        }
        return null;
    }

    /* renamed from: d */
    public View.AccessibilityDelegate mo26736d() {
        return this.f22374b;
    }

    /* renamed from: e */
    public final boolean mo26737e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] x = C1638a2.m10550x(view.createAccessibilityNodeInfo().getText());
            int i = 0;
            while (x != null && i < x.length) {
                if (clickableSpan.equals(x[i])) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    /* renamed from: f */
    public void mo3892f(@mr2 View view, @mr2 AccessibilityEvent accessibilityEvent) {
        this.f22373a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: g */
    public void mo3893g(@mr2 View view, @mr2 C1638a2 a2Var) {
        this.f22373a.onInitializeAccessibilityNodeInfo(view, a2Var.mo12549W1());
    }

    /* renamed from: h */
    public void mo6531h(@mr2 View view, @mr2 AccessibilityEvent accessibilityEvent) {
        this.f22373a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: i */
    public boolean mo4113i(@mr2 ViewGroup viewGroup, @mr2 View view, @mr2 AccessibilityEvent accessibilityEvent) {
        return this.f22373a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: j */
    public boolean mo3894j(@mr2 View view, int i, @ts2 Bundle bundle) {
        List<C1638a2.C1639a> c = m31202c(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= c.size()) {
                break;
            }
            C1638a2.C1639a aVar = c.get(i2);
            if (aVar.mo12636b() == i) {
                z = aVar.mo12638d(view, bundle);
                break;
            }
            i2++;
        }
        if (!z) {
            z = C3886b.m31216b(this.f22373a, view, i, bundle);
        }
        return (z || i != nd3.C2969e.accessibility_action_clickable_span || bundle == null) ? z : mo26738k(bundle.getInt(C3823w1.f22024b, -1), view);
    }

    /* renamed from: k */
    public final boolean mo26738k(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(nd3.C2969e.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!mo26737e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    /* renamed from: l */
    public void mo6532l(@mr2 View view, int i) {
        this.f22373a.sendAccessibilityEvent(view, i);
    }

    /* renamed from: m */
    public void mo6533m(@mr2 View view, @mr2 AccessibilityEvent accessibilityEvent) {
        this.f22373a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
