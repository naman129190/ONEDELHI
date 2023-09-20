package com.onedelhi.secure;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.ViewGroup;

public final class ir3 implements fw4 {

    /* renamed from: a */
    public float f30437a;

    /* renamed from: a */
    public boolean f30438a;

    /* renamed from: b */
    public float f30439b;

    /* renamed from: b */
    public boolean f30440b;

    /* renamed from: c */
    public float f30441c;

    /* renamed from: d */
    public float f30442d;

    /* renamed from: com.onedelhi.secure.ir3$a */
    public class C5741a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ float f30443a;

        /* renamed from: a */
        public final /* synthetic */ View f30444a;

        /* renamed from: b */
        public final /* synthetic */ float f30445b;

        public C5741a(View view, float f, float f2) {
            this.f30444a = view;
            this.f30443a = f;
            this.f30445b = f2;
        }

        public void onAnimationEnd(Animator animator) {
            this.f30444a.setScaleX(this.f30443a);
            this.f30444a.setScaleY(this.f30445b);
        }
    }

    public ir3() {
        this(true);
    }

    public ir3(boolean z) {
        this.f30437a = 1.0f;
        this.f30439b = 1.1f;
        this.f30441c = 0.8f;
        this.f30442d = 1.0f;
        this.f30440b = true;
        this.f30438a = z;
    }

    /* renamed from: c */
    public static Animator m52618c(View view, float f, float f2) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{scaleX * f, scaleX * f2}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{f * scaleY, f2 * scaleY})});
        ofPropertyValuesHolder.addListener(new C5741a(view, scaleX, scaleY));
        return ofPropertyValuesHolder;
    }

    @ts2
    /* renamed from: a */
    public Animator mo34051a(@mr2 ViewGroup viewGroup, @mr2 View view) {
        float f;
        float f2;
        if (this.f30438a) {
            f = this.f30441c;
            f2 = this.f30442d;
        } else {
            f = this.f30439b;
            f2 = this.f30437a;
        }
        return m52618c(view, f, f2);
    }

    @ts2
    /* renamed from: b */
    public Animator mo34052b(@mr2 ViewGroup viewGroup, @mr2 View view) {
        float f;
        float f2;
        if (!this.f30440b) {
            return null;
        }
        if (this.f30438a) {
            f = this.f30437a;
            f2 = this.f30439b;
        } else {
            f = this.f30442d;
            f2 = this.f30441c;
        }
        return m52618c(view, f, f2);
    }

    /* renamed from: d */
    public float mo38199d() {
        return this.f30442d;
    }

    /* renamed from: e */
    public float mo38200e() {
        return this.f30441c;
    }

    /* renamed from: f */
    public float mo38201f() {
        return this.f30439b;
    }

    /* renamed from: g */
    public float mo38202g() {
        return this.f30437a;
    }

    /* renamed from: h */
    public boolean mo38203h() {
        return this.f30438a;
    }

    /* renamed from: i */
    public boolean mo38204i() {
        return this.f30440b;
    }

    /* renamed from: j */
    public void mo38205j(boolean z) {
        this.f30438a = z;
    }

    /* renamed from: k */
    public void mo38206k(float f) {
        this.f30442d = f;
    }

    /* renamed from: l */
    public void mo38207l(float f) {
        this.f30441c = f;
    }

    /* renamed from: m */
    public void mo38208m(float f) {
        this.f30439b = f;
    }

    /* renamed from: n */
    public void mo38209n(float f) {
        this.f30437a = f;
    }

    /* renamed from: o */
    public void mo38210o(boolean z) {
        this.f30440b = z;
    }
}
