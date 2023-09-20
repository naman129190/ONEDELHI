package com.onedelhi.secure;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

public final class zu5 extends a16 {

    /* renamed from: a */
    public final /* synthetic */ Bundle f23896a;

    /* renamed from: b */
    public final /* synthetic */ j36 f23897b;

    /* renamed from: b */
    public final /* synthetic */ String f23898b;

    /* renamed from: c */
    public final /* synthetic */ String f23899c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zu5(j36 j36, String str, String str2, Bundle bundle) {
        super(j36, true);
        this.f23897b = j36;
        this.f23898b = str;
        this.f23899c = str2;
        this.f23896a = bundle;
    }

    /* renamed from: a */
    public final void mo12479a() throws RemoteException {
        ((dt5) Preconditions.checkNotNull(this.f23897b.f14000a)).clearConditionalUserProperty(this.f23898b, this.f23899c, this.f23896a);
    }
}
