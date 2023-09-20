package com.google.android.material.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.onedelhi.secure.C2018e2;
import com.onedelhi.secure.C3884x1;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hf2;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;

public class BottomSheetDragHandleView extends AppCompatImageView implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: n */
    public static final int f7938n = fd3.C2164n.Widget_Material3_BottomSheet_DragHandle;
    @ts2

    /* renamed from: a */
    public final AccessibilityManager f7939a;

    /* renamed from: a */
    public final BottomSheetBehavior.C1503f f7940a;
    @ts2

    /* renamed from: a */
    public BottomSheetBehavior<?> f7941a;

    /* renamed from: b */
    public final String f7942b;

    /* renamed from: c */
    public final String f7943c;

    /* renamed from: c */
    public boolean f7944c;

    /* renamed from: d */
    public final String f7945d;

    /* renamed from: d */
    public boolean f7946d;

    /* renamed from: e */
    public boolean f7947e;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDragHandleView$a */
    public class C1511a extends BottomSheetBehavior.C1503f {
        public C1511a() {
        }

        /* renamed from: b */
        public void mo7562b(@mr2 View view, float f) {
        }

        /* renamed from: c */
        public void mo7563c(@mr2 View view, int i) {
            BottomSheetDragHandleView.this.mo11298k(i);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDragHandleView$b */
    public class C1512b extends C3884x1 {
        public C1512b() {
        }

        /* renamed from: h */
        public void mo6531h(View view, @mr2 AccessibilityEvent accessibilityEvent) {
            super.mo6531h(view, accessibilityEvent);
            if (accessibilityEvent.getEventType() == 1) {
                boolean unused = BottomSheetDragHandleView.this.mo11296g();
            }
        }
    }

    public BottomSheetDragHandleView(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public BottomSheetDragHandleView(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, fd3.C2153c.bottomSheetDragHandleStyle);
    }

    public BottomSheetDragHandleView(@mr2 Context context, @ts2 AttributeSet attributeSet, int i) {
        super(hf2.m50488c(context, attributeSet, i, f7938n), attributeSet, i);
        this.f7942b = getResources().getString(fd3.C2163m.bottomsheet_action_expand);
        this.f7943c = getResources().getString(fd3.C2163m.bottomsheet_action_collapse);
        this.f7945d = getResources().getString(fd3.C2163m.bottomsheet_drag_handle_clicked);
        this.f7940a = new C1511a();
        this.f7939a = (AccessibilityManager) getContext().getSystemService("accessibility");
        mo11299l();
        jt4.m18849B1(this, new C1512b());
    }

    @ts2
    /* renamed from: i */
    public static View m9681i(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ boolean m9682j(View view, C2018e2.C2019a aVar) {
        return mo11296g();
    }

    private void setBottomSheetBehavior(@ts2 BottomSheetBehavior<?> bottomSheetBehavior) {
        BottomSheetBehavior<?> bottomSheetBehavior2 = this.f7941a;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.mo11220E0(this.f7940a);
        }
        this.f7941a = bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            mo11298k(bottomSheetBehavior.mo11277v0());
            this.f7941a.mo11241Y(this.f7940a);
        }
        mo11299l();
    }

    /* renamed from: f */
    public final void mo11295f(String str) {
        if (this.f7939a != null) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
            obtain.getText().add(str);
            this.f7939a.sendAccessibilityEvent(obtain);
        }
    }

    /* renamed from: g */
    public final boolean mo11296g() {
        boolean z = false;
        if (!this.f7946d) {
            return false;
        }
        mo11295f(this.f7945d);
        if (!this.f7941a.mo11281z0() && !this.f7941a.mo11256f1()) {
            z = true;
        }
        int v0 = this.f7941a.mo11277v0();
        int i = 6;
        int i2 = 3;
        if (v0 == 4) {
            if (!z) {
                i = 3;
            }
        } else if (v0 != 3) {
            if (!this.f7947e) {
                i2 = 4;
            }
            i = i2;
        } else if (!z) {
            i = 4;
        }
        this.f7941a.mo11242Y0(i);
        return true;
    }

    @ts2
    /* renamed from: h */
    public final BottomSheetBehavior<?> mo11297h() {
        View view = this;
        while (true) {
            view = m9681i(view);
            if (view == null) {
                return null;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0459f) {
                CoordinatorLayout.Behavior f = ((CoordinatorLayout.C0459f) layoutParams).mo3676f();
                if (f instanceof BottomSheetBehavior) {
                    return (BottomSheetBehavior) f;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0015  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0012  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11298k(int r3) {
        /*
            r2 = this;
            r0 = 4
            if (r3 != r0) goto L_0x0007
            r3 = 1
        L_0x0004:
            r2.f7947e = r3
            goto L_0x000c
        L_0x0007:
            r0 = 3
            if (r3 != r0) goto L_0x000c
            r3 = 0
            goto L_0x0004
        L_0x000c:
            com.onedelhi.secure.a2$a r3 = com.onedelhi.secure.C1638a2.C1639a.f8642e
            boolean r0 = r2.f7947e
            if (r0 == 0) goto L_0x0015
            java.lang.String r0 = r2.f7942b
            goto L_0x0017
        L_0x0015:
            java.lang.String r0 = r2.f7943c
        L_0x0017:
            com.onedelhi.secure.tn r1 = new com.onedelhi.secure.tn
            r1.<init>(r2)
            com.onedelhi.secure.jt4.m19013u1(r2, r3, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetDragHandleView.mo11298k(int):void");
    }

    /* renamed from: l */
    public final void mo11299l() {
        int i = 1;
        this.f7946d = this.f7944c && this.f7941a != null;
        if (this.f7941a == null) {
            i = 2;
        }
        jt4.m18906R1(this, i);
        setClickable(this.f7946d);
    }

    public void onAccessibilityStateChanged(boolean z) {
        this.f7944c = z;
        mo11299l();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setBottomSheetBehavior(mo11297h());
        AccessibilityManager accessibilityManager = this.f7939a;
        if (accessibilityManager != null) {
            accessibilityManager.addAccessibilityStateChangeListener(this);
            onAccessibilityStateChanged(this.f7939a.isEnabled());
        }
    }

    public void onDetachedFromWindow() {
        AccessibilityManager accessibilityManager = this.f7939a;
        if (accessibilityManager != null) {
            accessibilityManager.removeAccessibilityStateChangeListener(this);
        }
        setBottomSheetBehavior((BottomSheetBehavior<?>) null);
        super.onDetachedFromWindow();
    }
}
