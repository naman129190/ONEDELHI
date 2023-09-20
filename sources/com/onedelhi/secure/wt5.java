package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;

public final /* synthetic */ class wt5 implements ov2 {

    /* renamed from: a */
    public final /* synthetic */ ListenerHolder.ListenerKey f22292a;

    /* renamed from: a */
    public final /* synthetic */ xx5 f22293a;

    public /* synthetic */ wt5(xx5 xx5, ListenerHolder.ListenerKey listenerKey) {
        this.f22293a = xx5;
        this.f22292a = listenerKey;
    }

    /* renamed from: b */
    public final void mo22063b() {
        try {
            this.f22293a.mo27125e(this.f22292a, true, new x94());
        } catch (RemoteException unused) {
        }
    }
}
