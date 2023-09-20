package com.onedelhi.secure;

import java.util.concurrent.Executor;

public class g41 {

    /* renamed from: com.onedelhi.secure.g41$a */
    public enum C5360a implements Executor {
        INSTANCE;

        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static Executor m49075a() {
        return C5360a.INSTANCE;
    }

    /* renamed from: b */
    public static Executor m49076b(Executor executor) {
        return new iu3(executor);
    }
}
