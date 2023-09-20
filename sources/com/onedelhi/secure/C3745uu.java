package com.onedelhi.secure;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.LIBRARY_GROUP})
/* renamed from: com.onedelhi.secure.uu */
public class C3745uu {
    /* renamed from: a */
    public static int m29589a(@mr2 Canvas canvas, float f, float f2, float f3, float f4, int i) {
        return Build.VERSION.SDK_INT > 21 ? canvas.saveLayerAlpha(f, f2, f3, f4, i) : canvas.saveLayerAlpha(f, f2, f3, f4, i, 31);
    }

    /* renamed from: b */
    public static int m29590b(@mr2 Canvas canvas, @ts2 RectF rectF, int i) {
        return Build.VERSION.SDK_INT > 21 ? canvas.saveLayerAlpha(rectF, i) : canvas.saveLayerAlpha(rectF, i, 31);
    }
}
