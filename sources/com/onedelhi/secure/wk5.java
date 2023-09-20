package com.onedelhi.secure;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;

public final /* synthetic */ class wk5 implements RemoteCall {

    /* renamed from: a */
    public final /* synthetic */ RegisterRequestParams f22195a;

    /* renamed from: a */
    public final /* synthetic */ uk4 f22196a;

    public /* synthetic */ wk5(uk4 uk4, RegisterRequestParams registerRequestParams) {
        this.f22196a = uk4;
        this.f22195a = registerRequestParams;
    }

    public final void accept(Object obj, Object obj2) {
        uk4 uk4 = this.f22196a;
        RegisterRequestParams registerRequestParams = this.f22195a;
        ((o47) ((u57) obj).getService()).mo21600l8(new os5(uk4, (x94) obj2), registerRequestParams);
    }
}
