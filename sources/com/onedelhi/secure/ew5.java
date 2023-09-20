package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

public final class ew5 extends qy6 {

    /* renamed from: a */
    public final ov5 f11733a;

    public ew5(ov5 ov5) {
        this.f11733a = ov5;
    }

    /* renamed from: c2 */
    public final void mo15618c2(LocationResult locationResult) throws RemoteException {
        this.f11733a.mo17373c().notifyListener(new sv5(this, locationResult));
    }

    /* renamed from: f6 */
    public final void mo15619f6() {
        this.f11733a.mo17373c().notifyListener(new aw5(this));
    }

    /* renamed from: m8 */
    public final ew5 mo15620m8(ListenerHolder listenerHolder) {
        this.f11733a.mo17372b(listenerHolder);
        return this;
    }

    /* renamed from: n4 */
    public final void mo15621n4() {
        this.f11733a.mo17373c().clear();
    }

    /* renamed from: r4 */
    public final void mo15622r4(LocationAvailability locationAvailability) throws RemoteException {
        this.f11733a.mo17373c().notifyListener(new wv5(this, locationAvailability));
    }
}
