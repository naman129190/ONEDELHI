package com.onedelhi.secure;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class b37 implements Executor {

    /* renamed from: a */
    public final Handler f9653a = new ea5(Looper.getMainLooper());

    public final void execute(@mr2 Runnable runnable) {
        this.f9653a.post(runnable);
    }
}
