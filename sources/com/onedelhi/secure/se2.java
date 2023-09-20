package com.onedelhi.secure;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.LIBRARY_GROUP})
public class se2 {
    @mr2
    /* renamed from: a */
    public static Rect m27488a(@mr2 Context context, @C3982yb int i, int i2) {
        TypedArray k = ob4.m59195k(context, (AttributeSet) null, fd3.C2165o.MaterialAlertDialog, i, i2, new int[0]);
        int dimensionPixelSize = k.getDimensionPixelSize(fd3.C2165o.MaterialAlertDialog_backgroundInsetStart, context.getResources().getDimensionPixelSize(fd3.C2156f.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = k.getDimensionPixelSize(fd3.C2165o.MaterialAlertDialog_backgroundInsetTop, context.getResources().getDimensionPixelSize(fd3.C2156f.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = k.getDimensionPixelSize(fd3.C2165o.MaterialAlertDialog_backgroundInsetEnd, context.getResources().getDimensionPixelSize(fd3.C2156f.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = k.getDimensionPixelSize(fd3.C2165o.MaterialAlertDialog_backgroundInsetBottom, context.getResources().getDimensionPixelSize(fd3.C2156f.mtrl_alert_dialog_background_inset_bottom));
        k.recycle();
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            int i3 = dimensionPixelSize3;
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = i3;
        }
        return new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
    }

    @mr2
    /* renamed from: b */
    public static InsetDrawable m27489b(@ts2 Drawable drawable, @mr2 Rect rect) {
        return new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom);
    }
}
