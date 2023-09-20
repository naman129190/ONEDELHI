package com.onedelhi.secure;

import android.os.Process;

/* renamed from: com.onedelhi.secure.pi */
public abstract class C6446pi implements Runnable {
    /* renamed from: a */
    public abstract void mo32183a();

    public final void run() {
        Process.setThreadPriority(10);
        mo32183a();
    }
}
