package com.onedelhi.secure;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\b\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\b¨\u0006\u0007"}, d2 = {"Landroid/graphics/PorterDuff$Mode;", "Landroid/graphics/PorterDuffXfermode;", "b", "", "color", "Landroid/graphics/PorterDuffColorFilter;", "a", "core-ktx_release"}, k = 2, mv = {1, 6, 0})
public final class r33 {
    @vr2
    /* renamed from: a */
    public static final PorterDuffColorFilter m26305a(@vr2 PorterDuff.Mode mode, int i) {
        jt1.m53777p(mode, "<this>");
        return new PorterDuffColorFilter(i, mode);
    }

    @vr2
    /* renamed from: b */
    public static final PorterDuffXfermode m26306b(@vr2 PorterDuff.Mode mode) {
        jt1.m53777p(mode, "<this>");
        return new PorterDuffXfermode(mode);
    }
}
