package com.onedelhi.secure;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

public final class p16 extends a16 {

    /* renamed from: a */
    public final /* synthetic */ Activity f18287a;

    /* renamed from: a */
    public final /* synthetic */ g36 f18288a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p16(g36 g36, Activity activity) {
        super(g36.f12412a, true);
        this.f18288a = g36;
        this.f18287a = activity;
    }

    /* renamed from: a */
    public final void mo12479a() throws RemoteException {
        ((dt5) Preconditions.checkNotNull(this.f18288a.f12412a.f14000a)).onActivityStarted(nt2.m23166l8(this.f18287a), this.f8561c);
    }
}
