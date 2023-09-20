package com.onedelhi.secure;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.Toolbar;
import com.onedelhi.secure.C3632ti;
import com.onedelhi.secure.fd3;

@cy0
/* renamed from: com.onedelhi.secure.ui */
public class C3711ui {

    /* renamed from: a */
    public static final String f21381a = "BadgeUtils";

    /* renamed from: a */
    public static final boolean f21382a = false;

    /* renamed from: com.onedelhi.secure.ui$a */
    public class C3712a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ FrameLayout f21383a;

        /* renamed from: a */
        public final /* synthetic */ Toolbar f21384a;

        /* renamed from: a */
        public final /* synthetic */ C3516si f21385a;

        /* renamed from: n */
        public final /* synthetic */ int f21386n;

        public C3712a(Toolbar toolbar, int i, C3516si siVar, FrameLayout frameLayout) {
            this.f21384a = toolbar;
            this.f21386n = i;
            this.f21385a = siVar;
            this.f21383a = frameLayout;
        }

        public void run() {
            ActionMenuItemView a = nf4.m58061a(this.f21384a, this.f21386n);
            if (a != null) {
                C3711ui.m29367n(this.f21385a, this.f21384a.getResources());
                C3711ui.m29357d(this.f21385a, a, this.f21383a);
                C3711ui.m29355b(this.f21385a, a);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.ui$b */
    public class C3713b extends C3884x1 {

        /* renamed from: a */
        public final /* synthetic */ C3516si f21387a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3713b(View.AccessibilityDelegate accessibilityDelegate, C3516si siVar) {
            super(accessibilityDelegate);
            this.f21387a = siVar;
        }

        /* renamed from: g */
        public void mo3893g(View view, C1638a2 a2Var) {
            super.mo3893g(view, a2Var);
            a2Var.mo12558a1(this.f21387a.mo24431o());
        }
    }

    /* renamed from: com.onedelhi.secure.ui$c */
    public class C3714c extends C3884x1 {

        /* renamed from: a */
        public final /* synthetic */ C3516si f21388a;

        public C3714c(C3516si siVar) {
            this.f21388a = siVar;
        }

        /* renamed from: g */
        public void mo3893g(View view, C1638a2 a2Var) {
            super.mo3893g(view, a2Var);
            a2Var.mo12558a1(this.f21388a.mo24431o());
        }
    }

    /* renamed from: com.onedelhi.secure.ui$d */
    public class C3715d extends C3884x1 {
        public C3715d(View.AccessibilityDelegate accessibilityDelegate) {
            super(accessibilityDelegate);
        }

        /* renamed from: g */
        public void mo3893g(View view, C1638a2 a2Var) {
            super.mo3893g(view, a2Var);
            a2Var.mo12558a1((CharSequence) null);
        }
    }

    /* renamed from: b */
    public static void m29355b(@mr2 C3516si siVar, @mr2 View view) {
        jt4.m18849B1(view, (Build.VERSION.SDK_INT < 29 || !jt4.m18868G0(view)) ? new C3714c(siVar) : new C3713b(view.getAccessibilityDelegate(), siVar));
    }

    /* renamed from: c */
    public static void m29356c(@mr2 C3516si siVar, @mr2 View view) {
        m29357d(siVar, view, (FrameLayout) null);
    }

    /* renamed from: d */
    public static void m29357d(@mr2 C3516si siVar, @mr2 View view, @ts2 FrameLayout frameLayout) {
        m29366m(siVar, view, frameLayout);
        if (siVar.mo24432p() != null) {
            siVar.mo24432p().setForeground(siVar);
        } else if (!f21382a) {
            view.getOverlay().add(siVar);
        } else {
            throw new IllegalArgumentException("Trying to reference null customBadgeParent");
        }
    }

    /* renamed from: e */
    public static void m29358e(@mr2 C3516si siVar, @mr2 Toolbar toolbar, @mo1 int i) {
        m29359f(siVar, toolbar, i, (FrameLayout) null);
    }

    /* renamed from: f */
    public static void m29359f(@mr2 C3516si siVar, @mr2 Toolbar toolbar, @mo1 int i, @ts2 FrameLayout frameLayout) {
        toolbar.post(new C3712a(toolbar, i, siVar, frameLayout));
    }

    @mr2
    /* renamed from: g */
    public static SparseArray<C3516si> m29360g(Context context, @mr2 qy2 qy2) {
        SparseArray<C3516si> sparseArray = new SparseArray<>(qy2.size());
        int i = 0;
        while (i < qy2.size()) {
            int keyAt = qy2.keyAt(i);
            C3632ti.C3633a aVar = (C3632ti.C3633a) qy2.valueAt(i);
            if (aVar != null) {
                sparseArray.put(keyAt, C3516si.m27590f(context, aVar));
                i++;
            } else {
                throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
            }
        }
        return sparseArray;
    }

    @mr2
    /* renamed from: h */
    public static qy2 m29361h(@mr2 SparseArray<C3516si> sparseArray) {
        qy2 qy2 = new qy2();
        int i = 0;
        while (i < sparseArray.size()) {
            int keyAt = sparseArray.keyAt(i);
            C3516si valueAt = sparseArray.valueAt(i);
            if (valueAt != null) {
                qy2.put(keyAt, valueAt.mo24440v());
                i++;
            } else {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
        }
        return qy2;
    }

    /* renamed from: i */
    public static void m29362i(@mr2 View view) {
        jt4.m18849B1(view, (Build.VERSION.SDK_INT < 29 || !jt4.m18868G0(view)) ? null : new C3715d(view.getAccessibilityDelegate()));
    }

    /* renamed from: j */
    public static void m29363j(@ts2 C3516si siVar, @mr2 View view) {
        if (siVar != null) {
            if (f21382a || siVar.mo24432p() != null) {
                siVar.mo24432p().setForeground((Drawable) null);
            } else {
                view.getOverlay().remove(siVar);
            }
        }
    }

    /* renamed from: k */
    public static void m29364k(@ts2 C3516si siVar, @mr2 Toolbar toolbar, @mo1 int i) {
        if (siVar != null) {
            ActionMenuItemView a = nf4.m58061a(toolbar, i);
            if (a != null) {
                m29365l(siVar);
                m29363j(siVar, a);
                m29362i(a);
                return;
            }
            Log.w(f21381a, "Trying to remove badge from a null menuItemView: " + i);
        }
    }

    @hw4
    /* renamed from: l */
    public static void m29365l(C3516si siVar) {
        siVar.mo24389K(0);
        siVar.mo24390L(0);
    }

    /* renamed from: m */
    public static void m29366m(@mr2 C3516si siVar, @mr2 View view, @ts2 FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        siVar.setBounds(rect);
        siVar.mo24422i0(view, frameLayout);
    }

    @hw4
    /* renamed from: n */
    public static void m29367n(C3516si siVar, Resources resources) {
        siVar.mo24389K(resources.getDimensionPixelOffset(fd3.C2156f.mtrl_badge_toolbar_action_menu_item_horizontal_offset));
        siVar.mo24390L(resources.getDimensionPixelOffset(fd3.C2156f.mtrl_badge_toolbar_action_menu_item_vertical_offset));
    }

    /* renamed from: o */
    public static void m29368o(@mr2 Rect rect, float f, float f2, float f3, float f4) {
        rect.set((int) (f - f3), (int) (f2 - f4), (int) (f + f3), (int) (f2 + f4));
    }
}
