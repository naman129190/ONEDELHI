package com.onedelhi.secure;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import com.onedelhi.secure.qe2;

public class vd2 {

    /* renamed from: a */
    public final Path f36489a = new Path();

    /* renamed from: a */
    public uw3 f36490a;

    /* renamed from: a */
    public final vw3 f36491a = vw3.m68560k();

    /* renamed from: b */
    public final Path f36492b = new Path();

    /* renamed from: c */
    public final Path f36493c = new Path();

    /* renamed from: a */
    public void mo46123a(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 23) {
            canvas.clipPath(this.f36489a);
            return;
        }
        canvas.clipPath(this.f36492b);
        canvas.clipPath(this.f36493c, Region.Op.UNION);
    }

    /* renamed from: b */
    public void mo46124b(float f, uw3 uw3, uw3 uw32, RectF rectF, RectF rectF2, RectF rectF3, qe2.C6560e eVar) {
        uw3 o = sh4.m64589o(uw3, uw32, rectF, rectF3, eVar.mo43491d(), eVar.mo43490c(), f);
        this.f36490a = o;
        this.f36491a.mo46402d(o, 1.0f, rectF2, this.f36492b);
        this.f36491a.mo46402d(this.f36490a, 1.0f, rectF3, this.f36493c);
        if (Build.VERSION.SDK_INT >= 23) {
            this.f36489a.op(this.f36492b, this.f36493c, Path.Op.UNION);
        }
    }

    /* renamed from: c */
    public uw3 mo46125c() {
        return this.f36490a;
    }

    /* renamed from: d */
    public Path mo46126d() {
        return this.f36489a;
    }
}
