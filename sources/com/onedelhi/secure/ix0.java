package com.onedelhi.secure;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;

public final /* synthetic */ class ix0 implements b73 {

    /* renamed from: a */
    public static final /* synthetic */ ix0 f30482a = new ix0();

    public final Object get() {
        return Executors.newSingleThreadScheduledExecutor(ExecutorsRegistrar.m34625j("Firebase Scheduler", 0));
    }
}
