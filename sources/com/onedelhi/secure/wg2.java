package com.onedelhi.secure;

import android.annotation.SuppressLint;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class wg2 {

    /* renamed from: a */
    public static final int f36985a = -1;

    /* renamed from: a */
    public static final C7012v5 f36986a = C7012v5.m67717e();

    /* renamed from: b */
    public static final long f36987b = -1;

    /* renamed from: a */
    public long f36988a;

    /* renamed from: a */
    public final Runtime f36989a;

    /* renamed from: a */
    public final ConcurrentLinkedQueue<C7132w5> f36990a;

    /* renamed from: a */
    public final ScheduledExecutorService f36991a;
    @ts2

    /* renamed from: a */
    public ScheduledFuture f36992a;

    @SuppressLint({"ThreadPoolCreation"})
    public wg2() {
        this(Executors.newSingleThreadScheduledExecutor(), Runtime.getRuntime());
    }

    @hw4
    public wg2(ScheduledExecutorService scheduledExecutorService, Runtime runtime) {
        this.f36992a = null;
        this.f36988a = -1;
        this.f36991a = scheduledExecutorService;
        this.f36990a = new ConcurrentLinkedQueue<>();
        this.f36989a = runtime;
    }

    /* renamed from: e */
    public static boolean m69339e(long j) {
        return j <= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m69340f(qe4 qe4) {
        C7132w5 l = mo46726l(qe4);
        if (l != null) {
            this.f36990a.add(l);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m69341g(qe4 qe4) {
        C7132w5 l = mo46726l(qe4);
        if (l != null) {
            this.f36990a.add(l);
        }
    }

    /* renamed from: c */
    public void mo46720c(qe4 qe4) {
        mo46722h(qe4);
    }

    /* renamed from: d */
    public final int mo46721d() {
        return br4.m40323d(d44.BYTES.mo34221g(this.f36989a.totalMemory() - this.f36989a.freeMemory()));
    }

    /* renamed from: h */
    public final synchronized void mo46722h(qe4 qe4) {
        try {
            this.f36991a.schedule(new vg2(this, qe4), 0, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            C7012v5 v5Var = f36986a;
            v5Var.mo46010l("Unable to collect Memory Metric: " + e.getMessage());
        }
        return;
    }

    /* renamed from: i */
    public final synchronized void mo46723i(long j, qe4 qe4) {
        this.f36988a = j;
        try {
            this.f36992a = this.f36991a.scheduleAtFixedRate(new ug2(this, qe4), 0, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            C7012v5 v5Var = f36986a;
            v5Var.mo46010l("Unable to start collecting Memory Metrics: " + e.getMessage());
        }
        return;
    }

    /* renamed from: j */
    public void mo46724j(long j, qe4 qe4) {
        if (!m69339e(j)) {
            if (this.f36992a == null) {
                mo46723i(j, qe4);
            } else if (this.f36988a != j) {
                mo46725k();
                mo46723i(j, qe4);
            }
        }
    }

    /* renamed from: k */
    public void mo46725k() {
        ScheduledFuture scheduledFuture = this.f36992a;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f36992a = null;
            this.f36988a = -1;
        }
    }

    @ts2
    /* renamed from: l */
    public final C7132w5 mo46726l(qe4 qe4) {
        if (qe4 == null) {
            return null;
        }
        return (C7132w5) C7132w5.m68830nk().mo46548Ij(qe4.mo43507b()).mo46549Jj(mo46721d()).mo43381ab();
    }
}
