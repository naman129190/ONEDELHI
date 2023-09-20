package com.onedelhi.secure;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: com.onedelhi.secure.mm */
public class C2864mm extends nc4<Bitmap> {
    public C2864mm(ImageView imageView) {
        super(imageView);
    }

    @Deprecated
    public C2864mm(ImageView imageView, boolean z) {
        super(imageView, z);
    }

    /* renamed from: B */
    public Drawable mo16131A(Bitmap bitmap) {
        return new BitmapDrawable(((ImageView) this.f12769a).getResources(), bitmap);
    }
}
