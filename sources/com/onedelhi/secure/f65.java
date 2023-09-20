package com.onedelhi.secure;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.Preconditions;

public final /* synthetic */ class f65 implements RemoteCall {

    /* renamed from: a */
    public final /* synthetic */ gg1 f11948a;

    /* renamed from: a */
    public final /* synthetic */ n65 f11949a;

    public /* synthetic */ f65(n65 n65, gg1 gg1) {
        this.f11949a = n65;
        this.f11948a = gg1;
    }

    public final void accept(Object obj, Object obj2) {
        n65 n65 = this.f11949a;
        gg1 gg1 = this.f11948a;
        ((x55) ((o65) obj).getService()).mo26794n8(new l65(n65, (x94) obj2), (gg1) Preconditions.checkNotNull(gg1));
    }
}
