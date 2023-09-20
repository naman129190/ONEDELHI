package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.location.LocationResult;

public final class eu5 extends z62 {

    /* renamed from: a */
    public final /* synthetic */ x94 f11719a;

    /* renamed from: a */
    public final /* synthetic */ xx5 f11720a;

    public eu5(xx5 xx5, x94 x94) {
        this.f11720a = xx5;
        this.f11719a = x94;
    }

    /* renamed from: b */
    public final void mo7567b(LocationResult locationResult) {
        this.f11719a.mo26839e(locationResult.mo10563M2());
        try {
            this.f11720a.mo27125e(ListenerHolders.createListenerKey(this, "GetCurrentLocation"), false, new x94());
        } catch (RemoteException unused) {
        }
    }
}
