package com.onedelhi.secure;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

public class fb0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final C5236a f28247a;

    /* renamed from: a */
    public final ja0 f28248a;

    /* renamed from: a */
    public final mw3 f28249a;

    /* renamed from: a */
    public final Thread.UncaughtExceptionHandler f28250a;

    /* renamed from: a */
    public final AtomicBoolean f28251a = new AtomicBoolean(false);

    /* renamed from: com.onedelhi.secure.fb0$a */
    public interface C5236a {
        /* renamed from: a */
        void mo34945a(mw3 mw3, Thread thread, Throwable th);
    }

    public fb0(C5236a aVar, mw3 mw3, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, ja0 ja0) {
        this.f28247a = aVar;
        this.f28249a = mw3;
        this.f28250a = uncaughtExceptionHandler;
        this.f28248a = ja0;
    }

    /* renamed from: a */
    public boolean mo35839a() {
        return this.f28251a.get();
    }

    /* renamed from: b */
    public final boolean mo35840b(Thread thread, Throwable th) {
        if (thread == null) {
            o92.m59120f().mo41615d("Crashlytics will not record uncaught exception; null thread");
            return false;
        } else if (th == null) {
            o92.m59120f().mo41615d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        } else if (!this.f28248a.mo38514d()) {
            return true;
        } else {
            o92.m59120f().mo41613b("Crashlytics will not record uncaught exception; native crash exists for session.");
            return false;
        }
    }

    public void uncaughtException(Thread thread, Throwable th) {
        this.f28251a.set(true);
        try {
            if (mo35840b(thread, th)) {
                this.f28247a.mo34945a(this.f28249a, thread, th);
            } else {
                o92.m59120f().mo41613b("Uncaught exception will not be recorded by Crashlytics.");
            }
        } catch (Exception e) {
            o92.m59120f().mo41616e("An error occurred in the uncaught exception handler", e);
        } catch (Throwable th2) {
            o92.m59120f().mo41613b("Completed exception processing. Invoking default exception handler.");
            this.f28250a.uncaughtException(thread, th);
            this.f28251a.set(false);
            throw th2;
        }
        o92.m59120f().mo41613b("Completed exception processing. Invoking default exception handler.");
        this.f28250a.uncaughtException(thread, th);
        this.f28251a.set(false);
    }
}
