package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.onedelhi.secure.C1947d7;
import com.onedelhi.secure.C2015e0;
import com.onedelhi.secure.C3527sn;
import com.onedelhi.secure.bf2;
import com.onedelhi.secure.cf2;
import com.onedelhi.secure.d10;
import com.onedelhi.secure.e83;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.lh2;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.pl2;
import com.onedelhi.secure.pv4;
import com.onedelhi.secure.ri1;
import com.onedelhi.secure.sx4;
import com.onedelhi.secure.tg4;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.wo0;
import com.onedelhi.secure.zk0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BottomAppBar extends Toolbar implements CoordinatorLayout.C0455b {

    /* renamed from: K */
    public static final int f7768K = fd3.C2164n.Widget_MaterialComponents_BottomAppBar;

    /* renamed from: L */
    public static final int f7769L = 300;

    /* renamed from: M */
    public static final int f7770M = fd3.C2153c.motionDurationLong2;

    /* renamed from: N */
    public static final int f7771N = fd3.C2153c.motionEasingEmphasizedInterpolator;

    /* renamed from: O */
    public static final int f7772O = 0;

    /* renamed from: P */
    public static final int f7773P = 1;

    /* renamed from: Q */
    public static final int f7774Q = 0;

    /* renamed from: R */
    public static final int f7775R = 1;

    /* renamed from: S */
    public static final int f7776S = 0;

    /* renamed from: T */
    public static final int f7777T = 1;

    /* renamed from: U */
    public static final int f7778U = 0;

    /* renamed from: V */
    public static final int f7779V = 1;

    /* renamed from: W */
    public static final int f7780W = -1;

    /* renamed from: X */
    public static final int f7781X = 0;

    /* renamed from: a */
    public static final float f7782a = 0.2f;

    /* renamed from: A */
    public int f7783A;

    /* renamed from: B */
    public int f7784B;

    /* renamed from: C */
    public final int f7785C;
    @e83

    /* renamed from: D */
    public int f7786D;

    /* renamed from: E */
    public int f7787E;

    /* renamed from: F */
    public int f7788F;
    @lh2

    /* renamed from: G */
    public int f7789G;

    /* renamed from: H */
    public int f7790H;

    /* renamed from: I */
    public int f7791I;

    /* renamed from: J */
    public int f7792J;
    @ts2

    /* renamed from: a */
    public Animator f7793a;
    @mr2

    /* renamed from: a */
    public AnimatorListenerAdapter f7794a;

    /* renamed from: a */
    public Behavior f7795a;

    /* renamed from: a */
    public final bf2 f7796a;
    @mr2

    /* renamed from: a */
    public tg4<FloatingActionButton> f7797a;
    @ts2

    /* renamed from: a */
    public Integer f7798a;
    @ts2

    /* renamed from: b */
    public Animator f7799b;

    /* renamed from: d */
    public ArrayList<C1488j> f7800d;

    /* renamed from: e */
    public final boolean f7801e;

    /* renamed from: f */
    public boolean f7802f;

    /* renamed from: g */
    public final boolean f7803g;

    /* renamed from: h */
    public final boolean f7804h;

    /* renamed from: i */
    public final boolean f7805i;

    /* renamed from: j */
    public boolean f7806j;

    /* renamed from: k */
    public boolean f7807k;

    /* renamed from: z */
    public int f7808z;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        @mr2

        /* renamed from: a */
        public final Rect f7809a = new Rect();

        /* renamed from: a */
        public final View.OnLayoutChangeListener f7810a = new C1477a();

        /* renamed from: a */
        public WeakReference<BottomAppBar> f7811a;

        /* renamed from: h */
        public int f7812h;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$a */
        public class C1477a implements View.OnLayoutChangeListener {
            public C1477a() {
            }

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f7811a.get();
                if (bottomAppBar == null || (!(view instanceof FloatingActionButton) && !(view instanceof ExtendedFloatingActionButton))) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                int height = view.getHeight();
                if (view instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    floatingActionButton.mo12286l(Behavior.this.f7809a);
                    int height2 = Behavior.this.f7809a.height();
                    bottomAppBar.mo11143e1(height2);
                    bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().mo45820r().mo32234a(new RectF(Behavior.this.f7809a)));
                    height = height2;
                }
                CoordinatorLayout.C0459f fVar = (CoordinatorLayout.C0459f) view.getLayoutParams();
                if (Behavior.this.f7812h == 0) {
                    int measuredHeight = (view.getMeasuredHeight() - height) / 2;
                    if (bottomAppBar.f7784B == 1) {
                        fVar.bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(fd3.C2156f.mtrl_bottomappbar_fab_bottom_margin) - measuredHeight);
                    } else if (bottomAppBar.f7784B == 0) {
                        fVar.bottomMargin = ((bottomAppBar.getMeasuredHeight() + bottomAppBar.getBottomInset()) - view.getMeasuredHeight()) / 2;
                    }
                    fVar.leftMargin = bottomAppBar.getLeftInset();
                    fVar.rightMargin = bottomAppBar.getRightInset();
                    if (pv4.m61672l(view)) {
                        fVar.leftMargin += bottomAppBar.f7785C;
                    } else {
                        fVar.rightMargin += bottomAppBar.f7785C;
                    }
                }
            }
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: W */
        public boolean mo3653m(@mr2 CoordinatorLayout coordinatorLayout, @mr2 BottomAppBar bottomAppBar, int i) {
            this.f7811a = new WeakReference<>(bottomAppBar);
            View r0 = bottomAppBar.mo11125M0();
            if (r0 != null && !jt4.m18914U0(r0)) {
                BottomAppBar.m9483h1(bottomAppBar, r0);
                this.f7812h = ((CoordinatorLayout.C0459f) r0.getLayoutParams()).bottomMargin;
                if (r0 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) r0;
                    if (bottomAppBar.f7784B == 0 && bottomAppBar.f7801e) {
                        jt4.m18894N1(floatingActionButton, 0.0f);
                        floatingActionButton.setCompatElevation(0.0f);
                    }
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(fd3.C2152b.mtrl_fab_show_motion_spec);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(fd3.C2152b.mtrl_fab_hide_motion_spec);
                    }
                    bottomAppBar.mo11115C0(floatingActionButton);
                }
                r0.addOnLayoutChangeListener(this.f7810a);
                bottomAppBar.mo11142d1();
            }
            coordinatorLayout.mo3583N(bottomAppBar, i);
            return super.mo3653m(coordinatorLayout, bottomAppBar, i);
        }

        /* renamed from: X */
        public boolean mo3638B(@mr2 CoordinatorLayout coordinatorLayout, @mr2 BottomAppBar bottomAppBar, @mr2 View view, @mr2 View view2, int i, int i2) {
            return bottomAppBar.getHideOnScroll() && super.mo3638B(coordinatorLayout, bottomAppBar, view, view2, i, i2);
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a */
    public class C1478a extends AnimatorListenerAdapter {
        public C1478a() {
        }

        public void onAnimationStart(Animator animator) {
            if (!BottomAppBar.this.f7806j) {
                BottomAppBar bottomAppBar = BottomAppBar.this;
                bottomAppBar.mo11131S0(bottomAppBar.f7808z, BottomAppBar.this.f7807k);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b */
    public class C1479b implements tg4<FloatingActionButton> {
        public C1479b() {
        }

        /* renamed from: c */
        public void mo11176b(@mr2 FloatingActionButton floatingActionButton) {
            BottomAppBar.this.f7796a.mo31629p0((floatingActionButton.getVisibility() == 0 && BottomAppBar.this.f7784B == 1) ? floatingActionButton.getScaleY() : 0.0f);
        }

        /* renamed from: d */
        public void mo11175a(@mr2 FloatingActionButton floatingActionButton) {
            if (BottomAppBar.this.f7784B == 1) {
                float translationX = floatingActionButton.getTranslationX();
                if (BottomAppBar.this.getTopEdgeTreatment().mo24491i() != translationX) {
                    BottomAppBar.this.getTopEdgeTreatment().mo24497o(translationX);
                    BottomAppBar.this.f7796a.invalidateSelf();
                }
                float f = 0.0f;
                float max = Math.max(0.0f, -floatingActionButton.getTranslationY());
                if (BottomAppBar.this.getTopEdgeTreatment().mo24486d() != max) {
                    BottomAppBar.this.getTopEdgeTreatment().mo24492j(max);
                    BottomAppBar.this.f7796a.invalidateSelf();
                }
                bf2 w0 = BottomAppBar.this.f7796a;
                if (floatingActionButton.getVisibility() == 0) {
                    f = floatingActionButton.getScaleY();
                }
                w0.mo31629p0(f);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$c */
    public class C1480c implements pv4.C6478e {
        public C1480c() {
        }

        @mr2
        /* renamed from: a */
        public sx4 mo11179a(View view, @mr2 sx4 sx4, @mr2 pv4.C6479f fVar) {
            boolean z;
            if (BottomAppBar.this.f7803g) {
                int unused = BottomAppBar.this.f7790H = sx4.mo24602o();
            }
            boolean z2 = true;
            boolean z3 = false;
            if (BottomAppBar.this.f7804h) {
                z = BottomAppBar.this.f7792J != sx4.mo24603p();
                int unused2 = BottomAppBar.this.f7792J = sx4.mo24603p();
            } else {
                z = false;
            }
            if (BottomAppBar.this.f7805i) {
                if (BottomAppBar.this.f7791I == sx4.mo24604q()) {
                    z2 = false;
                }
                int unused3 = BottomAppBar.this.f7791I = sx4.mo24604q();
                z3 = z2;
            }
            if (z || z3) {
                BottomAppBar.this.mo11117E0();
                BottomAppBar.this.mo11142d1();
                BottomAppBar.this.mo11141c1();
            }
            return sx4;
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$d */
    public class C1481d extends AnimatorListenerAdapter {
        public C1481d() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.mo11122J0();
            Animator unused = BottomAppBar.this.f7793a = null;
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.mo11123K0();
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$e */
    public class C1482e extends FloatingActionButton.C1618b {

        /* renamed from: a */
        public final /* synthetic */ int f7818a;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$e$a */
        public class C1483a extends FloatingActionButton.C1618b {
            public C1483a() {
            }

            /* renamed from: b */
            public void mo11183b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.mo11122J0();
            }
        }

        public C1482e(int i) {
            this.f7818a = i;
        }

        /* renamed from: a */
        public void mo11182a(@mr2 FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.mo11127O0(this.f7818a));
            floatingActionButton.mo12258A(new C1483a());
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$f */
    public class C1484f extends AnimatorListenerAdapter {
        public C1484f() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.mo11122J0();
            boolean unused = BottomAppBar.this.f7806j = false;
            Animator unused2 = BottomAppBar.this.f7799b = null;
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.mo11123K0();
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$g */
    public class C1485g extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ int f7822a;

        /* renamed from: a */
        public final /* synthetic */ ActionMenuView f7823a;

        /* renamed from: a */
        public boolean f7825a;

        /* renamed from: b */
        public final /* synthetic */ boolean f7826b;

        public C1485g(ActionMenuView actionMenuView, int i, boolean z) {
            this.f7823a = actionMenuView;
            this.f7822a = i;
            this.f7826b = z;
        }

        public void onAnimationCancel(Animator animator) {
            this.f7825a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f7825a) {
                boolean z = BottomAppBar.this.f7789G != 0;
                BottomAppBar bottomAppBar = BottomAppBar.this;
                bottomAppBar.mo11140b1(bottomAppBar.f7789G);
                BottomAppBar.this.mo11145g1(this.f7823a, this.f7822a, this.f7826b, z);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$h */
    public class C1486h implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ActionMenuView f7827a;

        /* renamed from: b */
        public final /* synthetic */ boolean f7829b;

        /* renamed from: n */
        public final /* synthetic */ int f7830n;

        public C1486h(ActionMenuView actionMenuView, int i, boolean z) {
            this.f7827a = actionMenuView;
            this.f7830n = i;
            this.f7829b = z;
        }

        public void run() {
            ActionMenuView actionMenuView = this.f7827a;
            actionMenuView.setTranslationX((float) BottomAppBar.this.mo11126N0(actionMenuView, this.f7830n, this.f7829b));
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$i */
    public class C1487i extends AnimatorListenerAdapter {
        public C1487i() {
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f7794a.onAnimationStart(animator);
            FloatingActionButton k0 = BottomAppBar.this.mo11124L0();
            if (k0 != null) {
                k0.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$j */
    public interface C1488j {
        /* renamed from: a */
        void mo11190a(BottomAppBar bottomAppBar);

        /* renamed from: b */
        void mo11191b(BottomAppBar bottomAppBar);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$k */
    public @interface C1489k {
    }

    @hl3({hl3.C2354a.f13187b})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$l */
    public @interface C1490l {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$m */
    public @interface C1491m {
    }

    @hl3({hl3.C2354a.f13187b})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$n */
    public @interface C1492n {
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$o */
    public static class C1493o extends C2015e0 {
        public static final Parcelable.Creator<C1493o> CREATOR = new C1494a();

        /* renamed from: b */
        public boolean f7832b;

        /* renamed from: n */
        public int f7833n;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$o$a */
        public class C1494a implements Parcelable.ClassLoaderCreator<C1493o> {
            @ts2
            /* renamed from: a */
            public C1493o createFromParcel(@mr2 Parcel parcel) {
                return new C1493o(parcel, (ClassLoader) null);
            }

            @mr2
            /* renamed from: b */
            public C1493o createFromParcel(@mr2 Parcel parcel, ClassLoader classLoader) {
                return new C1493o(parcel, classLoader);
            }

            @mr2
            /* renamed from: c */
            public C1493o[] newArray(int i) {
                return new C1493o[i];
            }
        }

        public C1493o(@mr2 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f7833n = parcel.readInt();
            this.f7832b = parcel.readInt() != 0;
        }

        public C1493o(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(@mr2 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f7833n);
            parcel.writeInt(this.f7832b ? 1 : 0);
        }
    }

    public BottomAppBar(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public BottomAppBar(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, fd3.C2153c.bottomAppBarStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BottomAppBar(@com.onedelhi.secure.mr2 android.content.Context r13, @com.onedelhi.secure.ts2 android.util.AttributeSet r14, int r15) {
        /*
            r12 = this;
            int r6 = f7768K
            android.content.Context r13 = com.onedelhi.secure.hf2.m50488c(r13, r14, r15, r6)
            r12.<init>(r13, r14, r15)
            com.onedelhi.secure.bf2 r13 = new com.onedelhi.secure.bf2
            r13.<init>()
            r12.f7796a = r13
            r7 = 0
            r12.f7788F = r7
            r12.f7789G = r7
            r12.f7806j = r7
            r8 = 1
            r12.f7807k = r8
            com.google.android.material.bottomappbar.BottomAppBar$a r0 = new com.google.android.material.bottomappbar.BottomAppBar$a
            r0.<init>()
            r12.f7794a = r0
            com.google.android.material.bottomappbar.BottomAppBar$b r0 = new com.google.android.material.bottomappbar.BottomAppBar$b
            r0.<init>()
            r12.f7797a = r0
            android.content.Context r9 = r12.getContext()
            int[] r2 = com.onedelhi.secure.fd3.C2165o.BottomAppBar
            int[] r5 = new int[r7]
            r0 = r9
            r1 = r14
            r3 = r15
            r4 = r6
            android.content.res.TypedArray r0 = com.onedelhi.secure.ob4.m59195k(r0, r1, r2, r3, r4, r5)
            int r1 = com.onedelhi.secure.fd3.C2165o.BottomAppBar_backgroundTint
            android.content.res.ColorStateList r1 = com.onedelhi.secure.af2.m38610a(r9, r0, r1)
            int r2 = com.onedelhi.secure.fd3.C2165o.BottomAppBar_navigationIconTint
            boolean r3 = r0.hasValue(r2)
            r4 = -1
            if (r3 == 0) goto L_0x004e
            int r2 = r0.getColor(r2, r4)
            r12.setNavigationIconTint(r2)
        L_0x004e:
            int r2 = com.onedelhi.secure.fd3.C2165o.BottomAppBar_elevation
            int r2 = r0.getDimensionPixelSize(r2, r7)
            int r3 = com.onedelhi.secure.fd3.C2165o.BottomAppBar_fabCradleMargin
            int r3 = r0.getDimensionPixelOffset(r3, r7)
            float r3 = (float) r3
            int r5 = com.onedelhi.secure.fd3.C2165o.BottomAppBar_fabCradleRoundedCornerRadius
            int r5 = r0.getDimensionPixelOffset(r5, r7)
            float r5 = (float) r5
            int r10 = com.onedelhi.secure.fd3.C2165o.BottomAppBar_fabCradleVerticalOffset
            int r10 = r0.getDimensionPixelOffset(r10, r7)
            float r10 = (float) r10
            int r11 = com.onedelhi.secure.fd3.C2165o.BottomAppBar_fabAlignmentMode
            int r11 = r0.getInt(r11, r7)
            r12.f7808z = r11
            int r11 = com.onedelhi.secure.fd3.C2165o.BottomAppBar_fabAnimationMode
            int r11 = r0.getInt(r11, r7)
            r12.f7783A = r11
            int r11 = com.onedelhi.secure.fd3.C2165o.BottomAppBar_fabAnchorMode
            int r11 = r0.getInt(r11, r8)
            r12.f7784B = r11
            int r11 = com.onedelhi.secure.fd3.C2165o.BottomAppBar_removeEmbeddedFabElevation
            boolean r8 = r0.getBoolean(r11, r8)
            r12.f7801e = r8
            int r8 = com.onedelhi.secure.fd3.C2165o.BottomAppBar_menuAlignmentMode
            int r8 = r0.getInt(r8, r7)
            r12.f7787E = r8
            int r8 = com.onedelhi.secure.fd3.C2165o.BottomAppBar_hideOnScroll
            boolean r8 = r0.getBoolean(r8, r7)
            r12.f7802f = r8
            int r8 = com.onedelhi.secure.fd3.C2165o.BottomAppBar_paddingBottomSystemWindowInsets
            boolean r8 = r0.getBoolean(r8, r7)
            r12.f7803g = r8
            int r8 = com.onedelhi.secure.fd3.C2165o.BottomAppBar_paddingLeftSystemWindowInsets
            boolean r8 = r0.getBoolean(r8, r7)
            r12.f7804h = r8
            int r8 = com.onedelhi.secure.fd3.C2165o.BottomAppBar_paddingRightSystemWindowInsets
            boolean r7 = r0.getBoolean(r8, r7)
            r12.f7805i = r7
            int r7 = com.onedelhi.secure.fd3.C2165o.BottomAppBar_fabAlignmentModeEndMargin
            int r4 = r0.getDimensionPixelOffset(r7, r4)
            r12.f7786D = r4
            r0.recycle()
            android.content.res.Resources r0 = r12.getResources()
            int r4 = com.onedelhi.secure.fd3.C2156f.mtrl_bottomappbar_fabOffsetEndMode
            int r0 = r0.getDimensionPixelOffset(r4)
            r12.f7785C = r0
            com.onedelhi.secure.sn r0 = new com.onedelhi.secure.sn
            r0.<init>(r3, r5, r10)
            com.onedelhi.secure.uw3$b r3 = com.onedelhi.secure.uw3.m67443a()
            com.onedelhi.secure.uw3$b r0 = r3.mo45834G(r0)
            com.onedelhi.secure.uw3 r0 = r0.mo45845m()
            r13.setShapeAppearanceModel(r0)
            r0 = 2
            r13.mo31645x0(r0)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r13.mo31633r0(r0)
            r13.mo31599Z(r9)
            float r0 = (float) r2
            r12.setElevation(r0)
            com.onedelhi.secure.wo0.m30986o(r13, r1)
            com.onedelhi.secure.jt4.m18877I1(r12, r13)
            com.google.android.material.bottomappbar.BottomAppBar$c r13 = new com.google.android.material.bottomappbar.BottomAppBar$c
            r13.<init>()
            com.onedelhi.secure.pv4.m61663c(r12, r14, r15, r6, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @ts2
    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public int getBottomInset() {
        return this.f7790H;
    }

    private int getFabAlignmentAnimationDuration() {
        return pl2.m61421f(getContext(), f7770M, 300);
    }

    /* access modifiers changed from: private */
    public float getFabTranslationX() {
        return mo11127O0(this.f7808z);
    }

    private float getFabTranslationY() {
        if (this.f7784B == 1) {
            return -getTopEdgeTreatment().mo24486d();
        }
        return 0.0f;
    }

    /* access modifiers changed from: private */
    public int getLeftInset() {
        return this.f7792J;
    }

    /* access modifiers changed from: private */
    public int getRightInset() {
        return this.f7791I;
    }

    /* access modifiers changed from: private */
    @mr2
    public C3527sn getTopEdgeTreatment() {
        return (C3527sn) this.f7796a.getShapeAppearanceModel().mo45818p();
    }

    /* renamed from: h1 */
    public static void m9483h1(BottomAppBar bottomAppBar, View view) {
        CoordinatorLayout.C0459f fVar = (CoordinatorLayout.C0459f) view.getLayoutParams();
        fVar.f3222b = 17;
        int i = bottomAppBar.f7784B;
        if (i == 1) {
            fVar.f3222b = 17 | 48;
        }
        if (i == 0) {
            fVar.f3222b |= 80;
        }
    }

    /* renamed from: B0 */
    public void mo11114B0(@mr2 C1488j jVar) {
        if (this.f7800d == null) {
            this.f7800d = new ArrayList<>();
        }
        this.f7800d.add(jVar);
    }

    /* renamed from: C0 */
    public final void mo11115C0(@mr2 FloatingActionButton floatingActionButton) {
        floatingActionButton.mo12264f(this.f7794a);
        floatingActionButton.mo12265g(new C1487i());
        floatingActionButton.mo12281h(this.f7797a);
    }

    /* renamed from: D0 */
    public void mo11116D0(@mr2 HideBottomViewOnScrollBehavior.C1471b bVar) {
        getBehavior().mo11085H(bVar);
    }

    /* renamed from: E0 */
    public final void mo11117E0() {
        Animator animator = this.f7799b;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f7793a;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    /* renamed from: F0 */
    public void mo11118F0() {
        getBehavior().mo11087J();
    }

    /* renamed from: G0 */
    public void mo11119G0(int i, List<Animator> list) {
        FloatingActionButton L0 = mo11124L0();
        if (L0 != null && !L0.mo12297q()) {
            mo11123K0();
            L0.mo12289o(new C1482e(i));
        }
    }

    /* renamed from: H0 */
    public final void mo11120H0(int i, @mr2 List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(mo11124L0(), "translationX", new float[]{mo11127O0(i)});
        ofFloat.setDuration((long) getFabAlignmentAnimationDuration());
        list.add(ofFloat);
    }

    /* renamed from: I0 */
    public final void mo11121I0(int i, boolean z, @mr2 List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            float fabAlignmentAnimationDuration = (float) getFabAlignmentAnimationDuration();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{1.0f});
            ofFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
            if (Math.abs(actionMenuView.getTranslationX() - ((float) mo11126N0(actionMenuView, i, z))) > 1.0f) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{0.0f});
                ofFloat2.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
                ofFloat2.addListener(new C1485g(actionMenuView, i, z));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(new Animator[]{ofFloat2, ofFloat});
                list.add(animatorSet);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        }
    }

    /* renamed from: J0 */
    public final void mo11122J0() {
        ArrayList<C1488j> arrayList;
        int i = this.f7788F - 1;
        this.f7788F = i;
        if (i == 0 && (arrayList = this.f7800d) != null) {
            Iterator<C1488j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo11191b(this);
            }
        }
    }

    /* renamed from: K0 */
    public final void mo11123K0() {
        ArrayList<C1488j> arrayList;
        int i = this.f7788F;
        this.f7788F = i + 1;
        if (i == 0 && (arrayList = this.f7800d) != null) {
            Iterator<C1488j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo11190a(this);
            }
        }
    }

    @ts2
    /* renamed from: L0 */
    public final FloatingActionButton mo11124L0() {
        View M0 = mo11125M0();
        if (M0 instanceof FloatingActionButton) {
            return (FloatingActionButton) M0;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x001e  */
    @com.onedelhi.secure.ts2
    /* renamed from: M0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View mo11125M0() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.mo3634x(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L_0x002c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L_0x0018
        L_0x002c:
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.mo11125M0():android.view.View");
    }

    /* renamed from: N0 */
    public int mo11126N0(@mr2 ActionMenuView actionMenuView, int i, boolean z) {
        int i2 = 0;
        if (this.f7787E != 1 && (i != 1 || !z)) {
            return 0;
        }
        boolean l = pv4.m61672l(this);
        int measuredWidth = l ? getMeasuredWidth() : 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if ((childAt.getLayoutParams() instanceof Toolbar.LayoutParams) && (((Toolbar.LayoutParams) childAt.getLayoutParams()).f652a & ri1.f19871d) == 8388611) {
                measuredWidth = l ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = l ? actionMenuView.getRight() : actionMenuView.getLeft();
        int i4 = l ? this.f7791I : -this.f7792J;
        if (getNavigationIcon() == null) {
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(fd3.C2156f.m3_bottomappbar_horizontal_padding);
            i2 = l ? dimensionPixelOffset : -dimensionPixelOffset;
        }
        return measuredWidth - ((right + i4) + i2);
    }

    /* renamed from: O0 */
    public final float mo11127O0(int i) {
        boolean l = pv4.m61672l(this);
        int i2 = 1;
        if (i != 1) {
            return 0.0f;
        }
        View M0 = mo11125M0();
        int measuredWidth = (getMeasuredWidth() / 2) - ((l ? this.f7792J : this.f7791I) + ((this.f7786D == -1 || M0 == null) ? this.f7785C : (M0.getMeasuredWidth() / 2) + this.f7786D));
        if (l) {
            i2 = -1;
        }
        return (float) (measuredWidth * i2);
    }

    /* renamed from: P0 */
    public final boolean mo11128P0() {
        FloatingActionButton L0 = mo11124L0();
        return L0 != null && L0.mo12298r();
    }

    /* renamed from: Q0 */
    public boolean mo11129Q0() {
        return getBehavior().mo11088K();
    }

    /* renamed from: R0 */
    public boolean mo11130R0() {
        return getBehavior().mo11089L();
    }

    /* renamed from: S0 */
    public final void mo11131S0(int i, boolean z) {
        if (!jt4.m18914U0(this)) {
            this.f7806j = false;
            mo11140b1(this.f7789G);
            return;
        }
        Animator animator = this.f7799b;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!mo11128P0()) {
            i = 0;
            z = false;
        }
        mo11121I0(i, z, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.f7799b = animatorSet;
        animatorSet.addListener(new C1484f());
        this.f7799b.start();
    }

    /* renamed from: T0 */
    public final void mo11132T0(int i) {
        if (this.f7808z != i && jt4.m18914U0(this)) {
            Animator animator = this.f7793a;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.f7783A == 1) {
                mo11120H0(i, arrayList);
            } else {
                mo11119G0(i, arrayList);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.setInterpolator(pl2.m61422g(getContext(), f7771N, C1947d7.f10649a));
            this.f7793a = animatorSet;
            animatorSet.addListener(new C1481d());
            this.f7793a.start();
        }
    }

    @ts2
    /* renamed from: U0 */
    public final Drawable mo11133U0(@ts2 Drawable drawable) {
        if (drawable == null || this.f7798a == null) {
            return drawable;
        }
        Drawable r = wo0.m30989r(drawable.mutate());
        wo0.m30985n(r, this.f7798a.intValue());
        return r;
    }

    /* renamed from: V0 */
    public void mo11134V0() {
        mo11135W0(true);
    }

    /* renamed from: W0 */
    public void mo11135W0(boolean z) {
        getBehavior().mo11093P(this, z);
    }

    /* renamed from: X0 */
    public void mo11136X0() {
        mo11137Y0(true);
    }

    /* renamed from: Y0 */
    public void mo11137Y0(boolean z) {
        getBehavior().mo11095R(this, z);
    }

    /* renamed from: Z0 */
    public void mo11138Z0(@mr2 C1488j jVar) {
        ArrayList<C1488j> arrayList = this.f7800d;
        if (arrayList != null) {
            arrayList.remove(jVar);
        }
    }

    /* renamed from: a1 */
    public void mo11139a1(@mr2 HideBottomViewOnScrollBehavior.C1471b bVar) {
        getBehavior().mo11090M(bVar);
    }

    /* renamed from: b1 */
    public void mo11140b1(@lh2 int i) {
        if (i != 0) {
            this.f7789G = 0;
            getMenu().clear();
            mo2449x(i);
        }
    }

    /* renamed from: c1 */
    public final void mo11141c1() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null && this.f7799b == null) {
            actionMenuView.setAlpha(1.0f);
            if (!mo11128P0()) {
                mo11144f1(actionMenuView, 0, false);
            } else {
                mo11144f1(actionMenuView, this.f7808z, this.f7807k);
            }
        }
    }

    /* renamed from: d1 */
    public final void mo11142d1() {
        getTopEdgeTreatment().mo24497o(getFabTranslationX());
        this.f7796a.mo31629p0((!this.f7807k || !mo11128P0() || this.f7784B != 1) ? 0.0f : 1.0f);
        View M0 = mo11125M0();
        if (M0 != null) {
            M0.setTranslationY(getFabTranslationY());
            M0.setTranslationX(getFabTranslationX());
        }
    }

    /* renamed from: e1 */
    public boolean mo11143e1(@e83 int i) {
        float f = (float) i;
        if (f == getTopEdgeTreatment().mo24490h()) {
            return false;
        }
        getTopEdgeTreatment().mo24496n(f);
        this.f7796a.invalidateSelf();
        return true;
    }

    /* renamed from: f1 */
    public final void mo11144f1(@mr2 ActionMenuView actionMenuView, int i, boolean z) {
        mo11145g1(actionMenuView, i, z, false);
    }

    /* renamed from: g1 */
    public final void mo11145g1(@mr2 ActionMenuView actionMenuView, int i, boolean z, boolean z2) {
        C1486h hVar = new C1486h(actionMenuView, i, z);
        if (z2) {
            actionMenuView.post(hVar);
        } else {
            hVar.run();
        }
    }

    @ts2
    public ColorStateList getBackgroundTint() {
        return this.f7796a.mo31591R();
    }

    @mr2
    public Behavior getBehavior() {
        if (this.f7795a == null) {
            this.f7795a = new Behavior();
        }
        return this.f7795a;
    }

    @zk0
    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().mo24486d();
    }

    public int getFabAlignmentMode() {
        return this.f7808z;
    }

    @e83
    public int getFabAlignmentModeEndMargin() {
        return this.f7786D;
    }

    public int getFabAnchorMode() {
        return this.f7784B;
    }

    public int getFabAnimationMode() {
        return this.f7783A;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().mo24488f();
    }

    @zk0
    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().mo24489g();
    }

    public boolean getHideOnScroll() {
        return this.f7802f;
    }

    public int getMenuAlignmentMode() {
        return this.f7787E;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        cf2.m40865f(this, this.f7796a);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            mo11117E0();
            mo11142d1();
        }
        mo11141c1();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1493o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1493o oVar = (C1493o) parcelable;
        super.onRestoreInstanceState(oVar.mo14959a());
        this.f7808z = oVar.f7833n;
        this.f7807k = oVar.f7832b;
    }

    @mr2
    public Parcelable onSaveInstanceState() {
        C1493o oVar = new C1493o(super.onSaveInstanceState());
        oVar.f7833n = this.f7808z;
        oVar.f7832b = this.f7807k;
        return oVar;
    }

    public void setBackgroundTint(@ts2 ColorStateList colorStateList) {
        wo0.m30986o(this.f7796a, colorStateList);
    }

    public void setCradleVerticalOffset(@zk0 float f) {
        if (f != getCradleVerticalOffset()) {
            getTopEdgeTreatment().mo24492j(f);
            this.f7796a.invalidateSelf();
            mo11142d1();
        }
    }

    public void setElevation(float f) {
        this.f7796a.mo31624n0(f);
        getBehavior().mo11091N(this, this.f7796a.mo31579K() - this.f7796a.mo31577J());
    }

    public void setFabAlignmentMode(int i) {
        setFabAlignmentModeAndReplaceMenu(i, 0);
    }

    public void setFabAlignmentModeAndReplaceMenu(int i, @lh2 int i2) {
        this.f7789G = i2;
        this.f7806j = true;
        mo11131S0(i, this.f7807k);
        mo11132T0(i);
        this.f7808z = i;
    }

    public void setFabAlignmentModeEndMargin(@e83 int i) {
        if (this.f7786D != i) {
            this.f7786D = i;
            mo11142d1();
        }
    }

    public void setFabAnchorMode(int i) {
        this.f7784B = i;
        mo11142d1();
        View M0 = mo11125M0();
        if (M0 != null) {
            m9483h1(this, M0);
            M0.requestLayout();
            this.f7796a.invalidateSelf();
        }
    }

    public void setFabAnimationMode(int i) {
        this.f7783A = i;
    }

    public void setFabCornerSize(@zk0 float f) {
        if (f != getTopEdgeTreatment().mo24487e()) {
            getTopEdgeTreatment().mo24493k(f);
            this.f7796a.invalidateSelf();
        }
    }

    public void setFabCradleMargin(@zk0 float f) {
        if (f != getFabCradleMargin()) {
            getTopEdgeTreatment().mo24494l(f);
            this.f7796a.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(@zk0 float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().mo24495m(f);
            this.f7796a.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.f7802f = z;
    }

    public void setMenuAlignmentMode(int i) {
        if (this.f7787E != i) {
            this.f7787E = i;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                mo11144f1(actionMenuView, this.f7808z, mo11128P0());
            }
        }
    }

    public void setNavigationIcon(@ts2 Drawable drawable) {
        super.setNavigationIcon(mo11133U0(drawable));
    }

    public void setNavigationIconTint(@d10 int i) {
        this.f7798a = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }
}
