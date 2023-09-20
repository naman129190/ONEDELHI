package com.onedelhi.secure;

import java.util.List;

public final class e27 extends ef5 {

    /* renamed from: a */
    public final h07 f11076a;

    public e27(h07 h07) {
        super("internal.logger");
        this.f11076a = h07;
        this.f11214a.put("log", new n17(this, false, true));
        this.f11214a.put(es2.f11408k0, new xw6(this, es2.f11408k0));
        ((ef5) this.f11214a.get(es2.f11408k0)).mo15169n("log", new n17(this, true, true));
        this.f11214a.put("unmonitored", new py6(this, "unmonitored"));
        ((ef5) this.f11214a.get("unmonitored")).mo15169n("log", new n17(this, false, false));
    }

    /* renamed from: a */
    public final qh5 mo14991a(w96 w96, List list) {
        return qh5.f19182a;
    }
}
