package com.onedelhi.secure;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

@sj3(21)
public final class tz0 implements ew4 {

    /* renamed from: a */
    public float f35842a = 1.0f;

    /* renamed from: com.onedelhi.secure.tz0$a */
    public class C6910a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ float f35843a;

        /* renamed from: a */
        public final /* synthetic */ View f35844a;

        /* renamed from: b */
        public final /* synthetic */ float f35845b;

        /* renamed from: c */
        public final /* synthetic */ float f35846c;

        /* renamed from: d */
        public final /* synthetic */ float f35847d;

        public C6910a(View view, float f, float f2, float f3, float f4) {
            this.f35844a = view;
            this.f35843a = f;
            this.f35845b = f2;
            this.f35846c = f3;
            this.f35847d = f4;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f35844a.setAlpha(rh4.m63621l(this.f35843a, this.f35845b, this.f35846c, this.f35847d, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    /* renamed from: com.onedelhi.secure.tz0$b */
    public class C6911b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ float f35848a;

        /* renamed from: a */
        public final /* synthetic */ View f35849a;

        public C6911b(View view, float f) {
            this.f35849a = view;
            this.f35848a = f;
        }

        public void onAnimationEnd(Animator animator) {
            this.f35849a.setAlpha(this.f35848a);
        }
    }

    /* renamed from: c */
    public static Animator m66296c(View view, float f, float f2, @d81(from = 0.0d, mo14561to = 1.0d) float f3, @d81(from = 0.0d, mo14561to = 1.0d) float f4, float f5) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C6910a(view, f, f2, f3, f4));
        ofFloat.addListener(new C6911b(view, f5));
        return ofFloat;
    }

    @ts2
    /* renamed from: a */
    public Animator mo32190a(@mr2 ViewGroup viewGroup, @mr2 View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return m66296c(view, 0.0f, alpha, 0.0f, this.f35842a, alpha);
    }

    @ts2
    /* renamed from: b */
    public Animator mo32191b(@mr2 ViewGroup viewGroup, @mr2 View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return m66296c(view, alpha, 0.0f, 0.0f, 1.0f, alpha);
    }

    /* renamed from: d */
    public float mo45333d() {
        return this.f35842a;
    }

    /* renamed from: e */
    public void mo45334e(float f) {
        this.f35842a = f;
    }
}
