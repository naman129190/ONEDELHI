package com.onedelhi.secure;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.onedelhi.secure.fd3;

@Deprecated
public class rw3 extends mp0 {

    /* renamed from: a */
    public static final double f34762a = Math.cos(Math.toRadians(45.0d));

    /* renamed from: g */
    public static final float f34763g = 1.5f;

    /* renamed from: h */
    public static final float f34764h = 0.25f;

    /* renamed from: i */
    public static final float f34765i = 0.5f;

    /* renamed from: j */
    public static final float f34766j = 1.0f;

    /* renamed from: a */
    public float f34767a;
    @mr2

    /* renamed from: a */
    public final Paint f34768a;

    /* renamed from: a */
    public Path f34769a;
    @mr2

    /* renamed from: a */
    public final RectF f34770a;

    /* renamed from: b */
    public float f34771b;
    @mr2

    /* renamed from: b */
    public final Paint f34772b;

    /* renamed from: b */
    public boolean f34773b = true;

    /* renamed from: c */
    public float f34774c;

    /* renamed from: c */
    public boolean f34775c = true;

    /* renamed from: d */
    public float f34776d;

    /* renamed from: d */
    public boolean f34777d = false;

    /* renamed from: e */
    public float f34778e;

    /* renamed from: f */
    public float f34779f;

    /* renamed from: n */
    public final int f34780n;

    /* renamed from: o */
    public final int f34781o;

    /* renamed from: p */
    public final int f34782p;

    public rw3(Context context, Drawable drawable, float f, float f2, float f3) {
        super(drawable);
        this.f34780n = r70.m26353f(context, fd3.C2155e.design_fab_shadow_start_color);
        this.f34781o = r70.m26353f(context, fd3.C2155e.design_fab_shadow_mid_color);
        this.f34782p = r70.m26353f(context, fd3.C2155e.design_fab_shadow_end_color);
        Paint paint = new Paint(5);
        this.f34768a = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f34767a = (float) Math.round(f);
        this.f34770a = new RectF();
        Paint paint2 = new Paint(paint);
        this.f34772b = paint2;
        paint2.setAntiAlias(false);
        mo44082r(f2, f3);
    }

    /* renamed from: e */
    public static float m63946e(float f, float f2, boolean z) {
        return z ? (float) (((double) f) + ((1.0d - f34762a) * ((double) f2))) : f;
    }

    /* renamed from: f */
    public static float m63947f(float f, float f2, boolean z) {
        float f3 = f * 1.5f;
        return z ? (float) (((double) f3) + ((1.0d - f34762a) * ((double) f2))) : f3;
    }

    /* renamed from: s */
    public static int m63948s(float f) {
        int round = Math.round(f);
        return round % 2 == 1 ? round - 1 : round;
    }

    /* renamed from: c */
    public final void mo44069c(@mr2 Rect rect) {
        float f = this.f34774c;
        float f2 = 1.5f * f;
        this.f34770a.set(((float) rect.left) + f, ((float) rect.top) + f2, ((float) rect.right) - f, ((float) rect.bottom) - f2);
        Drawable a = mo20545a();
        RectF rectF = this.f34770a;
        a.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        mo44070d();
    }

    /* renamed from: d */
    public final void mo44070d() {
        float f = this.f34767a;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.f34776d;
        rectF2.inset(-f2, -f2);
        Path path = this.f34769a;
        if (path == null) {
            this.f34769a = new Path();
        } else {
            path.reset();
        }
        this.f34769a.setFillType(Path.FillType.EVEN_ODD);
        this.f34769a.moveTo(-this.f34767a, 0.0f);
        this.f34769a.rLineTo(-this.f34776d, 0.0f);
        this.f34769a.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f34769a.arcTo(rectF, 270.0f, -90.0f, false);
        this.f34769a.close();
        float f3 = -rectF2.top;
        if (f3 > 0.0f) {
            float f4 = this.f34767a / f3;
            Paint paint = this.f34768a;
            RadialGradient radialGradient = r8;
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, f3, new int[]{0, this.f34780n, this.f34781o, this.f34782p}, new float[]{0.0f, f4, ((1.0f - f4) / 2.0f) + f4, 1.0f}, Shader.TileMode.CLAMP);
            paint.setShader(radialGradient);
        }
        this.f34772b.setShader(new LinearGradient(0.0f, rectF.top, 0.0f, rectF2.top, new int[]{this.f34780n, this.f34781o, this.f34782p}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f34772b.setAntiAlias(false);
    }

    public void draw(@mr2 Canvas canvas) {
        if (this.f34773b) {
            mo44069c(getBounds());
            this.f34773b = false;
        }
        mo44071g(canvas);
        super.draw(canvas);
    }

    /* renamed from: g */
    public final void mo44071g(@mr2 Canvas canvas) {
        float f;
        int i;
        int i2;
        float f2;
        float f3;
        float f4;
        Canvas canvas2 = canvas;
        int save = canvas.save();
        canvas2.rotate(this.f34779f, this.f34770a.centerX(), this.f34770a.centerY());
        float f5 = this.f34767a;
        float f6 = (-f5) - this.f34776d;
        float f7 = f5 * 2.0f;
        boolean z = this.f34770a.width() - f7 > 0.0f;
        boolean z2 = this.f34770a.height() - f7 > 0.0f;
        float f8 = this.f34778e;
        float f9 = f5 / ((f8 - (0.5f * f8)) + f5);
        float f10 = f5 / ((f8 - (0.25f * f8)) + f5);
        float f11 = f5 / ((f8 - (f8 * 1.0f)) + f5);
        int save2 = canvas.save();
        RectF rectF = this.f34770a;
        canvas2.translate(rectF.left + f5, rectF.top + f5);
        canvas2.scale(f9, f10);
        canvas2.drawPath(this.f34769a, this.f34768a);
        if (z) {
            canvas2.scale(1.0f / f9, 1.0f);
            i2 = save2;
            f = f11;
            i = save;
            f2 = f10;
            canvas.drawRect(0.0f, f6, this.f34770a.width() - f7, -this.f34767a, this.f34772b);
        } else {
            i2 = save2;
            f = f11;
            i = save;
            f2 = f10;
        }
        canvas2.restoreToCount(i2);
        int save3 = canvas.save();
        RectF rectF2 = this.f34770a;
        canvas2.translate(rectF2.right - f5, rectF2.bottom - f5);
        float f12 = f;
        canvas2.scale(f9, f12);
        canvas2.rotate(180.0f);
        canvas2.drawPath(this.f34769a, this.f34768a);
        if (z) {
            canvas2.scale(1.0f / f9, 1.0f);
            f3 = f2;
            f4 = f12;
            canvas.drawRect(0.0f, f6, this.f34770a.width() - f7, (-this.f34767a) + this.f34776d, this.f34772b);
        } else {
            f3 = f2;
            f4 = f12;
        }
        canvas2.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF3 = this.f34770a;
        canvas2.translate(rectF3.left + f5, rectF3.bottom - f5);
        canvas2.scale(f9, f4);
        canvas2.rotate(270.0f);
        canvas2.drawPath(this.f34769a, this.f34768a);
        if (z2) {
            canvas2.scale(1.0f / f4, 1.0f);
            canvas.drawRect(0.0f, f6, this.f34770a.height() - f7, -this.f34767a, this.f34772b);
        }
        canvas2.restoreToCount(save4);
        int save5 = canvas.save();
        RectF rectF4 = this.f34770a;
        canvas2.translate(rectF4.right - f5, rectF4.top + f5);
        float f13 = f3;
        canvas2.scale(f9, f13);
        canvas2.rotate(90.0f);
        canvas2.drawPath(this.f34769a, this.f34768a);
        if (z2) {
            canvas2.scale(1.0f / f13, 1.0f);
            canvas.drawRect(0.0f, f6, this.f34770a.height() - f7, -this.f34767a, this.f34772b);
        }
        canvas2.restoreToCount(save5);
        canvas2.restoreToCount(i);
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(@mr2 Rect rect) {
        int ceil = (int) Math.ceil((double) m63947f(this.f34774c, this.f34767a, this.f34775c));
        int ceil2 = (int) Math.ceil((double) m63946e(this.f34774c, this.f34767a, this.f34775c));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* renamed from: h */
    public float mo44072h() {
        return this.f34767a;
    }

    /* renamed from: i */
    public float mo44073i() {
        return this.f34774c;
    }

    /* renamed from: j */
    public float mo44074j() {
        float f = this.f34774c;
        return (Math.max(f, this.f34767a + ((f * 1.5f) / 2.0f)) * 2.0f) + (this.f34774c * 1.5f * 2.0f);
    }

    /* renamed from: k */
    public float mo44075k() {
        float f = this.f34774c;
        return (Math.max(f, this.f34767a + (f / 2.0f)) * 2.0f) + (this.f34774c * 2.0f);
    }

    /* renamed from: l */
    public float mo44076l() {
        return this.f34778e;
    }

    /* renamed from: m */
    public void mo44077m(boolean z) {
        this.f34775c = z;
        invalidateSelf();
    }

    /* renamed from: n */
    public void mo44078n(float f) {
        float round = (float) Math.round(f);
        if (this.f34767a != round) {
            this.f34767a = round;
            this.f34773b = true;
            invalidateSelf();
        }
    }

    /* renamed from: o */
    public void mo44079o(float f) {
        mo44082r(this.f34778e, f);
    }

    public void onBoundsChange(Rect rect) {
        this.f34773b = true;
    }

    /* renamed from: p */
    public final void mo44080p(float f) {
        if (this.f34779f != f) {
            this.f34779f = f;
            invalidateSelf();
        }
    }

    /* renamed from: q */
    public void mo44081q(float f) {
        mo44082r(f, this.f34774c);
    }

    /* renamed from: r */
    public void mo44082r(float f, float f2) {
        if (f < 0.0f || f2 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        float s = (float) m63948s(f);
        float s2 = (float) m63948s(f2);
        if (s > s2) {
            if (!this.f34777d) {
                this.f34777d = true;
            }
            s = s2;
        }
        if (this.f34778e != s || this.f34774c != s2) {
            this.f34778e = s;
            this.f34774c = s2;
            this.f34776d = (float) Math.round(s * 1.5f);
            this.f34771b = s2;
            this.f34773b = true;
            invalidateSelf();
        }
    }

    public void setAlpha(int i) {
        super.setAlpha(i);
        this.f34768a.setAlpha(i);
        this.f34772b.setAlpha(i);
    }
}
