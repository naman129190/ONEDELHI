package com.onedelhi.secure;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.C4258a;
import com.onedelhi.secure.fd3;

/* renamed from: com.onedelhi.secure.vy */
public class C7108vy extends ju0 {

    /* renamed from: a */
    public static final float f36770a = 0.8f;

    /* renamed from: a */
    public static final int f36771a = 100;

    /* renamed from: b */
    public static final int f36772b = 150;

    /* renamed from: a */
    public AnimatorSet f36773a;

    /* renamed from: a */
    public ValueAnimator f36774a;

    /* renamed from: a */
    public final View.OnClickListener f36775a = new C6797sy(this);

    /* renamed from: a */
    public final View.OnFocusChangeListener f36776a = new C6907ty(this);
    @ts2

    /* renamed from: a */
    public EditText f36777a;

    /* renamed from: com.onedelhi.secure.vy$a */
    public class C7109a extends AnimatorListenerAdapter {
        public C7109a() {
        }

        public void onAnimationStart(Animator animator) {
            C7108vy.this.f30941a.mo29430a0(true);
        }
    }

    /* renamed from: com.onedelhi.secure.vy$b */
    public class C7110b extends AnimatorListenerAdapter {
        public C7110b() {
        }

        public void onAnimationEnd(Animator animator) {
            C7108vy.this.f30941a.mo29430a0(false);
        }
    }

    public C7108vy(@mr2 C4258a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ void m68606E(ValueAnimator valueAnimator) {
        this.f30939a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ void m68607F(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f30939a.setScaleX(floatValue);
        this.f30939a.setScaleY(floatValue);
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ void m68608G(View view) {
        EditText editText = this.f36777a;
        if (editText != null) {
            Editable text = editText.getText();
            if (text != null) {
                text.clear();
            }
            mo38913r();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ void m68609H(View view, boolean z) {
        mo46432A(mo46436J());
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public /* synthetic */ void m68610I() {
        mo46432A(true);
    }

    /* renamed from: A */
    public final void mo46432A(boolean z) {
        boolean z2 = this.f30941a.mo29409F() == z;
        if (z && !this.f36773a.isRunning()) {
            this.f36774a.cancel();
            this.f36773a.start();
            if (z2) {
                this.f36773a.end();
            }
        } else if (!z) {
            this.f36773a.cancel();
            this.f36774a.start();
            if (z2) {
                this.f36774a.end();
            }
        }
    }

    /* renamed from: B */
    public final ValueAnimator mo46433B(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C1947d7.f10649a);
        ofFloat.setDuration(100);
        ofFloat.addUpdateListener(new C6721ry(this));
        return ofFloat;
    }

    /* renamed from: C */
    public final ValueAnimator mo46434C() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(C1947d7.f10652d);
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new C6620qy(this));
        return ofFloat;
    }

    /* renamed from: D */
    public final void mo46435D() {
        ValueAnimator C = mo46434C();
        ValueAnimator B = mo46433B(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f36773a = animatorSet;
        animatorSet.playTogether(new Animator[]{C, B});
        this.f36773a.addListener(new C7109a());
        ValueAnimator B2 = mo46433B(1.0f, 0.0f);
        this.f36774a = B2;
        B2.addListener(new C7110b());
    }

    /* renamed from: J */
    public final boolean mo46436J() {
        EditText editText = this.f36777a;
        return editText != null && (editText.hasFocus() || this.f30939a.hasFocus()) && this.f36777a.getText().length() > 0;
    }

    /* renamed from: a */
    public void mo31983a(@mr2 Editable editable) {
        if (this.f30941a.mo29468w() == null) {
            mo46432A(mo46436J());
        }
    }

    /* renamed from: c */
    public int mo31984c() {
        return fd3.C2163m.clear_text_end_icon_content_description;
    }

    /* renamed from: d */
    public int mo31985d() {
        return fd3.C2157g.mtrl_ic_cancel;
    }

    /* renamed from: e */
    public View.OnFocusChangeListener mo31986e() {
        return this.f36776a;
    }

    /* renamed from: f */
    public View.OnClickListener mo31987f() {
        return this.f36775a;
    }

    /* renamed from: g */
    public View.OnFocusChangeListener mo38911g() {
        return this.f36776a;
    }

    /* renamed from: n */
    public void mo31994n(@ts2 EditText editText) {
        this.f36777a = editText;
        this.f30940a.setEndIconVisible(mo46436J());
    }

    /* renamed from: q */
    public void mo38912q(boolean z) {
        if (this.f30941a.mo29468w() != null) {
            mo46432A(z);
        }
    }

    /* renamed from: s */
    public void mo31997s() {
        mo46435D();
    }

    /* renamed from: u */
    public void mo31999u() {
        EditText editText = this.f36777a;
        if (editText != null) {
            editText.post(new C6986uy(this));
        }
    }
}
