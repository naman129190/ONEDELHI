package com.onedelhi.secure;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.util.Property;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import com.onedelhi.secure.C2218g6;
import java.util.Arrays;

public final class l32 extends sp1<ObjectAnimator> {

    /* renamed from: a */
    public static final Property<l32, Float> f31528a = new C5957b(Float.class, "animationFraction");

    /* renamed from: b */
    public static final int f31529b = 667;

    /* renamed from: c */
    public static final int f31530c = 333;

    /* renamed from: a */
    public float f31531a;

    /* renamed from: a */
    public int f31532a = 1;

    /* renamed from: a */
    public ObjectAnimator f31533a;

    /* renamed from: a */
    public b01 f31534a;

    /* renamed from: a */
    public final C6774sj f31535a;

    /* renamed from: a */
    public boolean f31536a;

    /* renamed from: com.onedelhi.secure.l32$a */
    public class C5956a extends AnimatorListenerAdapter {
        public C5956a() {
        }

        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            l32 l32 = l32.this;
            int unused = l32.f31532a = (l32.f31532a + 1) % l32.this.f31535a.f35100a.length;
            boolean unused2 = l32.this.f31536a = true;
        }
    }

    /* renamed from: com.onedelhi.secure.l32$b */
    public class C5957b extends Property<l32, Float> {
        public C5957b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(l32 l32) {
            return Float.valueOf(l32.mo39637n());
        }

        /* renamed from: b */
        public void set(l32 l32, Float f) {
            l32.mo39641r(f.floatValue());
        }
    }

    public l32(@mr2 LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(3);
        this.f31535a = linearProgressIndicatorSpec;
        this.f31534a = new b01();
    }

    /* renamed from: a */
    public void mo37645a() {
        ObjectAnimator objectAnimator = this.f31533a;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: c */
    public void mo37646c() {
        mo39640q();
    }

    /* renamed from: d */
    public void mo37647d(@ts2 C2218g6.C2219a aVar) {
    }

    /* renamed from: f */
    public void mo37648f() {
    }

    /* renamed from: g */
    public void mo37649g() {
        mo39638o();
        mo39640q();
        this.f31533a.start();
    }

    /* renamed from: h */
    public void mo37650h() {
    }

    /* renamed from: n */
    public final float mo39637n() {
        return this.f31531a;
    }

    /* renamed from: o */
    public final void mo39638o() {
        if (this.f31533a == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f31528a, new float[]{0.0f, 1.0f});
            this.f31533a = ofFloat;
            ofFloat.setDuration(333);
            this.f31533a.setInterpolator((TimeInterpolator) null);
            this.f31533a.setRepeatCount(-1);
            this.f31533a.addListener(new C5956a());
        }
    }

    /* renamed from: p */
    public final void mo39639p() {
        if (this.f31536a && this.f35158a[3] < 1.0f) {
            int[] iArr = this.f35159a;
            iArr[2] = iArr[1];
            iArr[1] = iArr[0];
            iArr[0] = oe2.m23715a(this.f31535a.f35100a[this.f31532a], this.f35157a.getAlpha());
            this.f31536a = false;
        }
    }

    @hw4
    /* renamed from: q */
    public void mo39640q() {
        this.f31536a = true;
        this.f31532a = 1;
        Arrays.fill(this.f35159a, oe2.m23715a(this.f31535a.f35100a[0], this.f35157a.getAlpha()));
    }

    @hw4
    /* renamed from: r */
    public void mo39641r(float f) {
        this.f31531a = f;
        mo39642s((int) (f * 333.0f));
        mo39639p();
        this.f35157a.invalidateSelf();
    }

    /* renamed from: s */
    public final void mo39642s(int i) {
        this.f35158a[0] = 0.0f;
        float b = mo44430b(i, 0, 667);
        float[] fArr = this.f35158a;
        float interpolation = this.f31534a.getInterpolation(b);
        fArr[2] = interpolation;
        fArr[1] = interpolation;
        float[] fArr2 = this.f35158a;
        float interpolation2 = this.f31534a.getInterpolation(b + 0.49925038f);
        fArr2[4] = interpolation2;
        fArr2[3] = interpolation2;
        this.f35158a[5] = 1.0f;
    }
}
