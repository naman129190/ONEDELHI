package com.onedelhi.secure;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.onedelhi.secure.C2760lj;
import com.onedelhi.secure.lx3;
import java.util.List;

public class rg3 implements C2760lj.C2762b, yy1, pz2 {

    /* renamed from: a */
    public final Path f19840a = new Path();

    /* renamed from: a */
    public final RectF f19841a = new RectF();

    /* renamed from: a */
    public d40 f19842a = new d40();

    /* renamed from: a */
    public final C2760lj<?, PointF> f19843a;

    /* renamed from: a */
    public final qa2 f19844a;

    /* renamed from: a */
    public final String f19845a;

    /* renamed from: a */
    public final boolean f19846a;

    /* renamed from: b */
    public final C2760lj<?, PointF> f19847b;

    /* renamed from: b */
    public boolean f19848b;

    /* renamed from: c */
    public final C2760lj<?, Float> f19849c;

    public rg3(qa2 qa2, C2861mj mjVar, sg3 sg3) {
        this.f19845a = sg3.mo24369c();
        this.f19846a = sg3.mo24372f();
        this.f19844a = qa2;
        C2760lj<PointF, PointF> a = sg3.mo24370d().mo17597a();
        this.f19843a = a;
        C2760lj<PointF, PointF> a2 = sg3.mo24371e().mo17597a();
        this.f19847b = a2;
        C2760lj<Float, Float> a3 = sg3.mo24368b().mo17597a();
        this.f19849c = a3;
        mjVar.mo20432j(a);
        mjVar.mo20432j(a2);
        mjVar.mo20432j(a3);
        a.mo19638a(this);
        a2.mo19638a(this);
        a3.mo19638a(this);
    }

    /* renamed from: a */
    public <T> void mo12684a(T t, @ts2 hb2<T> hb2) {
        C2760lj ljVar;
        if (t == ab2.f8966d) {
            ljVar = this.f19847b;
        } else if (t == ab2.f8969e) {
            ljVar = this.f19843a;
        } else if (t == ab2.f8957a) {
            ljVar = this.f19849c;
        } else {
            return;
        }
        ljVar.mo19645m(hb2);
    }

    /* renamed from: c */
    public void mo14992c() {
        mo23855d();
    }

    /* renamed from: d */
    public final void mo23855d() {
        this.f19848b = false;
        this.f19844a.invalidateSelf();
    }

    /* renamed from: e */
    public Path mo17060e() {
        if (this.f19848b) {
            return this.f19840a;
        }
        this.f19840a.reset();
        if (!this.f19846a) {
            PointF h = this.f19847b.mo15565h();
            float f = h.x / 2.0f;
            float f2 = h.y / 2.0f;
            C2760lj<?, Float> ljVar = this.f19849c;
            float o = ljVar == null ? 0.0f : ((z71) ljVar).mo27830o();
            float min = Math.min(f, f2);
            if (o > min) {
                o = min;
            }
            PointF h2 = this.f19843a.mo15565h();
            this.f19840a.moveTo(h2.x + f, (h2.y - f2) + o);
            this.f19840a.lineTo(h2.x + f, (h2.y + f2) - o);
            int i = (o > 0.0f ? 1 : (o == 0.0f ? 0 : -1));
            if (i > 0) {
                RectF rectF = this.f19841a;
                float f3 = h2.x;
                float f4 = o * 2.0f;
                float f5 = h2.y;
                rectF.set((f3 + f) - f4, (f5 + f2) - f4, f3 + f, f5 + f2);
                this.f19840a.arcTo(this.f19841a, 0.0f, 90.0f, false);
            }
            this.f19840a.lineTo((h2.x - f) + o, h2.y + f2);
            if (i > 0) {
                RectF rectF2 = this.f19841a;
                float f6 = h2.x;
                float f7 = h2.y;
                float f8 = o * 2.0f;
                rectF2.set(f6 - f, (f7 + f2) - f8, (f6 - f) + f8, f7 + f2);
                this.f19840a.arcTo(this.f19841a, 90.0f, 90.0f, false);
            }
            this.f19840a.lineTo(h2.x - f, (h2.y - f2) + o);
            if (i > 0) {
                RectF rectF3 = this.f19841a;
                float f9 = h2.x;
                float f10 = h2.y;
                float f11 = o * 2.0f;
                rectF3.set(f9 - f, f10 - f2, (f9 - f) + f11, (f10 - f2) + f11);
                this.f19840a.arcTo(this.f19841a, 180.0f, 90.0f, false);
            }
            this.f19840a.lineTo((h2.x + f) - o, h2.y - f2);
            if (i > 0) {
                RectF rectF4 = this.f19841a;
                float f12 = h2.x;
                float f13 = o * 2.0f;
                float f14 = h2.y;
                rectF4.set((f12 + f) - f13, f14 - f2, f12 + f, (f14 - f2) + f13);
                this.f19840a.arcTo(this.f19841a, 270.0f, 90.0f, false);
            }
            this.f19840a.close();
            this.f19842a.mo14492b(this.f19840a);
        }
        this.f19848b = true;
        return this.f19840a;
    }

    /* renamed from: g */
    public void mo14994g(List<y60> list, List<y60> list2) {
        for (int i = 0; i < list.size(); i++) {
            y60 y60 = list.get(i);
            if (y60 instanceof ti4) {
                ti4 ti4 = (ti4) y60;
                if (ti4.mo25121j() == lx3.C2789a.SIMULTANEOUSLY) {
                    this.f19842a.mo14491a(ti4);
                    ti4.mo25117a(this);
                }
            }
        }
    }

    public String getName() {
        return this.f19845a;
    }

    /* renamed from: h */
    public void mo14996h(wy1 wy1, int i, List<wy1> list, wy1 wy12) {
        hj2.m16797l(wy1, i, list, wy12, this);
    }
}
