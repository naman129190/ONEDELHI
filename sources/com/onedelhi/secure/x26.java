package com.onedelhi.secure;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

public final class x26 extends a16 {

    /* renamed from: a */
    public final /* synthetic */ Activity f22398a;

    /* renamed from: a */
    public final /* synthetic */ g36 f22399a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x26(g36 g36, Activity activity) {
        super(g36.f12412a, true);
        this.f22399a = g36;
        this.f22398a = activity;
    }

    /* renamed from: a */
    public final void mo12479a() throws RemoteException {
        ((dt5) Preconditions.checkNotNull(this.f22399a.f12412a.f14000a)).onActivityStopped(nt2.m23166l8(this.f22398a), this.f8561c);
    }
}
