package com.onedelhi.secure;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

public final class d36 extends a16 {

    /* renamed from: a */
    public final /* synthetic */ Activity f10608a;

    /* renamed from: a */
    public final /* synthetic */ g36 f10609a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d36(g36 g36, Activity activity) {
        super(g36.f12412a, true);
        this.f10609a = g36;
        this.f10608a = activity;
    }

    /* renamed from: a */
    public final void mo12479a() throws RemoteException {
        ((dt5) Preconditions.checkNotNull(this.f10609a.f12412a.f14000a)).onActivityDestroyed(nt2.m23166l8(this.f10608a), this.f8561c);
    }
}
