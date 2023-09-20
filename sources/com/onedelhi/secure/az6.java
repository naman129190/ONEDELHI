package com.onedelhi.secure;

import com.google.android.gms.common.api.internal.RemoteCall;

public final /* synthetic */ class az6 implements RemoteCall {

    /* renamed from: a */
    public final /* synthetic */ tb5 f9588a;

    /* renamed from: a */
    public final /* synthetic */ String f9589a;

    public /* synthetic */ az6(tb5 tb5, String str) {
        this.f9588a = tb5;
        this.f9589a = str;
    }

    public final void accept(Object obj, Object obj2) {
        tb5 tb5 = this.f9588a;
        ((ix6) ((xh6) obj).getService()).mo17999q8(new r57(tb5, (x94) obj2), this.f9589a);
    }
}
