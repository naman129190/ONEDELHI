package com.onedelhi.secure;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
public class mp0 extends Drawable implements Drawable.Callback {

    /* renamed from: a */
    public Drawable f16266a;

    public mp0(Drawable drawable) {
        mo20546b(drawable);
    }

    /* renamed from: a */
    public Drawable mo20545a() {
        return this.f16266a;
    }

    /* renamed from: b */
    public void mo20546b(Drawable drawable) {
        Drawable drawable2 = this.f16266a;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f16266a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f16266a.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f16266a.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f16266a.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f16266a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f16266a.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f16266a.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f16266a.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f16266a.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f16266a.getPadding(rect);
    }

    public int[] getState() {
        return this.f16266a.getState();
    }

    public Region getTransparentRegion() {
        return this.f16266a.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return wo0.m30979h(this.f16266a);
    }

    public boolean isStateful() {
        return this.f16266a.isStateful();
    }

    public void jumpToCurrentState() {
        this.f16266a.jumpToCurrentState();
    }

    public void onBoundsChange(Rect rect) {
        this.f16266a.setBounds(rect);
    }

    public boolean onLevelChange(int i) {
        return this.f16266a.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f16266a.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        wo0.m30981j(this.f16266a, z);
    }

    public void setChangingConfigurations(int i) {
        this.f16266a.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f16266a.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f16266a.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f16266a.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        wo0.m30982k(this.f16266a, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        wo0.m30983l(this.f16266a, i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f16266a.setState(iArr);
    }

    public void setTint(int i) {
        wo0.m30985n(this.f16266a, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        wo0.m30986o(this.f16266a, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        wo0.m30987p(this.f16266a, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f16266a.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
