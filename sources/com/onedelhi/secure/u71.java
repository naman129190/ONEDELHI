package com.onedelhi.secure;

import com.onedelhi.secure.pq0;

public final class u71 extends pq0<u71> {

    /* renamed from: a */
    public final C3669a f21223a;

    /* renamed from: com.onedelhi.secure.u71$a */
    public static final class C3669a implements ca1 {

        /* renamed from: c */
        public static final float f21224c = -4.2f;

        /* renamed from: d */
        public static final float f21225d = 62.5f;

        /* renamed from: a */
        public float f21226a = -4.2f;

        /* renamed from: a */
        public final pq0.C3177p f21227a = new pq0.C3177p();

        /* renamed from: b */
        public float f21228b;

        /* renamed from: a */
        public float mo13383a(float f, float f2) {
            return f2 * this.f21226a;
        }

        /* renamed from: b */
        public boolean mo13384b(float f, float f2) {
            return Math.abs(f2) < this.f21228b;
        }

        /* renamed from: c */
        public float mo25389c() {
            return this.f21226a / -4.2f;
        }

        /* renamed from: d */
        public void mo25390d(float f) {
            this.f21226a = f * -4.2f;
        }

        /* renamed from: e */
        public void mo25391e(float f) {
            this.f21228b = f * 62.5f;
        }

        /* renamed from: f */
        public pq0.C3177p mo25392f(float f, float f2, long j) {
            float f3 = (float) j;
            this.f21227a.f18678b = (float) (((double) f2) * Math.exp((double) ((f3 / 1000.0f) * this.f21226a)));
            pq0.C3177p pVar = this.f21227a;
            float f4 = this.f21226a;
            pVar.f18677a = (float) (((double) (f - (f2 / f4))) + (((double) (f2 / f4)) * Math.exp((double) ((f4 * f3) / 1000.0f))));
            pq0.C3177p pVar2 = this.f21227a;
            if (mo13384b(pVar2.f18677a, pVar2.f18678b)) {
                this.f21227a.f18678b = 0.0f;
            }
            return this.f21227a;
        }
    }

    public u71(h81 h81) {
        super(h81);
        C3669a aVar = new C3669a();
        this.f21223a = aVar;
        aVar.mo25391e(mo22538i());
    }

    public <K> u71(K k, c81<K> c81) {
        super(k, c81);
        C3669a aVar = new C3669a();
        this.f21223a = aVar;
        aVar.mo25391e(mo22538i());
    }

    /* renamed from: A */
    public u71 mo25384A(@d81(from = 0.0d, fromInclusive = false) float f) {
        if (f > 0.0f) {
            this.f21223a.mo25390d(f);
            return this;
        }
        throw new IllegalArgumentException("Friction must be positive");
    }

    /* renamed from: B */
    public u71 mo22542p(float f) {
        super.mo22542p(f);
        return this;
    }

    /* renamed from: C */
    public u71 mo22543q(float f) {
        super.mo22543q(f);
        return this;
    }

    /* renamed from: D */
    public u71 mo22547u(float f) {
        super.mo22547u(f);
        return this;
    }

    /* renamed from: f */
    public float mo12663f(float f, float f2) {
        return this.f21223a.mo13383a(f, f2);
    }

    /* renamed from: j */
    public boolean mo12664j(float f, float f2) {
        return f >= this.f18672c || f <= this.f18673d || this.f21223a.mo13384b(f, f2);
    }

    /* renamed from: v */
    public void mo12665v(float f) {
        this.f21223a.mo25391e(f);
    }

    /* renamed from: y */
    public boolean mo12667y(long j) {
        pq0.C3177p f = this.f21223a.mo25392f(this.f18669b, this.f18663a, j);
        float f2 = f.f18677a;
        this.f18669b = f2;
        float f3 = f.f18678b;
        this.f18663a = f3;
        float f4 = this.f18673d;
        if (f2 < f4) {
            this.f18669b = f4;
            return true;
        }
        float f5 = this.f18672c;
        if (f2 <= f5) {
            return mo12664j(f2, f3);
        }
        this.f18669b = f5;
        return true;
    }

    /* renamed from: z */
    public float mo25388z() {
        return this.f21223a.mo25389c();
    }
}
