package com.onedelhi.secure;

import java.nio.ByteBuffer;

/* renamed from: com.onedelhi.secure.hr */
public final class C2358hr extends C3841wj {
    /* renamed from: f */
    public C2358hr mo17381f(int i, ByteBuffer byteBuffer) {
        mo26580b(i, 1, byteBuffer);
        return this;
    }

    /* renamed from: g */
    public byte mo17382g(int i) {
        return this.f22138a.get(mo26579a(i));
    }

    /* renamed from: h */
    public int mo17383h(int i) {
        return mo17382g(i) & 255;
    }
}
