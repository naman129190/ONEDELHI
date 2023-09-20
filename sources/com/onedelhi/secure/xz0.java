package com.onedelhi.secure;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

public final class xz0 implements fw4 {

    /* renamed from: b */
    public static final float f37709b = 0.35f;

    /* renamed from: a */
    public float f37710a = 0.35f;

    /* renamed from: com.onedelhi.secure.xz0$a */
    public class C7285a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ float f37711a;

        /* renamed from: a */
        public final /* synthetic */ View f37712a;

        /* renamed from: b */
        public final /* synthetic */ float f37713b;

        /* renamed from: c */
        public final /* synthetic */ float f37714c;

        /* renamed from: d */
        public final /* synthetic */ float f37715d;

        public C7285a(View view, float f, float f2, float f3, float f4) {
            this.f37712a = view;
            this.f37711a = f;
            this.f37713b = f2;
            this.f37714c = f3;
            this.f37715d = f4;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f37712a.setAlpha(sh4.m64586l(this.f37711a, this.f37713b, this.f37714c, this.f37715d, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    /* renamed from: com.onedelhi.secure.xz0$b */
    public class C7286b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ float f37716a;

        /* renamed from: a */
        public final /* synthetic */ View f37717a;

        public C7286b(View view, float f) {
            this.f37717a = view;
            this.f37716a = f;
        }

        public void onAnimationEnd(Animator animator) {
            this.f37717a.setAlpha(this.f37716a);
        }
    }

    /* renamed from: c */
    public static Animator m70944c(View view, float f, float f2, @d81(from = 0.0d, mo14561to = 1.0d) float f3, @d81(from = 0.0d, mo14561to = 1.0d) float f4, float f5) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C7285a(view, f, f2, f3, f4));
        ofFloat.addListener(new C7286b(view, f5));
        return ofFloat;
    }

    @ts2
    /* renamed from: a */
    public Animator mo34051a(@mr2 ViewGroup viewGroup, @mr2 View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return m70944c(view, 0.0f, alpha, this.f37710a, 1.0f, alpha);
    }

    @ts2
    /* renamed from: b */
    public Animator mo34052b(@mr2 ViewGroup viewGroup, @mr2 View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return m70944c(view, alpha, 0.0f, 0.0f, this.f37710a, alpha);
    }

    /* renamed from: d */
    public float mo47458d() {
        return this.f37710a;
    }

    /* renamed from: e */
    public void mo47459e(@d81(from = 0.0d, mo14561to = 1.0d) float f) {
        this.f37710a = f;
    }
}
