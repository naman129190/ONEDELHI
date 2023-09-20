package com.onedelhi.secure;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u001a\u0015\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\b*\n\u0010\n\"\u00020\u00042\u00020\u0004¨\u0006\u000b"}, d2 = {"", "message", "", "cause", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "a", "other", "Lcom/onedelhi/secure/un4;", "b", "CancellationException", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class nw0 {
    @vr2
    /* renamed from: a */
    public static final CancellationException m58835a(@ss2 String str, @ss2 Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* renamed from: b */
    public static final void m58836b(@vr2 Throwable th, @vr2 Throwable th2) {
        pw0.m61687a(th, th2);
    }
}
