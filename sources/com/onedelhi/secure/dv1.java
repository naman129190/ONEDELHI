package com.onedelhi.secure;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class dv1 {

    /* renamed from: a */
    public final Map<ky1, ou0<?>> f10948a = new HashMap();

    /* renamed from: b */
    public final Map<ky1, ou0<?>> f10949b = new HashMap();

    /* renamed from: a */
    public ou0<?> mo14886a(ky1 ky1, boolean z) {
        return mo14888c(z).get(ky1);
    }

    @hw4
    /* renamed from: b */
    public Map<ky1, ou0<?>> mo14887b() {
        return Collections.unmodifiableMap(this.f10948a);
    }

    /* renamed from: c */
    public final Map<ky1, ou0<?>> mo14888c(boolean z) {
        return z ? this.f10949b : this.f10948a;
    }

    /* renamed from: d */
    public void mo14889d(ky1 ky1, ou0<?> ou0) {
        mo14888c(ou0.mo22079q()).put(ky1, ou0);
    }

    /* renamed from: e */
    public void mo14890e(ky1 ky1, ou0<?> ou0) {
        Map<ky1, ou0<?>> c = mo14888c(ou0.mo22079q());
        if (ou0.equals(c.get(ky1))) {
            c.remove(ky1);
        }
    }
}
