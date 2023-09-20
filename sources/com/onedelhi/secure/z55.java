package com.onedelhi.secure;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.Preconditions;

public final /* synthetic */ class z55 implements RemoteCall {

    /* renamed from: a */
    public final /* synthetic */ d65 f23466a;

    /* renamed from: a */
    public final /* synthetic */ sq3 f23467a;

    public /* synthetic */ z55(d65 d65, sq3 sq3) {
        this.f23466a = d65;
        this.f23467a = sq3;
    }

    public final void accept(Object obj, Object obj2) {
        d65 d65 = this.f23466a;
        sq3 sq3 = this.f23467a;
        ((k95) ((g95) obj).getService()).mo18965m8(new c65(d65, (x94) obj2), (sq3) Preconditions.checkNotNull(sq3));
    }
}
