package com.onedelhi.secure;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;

public class x54 extends C3716uj {

    /* renamed from: a */
    public final String f22447a;

    /* renamed from: a */
    public final boolean f22448a;

    /* renamed from: b */
    public final C2861mj f22449b;

    /* renamed from: e */
    public final C2760lj<Integer, Integer> f22450e;
    @ts2

    /* renamed from: f */
    public C2760lj<ColorFilter, ColorFilter> f22451f;

    public x54(qa2 qa2, C2861mj mjVar, jx3 jx3) {
        super(qa2, mjVar, jx3.mo18700b().mo18710a(), jx3.mo18703e().mo18711a(), jx3.mo18705g(), jx3.mo18707i(), jx3.mo18708j(), jx3.mo18704f(), jx3.mo18702d());
        this.f22449b = mjVar;
        this.f22447a = jx3.mo18706h();
        this.f22448a = jx3.mo18709k();
        C2760lj<Integer, Integer> a = jx3.mo18701c().mo17597a();
        this.f22450e = a;
        a.mo19638a(this);
        mjVar.mo20432j(a);
    }

    /* renamed from: a */
    public <T> void mo12684a(T t, @ts2 hb2<T> hb2) {
        super.mo12684a(t, hb2);
        if (t == ab2.f8962b) {
            this.f22450e.mo19645m(hb2);
        } else if (t == ab2.f8954a) {
            C2760lj<ColorFilter, ColorFilter> ljVar = this.f22451f;
            if (ljVar != null) {
                this.f22449b.mo20427D(ljVar);
            }
            if (hb2 == null) {
                this.f22451f = null;
                return;
            }
            es4 es4 = new es4(hb2);
            this.f22451f = es4;
            es4.mo19638a(this);
            this.f22449b.mo20432j(this.f22450e);
        }
    }

    /* renamed from: f */
    public void mo14993f(Canvas canvas, Matrix matrix, int i) {
        if (!this.f22448a) {
            this.f21391a.setColor(((e10) this.f22450e).mo14974o());
            C2760lj<ColorFilter, ColorFilter> ljVar = this.f22451f;
            if (ljVar != null) {
                this.f21391a.setColorFilter(ljVar.mo15565h());
            }
            super.mo14993f(canvas, matrix, i);
        }
    }

    public String getName() {
        return this.f22447a;
    }
}
