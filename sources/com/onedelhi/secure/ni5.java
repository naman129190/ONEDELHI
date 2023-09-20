package com.onedelhi.secure;

import com.google.android.gms.common.api.internal.ListenerHolder;

public final class ni5 implements ov5 {
    @mj1("this")

    /* renamed from: a */
    public ListenerHolder f17447a;

    public ni5(ListenerHolder listenerHolder) {
        this.f17447a = listenerHolder;
    }

    /* renamed from: a */
    public final void mo17371a() {
    }

    /* renamed from: b */
    public final synchronized void mo17372b(ListenerHolder listenerHolder) {
        ListenerHolder listenerHolder2 = this.f17447a;
        if (listenerHolder2 != listenerHolder) {
            listenerHolder2.clear();
            this.f17447a = listenerHolder;
        }
    }

    /* renamed from: c */
    public final synchronized ListenerHolder mo17373c() {
        return this.f17447a;
    }
}
