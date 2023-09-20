package com.onedelhi.secure;

import com.google.firebase.perf.metrics.Trace;
import com.onedelhi.secure.g60;
import com.onedelhi.secure.nb1;

public class ls3 {

    /* renamed from: a */
    public static final C7012v5 f31833a = C7012v5.m67717e();

    /* renamed from: a */
    public static Trace m56478a(Trace trace, nb1.C6180a aVar) {
        if (aVar.mo41017d() > 0) {
            trace.putMetric(g60.C5362a.FRAMES_TOTAL.toString(), (long) aVar.mo41017d());
        }
        if (aVar.mo41016c() > 0) {
            trace.putMetric(g60.C5362a.FRAMES_SLOW.toString(), (long) aVar.mo41016c());
        }
        if (aVar.mo41015b() > 0) {
            trace.putMetric(g60.C5362a.FRAMES_FROZEN.toString(), (long) aVar.mo41015b());
        }
        C7012v5 v5Var = f31833a;
        v5Var.mo46000a("Screen trace: " + trace.mo29949f() + " _fr_tot:" + aVar.mo41017d() + " _fr_slo:" + aVar.mo41016c() + " _fr_fzn:" + aVar.mo41015b());
        return trace;
    }
}
