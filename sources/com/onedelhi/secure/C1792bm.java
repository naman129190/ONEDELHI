package com.onedelhi.secure;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: com.onedelhi.secure.bm */
public class C1792bm implements xk3<Bitmap, BitmapDrawable> {

    /* renamed from: a */
    public final Resources f9888a;

    public C1792bm(@mr2 Context context) {
        this(context.getResources());
    }

    public C1792bm(@mr2 Resources resources) {
        this.f9888a = (Resources) g43.m15509d(resources);
    }

    @Deprecated
    public C1792bm(@mr2 Resources resources, C2355hm hmVar) {
        this(resources);
    }

    @ts2
    /* renamed from: a */
    public ck3<BitmapDrawable> mo13752a(@mr2 ck3<Bitmap> ck3, @mr2 zw2 zw2) {
        return z12.m32792h(this.f9888a, ck3);
    }
}
