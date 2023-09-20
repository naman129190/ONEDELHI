package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.C4218a;
import com.onedelhi.secure.C1638a2;
import com.onedelhi.secure.C1947d7;
import com.onedelhi.secure.C3884x1;
import com.onedelhi.secure.af2;
import com.onedelhi.secure.bf2;
import com.onedelhi.secure.d10;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hf2;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.js1;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.ju2;
import com.onedelhi.secure.mo1;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.n70;
import com.onedelhi.secure.ob4;
import com.onedelhi.secure.oe2;
import com.onedelhi.secure.pv4;
import com.onedelhi.secure.s12;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.sx4;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.uw3;
import com.onedelhi.secure.wo0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: a */
    public static final float f24323a = 0.8f;
    @mr2

    /* renamed from: a */
    public static final Handler f24324a = new Handler(Looper.getMainLooper(), new C4201h());

    /* renamed from: a */
    public static final String f24325a = BaseTransientBottomBar.class.getSimpleName();

    /* renamed from: a */
    public static final int[] f24326a = {fd3.C2153c.snackbarStyle};

    /* renamed from: d */
    public static final boolean f24327d = false;

    /* renamed from: g */
    public static final int f24328g = 0;

    /* renamed from: h */
    public static final int f24329h = 1;

    /* renamed from: i */
    public static final int f24330i = -2;

    /* renamed from: j */
    public static final int f24331j = -1;

    /* renamed from: k */
    public static final int f24332k = 0;

    /* renamed from: l */
    public static final int f24333l = 250;

    /* renamed from: m */
    public static final int f24334m = 180;

    /* renamed from: n */
    public static final int f24335n = 150;

    /* renamed from: o */
    public static final int f24336o = 75;

    /* renamed from: p */
    public static final int f24337p = 0;

    /* renamed from: q */
    public static final int f24338q = 1;

    /* renamed from: a */
    public int f24339a;

    /* renamed from: a */
    public final Context f24340a;
    @mr2

    /* renamed from: a */
    public final ViewGroup f24341a;
    @ts2

    /* renamed from: a */
    public final AccessibilityManager f24342a;

    /* renamed from: a */
    public Behavior f24343a;
    @mr2

    /* renamed from: a */
    public final SnackbarBaseLayout f24344a;
    @ts2

    /* renamed from: a */
    public C4210q f24345a;
    @mr2

    /* renamed from: a */
    public C4218a.C4220b f24346a;
    @mr2

    /* renamed from: a */
    public final n70 f24347a;
    @sj3(29)

    /* renamed from: a */
    public final Runnable f24348a;

    /* renamed from: a */
    public List<C4212s<B>> f24349a;

    /* renamed from: a */
    public boolean f24350a;

    /* renamed from: b */
    public int f24351b;

    /* renamed from: b */
    public boolean f24352b;

    /* renamed from: c */
    public int f24353c;

    /* renamed from: c */
    public boolean f24354c;

    /* renamed from: d */
    public int f24355d;

    /* renamed from: e */
    public int f24356e;

    /* renamed from: f */
    public int f24357f;

    public static class Behavior extends SwipeDismissBehavior<View> {
        @mr2

        /* renamed from: a */
        public final C4214t f24358a = new C4214t(this);

        /* renamed from: G */
        public boolean mo11099G(View view) {
            return this.f24358a.mo28892a(view);
        }

        /* renamed from: V */
        public final void mo28847V(@mr2 BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f24358a.mo28894c(baseTransientBottomBar);
        }

        /* renamed from: l */
        public boolean mo3652l(@mr2 CoordinatorLayout coordinatorLayout, @mr2 View view, @mr2 MotionEvent motionEvent) {
            this.f24358a.mo28893b(coordinatorLayout, view, motionEvent);
            return super.mo3652l(coordinatorLayout, view, motionEvent);
        }
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    public static class SnackbarBaseLayout extends FrameLayout {

        /* renamed from: a */
        public static final View.OnTouchListener f24359a = new C4193a();

        /* renamed from: a */
        public final float f24360a;

        /* renamed from: a */
        public ColorStateList f24361a;

        /* renamed from: a */
        public PorterDuff.Mode f24362a;
        @ts2

        /* renamed from: a */
        public Rect f24363a;
        @ts2

        /* renamed from: a */
        public BaseTransientBottomBar<?> f24364a;
        @ts2

        /* renamed from: a */
        public uw3 f24365a;

        /* renamed from: b */
        public final float f24366b;

        /* renamed from: b */
        public boolean f24367b;

        /* renamed from: n */
        public int f24368n;

        /* renamed from: o */
        public final int f24369o;

        /* renamed from: p */
        public final int f24370p;

        /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout$a */
        public class C4193a implements View.OnTouchListener {
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public SnackbarBaseLayout(@mr2 Context context) {
            this(context, (AttributeSet) null);
        }

        public SnackbarBaseLayout(@mr2 Context context, AttributeSet attributeSet) {
            super(hf2.m50488c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, fd3.C2165o.SnackbarLayout);
            int i = fd3.C2165o.SnackbarLayout_elevation;
            if (obtainStyledAttributes.hasValue(i)) {
                jt4.m18894N1(this, (float) obtainStyledAttributes.getDimensionPixelSize(i, 0));
            }
            this.f24368n = obtainStyledAttributes.getInt(fd3.C2165o.SnackbarLayout_animationMode, 0);
            if (obtainStyledAttributes.hasValue(fd3.C2165o.SnackbarLayout_shapeAppearance) || obtainStyledAttributes.hasValue(fd3.C2165o.SnackbarLayout_shapeAppearanceOverlay)) {
                this.f24365a = uw3.m67447e(context2, attributeSet, 0, 0).mo45845m();
            }
            this.f24360a = obtainStyledAttributes.getFloat(fd3.C2165o.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
            setBackgroundTintList(af2.m38610a(context2, obtainStyledAttributes, fd3.C2165o.SnackbarLayout_backgroundTint));
            setBackgroundTintMode(pv4.m61673m(obtainStyledAttributes.getInt(fd3.C2165o.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
            this.f24366b = obtainStyledAttributes.getFloat(fd3.C2165o.SnackbarLayout_actionTextColorAlpha, 1.0f);
            this.f24369o = obtainStyledAttributes.getDimensionPixelSize(fd3.C2165o.SnackbarLayout_android_maxWidth, -1);
            this.f24370p = obtainStyledAttributes.getDimensionPixelSize(fd3.C2165o.SnackbarLayout_maxActionInlineWidth, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f24359a);
            setFocusable(true);
            if (getBackground() == null) {
                jt4.m18877I1(this, mo28849d());
            }
        }

        /* access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f24364a = baseTransientBottomBar;
        }

        /* renamed from: c */
        public void mo28848c(ViewGroup viewGroup) {
            this.f24367b = true;
            viewGroup.addView(this);
            this.f24367b = false;
        }

        @mr2
        /* renamed from: d */
        public final Drawable mo28849d() {
            int p = oe2.m23730p(this, fd3.C2153c.colorSurface, fd3.C2153c.colorOnSurface, getBackgroundOverlayColorAlpha());
            uw3 uw3 = this.f24365a;
            Drawable g = uw3 != null ? BaseTransientBottomBar.m33893w(p, uw3) : BaseTransientBottomBar.m33892v(p, getResources());
            ColorStateList colorStateList = this.f24361a;
            Drawable r = wo0.m30989r(g);
            if (colorStateList != null) {
                wo0.m30986o(r, this.f24361a);
            }
            return r;
        }

        /* renamed from: e */
        public final void mo28850e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f24363a = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        public float getActionTextColorAlpha() {
            return this.f24366b;
        }

        public int getAnimationMode() {
            return this.f24368n;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f24360a;
        }

        public int getMaxInlineActionWidth() {
            return this.f24370p;
        }

        public int getMaxWidth() {
            return this.f24369o;
        }

        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f24364a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.mo28815T();
            }
            jt4.m19017v1(this);
        }

        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f24364a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.mo28816U();
            }
        }

        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f24364a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.mo28817V();
            }
        }

        public void onMeasure(int i, int i2) {
            int i3;
            super.onMeasure(i, i2);
            if (this.f24369o > 0 && getMeasuredWidth() > (i3 = this.f24369o)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
            }
        }

        public void setAnimationMode(int i) {
            this.f24368n = i;
        }

        public void setBackground(@ts2 Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        public void setBackgroundDrawable(@ts2 Drawable drawable) {
            if (!(drawable == null || this.f24361a == null)) {
                drawable = wo0.m30989r(drawable.mutate());
                wo0.m30986o(drawable, this.f24361a);
                wo0.m30987p(drawable, this.f24362a);
            }
            super.setBackgroundDrawable(drawable);
        }

        public void setBackgroundTintList(@ts2 ColorStateList colorStateList) {
            this.f24361a = colorStateList;
            if (getBackground() != null) {
                Drawable r = wo0.m30989r(getBackground().mutate());
                wo0.m30986o(r, colorStateList);
                wo0.m30987p(r, this.f24362a);
                if (r != getBackground()) {
                    super.setBackgroundDrawable(r);
                }
            }
        }

        public void setBackgroundTintMode(@ts2 PorterDuff.Mode mode) {
            this.f24362a = mode;
            if (getBackground() != null) {
                Drawable r = wo0.m30989r(getBackground().mutate());
                wo0.m30987p(r, mode);
                if (r != getBackground()) {
                    super.setBackgroundDrawable(r);
                }
            }
        }

        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (!this.f24367b && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                mo28850e((ViewGroup.MarginLayoutParams) layoutParams);
                BaseTransientBottomBar<?> baseTransientBottomBar = this.f24364a;
                if (baseTransientBottomBar != null) {
                    baseTransientBottomBar.mo28840r0();
                }
            }
        }

        public void setOnClickListener(@ts2 View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f24359a);
            super.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$a */
    public class C4194a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ int f24371a;

        public C4194a(int i) {
            this.f24371a = i;
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.mo28818W(this.f24371a);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$b */
    public class C4195b implements ValueAnimator.AnimatorUpdateListener {
        public C4195b() {
        }

        public void onAnimationUpdate(@mr2 ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f24344a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$c */
    public class C4196c implements ValueAnimator.AnimatorUpdateListener {
        public C4196c() {
        }

        public void onAnimationUpdate(@mr2 ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f24344a.setScaleX(floatValue);
            BaseTransientBottomBar.this.f24344a.setScaleY(floatValue);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$d */
    public class C4197d extends AnimatorListenerAdapter {
        public C4197d() {
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.mo28819X();
        }

        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f24347a.mo28914a(70, 180);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$e */
    public class C4198e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public int f24376a;

        /* renamed from: b */
        public final /* synthetic */ int f24378b;

        public C4198e(int i) {
            this.f24378b = i;
            this.f24376a = i;
        }

        public void onAnimationUpdate(@mr2 ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f24327d) {
                jt4.m18953f1(BaseTransientBottomBar.this.f24344a, intValue - this.f24376a);
            } else {
                BaseTransientBottomBar.this.f24344a.setTranslationY((float) intValue);
            }
            this.f24376a = intValue;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$f */
    public class C4199f extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ int f24379a;

        public C4199f(int i) {
            this.f24379a = i;
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.mo28818W(this.f24379a);
        }

        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f24347a.mo28915b(0, 180);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$g */
    public class C4200g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public int f24381a = 0;

        public C4200g() {
        }

        public void onAnimationUpdate(@mr2 ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f24327d) {
                jt4.m18953f1(BaseTransientBottomBar.this.f24344a, intValue - this.f24381a);
            } else {
                BaseTransientBottomBar.this.f24344a.setTranslationY((float) intValue);
            }
            this.f24381a = intValue;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$h */
    public class C4201h implements Handler.Callback {
        public boolean handleMessage(@mr2 Message message) {
            int i = message.what;
            if (i == 0) {
                ((BaseTransientBottomBar) message.obj).mo28833l0();
                return true;
            } else if (i != 1) {
                return false;
            } else {
                ((BaseTransientBottomBar) message.obj).mo28809N(message.arg1);
                return true;
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$i */
    public class C4202i implements Runnable {
        public C4202i() {
        }

        public void run() {
            int b;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f24344a != null && baseTransientBottomBar.f24340a != null && (b = (BaseTransientBottomBar.this.mo28803H() - BaseTransientBottomBar.this.mo28807L()) + ((int) BaseTransientBottomBar.this.f24344a.getTranslationY())) < BaseTransientBottomBar.this.f24356e) {
                ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f24344a.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    Log.w(BaseTransientBottomBar.f24325a, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                    return;
                }
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f24356e - b;
                BaseTransientBottomBar.this.f24344a.requestLayout();
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$j */
    public class C4203j implements ju2 {
        public C4203j() {
        }

        @mr2
        /* renamed from: a */
        public sx4 mo1063a(View view, @mr2 sx4 sx4) {
            int unused = BaseTransientBottomBar.this.f24351b = sx4.mo24602o();
            int unused2 = BaseTransientBottomBar.this.f24353c = sx4.mo24603p();
            int unused3 = BaseTransientBottomBar.this.f24355d = sx4.mo24604q();
            BaseTransientBottomBar.this.mo28840r0();
            return sx4;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$k */
    public class C4204k extends C3884x1 {
        public C4204k() {
        }

        /* renamed from: g */
        public void mo3893g(View view, @mr2 C1638a2 a2Var) {
            super.mo3893g(view, a2Var);
            a2Var.mo12556a(1048576);
            a2Var.mo12567d1(true);
        }

        /* renamed from: j */
        public boolean mo3894j(View view, int i, Bundle bundle) {
            if (i != 1048576) {
                return super.mo3894j(view, i, bundle);
            }
            BaseTransientBottomBar.this.mo28844x();
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$l */
    public class C4205l implements C4218a.C4220b {
        public C4205l() {
        }

        /* renamed from: a */
        public void mo28879a() {
            Handler handler = BaseTransientBottomBar.f24324a;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        /* renamed from: b */
        public void mo28880b(int i) {
            Handler handler = BaseTransientBottomBar.f24324a;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$m */
    public class C4206m implements Runnable {
        public C4206m() {
        }

        public void run() {
            BaseTransientBottomBar.this.mo28818W(3);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$n */
    public class C4207n implements SwipeDismissBehavior.C1475c {
        public C4207n() {
        }

        /* renamed from: a */
        public void mo11111a(@mr2 View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.mo28845y(0);
        }

        /* renamed from: b */
        public void mo11112b(int i) {
            if (i == 0) {
                C4218a.m34009c().mo28933l(BaseTransientBottomBar.this.f24346a);
            } else if (i == 1 || i == 2) {
                C4218a.m34009c().mo28932k(BaseTransientBottomBar.this.f24346a);
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$o */
    public class C4208o implements Runnable {
        public C4208o() {
        }

        public void run() {
            SnackbarBaseLayout snackbarBaseLayout = BaseTransientBottomBar.this.f24344a;
            if (snackbarBaseLayout != null) {
                if (snackbarBaseLayout.getParent() != null) {
                    BaseTransientBottomBar.this.f24344a.setVisibility(0);
                }
                if (BaseTransientBottomBar.this.f24344a.getAnimationMode() == 1) {
                    BaseTransientBottomBar.this.mo28835n0();
                } else {
                    BaseTransientBottomBar.this.mo28837p0();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$p */
    public class C4209p extends AnimatorListenerAdapter {
        public C4209p() {
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.mo28819X();
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$q */
    public static class C4210q implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
        @mr2

        /* renamed from: a */
        public final WeakReference<BaseTransientBottomBar> f24391a;
        @mr2

        /* renamed from: b */
        public final WeakReference<View> f24392b;

        public C4210q(@mr2 BaseTransientBottomBar baseTransientBottomBar, @mr2 View view) {
            this.f24391a = new WeakReference<>(baseTransientBottomBar);
            this.f24392b = new WeakReference<>(view);
        }

        /* renamed from: a */
        public static C4210q m33961a(@mr2 BaseTransientBottomBar baseTransientBottomBar, @mr2 View view) {
            C4210q qVar = new C4210q(baseTransientBottomBar, view);
            if (jt4.m18896O0(view)) {
                pv4.m61661a(view, qVar);
            }
            view.addOnAttachStateChangeListener(qVar);
            return qVar;
        }

        @ts2
        /* renamed from: b */
        public View mo28884b() {
            return (View) this.f24392b.get();
        }

        /* renamed from: c */
        public void mo28885c() {
            if (this.f24392b.get() != null) {
                ((View) this.f24392b.get()).removeOnAttachStateChangeListener(this);
                pv4.m61674n((View) this.f24392b.get(), this);
            }
            this.f24392b.clear();
            this.f24391a.clear();
        }

        /* renamed from: d */
        public final boolean mo28886d() {
            if (this.f24391a.get() != null) {
                return false;
            }
            mo28885c();
            return true;
        }

        public void onGlobalLayout() {
            if (!mo28886d() && ((BaseTransientBottomBar) this.f24391a.get()).f24352b) {
                ((BaseTransientBottomBar) this.f24391a.get()).mo28820Y();
            }
        }

        public void onViewAttachedToWindow(View view) {
            if (!mo28886d()) {
                pv4.m61661a(view, this);
            }
        }

        public void onViewDetachedFromWindow(View view) {
            if (!mo28886d()) {
                pv4.m61674n(view, this);
            }
        }
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$r */
    public @interface C4211r {
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$s */
    public static abstract class C4212s<B> {

        /* renamed from: a */
        public static final int f24393a = 0;

        /* renamed from: b */
        public static final int f24394b = 1;

        /* renamed from: c */
        public static final int f24395c = 2;

        /* renamed from: d */
        public static final int f24396d = 3;

        /* renamed from: e */
        public static final int f24397e = 4;

        @hl3({hl3.C2354a.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$s$a */
        public @interface C4213a {
        }

        /* renamed from: a */
        public void mo28890a(B b, int i) {
        }

        /* renamed from: b */
        public void mo28891b(B b) {
        }
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$t */
    public static class C4214t {

        /* renamed from: a */
        public C4218a.C4220b f24398a;

        public C4214t(@mr2 SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.mo11107R(0.1f);
            swipeDismissBehavior.mo11104O(0.6f);
            swipeDismissBehavior.mo11108S(0);
        }

        /* renamed from: a */
        public boolean mo28892a(View view) {
            return view instanceof SnackbarBaseLayout;
        }

        /* renamed from: b */
        public void mo28893b(@mr2 CoordinatorLayout coordinatorLayout, @mr2 View view, @mr2 MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    C4218a.m34009c().mo28933l(this.f24398a);
                }
            } else if (coordinatorLayout.mo3576G(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                C4218a.m34009c().mo28932k(this.f24398a);
            }
        }

        /* renamed from: c */
        public void mo28894c(@mr2 BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f24398a = baseTransientBottomBar.f24346a;
        }
    }

    @Deprecated
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$u */
    public interface C4215u extends n70 {
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    @js1(from = -2)
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$v */
    public @interface C4216v {
    }

    public BaseTransientBottomBar(@mr2 Context context, @mr2 ViewGroup viewGroup, @mr2 View view, @mr2 n70 n70) {
        this.f24352b = false;
        this.f24348a = new C4202i();
        this.f24346a = new C4205l();
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        } else if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (n70 != null) {
            this.f24341a = viewGroup;
            this.f24347a = n70;
            this.f24340a = context;
            ob4.m59185a(context);
            SnackbarBaseLayout snackbarBaseLayout = (SnackbarBaseLayout) LayoutInflater.from(context).inflate(mo28804I(), viewGroup, false);
            this.f24344a = snackbarBaseLayout;
            snackbarBaseLayout.setBaseTransientBottomBar(this);
            if (view instanceof SnackbarContentLayout) {
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
                snackbarContentLayout.mo28916c(snackbarBaseLayout.getActionTextColorAlpha());
                snackbarContentLayout.setMaxInlineActionWidth(snackbarBaseLayout.getMaxInlineActionWidth());
            }
            snackbarBaseLayout.addView(view);
            jt4.m18857D1(snackbarBaseLayout, 1);
            jt4.m18906R1(snackbarBaseLayout, 1);
            jt4.m18897O1(snackbarBaseLayout, true);
            jt4.m18934a2(snackbarBaseLayout, new C4203j());
            jt4.m18849B1(snackbarBaseLayout, new C4204k());
            this.f24342a = (AccessibilityManager) context.getSystemService("accessibility");
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    public BaseTransientBottomBar(@mr2 ViewGroup viewGroup, @mr2 View view, @mr2 n70 n70) {
        this(viewGroup.getContext(), viewGroup, view, n70);
    }

    @mr2
    /* renamed from: v */
    public static GradientDrawable m33892v(@d10 int i, @mr2 Resources resources) {
        float dimension = resources.getDimension(fd3.C2156f.mtrl_snackbar_background_corner_radius);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }

    @mr2
    /* renamed from: w */
    public static bf2 m33893w(@d10 int i, @mr2 uw3 uw3) {
        bf2 bf2 = new bf2(uw3);
        bf2.mo31626o0(ColorStateList.valueOf(i));
        return bf2;
    }

    @ts2
    /* renamed from: A */
    public View mo28796A() {
        C4210q qVar = this.f24345a;
        if (qVar == null) {
            return null;
        }
        return qVar.mo28884b();
    }

    /* renamed from: B */
    public int mo28797B() {
        return this.f24344a.getAnimationMode();
    }

    /* renamed from: C */
    public Behavior mo28798C() {
        return this.f24343a;
    }

    @mr2
    /* renamed from: D */
    public Context mo28799D() {
        return this.f24340a;
    }

    /* renamed from: E */
    public int mo28800E() {
        return this.f24339a;
    }

    @mr2
    /* renamed from: F */
    public SwipeDismissBehavior<? extends View> mo28801F() {
        return new Behavior();
    }

    /* renamed from: G */
    public final ValueAnimator mo28802G(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C1947d7.f10652d);
        ofFloat.addUpdateListener(new C4196c());
        return ofFloat;
    }

    @sj3(17)
    /* renamed from: H */
    public final int mo28803H() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.f24340a.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    @s12
    /* renamed from: I */
    public int mo28804I() {
        return mo28808M() ? fd3.C2161k.mtrl_layout_snackbar : fd3.C2161k.design_layout_snackbar;
    }

    /* renamed from: J */
    public final int mo28805J() {
        int height = this.f24344a.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f24344a.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    @mr2
    /* renamed from: K */
    public View mo28806K() {
        return this.f24344a;
    }

    /* renamed from: L */
    public final int mo28807L() {
        int[] iArr = new int[2];
        this.f24344a.getLocationOnScreen(iArr);
        return iArr[1] + this.f24344a.getHeight();
    }

    /* renamed from: M */
    public boolean mo28808M() {
        TypedArray obtainStyledAttributes = this.f24340a.obtainStyledAttributes(f24326a);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    /* renamed from: N */
    public final void mo28809N(int i) {
        if (!mo28830i0() || this.f24344a.getVisibility() != 0) {
            mo28818W(i);
        } else {
            mo28842t(i);
        }
    }

    /* renamed from: O */
    public boolean mo28810O() {
        return this.f24352b;
    }

    /* renamed from: P */
    public boolean mo28811P() {
        return this.f24350a;
    }

    /* renamed from: Q */
    public boolean mo28812Q() {
        return C4218a.m34009c().mo28926e(this.f24346a);
    }

    /* renamed from: R */
    public boolean mo28813R() {
        return C4218a.m34009c().mo28927f(this.f24346a);
    }

    /* renamed from: S */
    public final boolean mo28814S() {
        ViewGroup.LayoutParams layoutParams = this.f24344a.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.C0459f) && (((CoordinatorLayout.C0459f) layoutParams).mo3676f() instanceof SwipeDismissBehavior);
    }

    /* renamed from: T */
    public void mo28815T() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = this.f24344a.getRootWindowInsets()) != null) {
            this.f24356e = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
            mo28840r0();
        }
    }

    /* renamed from: U */
    public void mo28816U() {
        if (mo28813R()) {
            f24324a.post(new C4206m());
        }
    }

    /* renamed from: V */
    public void mo28817V() {
        if (this.f24354c) {
            mo28834m0();
            this.f24354c = false;
        }
    }

    /* renamed from: W */
    public void mo28818W(int i) {
        C4218a.m34009c().mo28930i(this.f24346a);
        List<C4212s<B>> list = this.f24349a;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f24349a.get(size).mo28890a(this, i);
            }
        }
        ViewParent parent = this.f24344a.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f24344a);
        }
    }

    /* renamed from: X */
    public void mo28819X() {
        C4218a.m34009c().mo28931j(this.f24346a);
        List<C4212s<B>> list = this.f24349a;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f24349a.get(size).mo28891b(this);
            }
        }
    }

    /* renamed from: Y */
    public final void mo28820Y() {
        int u = mo28843u();
        if (u != this.f24357f) {
            this.f24357f = u;
            mo28840r0();
        }
    }

    @mr2
    /* renamed from: Z */
    public B mo28821Z(@ts2 C4212s<B> sVar) {
        List<C4212s<B>> list;
        if (sVar == null || (list = this.f24349a) == null) {
            return this;
        }
        list.remove(sVar);
        return this;
    }

    @mr2
    /* renamed from: a0 */
    public B mo28822a0(@mo1 int i) {
        View findViewById = this.f24341a.findViewById(i);
        if (findViewById != null) {
            return mo28823b0(findViewById);
        }
        throw new IllegalArgumentException("Unable to find anchor view with id: " + i);
    }

    @mr2
    /* renamed from: b0 */
    public B mo28823b0(@ts2 View view) {
        C4210q qVar = this.f24345a;
        if (qVar != null) {
            qVar.mo28885c();
        }
        this.f24345a = view == null ? null : C4210q.m33961a(this, view);
        return this;
    }

    /* renamed from: c0 */
    public void mo28824c0(boolean z) {
        this.f24352b = z;
    }

    @mr2
    /* renamed from: d0 */
    public B mo28825d0(int i) {
        this.f24344a.setAnimationMode(i);
        return this;
    }

    @mr2
    /* renamed from: e0 */
    public B mo28826e0(Behavior behavior) {
        this.f24343a = behavior;
        return this;
    }

    @mr2
    /* renamed from: f0 */
    public B mo28827f0(int i) {
        this.f24339a = i;
        return this;
    }

    @mr2
    /* renamed from: g0 */
    public B mo28828g0(boolean z) {
        this.f24350a = z;
        return this;
    }

    /* renamed from: h0 */
    public final void mo28829h0(CoordinatorLayout.C0459f fVar) {
        SwipeDismissBehavior swipeDismissBehavior = this.f24343a;
        if (swipeDismissBehavior == null) {
            swipeDismissBehavior = mo28801F();
        }
        if (swipeDismissBehavior instanceof Behavior) {
            ((Behavior) swipeDismissBehavior).mo28847V(this);
        }
        swipeDismissBehavior.mo11105P(new C4207n());
        fVar.mo3687q(swipeDismissBehavior);
        if (mo28796A() == null) {
            fVar.f3229e = 80;
        }
    }

    /* renamed from: i0 */
    public boolean mo28830i0() {
        AccessibilityManager accessibilityManager = this.f24342a;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    /* renamed from: j0 */
    public final boolean mo28831j0() {
        return this.f24356e > 0 && !this.f24350a && mo28814S();
    }

    /* renamed from: k0 */
    public void mo28832k0() {
        C4218a.m34009c().mo28935n(mo28800E(), this.f24346a);
    }

    /* renamed from: l0 */
    public final void mo28833l0() {
        if (this.f24344a.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f24344a.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0459f) {
                mo28829h0((CoordinatorLayout.C0459f) layoutParams);
            }
            this.f24344a.mo28848c(this.f24341a);
            mo28820Y();
            this.f24344a.setVisibility(4);
        }
        if (jt4.m18914U0(this.f24344a)) {
            mo28834m0();
        } else {
            this.f24354c = true;
        }
    }

    /* renamed from: m0 */
    public final void mo28834m0() {
        if (mo28830i0()) {
            mo28841s();
            return;
        }
        if (this.f24344a.getParent() != null) {
            this.f24344a.setVisibility(0);
        }
        mo28819X();
    }

    /* renamed from: n0 */
    public final void mo28835n0() {
        ValueAnimator z = mo28846z(0.0f, 1.0f);
        ValueAnimator G = mo28802G(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{z, G});
        animatorSet.setDuration(150);
        animatorSet.addListener(new C4209p());
        animatorSet.start();
    }

    /* renamed from: o0 */
    public final void mo28836o0(int i) {
        ValueAnimator z = mo28846z(1.0f, 0.0f);
        z.setDuration(75);
        z.addListener(new C4194a(i));
        z.start();
    }

    /* renamed from: p0 */
    public final void mo28837p0() {
        int J = mo28805J();
        if (f24327d) {
            jt4.m18953f1(this.f24344a, J);
        } else {
            this.f24344a.setTranslationY((float) J);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{J, 0});
        valueAnimator.setInterpolator(C1947d7.f10650b);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new C4197d());
        valueAnimator.addUpdateListener(new C4198e(J));
        valueAnimator.start();
    }

    /* renamed from: q0 */
    public final void mo28838q0(int i) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{0, mo28805J()});
        valueAnimator.setInterpolator(C1947d7.f10650b);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new C4199f(i));
        valueAnimator.addUpdateListener(new C4200g());
        valueAnimator.start();
    }

    @mr2
    /* renamed from: r */
    public B mo28839r(@ts2 C4212s<B> sVar) {
        if (sVar == null) {
            return this;
        }
        if (this.f24349a == null) {
            this.f24349a = new ArrayList();
        }
        this.f24349a.add(sVar);
        return this;
    }

    /* renamed from: r0 */
    public final void mo28840r0() {
        ViewGroup.LayoutParams layoutParams = this.f24344a.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || this.f24344a.f24363a == null) {
            Log.w(f24325a, "Unable to update margins because layout params are not MarginLayoutParams");
        } else if (this.f24344a.getParent() != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = this.f24344a.f24363a.bottom + (mo28796A() != null ? this.f24357f : this.f24351b);
            marginLayoutParams.leftMargin = this.f24344a.f24363a.left + this.f24353c;
            marginLayoutParams.rightMargin = this.f24344a.f24363a.right + this.f24355d;
            marginLayoutParams.topMargin = this.f24344a.f24363a.top;
            this.f24344a.requestLayout();
            if (Build.VERSION.SDK_INT >= 29 && mo28831j0()) {
                this.f24344a.removeCallbacks(this.f24348a);
                this.f24344a.post(this.f24348a);
            }
        }
    }

    /* renamed from: s */
    public void mo28841s() {
        this.f24344a.post(new C4208o());
    }

    /* renamed from: t */
    public final void mo28842t(int i) {
        if (this.f24344a.getAnimationMode() == 1) {
            mo28836o0(i);
        } else {
            mo28838q0(i);
        }
    }

    /* renamed from: u */
    public final int mo28843u() {
        if (mo28796A() == null) {
            return 0;
        }
        int[] iArr = new int[2];
        mo28796A().getLocationOnScreen(iArr);
        int i = iArr[1];
        int[] iArr2 = new int[2];
        this.f24341a.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f24341a.getHeight()) - i;
    }

    /* renamed from: x */
    public void mo28844x() {
        mo28845y(3);
    }

    /* renamed from: y */
    public void mo28845y(int i) {
        C4218a.m34009c().mo28924b(this.f24346a, i);
    }

    /* renamed from: z */
    public final ValueAnimator mo28846z(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C1947d7.f10649a);
        ofFloat.addUpdateListener(new C4195b());
        return ofFloat;
    }
}
