package com.onedelhi.secure;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.onedelhi.secure.hl3;

@C2065el({@C1983dl(attribute = "android:tint", method = "setImageTintList", type = ImageView.class), @C1983dl(attribute = "android:tintMode", method = "setImageTintMode", type = ImageView.class)})
@hl3({hl3.C2354a.f13185a})
public class ep1 {
    @C1717al({"android:src"})
    /* renamed from: a */
    public static void m13933a(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
    }

    @C1717al({"android:src"})
    /* renamed from: b */
    public static void m13934b(ImageView imageView, Uri uri) {
        imageView.setImageURI(uri);
    }

    @C1717al({"android:src"})
    /* renamed from: c */
    public static void m13935c(ImageView imageView, String str) {
        imageView.setImageURI(str == null ? null : Uri.parse(str));
    }
}
