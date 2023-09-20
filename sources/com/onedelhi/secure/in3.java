package com.onedelhi.secure;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

@sj3(21)
public class in3 extends Drawable {

    /* renamed from: a */
    public float f13757a;

    /* renamed from: a */
    public ColorStateList f13758a;

    /* renamed from: a */
    public final Paint f13759a;

    /* renamed from: a */
    public PorterDuff.Mode f13760a = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public PorterDuffColorFilter f13761a;

    /* renamed from: a */
    public final Rect f13762a;

    /* renamed from: a */
    public final RectF f13763a;

    /* renamed from: a */
    public boolean f13764a = false;

    /* renamed from: b */
    public float f13765b;

    /* renamed from: b */
    public ColorStateList f13766b;

    /* renamed from: b */
    public boolean f13767b = true;

    public in3(ColorStateList colorStateList, float f) {
        this.f13757a = f;
        this.f13759a = new Paint(5);
        mo17857e(colorStateList);
        this.f13763a = new RectF();
        this.f13762a = new Rect();
    }

    /* renamed from: a */
    public final PorterDuffColorFilter mo17852a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: b */
    public ColorStateList mo17853b() {
        return this.f13758a;
    }

    /* renamed from: c */
    public float mo17854c() {
        return this.f13765b;
    }

    /* renamed from: d */
    public float mo17855d() {
        return this.f13757a;
    }

    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f13759a;
        if (this.f13761a == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f13761a);
            z = true;
        }
        RectF rectF = this.f13763a;
        float f = this.f13757a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter((ColorFilter) null);
        }
    }

    /* renamed from: e */
    public final void mo17857e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f13758a = colorStateList;
        this.f13759a.setColor(colorStateList.getColorForState(getState(), this.f13758a.getDefaultColor()));
    }

    /* renamed from: f */
    public void mo17858f(@ts2 ColorStateList colorStateList) {
        mo17857e(colorStateList);
        invalidateSelf();
    }

    /* renamed from: g */
    public void mo17859g(float f, boolean z, boolean z2) {
        if (f != this.f13765b || this.f13764a != z || this.f13767b != z2) {
            this.f13765b = f;
            this.f13764a = z;
            this.f13767b = z2;
            mo17863i((Rect) null);
            invalidateSelf();
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f13762a, this.f13757a);
    }

    /* renamed from: h */
    public void mo17862h(float f) {
        if (f != this.f13757a) {
            this.f13757a = f;
            mo17863i((Rect) null);
            invalidateSelf();
        }
    }

    /* renamed from: i */
    public final void mo17863i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f13763a.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f13762a.set(rect);
        if (this.f13764a) {
            float d = jn3.m18671d(this.f13765b, this.f13757a, this.f13767b);
            this.f13762a.inset((int) Math.ceil((double) jn3.m18670c(this.f13765b, this.f13757a, this.f13767b)), (int) Math.ceil((double) d));
            this.f13763a.set(this.f13762a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f13758a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f13766b
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.f13758a
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x0014:
            boolean r0 = super.isStateful()
            if (r0 == 0) goto L_0x001c
        L_0x001a:
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.in3.isStateful():boolean");
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        mo17863i(rect);
    }

    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f13758a;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f13759a.getColor();
        if (z) {
            this.f13759a.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f13766b;
        if (colorStateList2 == null || (mode = this.f13760a) == null) {
            return z;
        }
        this.f13761a = mo17852a(colorStateList2, mode);
        return true;
    }

    public void setAlpha(int i) {
        this.f13759a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f13759a.setColorFilter(colorFilter);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f13766b = colorStateList;
        this.f13761a = mo17852a(colorStateList, this.f13760a);
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f13760a = mode;
        this.f13761a = mo17852a(this.f13766b, mode);
        invalidateSelf();
    }
}
