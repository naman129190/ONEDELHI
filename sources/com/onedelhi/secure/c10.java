package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0003H\b¨\u0006\u0005"}, d2 = {"", "Landroid/graphics/drawable/ColorDrawable;", "a", "Landroid/graphics/Color;", "b", "core-ktx_release"}, k = 2, mv = {1, 6, 0})
public final class c10 {
    @vr2
    /* renamed from: a */
    public static final ColorDrawable m12187a(@d10 int i) {
        return new ColorDrawable(i);
    }

    @sj3(26)
    @SuppressLint({"ClassVerificationFailure"})
    @vr2
    /* renamed from: b */
    public static final ColorDrawable m12188b(@vr2 Color color) {
        jt1.m53777p(color, "<this>");
        return new ColorDrawable(color.toArgb());
    }
}
