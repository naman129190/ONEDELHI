package com.onedelhi.secure;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

public class u04 extends C2861mj {
    @ts2

    /* renamed from: a */
    public C2760lj<ColorFilter, ColorFilter> f21185a;

    /* renamed from: a */
    public final float[] f21186a;

    /* renamed from: b */
    public final Path f21187b;

    /* renamed from: b */
    public final m12 f21188b;

    /* renamed from: e */
    public final RectF f21189e = new RectF();

    /* renamed from: f */
    public final Paint f21190f;

    public u04(qa2 qa2, m12 m12) {
        super(qa2, m12);
        i02 i02 = new i02();
        this.f21190f = i02;
        this.f21186a = new float[8];
        this.f21187b = new Path();
        this.f21188b = m12;
        i02.setAlpha(0);
        i02.setStyle(Paint.Style.FILL);
        i02.setColor(m12.mo20025m());
    }

    /* renamed from: a */
    public <T> void mo12684a(T t, @ts2 hb2<T> hb2) {
        super.mo12684a(t, hb2);
        if (t == ab2.f8954a) {
            this.f21185a = hb2 == null ? null : new es4(hb2);
        }
    }

    /* renamed from: b */
    public void mo12685b(RectF rectF, Matrix matrix, boolean z) {
        super.mo12685b(rectF, matrix, z);
        this.f21189e.set(0.0f, 0.0f, (float) this.f21188b.mo20027o(), (float) this.f21188b.mo20026n());
        this.f16142b.mapRect(this.f21189e);
        rectF.set(this.f21189e);
    }

    /* renamed from: u */
    public void mo12686u(Canvas canvas, Matrix matrix, int i) {
        int alpha = Color.alpha(this.f21188b.mo20025m());
        if (alpha != 0) {
            int intValue = (int) ((((float) i) / 255.0f) * (((((float) alpha) / 255.0f) * ((float) (this.f16136a.mo23863h() == null ? 100 : this.f16136a.mo23863h().mo15565h().intValue()))) / 100.0f) * 255.0f);
            this.f21190f.setAlpha(intValue);
            C2760lj<ColorFilter, ColorFilter> ljVar = this.f21185a;
            if (ljVar != null) {
                this.f21190f.setColorFilter(ljVar.mo15565h());
            }
            if (intValue > 0) {
                float[] fArr = this.f21186a;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                fArr[2] = (float) this.f21188b.mo20027o();
                float[] fArr2 = this.f21186a;
                fArr2[3] = 0.0f;
                fArr2[4] = (float) this.f21188b.mo20027o();
                this.f21186a[5] = (float) this.f21188b.mo20026n();
                float[] fArr3 = this.f21186a;
                fArr3[6] = 0.0f;
                fArr3[7] = (float) this.f21188b.mo20026n();
                matrix.mapPoints(this.f21186a);
                this.f21187b.reset();
                Path path = this.f21187b;
                float[] fArr4 = this.f21186a;
                path.moveTo(fArr4[0], fArr4[1]);
                Path path2 = this.f21187b;
                float[] fArr5 = this.f21186a;
                path2.lineTo(fArr5[2], fArr5[3]);
                Path path3 = this.f21187b;
                float[] fArr6 = this.f21186a;
                path3.lineTo(fArr6[4], fArr6[5]);
                Path path4 = this.f21187b;
                float[] fArr7 = this.f21186a;
                path4.lineTo(fArr7[6], fArr7[7]);
                Path path5 = this.f21187b;
                float[] fArr8 = this.f21186a;
                path5.lineTo(fArr8[0], fArr8[1]);
                this.f21187b.close();
                canvas.drawPath(this.f21187b, this.f21190f);
            }
        }
    }
}
