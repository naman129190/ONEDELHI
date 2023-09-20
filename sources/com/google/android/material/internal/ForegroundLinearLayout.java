package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ob4;
import com.onedelhi.secure.ri1;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.ts2;

@hl3({hl3.C2354a.LIBRARY_GROUP})
public class ForegroundLinearLayout extends LinearLayoutCompat {

    /* renamed from: H */
    public int f24026H;

    /* renamed from: a */
    public final Rect f24027a;

    /* renamed from: b */
    public final Rect f24028b;
    @ts2

    /* renamed from: b */
    public Drawable f24029b;

    /* renamed from: d */
    public boolean f24030d;

    /* renamed from: e */
    public boolean f24031e;

    public ForegroundLinearLayout(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public ForegroundLinearLayout(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ForegroundLinearLayout(@mr2 Context context, @ts2 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24027a = new Rect();
        this.f24028b = new Rect();
        this.f24026H = 119;
        this.f24030d = true;
        this.f24031e = false;
        TypedArray k = ob4.m59195k(context, attributeSet, fd3.C2165o.ForegroundLinearLayout, i, 0, new int[0]);
        this.f24026H = k.getInt(fd3.C2165o.ForegroundLinearLayout_android_foregroundGravity, this.f24026H);
        Drawable drawable = k.getDrawable(fd3.C2165o.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f24030d = k.getBoolean(fd3.C2165o.ForegroundLinearLayout_foregroundInsidePadding, true);
        k.recycle();
    }

    public void draw(@mr2 Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f24029b;
        if (drawable != null) {
            if (this.f24031e) {
                this.f24031e = false;
                Rect rect = this.f24027a;
                Rect rect2 = this.f24028b;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f24030d) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f24026H, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @sj3(21)
    @TargetApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f24029b;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f24029b;
        if (drawable != null && drawable.isStateful()) {
            this.f24029b.setState(getDrawableState());
        }
    }

    @ts2
    public Drawable getForeground() {
        return this.f24029b;
    }

    public int getForegroundGravity() {
        return this.f24026H;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f24029b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f24031e = z | this.f24031e;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f24031e = true;
    }

    public void setForeground(@ts2 Drawable drawable) {
        Drawable drawable2 = this.f24029b;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.f24029b);
            }
            this.f24029b = drawable;
            this.f24031e = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f24026H == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i) {
        if (this.f24026H != i) {
            if ((8388615 & i) == 0) {
                i |= ri1.f19869b;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f24026H = i;
            if (i == 119 && this.f24029b != null) {
                this.f24029b.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f24029b;
    }
}
