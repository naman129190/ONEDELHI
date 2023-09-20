package com.onedelhi.secure;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

public class fx3 {

    /* renamed from: g */
    public static final float f28721g = 270.0f;

    /* renamed from: h */
    public static final float f28722h = 180.0f;
    @Deprecated

    /* renamed from: a */
    public float f28723a;

    /* renamed from: a */
    public final List<C5335h> f28724a = new ArrayList();

    /* renamed from: a */
    public boolean f28725a;
    @Deprecated

    /* renamed from: b */
    public float f28726b;

    /* renamed from: b */
    public final List<C5337j> f28727b = new ArrayList();
    @Deprecated

    /* renamed from: c */
    public float f28728c;
    @Deprecated

    /* renamed from: d */
    public float f28729d;
    @Deprecated

    /* renamed from: e */
    public float f28730e;
    @Deprecated

    /* renamed from: f */
    public float f28731f;

    /* renamed from: com.onedelhi.secure.fx3$a */
    public class C5328a extends C5337j {

        /* renamed from: a */
        public final /* synthetic */ List f28733a;

        /* renamed from: c */
        public final /* synthetic */ Matrix f28734c;

        public C5328a(List list, Matrix matrix) {
            this.f28733a = list;
            this.f28734c = matrix;
        }

        /* renamed from: a */
        public void mo36359a(Matrix matrix, sw3 sw3, int i, Canvas canvas) {
            for (C5337j a : this.f28733a) {
                a.mo36359a(this.f28734c, sw3, i, canvas);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.fx3$b */
    public static class C5329b extends C5337j {

        /* renamed from: a */
        public final C5332e f28735a;

        public C5329b(C5332e eVar) {
            this.f28735a = eVar;
        }

        /* renamed from: a */
        public void mo36359a(Matrix matrix, @mr2 sw3 sw3, int i, @mr2 Canvas canvas) {
            float h = this.f28735a.mo36368m();
            float i2 = this.f28735a.mo36369n();
            sw3.mo44582a(canvas, matrix, new RectF(this.f28735a.mo36366k(), this.f28735a.mo36370o(), this.f28735a.mo36367l(), this.f28735a.mo36365j()), i, h, i2);
        }
    }

    /* renamed from: com.onedelhi.secure.fx3$c */
    public static class C5330c extends C5337j {

        /* renamed from: a */
        public final float f28736a;

        /* renamed from: a */
        public final C5334g f28737a;

        /* renamed from: b */
        public final float f28738b;

        /* renamed from: b */
        public final C5334g f28739b;

        public C5330c(C5334g gVar, C5334g gVar2, float f, float f2) {
            this.f28737a = gVar;
            this.f28739b = gVar2;
            this.f28736a = f;
            this.f28738b = f2;
        }

        /* renamed from: a */
        public void mo36359a(Matrix matrix, sw3 sw3, int i, Canvas canvas) {
            sw3 sw32;
            Matrix matrix2 = matrix;
            sw3 sw33 = sw3;
            int i2 = i;
            Canvas canvas2 = canvas;
            float e = mo36362e();
            if (e <= 0.0f) {
                double hypot = Math.hypot((double) (this.f28737a.f28756a - this.f28736a), (double) (this.f28737a.f28757b - this.f28738b));
                double hypot2 = Math.hypot((double) (this.f28739b.f28756a - this.f28737a.f28756a), (double) (this.f28739b.f28757b - this.f28737a.f28757b));
                float min = (float) Math.min((double) i2, Math.min(hypot, hypot2));
                double d = (double) min;
                double tan = Math.tan(Math.toRadians((double) ((-e) / 2.0f))) * d;
                if (hypot > tan) {
                    RectF rectF = new RectF(0.0f, 0.0f, (float) (hypot - tan), 0.0f);
                    this.f28764a.set(matrix2);
                    this.f28764a.preTranslate(this.f28736a, this.f28738b);
                    this.f28764a.preRotate(mo36361d());
                    sw32 = sw3;
                    sw32.mo44583b(canvas2, this.f28764a, rectF, i2);
                } else {
                    sw32 = sw3;
                }
                float f = 2.0f * min;
                RectF rectF2 = new RectF(0.0f, 0.0f, f, f);
                this.f28764a.set(matrix2);
                this.f28764a.preTranslate(this.f28737a.f28756a, this.f28737a.f28757b);
                this.f28764a.preRotate(mo36361d());
                this.f28764a.preTranslate((float) ((-tan) - d), -2.0f * min);
                double d2 = tan;
                sw3.mo44584c(canvas, this.f28764a, rectF2, (int) min, 450.0f, e, new float[]{(float) (d + tan), f});
                if (hypot2 > d2) {
                    RectF rectF3 = new RectF(0.0f, 0.0f, (float) (hypot2 - d2), 0.0f);
                    this.f28764a.set(matrix2);
                    this.f28764a.preTranslate(this.f28737a.f28756a, this.f28737a.f28757b);
                    this.f28764a.preRotate(mo36360c());
                    this.f28764a.preTranslate((float) d2, 0.0f);
                    sw32.mo44583b(canvas, this.f28764a, rectF3, i);
                }
            }
        }

        /* renamed from: c */
        public float mo36360c() {
            return (float) Math.toDegrees(Math.atan((double) ((this.f28739b.f28757b - this.f28737a.f28757b) / (this.f28739b.f28756a - this.f28737a.f28756a))));
        }

        /* renamed from: d */
        public float mo36361d() {
            return (float) Math.toDegrees(Math.atan((double) ((this.f28737a.f28757b - this.f28738b) / (this.f28737a.f28756a - this.f28736a))));
        }

        /* renamed from: e */
        public float mo36362e() {
            float c = ((mo36360c() - mo36361d()) + 360.0f) % 360.0f;
            return c <= 180.0f ? c : c - 360.0f;
        }
    }

    /* renamed from: com.onedelhi.secure.fx3$d */
    public static class C5331d extends C5337j {

        /* renamed from: a */
        public final float f28740a;

        /* renamed from: a */
        public final C5334g f28741a;

        /* renamed from: b */
        public final float f28742b;

        public C5331d(C5334g gVar, float f, float f2) {
            this.f28741a = gVar;
            this.f28740a = f;
            this.f28742b = f2;
        }

        /* renamed from: a */
        public void mo36359a(Matrix matrix, @mr2 sw3 sw3, int i, @mr2 Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (this.f28741a.f28757b - this.f28742b), (double) (this.f28741a.f28756a - this.f28740a)), 0.0f);
            this.f28764a.set(matrix);
            this.f28764a.preTranslate(this.f28740a, this.f28742b);
            this.f28764a.preRotate(mo36363c());
            sw3.mo44583b(canvas, this.f28764a, rectF, i);
        }

        /* renamed from: c */
        public float mo36363c() {
            return (float) Math.toDegrees(Math.atan((double) ((this.f28741a.f28757b - this.f28742b) / (this.f28741a.f28756a - this.f28740a))));
        }
    }

    /* renamed from: com.onedelhi.secure.fx3$e */
    public static class C5332e extends C5335h {

        /* renamed from: a */
        public static final RectF f28743a = new RectF();
        @Deprecated

        /* renamed from: a */
        public float f28744a;
        @Deprecated

        /* renamed from: b */
        public float f28745b;
        @Deprecated

        /* renamed from: c */
        public float f28746c;
        @Deprecated

        /* renamed from: d */
        public float f28747d;
        @Deprecated

        /* renamed from: e */
        public float f28748e;
        @Deprecated

        /* renamed from: f */
        public float f28749f;

        public C5332e(float f, float f2, float f3, float f4) {
            mo36372q(f);
            mo36376u(f2);
            mo36373r(f3);
            mo36371p(f4);
        }

        /* renamed from: a */
        public void mo36364a(@mr2 Matrix matrix, @mr2 Path path) {
            Matrix matrix2 = this.f28758a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f28743a;
            rectF.set(mo36366k(), mo36370o(), mo36367l(), mo36365j());
            path.arcTo(rectF, mo36368m(), mo36369n(), false);
            path.transform(matrix);
        }

        /* renamed from: j */
        public final float mo36365j() {
            return this.f28747d;
        }

        /* renamed from: k */
        public final float mo36366k() {
            return this.f28744a;
        }

        /* renamed from: l */
        public final float mo36367l() {
            return this.f28746c;
        }

        /* renamed from: m */
        public final float mo36368m() {
            return this.f28748e;
        }

        /* renamed from: n */
        public final float mo36369n() {
            return this.f28749f;
        }

        /* renamed from: o */
        public final float mo36370o() {
            return this.f28745b;
        }

        /* renamed from: p */
        public final void mo36371p(float f) {
            this.f28747d = f;
        }

        /* renamed from: q */
        public final void mo36372q(float f) {
            this.f28744a = f;
        }

        /* renamed from: r */
        public final void mo36373r(float f) {
            this.f28746c = f;
        }

        /* renamed from: s */
        public final void mo36374s(float f) {
            this.f28748e = f;
        }

        /* renamed from: t */
        public final void mo36375t(float f) {
            this.f28749f = f;
        }

        /* renamed from: u */
        public final void mo36376u(float f) {
            this.f28745b = f;
        }
    }

    /* renamed from: com.onedelhi.secure.fx3$f */
    public static class C5333f extends C5335h {

        /* renamed from: a */
        public float f28750a;

        /* renamed from: b */
        public float f28751b;

        /* renamed from: c */
        public float f28752c;

        /* renamed from: d */
        public float f28753d;

        /* renamed from: e */
        public float f28754e;

        /* renamed from: f */
        public float f28755f;

        public C5333f(float f, float f2, float f3, float f4, float f5, float f6) {
            mo36383h(f);
            mo36385j(f2);
            mo36384i(f3);
            mo36386k(f4);
            mo36387l(f5);
            mo36388m(f6);
        }

        /* renamed from: a */
        public void mo36364a(@mr2 Matrix matrix, @mr2 Path path) {
            Matrix matrix2 = this.f28758a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.cubicTo(this.f28750a, this.f28751b, this.f28752c, this.f28753d, this.f28754e, this.f28755f);
            path.transform(matrix);
        }

        /* renamed from: b */
        public final float mo36377b() {
            return this.f28750a;
        }

        /* renamed from: c */
        public final float mo36378c() {
            return this.f28752c;
        }

        /* renamed from: d */
        public final float mo36379d() {
            return this.f28751b;
        }

        /* renamed from: e */
        public final float mo36380e() {
            return this.f28751b;
        }

        /* renamed from: f */
        public final float mo36381f() {
            return this.f28754e;
        }

        /* renamed from: g */
        public final float mo36382g() {
            return this.f28755f;
        }

        /* renamed from: h */
        public final void mo36383h(float f) {
            this.f28750a = f;
        }

        /* renamed from: i */
        public final void mo36384i(float f) {
            this.f28752c = f;
        }

        /* renamed from: j */
        public final void mo36385j(float f) {
            this.f28751b = f;
        }

        /* renamed from: k */
        public final void mo36386k(float f) {
            this.f28753d = f;
        }

        /* renamed from: l */
        public final void mo36387l(float f) {
            this.f28754e = f;
        }

        /* renamed from: m */
        public final void mo36388m(float f) {
            this.f28755f = f;
        }
    }

    /* renamed from: com.onedelhi.secure.fx3$g */
    public static class C5334g extends C5335h {

        /* renamed from: a */
        public float f28756a;

        /* renamed from: b */
        public float f28757b;

        /* renamed from: a */
        public void mo36364a(@mr2 Matrix matrix, @mr2 Path path) {
            Matrix matrix2 = this.f28758a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f28756a, this.f28757b);
            path.transform(matrix);
        }
    }

    /* renamed from: com.onedelhi.secure.fx3$h */
    public static abstract class C5335h {

        /* renamed from: a */
        public final Matrix f28758a = new Matrix();

        /* renamed from: a */
        public abstract void mo36364a(Matrix matrix, Path path);
    }

    /* renamed from: com.onedelhi.secure.fx3$i */
    public static class C5336i extends C5335h {
        @Deprecated

        /* renamed from: a */
        public float f28759a;
        @Deprecated

        /* renamed from: b */
        public float f28760b;
        @Deprecated

        /* renamed from: c */
        public float f28761c;
        @Deprecated

        /* renamed from: d */
        public float f28762d;

        /* renamed from: a */
        public void mo36364a(@mr2 Matrix matrix, @mr2 Path path) {
            Matrix matrix2 = this.f28758a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.quadTo(mo36389f(), mo36390g(), mo36391h(), mo36392i());
            path.transform(matrix);
        }

        /* renamed from: f */
        public final float mo36389f() {
            return this.f28759a;
        }

        /* renamed from: g */
        public final float mo36390g() {
            return this.f28760b;
        }

        /* renamed from: h */
        public final float mo36391h() {
            return this.f28761c;
        }

        /* renamed from: i */
        public final float mo36392i() {
            return this.f28762d;
        }

        /* renamed from: j */
        public final void mo36393j(float f) {
            this.f28759a = f;
        }

        /* renamed from: k */
        public final void mo36394k(float f) {
            this.f28760b = f;
        }

        /* renamed from: l */
        public final void mo36395l(float f) {
            this.f28761c = f;
        }

        /* renamed from: m */
        public final void mo36396m(float f) {
            this.f28762d = f;
        }
    }

    /* renamed from: com.onedelhi.secure.fx3$j */
    public static abstract class C5337j {

        /* renamed from: b */
        public static final Matrix f28763b = new Matrix();

        /* renamed from: a */
        public final Matrix f28764a = new Matrix();

        /* renamed from: a */
        public abstract void mo36359a(Matrix matrix, sw3 sw3, int i, Canvas canvas);

        /* renamed from: b */
        public final void mo36397b(sw3 sw3, int i, Canvas canvas) {
            mo36359a(f28763b, sw3, i, canvas);
        }
    }

    public fx3() {
        mo36351q(0.0f, 0.0f);
    }

    public fx3(float f, float f2) {
        mo36351q(f, f2);
    }

    /* renamed from: a */
    public void mo36335a(float f, float f2, float f3, float f4, float f5, float f6) {
        C5332e eVar = new C5332e(f, f2, f3, f4);
        eVar.mo36374s(f5);
        eVar.mo36375t(f6);
        this.f28724a.add(eVar);
        C5329b bVar = new C5329b(eVar);
        float f7 = f5 + f6;
        boolean z = f6 < 0.0f;
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        mo36337c(bVar, f5, z ? (180.0f + f7) % 360.0f : f7);
        double d = (double) f7;
        mo36355u(((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))));
        mo36356v(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))));
    }

    /* renamed from: b */
    public final void mo36336b(float f) {
        if (mo36342h() != f) {
            float h = ((f - mo36342h()) + 360.0f) % 360.0f;
            if (h <= 180.0f) {
                C5332e eVar = new C5332e(mo36344j(), mo36345k(), mo36344j(), mo36345k());
                eVar.mo36374s(mo36342h());
                eVar.mo36375t(h);
                this.f28727b.add(new C5329b(eVar));
                mo36353s(f);
            }
        }
    }

    /* renamed from: c */
    public final void mo36337c(C5337j jVar, float f, float f2) {
        mo36336b(f);
        this.f28727b.add(jVar);
        mo36353s(f2);
    }

    /* renamed from: d */
    public void mo36338d(Matrix matrix, Path path) {
        int size = this.f28724a.size();
        for (int i = 0; i < size; i++) {
            this.f28724a.get(i).mo36364a(matrix, path);
        }
    }

    /* renamed from: e */
    public boolean mo36339e() {
        return this.f28725a;
    }

    @mr2
    /* renamed from: f */
    public C5337j mo36340f(Matrix matrix) {
        mo36336b(mo36343i());
        return new C5328a(new ArrayList(this.f28727b), new Matrix(matrix));
    }

    @sj3(21)
    /* renamed from: g */
    public void mo36341g(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f28724a.add(new C5333f(f, f2, f3, f4, f5, f6));
        this.f28725a = true;
        mo36355u(f5);
        mo36356v(f6);
    }

    /* renamed from: h */
    public final float mo36342h() {
        return this.f28730e;
    }

    /* renamed from: i */
    public final float mo36343i() {
        return this.f28731f;
    }

    /* renamed from: j */
    public float mo36344j() {
        return this.f28728c;
    }

    /* renamed from: k */
    public float mo36345k() {
        return this.f28729d;
    }

    /* renamed from: l */
    public float mo36346l() {
        return this.f28723a;
    }

    /* renamed from: m */
    public float mo36347m() {
        return this.f28726b;
    }

    /* renamed from: n */
    public void mo36348n(float f, float f2) {
        C5334g gVar = new C5334g();
        float unused = gVar.f28756a = f;
        float unused2 = gVar.f28757b = f2;
        this.f28724a.add(gVar);
        C5331d dVar = new C5331d(gVar, mo36344j(), mo36345k());
        mo36337c(dVar, dVar.mo36363c() + 270.0f, dVar.mo36363c() + 270.0f);
        mo36355u(f);
        mo36356v(f2);
    }

    /* renamed from: o */
    public void mo36349o(float f, float f2, float f3, float f4) {
        if ((Math.abs(f - mo36344j()) >= 0.001f || Math.abs(f2 - mo36345k()) >= 0.001f) && (Math.abs(f - f3) >= 0.001f || Math.abs(f2 - f4) >= 0.001f)) {
            C5334g gVar = new C5334g();
            float unused = gVar.f28756a = f;
            float unused2 = gVar.f28757b = f2;
            this.f28724a.add(gVar);
            C5334g gVar2 = new C5334g();
            float unused3 = gVar2.f28756a = f3;
            float unused4 = gVar2.f28757b = f4;
            this.f28724a.add(gVar2);
            C5330c cVar = new C5330c(gVar, gVar2, mo36344j(), mo36345k());
            if (cVar.mo36362e() > 0.0f) {
                mo36348n(f, f2);
                mo36348n(f3, f4);
                return;
            }
            mo36337c(cVar, cVar.mo36361d() + 270.0f, cVar.mo36360c() + 270.0f);
            mo36355u(f3);
            mo36356v(f4);
            return;
        }
        mo36348n(f3, f4);
    }

    @sj3(21)
    /* renamed from: p */
    public void mo36350p(float f, float f2, float f3, float f4) {
        C5336i iVar = new C5336i();
        iVar.mo36393j(f);
        iVar.mo36394k(f2);
        iVar.mo36395l(f3);
        iVar.mo36396m(f4);
        this.f28724a.add(iVar);
        this.f28725a = true;
        mo36355u(f3);
        mo36356v(f4);
    }

    /* renamed from: q */
    public void mo36351q(float f, float f2) {
        mo36352r(f, f2, 270.0f, 0.0f);
    }

    /* renamed from: r */
    public void mo36352r(float f, float f2, float f3, float f4) {
        mo36357w(f);
        mo36358x(f2);
        mo36355u(f);
        mo36356v(f2);
        mo36353s(f3);
        mo36354t((f3 + f4) % 360.0f);
        this.f28724a.clear();
        this.f28727b.clear();
        this.f28725a = false;
    }

    /* renamed from: s */
    public final void mo36353s(float f) {
        this.f28730e = f;
    }

    /* renamed from: t */
    public final void mo36354t(float f) {
        this.f28731f = f;
    }

    /* renamed from: u */
    public final void mo36355u(float f) {
        this.f28728c = f;
    }

    /* renamed from: v */
    public final void mo36356v(float f) {
        this.f28729d = f;
    }

    /* renamed from: w */
    public final void mo36357w(float f) {
        this.f28723a = f;
    }

    /* renamed from: x */
    public final void mo36358x(float f) {
        this.f28726b = f;
    }
}
