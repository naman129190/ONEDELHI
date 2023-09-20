package com.onedelhi.secure;

import java.util.concurrent.Executor;

public class pq3 implements Executor {

    /* renamed from: a */
    public final Executor f18679a;

    /* renamed from: com.onedelhi.secure.pq3$a */
    public static class C3181a implements Runnable {

        /* renamed from: a */
        public final Runnable f18680a;

        public C3181a(Runnable runnable) {
            this.f18680a = runnable;
        }

        public void run() {
            try {
                this.f18680a.run();
            } catch (Exception e) {
                r92.m26532f("Executor", "Background execution failure.", e);
            }
        }
    }

    public pq3(Executor executor) {
        this.f18679a = executor;
    }

    public void execute(Runnable runnable) {
        this.f18679a.execute(new C3181a(runnable));
    }
}
