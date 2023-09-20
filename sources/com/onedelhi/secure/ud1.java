package com.onedelhi.secure;

import com.google.firebase.perf.session.gauges.GaugeManager;

public final /* synthetic */ class ud1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ GaugeManager f36037a;

    /* renamed from: a */
    public final /* synthetic */ C6256o9 f36038a;

    /* renamed from: b */
    public final /* synthetic */ String f36039b;

    public /* synthetic */ ud1(GaugeManager gaugeManager, String str, C6256o9 o9Var) {
        this.f36037a = gaugeManager;
        this.f36039b = str;
        this.f36038a = o9Var;
    }

    public final void run() {
        this.f36037a.lambda$stopCollectingGauges$3(this.f36039b, this.f36038a);
    }
}
