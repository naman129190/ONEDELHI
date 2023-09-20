package com.onedelhi.secure;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.C1173a;

/* renamed from: com.onedelhi.secure.nm */
public abstract class C2985nm implements sg4<Bitmap> {
    @mr2
    /* renamed from: b */
    public final ck3<Bitmap> mo13753b(@mr2 Context context, @mr2 ck3<Bitmap> ck3, int i, int i2) {
        if (oq4.m24035w(i, i2)) {
            C2355hm h = C1173a.m7529e(context).mo7457h();
            Bitmap bitmap = ck3.get();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap c = mo13312c(h, bitmap, i, i2);
            return bitmap.equals(c) ? ck3 : C2768lm.m20843f(c, h);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    /* renamed from: c */
    public abstract Bitmap mo13312c(@mr2 C2355hm hmVar, @mr2 Bitmap bitmap, int i, int i2);
}
