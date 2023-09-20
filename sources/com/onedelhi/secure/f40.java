package com.onedelhi.secure;

import android.os.Handler;
import java.util.concurrent.Executor;

public final /* synthetic */ class f40 implements Executor {

    /* renamed from: a */
    public final /* synthetic */ Handler f28165a;

    public /* synthetic */ f40(Handler handler) {
        this.f28165a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f28165a.post(runnable);
    }
}
