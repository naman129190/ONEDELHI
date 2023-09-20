package com.onedelhi.secure;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;

@sj3(api = 28)
/* renamed from: com.onedelhi.secure.em */
public final class C2066em extends xo1<Bitmap> {

    /* renamed from: b */
    public static final String f11287b = "BitmapImageDecoder";

    /* renamed from: a */
    public final C2355hm f11288a = new C2451im();

    /* renamed from: c */
    public ck3<Bitmap> mo15226c(ImageDecoder.Source source, int i, int i2, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener) throws IOException {
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, onHeaderDecodedListener);
        if (Log.isLoggable(f11287b, 2)) {
            Log.v(f11287b, "Decoded [" + decodeBitmap.getWidth() + "x" + decodeBitmap.getHeight() + "] for [" + i + "x" + i2 + "]");
        }
        return new C2768lm(decodeBitmap, this.f11288a);
    }
}
