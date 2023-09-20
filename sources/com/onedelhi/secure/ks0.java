package com.onedelhi.secure;

import android.graphics.Path;
import android.graphics.PointF;
import com.onedelhi.secure.C2760lj;
import com.onedelhi.secure.lx3;
import java.util.List;

public class ks0 implements pz2, C2760lj.C2762b, yy1 {

    /* renamed from: a */
    public static final float f15058a = 0.55228f;

    /* renamed from: a */
    public final Path f15059a = new Path();

    /* renamed from: a */
    public d40 f15060a = new d40();

    /* renamed from: a */
    public final C2012dy f15061a;

    /* renamed from: a */
    public final C2760lj<?, PointF> f15062a;

    /* renamed from: a */
    public final qa2 f15063a;

    /* renamed from: a */
    public final String f15064a;

    /* renamed from: a */
    public boolean f15065a;

    /* renamed from: b */
    public final C2760lj<?, PointF> f15066b;

    public ks0(qa2 qa2, C2861mj mjVar, C2012dy dyVar) {
        this.f15064a = dyVar.mo14941b();
        this.f15063a = qa2;
        C2760lj<PointF, PointF> a = dyVar.mo14943d().mo17597a();
        this.f15062a = a;
        C2760lj<PointF, PointF> a2 = dyVar.mo14942c().mo17597a();
        this.f15066b = a2;
        this.f15061a = dyVar;
        mjVar.mo20432j(a);
        mjVar.mo20432j(a2);
        a.mo19638a(this);
        a2.mo19638a(this);
    }

    /* renamed from: a */
    public <T> void mo12684a(T t, @ts2 hb2<T> hb2) {
        C2760lj<?, PointF> ljVar;
        if (t == ab2.f8963c) {
            ljVar = this.f15062a;
        } else if (t == ab2.f8969e) {
            ljVar = this.f15066b;
        } else {
            return;
        }
        ljVar.mo19645m(hb2);
    }

    /* renamed from: c */
    public void mo14992c() {
        mo19186d();
    }

    /* renamed from: d */
    public final void mo19186d() {
        this.f15065a = false;
        this.f15063a.invalidateSelf();
    }

    /* renamed from: e */
    public Path mo17060e() {
        if (this.f15065a) {
            return this.f15059a;
        }
        this.f15059a.reset();
        if (!this.f15061a.mo14944e()) {
            PointF h = this.f15062a.mo15565h();
            float f = h.x / 2.0f;
            float f2 = h.y / 2.0f;
            float f3 = f * 0.55228f;
            float f4 = 0.55228f * f2;
            this.f15059a.reset();
            if (this.f15061a.mo14945f()) {
                float f5 = -f2;
                this.f15059a.moveTo(0.0f, f5);
                float f6 = 0.0f - f3;
                float f7 = -f;
                float f8 = 0.0f - f4;
                this.f15059a.cubicTo(f6, f5, f7, f8, f7, 0.0f);
                float f9 = f4 + 0.0f;
                float f10 = f5;
                this.f15059a.cubicTo(f7, f9, f6, f2, 0.0f, f2);
                float f11 = f3 + 0.0f;
                this.f15059a.cubicTo(f11, f2, f, f9, f, 0.0f);
                this.f15059a.cubicTo(f, f8, f11, f10, 0.0f, f10);
            } else {
                float f12 = -f2;
                this.f15059a.moveTo(0.0f, f12);
                float f13 = f3 + 0.0f;
                float f14 = 0.0f - f4;
                this.f15059a.cubicTo(f13, f12, f, f14, f, 0.0f);
                float f15 = f4 + 0.0f;
                this.f15059a.cubicTo(f, f15, f13, f2, 0.0f, f2);
                float f16 = 0.0f - f3;
                float f17 = -f;
                this.f15059a.cubicTo(f16, f2, f17, f15, f17, 0.0f);
                float f18 = f12;
                this.f15059a.cubicTo(f17, f14, f16, f18, 0.0f, f18);
            }
            PointF h2 = this.f15066b.mo15565h();
            this.f15059a.offset(h2.x, h2.y);
            this.f15059a.close();
            this.f15060a.mo14492b(this.f15059a);
        }
        this.f15065a = true;
        return this.f15059a;
    }

    /* renamed from: g */
    public void mo14994g(List<y60> list, List<y60> list2) {
        for (int i = 0; i < list.size(); i++) {
            y60 y60 = list.get(i);
            if (y60 instanceof ti4) {
                ti4 ti4 = (ti4) y60;
                if (ti4.mo25121j() == lx3.C2789a.SIMULTANEOUSLY) {
                    this.f15060a.mo14491a(ti4);
                    ti4.mo25117a(this);
                }
            }
        }
    }

    public String getName() {
        return this.f15064a;
    }

    /* renamed from: h */
    public void mo14996h(wy1 wy1, int i, List<wy1> list, wy1 wy12) {
        hj2.m16797l(wy1, i, list, wy12, this);
    }
}
