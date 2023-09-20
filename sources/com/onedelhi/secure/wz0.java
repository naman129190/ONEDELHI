package com.onedelhi.secure;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

@sj3(21)
public final class wz0 implements ew4 {

    /* renamed from: b */
    public static final float f37259b = 0.35f;

    /* renamed from: a */
    public float f37260a = 0.35f;

    /* renamed from: com.onedelhi.secure.wz0$a */
    public class C7209a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ float f37261a;

        /* renamed from: a */
        public final /* synthetic */ View f37262a;

        /* renamed from: b */
        public final /* synthetic */ float f37263b;

        /* renamed from: c */
        public final /* synthetic */ float f37264c;

        /* renamed from: d */
        public final /* synthetic */ float f37265d;

        public C7209a(View view, float f, float f2, float f3, float f4) {
            this.f37262a = view;
            this.f37261a = f;
            this.f37263b = f2;
            this.f37264c = f3;
            this.f37265d = f4;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f37262a.setAlpha(rh4.m63621l(this.f37261a, this.f37263b, this.f37264c, this.f37265d, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    /* renamed from: com.onedelhi.secure.wz0$b */
    public class C7210b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ float f37266a;

        /* renamed from: a */
        public final /* synthetic */ View f37267a;

        public C7210b(View view, float f) {
            this.f37267a = view;
            this.f37266a = f;
        }

        public void onAnimationEnd(Animator animator) {
            this.f37267a.setAlpha(this.f37266a);
        }
    }

    /* renamed from: c */
    public static Animator m69728c(View view, float f, float f2, @d81(from = 0.0d, mo14561to = 1.0d) float f3, @d81(from = 0.0d, mo14561to = 1.0d) float f4, float f5) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C7209a(view, f, f2, f3, f4));
        ofFloat.addListener(new C7210b(view, f5));
        return ofFloat;
    }

    @ts2
    /* renamed from: a */
    public Animator mo32190a(@mr2 ViewGroup viewGroup, @mr2 View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return m69728c(view, 0.0f, alpha, this.f37260a, 1.0f, alpha);
    }

    @ts2
    /* renamed from: b */
    public Animator mo32191b(@mr2 ViewGroup viewGroup, @mr2 View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return m69728c(view, alpha, 0.0f, 0.0f, this.f37260a, alpha);
    }

    /* renamed from: d */
    public float mo46924d() {
        return this.f37260a;
    }

    /* renamed from: e */
    public void mo46925e(@d81(from = 0.0d, mo14561to = 1.0d) float f) {
        this.f37260a = f;
    }
}
