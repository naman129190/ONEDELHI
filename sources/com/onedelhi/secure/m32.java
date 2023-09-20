package com.onedelhi.secure;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import com.onedelhi.secure.C2218g6;
import com.onedelhi.secure.fd3;
import java.util.Arrays;

public final class m32 extends sp1<ObjectAnimator> {

    /* renamed from: a */
    public static final Property<m32, Float> f31990a = new C6087c(Float.class, "animationFraction");

    /* renamed from: b */
    public static final int f31991b = 1800;

    /* renamed from: b */
    public static final int[] f31992b = {533, 567, 850, 750};

    /* renamed from: c */
    public static final int[] f31993c = {1267, 1000, 333, 0};

    /* renamed from: a */
    public float f31994a;

    /* renamed from: a */
    public int f31995a = 0;

    /* renamed from: a */
    public ObjectAnimator f31996a;

    /* renamed from: a */
    public C2218g6.C2219a f31997a = null;

    /* renamed from: a */
    public final C6774sj f31998a;

    /* renamed from: a */
    public boolean f31999a;

    /* renamed from: a */
    public final Interpolator[] f32000a;

    /* renamed from: b */
    public ObjectAnimator f32001b;

    /* renamed from: com.onedelhi.secure.m32$a */
    public class C6085a extends AnimatorListenerAdapter {
        public C6085a() {
        }

        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            m32 m32 = m32.this;
            int unused = m32.f31995a = (m32.f31995a + 1) % m32.this.f31998a.f35100a.length;
            boolean unused2 = m32.this.f31999a = true;
        }
    }

    /* renamed from: com.onedelhi.secure.m32$b */
    public class C6086b extends AnimatorListenerAdapter {
        public C6086b() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            m32.this.mo37645a();
            m32 m32 = m32.this;
            C2218g6.C2219a aVar = m32.f31997a;
            if (aVar != null) {
                aVar.mo11537b(m32.f35157a);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.m32$c */
    public class C6087c extends Property<m32, Float> {
        public C6087c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(m32 m32) {
            return Float.valueOf(m32.mo40464n());
        }

        /* renamed from: b */
        public void set(m32 m32, Float f) {
            m32.mo40468r(f.floatValue());
        }
    }

    public m32(@mr2 Context context, @mr2 LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(2);
        this.f31998a = linearProgressIndicatorSpec;
        this.f32000a = new Interpolator[]{C2033e7.m13595b(context, fd3.C2151a.linear_indeterminate_line1_head_interpolator), C2033e7.m13595b(context, fd3.C2151a.linear_indeterminate_line1_tail_interpolator), C2033e7.m13595b(context, fd3.C2151a.linear_indeterminate_line2_head_interpolator), C2033e7.m13595b(context, fd3.C2151a.linear_indeterminate_line2_tail_interpolator)};
    }

    /* renamed from: a */
    public void mo37645a() {
        ObjectAnimator objectAnimator = this.f31996a;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: c */
    public void mo37646c() {
        mo40467q();
    }

    /* renamed from: d */
    public void mo37647d(@mr2 C2218g6.C2219a aVar) {
        this.f31997a = aVar;
    }

    /* renamed from: f */
    public void mo37648f() {
        ObjectAnimator objectAnimator = this.f32001b;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            mo37645a();
            if (this.f35157a.isVisible()) {
                this.f32001b.setFloatValues(new float[]{this.f31994a, 1.0f});
                this.f32001b.setDuration((long) ((1.0f - this.f31994a) * 1800.0f));
                this.f32001b.start();
            }
        }
    }

    /* renamed from: g */
    public void mo37649g() {
        mo40465o();
        mo40467q();
        this.f31996a.start();
    }

    /* renamed from: h */
    public void mo37650h() {
        this.f31997a = null;
    }

    /* renamed from: n */
    public final float mo40464n() {
        return this.f31994a;
    }

    /* renamed from: o */
    public final void mo40465o() {
        if (this.f31996a == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f31990a, new float[]{0.0f, 1.0f});
            this.f31996a = ofFloat;
            ofFloat.setDuration(1800);
            this.f31996a.setInterpolator((TimeInterpolator) null);
            this.f31996a.setRepeatCount(-1);
            this.f31996a.addListener(new C6085a());
        }
        if (this.f32001b == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f31990a, new float[]{1.0f});
            this.f32001b = ofFloat2;
            ofFloat2.setDuration(1800);
            this.f32001b.setInterpolator((TimeInterpolator) null);
            this.f32001b.addListener(new C6086b());
        }
    }

    /* renamed from: p */
    public final void mo40466p() {
        if (this.f31999a) {
            Arrays.fill(this.f35159a, oe2.m23715a(this.f31998a.f35100a[this.f31995a], this.f35157a.getAlpha()));
            this.f31999a = false;
        }
    }

    @hw4
    /* renamed from: q */
    public void mo40467q() {
        this.f31995a = 0;
        int a = oe2.m23715a(this.f31998a.f35100a[0], this.f35157a.getAlpha());
        int[] iArr = this.f35159a;
        iArr[0] = a;
        iArr[1] = a;
    }

    @hw4
    /* renamed from: r */
    public void mo40468r(float f) {
        this.f31994a = f;
        mo40469s((int) (f * 1800.0f));
        mo40466p();
        this.f35157a.invalidateSelf();
    }

    /* renamed from: s */
    public final void mo40469s(int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            this.f35158a[i2] = Math.max(0.0f, Math.min(1.0f, this.f32000a[i2].getInterpolation(mo44430b(i, f31993c[i2], f31992b[i2]))));
        }
    }
}
