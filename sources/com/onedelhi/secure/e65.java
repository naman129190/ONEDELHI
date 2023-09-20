package com.onedelhi.secure;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.Preconditions;

public final /* synthetic */ class e65 implements RemoteCall {

    /* renamed from: a */
    public final /* synthetic */ C2635kk f11125a;

    /* renamed from: a */
    public final /* synthetic */ n65 f11126a;

    public /* synthetic */ e65(n65 n65, C2635kk kkVar) {
        this.f11126a = n65;
        this.f11125a = kkVar;
    }

    public final void accept(Object obj, Object obj2) {
        n65 n65 = this.f11126a;
        C2635kk kkVar = this.f11125a;
        ((x55) ((o65) obj).getService()).mo26792l8(new j65(n65, (x94) obj2), (C2635kk) Preconditions.checkNotNull(kkVar));
    }
}
