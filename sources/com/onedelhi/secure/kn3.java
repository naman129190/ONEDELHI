package com.onedelhi.secure;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;

@sj3(21)
public class kn3 extends ln3 {
    public kn3(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    /* renamed from: f */
    public void mo19169f(int i, int i2, int i3, Rect rect, Rect rect2) {
        Gravity.apply(i, i2, i3, rect, rect2, 0);
    }

    public void getOutline(@mr2 Outline outline) {
        mo19742t();
        outline.setRoundRect(this.f15516a, mo19718c());
    }

    /* renamed from: h */
    public boolean mo19171h() {
        Bitmap bitmap = this.f15512a;
        return bitmap != null && bitmap.hasMipMap();
    }

    /* renamed from: o */
    public void mo19172o(boolean z) {
        Bitmap bitmap = this.f15512a;
        if (bitmap != null) {
            bitmap.setHasMipMap(z);
            invalidateSelf();
        }
    }
}
