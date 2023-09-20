package com.onedelhi.secure;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

@sj3(21)
public final class my2 implements ik3<ParcelFileDescriptor, Bitmap> {

    /* renamed from: a */
    public final oo0 f16944a;

    public my2(oo0 oo0) {
        this.f16944a = oo0;
    }

    @ts2
    /* renamed from: c */
    public ck3<Bitmap> mo14336a(@mr2 ParcelFileDescriptor parcelFileDescriptor, int i, int i2, @mr2 zw2 zw2) throws IOException {
        return this.f16944a.mo22036d(parcelFileDescriptor, i, i2, zw2);
    }

    /* renamed from: d */
    public boolean mo14337b(@mr2 ParcelFileDescriptor parcelFileDescriptor, @mr2 zw2 zw2) {
        return this.f16944a.mo22041o(parcelFileDescriptor);
    }
}
