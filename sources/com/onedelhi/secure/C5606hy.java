package com.onedelhi.secure;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.util.Property;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import com.onedelhi.secure.C2218g6;

/* renamed from: com.onedelhi.secure.hy */
public final class C5606hy extends sp1<ObjectAnimator> {

    /* renamed from: a */
    public static final Property<C5606hy, Float> f29906a;

    /* renamed from: b */
    public static final int f29907b = 4;

    /* renamed from: b */
    public static final Property<C5606hy, Float> f29908b;

    /* renamed from: b */
    public static final int[] f29909b = {0, 1350, 2700, 4050};

    /* renamed from: c */
    public static final int f29910c = 5400;

    /* renamed from: c */
    public static final int[] f29911c = {667, 2017, 3367, 4717};

    /* renamed from: d */
    public static final int f29912d = 667;

    /* renamed from: d */
    public static final int[] f29913d = {1000, 2350, 3700, 5050};

    /* renamed from: e */
    public static final int f29914e = 667;

    /* renamed from: f */
    public static final int f29915f = 333;

    /* renamed from: g */
    public static final int f29916g = 333;

    /* renamed from: h */
    public static final int f29917h = -20;

    /* renamed from: i */
    public static final int f29918i = 250;

    /* renamed from: j */
    public static final int f29919j = 1520;

    /* renamed from: a */
    public float f29920a;

    /* renamed from: a */
    public int f29921a = 0;

    /* renamed from: a */
    public ObjectAnimator f29922a;

    /* renamed from: a */
    public final b01 f29923a;

    /* renamed from: a */
    public C2218g6.C2219a f29924a = null;

    /* renamed from: a */
    public final C6774sj f29925a;

    /* renamed from: b */
    public float f29926b;

    /* renamed from: b */
    public ObjectAnimator f29927b;

    /* renamed from: com.onedelhi.secure.hy$a */
    public class C5607a extends AnimatorListenerAdapter {
        public C5607a() {
        }

        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            C5606hy hyVar = C5606hy.this;
            int unused = hyVar.f29921a = (hyVar.f29921a + 4) % C5606hy.this.f29925a.f35100a.length;
        }
    }

    /* renamed from: com.onedelhi.secure.hy$b */
    public class C5608b extends AnimatorListenerAdapter {
        public C5608b() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C5606hy.this.mo37645a();
            C5606hy hyVar = C5606hy.this;
            C2218g6.C2219a aVar = hyVar.f29924a;
            if (aVar != null) {
                aVar.mo11537b(hyVar.f35157a);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.hy$c */
    public class C5609c extends Property<C5606hy, Float> {
        public C5609c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(C5606hy hyVar) {
            return Float.valueOf(hyVar.mo37651o());
        }

        /* renamed from: b */
        public void set(C5606hy hyVar, Float f) {
            hyVar.mo37656t(f.floatValue());
        }
    }

    /* renamed from: com.onedelhi.secure.hy$d */
    public class C5610d extends Property<C5606hy, Float> {
        public C5610d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(C5606hy hyVar) {
            return Float.valueOf(hyVar.mo37652p());
        }

        /* renamed from: b */
        public void set(C5606hy hyVar, Float f) {
            hyVar.mo37657u(f.floatValue());
        }
    }

    static {
        Class<Float> cls = Float.class;
        f29906a = new C5609c(cls, "animationFraction");
        f29908b = new C5610d(cls, "completeEndFraction");
    }

    public C5606hy(@mr2 CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.f29925a = circularProgressIndicatorSpec;
        this.f29923a = new b01();
    }

    /* renamed from: a */
    public void mo37645a() {
        ObjectAnimator objectAnimator = this.f29922a;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: c */
    public void mo37646c() {
        mo37655s();
    }

    /* renamed from: d */
    public void mo37647d(@mr2 C2218g6.C2219a aVar) {
        this.f29924a = aVar;
    }

    /* renamed from: f */
    public void mo37648f() {
        ObjectAnimator objectAnimator = this.f29927b;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            if (this.f35157a.isVisible()) {
                this.f29927b.start();
            } else {
                mo37645a();
            }
        }
    }

    /* renamed from: g */
    public void mo37649g() {
        mo37653q();
        mo37655s();
        this.f29922a.start();
    }

    /* renamed from: h */
    public void mo37650h() {
        this.f29924a = null;
    }

    /* renamed from: o */
    public final float mo37651o() {
        return this.f29920a;
    }

    /* renamed from: p */
    public final float mo37652p() {
        return this.f29926b;
    }

    /* renamed from: q */
    public final void mo37653q() {
        if (this.f29922a == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f29906a, new float[]{0.0f, 1.0f});
            this.f29922a = ofFloat;
            ofFloat.setDuration(5400);
            this.f29922a.setInterpolator((TimeInterpolator) null);
            this.f29922a.setRepeatCount(-1);
            this.f29922a.addListener(new C5607a());
        }
        if (this.f29927b == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f29908b, new float[]{0.0f, 1.0f});
            this.f29927b = ofFloat2;
            ofFloat2.setDuration(333);
            this.f29927b.setInterpolator(this.f29923a);
            this.f29927b.addListener(new C5608b());
        }
    }

    /* renamed from: r */
    public final void mo37654r(int i) {
        int i2 = 0;
        while (i2 < 4) {
            float b = mo44430b(i, f29913d[i2], 333);
            if (b < 0.0f || b > 1.0f) {
                i2++;
            } else {
                int i3 = i2 + this.f29921a;
                int[] iArr = this.f29925a.f35100a;
                int length = i3 % iArr.length;
                int a = oe2.m23715a(iArr[length], this.f35157a.getAlpha());
                int a2 = oe2.m23715a(this.f29925a.f35100a[(length + 1) % iArr.length], this.f35157a.getAlpha());
                this.f35159a[0] = C3678u9.m29188b().evaluate(this.f29923a.getInterpolation(b), Integer.valueOf(a), Integer.valueOf(a2)).intValue();
                return;
            }
        }
    }

    @hw4
    /* renamed from: s */
    public void mo37655s() {
        this.f29921a = 0;
        this.f35159a[0] = oe2.m23715a(this.f29925a.f35100a[0], this.f35157a.getAlpha());
        this.f29926b = 0.0f;
    }

    @hw4
    /* renamed from: t */
    public void mo37656t(float f) {
        this.f29920a = f;
        int i = (int) (f * 5400.0f);
        mo37658v(i);
        mo37654r(i);
        this.f35157a.invalidateSelf();
    }

    /* renamed from: u */
    public final void mo37657u(float f) {
        this.f29926b = f;
    }

    /* renamed from: v */
    public final void mo37658v(int i) {
        float[] fArr = this.f35158a;
        float f = this.f29920a;
        fArr[0] = (f * 1520.0f) - 0.21875f;
        fArr[1] = f * 1520.0f;
        for (int i2 = 0; i2 < 4; i2++) {
            float b = mo44430b(i, f29909b[i2], 667);
            float[] fArr2 = this.f35158a;
            fArr2[1] = fArr2[1] + (this.f29923a.getInterpolation(b) * 250.0f);
            float b2 = mo44430b(i, f29911c[i2], 667);
            float[] fArr3 = this.f35158a;
            fArr3[0] = fArr3[0] + (this.f29923a.getInterpolation(b2) * 250.0f);
        }
        float[] fArr4 = this.f35158a;
        fArr4[0] = fArr4[0] + ((fArr4[1] - fArr4[0]) * this.f29926b);
        fArr4[0] = fArr4[0] / 360.0f;
        fArr4[1] = fArr4[1] / 360.0f;
    }
}
