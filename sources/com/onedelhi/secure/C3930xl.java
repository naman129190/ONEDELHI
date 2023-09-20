package com.onedelhi.secure;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.IOException;

/* renamed from: com.onedelhi.secure.xl */
public class C3930xl<DataType> implements ik3<DataType, BitmapDrawable> {

    /* renamed from: a */
    public final Resources f22620a;

    /* renamed from: a */
    public final ik3<DataType, Bitmap> f22621a;

    public C3930xl(Context context, ik3<DataType, Bitmap> ik3) {
        this(context.getResources(), ik3);
    }

    @Deprecated
    public C3930xl(Resources resources, C2355hm hmVar, ik3<DataType, Bitmap> ik3) {
        this(resources, ik3);
    }

    public C3930xl(@mr2 Resources resources, @mr2 ik3<DataType, Bitmap> ik3) {
        this.f22620a = (Resources) g43.m15509d(resources);
        this.f22621a = (ik3) g43.m15509d(ik3);
    }

    /* renamed from: a */
    public ck3<BitmapDrawable> mo14336a(@mr2 DataType datatype, int i, int i2, @mr2 zw2 zw2) throws IOException {
        return z12.m32792h(this.f22620a, this.f22621a.mo14336a(datatype, i, i2, zw2));
    }

    /* renamed from: b */
    public boolean mo14337b(@mr2 DataType datatype, @mr2 zw2 zw2) throws IOException {
        return this.f22621a.mo14337b(datatype, zw2);
    }
}
