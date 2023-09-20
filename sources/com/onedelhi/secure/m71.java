package com.onedelhi.secure;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public class m71 extends Drawable {

    /* renamed from: a */
    public final Matrix f15934a;

    /* renamed from: a */
    public final RectF f15935a;

    /* renamed from: a */
    public Drawable f15936a;

    /* renamed from: a */
    public C2836a f15937a;

    /* renamed from: a */
    public boolean f15938a;

    /* renamed from: b */
    public final RectF f15939b;

    /* renamed from: com.onedelhi.secure.m71$a */
    public static final class C2836a extends Drawable.ConstantState {

        /* renamed from: a */
        public final int f15940a;

        /* renamed from: a */
        public final Drawable.ConstantState f15941a;

        /* renamed from: b */
        public final int f15942b;

        public C2836a(Drawable.ConstantState constantState, int i, int i2) {
            this.f15941a = constantState;
            this.f15940a = i;
            this.f15942b = i2;
        }

        public C2836a(C2836a aVar) {
            this(aVar.f15941a, aVar.f15940a, aVar.f15942b);
        }

        public int getChangingConfigurations() {
            return 0;
        }

        @mr2
        public Drawable newDrawable() {
            return new m71(this, this.f15941a.newDrawable());
        }

        @mr2
        public Drawable newDrawable(Resources resources) {
            return new m71(this, this.f15941a.newDrawable(resources));
        }
    }

    public m71(Drawable drawable, int i, int i2) {
        this(new C2836a(drawable.getConstantState(), i, i2), drawable);
    }

    public m71(C2836a aVar, Drawable drawable) {
        this.f15937a = (C2836a) g43.m15509d(aVar);
        this.f15936a = (Drawable) g43.m15509d(drawable);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.f15934a = new Matrix();
        this.f15935a = new RectF(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
        this.f15939b = new RectF();
    }

    /* renamed from: a */
    public final void mo20139a() {
        this.f15934a.setRectToRect(this.f15935a, this.f15939b, Matrix.ScaleToFit.CENTER);
    }

    public void clearColorFilter() {
        this.f15936a.clearColorFilter();
    }

    public void draw(@mr2 Canvas canvas) {
        canvas.save();
        canvas.concat(this.f15934a);
        this.f15936a.draw(canvas);
        canvas.restore();
    }

    @sj3(19)
    public int getAlpha() {
        return this.f15936a.getAlpha();
    }

    public Drawable.Callback getCallback() {
        return this.f15936a.getCallback();
    }

    public int getChangingConfigurations() {
        return this.f15936a.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        return this.f15937a;
    }

    @mr2
    public Drawable getCurrent() {
        return this.f15936a.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f15937a.f15942b;
    }

    public int getIntrinsicWidth() {
        return this.f15937a.f15940a;
    }

    public int getMinimumHeight() {
        return this.f15936a.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f15936a.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f15936a.getOpacity();
    }

    public boolean getPadding(@mr2 Rect rect) {
        return this.f15936a.getPadding(rect);
    }

    public void invalidateSelf() {
        super.invalidateSelf();
        this.f15936a.invalidateSelf();
    }

    @mr2
    public Drawable mutate() {
        if (!this.f15938a && super.mutate() == this) {
            this.f15936a = this.f15936a.mutate();
            this.f15937a = new C2836a(this.f15937a);
            this.f15938a = true;
        }
        return this;
    }

    public void scheduleSelf(@mr2 Runnable runnable, long j) {
        super.scheduleSelf(runnable, j);
        this.f15936a.scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f15936a.setAlpha(i);
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.f15939b.set((float) i, (float) i2, (float) i3, (float) i4);
        mo20139a();
    }

    public void setBounds(@mr2 Rect rect) {
        super.setBounds(rect);
        this.f15939b.set(rect);
        mo20139a();
    }

    public void setChangingConfigurations(int i) {
        this.f15936a.setChangingConfigurations(i);
    }

    public void setColorFilter(int i, @mr2 PorterDuff.Mode mode) {
        this.f15936a.setColorFilter(i, mode);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f15936a.setColorFilter(colorFilter);
    }

    @Deprecated
    public void setDither(boolean z) {
        this.f15936a.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f15936a.setFilterBitmap(z);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return this.f15936a.setVisible(z, z2);
    }

    public void unscheduleSelf(@mr2 Runnable runnable) {
        super.unscheduleSelf(runnable);
        this.f15936a.unscheduleSelf(runnable);
    }
}
