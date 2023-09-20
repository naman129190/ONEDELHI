package com.onedelhi.secure;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.config.C4336a;
import com.onedelhi.secure.g60;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public final class ff3 {

    /* renamed from: a */
    public final float f28407a;

    /* renamed from: a */
    public final C4336a f28408a;

    /* renamed from: a */
    public C5263a f28409a;

    /* renamed from: a */
    public boolean f28410a;

    /* renamed from: b */
    public final float f28411b;

    /* renamed from: b */
    public C5263a f28412b;

    /* renamed from: com.onedelhi.secure.ff3$a */
    public static class C5263a {

        /* renamed from: a */
        public static final C7012v5 f28413a = C7012v5.m67717e();

        /* renamed from: d */
        public static final long f28414d = TimeUnit.SECONDS.toMicros(1);

        /* renamed from: a */
        public double f28415a;

        /* renamed from: a */
        public long f28416a;

        /* renamed from: a */
        public final C5068dz f28417a;

        /* renamed from: a */
        public ef3 f28418a;

        /* renamed from: a */
        public qe4 f28419a;

        /* renamed from: a */
        public final boolean f28420a;

        /* renamed from: b */
        public long f28421b;

        /* renamed from: b */
        public ef3 f28422b;

        /* renamed from: c */
        public long f28423c;

        /* renamed from: c */
        public ef3 f28424c;

        public C5263a(ef3 ef3, long j, C5068dz dzVar, C4336a aVar, @yk3 String str, boolean z) {
            this.f28417a = dzVar;
            this.f28416a = j;
            this.f28418a = ef3;
            this.f28415a = (double) j;
            this.f28419a = dzVar.mo34720a();
            mo35916m(aVar, str, z);
            this.f28420a = z;
        }

        /* renamed from: e */
        public static long m47832e(C4336a aVar, @yk3 String str) {
            return str == "Trace" ? aVar.mo29855G() : aVar.mo29885r();
        }

        /* renamed from: f */
        public static long m47833f(C4336a aVar, @yk3 String str) {
            return str == "Trace" ? aVar.mo29888u() : aVar.mo29888u();
        }

        /* renamed from: g */
        public static long m47834g(C4336a aVar, @yk3 String str) {
            return str == "Trace" ? aVar.mo29856H() : aVar.mo29886s();
        }

        /* renamed from: h */
        public static long m47835h(C4336a aVar, @yk3 String str) {
            return str == "Trace" ? aVar.mo29888u() : aVar.mo29888u();
        }

        /* renamed from: a */
        public synchronized void mo35908a(boolean z) {
            this.f28418a = z ? this.f28422b : this.f28424c;
            this.f28416a = z ? this.f28421b : this.f28423c;
        }

        /* renamed from: b */
        public synchronized boolean mo35909b(@mr2 d13 d13) {
            boolean z;
            qe4 a = this.f28417a.mo34720a();
            double d = (((double) this.f28419a.mo43509d(a)) * this.f28418a.mo35225a()) / ((double) f28414d);
            if (d > 0.0d) {
                this.f28415a = Math.min(this.f28415a + d, (double) this.f28416a);
                this.f28419a = a;
            }
            double d2 = this.f28415a;
            if (d2 >= 1.0d) {
                this.f28415a = d2 - 1.0d;
                z = true;
            } else {
                if (this.f28420a) {
                    f28413a.mo46010l("Exceeded log rate limit, dropping the log.");
                }
                z = false;
            }
            return z;
        }

        @VisibleForTesting
        /* renamed from: c */
        public long mo35910c() {
            return this.f28423c;
        }

        @VisibleForTesting
        /* renamed from: d */
        public ef3 mo35911d() {
            return this.f28424c;
        }

        @VisibleForTesting
        /* renamed from: i */
        public long mo35912i() {
            return this.f28421b;
        }

        @VisibleForTesting
        /* renamed from: j */
        public ef3 mo35913j() {
            return this.f28422b;
        }

        @VisibleForTesting
        /* renamed from: k */
        public ef3 mo35914k() {
            return this.f28418a;
        }

        @VisibleForTesting
        /* renamed from: l */
        public void mo35915l(ef3 ef3) {
            this.f28418a = ef3;
        }

        /* renamed from: m */
        public final void mo35916m(C4336a aVar, @yk3 String str, boolean z) {
            long h = m47835h(aVar, str);
            long g = m47834g(aVar, str);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            ef3 ef3 = new ef3(g, h, timeUnit);
            this.f28422b = ef3;
            this.f28421b = g;
            if (z) {
                f28413a.mo46001b("Foreground %s logging rate:%f, burst capacity:%d", str, ef3, Long.valueOf(g));
            }
            long f = m47833f(aVar, str);
            long e = m47832e(aVar, str);
            ef3 ef32 = new ef3(e, f, timeUnit);
            this.f28424c = ef32;
            this.f28423c = e;
            if (z) {
                f28413a.mo46001b("Background %s logging rate:%f, capacity:%d", str, ef32, Long.valueOf(e));
            }
        }
    }

    public ff3(@mr2 Context context, ef3 ef3, long j) {
        this(ef3, j, new C5068dz(), m47819e(), m47819e(), C4336a.m34908h());
        this.f28410a = br4.m40322c(context);
    }

    public ff3(ef3 ef3, long j, C5068dz dzVar, float f, float f2, C4336a aVar) {
        float f3 = f;
        float f4 = f2;
        this.f28409a = null;
        this.f28412b = null;
        boolean z = false;
        this.f28410a = false;
        br4.m40321b(0.0f <= f3 && f3 < 1.0f, "Sampling bucket ID should be in range [0.0f, 1.0f).");
        if (0.0f <= f4 && f4 < 1.0f) {
            z = true;
        }
        br4.m40321b(z, "Fragment sampling bucket ID should be in range [0.0f, 1.0f).");
        this.f28407a = f3;
        this.f28411b = f4;
        this.f28408a = aVar;
        ef3 ef32 = ef3;
        long j2 = j;
        C5068dz dzVar2 = dzVar;
        C4336a aVar2 = aVar;
        this.f28409a = new C5263a(ef32, j2, dzVar2, aVar2, "Trace", this.f28410a);
        this.f28412b = new C5263a(ef32, j2, dzVar2, aVar2, yk3.f37988c0, this.f28410a);
    }

    @VisibleForTesting
    /* renamed from: e */
    public static float m47819e() {
        return new Random().nextFloat();
    }

    /* renamed from: a */
    public void mo35896a(boolean z) {
        this.f28409a.mo35908a(z);
        this.f28412b.mo35908a(z);
    }

    @VisibleForTesting
    /* renamed from: b */
    public boolean mo35897b() {
        return mo35901g();
    }

    @VisibleForTesting
    /* renamed from: c */
    public boolean mo35898c() {
        return mo35902h();
    }

    @VisibleForTesting
    /* renamed from: d */
    public boolean mo35899d() {
        return mo35903i();
    }

    /* renamed from: f */
    public final boolean mo35900f(List<h13> list) {
        return list.size() > 0 && list.get(0).mo37122Te() > 0 && list.get(0).mo37123j4(0) == zu3.f38438b;
    }

    /* renamed from: g */
    public final boolean mo35901g() {
        return this.f28411b < this.f28408a.mo29875g();
    }

    /* renamed from: h */
    public final boolean mo35902h() {
        return this.f28407a < this.f28408a.mo29887t();
    }

    /* renamed from: i */
    public final boolean mo35903i() {
        return this.f28407a < this.f28408a.mo29857I();
    }

    /* renamed from: j */
    public boolean mo35904j(d13 d13) {
        if (!mo35907m(d13)) {
            return false;
        }
        if (d13.mo34082r5()) {
            return !this.f28412b.mo35909b(d13);
        }
        if (d13.mo34076bd()) {
            return !this.f28409a.mo35909b(d13);
        }
        return true;
    }

    /* renamed from: k */
    public boolean mo35905k(d13 d13) {
        if (d13.mo34076bd() && !mo35903i() && !mo35900f(d13.mo34077f5().mo35283H0())) {
            return false;
        }
        if (!mo35906l(d13) || mo35901g() || mo35900f(d13.mo34077f5().mo35283H0())) {
            return !d13.mo34082r5() || mo35902h() || mo35900f(d13.mo34080ng().mo41325H0());
        }
        return false;
    }

    /* renamed from: l */
    public boolean mo35906l(d13 d13) {
        return d13.mo34076bd() && d13.mo34077f5().getName().startsWith(g60.f28962c) && d13.mo34077f5().mo35291N(g60.f28966e);
    }

    /* renamed from: m */
    public boolean mo35907m(@mr2 d13 d13) {
        return (!d13.mo34076bd() || ((!d13.mo34077f5().getName().equals(g60.C5363b.FOREGROUND_TRACE_NAME.toString()) && !d13.mo34077f5().getName().equals(g60.C5363b.BACKGROUND_TRACE_NAME.toString())) || d13.mo34077f5().mo35319fe() <= 0)) && !d13.mo34070R7();
    }
}
