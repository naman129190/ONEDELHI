package com.onedelhi.secure;

import android.os.Process;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;

public final class q96 extends Thread {

    /* renamed from: a */
    public final /* synthetic */ qa6 f18972a;

    /* renamed from: a */
    public final Object f18973a;

    /* renamed from: a */
    public final BlockingQueue f18974a;
    @mj1("threadLifeCycleLock")

    /* renamed from: b */
    public boolean f18975b = false;

    public q96(qa6 qa6, String str, BlockingQueue blockingQueue) {
        this.f18972a = qa6;
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(blockingQueue);
        this.f18973a = new Object();
        this.f18974a = blockingQueue;
        setName(str);
    }

    /* renamed from: a */
    public final void mo22959a() {
        synchronized (this.f18973a) {
            this.f18973a.notifyAll();
        }
    }

    /* renamed from: b */
    public final void mo22960b() {
        synchronized (this.f18972a.f19045a) {
            if (!this.f18975b) {
                this.f18972a.f19049a.release();
                this.f18972a.f19045a.notifyAll();
                qa6 qa6 = this.f18972a;
                if (this == qa6.f19044a) {
                    qa6.f19044a = null;
                } else if (this == qa6.f19050b) {
                    qa6.f19050b = null;
                } else {
                    qa6.f11205a.mo15136e().mo12726r().mo25379a("Current scheduler thread is neither worker nor network");
                }
                this.f18975b = true;
            }
        }
    }

    /* renamed from: c */
    public final void mo22961c(InterruptedException interruptedException) {
        this.f18972a.f11205a.mo15136e().mo12731w().mo25380b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.f18972a.f19049a.acquire();
                z = true;
            } catch (InterruptedException e) {
                mo22961c(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                n96 n96 = (n96) this.f18974a.poll();
                if (n96 != null) {
                    Process.setThreadPriority(true != n96.f17235b ? 10 : threadPriority);
                    n96.run();
                } else {
                    synchronized (this.f18973a) {
                        if (this.f18974a.peek() == null) {
                            boolean unused = this.f18972a.f19052b;
                            try {
                                this.f18973a.wait(30000);
                            } catch (InterruptedException e2) {
                                mo22961c(e2);
                            }
                        }
                    }
                    synchronized (this.f18972a.f19045a) {
                        if (this.f18974a.peek() == null) {
                            mo22960b();
                            mo22960b();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            mo22960b();
            throw th;
        }
    }
}
