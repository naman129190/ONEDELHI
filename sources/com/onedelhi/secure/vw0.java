package com.onedelhi.secure;

import android.annotation.SuppressLint;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

@ak2
public abstract class vw0 {
    @SuppressLint({"ThreadPoolCreation"})
    @g73
    @nz3
    /* renamed from: a */
    public static Executor m30526a() {
        return new pq3(Executors.newSingleThreadExecutor());
    }
}
