package com.onedelhi.secure;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.onedelhi.secure.hl3;

public class vw3 {

    /* renamed from: a */
    public final Path f36732a = new Path();

    /* renamed from: a */
    public final PointF f36733a = new PointF();

    /* renamed from: a */
    public final fx3 f36734a = new fx3();

    /* renamed from: a */
    public boolean f36735a = true;

    /* renamed from: a */
    public final float[] f36736a = new float[2];

    /* renamed from: a */
    public final Matrix[] f36737a = new Matrix[4];

    /* renamed from: a */
    public final fx3[] f36738a = new fx3[4];

    /* renamed from: b */
    public final Path f36739b = new Path();

    /* renamed from: b */
    public final float[] f36740b = new float[2];

    /* renamed from: b */
    public final Matrix[] f36741b = new Matrix[4];

    /* renamed from: c */
    public final Path f36742c = new Path();

    /* renamed from: d */
    public final Path f36743d = new Path();

    /* renamed from: com.onedelhi.secure.vw3$a */
    public static class C7102a {

        /* renamed from: a */
        public static final vw3 f36744a = new vw3();
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    /* renamed from: com.onedelhi.secure.vw3$b */
    public interface C7103b {
        /* renamed from: a */
        void mo31650a(fx3 fx3, Matrix matrix, int i);

        /* renamed from: b */
        void mo31651b(fx3 fx3, Matrix matrix, int i);
    }

    /* renamed from: com.onedelhi.secure.vw3$c */
    public static final class C7104c {

        /* renamed from: a */
        public final float f36745a;
        @mr2

        /* renamed from: a */
        public final Path f36746a;
        @mr2

        /* renamed from: a */
        public final RectF f36747a;
        @mr2

        /* renamed from: a */
        public final uw3 f36748a;
        @ts2

        /* renamed from: a */
        public final C7103b f36749a;

        public C7104c(@mr2 uw3 uw3, float f, RectF rectF, @ts2 C7103b bVar, Path path) {
            this.f36749a = bVar;
            this.f36748a = uw3;
            this.f36745a = f;
            this.f36747a = rectF;
            this.f36746a = path;
        }
    }

    public vw3() {
        for (int i = 0; i < 4; i++) {
            this.f36738a[i] = new fx3();
            this.f36737a[i] = new Matrix();
            this.f36741b[i] = new Matrix();
        }
    }

    @mr2
    @hn4
    @hl3({hl3.C2354a.LIBRARY_GROUP})
    /* renamed from: k */
    public static vw3 m68560k() {
        return C7102a.f36744a;
    }

    /* renamed from: a */
    public final float mo46399a(int i) {
        return (float) ((i + 1) * 90);
    }

    /* renamed from: b */
    public final void mo46400b(@mr2 C7104c cVar, int i) {
        this.f36736a[0] = this.f36738a[i].mo36346l();
        this.f36736a[1] = this.f36738a[i].mo36347m();
        this.f36737a[i].mapPoints(this.f36736a);
        Path path = cVar.f36746a;
        float[] fArr = this.f36736a;
        if (i == 0) {
            path.moveTo(fArr[0], fArr[1]);
        } else {
            path.lineTo(fArr[0], fArr[1]);
        }
        this.f36738a[i].mo36338d(this.f36737a[i], cVar.f36746a);
        C7103b bVar = cVar.f36749a;
        if (bVar != null) {
            bVar.mo31651b(this.f36738a[i], this.f36737a[i], i);
        }
    }

    /* renamed from: c */
    public final void mo46401c(@mr2 C7104c cVar, int i) {
        Path path;
        Matrix matrix;
        fx3 fx3;
        int i2 = (i + 1) % 4;
        this.f36736a[0] = this.f36738a[i].mo36344j();
        this.f36736a[1] = this.f36738a[i].mo36345k();
        this.f36737a[i].mapPoints(this.f36736a);
        this.f36740b[0] = this.f36738a[i2].mo36346l();
        this.f36740b[1] = this.f36738a[i2].mo36347m();
        this.f36737a[i2].mapPoints(this.f36740b);
        float[] fArr = this.f36736a;
        float f = fArr[0];
        float[] fArr2 = this.f36740b;
        float max = Math.max(((float) Math.hypot((double) (f - fArr2[0]), (double) (fArr[1] - fArr2[1]))) - 0.001f, 0.0f);
        float i3 = mo46407i(cVar.f36747a, i);
        this.f36734a.mo36351q(0.0f, 0.0f);
        bs0 j = mo46408j(i, cVar.f36748a);
        j.mo24485b(max, i3, cVar.f36745a, this.f36734a);
        this.f36742c.reset();
        this.f36734a.mo36338d(this.f36741b[i], this.f36742c);
        if (!this.f36735a || (!j.mo32020a() && !mo46409l(this.f36742c, i) && !mo46409l(this.f36742c, i2))) {
            fx3 = this.f36734a;
            matrix = this.f36741b[i];
            path = cVar.f36746a;
        } else {
            Path path2 = this.f36742c;
            path2.op(path2, this.f36739b, Path.Op.DIFFERENCE);
            this.f36736a[0] = this.f36734a.mo36346l();
            this.f36736a[1] = this.f36734a.mo36347m();
            this.f36741b[i].mapPoints(this.f36736a);
            Path path3 = this.f36732a;
            float[] fArr3 = this.f36736a;
            path3.moveTo(fArr3[0], fArr3[1]);
            fx3 = this.f36734a;
            matrix = this.f36741b[i];
            path = this.f36732a;
        }
        fx3.mo36338d(matrix, path);
        C7103b bVar = cVar.f36749a;
        if (bVar != null) {
            bVar.mo31650a(this.f36734a, this.f36741b[i], i);
        }
    }

    /* renamed from: d */
    public void mo46402d(uw3 uw3, float f, RectF rectF, @mr2 Path path) {
        mo46403e(uw3, f, rectF, (C7103b) null, path);
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    /* renamed from: e */
    public void mo46403e(uw3 uw3, float f, RectF rectF, C7103b bVar, @mr2 Path path) {
        path.rewind();
        this.f36732a.rewind();
        this.f36739b.rewind();
        this.f36739b.addRect(rectF, Path.Direction.CW);
        C7104c cVar = new C7104c(uw3, f, rectF, bVar, path);
        for (int i = 0; i < 4; i++) {
            mo46410m(cVar, i);
            mo46412o(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            mo46400b(cVar, i2);
            mo46401c(cVar, i2);
        }
        path.close();
        this.f36732a.close();
        if (!this.f36732a.isEmpty()) {
            path.op(this.f36732a, Path.Op.UNION);
        }
    }

    /* renamed from: f */
    public final void mo46404f(int i, @mr2 RectF rectF, @mr2 PointF pointF) {
        float f;
        float f2;
        float f3;
        if (i == 1) {
            f3 = rectF.right;
            f2 = rectF.bottom;
        } else if (i != 2) {
            f = i != 3 ? rectF.right : rectF.left;
            f2 = rectF.top;
        } else {
            f3 = rectF.left;
            f2 = rectF.bottom;
        }
        pointF.set(f, f2);
    }

    /* renamed from: g */
    public final z80 mo46405g(int i, @mr2 uw3 uw3) {
        return i != 1 ? i != 2 ? i != 3 ? uw3.mo45822t() : uw3.mo45820r() : uw3.mo45813j() : uw3.mo45815l();
    }

    /* renamed from: h */
    public final a90 mo46406h(int i, @mr2 uw3 uw3) {
        return i != 1 ? i != 2 ? i != 3 ? uw3.mo45821s() : uw3.mo45819q() : uw3.mo45812i() : uw3.mo45814k();
    }

    /* renamed from: i */
    public final float mo46407i(@mr2 RectF rectF, int i) {
        float centerX;
        float f;
        float[] fArr = this.f36736a;
        fx3[] fx3Arr = this.f36738a;
        fArr[0] = fx3Arr[i].f28728c;
        fArr[1] = fx3Arr[i].f28729d;
        this.f36737a[i].mapPoints(fArr);
        if (i == 1 || i == 3) {
            centerX = rectF.centerX();
            f = this.f36736a[0];
        } else {
            centerX = rectF.centerY();
            f = this.f36736a[1];
        }
        return Math.abs(centerX - f);
    }

    /* renamed from: j */
    public final bs0 mo46408j(int i, @mr2 uw3 uw3) {
        return i != 1 ? i != 2 ? i != 3 ? uw3.mo45817o() : uw3.mo45818p() : uw3.mo45816n() : uw3.mo45811h();
    }

    @sj3(19)
    /* renamed from: l */
    public final boolean mo46409l(Path path, int i) {
        this.f36743d.reset();
        this.f36738a[i].mo36338d(this.f36737a[i], this.f36743d);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f36743d.computeBounds(rectF, true);
        path.op(this.f36743d, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    /* renamed from: m */
    public final void mo46410m(@mr2 C7104c cVar, int i) {
        mo46406h(i, cVar.f36748a).mo30485c(this.f36738a[i], 90.0f, cVar.f36745a, cVar.f36747a, mo46405g(i, cVar.f36748a));
        float a = mo46399a(i);
        this.f36737a[i].reset();
        mo46404f(i, cVar.f36747a, this.f36733a);
        Matrix matrix = this.f36737a[i];
        PointF pointF = this.f36733a;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f36737a[i].preRotate(a);
    }

    /* renamed from: n */
    public void mo46411n(boolean z) {
        this.f36735a = z;
    }

    /* renamed from: o */
    public final void mo46412o(int i) {
        this.f36736a[0] = this.f36738a[i].mo36344j();
        this.f36736a[1] = this.f36738a[i].mo36345k();
        this.f36737a[i].mapPoints(this.f36736a);
        float a = mo46399a(i);
        this.f36741b[i].reset();
        Matrix matrix = this.f36741b[i];
        float[] fArr = this.f36736a;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f36741b[i].preRotate(a);
    }
}
