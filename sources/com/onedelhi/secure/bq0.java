package com.onedelhi.secure;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.C4258a;
import com.onedelhi.secure.C4030z1;
import com.onedelhi.secure.fd3;

public class bq0 extends ju0 {

    /* renamed from: a */
    public static final int f26482a = 50;

    /* renamed from: b */
    public static final int f26483b = 67;
    @C3196px(api = 21)

    /* renamed from: d */
    public static final boolean f26484d = true;

    /* renamed from: a */
    public long f26485a = Long.MAX_VALUE;

    /* renamed from: a */
    public ValueAnimator f26486a;

    /* renamed from: a */
    public final View.OnClickListener f26487a = new vp0(this);

    /* renamed from: a */
    public final View.OnFocusChangeListener f26488a = new wp0(this);
    @ts2

    /* renamed from: a */
    public AccessibilityManager f26489a;
    @ts2

    /* renamed from: a */
    public AutoCompleteTextView f26490a;

    /* renamed from: a */
    public final C4030z1.C4035e f26491a = new zp0(this);

    /* renamed from: a */
    public boolean f26492a;

    /* renamed from: b */
    public ValueAnimator f26493b;

    /* renamed from: b */
    public boolean f26494b;

    /* renamed from: c */
    public boolean f26495c;

    /* renamed from: com.onedelhi.secure.bq0$a */
    public class C4691a extends AnimatorListenerAdapter {
        public C4691a() {
        }

        public void onAnimationEnd(Animator animator) {
            bq0.this.mo38913r();
            bq0.this.f26493b.start();
        }
    }

    public bq0(@mr2 C4258a aVar) {
        super(aVar);
    }

    @mr2
    /* renamed from: D */
    public static AutoCompleteTextView m40255D(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ void m40256H() {
        boolean isPopupShowing = this.f26490a.isPopupShowing();
        mo31979O(isPopupShowing);
        this.f26494b = isPopupShowing;
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public /* synthetic */ void m40257I(ValueAnimator valueAnimator) {
        this.f30939a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public /* synthetic */ void m40258J(View view) {
        mo31981Q();
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public /* synthetic */ void m40259K(View view, boolean z) {
        this.f26492a = z;
        mo38913r();
        if (!z) {
            mo31979O(false);
            this.f26494b = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public /* synthetic */ void m40260L(boolean z) {
        AutoCompleteTextView autoCompleteTextView = this.f26490a;
        if (autoCompleteTextView != null && !ds0.m45525a(autoCompleteTextView)) {
            jt4.m18906R1(this.f30939a, z ? 2 : 1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public /* synthetic */ boolean m40261M(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (mo31978G()) {
                this.f26494b = false;
            }
            mo31981Q();
            mo31982R();
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public /* synthetic */ void m40262N() {
        mo31982R();
        mo31979O(false);
    }

    /* renamed from: E */
    public final ValueAnimator mo31976E(int i, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C1947d7.f10649a);
        ofFloat.setDuration((long) i);
        ofFloat.addUpdateListener(new up0(this));
        return ofFloat;
    }

    /* renamed from: F */
    public final void mo31977F() {
        this.f26493b = mo31976E(67, 0.0f, 1.0f);
        ValueAnimator E = mo31976E(50, 1.0f, 0.0f);
        this.f26486a = E;
        E.addListener(new C4691a());
    }

    /* renamed from: G */
    public final boolean mo31978G() {
        long currentTimeMillis = System.currentTimeMillis() - this.f26485a;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* renamed from: O */
    public final void mo31979O(boolean z) {
        if (this.f26495c != z) {
            this.f26495c = z;
            this.f26493b.cancel();
            this.f26486a.start();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: P */
    public final void mo31980P() {
        this.f26490a.setOnTouchListener(new xp0(this));
        if (f26484d) {
            this.f26490a.setOnDismissListener(new yp0(this));
        }
        this.f26490a.setThreshold(0);
    }

    /* renamed from: Q */
    public final void mo31981Q() {
        if (this.f26490a != null) {
            if (mo31978G()) {
                this.f26494b = false;
            }
            if (!this.f26494b) {
                if (f26484d) {
                    mo31979O(!this.f26495c);
                } else {
                    this.f26495c = !this.f26495c;
                    mo38913r();
                }
                if (this.f26495c) {
                    this.f26490a.requestFocus();
                    this.f26490a.showDropDown();
                    return;
                }
                this.f26490a.dismissDropDown();
                return;
            }
            this.f26494b = false;
        }
    }

    /* renamed from: R */
    public final void mo31982R() {
        this.f26494b = true;
        this.f26485a = System.currentTimeMillis();
    }

    /* renamed from: a */
    public void mo31983a(Editable editable) {
        if (this.f26489a.isTouchExplorationEnabled() && ds0.m45525a(this.f26490a) && !this.f30939a.hasFocus()) {
            this.f26490a.dismissDropDown();
        }
        this.f26490a.post(new aq0(this));
    }

    /* renamed from: c */
    public int mo31984c() {
        return fd3.C2163m.exposed_dropdown_menu_content_description;
    }

    /* renamed from: d */
    public int mo31985d() {
        return f26484d ? fd3.C2157g.mtrl_dropdown_arrow : fd3.C2157g.mtrl_ic_arrow_drop_down;
    }

    /* renamed from: e */
    public View.OnFocusChangeListener mo31986e() {
        return this.f26488a;
    }

    /* renamed from: f */
    public View.OnClickListener mo31987f() {
        return this.f26487a;
    }

    /* renamed from: h */
    public C4030z1.C4035e mo31988h() {
        return this.f26491a;
    }

    /* renamed from: i */
    public boolean mo31989i(int i) {
        return i != 0;
    }

    /* renamed from: j */
    public boolean mo31990j() {
        return true;
    }

    /* renamed from: k */
    public boolean mo31991k() {
        return this.f26492a;
    }

    /* renamed from: l */
    public boolean mo31992l() {
        return true;
    }

    /* renamed from: m */
    public boolean mo31993m() {
        return this.f26495c;
    }

    /* renamed from: n */
    public void mo31994n(@ts2 EditText editText) {
        this.f26490a = m40255D(editText);
        mo31980P();
        this.f30940a.setErrorIconDrawable((Drawable) null);
        if (!ds0.m45525a(editText) && this.f26489a.isTouchExplorationEnabled()) {
            jt4.m18906R1(this.f30939a, 2);
        }
        this.f30940a.setEndIconVisible(true);
    }

    /* renamed from: o */
    public void mo31995o(View view, @mr2 C1638a2 a2Var) {
        if (!ds0.m45525a(this.f26490a)) {
            a2Var.mo12548W0(Spinner.class.getName());
        }
        if (a2Var.mo12633z0()) {
            a2Var.mo12593l1((CharSequence) null);
        }
    }

    /* renamed from: p */
    public void mo31996p(View view, @mr2 AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 1 && this.f26489a.isEnabled() && !ds0.m45525a(this.f26490a)) {
            mo31981Q();
            mo31982R();
        }
    }

    /* renamed from: s */
    public void mo31997s() {
        mo31977F();
        this.f26489a = (AccessibilityManager) this.f30938a.getSystemService("accessibility");
    }

    /* renamed from: t */
    public boolean mo31998t() {
        return true;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: u */
    public void mo31999u() {
        AutoCompleteTextView autoCompleteTextView = this.f26490a;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener((View.OnTouchListener) null);
            if (f26484d) {
                this.f26490a.setOnDismissListener((AutoCompleteTextView.OnDismissListener) null);
            }
        }
    }
}
