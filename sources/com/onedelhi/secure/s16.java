package com.onedelhi.secure;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

public final class s16 extends a16 {

    /* renamed from: a */
    public final /* synthetic */ Activity f20186a;

    /* renamed from: a */
    public final /* synthetic */ g36 f20187a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s16(g36 g36, Activity activity) {
        super(g36.f12412a, true);
        this.f20187a = g36;
        this.f20186a = activity;
    }

    /* renamed from: a */
    public final void mo12479a() throws RemoteException {
        ((dt5) Preconditions.checkNotNull(this.f20187a.f12412a.f14000a)).onActivityResumed(nt2.m23166l8(this.f20186a), this.f8561c);
    }
}
