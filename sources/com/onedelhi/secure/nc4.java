package com.onedelhi.secure;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;

public abstract class nc4<T> extends gp1<T> {
    public nc4(ImageView imageView) {
        super(imageView);
    }

    @Deprecated
    public nc4(ImageView imageView, boolean z) {
        super(imageView, z);
    }

    /* renamed from: A */
    public abstract Drawable mo16131A(T t);

    /* renamed from: y */
    public void mo13790y(@ts2 T t) {
        ViewGroup.LayoutParams layoutParams = ((ImageView) this.f12769a).getLayoutParams();
        Drawable A = mo16131A(t);
        if (layoutParams != null && layoutParams.width > 0 && layoutParams.height > 0) {
            A = new m71(A, layoutParams.width, layoutParams.height);
        }
        ((ImageView) this.f12769a).setImageDrawable(A);
    }
}
