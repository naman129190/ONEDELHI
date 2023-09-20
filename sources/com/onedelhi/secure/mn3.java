package com.onedelhi.secure;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.Log;
import java.io.InputStream;

public final class mn3 {

    /* renamed from: a */
    public static final String f16259a = "RoundedBitmapDrawableFa";

    /* renamed from: com.onedelhi.secure.mn3$a */
    public static class C2871a extends ln3 {
        public C2871a(Resources resources, Bitmap bitmap) {
            super(resources, bitmap);
        }

        /* renamed from: f */
        public void mo19169f(int i, int i2, int i3, Rect rect, Rect rect2) {
            ri1.m26760b(i, i2, i3, rect, rect2, 0);
        }

        /* renamed from: h */
        public boolean mo19171h() {
            Bitmap bitmap = this.f15512a;
            return bitmap != null && C3639tl.m28802c(bitmap);
        }

        /* renamed from: o */
        public void mo19172o(boolean z) {
            Bitmap bitmap = this.f15512a;
            if (bitmap != null) {
                C3639tl.m28803d(bitmap, z);
                invalidateSelf();
            }
        }
    }

    @mr2
    /* renamed from: a */
    public static ln3 m21816a(@mr2 Resources resources, @ts2 Bitmap bitmap) {
        return new kn3(resources, bitmap);
    }

    @mr2
    /* renamed from: b */
    public static ln3 m21817b(@mr2 Resources resources, @mr2 InputStream inputStream) {
        ln3 a = m21816a(resources, BitmapFactory.decodeStream(inputStream));
        if (a.mo19717b() == null) {
            Log.w(f16259a, "RoundedBitmapDrawable cannot decode " + inputStream);
        }
        return a;
    }

    @mr2
    /* renamed from: c */
    public static ln3 m21818c(@mr2 Resources resources, @mr2 String str) {
        ln3 a = m21816a(resources, BitmapFactory.decodeFile(str));
        if (a.mo19717b() == null) {
            Log.w(f16259a, "RoundedBitmapDrawable cannot decode " + str);
        }
        return a;
    }
}
