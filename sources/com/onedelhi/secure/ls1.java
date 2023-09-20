package com.onedelhi.secure;

import java.nio.ByteBuffer;

public final class ls1 extends C3841wj {
    /* renamed from: f */
    public ls1 mo19768f(int i, ByteBuffer byteBuffer) {
        mo26580b(i, 4, byteBuffer);
        return this;
    }

    /* renamed from: g */
    public int mo19769g(int i) {
        return this.f22138a.getInt(mo26579a(i));
    }

    /* renamed from: h */
    public long mo19770h(int i) {
        return ((long) mo19769g(i)) & ZipConstants.ZIP64_MAGIC;
    }
}
