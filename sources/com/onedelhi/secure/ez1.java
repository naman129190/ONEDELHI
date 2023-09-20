package com.onedelhi.secure;

import android.graphics.PointF;
import android.view.animation.Interpolator;

public class ez1<T> {

    /* renamed from: c */
    public static final int f11767c = 784923401;

    /* renamed from: f */
    public static final float f11768f = -3987645.8f;

    /* renamed from: a */
    public final float f11769a;

    /* renamed from: a */
    public int f11770a;

    /* renamed from: a */
    public PointF f11771a;
    @ts2

    /* renamed from: a */
    public final Interpolator f11772a;
    @ts2

    /* renamed from: a */
    public final la2 f11773a;
    @ts2

    /* renamed from: a */
    public Float f11774a;
    @ts2

    /* renamed from: a */
    public final T f11775a;

    /* renamed from: b */
    public float f11776b;

    /* renamed from: b */
    public int f11777b;

    /* renamed from: b */
    public PointF f11778b;
    @ts2

    /* renamed from: b */
    public T f11779b;

    /* renamed from: c */
    public float f11780c;

    /* renamed from: d */
    public float f11781d;

    /* renamed from: e */
    public float f11782e;

    public ez1(la2 la2, @ts2 T t, @ts2 T t2, @ts2 Interpolator interpolator, float f, @ts2 Float f2) {
        this.f11776b = -3987645.8f;
        this.f11780c = -3987645.8f;
        this.f11770a = f11767c;
        this.f11777b = f11767c;
        this.f11781d = Float.MIN_VALUE;
        this.f11782e = Float.MIN_VALUE;
        this.f11771a = null;
        this.f11778b = null;
        this.f11773a = la2;
        this.f11775a = t;
        this.f11779b = t2;
        this.f11772a = interpolator;
        this.f11769a = f;
        this.f11774a = f2;
    }

    public ez1(T t) {
        this.f11776b = -3987645.8f;
        this.f11780c = -3987645.8f;
        this.f11770a = f11767c;
        this.f11777b = f11767c;
        this.f11781d = Float.MIN_VALUE;
        this.f11782e = Float.MIN_VALUE;
        this.f11771a = null;
        this.f11778b = null;
        this.f11773a = null;
        this.f11775a = t;
        this.f11779b = t;
        this.f11772a = null;
        this.f11769a = Float.MIN_VALUE;
        this.f11774a = Float.valueOf(Float.MAX_VALUE);
    }

    /* renamed from: a */
    public boolean mo15658a(@d81(from = 0.0d, mo14561to = 1.0d) float f) {
        return f >= mo15662e() && f < mo15659b();
    }

    /* renamed from: b */
    public float mo15659b() {
        if (this.f11773a == null) {
            return 1.0f;
        }
        if (this.f11782e == Float.MIN_VALUE) {
            if (this.f11774a == null) {
                this.f11782e = 1.0f;
            } else {
                this.f11782e = mo15662e() + ((this.f11774a.floatValue() - this.f11769a) / this.f11773a.mo19376e());
            }
        }
        return this.f11782e;
    }

    /* renamed from: c */
    public float mo15660c() {
        if (this.f11780c == -3987645.8f) {
            this.f11780c = ((Float) this.f11779b).floatValue();
        }
        return this.f11780c;
    }

    /* renamed from: d */
    public int mo15661d() {
        if (this.f11777b == 784923401) {
            this.f11777b = ((Integer) this.f11779b).intValue();
        }
        return this.f11777b;
    }

    /* renamed from: e */
    public float mo15662e() {
        la2 la2 = this.f11773a;
        if (la2 == null) {
            return 0.0f;
        }
        if (this.f11781d == Float.MIN_VALUE) {
            this.f11781d = (this.f11769a - la2.mo19387p()) / this.f11773a.mo19376e();
        }
        return this.f11781d;
    }

    /* renamed from: f */
    public float mo15663f() {
        if (this.f11776b == -3987645.8f) {
            this.f11776b = ((Float) this.f11775a).floatValue();
        }
        return this.f11776b;
    }

    /* renamed from: g */
    public int mo15664g() {
        if (this.f11770a == 784923401) {
            this.f11770a = ((Integer) this.f11775a).intValue();
        }
        return this.f11770a;
    }

    /* renamed from: h */
    public boolean mo15665h() {
        return this.f11772a == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f11775a + ", endValue=" + this.f11779b + ", startFrame=" + this.f11769a + ", endFrame=" + this.f11774a + ", interpolator=" + this.f11772a + '}';
    }
}
