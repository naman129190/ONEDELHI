package com.onedelhi.secure;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import com.onedelhi.secure.pq0;

public final class a24 extends pq0<a24> {

    /* renamed from: m */
    public static final float f8678m = Float.MAX_VALUE;

    /* renamed from: a */
    public b24 f8679a = null;

    /* renamed from: c */
    public boolean f8680c = false;

    /* renamed from: l */
    public float f8681l = Float.MAX_VALUE;

    public a24(h81 h81) {
        super(h81);
    }

    public <K> a24(K k, c81<K> c81) {
        super(k, c81);
    }

    public <K> a24(K k, c81<K> c81, float f) {
        super(k, c81);
        this.f8679a = new b24(f);
    }

    /* renamed from: A */
    public boolean mo12658A() {
        return this.f8679a.f9621b > 0.0d;
    }

    /* renamed from: B */
    public b24 mo12659B() {
        return this.f8679a;
    }

    /* renamed from: C */
    public final void mo12660C() {
        b24 b24 = this.f8679a;
        if (b24 != null) {
            double d = (double) b24.mo13386d();
            if (d > ((double) this.f18672c)) {
                throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
            } else if (d < ((double) this.f18673d)) {
                throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
            }
        } else {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
    }

    /* renamed from: D */
    public a24 mo12661D(b24 b24) {
        this.f8679a = b24;
        return this;
    }

    /* renamed from: E */
    public void mo12662E() {
        if (!mo12658A()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        } else if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        } else if (this.f18671b) {
            this.f8680c = true;
        }
    }

    /* renamed from: f */
    public float mo12663f(float f, float f2) {
        return this.f8679a.mo13383a(f, f2);
    }

    /* renamed from: j */
    public boolean mo12664j(float f, float f2) {
        return this.f8679a.mo13384b(f, f2);
    }

    /* renamed from: v */
    public void mo12665v(float f) {
    }

    /* renamed from: w */
    public void mo12666w() {
        mo12660C();
        this.f8679a.mo13392j((double) mo22538i());
        super.mo12666w();
    }

    /* renamed from: y */
    public boolean mo12667y(long j) {
        long j2;
        double d;
        double d2;
        b24 b24;
        if (this.f8680c) {
            float f = this.f8681l;
            if (f != Float.MAX_VALUE) {
                this.f8679a.mo13390h(f);
                this.f8681l = Float.MAX_VALUE;
            }
            this.f18669b = this.f8679a.mo13386d();
            this.f18663a = 0.0f;
            this.f8680c = false;
            return true;
        }
        if (this.f8681l != Float.MAX_VALUE) {
            this.f8679a.mo13386d();
            j2 = j / 2;
            pq0.C3177p k = this.f8679a.mo13393k((double) this.f18669b, (double) this.f18663a, j2);
            this.f8679a.mo13390h(this.f8681l);
            this.f8681l = Float.MAX_VALUE;
            b24 = this.f8679a;
            d2 = (double) k.f18677a;
            d = (double) k.f18678b;
        } else {
            b24 = this.f8679a;
            d2 = (double) this.f18669b;
            d = (double) this.f18663a;
            j2 = j;
        }
        pq0.C3177p k2 = b24.mo13393k(d2, d, j2);
        this.f18669b = k2.f18677a;
        this.f18663a = k2.f18678b;
        float max = Math.max(this.f18669b, this.f18673d);
        this.f18669b = max;
        float min = Math.min(max, this.f18672c);
        this.f18669b = min;
        if (!mo12664j(min, this.f18663a)) {
            return false;
        }
        this.f18669b = this.f8679a.mo13386d();
        this.f18663a = 0.0f;
        return true;
    }

    /* renamed from: z */
    public void mo12668z(float f) {
        if (mo22539k()) {
            this.f8681l = f;
            return;
        }
        if (this.f8679a == null) {
            this.f8679a = new b24(f);
        }
        this.f8679a.mo13390h(f);
        mo12666w();
    }
}
