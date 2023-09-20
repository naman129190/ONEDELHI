package com.onedelhi.secure;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;

public final /* synthetic */ class lx0 implements b73 {

    /* renamed from: a */
    public static final /* synthetic */ lx0 f31873a = new lx0();

    public final Object get() {
        return ExecutorsRegistrar.m34636u(Executors.newFixedThreadPool(4, ExecutorsRegistrar.m34626k("Firebase Background", 10, ExecutorsRegistrar.m34624i())));
    }
}
