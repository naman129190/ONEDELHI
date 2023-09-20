package com.onedelhi.secure;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.LIBRARY_GROUP})
public class sw3 {

    /* renamed from: a */
    public static final float[] f35226a = {0.0f, 0.5f, 1.0f};

    /* renamed from: a */
    public static final int[] f35227a = new int[3];

    /* renamed from: b */
    public static final float[] f35228b = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: b */
    public static final int[] f35229b = new int[4];

    /* renamed from: d */
    public static final int f35230d = 68;

    /* renamed from: e */
    public static final int f35231e = 20;

    /* renamed from: f */
    public static final int f35232f = 0;

    /* renamed from: a */
    public int f35233a;
    @mr2

    /* renamed from: a */
    public final Paint f35234a;

    /* renamed from: a */
    public final Path f35235a;

    /* renamed from: b */
    public int f35236b;
    @mr2

    /* renamed from: b */
    public final Paint f35237b;

    /* renamed from: c */
    public int f35238c;
    @mr2

    /* renamed from: c */
    public final Paint f35239c;

    /* renamed from: d */
    public final Paint f35240d;

    public sw3() {
        this(-16777216);
    }

    public sw3(int i) {
        this.f35235a = new Path();
        Paint paint = new Paint();
        this.f35240d = paint;
        this.f35234a = new Paint();
        mo44586e(i);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f35237b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f35239c = new Paint(paint2);
    }

    /* renamed from: a */
    public void mo44582a(@mr2 Canvas canvas, @ts2 Matrix matrix, @mr2 RectF rectF, int i, float f, float f2) {
        Canvas canvas2 = canvas;
        RectF rectF2 = rectF;
        int i2 = i;
        float f3 = f2;
        boolean z = f3 < 0.0f;
        Path path = this.f35235a;
        if (z) {
            int[] iArr = f35229b;
            iArr[0] = 0;
            iArr[1] = this.f35238c;
            iArr[2] = this.f35236b;
            iArr[3] = this.f35233a;
            float f4 = f;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF2, f, f3);
            path.close();
            float f5 = (float) (-i2);
            rectF2.inset(f5, f5);
            int[] iArr2 = f35229b;
            iArr2[0] = 0;
            iArr2[1] = this.f35233a;
            iArr2[2] = this.f35236b;
            iArr2[3] = this.f35238c;
        }
        float width = rectF.width() / 2.0f;
        if (width > 0.0f) {
            float f6 = 1.0f - (((float) i2) / width);
            float[] fArr = f35228b;
            fArr[1] = f6;
            fArr[2] = ((1.0f - f6) / 2.0f) + f6;
            this.f35237b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f35229b, fArr, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix);
            canvas2.scale(1.0f, rectF.height() / rectF.width());
            if (!z) {
                canvas2.clipPath(path, Region.Op.DIFFERENCE);
                canvas2.drawPath(path, this.f35240d);
            }
            canvas.drawArc(rectF, f, f2, true, this.f35237b);
            canvas.restore();
        }
    }

    /* renamed from: b */
    public void mo44583b(@mr2 Canvas canvas, @ts2 Matrix matrix, @mr2 RectF rectF, int i) {
        rectF.bottom += (float) i;
        rectF.offset(0.0f, (float) (-i));
        int[] iArr = f35227a;
        iArr[0] = this.f35238c;
        iArr[1] = this.f35236b;
        iArr[2] = this.f35233a;
        Paint paint = this.f35239c;
        float f = rectF.left;
        paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, iArr, f35226a, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f35239c);
        canvas.restore();
    }

    /* renamed from: c */
    public void mo44584c(@mr2 Canvas canvas, @ts2 Matrix matrix, @mr2 RectF rectF, int i, float f, float f2, @mr2 float[] fArr) {
        if (f2 > 0.0f) {
            f += f2;
            f2 = -f2;
        }
        mo44582a(canvas, matrix, rectF, i, f, f2);
        Path path = this.f35235a;
        path.rewind();
        path.moveTo(fArr[0], fArr[1]);
        path.arcTo(rectF, f, f2);
        path.close();
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        canvas.drawPath(path, this.f35240d);
        canvas.drawPath(path, this.f35234a);
        canvas.restore();
    }

    @mr2
    /* renamed from: d */
    public Paint mo44585d() {
        return this.f35234a;
    }

    /* renamed from: e */
    public void mo44586e(int i) {
        this.f35233a = p10.m24299B(i, 68);
        this.f35236b = p10.m24299B(i, 20);
        this.f35238c = p10.m24299B(i, 0);
        this.f35234a.setColor(this.f35233a);
    }
}
