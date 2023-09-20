package com.onedelhi.secure;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;

/* renamed from: com.onedelhi.secure.gy */
public final class C5455gy extends pp0<CircularProgressIndicatorSpec> {

    /* renamed from: a */
    public float f29339a;

    /* renamed from: a */
    public int f29340a = 1;

    /* renamed from: b */
    public float f29341b;

    /* renamed from: c */
    public float f29342c;

    public C5455gy(@mr2 CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
    }

    /* renamed from: a */
    public void mo36975a(@mr2 Canvas canvas, @mr2 Rect rect, @d81(from = 0.0d, mo14561to = 1.0d) float f) {
        float f2;
        float width = ((float) rect.width()) / ((float) mo36979e());
        float height = ((float) rect.height()) / ((float) mo36978d());
        S s = this.f33751a;
        float f3 = (((float) ((CircularProgressIndicatorSpec) s).f24216f) / 2.0f) + ((float) ((CircularProgressIndicatorSpec) s).f24217g);
        canvas.translate((f3 * width) + ((float) rect.left), (f3 * height) + ((float) rect.top));
        canvas.scale(width, height);
        canvas.rotate(-90.0f);
        float f4 = -f3;
        canvas.clipRect(f4, f4, f3, f3);
        S s2 = this.f33751a;
        this.f29340a = ((CircularProgressIndicatorSpec) s2).f24218h == 0 ? 1 : -1;
        this.f29339a = ((float) ((CircularProgressIndicatorSpec) s2).f35099a) * f;
        this.f29341b = ((float) ((CircularProgressIndicatorSpec) s2).f35101b) * f;
        this.f29342c = ((float) (((CircularProgressIndicatorSpec) s2).f24216f - ((CircularProgressIndicatorSpec) s2).f35099a)) / 2.0f;
        if ((this.f33750a.mo40163n() && ((CircularProgressIndicatorSpec) this.f33751a).f35103d == 2) || (this.f33750a.mo40162m() && ((CircularProgressIndicatorSpec) this.f33751a).f35104e == 1)) {
            f2 = this.f29342c + (((1.0f - f) * ((float) ((CircularProgressIndicatorSpec) this.f33751a).f35099a)) / 2.0f);
        } else if ((this.f33750a.mo40163n() && ((CircularProgressIndicatorSpec) this.f33751a).f35103d == 1) || (this.f33750a.mo40162m() && ((CircularProgressIndicatorSpec) this.f33751a).f35104e == 2)) {
            f2 = this.f29342c - (((1.0f - f) * ((float) ((CircularProgressIndicatorSpec) this.f33751a).f35099a)) / 2.0f);
        } else {
            return;
        }
        this.f29342c = f2;
    }

    /* renamed from: b */
    public void mo36976b(@mr2 Canvas canvas, @mr2 Paint paint, @d81(from = 0.0d, mo14561to = 1.0d) float f, @d81(from = 0.0d, mo14561to = 1.0d) float f2, @d10 int i) {
        Paint paint2 = paint;
        if (f != f2) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.BUTT);
            paint.setAntiAlias(true);
            paint.setColor(i);
            paint.setStrokeWidth(this.f29339a);
            int i2 = this.f29340a;
            float f3 = f * 360.0f * ((float) i2);
            float f4 = (f2 >= f ? f2 - f : (1.0f + f2) - f) * 360.0f * ((float) i2);
            float f5 = this.f29342c;
            canvas.drawArc(new RectF(-f5, -f5, f5, f5), f3, f4, false, paint);
            if (this.f29341b > 0.0f && Math.abs(f4) < 360.0f) {
                paint.setStyle(Paint.Style.FILL);
                Canvas canvas2 = canvas;
                Paint paint3 = paint;
                mo36980h(canvas2, paint3, this.f29339a, this.f29341b, f3);
                mo36980h(canvas2, paint3, this.f29339a, this.f29341b, f3 + f4);
            }
        }
    }

    /* renamed from: c */
    public void mo36977c(@mr2 Canvas canvas, @mr2 Paint paint) {
        int a = oe2.m23715a(((CircularProgressIndicatorSpec) this.f33751a).f35102c, this.f33750a.getAlpha());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(a);
        paint.setStrokeWidth(this.f29339a);
        float f = this.f29342c;
        canvas.drawArc(new RectF(-f, -f, f, f), 0.0f, 360.0f, false, paint);
    }

    /* renamed from: d */
    public int mo36978d() {
        return mo36981i();
    }

    /* renamed from: e */
    public int mo36979e() {
        return mo36981i();
    }

    /* renamed from: h */
    public final void mo36980h(Canvas canvas, Paint paint, float f, float f2, float f3) {
        canvas.save();
        canvas.rotate(f3);
        float f4 = this.f29342c;
        float f5 = f / 2.0f;
        canvas.drawRoundRect(new RectF(f4 - f5, f2, f4 + f5, -f2), f2, f2, paint);
        canvas.restore();
    }

    /* renamed from: i */
    public final int mo36981i() {
        S s = this.f33751a;
        return ((CircularProgressIndicatorSpec) s).f24216f + (((CircularProgressIndicatorSpec) s).f24217g * 2);
    }
}
