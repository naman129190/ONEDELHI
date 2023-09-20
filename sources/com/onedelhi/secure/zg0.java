package com.onedelhi.secure;

import com.onedelhi.secure.wv0;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\bÀ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b(\u0010\u0015J\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0014J\b\u0010\f\u001a\u00020\u0005H\u0016J$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00072\n\u0010\u000e\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\u000f\u0010\u0014\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0007J\b\u0010\u0018\u001a\u00020\u0005H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0002J\b\u0010\u001d\u001a\u00020\u0005H\u0002R\u0014\u0010 \u001a\u00020\u00198TX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\u001b8@X\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u001b8BX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\"R\u0014\u0010'\u001a\u00020\u001b8BX\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\"¨\u0006)"}, d2 = {"Lcom/onedelhi/secure/zg0;", "Lcom/onedelhi/secure/wv0;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "task", "Lcom/onedelhi/secure/un4;", "M1", "", "now", "Lcom/onedelhi/secure/wv0$c;", "delayedTask", "E1", "shutdown", "timeMillis", "block", "Lcom/onedelhi/secure/b90;", "context", "Lcom/onedelhi/secure/fn0;", "M0", "run", "w2", "()V", "timeout", "N2", "M2", "Ljava/lang/Thread;", "o2", "", "L2", "j2", "D1", "()Ljava/lang/Thread;", "thread", "K2", "()Z", "isThreadPresent", "C2", "isShutDown", "E2", "isShutdownRequested", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class zg0 extends wv0 implements Runnable {
    @ss2
    private static volatile Thread _thread = null;
    @vr2

    /* renamed from: a */
    public static final zg0 f38333a;
    @vr2

    /* renamed from: b */
    public static final String f38334b = "kotlinx.coroutines.DefaultExecutor";

    /* renamed from: c */
    public static final long f38335c = 1000;

    /* renamed from: d */
    public static final long f38336d;
    private static volatile int debugStatus = 0;

    /* renamed from: n */
    public static final int f38337n = 0;

    /* renamed from: o */
    public static final int f38338o = 1;

    /* renamed from: p */
    public static final int f38339p = 2;

    /* renamed from: q */
    public static final int f38340q = 3;

    /* renamed from: r */
    public static final int f38341r = 4;

    static {
        Long l;
        zg0 zg0 = new zg0();
        f38333a = zg0;
        vv0.m68522p1(zg0, false, 1, (Object) null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f38336d = timeUnit.toNanos(l.longValue());
    }

    /* renamed from: x2 */
    public static /* synthetic */ void m73194x2() {
    }

    /* renamed from: C2 */
    public final boolean mo48261C2() {
        return debugStatus == 4;
    }

    @vr2
    /* renamed from: D1 */
    public Thread mo36144D1() {
        Thread thread = _thread;
        return thread == null ? mo48268o2() : thread;
    }

    /* renamed from: E1 */
    public void mo47396E1(long j, @vr2 wv0.C7189c cVar) {
        mo48265M2();
    }

    /* renamed from: E2 */
    public final boolean mo48262E2() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    /* renamed from: K2 */
    public final boolean mo48263K2() {
        return _thread != null;
    }

    /* renamed from: L2 */
    public final synchronized boolean mo48264L2() {
        if (mo48262E2()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    @vr2
    /* renamed from: M0 */
    public fn0 mo31901M0(long j, @vr2 Runnable runnable, @vr2 b90 b90) {
        return mo46889d2(j, runnable);
    }

    /* renamed from: M1 */
    public void mo46883M1(@vr2 Runnable runnable) {
        if (mo48261C2()) {
            mo48265M2();
        }
        super.mo46883M1(runnable);
    }

    /* renamed from: M2 */
    public final void mo48265M2() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    /* renamed from: N2 */
    public final synchronized void mo48266N2(long j) {
        un4 un4;
        long currentTimeMillis = System.currentTimeMillis() + j;
        if (!mo48262E2()) {
            debugStatus = 2;
        }
        while (true) {
            if (debugStatus == 3 || _thread == null) {
                break;
            }
            Thread thread = _thread;
            if (thread != null) {
                C6357p1 b = C6492q1.m61804b();
                if (b == null) {
                    un4 = null;
                } else {
                    b.mo42352g(thread);
                    un4 = un4.f36206a;
                }
                if (un4 == null) {
                    LockSupport.unpark(thread);
                }
            }
            if (currentTimeMillis - System.currentTimeMillis() <= 0) {
                break;
            }
            wait(j);
        }
        debugStatus = 0;
    }

    /* renamed from: j2 */
    public final synchronized void mo48267j2() {
        if (mo48262E2()) {
            debugStatus = 3;
            mo46886a2();
            notifyAll();
        }
    }

    /* renamed from: o2 */
    public final synchronized Thread mo48268o2() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, f38334b);
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    public void run() {
        un4 un4;
        wb4.f36943a.mo46670d(this);
        C6357p1 b = C6492q1.m61804b();
        if (b != null) {
            b.mo42349d();
        }
        try {
            if (mo48264L2()) {
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long A1 = mo41645A1();
                    if (A1 == Long.MAX_VALUE) {
                        C6357p1 b2 = C6492q1.m61804b();
                        Long valueOf = b2 == null ? null : Long.valueOf(b2.mo42347b());
                        long nanoTime = valueOf == null ? System.nanoTime() : valueOf.longValue();
                        if (j == Long.MAX_VALUE) {
                            j = f38336d + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            mo48267j2();
                            C6357p1 b3 = C6492q1.m61804b();
                            if (b3 != null) {
                                b3.mo42353h();
                            }
                            if (!mo46379s1()) {
                                mo36144D1();
                                return;
                            }
                            return;
                        }
                        A1 = df3.m45222v(A1, j2);
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (A1 > 0) {
                        if (mo48262E2()) {
                            _thread = null;
                            mo48267j2();
                            C6357p1 b4 = C6492q1.m61804b();
                            if (b4 != null) {
                                b4.mo42353h();
                            }
                            if (!mo46379s1()) {
                                mo36144D1();
                                return;
                            }
                            return;
                        }
                        C6357p1 b5 = C6492q1.m61804b();
                        if (b5 == null) {
                            un4 = null;
                        } else {
                            b5.mo42348c(this, A1);
                            un4 = un4.f36206a;
                        }
                        if (un4 == null) {
                            LockSupport.parkNanos(this, A1);
                        }
                    }
                }
            }
        } finally {
            _thread = null;
            mo48267j2();
            C6357p1 b6 = C6492q1.m61804b();
            if (b6 != null) {
                b6.mo42353h();
            }
            if (!mo46379s1()) {
                mo36144D1();
            }
        }
    }

    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    /* renamed from: w2 */
    public final synchronized void mo48270w2() {
        debugStatus = 0;
        mo48268o2();
        while (debugStatus == 0) {
            wait();
        }
    }
}
