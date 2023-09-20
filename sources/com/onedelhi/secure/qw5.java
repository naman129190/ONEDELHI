package com.onedelhi.secure;

import android.location.Location;
import com.google.android.gms.common.api.internal.ListenerHolder;

public final class qw5 extends f27 {

    /* renamed from: a */
    public final ov5 f19492a;

    public qw5(ov5 ov5) {
        this.f19492a = ov5;
    }

    /* renamed from: c0 */
    public final void mo21562c0(Location location) {
        this.f19492a.mo17373c().notifyListener(new iw5(this, location));
    }

    /* renamed from: m8 */
    public final qw5 mo23468m8(ListenerHolder listenerHolder) {
        this.f19492a.mo17372b(listenerHolder);
        return this;
    }

    /* renamed from: q3 */
    public final void mo23469q3() {
        this.f19492a.mo17373c().clear();
    }

    /* renamed from: x */
    public final void mo21563x() {
        this.f19492a.mo17373c().notifyListener(new mw5(this));
    }
}
