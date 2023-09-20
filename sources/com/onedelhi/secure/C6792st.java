package com.onedelhi.secure;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: com.onedelhi.secure.st */
public class C6792st {

    /* renamed from: a */
    public static C6792st f35187a = null;

    /* renamed from: a */
    public static final String f35188a = "st";

    /* renamed from: a */
    public int f35189a = 0;

    /* renamed from: a */
    public Handler f35190a;

    /* renamed from: a */
    public HandlerThread f35191a;

    /* renamed from: a */
    public final Object f35192a = new Object();

    /* renamed from: e */
    public static C6792st m64863e() {
        if (f35187a == null) {
            f35187a = new C6792st();
        }
        return f35187a;
    }

    /* renamed from: a */
    public final void mo44540a() {
        synchronized (this.f35192a) {
            if (this.f35190a == null) {
                if (this.f35189a > 0) {
                    HandlerThread handlerThread = new HandlerThread("CameraThread");
                    this.f35191a = handlerThread;
                    handlerThread.start();
                    this.f35190a = new Handler(this.f35191a.getLooper());
                } else {
                    throw new IllegalStateException("CameraThread is not open");
                }
            }
        }
    }

    /* renamed from: b */
    public void mo44541b() {
        synchronized (this.f35192a) {
            int i = this.f35189a - 1;
            this.f35189a = i;
            if (i == 0) {
                mo44545g();
            }
        }
    }

    /* renamed from: c */
    public void mo44542c(Runnable runnable) {
        synchronized (this.f35192a) {
            mo44540a();
            this.f35190a.post(runnable);
        }
    }

    /* renamed from: d */
    public void mo44543d(Runnable runnable, long j) {
        synchronized (this.f35192a) {
            mo44540a();
            this.f35190a.postDelayed(runnable, j);
        }
    }

    /* renamed from: f */
    public void mo44544f(Runnable runnable) {
        synchronized (this.f35192a) {
            this.f35189a++;
            mo44542c(runnable);
        }
    }

    /* renamed from: g */
    public final void mo44545g() {
        synchronized (this.f35192a) {
            this.f35191a.quit();
            this.f35191a = null;
            this.f35190a = null;
        }
    }
}
