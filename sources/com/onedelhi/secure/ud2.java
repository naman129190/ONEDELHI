package com.onedelhi.secure;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import com.onedelhi.secure.pe2;

@sj3(21)
public class ud2 {

    /* renamed from: a */
    public final Path f36040a = new Path();

    /* renamed from: a */
    public uw3 f36041a;

    /* renamed from: a */
    public final vw3 f36042a = vw3.m68560k();

    /* renamed from: b */
    public final Path f36043b = new Path();

    /* renamed from: c */
    public final Path f36044c = new Path();

    /* renamed from: a */
    public void mo45560a(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 23) {
            canvas.clipPath(this.f36040a);
            return;
        }
        canvas.clipPath(this.f36043b);
        canvas.clipPath(this.f36044c, Region.Op.UNION);
    }

    /* renamed from: b */
    public void mo45561b(float f, uw3 uw3, uw3 uw32, RectF rectF, RectF rectF2, RectF rectF3, pe2.C6433f fVar) {
        uw3 o = rh4.m63624o(uw3, uw32, rectF, rectF3, fVar.mo42583d(), fVar.mo42582c(), f);
        this.f36041a = o;
        this.f36042a.mo46402d(o, 1.0f, rectF2, this.f36043b);
        this.f36042a.mo46402d(this.f36041a, 1.0f, rectF3, this.f36044c);
        if (Build.VERSION.SDK_INT >= 23) {
            this.f36040a.op(this.f36043b, this.f36044c, Path.Op.UNION);
        }
    }

    /* renamed from: c */
    public uw3 mo45562c() {
        return this.f36041a;
    }

    /* renamed from: d */
    public Path mo45563d() {
        return this.f36040a;
    }
}
