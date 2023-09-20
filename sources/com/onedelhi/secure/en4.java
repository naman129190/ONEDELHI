package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public enum en4 implements Executor {
    INSTANCE;
    
    @SuppressLint({"ThreadPoolCreation"})

    /* renamed from: a */
    public static final Handler f28015a = null;

    /* access modifiers changed from: public */
    static {
        f28015a = new Handler(Looper.getMainLooper());
    }

    public void execute(Runnable runnable) {
        f28015a.post(runnable);
    }
}
