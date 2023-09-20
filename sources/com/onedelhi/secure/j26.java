package com.onedelhi.secure;

import java.util.concurrent.Executor;

public final class j26 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ g66 f13986a;

    /* renamed from: a */
    public final /* synthetic */ w94 f13987a;

    public j26(g66 g66, w94 w94) {
        this.f13986a = g66;
        this.f13987a = w94;
    }

    public final void run() {
        try {
            w94 w94 = (w94) this.f13986a.f12452a.then(this.f13987a);
            if (w94 == null) {
                this.f13986a.mo7919c(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = ba4.f9785b;
            w94.mo17580l(executor, this.f13986a);
            w94.mo17577i(executor, this.f13986a);
            w94.mo17571c(executor, this.f13986a);
        } catch (po3 e) {
            if (e.getCause() instanceof Exception) {
                this.f13986a.f12453a.mo17593y((Exception) e.getCause());
            } else {
                this.f13986a.f12453a.mo17593y(e);
            }
        } catch (Exception e2) {
            this.f13986a.f12453a.mo17593y(e2);
        }
    }
}
