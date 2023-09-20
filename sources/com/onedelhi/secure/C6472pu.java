package com.onedelhi.secure;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\b\u001a\u0017\u0010\u0007\u001a\u00060\u0004j\u0002`\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\b*\u001a\b\u0007\u0010\u000b\"\u00020\u00042\u00020\u0004B\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n¨\u0006\f"}, d2 = {"", "message", "", "cause", "Ljava/util/concurrent/CancellationException;", "Lkotlin/coroutines/cancellation/CancellationException;", "a", "b", "Lcom/onedelhi/secure/gz3;", "version", "1.4", "CancellationException", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1})
/* renamed from: com.onedelhi.secure.pu */
public final class C6472pu {
    @gz3(version = "1.4")
    @xq1
    /* renamed from: a */
    public static final CancellationException m61648a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    @gz3(version = "1.4")
    @xq1
    /* renamed from: b */
    public static final CancellationException m61649b(Throwable th) {
        CancellationException cancellationException = new CancellationException(th != null ? th.toString() : null);
        cancellationException.initCause(th);
        return cancellationException;
    }

    @gz3(version = "1.4")
    /* renamed from: c */
    public static /* synthetic */ void m61650c() {
    }
}
