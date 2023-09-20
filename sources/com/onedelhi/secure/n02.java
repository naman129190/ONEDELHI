package com.onedelhi.secure;

public class n02 extends l02 implements h31 {

    /* renamed from: a */
    public final p02 f32335a;

    /* renamed from: a */
    public final byte[] f32336a;

    public n02(p02 p02) {
        byte[] bArr = new byte[1];
        this.f32336a = bArr;
        if (p02.mo42335r() == null) {
            if (p02.mo42332o() == 0) {
                bArr[0] = 0;
            } else {
                bArr[0] = (byte) (t02.m65078m(Math.max(p02.mo42328k(), 4096) - 1) - 23);
            }
            this.f32335a = (p02) p02.clone();
            return;
        }
        throw new IllegalArgumentException("XZ doesn't support a preset dictionary for now");
    }

    /* renamed from: b */
    public boolean mo31742b() {
        return true;
    }

    /* renamed from: e */
    public long mo31743e() {
        return 33;
    }

    /* renamed from: g */
    public q31 mo31744g(q31 q31, C4477aa aaVar) {
        return this.f32335a.mo37824i(q31, aaVar);
    }

    /* renamed from: i */
    public byte[] mo31745i() {
        return this.f32336a;
    }
}
