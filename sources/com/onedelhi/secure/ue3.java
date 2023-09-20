package com.onedelhi.secure;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class ue3 extends se3 {

    /* renamed from: a */
    public final DataInputStream f36049a;

    public ue3(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f36049a = dataInputStream;
        if (dataInputStream.readUnsignedByte() == 0) {
            this.f35010g = dataInputStream.readInt();
            this.f35009f = -1;
            return;
        }
        throw new s90();
    }

    /* renamed from: f */
    public void mo44306f() throws IOException {
        if ((this.f35009f & -16777216) == 0) {
            this.f35010g = (this.f35010g << 8) | this.f36049a.readUnsignedByte();
            this.f35009f <<= 8;
        }
    }

    /* renamed from: g */
    public boolean mo45576g() {
        return this.f35010g == 0;
    }
}
