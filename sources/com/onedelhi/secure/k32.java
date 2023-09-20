package com.onedelhi.secure;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;

public final class k32 extends pp0<LinearProgressIndicatorSpec> {

    /* renamed from: a */
    public float f31095a = 300.0f;

    /* renamed from: b */
    public float f31096b;

    /* renamed from: c */
    public float f31097c;

    public k32(@mr2 LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
    }

    /* renamed from: a */
    public void mo36975a(@mr2 Canvas canvas, @mr2 Rect rect, @d81(from = 0.0d, mo14561to = 1.0d) float f) {
        this.f31095a = (float) rect.width();
        float f2 = (float) ((LinearProgressIndicatorSpec) this.f33751a).f35099a;
        canvas.translate(((float) rect.left) + (((float) rect.width()) / 2.0f), ((float) rect.top) + (((float) rect.height()) / 2.0f) + Math.max(0.0f, ((float) (rect.height() - ((LinearProgressIndicatorSpec) this.f33751a).f35099a)) / 2.0f));
        if (((LinearProgressIndicatorSpec) this.f33751a).f24226a) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.f33750a.mo40163n() && ((LinearProgressIndicatorSpec) this.f33751a).f35103d == 1) || (this.f33750a.mo40162m() && ((LinearProgressIndicatorSpec) this.f33751a).f35104e == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.f33750a.mo40163n() || this.f33750a.mo40162m()) {
            canvas.translate(0.0f, (((float) ((LinearProgressIndicatorSpec) this.f33751a).f35099a) * (f - 1.0f)) / 2.0f);
        }
        float f3 = this.f31095a;
        canvas.clipRect((-f3) / 2.0f, (-f2) / 2.0f, f3 / 2.0f, f2 / 2.0f);
        S s = this.f33751a;
        this.f31096b = ((float) ((LinearProgressIndicatorSpec) s).f35099a) * f;
        this.f31097c = ((float) ((LinearProgressIndicatorSpec) s).f35101b) * f;
    }

    /* renamed from: b */
    public void mo36976b(@mr2 Canvas canvas, @mr2 Paint paint, @d81(from = 0.0d, mo14561to = 1.0d) float f, @d81(from = 0.0d, mo14561to = 1.0d) float f2, @d10 int i) {
        if (f != f2) {
            float f3 = this.f31095a;
            float f4 = this.f31097c;
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            paint.setColor(i);
            float f5 = this.f31096b;
            RectF rectF = new RectF(((-f3) / 2.0f) + (f * (f3 - (f4 * 2.0f))), (-f5) / 2.0f, ((-f3) / 2.0f) + (f2 * (f3 - (f4 * 2.0f))) + (f4 * 2.0f), f5 / 2.0f);
            float f6 = this.f31097c;
            canvas.drawRoundRect(rectF, f6, f6, paint);
        }
    }

    /* renamed from: c */
    public void mo36977c(@mr2 Canvas canvas, @mr2 Paint paint) {
        int a = oe2.m23715a(((LinearProgressIndicatorSpec) this.f33751a).f35102c, this.f33750a.getAlpha());
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(a);
        float f = this.f31095a;
        float f2 = this.f31096b;
        RectF rectF = new RectF((-f) / 2.0f, (-f2) / 2.0f, f / 2.0f, f2 / 2.0f);
        float f3 = this.f31097c;
        canvas.drawRoundRect(rectF, f3, f3, paint);
    }

    /* renamed from: d */
    public int mo36978d() {
        return ((LinearProgressIndicatorSpec) this.f33751a).f35099a;
    }

    /* renamed from: e */
    public int mo36979e() {
        return -1;
    }
}
