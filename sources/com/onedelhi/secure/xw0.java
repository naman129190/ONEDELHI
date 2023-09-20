package com.onedelhi.secure;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public final class xw0 {

    /* renamed from: com.onedelhi.secure.xw0$a */
    public static class C3953a implements Executor {

        /* renamed from: a */
        public final Handler f22794a;

        public C3953a(@mr2 Handler handler) {
            this.f22794a = (Handler) k43.m19455l(handler);
        }

        public void execute(@mr2 Runnable runnable) {
            if (!this.f22794a.post((Runnable) k43.m19455l(runnable))) {
                throw new RejectedExecutionException(this.f22794a + " is shutting down");
            }
        }
    }

    @mr2
    /* renamed from: a */
    public static Executor m31746a(@mr2 Handler handler) {
        return new C3953a(handler);
    }
}
