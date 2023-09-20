package com.onedelhi.secure;

import java.io.IOException;

public final class lm1 extends IOException {

    /* renamed from: b */
    public static final long f15505b = 1;

    /* renamed from: o */
    public static final int f15506o = -1;

    /* renamed from: n */
    public final int f15507n;

    public lm1(int i) {
        this("Http request failed", i);
    }

    @Deprecated
    public lm1(String str) {
        this(str, -1);
    }

    public lm1(String str, int i) {
        this(str, i, (Throwable) null);
    }

    public lm1(String str, int i, @ts2 Throwable th) {
        super(str + ", status code: " + i, th);
        this.f15507n = i;
    }

    /* renamed from: a */
    public int mo19715a() {
        return this.f15507n;
    }
}
