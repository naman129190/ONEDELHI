package com.onedelhi.secure;

import java.io.IOException;
import java.io.OutputStream;

public final class we3 extends ve3 {

    /* renamed from: a */
    public final byte[] f36968a;

    /* renamed from: i */
    public int f36969i;

    public we3(int i, C4477aa aaVar) {
        this.f36968a = aaVar.mo30487a(i, false);
        mo46134l();
    }

    /* renamed from: f */
    public int mo46132f() {
        try {
            super.mo46132f();
            return this.f36969i;
        } catch (IOException unused) {
            throw new Error();
        }
    }

    /* renamed from: j */
    public int mo46133j() {
        return ((this.f36969i + ((int) this.f36509b)) + 5) - 1;
    }

    /* renamed from: l */
    public void mo46134l() {
        super.mo46134l();
        this.f36969i = 0;
    }

    /* renamed from: n */
    public void mo46136n(int i) {
        byte[] bArr = this.f36968a;
        int i2 = this.f36969i;
        this.f36969i = i2 + 1;
        bArr[i2] = (byte) i;
    }

    /* renamed from: o */
    public void mo46705o(C4477aa aaVar) {
        aaVar.mo30489e(this.f36968a);
    }

    /* renamed from: p */
    public void mo46706p(OutputStream outputStream) throws IOException {
        outputStream.write(this.f36968a, 0, this.f36969i);
    }
}
