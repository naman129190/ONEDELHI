package com.onedelhi.secure;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

public class bp1 extends C2861mj {

    /* renamed from: a */
    public final Rect f9917a = new Rect();
    @ts2

    /* renamed from: a */
    public C2760lj<ColorFilter, ColorFilter> f9918a;

    /* renamed from: b */
    public final Rect f9919b = new Rect();

    /* renamed from: f */
    public final Paint f9920f = new i02(3);

    public bp1(qa2 qa2, m12 m12) {
        super(qa2, m12);
    }

    @ts2
    /* renamed from: K */
    public final Bitmap mo13791K() {
        return this.f16135a.mo23048x(this.f16133a.mo20023k());
    }

    /* renamed from: a */
    public <T> void mo12684a(T t, @ts2 hb2<T> hb2) {
        super.mo12684a(t, hb2);
        if (t == ab2.f8954a) {
            this.f9918a = hb2 == null ? null : new es4(hb2);
        }
    }

    /* renamed from: b */
    public void mo12685b(RectF rectF, Matrix matrix, boolean z) {
        super.mo12685b(rectF, matrix, z);
        Bitmap K = mo13791K();
        if (K != null) {
            rectF.set(0.0f, 0.0f, ((float) K.getWidth()) * yq4.m32602e(), ((float) K.getHeight()) * yq4.m32602e());
            this.f16142b.mapRect(rectF);
        }
    }

    /* renamed from: u */
    public void mo12686u(@mr2 Canvas canvas, Matrix matrix, int i) {
        Bitmap K = mo13791K();
        if (K != null && !K.isRecycled()) {
            float e = yq4.m32602e();
            this.f9920f.setAlpha(i);
            C2760lj<ColorFilter, ColorFilter> ljVar = this.f9918a;
            if (ljVar != null) {
                this.f9920f.setColorFilter(ljVar.mo15565h());
            }
            canvas.save();
            canvas.concat(matrix);
            this.f9917a.set(0, 0, K.getWidth(), K.getHeight());
            this.f9919b.set(0, 0, (int) (((float) K.getWidth()) * e), (int) (((float) K.getHeight()) * e));
            canvas.drawBitmap(K, this.f9917a, this.f9919b, this.f9920f);
            canvas.restore();
        }
    }
}
