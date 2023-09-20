package com.onedelhi.secure;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.onedelhi.secure.xd3;

/* renamed from: com.onedelhi.secure.lo */
public class C6039lo extends Drawable {

    /* renamed from: a */
    public int f31741a = -1;

    /* renamed from: a */
    public final Drawable f31742a;

    /* renamed from: b */
    public final Drawable f31743b;

    public C6039lo(Resources resources) {
        this.f31743b = resources.getDrawable(xd3.C7234c.amu_bubble_mask);
        this.f31742a = resources.getDrawable(xd3.C7234c.amu_bubble_shadow);
    }

    /* renamed from: a */
    public void mo40136a(int i) {
        this.f31741a = i;
    }

    public void draw(Canvas canvas) {
        this.f31743b.draw(canvas);
        canvas.drawColor(this.f31741a, PorterDuff.Mode.SRC_IN);
        this.f31742a.draw(canvas);
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(Rect rect) {
        return this.f31743b.getPadding(rect);
    }

    public void setAlpha(int i) {
        throw new UnsupportedOperationException();
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        this.f31743b.setBounds(i, i2, i3, i4);
        this.f31742a.setBounds(i, i2, i3, i4);
    }

    public void setBounds(Rect rect) {
        this.f31743b.setBounds(rect);
        this.f31742a.setBounds(rect);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException();
    }
}
