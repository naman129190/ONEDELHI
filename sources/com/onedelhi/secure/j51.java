package com.onedelhi.secure;

import android.content.Context;
import com.google.firebase.perf.config.C4336a;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import java.util.concurrent.Executor;

public class j51 {
    public j51(w31 w31, @ts2 y24 y24, Executor executor) {
        Context n = w31.mo46527n();
        C4336a.m34908h().mo29865Q(n);
        C5665i9 c = C5665i9.m51864c();
        c.mo37880n(n);
        c.mo37881o(new t51());
        if (y24 != null) {
            AppStartTrace r = AppStartTrace.m35072r();
            r.mo29923G(n);
            executor.execute(new AppStartTrace.C4361c(r));
        }
        SessionManager.getInstance().initializeGaugeCollection();
    }
}
