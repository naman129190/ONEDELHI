package com.onedelhi.secure;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.C1636b;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.onedelhi.secure.pj */
public abstract class C3153pj implements C1636b {

    /* renamed from: a */
    public final Context f18554a;
    @mr2

    /* renamed from: a */
    public final ExtendedFloatingActionButton f18555a;

    /* renamed from: a */
    public final C2607k7 f18556a;
    @ts2

    /* renamed from: a */
    public nl2 f18557a;

    /* renamed from: a */
    public final ArrayList<Animator.AnimatorListener> f18558a = new ArrayList<>();
    @ts2

    /* renamed from: b */
    public nl2 f18559b;

    /* renamed from: com.onedelhi.secure.pj$a */
    public class C3154a extends Property<ExtendedFloatingActionButton, Float> {
        public C3154a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
            return Float.valueOf(C1947d7.m12985a(0.0f, 1.0f, (((float) Color.alpha(extendedFloatingActionButton.getCurrentTextColor())) / 255.0f) / ((float) Color.alpha(extendedFloatingActionButton.f8383b.getColorForState(extendedFloatingActionButton.getDrawableState(), C3153pj.this.f18555a.f8383b.getDefaultColor())))));
        }

        /* renamed from: b */
        public void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f) {
            int colorForState = extendedFloatingActionButton.f8383b.getColorForState(extendedFloatingActionButton.getDrawableState(), C3153pj.this.f18555a.f8383b.getDefaultColor());
            ColorStateList valueOf = ColorStateList.valueOf(Color.argb((int) (C1947d7.m12985a(0.0f, ((float) Color.alpha(colorForState)) / 255.0f, f.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
            if (f.floatValue() == 1.0f) {
                extendedFloatingActionButton.mo12187Z(extendedFloatingActionButton.f8383b);
            } else {
                extendedFloatingActionButton.mo12187Z(valueOf);
            }
        }
    }

    public C3153pj(@mr2 ExtendedFloatingActionButton extendedFloatingActionButton, C2607k7 k7Var) {
        this.f18555a = extendedFloatingActionButton;
        this.f18554a = extendedFloatingActionButton.getContext();
        this.f18556a = k7Var;
    }

    @C3740us
    /* renamed from: b */
    public void mo12253b() {
        this.f18556a.mo18926b();
    }

    /* renamed from: c */
    public final void mo12432c(@mr2 Animator.AnimatorListener animatorListener) {
        this.f18558a.remove(animatorListener);
    }

    /* renamed from: e */
    public final void mo12433e(@ts2 nl2 nl2) {
        this.f18559b = nl2;
    }

    @mr2
    /* renamed from: h */
    public final List<Animator.AnimatorListener> mo12434h() {
        return this.f18558a;
    }

    @C3740us
    /* renamed from: i */
    public void mo12250i() {
        this.f18556a.mo18926b();
    }

    /* renamed from: j */
    public final nl2 mo12435j() {
        nl2 nl2 = this.f18559b;
        if (nl2 != null) {
            return nl2;
        }
        if (this.f18557a == null) {
            this.f18557a = nl2.m22935d(this.f18554a, mo12246a());
        }
        return (nl2) k43.m19455l(this.f18557a);
    }

    /* renamed from: k */
    public AnimatorSet mo12251k() {
        return mo22455o(mo12435j());
    }

    @ts2
    /* renamed from: l */
    public nl2 mo12436l() {
        return this.f18559b;
    }

    /* renamed from: m */
    public final void mo12437m(@mr2 Animator.AnimatorListener animatorListener) {
        this.f18558a.add(animatorListener);
    }

    @mr2
    /* renamed from: o */
    public AnimatorSet mo22455o(@mr2 nl2 nl2) {
        ArrayList arrayList = new ArrayList();
        if (nl2.mo21376j("opacity")) {
            arrayList.add(nl2.mo21371f("opacity", this.f18555a, View.ALPHA));
        }
        if (nl2.mo21376j(yz1.f38142d)) {
            arrayList.add(nl2.mo21371f(yz1.f38142d, this.f18555a, View.SCALE_Y));
            arrayList.add(nl2.mo21371f(yz1.f38142d, this.f18555a, View.SCALE_X));
        }
        if (nl2.mo21376j(yz1.f38148j)) {
            arrayList.add(nl2.mo21371f(yz1.f38148j, this.f18555a, ExtendedFloatingActionButton.f8373a));
        }
        if (nl2.mo21376j("height")) {
            arrayList.add(nl2.mo21371f("height", this.f18555a, ExtendedFloatingActionButton.f8374b));
        }
        if (nl2.mo21376j("paddingStart")) {
            arrayList.add(nl2.mo21371f("paddingStart", this.f18555a, ExtendedFloatingActionButton.f8375c));
        }
        if (nl2.mo21376j("paddingEnd")) {
            arrayList.add(nl2.mo21371f("paddingEnd", this.f18555a, ExtendedFloatingActionButton.f8376d));
        }
        if (nl2.mo21376j("labelOpacity")) {
            arrayList.add(nl2.mo21371f("labelOpacity", this.f18555a, new C3154a(Float.class, "LABEL_OPACITY_PROPERTY")));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        C2479j7.m18186a(animatorSet, arrayList);
        return animatorSet;
    }

    @C3740us
    public void onAnimationStart(Animator animator) {
        this.f18556a.mo18927c(animator);
    }
}
