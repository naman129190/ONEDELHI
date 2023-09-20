package com.onedelhi.secure;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

@sj3(21)
public class oy4 extends ny4 {

    /* renamed from: a */
    public static Method f18254a = null;

    /* renamed from: b */
    public static final String f18255b = "WrappedDrawableApi21";

    public oy4(Drawable drawable) {
        super(drawable);
        mo22179g();
    }

    public oy4(py4 py4, Resources resources) {
        super(py4, resources);
        mo22179g();
    }

    /* renamed from: c */
    public boolean mo21508c() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f17624a;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    /* renamed from: g */
    public final void mo22179g() {
        if (f18254a == null) {
            try {
                f18254a = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w(f18255b, "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    @mr2
    public Rect getDirtyBounds() {
        return this.f17624a.getDirtyBounds();
    }

    public void getOutline(@mr2 Outline outline) {
        this.f17624a.getOutline(outline);
    }

    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f17624a;
        if (!(drawable == null || (method = f18254a) == null)) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e) {
                Log.w(f18255b, "Error calling Drawable#isProjected() method", e);
            }
        }
        return false;
    }

    public void setHotspot(float f, float f2) {
        this.f17624a.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f17624a.setHotspotBounds(i, i2, i3, i4);
    }

    public boolean setState(@mr2 int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public void setTint(int i) {
        if (mo21508c()) {
            super.setTint(i);
        } else {
            this.f17624a.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (mo21508c()) {
            super.setTintList(colorStateList);
        } else {
            this.f17624a.setTintList(colorStateList);
        }
    }

    public void setTintMode(@mr2 PorterDuff.Mode mode) {
        if (mo21508c()) {
            super.setTintMode(mode);
        } else {
            this.f17624a.setTintMode(mode);
        }
    }
}
