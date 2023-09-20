package com.onedelhi.secure;

import java.util.concurrent.ThreadFactory;

public final /* synthetic */ class g40 implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ String f28939a;

    public /* synthetic */ g40(String str) {
        this.f28939a = str;
    }

    public final Thread newThread(Runnable runnable) {
        return h40.m16467d(this.f28939a, runnable);
    }
}
