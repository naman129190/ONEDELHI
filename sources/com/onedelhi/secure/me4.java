package com.onedelhi.secure;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0016\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u000f\u001a\u00020\u0000H\u0016J\b\u0010\u0010\u001a\u00020\u0000H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0001J\"\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00002\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u0016H\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\u001b"}, d2 = {"Lcom/onedelhi/secure/me4;", "", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "i", "j", "", "f", "d", "deadlineNanoTime", "e", "duration", "c", "b", "a", "Lcom/onedelhi/secure/un4;", "h", "monitor", "k", "other", "Lkotlin/Function0;", "block", "g", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 0})
public class me4 {

    /* renamed from: a */
    public static final C6106b f32089a = new C6106b((wg0) null);
    @rw1
    @vr2

    /* renamed from: a */
    public static final me4 f32090a = new C6105a();

    /* renamed from: a */
    public long f32091a;

    /* renamed from: a */
    public boolean f32092a;

    /* renamed from: b */
    public long f32093b;

    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"com/onedelhi/secure/me4$a", "Lcom/onedelhi/secure/me4;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "i", "deadlineNanoTime", "e", "Lcom/onedelhi/secure/un4;", "h", "okio"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.me4$a */
    public static final class C6105a extends me4 {
        @vr2
        /* renamed from: e */
        public me4 mo40558e(long j) {
            return this;
        }

        /* renamed from: h */
        public void mo40561h() {
        }

        @vr2
        /* renamed from: i */
        public me4 mo40562i(long j, @vr2 TimeUnit timeUnit) {
            jt1.m53777p(timeUnit, "unit");
            return this;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/onedelhi/secure/me4$b;", "", "", "aNanos", "bNanos", "a", "Lcom/onedelhi/secure/me4;", "NONE", "Lcom/onedelhi/secure/me4;", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.onedelhi.secure.me4$b */
    public static final class C6106b {
        public C6106b() {
        }

        public /* synthetic */ C6106b(wg0 wg0) {
            this();
        }

        /* renamed from: a */
        public final long mo40565a(long j, long j2) {
            return (j != 0 && (j2 == 0 || j < j2)) ? j : j2;
        }
    }

    @vr2
    /* renamed from: a */
    public me4 mo40554a() {
        this.f32092a = false;
        return this;
    }

    @vr2
    /* renamed from: b */
    public me4 mo40555b() {
        this.f32093b = 0;
        return this;
    }

    @vr2
    /* renamed from: c */
    public final me4 mo40556c(long j, @vr2 TimeUnit timeUnit) {
        jt1.m53777p(timeUnit, "unit");
        if (j > 0) {
            return mo40558e(System.nanoTime() + timeUnit.toNanos(j));
        }
        throw new IllegalArgumentException(("duration <= 0: " + j).toString());
    }

    /* renamed from: d */
    public long mo40557d() {
        if (this.f32092a) {
            return this.f32091a;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    @vr2
    /* renamed from: e */
    public me4 mo40558e(long j) {
        this.f32092a = true;
        this.f32091a = j;
        return this;
    }

    /* renamed from: f */
    public boolean mo40559f() {
        return this.f32092a;
    }

    /* renamed from: g */
    public final void mo40560g(@vr2 me4 me4, @vr2 cc1<un4> cc1) {
        jt1.m53777p(me4, "other");
        jt1.m53777p(cc1, "block");
        long j = mo40563j();
        long a = f32089a.mo40565a(me4.mo40563j(), mo40563j());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        mo40562i(a, timeUnit);
        if (mo40559f()) {
            long d = mo40557d();
            if (me4.mo40559f()) {
                mo40558e(Math.min(mo40557d(), me4.mo40557d()));
            }
            try {
                cc1.invoke();
                uq1.m67403d(1);
                mo40562i(j, timeUnit);
                if (me4.mo40559f()) {
                    mo40558e(d);
                }
            } catch (Throwable th) {
                uq1.m67403d(1);
                mo40562i(j, TimeUnit.NANOSECONDS);
                if (me4.mo40559f()) {
                    mo40558e(d);
                }
                uq1.m67402c(1);
                throw th;
            }
        } else {
            if (me4.mo40559f()) {
                mo40558e(me4.mo40557d());
            }
            try {
                cc1.invoke();
                uq1.m67403d(1);
                mo40562i(j, timeUnit);
                if (me4.mo40559f()) {
                    mo40554a();
                }
            } catch (Throwable th2) {
                uq1.m67403d(1);
                mo40562i(j, TimeUnit.NANOSECONDS);
                if (me4.mo40559f()) {
                    mo40554a();
                }
                uq1.m67402c(1);
                throw th2;
            }
        }
        uq1.m67402c(1);
    }

    /* renamed from: h */
    public void mo40561h() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.f32092a && this.f32091a - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    @vr2
    /* renamed from: i */
    public me4 mo40562i(long j, @vr2 TimeUnit timeUnit) {
        jt1.m53777p(timeUnit, "unit");
        if (j >= 0) {
            this.f32093b = timeUnit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j).toString());
    }

    /* renamed from: j */
    public long mo40563j() {
        return this.f32093b;
    }

    /* renamed from: k */
    public final void mo40564k(@vr2 Object obj) throws InterruptedIOException {
        jt1.m53777p(obj, "monitor");
        try {
            boolean f = mo40559f();
            long j = mo40563j();
            long j2 = 0;
            if (f || j != 0) {
                long nanoTime = System.nanoTime();
                if (f && j != 0) {
                    j = Math.min(j, mo40557d() - nanoTime);
                } else if (f) {
                    j = mo40557d() - nanoTime;
                }
                if (j > 0) {
                    long j3 = j / zv0.f38454a;
                    Long.signum(j3);
                    obj.wait(j3, (int) (j - (zv0.f38454a * j3)));
                    j2 = System.nanoTime() - nanoTime;
                }
                if (j2 >= j) {
                    throw new InterruptedIOException("timeout");
                }
                return;
            }
            obj.wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }
}
