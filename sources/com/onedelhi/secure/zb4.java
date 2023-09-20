package com.onedelhi.secure;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final /* synthetic */ class zb4 implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ int f38301a;

    /* renamed from: a */
    public final /* synthetic */ String f38302a;

    /* renamed from: a */
    public final /* synthetic */ AtomicInteger f38303a;

    public /* synthetic */ zb4(int i, String str, AtomicInteger atomicInteger) {
        this.f38301a = i;
        this.f38302a = str;
        this.f38303a = atomicInteger;
    }

    public final Thread newThread(Runnable runnable) {
        return ac4.m38571c(this.f38301a, this.f38302a, this.f38303a, runnable);
    }
}
