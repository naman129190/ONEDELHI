package com.onedelhi.secure;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

public final class lv6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ dx6 f15644a;

    /* renamed from: a */
    public final /* synthetic */ w94 f15645a;

    public lv6(dx6 dx6, w94 w94) {
        this.f15644a = dx6;
        this.f15645a = w94;
    }

    public final void run() {
        try {
            w94 then = this.f15644a.f10995a.then(this.f15645a.mo17586r());
            if (then == null) {
                this.f15644a.mo7919c(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = ba4.f9785b;
            then.mo17580l(executor, this.f15644a);
            then.mo17577i(executor, this.f15644a);
            then.mo17571c(executor, this.f15644a);
        } catch (po3 e) {
            if (e.getCause() instanceof Exception) {
                this.f15644a.mo7919c((Exception) e.getCause());
            } else {
                this.f15644a.mo7919c(e);
            }
        } catch (CancellationException unused) {
            this.f15644a.mo14940b();
        } catch (Exception e2) {
            this.f15644a.mo7919c(e2);
        }
    }
}
