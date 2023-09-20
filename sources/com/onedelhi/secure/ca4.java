package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000f"}, d2 = {"Lcom/onedelhi/secure/ca4;", "Lcom/onedelhi/secure/u94;", "Lcom/onedelhi/secure/un4;", "run", "", "toString", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "submissionTime", "Lcom/onedelhi/secure/y94;", "taskContext", "<init>", "(Ljava/lang/Runnable;JLcom/onedelhi/secure/y94;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class ca4 extends u94 {
    @rw1
    @vr2

    /* renamed from: a */
    public final Runnable f26713a;

    public ca4(@vr2 Runnable runnable, long j, @vr2 y94 y94) {
        super(j, y94);
        this.f26713a = runnable;
    }

    public void run() {
        try {
            this.f26713a.run();
        } finally {
            this.f36015a.mo37164N0();
        }
    }

    @vr2
    public String toString() {
        return "Task[" + if0.m52224a(this.f26713a) + '@' + if0.m52225b(this.f26713a) + ", " + this.f36016b + ", " + this.f36015a + ']';
    }
}
