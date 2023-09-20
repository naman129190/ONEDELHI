package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00060\u0002j\u0002`\u00032\u00020\u0004B'\u0012\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0011\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0000H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R(\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\b8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/onedelhi/secure/ke4;", "", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lcom/onedelhi/secure/dc4;", "Lcom/onedelhi/secure/un4;", "run", "other", "", "e", "", "toString", "Lcom/onedelhi/secure/cc4;", "heap", "Lcom/onedelhi/secure/cc4;", "g", "()Lcom/onedelhi/secure/cc4;", "b", "(Lcom/onedelhi/secure/cc4;)V", "index", "I", "a", "()I", "l", "(I)V", "", "count", "time", "<init>", "(Ljava/lang/Runnable;JJ)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class ke4 implements Comparable<ke4>, Runnable, dc4 {
    @ss2

    /* renamed from: a */
    public cc4<?> f31187a;
    @vr2

    /* renamed from: a */
    public final Runnable f31188a;

    /* renamed from: b */
    public final long f31189b;
    @rw1

    /* renamed from: c */
    public final long f31190c;

    /* renamed from: n */
    public int f31191n;

    public ke4(@vr2 Runnable runnable, long j, long j2) {
        this.f31188a = runnable;
        this.f31189b = j;
        this.f31190c = j2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ke4(Runnable runnable, long j, long j2, int i, wg0 wg0) {
        this(runnable, (i & 2) != 0 ? 0 : j, (i & 4) != 0 ? 0 : j2);
    }

    /* renamed from: a */
    public int mo34300a() {
        return this.f31191n;
    }

    /* renamed from: b */
    public void mo34301b(@ss2 cc4<?> cc4) {
        this.f31187a = cc4;
    }

    /* renamed from: e */
    public int compareTo(@vr2 ke4 ke4) {
        long j = this.f31190c;
        long j2 = ke4.f31190c;
        if (j == j2) {
            j = this.f31189b;
            j2 = ke4.f31189b;
        }
        return jt1.m53782u(j, j2);
    }

    @ss2
    /* renamed from: g */
    public cc4<?> mo34302g() {
        return this.f31187a;
    }

    /* renamed from: l */
    public void mo34303l(int i) {
        this.f31191n = i;
    }

    public void run() {
        this.f31188a.run();
    }

    @vr2
    public String toString() {
        return "TimedRunnable(time=" + this.f31190c + ", run=" + this.f31188a + ')';
    }
}
