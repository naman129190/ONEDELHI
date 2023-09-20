package com.onedelhi.secure;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;

public final /* synthetic */ class jx0 implements b73 {

    /* renamed from: a */
    public static final /* synthetic */ jx0 f30995a = new jx0();

    public final Object get() {
        return ExecutorsRegistrar.m34636u(Executors.newCachedThreadPool(ExecutorsRegistrar.m34625j("Firebase Blocking", 11)));
    }
}
