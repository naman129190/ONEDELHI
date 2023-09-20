package com.onedelhi.secure;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.IOException;
import java.nio.ByteBuffer;

@sj3(api = 28)
/* renamed from: com.onedelhi.secure.oq */
public final class C3082oq implements ik3<ByteBuffer, Bitmap> {

    /* renamed from: a */
    public final C2066em f18066a = new C2066em();

    @ts2
    /* renamed from: c */
    public ck3<Bitmap> mo14336a(@mr2 ByteBuffer byteBuffer, int i, int i2, @mr2 zw2 zw2) throws IOException {
        return this.f18066a.mo14336a(ImageDecoder.createSource(byteBuffer), i, i2, zw2);
    }

    /* renamed from: d */
    public boolean mo14337b(@mr2 ByteBuffer byteBuffer, @mr2 zw2 zw2) throws IOException {
        return true;
    }
}
