package com.onedelhi.secure;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

public abstract class ep0<T extends Drawable> implements ck3<T>, kq1 {

    /* renamed from: a */
    public final T f11314a;

    public ep0(T t) {
        this.f11314a = (Drawable) g43.m15509d(t);
    }

    /* renamed from: b */
    public void mo13178b() {
        Bitmap h;
        T t = this.f11314a;
        if (t instanceof BitmapDrawable) {
            h = ((BitmapDrawable) t).getBitmap();
        } else if (t instanceof ng1) {
            h = ((ng1) t).mo21239h();
        } else {
            return;
        }
        h.prepareToDraw();
    }

    @mr2
    /* renamed from: e */
    public final T get() {
        Drawable.ConstantState constantState = this.f11314a.getConstantState();
        return constantState == null ? this.f11314a : constantState.newDrawable();
    }
}
