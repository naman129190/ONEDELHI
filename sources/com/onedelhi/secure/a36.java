package com.onedelhi.secure;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

public final class a36 extends a16 {

    /* renamed from: a */
    public final /* synthetic */ Activity f8686a;

    /* renamed from: a */
    public final /* synthetic */ g36 f8687a;

    /* renamed from: a */
    public final /* synthetic */ lr5 f8688a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a36(g36 g36, Activity activity, lr5 lr5) {
        super(g36.f12412a, true);
        this.f8687a = g36;
        this.f8686a = activity;
        this.f8688a = lr5;
    }

    /* renamed from: a */
    public final void mo12479a() throws RemoteException {
        ((dt5) Preconditions.checkNotNull(this.f8687a.f12412a.f14000a)).onActivitySaveInstanceState(nt2.m23166l8(this.f8686a), this.f8688a, this.f8561c);
    }
}
