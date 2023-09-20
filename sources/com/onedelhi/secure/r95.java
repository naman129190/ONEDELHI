package com.onedelhi.secure;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;

public final /* synthetic */ class r95 implements RemoteCall {

    /* renamed from: a */
    public final /* synthetic */ SignRequestParams f19722a;

    /* renamed from: a */
    public final /* synthetic */ uk4 f19723a;

    public /* synthetic */ r95(uk4 uk4, SignRequestParams signRequestParams) {
        this.f19723a = uk4;
        this.f19722a = signRequestParams;
    }

    public final void accept(Object obj, Object obj2) {
        uk4 uk4 = this.f19723a;
        SignRequestParams signRequestParams = this.f19722a;
        ((o47) ((u57) obj).getService()).mo21601m8(new tx5(uk4, (x94) obj2), signRequestParams);
    }
}
