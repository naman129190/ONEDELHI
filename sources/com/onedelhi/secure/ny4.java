package com.onedelhi.secure;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

public class ny4 extends Drawable implements Drawable.Callback, my4, we4 {

    /* renamed from: b */
    public static final PorterDuff.Mode f17622b = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public PorterDuff.Mode f17623a;

    /* renamed from: a */
    public Drawable f17624a;

    /* renamed from: a */
    public py4 f17625a;

    /* renamed from: b */
    public boolean f17626b;

    /* renamed from: c */
    public boolean f17627c;

    /* renamed from: n */
    public int f17628n;

    public ny4(@ts2 Drawable drawable) {
        this.f17625a = mo21509d();
        mo20812b(drawable);
    }

    public ny4(@mr2 py4 py4, @ts2 Resources resources) {
        this.f17625a = py4;
        mo21511e(resources);
    }

    /* renamed from: a */
    public final Drawable mo20811a() {
        return this.f17624a;
    }

    /* renamed from: b */
    public final void mo20812b(Drawable drawable) {
        Drawable drawable2 = this.f17624a;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f17624a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            py4 py4 = this.f17625a;
            if (py4 != null) {
                py4.f18840a = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* renamed from: c */
    public boolean mo21508c() {
        return true;
    }

    @mr2
    /* renamed from: d */
    public final py4 mo21509d() {
        return new py4(this.f17625a);
    }

    public void draw(@mr2 Canvas canvas) {
        this.f17624a.draw(canvas);
    }

    /* renamed from: e */
    public final void mo21511e(@ts2 Resources resources) {
        Drawable.ConstantState constantState;
        py4 py4 = this.f17625a;
        if (py4 != null && (constantState = py4.f18840a) != null) {
            mo20812b(constantState.newDrawable(resources));
        }
    }

    /* renamed from: f */
    public final boolean mo21512f(int[] iArr) {
        if (!mo21508c()) {
            return false;
        }
        py4 py4 = this.f17625a;
        ColorStateList colorStateList = py4.f18838a;
        PorterDuff.Mode mode = py4.f18839a;
        if (colorStateList == null || mode == null) {
            this.f17626b = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f17626b && colorForState == this.f17628n && mode == this.f17623a)) {
                setColorFilter(colorForState, mode);
                this.f17628n = colorForState;
                this.f17623a = mode;
                this.f17626b = true;
                return true;
            }
        }
        return false;
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        py4 py4 = this.f17625a;
        return changingConfigurations | (py4 != null ? py4.getChangingConfigurations() : 0) | this.f17624a.getChangingConfigurations();
    }

    @ts2
    public Drawable.ConstantState getConstantState() {
        py4 py4 = this.f17625a;
        if (py4 == null || !py4.mo22783a()) {
            return null;
        }
        this.f17625a.f18837a = getChangingConfigurations();
        return this.f17625a;
    }

    @mr2
    public Drawable getCurrent() {
        return this.f17624a.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f17624a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f17624a.getIntrinsicWidth();
    }

    @sj3(23)
    public int getLayoutDirection() {
        return wo0.m30977f(this.f17624a);
    }

    public int getMinimumHeight() {
        return this.f17624a.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f17624a.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f17624a.getOpacity();
    }

    public boolean getPadding(@mr2 Rect rect) {
        return this.f17624a.getPadding(rect);
    }

    @mr2
    public int[] getState() {
        return this.f17624a.getState();
    }

    public Region getTransparentRegion() {
        return this.f17624a.getTransparentRegion();
    }

    public void invalidateDrawable(@mr2 Drawable drawable) {
        invalidateSelf();
    }

    @sj3(19)
    public boolean isAutoMirrored() {
        return wo0.m30979h(this.f17624a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f17625a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = r1.mo21508c()
            if (r0 == 0) goto L_0x000d
            com.onedelhi.secure.py4 r0 = r1.f17625a
            if (r0 == 0) goto L_0x000d
            android.content.res.ColorStateList r0 = r0.f18838a
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001e
        L_0x0016:
            android.graphics.drawable.Drawable r0 = r1.f17624a
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0020
        L_0x001e:
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ny4.isStateful():boolean");
    }

    public void jumpToCurrentState() {
        this.f17624a.jumpToCurrentState();
    }

    @mr2
    public Drawable mutate() {
        if (!this.f17627c && super.mutate() == this) {
            this.f17625a = mo21509d();
            Drawable drawable = this.f17624a;
            if (drawable != null) {
                drawable.mutate();
            }
            py4 py4 = this.f17625a;
            if (py4 != null) {
                Drawable drawable2 = this.f17624a;
                py4.f18840a = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f17627c = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f17624a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @sj3(23)
    public boolean onLayoutDirectionChanged(int i) {
        return wo0.m30984m(this.f17624a, i);
    }

    public boolean onLevelChange(int i) {
        return this.f17624a.setLevel(i);
    }

    public void scheduleDrawable(@mr2 Drawable drawable, @mr2 Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f17624a.setAlpha(i);
    }

    @sj3(19)
    public void setAutoMirrored(boolean z) {
        wo0.m30981j(this.f17624a, z);
    }

    public void setChangingConfigurations(int i) {
        this.f17624a.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f17624a.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f17624a.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f17624a.setFilterBitmap(z);
    }

    public boolean setState(@mr2 int[] iArr) {
        return mo21512f(iArr) || this.f17624a.setState(iArr);
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f17625a.f18838a = colorStateList;
        mo21512f(getState());
    }

    public void setTintMode(@mr2 PorterDuff.Mode mode) {
        this.f17625a.f18839a = mode;
        mo21512f(getState());
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f17624a.setVisible(z, z2);
    }

    public void unscheduleDrawable(@mr2 Drawable drawable, @mr2 Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
