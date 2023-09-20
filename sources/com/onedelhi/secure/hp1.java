package com.onedelhi.secure;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class hp1 {
    @mr2
    /* renamed from: a */
    public <Z> gv4<ImageView, Z> mo17370a(@mr2 ImageView imageView, @mr2 Class<Z> cls) {
        if (Bitmap.class.equals(cls)) {
            return new C2178fm(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new bp0(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}
