package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.onedelhi.secure.C2402i7;
import com.onedelhi.secure.C2607k7;
import com.onedelhi.secure.C3153pj;
import com.onedelhi.secure.bk0;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hw4;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.nl2;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.yz1;
import java.util.List;

public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.C0455b {

    /* renamed from: D */
    public static final int f8369D = fd3.C2164n.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;

    /* renamed from: E */
    public static final int f8370E = 0;

    /* renamed from: F */
    public static final int f8371F = 1;

    /* renamed from: G */
    public static final int f8372G = 2;

    /* renamed from: a */
    public static final Property<View, Float> f8373a;

    /* renamed from: b */
    public static final Property<View, Float> f8374b;

    /* renamed from: c */
    public static final Property<View, Float> f8375c;

    /* renamed from: d */
    public static final Property<View, Float> f8376d;

    /* renamed from: A */
    public final int f8377A;

    /* renamed from: B */
    public int f8378B;

    /* renamed from: C */
    public int f8379C;
    @mr2

    /* renamed from: a */
    public final CoordinatorLayout.Behavior<ExtendedFloatingActionButton> f8380a;
    @mr2

    /* renamed from: a */
    public final C1636b f8381a;

    /* renamed from: a */
    public final C2607k7 f8382a;
    @mr2

    /* renamed from: b */
    public ColorStateList f8383b;
    @mr2

    /* renamed from: b */
    public final C1636b f8384b;

    /* renamed from: c */
    public final C1636b f8385c;

    /* renamed from: d */
    public final C1636b f8386d;

    /* renamed from: d */
    public boolean f8387d;

    /* renamed from: e */
    public boolean f8388e;

    /* renamed from: f */
    public boolean f8389f;

    /* renamed from: z */
    public int f8390z;

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* renamed from: c */
        public static final boolean f8391c = false;

        /* renamed from: d */
        public static final boolean f8392d = true;

        /* renamed from: a */
        public Rect f8393a;
        @ts2

        /* renamed from: a */
        public C1614j f8394a;

        /* renamed from: a */
        public boolean f8395a;
        @ts2

        /* renamed from: b */
        public C1614j f8396b;

        /* renamed from: b */
        public boolean f8397b;

        public ExtendedFloatingActionButtonBehavior() {
            this.f8395a = false;
            this.f8397b = true;
        }

        public ExtendedFloatingActionButtonBehavior(@mr2 Context context, @ts2 AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fd3.C2165o.ExtendedFloatingActionButton_Behavior_Layout);
            this.f8395a = obtainStyledAttributes.getBoolean(fd3.C2165o.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.f8397b = obtainStyledAttributes.getBoolean(fd3.C2165o.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: K */
        public static boolean m10315K(@mr2 View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0459f) {
                return ((CoordinatorLayout.C0459f) layoutParams).mo3676f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: G */
        public void mo12208G(@mr2 ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z = this.f8397b;
            extendedFloatingActionButton.mo12176O(z ? extendedFloatingActionButton.f8384b : extendedFloatingActionButton.f8385c, z ? this.f8396b : this.f8394a);
        }

        /* renamed from: H */
        public boolean mo3643b(@mr2 CoordinatorLayout coordinatorLayout, @mr2 ExtendedFloatingActionButton extendedFloatingActionButton, @mr2 Rect rect) {
            return super.mo3643b(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        /* renamed from: I */
        public boolean mo12210I() {
            return this.f8395a;
        }

        /* renamed from: J */
        public boolean mo12211J() {
            return this.f8397b;
        }

        /* renamed from: L */
        public boolean mo3649i(CoordinatorLayout coordinatorLayout, @mr2 ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                mo12220T(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            } else if (!m10315K(view)) {
                return false;
            } else {
                mo12221U(view, extendedFloatingActionButton);
                return false;
            }
        }

        /* renamed from: M */
        public boolean mo3653m(@mr2 CoordinatorLayout coordinatorLayout, @mr2 ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            List<View> w = coordinatorLayout.mo3633w(extendedFloatingActionButton);
            int size = w.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = w.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m10315K(view) && mo12221U(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (mo12220T(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo3583N(extendedFloatingActionButton, i);
            return true;
        }

        /* renamed from: N */
        public void mo12214N(boolean z) {
            this.f8395a = z;
        }

        /* renamed from: O */
        public void mo12215O(boolean z) {
            this.f8397b = z;
        }

        @hw4
        /* renamed from: P */
        public void mo12216P(@ts2 C1614j jVar) {
            this.f8394a = jVar;
        }

        @hw4
        /* renamed from: Q */
        public void mo12217Q(@ts2 C1614j jVar) {
            this.f8396b = jVar;
        }

        /* renamed from: R */
        public final boolean mo12218R(@mr2 View view, @mr2 ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f8395a || this.f8397b) && ((CoordinatorLayout.C0459f) extendedFloatingActionButton.getLayoutParams()).mo3675e() == view.getId();
        }

        /* renamed from: S */
        public void mo12219S(@mr2 ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z = this.f8397b;
            extendedFloatingActionButton.mo12176O(z ? extendedFloatingActionButton.f8381a : extendedFloatingActionButton.f8386d, z ? this.f8396b : this.f8394a);
        }

        /* renamed from: T */
        public final boolean mo12220T(CoordinatorLayout coordinatorLayout, @mr2 AppBarLayout appBarLayout, @mr2 ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!mo12218R(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f8393a == null) {
                this.f8393a = new Rect();
            }
            Rect rect = this.f8393a;
            bk0.m40127a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                mo12219S(extendedFloatingActionButton);
                return true;
            }
            mo12208G(extendedFloatingActionButton);
            return true;
        }

        /* renamed from: U */
        public final boolean mo12221U(@mr2 View view, @mr2 ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!mo12218R(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((CoordinatorLayout.C0459f) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                mo12219S(extendedFloatingActionButton);
                return true;
            }
            mo12208G(extendedFloatingActionButton);
            return true;
        }

        /* renamed from: h */
        public void mo3648h(@mr2 CoordinatorLayout.C0459f fVar) {
            if (fVar.f3231f == 0) {
                fVar.f3231f = 80;
            }
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a */
    public class C1605a implements C1616l {
        public C1605a() {
        }

        /* renamed from: a */
        public int mo12222a() {
            return ExtendedFloatingActionButton.this.f8379C;
        }

        /* renamed from: b */
        public int mo12223b() {
            return ExtendedFloatingActionButton.this.f8378B;
        }

        /* renamed from: c */
        public ViewGroup.LayoutParams mo12224c() {
            return new ViewGroup.LayoutParams(-2, -2);
        }

        public int getHeight() {
            return ExtendedFloatingActionButton.this.getMeasuredHeight();
        }

        public int getWidth() {
            return (ExtendedFloatingActionButton.this.getMeasuredWidth() - (ExtendedFloatingActionButton.this.getCollapsedPadding() * 2)) + ExtendedFloatingActionButton.this.f8378B + ExtendedFloatingActionButton.this.f8379C;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b */
    public class C1606b implements C1616l {
        public C1606b() {
        }

        /* renamed from: a */
        public int mo12222a() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        /* renamed from: b */
        public int mo12223b() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        /* renamed from: c */
        public ViewGroup.LayoutParams mo12224c() {
            return new ViewGroup.LayoutParams(getWidth(), getHeight());
        }

        public int getHeight() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        public int getWidth() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$c */
    public class C1607c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C1614j f8400a;

        /* renamed from: a */
        public final /* synthetic */ C1636b f8402a;

        /* renamed from: a */
        public boolean f8403a;

        public C1607c(C1636b bVar, C1614j jVar) {
            this.f8402a = bVar;
            this.f8400a = jVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f8403a = true;
            this.f8402a.mo12253b();
        }

        public void onAnimationEnd(Animator animator) {
            this.f8402a.mo12250i();
            if (!this.f8403a) {
                this.f8402a.mo12249g(this.f8400a);
            }
        }

        public void onAnimationStart(Animator animator) {
            this.f8402a.onAnimationStart(animator);
            this.f8403a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$d */
    public class C1608d extends Property<View, Float> {
        public C1608d(Class cls, String str) {
            super(cls, str);
        }

        @mr2
        /* renamed from: a */
        public Float get(@mr2 View view) {
            return Float.valueOf((float) view.getLayoutParams().width);
        }

        /* renamed from: b */
        public void set(@mr2 View view, @mr2 Float f) {
            view.getLayoutParams().width = f.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$e */
    public class C1609e extends Property<View, Float> {
        public C1609e(Class cls, String str) {
            super(cls, str);
        }

        @mr2
        /* renamed from: a */
        public Float get(@mr2 View view) {
            return Float.valueOf((float) view.getLayoutParams().height);
        }

        /* renamed from: b */
        public void set(@mr2 View view, @mr2 Float f) {
            view.getLayoutParams().height = f.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$f */
    public class C1610f extends Property<View, Float> {
        public C1610f(Class cls, String str) {
            super(cls, str);
        }

        @mr2
        /* renamed from: a */
        public Float get(@mr2 View view) {
            return Float.valueOf((float) jt4.m18972k0(view));
        }

        /* renamed from: b */
        public void set(@mr2 View view, @mr2 Float f) {
            jt4.m18946d2(view, f.intValue(), view.getPaddingTop(), jt4.m18968j0(view), view.getPaddingBottom());
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$g */
    public class C1611g extends Property<View, Float> {
        public C1611g(Class cls, String str) {
            super(cls, str);
        }

        @mr2
        /* renamed from: a */
        public Float get(@mr2 View view) {
            return Float.valueOf((float) jt4.m18968j0(view));
        }

        /* renamed from: b */
        public void set(@mr2 View view, @mr2 Float f) {
            jt4.m18946d2(view, jt4.m18972k0(view), view.getPaddingTop(), f.intValue(), view.getPaddingBottom());
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h */
    public class C1612h extends C3153pj {

        /* renamed from: a */
        public final C1616l f8404a;

        /* renamed from: a */
        public final boolean f8405a;

        public C1612h(C2607k7 k7Var, C1616l lVar, boolean z) {
            super(ExtendedFloatingActionButton.this, k7Var);
            this.f8404a = lVar;
            this.f8405a = z;
        }

        /* renamed from: a */
        public int mo12246a() {
            return this.f8405a ? fd3.C2152b.mtrl_extended_fab_change_size_expand_motion_spec : fd3.C2152b.mtrl_extended_fab_change_size_collapse_motion_spec;
        }

        /* renamed from: d */
        public boolean mo12247d() {
            return this.f8405a == ExtendedFloatingActionButton.this.f8387d || ExtendedFloatingActionButton.this.getIcon() == null || TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText());
        }

        /* renamed from: f */
        public void mo12248f() {
            boolean unused = ExtendedFloatingActionButton.this.f8387d = this.f8405a;
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = this.f8404a.mo12224c().width;
                layoutParams.height = this.f8404a.mo12224c().height;
                jt4.m18946d2(ExtendedFloatingActionButton.this, this.f8404a.mo12223b(), ExtendedFloatingActionButton.this.getPaddingTop(), this.f8404a.mo12222a(), ExtendedFloatingActionButton.this.getPaddingBottom());
                ExtendedFloatingActionButton.this.requestLayout();
            }
        }

        /* renamed from: g */
        public void mo12249g(@ts2 C1614j jVar) {
            if (jVar != null) {
                if (this.f8405a) {
                    jVar.mo12254a(ExtendedFloatingActionButton.this);
                } else {
                    jVar.mo12257d(ExtendedFloatingActionButton.this);
                }
            }
        }

        /* renamed from: i */
        public void mo12250i() {
            super.mo12250i();
            boolean unused = ExtendedFloatingActionButton.this.f8388e = false;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = this.f8404a.mo12224c().width;
                layoutParams.height = this.f8404a.mo12224c().height;
            }
        }

        @mr2
        /* renamed from: k */
        public AnimatorSet mo12251k() {
            nl2 j = mo12435j();
            if (j.mo21376j(yz1.f38148j)) {
                PropertyValuesHolder[] g = j.mo21372g(yz1.f38148j);
                g[0].setFloatValues(new float[]{(float) ExtendedFloatingActionButton.this.getWidth(), (float) this.f8404a.getWidth()});
                j.mo21378l(yz1.f38148j, g);
            }
            if (j.mo21376j("height")) {
                PropertyValuesHolder[] g2 = j.mo21372g("height");
                g2[0].setFloatValues(new float[]{(float) ExtendedFloatingActionButton.this.getHeight(), (float) this.f8404a.getHeight()});
                j.mo21378l("height", g2);
            }
            if (j.mo21376j("paddingStart")) {
                PropertyValuesHolder[] g3 = j.mo21372g("paddingStart");
                g3[0].setFloatValues(new float[]{(float) jt4.m18972k0(ExtendedFloatingActionButton.this), (float) this.f8404a.mo12223b()});
                j.mo21378l("paddingStart", g3);
            }
            if (j.mo21376j("paddingEnd")) {
                PropertyValuesHolder[] g4 = j.mo21372g("paddingEnd");
                g4[0].setFloatValues(new float[]{(float) jt4.m18968j0(ExtendedFloatingActionButton.this), (float) this.f8404a.mo12222a()});
                j.mo21378l("paddingEnd", g4);
            }
            if (j.mo21376j("labelOpacity")) {
                PropertyValuesHolder[] g5 = j.mo21372g("labelOpacity");
                boolean z = this.f8405a;
                float f = 0.0f;
                float f2 = z ? 0.0f : 1.0f;
                if (z) {
                    f = 1.0f;
                }
                g5[0].setFloatValues(new float[]{f2, f});
                j.mo21378l("labelOpacity", g5);
            }
            return super.mo22455o(j);
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            boolean unused = ExtendedFloatingActionButton.this.f8387d = this.f8405a;
            boolean unused2 = ExtendedFloatingActionButton.this.f8388e = true;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(true);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$i */
    public class C1613i extends C3153pj {

        /* renamed from: a */
        public boolean f8407a;

        public C1613i(C2607k7 k7Var) {
            super(ExtendedFloatingActionButton.this, k7Var);
        }

        /* renamed from: a */
        public int mo12246a() {
            return fd3.C2152b.mtrl_extended_fab_hide_motion_spec;
        }

        /* renamed from: b */
        public void mo12253b() {
            super.mo12253b();
            this.f8407a = true;
        }

        /* renamed from: d */
        public boolean mo12247d() {
            return ExtendedFloatingActionButton.this.mo12174M();
        }

        /* renamed from: f */
        public void mo12248f() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        /* renamed from: g */
        public void mo12249g(@ts2 C1614j jVar) {
            if (jVar != null) {
                jVar.mo12255b(ExtendedFloatingActionButton.this);
            }
        }

        /* renamed from: i */
        public void mo12250i() {
            super.mo12250i();
            int unused = ExtendedFloatingActionButton.this.f8390z = 0;
            if (!this.f8407a) {
                ExtendedFloatingActionButton.this.setVisibility(8);
            }
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f8407a = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            int unused = ExtendedFloatingActionButton.this.f8390z = 1;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$j */
    public static abstract class C1614j {
        /* renamed from: a */
        public void mo12254a(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        /* renamed from: b */
        public void mo12255b(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        /* renamed from: c */
        public void mo12256c(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        /* renamed from: d */
        public void mo12257d(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$k */
    public class C1615k extends C3153pj {
        public C1615k(C2607k7 k7Var) {
            super(ExtendedFloatingActionButton.this, k7Var);
        }

        /* renamed from: a */
        public int mo12246a() {
            return fd3.C2152b.mtrl_extended_fab_show_motion_spec;
        }

        /* renamed from: d */
        public boolean mo12247d() {
            return ExtendedFloatingActionButton.this.mo12175N();
        }

        /* renamed from: f */
        public void mo12248f() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        /* renamed from: g */
        public void mo12249g(@ts2 C1614j jVar) {
            if (jVar != null) {
                jVar.mo12256c(ExtendedFloatingActionButton.this);
            }
        }

        /* renamed from: i */
        public void mo12250i() {
            super.mo12250i();
            int unused = ExtendedFloatingActionButton.this.f8390z = 0;
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.setVisibility(0);
            int unused = ExtendedFloatingActionButton.this.f8390z = 2;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$l */
    public interface C1616l {
        /* renamed from: a */
        int mo12222a();

        /* renamed from: b */
        int mo12223b();

        /* renamed from: c */
        ViewGroup.LayoutParams mo12224c();

        int getHeight();

        int getWidth();
    }

    static {
        Class<Float> cls = Float.class;
        f8373a = new C1608d(cls, yz1.f38148j);
        f8374b = new C1609e(cls, "height");
        f8375c = new C1610f(cls, "paddingStart");
        f8376d = new C1611g(cls, "paddingEnd");
    }

    public ExtendedFloatingActionButton(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public ExtendedFloatingActionButton(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, fd3.C2153c.extendedFloatingActionButtonStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ExtendedFloatingActionButton(@com.onedelhi.secure.mr2 android.content.Context r17, @com.onedelhi.secure.ts2 android.util.AttributeSet r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = r19
            int r9 = f8369D
            r1 = r17
            android.content.Context r1 = com.onedelhi.secure.hf2.m50488c(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = 0
            r0.f8390z = r10
            com.onedelhi.secure.k7 r1 = new com.onedelhi.secure.k7
            r1.<init>()
            r0.f8382a = r1
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$k r11 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$k
            r11.<init>(r1)
            r0.f8385c = r11
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$i r12 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$i
            r12.<init>(r1)
            r0.f8386d = r12
            r13 = 1
            r0.f8387d = r13
            r0.f8388e = r10
            r0.f8389f = r10
            android.content.Context r14 = r16.getContext()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior r1 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior
            r1.<init>(r14, r7)
            r0.f8380a = r1
            int[] r3 = com.onedelhi.secure.fd3.C2165o.ExtendedFloatingActionButton
            int[] r6 = new int[r10]
            r1 = r14
            r2 = r18
            r4 = r19
            r5 = r9
            android.content.res.TypedArray r1 = com.onedelhi.secure.ob4.m59195k(r1, r2, r3, r4, r5, r6)
            int r2 = com.onedelhi.secure.fd3.C2165o.ExtendedFloatingActionButton_showMotionSpec
            com.onedelhi.secure.nl2 r2 = com.onedelhi.secure.nl2.m22934c(r14, r1, r2)
            int r3 = com.onedelhi.secure.fd3.C2165o.ExtendedFloatingActionButton_hideMotionSpec
            com.onedelhi.secure.nl2 r3 = com.onedelhi.secure.nl2.m22934c(r14, r1, r3)
            int r4 = com.onedelhi.secure.fd3.C2165o.ExtendedFloatingActionButton_extendMotionSpec
            com.onedelhi.secure.nl2 r4 = com.onedelhi.secure.nl2.m22934c(r14, r1, r4)
            int r5 = com.onedelhi.secure.fd3.C2165o.ExtendedFloatingActionButton_shrinkMotionSpec
            com.onedelhi.secure.nl2 r5 = com.onedelhi.secure.nl2.m22934c(r14, r1, r5)
            int r6 = com.onedelhi.secure.fd3.C2165o.ExtendedFloatingActionButton_collapsedSize
            r15 = -1
            int r6 = r1.getDimensionPixelSize(r6, r15)
            r0.f8377A = r6
            int r6 = com.onedelhi.secure.jt4.m18972k0(r16)
            r0.f8378B = r6
            int r6 = com.onedelhi.secure.jt4.m18968j0(r16)
            r0.f8379C = r6
            com.onedelhi.secure.k7 r6 = new com.onedelhi.secure.k7
            r6.<init>()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h r15 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a r10 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a
            r10.<init>()
            r15.<init>(r6, r10, r13)
            r0.f8384b = r15
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h r10 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b r13 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b
            r13.<init>()
            r7 = 0
            r10.<init>(r6, r13, r7)
            r0.f8381a = r10
            r11.mo12433e(r2)
            r12.mo12433e(r3)
            r15.mo12433e(r4)
            r10.mo12433e(r5)
            r1.recycle()
            com.onedelhi.secure.z80 r1 = com.onedelhi.secure.uw3.f36304e
            r2 = r18
            com.onedelhi.secure.uw3$b r1 = com.onedelhi.secure.uw3.m67449g(r14, r2, r8, r9, r1)
            com.onedelhi.secure.uw3 r1 = r1.mo45845m()
            r0.setShapeAppearanceModel(r1)
            r16.mo12181T()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* renamed from: D */
    public void mo12165D(@mr2 Animator.AnimatorListener animatorListener) {
        this.f8384b.mo12437m(animatorListener);
    }

    /* renamed from: E */
    public void mo12166E(@mr2 Animator.AnimatorListener animatorListener) {
        this.f8386d.mo12437m(animatorListener);
    }

    /* renamed from: F */
    public void mo12167F(@mr2 Animator.AnimatorListener animatorListener) {
        this.f8385c.mo12437m(animatorListener);
    }

    /* renamed from: G */
    public void mo12168G(@mr2 Animator.AnimatorListener animatorListener) {
        this.f8381a.mo12437m(animatorListener);
    }

    /* renamed from: H */
    public void mo12169H() {
        mo12176O(this.f8384b, (C1614j) null);
    }

    /* renamed from: I */
    public void mo12170I(@mr2 C1614j jVar) {
        mo12176O(this.f8384b, jVar);
    }

    /* renamed from: J */
    public void mo12171J() {
        mo12176O(this.f8386d, (C1614j) null);
    }

    /* renamed from: K */
    public void mo12172K(@mr2 C1614j jVar) {
        mo12176O(this.f8386d, jVar);
    }

    /* renamed from: L */
    public final boolean mo12173L() {
        return this.f8387d;
    }

    /* renamed from: M */
    public final boolean mo12174M() {
        return getVisibility() == 0 ? this.f8390z == 1 : this.f8390z != 2;
    }

    /* renamed from: N */
    public final boolean mo12175N() {
        return getVisibility() != 0 ? this.f8390z == 2 : this.f8390z != 1;
    }

    /* renamed from: O */
    public final void mo12176O(@mr2 C1636b bVar, @ts2 C1614j jVar) {
        if (!bVar.mo12247d()) {
            if (!mo12182U()) {
                bVar.mo12248f();
                bVar.mo12249g(jVar);
                return;
            }
            measure(0, 0);
            AnimatorSet k = bVar.mo12251k();
            k.addListener(new C1607c(bVar, jVar));
            for (Animator.AnimatorListener addListener : bVar.mo12434h()) {
                k.addListener(addListener);
            }
            k.start();
        }
    }

    /* renamed from: P */
    public void mo12177P(@mr2 Animator.AnimatorListener animatorListener) {
        this.f8384b.mo12432c(animatorListener);
    }

    /* renamed from: Q */
    public void mo12178Q(@mr2 Animator.AnimatorListener animatorListener) {
        this.f8386d.mo12432c(animatorListener);
    }

    /* renamed from: R */
    public void mo12179R(@mr2 Animator.AnimatorListener animatorListener) {
        this.f8385c.mo12432c(animatorListener);
    }

    /* renamed from: S */
    public void mo12180S(@mr2 Animator.AnimatorListener animatorListener) {
        this.f8381a.mo12432c(animatorListener);
    }

    /* renamed from: T */
    public final void mo12181T() {
        this.f8383b = getTextColors();
    }

    /* renamed from: U */
    public final boolean mo12182U() {
        return (jt4.m18914U0(this) || (!mo12175N() && this.f8389f)) && !isInEditMode();
    }

    /* renamed from: V */
    public void mo12183V() {
        mo12176O(this.f8385c, (C1614j) null);
    }

    /* renamed from: W */
    public void mo12184W(@mr2 C1614j jVar) {
        mo12176O(this.f8385c, jVar);
    }

    /* renamed from: X */
    public void mo12185X() {
        mo12176O(this.f8381a, (C1614j) null);
    }

    /* renamed from: Y */
    public void mo12186Y(@mr2 C1614j jVar) {
        mo12176O(this.f8381a, jVar);
    }

    /* renamed from: Z */
    public void mo12187Z(@mr2 ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    @mr2
    public CoordinatorLayout.Behavior<ExtendedFloatingActionButton> getBehavior() {
        return this.f8380a;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    @hw4
    public int getCollapsedSize() {
        int i = this.f8377A;
        return i < 0 ? (Math.min(jt4.m18972k0(this), jt4.m18968j0(this)) * 2) + getIconSize() : i;
    }

    @ts2
    public nl2 getExtendMotionSpec() {
        return this.f8384b.mo12436l();
    }

    @ts2
    public nl2 getHideMotionSpec() {
        return this.f8386d.mo12436l();
    }

    @ts2
    public nl2 getShowMotionSpec() {
        return this.f8385c.mo12436l();
    }

    @ts2
    public nl2 getShrinkMotionSpec() {
        return this.f8381a.mo12436l();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f8387d && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f8387d = false;
            this.f8381a.mo12248f();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.f8389f = z;
    }

    public void setExtendMotionSpec(@ts2 nl2 nl2) {
        this.f8384b.mo12433e(nl2);
    }

    public void setExtendMotionSpecResource(@C2402i7 int i) {
        setExtendMotionSpec(nl2.m22935d(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (this.f8387d != z) {
            C1636b bVar = z ? this.f8384b : this.f8381a;
            if (!bVar.mo12247d()) {
                bVar.mo12248f();
            }
        }
    }

    public void setHideMotionSpec(@ts2 nl2 nl2) {
        this.f8386d.mo12433e(nl2);
    }

    public void setHideMotionSpecResource(@C2402i7 int i) {
        setHideMotionSpec(nl2.m22935d(getContext(), i));
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (this.f8387d && !this.f8388e) {
            this.f8378B = jt4.m18972k0(this);
            this.f8379C = jt4.m18968j0(this);
        }
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (this.f8387d && !this.f8388e) {
            this.f8378B = i;
            this.f8379C = i3;
        }
    }

    public void setShowMotionSpec(@ts2 nl2 nl2) {
        this.f8385c.mo12433e(nl2);
    }

    public void setShowMotionSpecResource(@C2402i7 int i) {
        setShowMotionSpec(nl2.m22935d(getContext(), i));
    }

    public void setShrinkMotionSpec(@ts2 nl2 nl2) {
        this.f8381a.mo12433e(nl2);
    }

    public void setShrinkMotionSpecResource(@C2402i7 int i) {
        setShrinkMotionSpec(nl2.m22935d(getContext(), i));
    }

    public void setTextColor(int i) {
        super.setTextColor(i);
        mo12181T();
    }

    public void setTextColor(@mr2 ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        mo12181T();
    }
}
