package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RemoteCall;

public final class hp5 implements RemoteCall, ov5 {
    @mj1("this")

    /* renamed from: a */
    public ListenerHolder f13220a;

    /* renamed from: a */
    public final cp5 f13221a;

    /* renamed from: a */
    public final /* synthetic */ mp5 f13222a;
    @mj1("this")

    /* renamed from: a */
    public boolean f13223a = true;

    public hp5(mp5 mp5, ListenerHolder listenerHolder, cp5 cp5) {
        this.f13222a = mp5;
        this.f13220a = listenerHolder;
        this.f13221a = cp5;
    }

    /* renamed from: a */
    public final void mo17371a() {
        ListenerHolder.ListenerKey listenerKey;
        synchronized (this) {
            this.f13223a = false;
            listenerKey = this.f13220a.getListenerKey();
        }
        if (listenerKey != null) {
            this.f13222a.doUnregisterEventListener(listenerKey, 2441);
        }
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
        ListenerHolder.ListenerKey listenerKey;
        boolean z;
        xx5 xx5 = (xx5) obj;
        x94 x94 = (x94) obj2;
        synchronized (this) {
            listenerKey = this.f13220a.getListenerKey();
            z = this.f13223a;
            this.f13220a.clear();
        }
        if (listenerKey == null) {
            x94.mo26837c(Boolean.FALSE);
        } else {
            this.f13221a.mo13750a(xx5, listenerKey, z, x94);
        }
    }

    /* renamed from: b */
    public final synchronized void mo17372b(ListenerHolder listenerHolder) {
        ListenerHolder listenerHolder2 = this.f13220a;
        if (listenerHolder2 != listenerHolder) {
            listenerHolder2.clear();
            this.f13220a = listenerHolder;
        }
    }

    /* renamed from: c */
    public final synchronized ListenerHolder mo17373c() {
        return this.f13220a;
    }
}
