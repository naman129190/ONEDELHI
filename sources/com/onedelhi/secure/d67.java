package com.onedelhi.secure;

import java.util.concurrent.Callable;

public final class d67 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ i47 f10647a;

    /* renamed from: a */
    public final /* synthetic */ Callable f10648a;

    public d67(i47 i47, Callable callable) {
        this.f10647a = i47;
        this.f10648a = callable;
    }

    public final void run() {
        try {
            this.f10647a.mo17594z(this.f10648a.call());
        } catch (Exception e) {
            this.f10647a.mo17593y(e);
        } catch (Throwable th) {
            this.f10647a.mo17593y(new RuntimeException(th));
        }
    }
}
