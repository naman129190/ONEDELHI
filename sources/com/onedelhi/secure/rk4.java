package com.onedelhi.secure;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.LIBRARY_GROUP})
public class rk4 {
    @ts2
    /* renamed from: a */
    public static Typeface m63712a(@mr2 Context context, @mr2 Typeface typeface) {
        return m63713b(context.getResources().getConfiguration(), typeface);
    }

    @ts2
    /* renamed from: b */
    public static Typeface m63713b(@mr2 Configuration configuration, @mr2 Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT < 31 || (i = configuration.fontWeightAdjustment) == Integer.MAX_VALUE || i == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, rf2.m26699e(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }
}
