package com.onedelhi.secure;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;

public final class gp0 {

    /* renamed from: a */
    public static final C2355hm f12688a = new C2266a();

    /* renamed from: a */
    public static final String f12689a = "DrawableToBitmap";

    /* renamed from: com.onedelhi.secure.gp0$a */
    public class C2266a extends C2451im {
        /* renamed from: c */
        public void mo16798c(Bitmap bitmap) {
        }
    }

    @ts2
    /* renamed from: a */
    public static ck3<Bitmap> m16022a(C2355hm hmVar, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            bitmap = m16023b(hmVar, current, i, i2);
            z = true;
        } else {
            bitmap = null;
        }
        if (!z) {
            hmVar = f12688a;
        }
        return C2768lm.m20843f(bitmap, hmVar);
    }

    @ts2
    /* renamed from: b */
    public static Bitmap m16023b(C2355hm hmVar, Drawable drawable, int i, int i2) {
        if (i == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable(f12689a, 5)) {
                Log.w(f12689a, "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        } else if (i2 != Integer.MIN_VALUE || drawable.getIntrinsicHeight() > 0) {
            if (drawable.getIntrinsicWidth() > 0) {
                i = drawable.getIntrinsicWidth();
            }
            if (drawable.getIntrinsicHeight() > 0) {
                i2 = drawable.getIntrinsicHeight();
            }
            Lock i3 = ug4.m29337i();
            i3.lock();
            Bitmap d = hmVar.mo17343d(i, i2, Bitmap.Config.ARGB_8888);
            try {
                Canvas canvas = new Canvas(d);
                drawable.setBounds(0, 0, i, i2);
                drawable.draw(canvas);
                canvas.setBitmap((Bitmap) null);
                return d;
            } finally {
                i3.unlock();
            }
        } else {
            if (Log.isLoggable(f12689a, 5)) {
                Log.w(f12689a, "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        }
    }
}
