package com.onedelhi.secure;

import com.google.android.gms.common.util.BiConsumer;
import com.google.firebase.remoteconfig.internal.C4367b;

public final /* synthetic */ class d50 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ BiConsumer f27252a;

    /* renamed from: a */
    public final /* synthetic */ C4367b f27253a;

    /* renamed from: b */
    public final /* synthetic */ String f27254b;

    public /* synthetic */ d50(BiConsumer biConsumer, String str, C4367b bVar) {
        this.f27252a = biConsumer;
        this.f27254b = str;
        this.f27253a = bVar;
    }

    public final void run() {
        this.f27252a.accept(this.f27254b, this.f27253a);
    }
}
