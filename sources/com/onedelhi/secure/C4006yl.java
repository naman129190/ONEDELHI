package com.onedelhi.secure;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* renamed from: com.onedelhi.secure.yl */
public class C4006yl implements nk3<BitmapDrawable> {

    /* renamed from: a */
    public final C2355hm f23208a;

    /* renamed from: a */
    public final nk3<Bitmap> f23209a;

    public C4006yl(C2355hm hmVar, nk3<Bitmap> nk3) {
        this.f23208a = hmVar;
        this.f23209a = nk3;
    }

    @mr2
    /* renamed from: a */
    public vt0 mo14793a(@mr2 zw2 zw2) {
        return this.f23209a.mo14793a(zw2);
    }

    /* renamed from: c */
    public boolean mo14384b(@mr2 ck3<BitmapDrawable> ck3, @mr2 File file, @mr2 zw2 zw2) {
        return this.f23209a.mo14384b(new C2768lm(ck3.get().getBitmap(), this.f23208a), file, zw2);
    }
}
