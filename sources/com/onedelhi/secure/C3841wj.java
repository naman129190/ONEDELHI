package com.onedelhi.secure;

import java.nio.ByteBuffer;

/* renamed from: com.onedelhi.secure.wj */
public class C3841wj {

    /* renamed from: a */
    public int f22137a;

    /* renamed from: a */
    public ByteBuffer f22138a;

    /* renamed from: b */
    public int f22139b;

    /* renamed from: c */
    public int f22140c;

    /* renamed from: a */
    public int mo26579a(int i) {
        return this.f22137a + (i * this.f22140c);
    }

    /* renamed from: b */
    public void mo26580b(int i, int i2, ByteBuffer byteBuffer) {
        this.f22138a = byteBuffer;
        if (byteBuffer != null) {
            this.f22137a = i;
            this.f22139b = byteBuffer.getInt(i - 4);
            this.f22140c = i2;
            return;
        }
        this.f22137a = 0;
        this.f22139b = 0;
        this.f22140c = 0;
    }

    /* renamed from: c */
    public int mo26581c() {
        return this.f22137a;
    }

    /* renamed from: d */
    public int mo26582d() {
        return this.f22139b;
    }

    /* renamed from: e */
    public void mo26583e() {
        mo26580b(0, 0, (ByteBuffer) null);
    }
}
