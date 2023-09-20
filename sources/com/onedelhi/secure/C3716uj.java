package com.onedelhi.secure;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.onedelhi.secure.C2760lj;
import com.onedelhi.secure.lx3;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.onedelhi.secure.uj */
public abstract class C3716uj implements C2760lj.C2762b, yy1, op0 {

    /* renamed from: a */
    public final Paint f21391a;

    /* renamed from: a */
    public final Path f21392a = new Path();

    /* renamed from: a */
    public final PathMeasure f21393a = new PathMeasure();

    /* renamed from: a */
    public final RectF f21394a = new RectF();

    /* renamed from: a */
    public final C2760lj<?, Float> f21395a;

    /* renamed from: a */
    public final C2861mj f21396a;

    /* renamed from: a */
    public final qa2 f21397a;

    /* renamed from: a */
    public final List<C3718b> f21398a = new ArrayList();

    /* renamed from: a */
    public final float[] f21399a;

    /* renamed from: b */
    public final Path f21400b = new Path();

    /* renamed from: b */
    public final C2760lj<?, Integer> f21401b;

    /* renamed from: b */
    public final List<C2760lj<?, Float>> f21402b;
    @ts2

    /* renamed from: c */
    public final C2760lj<?, Float> f21403c;
    @ts2

    /* renamed from: d */
    public C2760lj<ColorFilter, ColorFilter> f21404d;

    /* renamed from: com.onedelhi.secure.uj$b */
    public static final class C3718b {
        @ts2

        /* renamed from: a */
        public final ti4 f21405a;

        /* renamed from: a */
        public final List<pz2> f21406a;

        public C3718b(@ts2 ti4 ti4) {
            this.f21406a = new ArrayList();
            this.f21405a = ti4;
        }
    }

    public C3716uj(qa2 qa2, C2861mj mjVar, Paint.Cap cap, Paint.Join join, float f, C2695l6 l6Var, C2475j6 j6Var, List<C2475j6> list, C2475j6 j6Var2) {
        i02 i02 = new i02(1);
        this.f21391a = i02;
        this.f21397a = qa2;
        this.f21396a = mjVar;
        i02.setStyle(Paint.Style.STROKE);
        i02.setStrokeCap(cap);
        i02.setStrokeJoin(join);
        i02.setStrokeMiter(f);
        this.f21401b = l6Var.mo17597a();
        this.f21395a = j6Var.mo17597a();
        this.f21403c = j6Var2 == null ? null : j6Var2.mo17597a();
        this.f21402b = new ArrayList(list.size());
        this.f21399a = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.f21402b.add(list.get(i).mo17597a());
        }
        mjVar.mo20432j(this.f21401b);
        mjVar.mo20432j(this.f21395a);
        for (int i2 = 0; i2 < this.f21402b.size(); i2++) {
            mjVar.mo20432j(this.f21402b.get(i2));
        }
        C2760lj<?, Float> ljVar = this.f21403c;
        if (ljVar != null) {
            mjVar.mo20432j(ljVar);
        }
        this.f21401b.mo19638a(this);
        this.f21395a.mo19638a(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.f21402b.get(i3).mo19638a(this);
        }
        C2760lj<?, Float> ljVar2 = this.f21403c;
        if (ljVar2 != null) {
            ljVar2.mo19638a(this);
        }
    }

    @C3740us
    /* renamed from: a */
    public <T> void mo12684a(T t, @ts2 hb2<T> hb2) {
        C2760lj ljVar;
        if (t == ab2.f8968d) {
            ljVar = this.f21401b;
        } else if (t == ab2.f8970e) {
            ljVar = this.f21395a;
        } else if (t == ab2.f8954a) {
            C2760lj<ColorFilter, ColorFilter> ljVar2 = this.f21404d;
            if (ljVar2 != null) {
                this.f21396a.mo20427D(ljVar2);
            }
            if (hb2 == null) {
                this.f21404d = null;
                return;
            }
            es4 es4 = new es4(hb2);
            this.f21404d = es4;
            es4.mo19638a(this);
            this.f21396a.mo20432j(this.f21404d);
            return;
        } else {
            return;
        }
        ljVar.mo19645m(hb2);
    }

    /* renamed from: b */
    public void mo12685b(RectF rectF, Matrix matrix, boolean z) {
        h02.m16420a("StrokeContent#getBounds");
        this.f21392a.reset();
        for (int i = 0; i < this.f21398a.size(); i++) {
            C3718b bVar = this.f21398a.get(i);
            for (int i2 = 0; i2 < bVar.f21406a.size(); i2++) {
                this.f21392a.addPath(((pz2) bVar.f21406a.get(i2)).mo17060e(), matrix);
            }
        }
        this.f21392a.computeBounds(this.f21394a, false);
        float o = ((z71) this.f21395a).mo27830o();
        RectF rectF2 = this.f21394a;
        float f = o / 2.0f;
        rectF2.set(rectF2.left - f, rectF2.top - f, rectF2.right + f, rectF2.bottom + f);
        rectF.set(this.f21394a);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        h02.m16421b("StrokeContent#getBounds");
    }

    /* renamed from: c */
    public void mo14992c() {
        this.f21397a.invalidateSelf();
    }

    /* renamed from: d */
    public final void mo25639d(Matrix matrix) {
        h02.m16420a("StrokeContent#applyDashPattern");
        if (this.f21402b.isEmpty()) {
            h02.m16421b("StrokeContent#applyDashPattern");
            return;
        }
        float g = yq4.m32604g(matrix);
        for (int i = 0; i < this.f21402b.size(); i++) {
            this.f21399a[i] = ((Float) this.f21402b.get(i).mo15565h()).floatValue();
            if (i % 2 == 0) {
                float[] fArr = this.f21399a;
                if (fArr[i] < 1.0f) {
                    fArr[i] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f21399a;
                if (fArr2[i] < 0.1f) {
                    fArr2[i] = 0.1f;
                }
            }
            float[] fArr3 = this.f21399a;
            fArr3[i] = fArr3[i] * g;
        }
        C2760lj<?, Float> ljVar = this.f21403c;
        this.f21391a.setPathEffect(new DashPathEffect(this.f21399a, ljVar == null ? 0.0f : g * ljVar.mo15565h().floatValue()));
        h02.m16421b("StrokeContent#applyDashPattern");
    }

    /* renamed from: f */
    public void mo14993f(Canvas canvas, Matrix matrix, int i) {
        h02.m16420a("StrokeContent#draw");
        if (yq4.m32605h(matrix)) {
            h02.m16421b("StrokeContent#draw");
            return;
        }
        this.f21391a.setAlpha(hj2.m16788c((int) ((((((float) i) / 255.0f) * ((float) ((ns1) this.f21401b).mo21450o())) / 100.0f) * 255.0f), 0, 255));
        this.f21391a.setStrokeWidth(((z71) this.f21395a).mo27830o() * yq4.m32604g(matrix));
        if (this.f21391a.getStrokeWidth() <= 0.0f) {
            h02.m16421b("StrokeContent#draw");
            return;
        }
        mo25639d(matrix);
        C2760lj<ColorFilter, ColorFilter> ljVar = this.f21404d;
        if (ljVar != null) {
            this.f21391a.setColorFilter(ljVar.mo15565h());
        }
        for (int i2 = 0; i2 < this.f21398a.size(); i2++) {
            C3718b bVar = this.f21398a.get(i2);
            if (bVar.f21405a != null) {
                mo25640i(canvas, bVar, matrix);
            } else {
                h02.m16420a("StrokeContent#buildPath");
                this.f21392a.reset();
                for (int size = bVar.f21406a.size() - 1; size >= 0; size--) {
                    this.f21392a.addPath(((pz2) bVar.f21406a.get(size)).mo17060e(), matrix);
                }
                h02.m16421b("StrokeContent#buildPath");
                h02.m16420a("StrokeContent#drawPath");
                canvas.drawPath(this.f21392a, this.f21391a);
                h02.m16421b("StrokeContent#drawPath");
            }
        }
        h02.m16421b("StrokeContent#draw");
    }

    /* renamed from: g */
    public void mo14994g(List<y60> list, List<y60> list2) {
        ti4 ti4 = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            y60 y60 = list.get(size);
            if (y60 instanceof ti4) {
                ti4 ti42 = (ti4) y60;
                if (ti42.mo25121j() == lx3.C2789a.INDIVIDUALLY) {
                    ti4 = ti42;
                }
            }
        }
        if (ti4 != null) {
            ti4.mo25117a(this);
        }
        C3718b bVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            y60 y602 = list2.get(size2);
            if (y602 instanceof ti4) {
                ti4 ti43 = (ti4) y602;
                if (ti43.mo25121j() == lx3.C2789a.INDIVIDUALLY) {
                    if (bVar != null) {
                        this.f21398a.add(bVar);
                    }
                    bVar = new C3718b(ti43);
                    ti43.mo25117a(this);
                }
            }
            if (y602 instanceof pz2) {
                if (bVar == null) {
                    bVar = new C3718b(ti4);
                }
                bVar.f21406a.add((pz2) y602);
            }
        }
        if (bVar != null) {
            this.f21398a.add(bVar);
        }
    }

    /* renamed from: h */
    public void mo14996h(wy1 wy1, int i, List<wy1> list, wy1 wy12) {
        hj2.m16797l(wy1, i, list, wy12, this);
    }

    /* renamed from: i */
    public final void mo25640i(Canvas canvas, C3718b bVar, Matrix matrix) {
        float f;
        h02.m16420a("StrokeContent#applyTrimPath");
        if (bVar.f21405a == null) {
            h02.m16421b("StrokeContent#applyTrimPath");
            return;
        }
        this.f21392a.reset();
        for (int size = bVar.f21406a.size() - 1; size >= 0; size--) {
            this.f21392a.addPath(((pz2) bVar.f21406a.get(size)).mo17060e(), matrix);
        }
        this.f21393a.setPath(this.f21392a, false);
        float length = this.f21393a.getLength();
        while (this.f21393a.nextContour()) {
            length += this.f21393a.getLength();
        }
        float floatValue = (bVar.f21405a.mo25119h().mo15565h().floatValue() * length) / 360.0f;
        float floatValue2 = ((bVar.f21405a.mo25120i().mo15565h().floatValue() * length) / 100.0f) + floatValue;
        float floatValue3 = ((bVar.f21405a.mo25118d().mo15565h().floatValue() * length) / 100.0f) + floatValue;
        float f2 = 0.0f;
        for (int size2 = bVar.f21406a.size() - 1; size2 >= 0; size2--) {
            this.f21400b.set(((pz2) bVar.f21406a.get(size2)).mo17060e());
            this.f21400b.transform(matrix);
            this.f21393a.setPath(this.f21400b, false);
            float length2 = this.f21393a.getLength();
            float f3 = 1.0f;
            if (floatValue3 > length) {
                float f4 = floatValue3 - length;
                if (f4 < f2 + length2 && f2 < f4) {
                    f = floatValue2 > length ? (floatValue2 - length) / length2 : 0.0f;
                    f3 = Math.min(f4 / length2, 1.0f);
                    yq4.m32598a(this.f21400b, f, f3, 0.0f);
                    canvas.drawPath(this.f21400b, this.f21391a);
                    f2 += length2;
                }
            }
            float f5 = f2 + length2;
            if (f5 >= floatValue2 && f2 <= floatValue3) {
                if (f5 > floatValue3 || floatValue2 >= f2) {
                    f = floatValue2 < f2 ? 0.0f : (floatValue2 - f2) / length2;
                    if (floatValue3 <= f5) {
                        f3 = (floatValue3 - f2) / length2;
                    }
                    yq4.m32598a(this.f21400b, f, f3, 0.0f);
                }
                canvas.drawPath(this.f21400b, this.f21391a);
            }
            f2 += length2;
        }
        h02.m16421b("StrokeContent#applyTrimPath");
    }
}
