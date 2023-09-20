package com.onedelhi.secure;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;

public final /* synthetic */ class kx0 implements b73 {

    /* renamed from: a */
    public static final /* synthetic */ kx0 f31483a = new kx0();

    public final Object get() {
        return ExecutorsRegistrar.m34636u(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), ExecutorsRegistrar.m34626k("Firebase Lite", 0, ExecutorsRegistrar.m34635t())));
    }
}
