package com.onedelhi.secure;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\t\u0010\u0001\u001a\u00020\u0000H\b\u001a\t\u0010\u0002\u001a\u00020\u0000H\b\u001a\u0019\u0010\u0006\u001a\u00060\u0003j\u0002`\u00042\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\b\u001a\t\u0010\b\u001a\u00020\u0007H\b\u001a\t\u0010\t\u001a\u00020\u0007H\b\u001a\t\u0010\n\u001a\u00020\u0007H\b\u001a\t\u0010\u000b\u001a\u00020\u0007H\b\u001a\u0019\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0000H\b\u001a\u0011\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\b\"$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"", "a", "c", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "k", "Lcom/onedelhi/secure/un4;", "g", "h", "e", "j", "", "blocker", "nanos", "d", "Ljava/lang/Thread;", "thread", "i", "Lcom/onedelhi/secure/p1;", "timeSource", "Lcom/onedelhi/secure/p1;", "b", "()Lcom/onedelhi/secure/p1;", "f", "(Lcom/onedelhi/secure/p1;)V", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* renamed from: com.onedelhi.secure.q1 */
public final class C6492q1 {
    @ss2

    /* renamed from: a */
    public static C6357p1 f33881a;

    @xq1
    /* renamed from: a */
    public static final long m61803a() {
        C6357p1 b = m61804b();
        Long valueOf = b == null ? null : Long.valueOf(b.mo42346a());
        return valueOf == null ? System.currentTimeMillis() : valueOf.longValue();
    }

    @ss2
    /* renamed from: b */
    public static final C6357p1 m61804b() {
        return f33881a;
    }

    @xq1
    /* renamed from: c */
    public static final long m61805c() {
        C6357p1 b = m61804b();
        Long valueOf = b == null ? null : Long.valueOf(b.mo42347b());
        return valueOf == null ? System.nanoTime() : valueOf.longValue();
    }

    @xq1
    /* renamed from: d */
    public static final void m61806d(Object obj, long j) {
        un4 un4;
        C6357p1 b = m61804b();
        if (b == null) {
            un4 = null;
        } else {
            b.mo42348c(obj, j);
            un4 = un4.f36206a;
        }
        if (un4 == null) {
            LockSupport.parkNanos(obj, j);
        }
    }

    @xq1
    /* renamed from: e */
    public static final void m61807e() {
        C6357p1 b = m61804b();
        if (b != null) {
            b.mo42349d();
        }
    }

    /* renamed from: f */
    public static final void m61808f(@ss2 C6357p1 p1Var) {
        f33881a = p1Var;
    }

    @xq1
    /* renamed from: g */
    public static final void m61809g() {
        C6357p1 b = m61804b();
        if (b != null) {
            b.mo42350e();
        }
    }

    @xq1
    /* renamed from: h */
    public static final void m61810h() {
        C6357p1 b = m61804b();
        if (b != null) {
            b.mo42351f();
        }
    }

    @xq1
    /* renamed from: i */
    public static final void m61811i(Thread thread) {
        un4 un4;
        C6357p1 b = m61804b();
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

    @xq1
    /* renamed from: j */
    public static final void m61812j() {
        C6357p1 b = m61804b();
        if (b != null) {
            b.mo42353h();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = r0.mo42354i(r1);
     */
    @com.onedelhi.secure.xq1
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Runnable m61813k(java.lang.Runnable r1) {
        /*
            com.onedelhi.secure.p1 r0 = m61804b()
            if (r0 != 0) goto L_0x0007
            goto L_0x000f
        L_0x0007:
            java.lang.Runnable r0 = r0.mo42354i(r1)
            if (r0 != 0) goto L_0x000e
            goto L_0x000f
        L_0x000e:
            r1 = r0
        L_0x000f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C6492q1.m61813k(java.lang.Runnable):java.lang.Runnable");
    }
}
