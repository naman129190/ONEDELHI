package com.onedelhi.secure;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

public class xw3 {

    /* renamed from: a */
    public PointF f22795a;

    /* renamed from: a */
    public final List<tb0> f22796a;

    /* renamed from: a */
    public boolean f22797a;

    public xw3() {
        this.f22796a = new ArrayList();
    }

    public xw3(PointF pointF, boolean z, List<tb0> list) {
        this.f22795a = pointF;
        this.f22797a = z;
        this.f22796a = new ArrayList(list);
    }

    /* renamed from: a */
    public List<tb0> mo27117a() {
        return this.f22796a;
    }

    /* renamed from: b */
    public PointF mo27118b() {
        return this.f22795a;
    }

    /* renamed from: c */
    public void mo27119c(xw3 xw3, xw3 xw32, @d81(from = 0.0d, mo14561to = 1.0d) float f) {
        if (this.f22795a == null) {
            this.f22795a = new PointF();
        }
        this.f22797a = xw3.mo27120d() || xw32.mo27120d();
        if (xw3.mo27117a().size() != xw32.mo27117a().size()) {
            p92.m24544e("Curves must have the same number of control points. Shape 1: " + xw3.mo27117a().size() + "\tShape 2: " + xw32.mo27117a().size());
        }
        int min = Math.min(xw3.mo27117a().size(), xw32.mo27117a().size());
        if (this.f22796a.size() < min) {
            for (int size = this.f22796a.size(); size < min; size++) {
                this.f22796a.add(new tb0());
            }
        } else if (this.f22796a.size() > min) {
            for (int size2 = this.f22796a.size() - 1; size2 >= min; size2--) {
                List<tb0> list = this.f22796a;
                list.remove(list.size() - 1);
            }
        }
        PointF b = xw3.mo27118b();
        PointF b2 = xw32.mo27118b();
        mo27121e(hj2.m16795j(b.x, b2.x, f), hj2.m16795j(b.y, b2.y, f));
        for (int size3 = this.f22796a.size() - 1; size3 >= 0; size3--) {
            tb0 tb0 = xw3.mo27117a().get(size3);
            tb0 tb02 = xw32.mo27117a().get(size3);
            PointF a = tb0.mo24819a();
            PointF b3 = tb0.mo24820b();
            PointF c = tb0.mo24821c();
            PointF a2 = tb02.mo24819a();
            PointF b4 = tb02.mo24820b();
            PointF c2 = tb02.mo24821c();
            this.f22796a.get(size3).mo24822d(hj2.m16795j(a.x, a2.x, f), hj2.m16795j(a.y, a2.y, f));
            this.f22796a.get(size3).mo24823e(hj2.m16795j(b3.x, b4.x, f), hj2.m16795j(b3.y, b4.y, f));
            this.f22796a.get(size3).mo24824f(hj2.m16795j(c.x, c2.x, f), hj2.m16795j(c.y, c2.y, f));
        }
    }

    /* renamed from: d */
    public boolean mo27120d() {
        return this.f22797a;
    }

    /* renamed from: e */
    public final void mo27121e(float f, float f2) {
        if (this.f22795a == null) {
            this.f22795a = new PointF();
        }
        this.f22795a.set(f, f2);
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f22796a.size() + "closed=" + this.f22797a + '}';
    }
}
