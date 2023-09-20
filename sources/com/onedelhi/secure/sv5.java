package com.onedelhi.secure;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationResult;

public final class sv5 implements ListenerHolder.Notifier {

    /* renamed from: a */
    public final /* synthetic */ LocationResult f20547a;

    public sv5(ew5 ew5, LocationResult locationResult) {
        this.f20547a = locationResult;
    }

    public final /* synthetic */ void notifyListener(Object obj) {
        ((z62) obj).mo7567b(this.f20547a);
    }

    public final void onNotifyListenerFailed() {
    }
}
