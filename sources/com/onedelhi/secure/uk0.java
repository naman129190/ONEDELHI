package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, d2 = {"Lcom/onedelhi/secure/uk0;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "getLocalizedMessage", "", "fillInStackTrace", "Lcom/onedelhi/secure/b90;", "context", "<init>", "(Lcom/onedelhi/secure/b90;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class uk0 extends RuntimeException {
    @vr2

    /* renamed from: a */
    public final b90 f36170a;

    public uk0(@vr2 b90 b90) {
        this.f36170a = b90;
    }

    @vr2
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @vr2
    public String getLocalizedMessage() {
        return this.f36170a.toString();
    }
}
