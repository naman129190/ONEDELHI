package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.onedelhi.secure.C1638a2;
import com.onedelhi.secure.C2223g8;
import com.onedelhi.secure.C3884x1;
import com.onedelhi.secure.as0;
import com.onedelhi.secure.bf2;
import com.onedelhi.secure.e64;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.ju2;
import com.onedelhi.secure.lx4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.oe2;
import com.onedelhi.secure.s12;
import com.onedelhi.secure.sx4;
import com.onedelhi.secure.ts2;

/* renamed from: com.google.android.material.bottomsheet.a */
public class C1513a extends C2223g8 {

    /* renamed from: a */
    public FrameLayout f7950a;

    /* renamed from: a */
    public CoordinatorLayout f7951a;
    @mr2

    /* renamed from: a */
    public BottomSheetBehavior.C1503f f7952a;

    /* renamed from: a */
    public BottomSheetBehavior<FrameLayout> f7953a;

    /* renamed from: a */
    public C1519f f7954a;

    /* renamed from: b */
    public FrameLayout f7955b;

    /* renamed from: b */
    public boolean f7956b;

    /* renamed from: c */
    public boolean f7957c;

    /* renamed from: d */
    public boolean f7958d;

    /* renamed from: e */
    public boolean f7959e;

    /* renamed from: f */
    public boolean f7960f;

    /* renamed from: com.google.android.material.bottomsheet.a$a */
    public class C1514a implements ju2 {
        public C1514a() {
        }

        /* renamed from: a */
        public sx4 mo1063a(View view, sx4 sx4) {
            if (C1513a.this.f7954a != null) {
                C1513a.this.f7953a.mo11220E0(C1513a.this.f7954a);
            }
            if (sx4 != null) {
                C1513a aVar = C1513a.this;
                C1519f unused = aVar.f7954a = new C1519f(aVar.f7955b, sx4, (C1514a) null);
                C1513a.this.f7954a.mo11323e(C1513a.this.getWindow());
                C1513a.this.f7953a.mo11241Y(C1513a.this.f7954a);
            }
            return sx4;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$b */
    public class C1515b implements View.OnClickListener {
        public C1515b() {
        }

        public void onClick(View view) {
            C1513a aVar = C1513a.this;
            if (aVar.f7957c && aVar.isShowing() && C1513a.this.mo11318u()) {
                C1513a.this.cancel();
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$c */
    public class C1516c extends C3884x1 {
        public C1516c() {
        }

        /* renamed from: g */
        public void mo3893g(View view, @mr2 C1638a2 a2Var) {
            boolean z;
            super.mo3893g(view, a2Var);
            if (C1513a.this.f7957c) {
                a2Var.mo12556a(1048576);
                z = true;
            } else {
                z = false;
            }
            a2Var.mo12567d1(z);
        }

        /* renamed from: j */
        public boolean mo3894j(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                C1513a aVar = C1513a.this;
                if (aVar.f7957c) {
                    aVar.cancel();
                    return true;
                }
            }
            return super.mo3894j(view, i, bundle);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$d */
    public class C1517d implements View.OnTouchListener {
        public C1517d() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$e */
    public class C1518e extends BottomSheetBehavior.C1503f {
        public C1518e() {
        }

        /* renamed from: b */
        public void mo7562b(@mr2 View view, float f) {
        }

        /* renamed from: c */
        public void mo7563c(@mr2 View view, int i) {
            if (i == 5) {
                C1513a.this.cancel();
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$f */
    public static class C1519f extends BottomSheetBehavior.C1503f {
        @ts2

        /* renamed from: a */
        public Window f7966a;
        @mr2

        /* renamed from: a */
        public final sx4 f7967a;
        @ts2

        /* renamed from: a */
        public final Boolean f7968a;

        /* renamed from: a */
        public boolean f7969a;

        public C1519f(@mr2 View view, @mr2 sx4 sx4) {
            Boolean bool;
            int color;
            this.f7967a = sx4;
            bf2 o0 = BottomSheetBehavior.m9579i0(view).mo11270o0();
            ColorStateList y = o0 != null ? o0.mo31646y() : jt4.m18892N(view);
            if (y != null) {
                color = y.getDefaultColor();
            } else if (view.getBackground() instanceof ColorDrawable) {
                color = ((ColorDrawable) view.getBackground()).getColor();
            } else {
                bool = null;
                this.f7968a = bool;
            }
            bool = Boolean.valueOf(oe2.m23726l(color));
            this.f7968a = bool;
        }

        public /* synthetic */ C1519f(View view, sx4 sx4, C1514a aVar) {
            this(view, sx4);
        }

        /* renamed from: a */
        public void mo11286a(@mr2 View view) {
            mo11322d(view);
        }

        /* renamed from: b */
        public void mo7562b(@mr2 View view, float f) {
            mo11322d(view);
        }

        /* renamed from: c */
        public void mo7563c(@mr2 View view, int i) {
            mo11322d(view);
        }

        /* renamed from: d */
        public final void mo11322d(View view) {
            int paddingLeft;
            int i;
            if (view.getTop() < this.f7967a.mo24605r()) {
                Window window = this.f7966a;
                if (window != null) {
                    Boolean bool = this.f7968a;
                    as0.m39035g(window, bool == null ? this.f7969a : bool.booleanValue());
                }
                paddingLeft = view.getPaddingLeft();
                i = this.f7967a.mo24605r() - view.getTop();
            } else if (view.getTop() != 0) {
                Window window2 = this.f7966a;
                if (window2 != null) {
                    as0.m39035g(window2, this.f7969a);
                }
                paddingLeft = view.getPaddingLeft();
                i = 0;
            } else {
                return;
            }
            view.setPadding(paddingLeft, i, view.getPaddingRight(), view.getPaddingBottom());
        }

        /* renamed from: e */
        public void mo11323e(@ts2 Window window) {
            if (this.f7966a != window) {
                this.f7966a = window;
                if (window != null) {
                    this.f7969a = lx4.m21044a(window, window.getDecorView()).mo25784f();
                }
            }
        }
    }

    public C1513a(@mr2 Context context) {
        this(context, 0);
        this.f7960f = getContext().getTheme().obtainStyledAttributes(new int[]{fd3.C2153c.enableEdgeToEdge}).getBoolean(0, false);
    }

    public C1513a(@mr2 Context context, @e64 int i) {
        super(context, m9691g(context, i));
        this.f7957c = true;
        this.f7958d = true;
        this.f7952a = new C1518e();
        mo16391i(1);
        this.f7960f = getContext().getTheme().obtainStyledAttributes(new int[]{fd3.C2153c.enableEdgeToEdge}).getBoolean(0, false);
    }

    public C1513a(@mr2 Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
        this.f7957c = true;
        this.f7958d = true;
        this.f7952a = new C1518e();
        mo16391i(1);
        this.f7957c = z;
        this.f7960f = getContext().getTheme().obtainStyledAttributes(new int[]{fd3.C2153c.enableEdgeToEdge}).getBoolean(0, false);
    }

    /* renamed from: g */
    public static int m9691g(@mr2 Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(fd3.C2153c.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : fd3.C2164n.Theme_Design_Light_BottomSheetDialog;
    }

    @Deprecated
    /* renamed from: t */
    public static void m9696t(@mr2 View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            int systemUiVisibility = view.getSystemUiVisibility();
            view.setSystemUiVisibility(z ? systemUiVisibility | 8192 : systemUiVisibility & -8193);
        }
    }

    public void cancel() {
        BottomSheetBehavior<FrameLayout> o = mo11305o();
        if (!this.f7956b || o.mo11277v0() == 5) {
            super.cancel();
        } else {
            o.mo11242Y0(5);
        }
    }

    /* renamed from: n */
    public final FrameLayout mo11304n() {
        if (this.f7950a == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), fd3.C2161k.design_bottom_sheet_dialog, (ViewGroup) null);
            this.f7950a = frameLayout;
            this.f7951a = (CoordinatorLayout) frameLayout.findViewById(fd3.C2158h.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f7950a.findViewById(fd3.C2158h.design_bottom_sheet);
            this.f7955b = frameLayout2;
            BottomSheetBehavior<FrameLayout> i0 = BottomSheetBehavior.m9579i0(frameLayout2);
            this.f7953a = i0;
            i0.mo11241Y(this.f7952a);
            this.f7953a.mo11232Q0(this.f7957c);
        }
        return this.f7950a;
    }

    @mr2
    /* renamed from: o */
    public BottomSheetBehavior<FrameLayout> mo11305o() {
        if (this.f7953a == null) {
            mo11304n();
        }
        return this.f7953a;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = this.f7960f && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f7950a;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.f7951a;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            lx4.m21046c(window, !z);
            C1519f fVar = this.f7954a;
            if (fVar != null) {
                fVar.mo11323e(window);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            int i = Build.VERSION.SDK_INT;
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            if (i < 23) {
                window.addFlags(67108864);
            }
            window.setLayout(-1, -1);
        }
    }

    public void onDetachedFromWindow() {
        C1519f fVar = this.f7954a;
        if (fVar != null) {
            fVar.mo11323e((Window) null);
        }
    }

    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f7953a;
        if (bottomSheetBehavior != null && bottomSheetBehavior.mo11277v0() == 5) {
            this.f7953a.mo11242Y0(4);
        }
    }

    /* renamed from: p */
    public boolean mo11309p() {
        return this.f7956b;
    }

    /* renamed from: q */
    public boolean mo11310q() {
        return this.f7960f;
    }

    /* renamed from: r */
    public void mo11311r() {
        this.f7953a.mo11220E0(this.f7952a);
    }

    /* renamed from: s */
    public void mo11312s(boolean z) {
        this.f7956b = z;
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f7957c != z) {
            this.f7957c = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f7953a;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.mo11232Q0(z);
            }
        }
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f7957c) {
            this.f7957c = true;
        }
        this.f7958d = z;
        this.f7959e = true;
    }

    public void setContentView(@s12 int i) {
        super.setContentView(mo11319v(i, (View) null, (ViewGroup.LayoutParams) null));
    }

    public void setContentView(View view) {
        super.setContentView(mo11319v(0, view, (ViewGroup.LayoutParams) null));
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(mo11319v(0, view, layoutParams));
    }

    /* renamed from: u */
    public boolean mo11318u() {
        if (!this.f7959e) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843611});
            this.f7958d = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.f7959e = true;
        }
        return this.f7958d;
    }

    /* renamed from: v */
    public final View mo11319v(int i, @ts2 View view, @ts2 ViewGroup.LayoutParams layoutParams) {
        mo11304n();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f7950a.findViewById(fd3.C2158h.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, coordinatorLayout, false);
        }
        if (this.f7960f) {
            jt4.m18934a2(this.f7955b, new C1514a());
        }
        this.f7955b.removeAllViews();
        FrameLayout frameLayout = this.f7955b;
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(fd3.C2158h.touch_outside).setOnClickListener(new C1515b());
        jt4.m18849B1(this.f7955b, new C1516c());
        this.f7955b.setOnTouchListener(new C1517d());
        return this.f7950a;
    }
}
