package com.onedelhi.secure;

import java.io.DataInputStream;
import java.io.IOException;

public final class te3 extends se3 {

    /* renamed from: i */
    public static final int f35542i = 5;

    /* renamed from: a */
    public final byte[] f35543a;

    /* renamed from: h */
    public int f35544h;

    public te3(int i, C4477aa aaVar) {
        byte[] a = aaVar.mo30487a(i - 5, false);
        this.f35543a = a;
        this.f35544h = a.length;
    }

    /* renamed from: f */
    public void mo44306f() throws IOException {
        int i = this.f35009f;
        if ((-16777216 & i) == 0) {
            try {
                byte[] bArr = this.f35543a;
                int i2 = this.f35544h;
                this.f35544h = i2 + 1;
                this.f35010g = (this.f35010g << 8) | (bArr[i2] & 255);
                this.f35009f = i << 8;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new s90();
            }
        }
    }

    /* renamed from: g */
    public boolean mo44974g() {
        return this.f35544h == this.f35543a.length && this.f35010g == 0;
    }

    /* renamed from: h */
    public void mo44975h(DataInputStream dataInputStream, int i) throws IOException {
        if (i < 5) {
            throw new s90();
        } else if (dataInputStream.readUnsignedByte() == 0) {
            this.f35010g = dataInputStream.readInt();
            this.f35009f = -1;
            int i2 = i - 5;
            byte[] bArr = this.f35543a;
            int length = bArr.length - i2;
            this.f35544h = length;
            dataInputStream.readFully(bArr, length, i2);
        } else {
            throw new s90();
        }
    }

    /* renamed from: i */
    public void mo44976i(C4477aa aaVar) {
        aaVar.mo30489e(this.f35543a);
    }
}
