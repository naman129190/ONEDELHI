package com.onedelhi.secure;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationAvailability;

public final class wv5 implements ListenerHolder.Notifier {

    /* renamed from: a */
    public final /* synthetic */ LocationAvailability f22328a;

    public wv5(ew5 ew5, LocationAvailability locationAvailability) {
        this.f22328a = locationAvailability;
    }

    public final /* synthetic */ void notifyListener(Object obj) {
        ((z62) obj).mo27816a(this.f22328a);
    }

    public final void onNotifyListenerFailed() {
    }
}
