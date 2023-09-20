package com.onedelhi.secure;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* renamed from: com.onedelhi.secure.sl */
public class C3526sl implements xk3<Bitmap, byte[]> {

    /* renamed from: a */
    public final int f20422a;

    /* renamed from: a */
    public final Bitmap.CompressFormat f20423a;

    public C3526sl() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    public C3526sl(@mr2 Bitmap.CompressFormat compressFormat, int i) {
        this.f20423a = compressFormat;
        this.f20422a = i;
    }

    @ts2
    /* renamed from: a */
    public ck3<byte[]> mo13752a(@mr2 ck3<Bitmap> ck3, @mr2 zw2 zw2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ck3.get().compress(this.f20423a, this.f20422a, byteArrayOutputStream);
        ck3.mo13177a();
        return new C2540jr(byteArrayOutputStream.toByteArray());
    }
}
