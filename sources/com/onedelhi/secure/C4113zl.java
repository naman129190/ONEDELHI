package com.onedelhi.secure;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\b¨\u0006\u0005"}, d2 = {"Landroid/graphics/Bitmap;", "Landroid/content/res/Resources;", "resources", "Landroid/graphics/drawable/BitmapDrawable;", "a", "core-ktx_release"}, k = 2, mv = {1, 6, 0})
/* renamed from: com.onedelhi.secure.zl */
public final class C4113zl {
    @vr2
    /* renamed from: a */
    public static final BitmapDrawable m33234a(@vr2 Bitmap bitmap, @vr2 Resources resources) {
        jt1.m53777p(bitmap, "<this>");
        jt1.m53777p(resources, "resources");
        return new BitmapDrawable(resources, bitmap);
    }
}
