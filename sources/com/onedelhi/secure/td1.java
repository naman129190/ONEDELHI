package com.onedelhi.secure;

import com.google.firebase.perf.session.gauges.GaugeManager;

public final /* synthetic */ class td1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ GaugeManager f35522a;

    /* renamed from: a */
    public final /* synthetic */ C6256o9 f35523a;

    /* renamed from: b */
    public final /* synthetic */ String f35524b;

    public /* synthetic */ td1(GaugeManager gaugeManager, String str, C6256o9 o9Var) {
        this.f35522a = gaugeManager;
        this.f35524b = str;
        this.f35523a = o9Var;
    }

    public final void run() {
        this.f35522a.lambda$startCollectingGauges$2(this.f35524b, this.f35523a);
    }
}
