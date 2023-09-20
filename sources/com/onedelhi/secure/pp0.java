package com.onedelhi.secure;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.onedelhi.secure.C6774sj;

public abstract class pp0<S extends C6774sj> {

    /* renamed from: a */
    public lp0 f33750a;

    /* renamed from: a */
    public S f33751a;

    public pp0(S s) {
        this.f33751a = s;
    }

    /* renamed from: a */
    public abstract void mo36975a(@mr2 Canvas canvas, @mr2 Rect rect, @d81(from = 0.0d, mo14561to = 1.0d) float f);

    /* renamed from: b */
    public abstract void mo36976b(@mr2 Canvas canvas, @mr2 Paint paint, @d81(from = 0.0d, mo14561to = 1.0d) float f, @d81(from = 0.0d, mo14561to = 1.0d) float f2, @d10 int i);

    /* renamed from: c */
    public abstract void mo36977c(@mr2 Canvas canvas, @mr2 Paint paint);

    /* renamed from: d */
    public abstract int mo36978d();

    /* renamed from: e */
    public abstract int mo36979e();

    /* renamed from: f */
    public void mo42834f(@mr2 lp0 lp0) {
        this.f33750a = lp0;
    }

    /* renamed from: g */
    public void mo42835g(@mr2 Canvas canvas, @mr2 Rect rect, @d81(from = 0.0d, mo14561to = 1.0d) float f) {
        this.f33751a.mo28604e();
        mo36975a(canvas, rect, f);
    }
}
