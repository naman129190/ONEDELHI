package com.onedelhi.secure;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public class og4 implements Executor {

    /* renamed from: a */
    public Runnable f17944a;

    /* renamed from: a */
    public final ArrayDeque<Runnable> f17945a = new ArrayDeque<>();

    /* renamed from: a */
    public final Executor f17946a;

    /* renamed from: com.onedelhi.secure.og4$a */
    public class C3058a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Runnable f17948a;

        public C3058a(Runnable runnable) {
            this.f17948a = runnable;
        }

        public void run() {
            try {
                this.f17948a.run();
            } finally {
                og4.this.mo21918a();
            }
        }
    }

    public og4(@mr2 Executor executor) {
        this.f17946a = executor;
    }

    /* renamed from: a */
    public synchronized void mo21918a() {
        Runnable poll = this.f17945a.poll();
        this.f17944a = poll;
        if (poll != null) {
            this.f17946a.execute(poll);
        }
    }

    public synchronized void execute(Runnable runnable) {
        this.f17945a.offer(new C3058a(runnable));
        if (this.f17944a == null) {
            mo21918a();
        }
    }
}
