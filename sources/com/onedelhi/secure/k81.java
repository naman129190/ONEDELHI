package com.onedelhi.secure;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import com.google.android.material.floatingactionbutton.C1622a;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.onedelhi.secure.fd3;
import java.util.ArrayList;

@sj3(21)
public class k81 extends C1622a {
    @ts2

    /* renamed from: a */
    public StateListAnimator f14785a;

    /* renamed from: com.onedelhi.secure.k81$a */
    public static class C2611a extends bf2 {
        public C2611a(uw3 uw3) {
            super(uw3);
        }

        public boolean isStateful() {
            return true;
        }
    }

    public k81(FloatingActionButton floatingActionButton, tw3 tw3) {
        super(floatingActionButton, tw3);
    }

    /* renamed from: A */
    public void mo12359A() {
    }

    /* renamed from: C */
    public void mo12361C() {
        mo12398i0();
    }

    /* renamed from: E */
    public void mo12363E(int[] iArr) {
        FloatingActionButton floatingActionButton;
        if (Build.VERSION.SDK_INT == 21) {
            float f = 0.0f;
            if (this.f8476a.isEnabled()) {
                this.f8476a.setElevation(this.f8468a);
                if (this.f8476a.isPressed()) {
                    floatingActionButton = this.f8476a;
                    f = this.f8492c;
                } else if (this.f8476a.isFocused() || this.f8476a.isHovered()) {
                    floatingActionButton = this.f8476a;
                    f = this.f8485b;
                }
                floatingActionButton.setTranslationZ(f);
            }
            this.f8476a.setElevation(0.0f);
            floatingActionButton = this.f8476a;
            floatingActionButton.setTranslationZ(f);
        }
    }

    /* renamed from: F */
    public void mo12364F(float f, float f2, float f3) {
        if (Build.VERSION.SDK_INT == 21) {
            this.f8476a.refreshDrawableState();
        } else if (this.f8476a.getStateListAnimator() == this.f14785a) {
            StateListAnimator m0 = mo18954m0(f, f2, f3);
            this.f14785a = m0;
            this.f8476a.setStateListAnimator(m0);
        }
        if (mo12387c0()) {
            mo12398i0();
        }
    }

    /* renamed from: N */
    public boolean mo12372N() {
        return false;
    }

    /* renamed from: Y */
    public void mo12383Y(@ts2 ColorStateList colorStateList) {
        Drawable drawable = this.f8474a;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(um3.m67327e(colorStateList));
        } else {
            super.mo12383Y(colorStateList);
        }
    }

    /* renamed from: c0 */
    public boolean mo12387c0() {
        return this.f8481a.mo12353c() || !mo12390e0();
    }

    /* renamed from: g0 */
    public void mo12394g0() {
    }

    @mr2
    /* renamed from: l */
    public bf2 mo12403l() {
        return new C2611a((uw3) k43.m19455l(this.f8482a));
    }

    @mr2
    /* renamed from: l0 */
    public C3423rn mo18953l0(int i, ColorStateList colorStateList) {
        Context context = this.f8476a.getContext();
        C3423rn rnVar = new C3423rn((uw3) k43.m19455l(this.f8482a));
        rnVar.mo23946f(r70.m26353f(context, fd3.C2155e.design_fab_stroke_top_outer_color), r70.m26353f(context, fd3.C2155e.design_fab_stroke_top_inner_color), r70.m26353f(context, fd3.C2155e.design_fab_stroke_end_inner_color), r70.m26353f(context, fd3.C2155e.design_fab_stroke_end_outer_color));
        rnVar.mo23945e((float) i);
        rnVar.mo23943d(colorStateList);
        return rnVar;
    }

    @mr2
    /* renamed from: m0 */
    public final StateListAnimator mo18954m0(float f, float f2, float f3) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(C1622a.f8445a, mo18955n0(f, f3));
        stateListAnimator.addState(C1622a.f8447b, mo18955n0(f, f2));
        stateListAnimator.addState(C1622a.f8448c, mo18955n0(f, f2));
        stateListAnimator.addState(C1622a.f8450d, mo18955n0(f, f2));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f8476a, "elevation", new float[]{f}).setDuration(0));
        int i = Build.VERSION.SDK_INT;
        if (i >= 22 && i <= 24) {
            FloatingActionButton floatingActionButton = this.f8476a;
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, new float[]{floatingActionButton.getTranslationZ()}).setDuration(100));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.f8476a, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(C1622a.f8444a);
        stateListAnimator.addState(C1622a.f8452e, animatorSet);
        stateListAnimator.addState(C1622a.f8455f, mo18955n0(0.0f, 0.0f));
        return stateListAnimator;
    }

    /* renamed from: n */
    public float mo12405n() {
        return this.f8476a.getElevation();
    }

    @mr2
    /* renamed from: n0 */
    public final Animator mo18955n0(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f8476a, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.f8476a, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
        animatorSet.setInterpolator(C1622a.f8444a);
        return animatorSet;
    }

    /* renamed from: s */
    public void mo12410s(@mr2 Rect rect) {
        if (this.f8481a.mo12353c()) {
            super.mo12410s(rect);
            return;
        }
        int sizeDimension = !mo12390e0() ? (this.f8469a - this.f8476a.getSizeDimension()) / 2 : 0;
        rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
    }

    /* renamed from: x */
    public void mo12415x(ColorStateList colorStateList, @ts2 PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable drawable;
        bf2 l = mo12403l();
        this.f8477a = l;
        l.setTintList(colorStateList);
        if (mode != null) {
            this.f8477a.setTintMode(mode);
        }
        this.f8477a.mo31599Z(this.f8476a.getContext());
        if (i > 0) {
            this.f8480a = mo18953l0(i, colorStateList);
            drawable = new LayerDrawable(new Drawable[]{(Drawable) k43.m19455l(this.f8480a), (Drawable) k43.m19455l(this.f8477a)});
        } else {
            this.f8480a = null;
            drawable = this.f8477a;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(um3.m67327e(colorStateList2), drawable, (Drawable) null);
        this.f8474a = rippleDrawable;
        this.f8488b = rippleDrawable;
    }
}
