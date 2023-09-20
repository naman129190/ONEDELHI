package com.onedelhi.secure;

import com.google.android.gms.common.api.internal.RemoteCall;

public final /* synthetic */ class js6 implements RemoteCall {

    /* renamed from: a */
    public final /* synthetic */ t07 f14499a;

    /* renamed from: a */
    public final /* synthetic */ String f14500a;

    public /* synthetic */ js6(t07 t07, String str) {
        this.f14499a = t07;
        this.f14500a = str;
    }

    public final void accept(Object obj, Object obj2) {
        t07 t07 = this.f14499a;
        ((he6) ((m47) obj).getService()).mo17241m8(this.f14500a, new bz6(t07, (x94) obj2));
    }
}
