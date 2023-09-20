package com.onedelhi.secure;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.onedelhi.secure.rc3;

public class jn3 extends Drawable {

    /* renamed from: a */
    public static final double f14274a = Math.cos(Math.toRadians(45.0d));

    /* renamed from: a */
    public static C2531a f14275a = null;

    /* renamed from: e */
    public static final float f14276e = 1.5f;

    /* renamed from: a */
    public float f14277a;

    /* renamed from: a */
    public final int f14278a;

    /* renamed from: a */
    public ColorStateList f14279a;

    /* renamed from: a */
    public Paint f14280a;

    /* renamed from: a */
    public Path f14281a;

    /* renamed from: a */
    public final RectF f14282a;

    /* renamed from: a */
    public boolean f14283a = true;

    /* renamed from: b */
    public float f14284b;

    /* renamed from: b */
    public final int f14285b;

    /* renamed from: b */
    public Paint f14286b;

    /* renamed from: b */
    public boolean f14287b = true;

    /* renamed from: c */
    public float f14288c;

    /* renamed from: c */
    public final int f14289c;

    /* renamed from: c */
    public Paint f14290c;

    /* renamed from: c */
    public boolean f14291c = false;

    /* renamed from: d */
    public float f14292d;

    /* renamed from: com.onedelhi.secure.jn3$a */
    public interface C2531a {
        /* renamed from: a */
        void mo14885a(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    public jn3(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        this.f14285b = resources.getColor(rc3.C3405b.cardview_shadow_start_color);
        this.f14289c = resources.getColor(rc3.C3405b.cardview_shadow_end_color);
        this.f14278a = resources.getDimensionPixelSize(rc3.C3406c.cardview_compat_inset_shadow);
        this.f14280a = new Paint(5);
        mo18503n(colorStateList);
        Paint paint = new Paint(5);
        this.f14286b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f14277a = (float) ((int) (f + 0.5f));
        this.f14282a = new RectF();
        Paint paint2 = new Paint(this.f14286b);
        this.f14290c = paint2;
        paint2.setAntiAlias(false);
        mo18510s(f2, f3);
    }

    /* renamed from: c */
    public static float m18670c(float f, float f2, boolean z) {
        return z ? (float) (((double) f) + ((1.0d - f14274a) * ((double) f2))) : f;
    }

    /* renamed from: d */
    public static float m18671d(float f, float f2, boolean z) {
        float f3 = f * 1.5f;
        return z ? (float) (((double) f3) + ((1.0d - f14274a) * ((double) f2))) : f3;
    }

    /* renamed from: a */
    public final void mo18488a(Rect rect) {
        float f = this.f14284b;
        float f2 = 1.5f * f;
        this.f14282a.set(((float) rect.left) + f, ((float) rect.top) + f2, ((float) rect.right) - f, ((float) rect.bottom) - f2);
        mo18489b();
    }

    /* renamed from: b */
    public final void mo18489b() {
        float f = this.f14277a;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.f14288c;
        rectF2.inset(-f2, -f2);
        Path path = this.f14281a;
        if (path == null) {
            this.f14281a = new Path();
        } else {
            path.reset();
        }
        this.f14281a.setFillType(Path.FillType.EVEN_ODD);
        this.f14281a.moveTo(-this.f14277a, 0.0f);
        this.f14281a.rLineTo(-this.f14288c, 0.0f);
        this.f14281a.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f14281a.arcTo(rectF, 270.0f, -90.0f, false);
        this.f14281a.close();
        float f3 = this.f14277a;
        float f4 = f3 / (this.f14288c + f3);
        Paint paint = this.f14286b;
        float f5 = this.f14277a + this.f14288c;
        int i = this.f14285b;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f5, new int[]{i, i, this.f14289c}, new float[]{0.0f, f4, 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.f14290c;
        float f6 = this.f14277a;
        float f7 = this.f14288c;
        int i2 = this.f14285b;
        paint2.setShader(new LinearGradient(0.0f, (-f6) + f7, 0.0f, (-f6) - f7, new int[]{i2, i2, this.f14289c}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f14290c.setAntiAlias(false);
    }

    public void draw(Canvas canvas) {
        if (this.f14283a) {
            mo18488a(getBounds());
            this.f14283a = false;
        }
        canvas.translate(0.0f, this.f14292d / 2.0f);
        mo18491e(canvas);
        canvas.translate(0.0f, (-this.f14292d) / 2.0f);
        f14275a.mo14885a(canvas, this.f14282a, this.f14277a, this.f14280a);
    }

    /* renamed from: e */
    public final void mo18491e(Canvas canvas) {
        float f = this.f14277a;
        float f2 = (-f) - this.f14288c;
        float f3 = f + ((float) this.f14278a) + (this.f14292d / 2.0f);
        float f4 = f3 * 2.0f;
        boolean z = this.f14282a.width() - f4 > 0.0f;
        boolean z2 = this.f14282a.height() - f4 > 0.0f;
        int save = canvas.save();
        RectF rectF = this.f14282a;
        canvas.translate(rectF.left + f3, rectF.top + f3);
        canvas.drawPath(this.f14281a, this.f14286b);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f14282a.width() - f4, -this.f14277a, this.f14290c);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        RectF rectF2 = this.f14282a;
        canvas.translate(rectF2.right - f3, rectF2.bottom - f3);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f14281a, this.f14286b);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f14282a.width() - f4, (-this.f14277a) + this.f14288c, this.f14290c);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF3 = this.f14282a;
        canvas.translate(rectF3.left + f3, rectF3.bottom - f3);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f14281a, this.f14286b);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f14282a.height() - f4, -this.f14277a, this.f14290c);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF4 = this.f14282a;
        canvas.translate(rectF4.right - f3, rectF4.top + f3);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f14281a, this.f14286b);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f14282a.height() - f4, -this.f14277a, this.f14290c);
        }
        canvas.restoreToCount(save4);
    }

    /* renamed from: f */
    public ColorStateList mo18492f() {
        return this.f14279a;
    }

    /* renamed from: g */
    public float mo18493g() {
        return this.f14277a;
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) m18671d(this.f14284b, this.f14277a, this.f14287b));
        int ceil2 = (int) Math.ceil((double) m18670c(this.f14284b, this.f14277a, this.f14287b));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* renamed from: h */
    public void mo18496h(Rect rect) {
        getPadding(rect);
    }

    /* renamed from: i */
    public float mo18497i() {
        return this.f14284b;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f14279a;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* renamed from: j */
    public float mo18499j() {
        float f = this.f14284b;
        return (Math.max(f, this.f14277a + ((float) this.f14278a) + ((f * 1.5f) / 2.0f)) * 2.0f) + (((this.f14284b * 1.5f) + ((float) this.f14278a)) * 2.0f);
    }

    /* renamed from: k */
    public float mo18500k() {
        float f = this.f14284b;
        return (Math.max(f, this.f14277a + ((float) this.f14278a) + (f / 2.0f)) * 2.0f) + ((this.f14284b + ((float) this.f14278a)) * 2.0f);
    }

    /* renamed from: l */
    public float mo18501l() {
        return this.f14292d;
    }

    /* renamed from: m */
    public void mo18502m(boolean z) {
        this.f14287b = z;
        invalidateSelf();
    }

    /* renamed from: n */
    public final void mo18503n(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f14279a = colorStateList;
        this.f14280a.setColor(colorStateList.getColorForState(getState(), this.f14279a.getDefaultColor()));
    }

    /* renamed from: o */
    public void mo18504o(@ts2 ColorStateList colorStateList) {
        mo18503n(colorStateList);
        invalidateSelf();
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f14283a = true;
    }

    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f14279a;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f14280a.getColor() == colorForState) {
            return false;
        }
        this.f14280a.setColor(colorForState);
        this.f14283a = true;
        invalidateSelf();
        return true;
    }

    /* renamed from: p */
    public void mo18507p(float f) {
        if (f >= 0.0f) {
            float f2 = (float) ((int) (f + 0.5f));
            if (this.f14277a != f2) {
                this.f14277a = f2;
                this.f14283a = true;
                invalidateSelf();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid radius " + f + ". Must be >= 0");
    }

    /* renamed from: q */
    public void mo18508q(float f) {
        mo18510s(this.f14292d, f);
    }

    /* renamed from: r */
    public void mo18509r(float f) {
        mo18510s(f, this.f14284b);
    }

    /* renamed from: s */
    public final void mo18510s(float f, float f2) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f + ". Must be >= 0");
        } else if (f2 >= 0.0f) {
            float t = (float) mo18513t(f);
            float t2 = (float) mo18513t(f2);
            if (t > t2) {
                if (!this.f14291c) {
                    this.f14291c = true;
                }
                t = t2;
            }
            if (this.f14292d != t || this.f14284b != t2) {
                this.f14292d = t;
                this.f14284b = t2;
                this.f14288c = (float) ((int) ((t * 1.5f) + ((float) this.f14278a) + 0.5f));
                this.f14283a = true;
                invalidateSelf();
            }
        } else {
            throw new IllegalArgumentException("Invalid max shadow size " + f2 + ". Must be >= 0");
        }
    }

    public void setAlpha(int i) {
        this.f14280a.setAlpha(i);
        this.f14286b.setAlpha(i);
        this.f14290c.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f14280a.setColorFilter(colorFilter);
    }

    /* renamed from: t */
    public final int mo18513t(float f) {
        int i = (int) (f + 0.5f);
        return i % 2 == 1 ? i - 1 : i;
    }
}
