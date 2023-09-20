package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.database.SQLException;
import android.os.SystemClock;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class ri3 {

    /* renamed from: c */
    public static final int f34639c = 1000;

    /* renamed from: d */
    public static final int f34640d = 60000;

    /* renamed from: e */
    public static final int f34641e = 3600000;

    /* renamed from: f */
    public static final int f34642f = 2000;

    /* renamed from: a */
    public final double f34643a;

    /* renamed from: a */
    public final int f34644a;

    /* renamed from: a */
    public final long f34645a;

    /* renamed from: a */
    public final tu2 f34646a;

    /* renamed from: a */
    public final vh4<pa0> f34647a;

    /* renamed from: a */
    public final BlockingQueue<Runnable> f34648a;

    /* renamed from: a */
    public final ThreadPoolExecutor f34649a;

    /* renamed from: b */
    public final double f34650b;

    /* renamed from: b */
    public int f34651b;

    /* renamed from: b */
    public final long f34652b;

    /* renamed from: c */
    public long f34653c;

    /* renamed from: com.onedelhi.secure.ri3$b */
    public final class C6702b implements Runnable {

        /* renamed from: a */
        public final eb0 f34654a;

        /* renamed from: a */
        public final x94<eb0> f34656a;

        public C6702b(eb0 eb0, x94<eb0> x94) {
            this.f34654a = eb0;
            this.f34656a = x94;
        }

        public void run() {
            ri3.this.mo43911p(this.f34654a, this.f34656a);
            ri3.this.f34646a.mo45315e();
            double e = ri3.this.mo43904g();
            o92 f = o92.m59120f();
            f.mo41613b("Delay for: " + String.format(Locale.US, "%.2f", new Object[]{Double.valueOf(e / 1000.0d)}) + " s for report: " + this.f34654a.mo35009d());
            ri3.m63661q(e);
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public ri3(double d, double d2, long j, vh4<pa0> vh4, tu2 tu2) {
        this.f34643a = d;
        this.f34650b = d2;
        this.f34645a = j;
        this.f34647a = vh4;
        this.f34646a = tu2;
        this.f34652b = SystemClock.elapsedRealtime();
        int i = (int) d;
        this.f34644a = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f34648a = arrayBlockingQueue;
        this.f34649a = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f34651b = 0;
        this.f34653c = 0;
    }

    public ri3(vh4<pa0> vh4, jv3 jv3, tu2 tu2) {
        this(jv3.f30950a, jv3.f30955b, ((long) jv3.f30957c) * 1000, vh4, tu2);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m63659m(CountDownLatch countDownLatch) {
        try {
            da1.m13015a(this.f34647a, d53.HIGHEST);
        } catch (SQLException unused) {
        }
        countDownLatch.countDown();
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m63660n(x94 x94, boolean z, eb0 eb0, Exception exc) {
        if (exc != null) {
            x94.mo26838d(exc);
            return;
        }
        if (z) {
            mo43907j();
        }
        x94.mo26839e(eb0);
    }

    /* renamed from: q */
    public static void m63661q(double d) {
        try {
            Thread.sleep((long) d);
        } catch (InterruptedException unused) {
        }
    }

    /* renamed from: g */
    public final double mo43904g() {
        return Math.min(3600000.0d, (60000.0d / this.f34643a) * Math.pow(this.f34650b, (double) mo43905h()));
    }

    /* renamed from: h */
    public final int mo43905h() {
        if (this.f34653c == 0) {
            this.f34653c = mo43910o();
        }
        int o = (int) ((mo43910o() - this.f34653c) / this.f34645a);
        int min = mo43909l() ? Math.min(100, this.f34651b + o) : Math.max(0, this.f34651b - o);
        if (this.f34651b != min) {
            this.f34651b = min;
            this.f34653c = mo43910o();
        }
        return min;
    }

    /* renamed from: i */
    public x94<eb0> mo43906i(eb0 eb0, boolean z) {
        synchronized (this.f34648a) {
            x94<eb0> x94 = new x94<>();
            if (z) {
                this.f34646a.mo45314d();
                if (mo43908k()) {
                    o92 f = o92.m59120f();
                    f.mo41613b("Enqueueing report: " + eb0.mo35009d());
                    o92 f2 = o92.m59120f();
                    f2.mo41613b("Queue size: " + this.f34648a.size());
                    this.f34649a.execute(new C6702b(eb0, x94));
                    o92 f3 = o92.m59120f();
                    f3.mo41613b("Closing task for report: " + eb0.mo35009d());
                    x94.mo26839e(eb0);
                    return x94;
                }
                mo43905h();
                o92 f4 = o92.m59120f();
                f4.mo41613b("Dropping report due to queue being full: " + eb0.mo35009d());
                this.f34646a.mo45313c();
                x94.mo26839e(eb0);
                return x94;
            }
            mo43911p(eb0, x94);
            return x94;
        }
    }

    @SuppressLint({"DiscouragedApi", "ThreadPoolCreation"})
    /* renamed from: j */
    public void mo43907j() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new qi3(this, countDownLatch)).start();
        zq4.m74243g(countDownLatch, 2, TimeUnit.SECONDS);
    }

    /* renamed from: k */
    public final boolean mo43908k() {
        return this.f34648a.size() < this.f34644a;
    }

    /* renamed from: l */
    public final boolean mo43909l() {
        return this.f34648a.size() == this.f34644a;
    }

    /* renamed from: o */
    public final long mo43910o() {
        return System.currentTimeMillis();
    }

    /* renamed from: p */
    public final void mo43911p(eb0 eb0, x94<eb0> x94) {
        o92 f = o92.m59120f();
        f.mo41613b("Sending report through Google DataTransport: " + eb0.mo35009d());
        this.f34647a.mo13727b(qv0.m26192i(eb0.mo35007b()), new pi3(this, x94, SystemClock.elapsedRealtime() - this.f34652b < 2000, eb0));
    }
}
