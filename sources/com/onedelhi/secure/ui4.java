package com.onedelhi.secure;

public class ui4 {

    /* renamed from: a */
    public final ui4 f36155a;

    /* renamed from: a */
    public final String f36156a;

    /* renamed from: a */
    public final StackTraceElement[] f36157a;

    /* renamed from: b */
    public final String f36158b;

    public ui4(Throwable th, j24 j24) {
        this.f36156a = th.getLocalizedMessage();
        this.f36158b = th.getClass().getName();
        this.f36157a = j24.mo34471a(th.getStackTrace());
        Throwable cause = th.getCause();
        this.f36155a = cause != null ? new ui4(cause, j24) : null;
    }
}
