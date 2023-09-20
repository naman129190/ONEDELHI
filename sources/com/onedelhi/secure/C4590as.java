package com.onedelhi.secure;

import java.util.zip.CRC32;

/* renamed from: com.onedelhi.secure.as */
public class C4590as extends C5853jx {

    /* renamed from: a */
    public final CRC32 f25984a = new CRC32();

    public C4590as() {
        this.f30993a = 4;
        this.f30994a = "CRC32";
    }

    /* renamed from: a */
    public byte[] mo31122a() {
        long value = this.f25984a.getValue();
        byte[] bArr = {(byte) ((int) value), (byte) ((int) (value >>> 8)), (byte) ((int) (value >>> 16)), (byte) ((int) (value >>> 24))};
        this.f25984a.reset();
        return bArr;
    }

    /* renamed from: f */
    public void mo31123f(byte[] bArr, int i, int i2) {
        this.f25984a.update(bArr, i, i2);
    }
}
