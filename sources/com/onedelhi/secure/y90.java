package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class y90 {

    /* renamed from: a */
    public static final int f37836a = -1;

    /* renamed from: a */
    public static final C7012v5 f37837a = C7012v5.m67717e();

    /* renamed from: b */
    public static final int f37838b = -1;

    /* renamed from: c */
    public static final int f37839c = 13;

    /* renamed from: c */
    public static final long f37840c = -1;

    /* renamed from: d */
    public static final int f37841d = 14;

    /* renamed from: d */
    public static final long f37842d = TimeUnit.SECONDS.toMicros(1);

    /* renamed from: e */
    public static final int f37843e = 15;

    /* renamed from: f */
    public static final int f37844f = 16;

    /* renamed from: a */
    public final long f37845a;

    /* renamed from: a */
    public final String f37846a;

    /* renamed from: a */
    public final ConcurrentLinkedQueue<z90> f37847a;

    /* renamed from: a */
    public final ScheduledExecutorService f37848a;
    @ts2

    /* renamed from: a */
    public ScheduledFuture f37849a;

    /* renamed from: b */
    public long f37850b;

    @SuppressLint({"ThreadPoolCreation"})
    public y90() {
        this.f37849a = null;
        this.f37850b = -1;
        this.f37847a = new ConcurrentLinkedQueue<>();
        this.f37848a = Executors.newSingleThreadScheduledExecutor();
        int myPid = Process.myPid();
        this.f37846a = "/proc/" + Integer.toString(myPid) + "/stat";
        this.f37845a = mo47648e();
    }

    @hw4
    public y90(ScheduledExecutorService scheduledExecutorService, String str, long j) {
        this.f37849a = null;
        this.f37850b = -1;
        this.f37847a = new ConcurrentLinkedQueue<>();
        this.f37848a = scheduledExecutorService;
        this.f37846a = str;
        this.f37845a = j;
    }

    /* renamed from: f */
    public static boolean m71413f(long j) {
        return j <= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m71414g(qe4 qe4) {
        z90 m = mo47653m(qe4);
        if (m != null) {
            this.f37847a.add(m);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m71415h(qe4 qe4) {
        z90 m = mo47653m(qe4);
        if (m != null) {
            this.f37847a.add(m);
        }
    }

    /* renamed from: c */
    public void mo47646c(qe4 qe4) {
        mo47649i(qe4);
    }

    /* renamed from: d */
    public final long mo47647d(long j) {
        return Math.round((((double) j) / ((double) this.f37845a)) * ((double) f37842d));
    }

    /* renamed from: e */
    public final long mo47648e() {
        return Os.sysconf(OsConstants._SC_CLK_TCK);
    }

    /* renamed from: i */
    public final synchronized void mo47649i(qe4 qe4) {
        try {
            this.f37848a.schedule(new w90(this, qe4), 0, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            C7012v5 v5Var = f37837a;
            v5Var.mo46010l("Unable to collect Cpu Metric: " + e.getMessage());
        }
        return;
    }

    /* renamed from: j */
    public final synchronized void mo47650j(long j, qe4 qe4) {
        this.f37850b = j;
        try {
            this.f37849a = this.f37848a.scheduleAtFixedRate(new x90(this, qe4), 0, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            C7012v5 v5Var = f37837a;
            v5Var.mo46010l("Unable to start collecting Cpu Metrics: " + e.getMessage());
        }
        return;
    }

    /* renamed from: k */
    public void mo47651k(long j, qe4 qe4) {
        long j2 = this.f37845a;
        if (j2 != -1 && j2 != 0 && !m71413f(j)) {
            if (this.f37849a == null) {
                mo47650j(j, qe4);
            } else if (this.f37850b != j) {
                mo47652l();
                mo47650j(j, qe4);
            }
        }
    }

    /* renamed from: l */
    public void mo47652l() {
        ScheduledFuture scheduledFuture = this.f37849a;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f37849a = null;
            this.f37850b = -1;
        }
    }

    @ts2
    /* renamed from: m */
    public final z90 mo47653m(qe4 qe4) {
        String str;
        StringBuilder sb;
        C7012v5 v5Var;
        BufferedReader bufferedReader;
        if (qe4 == null) {
            return null;
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(this.f37846a));
            long b = qe4.mo43507b();
            String[] split = bufferedReader.readLine().split(" ");
            long parseLong = Long.parseLong(split[13]);
            long parseLong2 = Long.parseLong(split[15]);
            z90 z90 = (z90) z90.m72670qk().mo48177Jj(b).mo48178Kj(mo47647d(Long.parseLong(split[14]) + Long.parseLong(split[16]))).mo48179Lj(mo47647d(parseLong + parseLong2)).mo43381ab();
            bufferedReader.close();
            return z90;
        } catch (IOException e) {
            v5Var = f37837a;
            sb = new StringBuilder();
            sb.append("Unable to read 'proc/[pid]/stat' file: ");
            str = e.getMessage();
            sb.append(str);
            v5Var.mo46010l(sb.toString());
            return null;
        } catch (ArrayIndexOutOfBoundsException | NullPointerException | NumberFormatException e2) {
            v5Var = f37837a;
            sb = new StringBuilder();
            sb.append("Unexpected '/proc/[pid]/stat' file format encountered: ");
            str = e2.getMessage();
            sb.append(str);
            v5Var.mo46010l(sb.toString());
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
