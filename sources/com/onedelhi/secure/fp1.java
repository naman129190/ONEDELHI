package com.onedelhi.secure;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

public class fp1 {

    @sj3(21)
    /* renamed from: com.onedelhi.secure.fp1$a */
    public static class C2191a {
        @pn0
        /* renamed from: a */
        public static ColorStateList m15161a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        @pn0
        /* renamed from: b */
        public static PorterDuff.Mode m15162b(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        @pn0
        /* renamed from: c */
        public static void m15163c(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        @pn0
        /* renamed from: d */
        public static void m15164d(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }

    @ts2
    /* renamed from: a */
    public static ColorStateList m15157a(@mr2 ImageView imageView) {
        return C2191a.m15161a(imageView);
    }

    @ts2
    /* renamed from: b */
    public static PorterDuff.Mode m15158b(@mr2 ImageView imageView) {
        return C2191a.m15162b(imageView);
    }

    /* renamed from: c */
    public static void m15159c(@mr2 ImageView imageView, @ts2 ColorStateList colorStateList) {
        Drawable drawable;
        int i = Build.VERSION.SDK_INT;
        C2191a.m15163c(imageView, colorStateList);
        if (i == 21 && (drawable = imageView.getDrawable()) != null && C2191a.m15161a(imageView) != null) {
            if (drawable.isStateful()) {
                drawable.setState(imageView.getDrawableState());
            }
            imageView.setImageDrawable(drawable);
        }
    }

    /* renamed from: d */
    public static void m15160d(@mr2 ImageView imageView, @ts2 PorterDuff.Mode mode) {
        Drawable drawable;
        int i = Build.VERSION.SDK_INT;
        C2191a.m15164d(imageView, mode);
        if (i == 21 && (drawable = imageView.getDrawable()) != null && C2191a.m15161a(imageView) != null) {
            if (drawable.isStateful()) {
                drawable.setState(imageView.getDrawableState());
            }
            imageView.setImageDrawable(drawable);
        }
    }
}
