package com.onedelhi.secure;

public final class dq0 extends IllegalStateException {
    public dq0(String str, @ts2 Throwable th) {
        super(str, th);
    }

    @mr2
    /* renamed from: a */
    public static IllegalStateException m13267a(@mr2 w94<?> w94) {
        if (!w94.mo17589u()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception q = w94.mo17585q();
        return new dq0("Complete with: ".concat(q != null ? "failure" : w94.mo17590v() ? "result ".concat(String.valueOf(w94.mo17586r())) : w94.mo17588t() ? "cancellation" : "unknown issue"), q);
    }
}
