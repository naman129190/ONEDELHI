package com.onedelhi.secure;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.ViewGroup;

@sj3(21)
public final class hr3 implements ew4 {

    /* renamed from: a */
    public float f29744a;

    /* renamed from: a */
    public boolean f29745a;

    /* renamed from: b */
    public float f29746b;

    /* renamed from: b */
    public boolean f29747b;

    /* renamed from: c */
    public float f29748c;

    /* renamed from: d */
    public float f29749d;

    /* renamed from: com.onedelhi.secure.hr3$a */
    public class C5560a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ float f29750a;

        /* renamed from: a */
        public final /* synthetic */ View f29751a;

        /* renamed from: b */
        public final /* synthetic */ float f29752b;

        public C5560a(View view, float f, float f2) {
            this.f29751a = view;
            this.f29750a = f;
            this.f29752b = f2;
        }

        public void onAnimationEnd(Animator animator) {
            this.f29751a.setScaleX(this.f29750a);
            this.f29751a.setScaleY(this.f29752b);
        }
    }

    public hr3() {
        this(true);
    }

    public hr3(boolean z) {
        this.f29744a = 1.0f;
        this.f29746b = 1.1f;
        this.f29748c = 0.8f;
        this.f29749d = 1.0f;
        this.f29747b = true;
        this.f29745a = z;
    }

    /* renamed from: c */
    public static Animator m50832c(View view, float f, float f2) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{scaleX * f, scaleX * f2}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{f * scaleY, f2 * scaleY})});
        ofPropertyValuesHolder.addListener(new C5560a(view, scaleX, scaleY));
        return ofPropertyValuesHolder;
    }

    @ts2
    /* renamed from: a */
    public Animator mo32190a(@mr2 ViewGroup viewGroup, @mr2 View view) {
        float f;
        float f2;
        if (this.f29745a) {
            f = this.f29748c;
            f2 = this.f29749d;
        } else {
            f = this.f29746b;
            f2 = this.f29744a;
        }
        return m50832c(view, f, f2);
    }

    @ts2
    /* renamed from: b */
    public Animator mo32191b(@mr2 ViewGroup viewGroup, @mr2 View view) {
        float f;
        float f2;
        if (!this.f29747b) {
            return null;
        }
        if (this.f29745a) {
            f = this.f29744a;
            f2 = this.f29746b;
        } else {
            f = this.f29749d;
            f2 = this.f29748c;
        }
        return m50832c(view, f, f2);
    }

    /* renamed from: d */
    public float mo37504d() {
        return this.f29749d;
    }

    /* renamed from: e */
    public float mo37505e() {
        return this.f29748c;
    }

    /* renamed from: f */
    public float mo37506f() {
        return this.f29746b;
    }

    /* renamed from: g */
    public float mo37507g() {
        return this.f29744a;
    }

    /* renamed from: h */
    public boolean mo37508h() {
        return this.f29745a;
    }

    /* renamed from: i */
    public boolean mo37509i() {
        return this.f29747b;
    }

    /* renamed from: j */
    public void mo37510j(boolean z) {
        this.f29745a = z;
    }

    /* renamed from: k */
    public void mo37511k(float f) {
        this.f29749d = f;
    }

    /* renamed from: l */
    public void mo37512l(float f) {
        this.f29748c = f;
    }

    /* renamed from: m */
    public void mo37513m(float f) {
        this.f29746b = f;
    }

    /* renamed from: n */
    public void mo37514n(float f) {
        this.f29744a = f;
    }

    /* renamed from: o */
    public void mo37515o(boolean z) {
        this.f29747b = z;
    }
}
