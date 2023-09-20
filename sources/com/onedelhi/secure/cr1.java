package com.onedelhi.secure;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.IOException;
import java.io.InputStream;

@sj3(api = 28)
public final class cr1 implements ik3<InputStream, Bitmap> {

    /* renamed from: a */
    public final C2066em f10466a = new C2066em();

    @ts2
    /* renamed from: c */
    public ck3<Bitmap> mo14336a(@mr2 InputStream inputStream, int i, int i2, @mr2 zw2 zw2) throws IOException {
        return this.f10466a.mo14336a(ImageDecoder.createSource(C3733uq.m29492b(inputStream)), i, i2, zw2);
    }

    /* renamed from: d */
    public boolean mo14337b(@mr2 InputStream inputStream, @mr2 zw2 zw2) throws IOException {
        return true;
    }
}
