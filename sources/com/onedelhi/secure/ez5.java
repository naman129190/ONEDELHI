package com.onedelhi.secure;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class ez5 implements ThreadFactory {

    /* renamed from: a */
    public final ThreadFactory f11783a = Executors.defaultThreadFactory();

    public ez5(j36 j36) {
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f11783a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
