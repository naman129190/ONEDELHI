package com.onedelhi.secure;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

public final class u26 extends a16 {

    /* renamed from: a */
    public final /* synthetic */ Activity f21204a;

    /* renamed from: a */
    public final /* synthetic */ g36 f21205a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u26(g36 g36, Activity activity) {
        super(g36.f12412a, true);
        this.f21205a = g36;
        this.f21204a = activity;
    }

    /* renamed from: a */
    public final void mo12479a() throws RemoteException {
        ((dt5) Preconditions.checkNotNull(this.f21205a.f12412a.f14000a)).onActivityPaused(nt2.m23166l8(this.f21204a), this.f8561c);
    }
}
