package com.onedelhi.secure;

import java.util.Map;

public final /* synthetic */ class rv0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ pv0 f34753a;

    /* renamed from: a */
    public final /* synthetic */ Map.Entry f34754a;

    public /* synthetic */ rv0(Map.Entry entry, pv0 pv0) {
        this.f34754a = entry;
        this.f34753a = pv0;
    }

    public final void run() {
        ((tv0) this.f34754a.getKey()).mo34854a(this.f34753a);
    }
}
