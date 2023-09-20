package com.onedelhi.secure;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.onedelhi.secure.C2760lj;
import java.util.ArrayList;
import java.util.List;

public class e31 implements op0, C2760lj.C2762b, yy1 {

    /* renamed from: a */
    public final Paint f11079a = new i02(1);

    /* renamed from: a */
    public final Path f11080a;

    /* renamed from: a */
    public final C2760lj<Integer, Integer> f11081a;

    /* renamed from: a */
    public final C2861mj f11082a;

    /* renamed from: a */
    public final qa2 f11083a;

    /* renamed from: a */
    public final String f11084a;

    /* renamed from: a */
    public final List<pz2> f11085a = new ArrayList();

    /* renamed from: a */
    public final boolean f11086a;

    /* renamed from: b */
    public final C2760lj<Integer, Integer> f11087b;
    @ts2

    /* renamed from: c */
    public C2760lj<ColorFilter, ColorFilter> f11088c;

    public e31(qa2 qa2, C2861mj mjVar, zw3 zw3) {
        Path path = new Path();
        this.f11080a = path;
        this.f11082a = mjVar;
        this.f11084a = zw3.mo28154d();
        this.f11086a = zw3.mo28156f();
        this.f11083a = qa2;
        if (zw3.mo28152b() == null || zw3.mo28155e() == null) {
            this.f11081a = null;
            this.f11087b = null;
            return;
        }
        path.setFillType(zw3.mo28153c());
        C2760lj<Integer, Integer> a = zw3.mo28152b().mo17597a();
        this.f11081a = a;
        a.mo19638a(this);
        mjVar.mo20432j(a);
        C2760lj<Integer, Integer> a2 = zw3.mo28155e().mo17597a();
        this.f11087b = a2;
        a2.mo19638a(this);
        mjVar.mo20432j(a2);
    }

    /* renamed from: a */
    public <T> void mo12684a(T t, @ts2 hb2<T> hb2) {
        C2760lj<Integer, Integer> ljVar;
        if (t == ab2.f8958a) {
            ljVar = this.f11081a;
        } else if (t == ab2.f8968d) {
            ljVar = this.f11087b;
        } else if (t == ab2.f8954a) {
            C2760lj<ColorFilter, ColorFilter> ljVar2 = this.f11088c;
            if (ljVar2 != null) {
                this.f11082a.mo20427D(ljVar2);
            }
            if (hb2 == null) {
                this.f11088c = null;
                return;
            }
            es4 es4 = new es4(hb2);
            this.f11088c = es4;
            es4.mo19638a(this);
            this.f11082a.mo20432j(this.f11088c);
            return;
        } else {
            return;
        }
        ljVar.mo19645m(hb2);
    }

    /* renamed from: b */
    public void mo12685b(RectF rectF, Matrix matrix, boolean z) {
        this.f11080a.reset();
        for (int i = 0; i < this.f11085a.size(); i++) {
            this.f11080a.addPath(this.f11085a.get(i).mo17060e(), matrix);
        }
        this.f11080a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    /* renamed from: c */
    public void mo14992c() {
        this.f11083a.invalidateSelf();
    }

    /* renamed from: f */
    public void mo14993f(Canvas canvas, Matrix matrix, int i) {
        if (!this.f11086a) {
            h02.m16420a("FillContent#draw");
            this.f11079a.setColor(((e10) this.f11081a).mo14974o());
            this.f11079a.setAlpha(hj2.m16788c((int) ((((((float) i) / 255.0f) * ((float) this.f11087b.mo15565h().intValue())) / 100.0f) * 255.0f), 0, 255));
            C2760lj<ColorFilter, ColorFilter> ljVar = this.f11088c;
            if (ljVar != null) {
                this.f11079a.setColorFilter(ljVar.mo15565h());
            }
            this.f11080a.reset();
            for (int i2 = 0; i2 < this.f11085a.size(); i2++) {
                this.f11080a.addPath(this.f11085a.get(i2).mo17060e(), matrix);
            }
            canvas.drawPath(this.f11080a, this.f11079a);
            h02.m16421b("FillContent#draw");
        }
    }

    /* renamed from: g */
    public void mo14994g(List<y60> list, List<y60> list2) {
        for (int i = 0; i < list2.size(); i++) {
            y60 y60 = list2.get(i);
            if (y60 instanceof pz2) {
                this.f11085a.add((pz2) y60);
            }
        }
    }

    public String getName() {
        return this.f11084a;
    }

    /* renamed from: h */
    public void mo14996h(wy1 wy1, int i, List<wy1> list, wy1 wy12) {
        hj2.m16797l(wy1, i, list, wy12, this);
    }
}
