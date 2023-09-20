package com.onedelhi.secure;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

public final class uz0 implements fw4 {

    /* renamed from: a */
    public float f36348a = 1.0f;

    /* renamed from: com.onedelhi.secure.uz0$a */
    public class C6989a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ float f36349a;

        /* renamed from: a */
        public final /* synthetic */ View f36350a;

        /* renamed from: b */
        public final /* synthetic */ float f36351b;

        /* renamed from: c */
        public final /* synthetic */ float f36352c;

        /* renamed from: d */
        public final /* synthetic */ float f36353d;

        public C6989a(View view, float f, float f2, float f3, float f4) {
            this.f36350a = view;
            this.f36349a = f;
            this.f36351b = f2;
            this.f36352c = f3;
            this.f36353d = f4;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f36350a.setAlpha(sh4.m64586l(this.f36349a, this.f36351b, this.f36352c, this.f36353d, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    /* renamed from: com.onedelhi.secure.uz0$b */
    public class C6990b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ float f36354a;

        /* renamed from: a */
        public final /* synthetic */ View f36355a;

        public C6990b(View view, float f) {
            this.f36355a = view;
            this.f36354a = f;
        }

        public void onAnimationEnd(Animator animator) {
            this.f36355a.setAlpha(this.f36354a);
        }
    }

    /* renamed from: c */
    public static Animator m67536c(View view, float f, float f2, @d81(from = 0.0d, mo14561to = 1.0d) float f3, @d81(from = 0.0d, mo14561to = 1.0d) float f4, float f5) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C6989a(view, f, f2, f3, f4));
        ofFloat.addListener(new C6990b(view, f5));
        return ofFloat;
    }

    @ts2
    /* renamed from: a */
    public Animator mo34051a(@mr2 ViewGroup viewGroup, @mr2 View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return m67536c(view, 0.0f, alpha, 0.0f, this.f36348a, alpha);
    }

    @ts2
    /* renamed from: b */
    public Animator mo34052b(@mr2 ViewGroup viewGroup, @mr2 View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return m67536c(view, alpha, 0.0f, 0.0f, 1.0f, alpha);
    }

    /* renamed from: d */
    public float mo45874d() {
        return this.f36348a;
    }

    /* renamed from: e */
    public void mo45875e(float f) {
        this.f36348a = f;
    }
}
