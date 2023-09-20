package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\n\b\u0001\u0010\u0002 \u0000*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005B\u001d\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u000f\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/onedelhi/secure/oe4;", "U", "T", "Lcom/onedelhi/secure/js3;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lcom/onedelhi/secure/un4;", "run", "", "h1", "()Ljava/lang/String;", "", "time", "Lcom/onedelhi/secure/b80;", "uCont", "<init>", "(JLcom/onedelhi/secure/b80;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class oe4<U, T extends U> extends js3<T> implements Runnable {
    @rw1

    /* renamed from: b */
    public final long f33005b;

    public oe4(long j, @vr2 b80<? super U> b80) {
        super(b80.mo31187f(), b80);
        this.f33005b = j;
    }

    @vr2
    /* renamed from: h1 */
    public String mo32115h1() {
        return super.mo32115h1() + "(timeMillis=" + this.f33005b + ')';
    }

    public void run() {
        mo32133r0(pe4.m60977a(this.f33005b, this));
    }
}
