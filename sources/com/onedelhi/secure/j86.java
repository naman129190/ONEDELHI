package com.onedelhi.secure;

import java.util.concurrent.Callable;

public final /* synthetic */ class j86 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ b96 f14040a;

    /* renamed from: a */
    public final /* synthetic */ String f14041a;

    public /* synthetic */ j86(b96 b96, String str) {
        this.f14040a = b96;
        this.f14041a = str;
    }

    public final Object call() {
        return new ot6("internal.remoteConfig", new y86(this.f14040a, this.f14041a));
    }
}
