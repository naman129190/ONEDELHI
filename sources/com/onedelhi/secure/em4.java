package com.onedelhi.secure;

import java.util.Map;

public final class em4 implements uy4 {

    /* renamed from: a */
    public final uq0 f28011a = new uq0();

    /* renamed from: a */
    public C6190nl mo35510a(String str, C7363yi yiVar, int i, int i2) {
        return mo35511b(str, yiVar, i, i2, (Map<ut0, ?>) null);
    }

    /* renamed from: b */
    public C6190nl mo35511b(String str, C7363yi yiVar, int i, int i2, Map<ut0, ?> map) {
        if (yiVar == C7363yi.UPC_A) {
            return this.f28011a.mo35511b(qa0.f34045b.concat(String.valueOf(str)), C7363yi.EAN_13, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(yiVar)));
    }
}
