package com.onedelhi.secure;

import android.location.Location;
import com.google.android.gms.common.api.internal.ListenerHolder;

public final class iw5 implements ListenerHolder.Notifier {

    /* renamed from: a */
    public final /* synthetic */ Location f13896a;

    public iw5(qw5 qw5, Location location) {
        this.f13896a = location;
    }

    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        ((c72) obj).onLocationChanged(this.f13896a);
    }

    public final void onNotifyListenerFailed() {
    }
}
