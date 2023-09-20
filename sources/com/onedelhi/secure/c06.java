package com.onedelhi.secure;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

public final class c06 extends a16 {

    /* renamed from: a */
    public final /* synthetic */ Bundle f10058a;

    /* renamed from: b */
    public final /* synthetic */ j36 f10059b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c06(j36 j36, Bundle bundle) {
        super(j36, true);
        this.f10059b = j36;
        this.f10058a = bundle;
    }

    /* renamed from: a */
    public final void mo12479a() throws RemoteException {
        ((dt5) Preconditions.checkNotNull(this.f10059b.f14000a)).setDefaultEventParameters(this.f10058a);
    }
}
