package com.onedelhi.secure;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.onedelhi.secure.C2760lj;
import java.util.ArrayList;
import java.util.List;

public class z60 implements op0, pz2, C2760lj.C2762b, xy1 {

    /* renamed from: a */
    public final Matrix f23472a;

    /* renamed from: a */
    public Paint f23473a;

    /* renamed from: a */
    public final Path f23474a;

    /* renamed from: a */
    public RectF f23475a;

    /* renamed from: a */
    public final qa2 f23476a;
    @ts2

    /* renamed from: a */
    public rg4 f23477a;

    /* renamed from: a */
    public final String f23478a;

    /* renamed from: a */
    public final List<y60> f23479a;

    /* renamed from: a */
    public final boolean f23480a;

    /* renamed from: b */
    public final RectF f23481b;
    @ts2

    /* renamed from: b */
    public List<pz2> f23482b;

    public z60(qa2 qa2, C2861mj mjVar, bx3 bx3) {
        this(qa2, mjVar, bx3.mo13852c(), bx3.mo13853d(), m32877d(qa2, mjVar, bx3.mo13851b()), m32878i(bx3.mo13851b()));
    }

    public z60(qa2 qa2, C2861mj mjVar, String str, boolean z, List<y60> list, @ts2 C3766v6 v6Var) {
        this.f23473a = new i02();
        this.f23475a = new RectF();
        this.f23472a = new Matrix();
        this.f23474a = new Path();
        this.f23481b = new RectF();
        this.f23478a = str;
        this.f23476a = qa2;
        this.f23480a = z;
        this.f23479a = list;
        if (v6Var != null) {
            rg4 b = v6Var.mo25855b();
            this.f23477a = b;
            b.mo23856a(mjVar);
            this.f23477a.mo23857b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            y60 y60 = list.get(size);
            if (y60 instanceof ti1) {
                arrayList.add((ti1) y60);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((ti1) arrayList.get(size2)).mo20419d(list.listIterator(list.size()));
        }
    }

    /* renamed from: d */
    public static List<y60> m32877d(qa2 qa2, C2861mj mjVar, List<h70> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            y60 a = list.get(i).mo13850a(qa2, mjVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    @ts2
    /* renamed from: i */
    public static C3766v6 m32878i(List<h70> list) {
        for (int i = 0; i < list.size(); i++) {
            h70 h70 = list.get(i);
            if (h70 instanceof C3766v6) {
                return (C3766v6) h70;
            }
        }
        return null;
    }

    /* renamed from: a */
    public <T> void mo12684a(T t, @ts2 hb2<T> hb2) {
        rg4 rg4 = this.f23477a;
        if (rg4 != null) {
            rg4.mo23858c(t, hb2);
        }
    }

    /* renamed from: b */
    public void mo12685b(RectF rectF, Matrix matrix, boolean z) {
        this.f23472a.set(matrix);
        rg4 rg4 = this.f23477a;
        if (rg4 != null) {
            this.f23472a.preConcat(rg4.mo23861f());
        }
        this.f23481b.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f23479a.size() - 1; size >= 0; size--) {
            y60 y60 = this.f23479a.get(size);
            if (y60 instanceof op0) {
                ((op0) y60).mo12685b(this.f23481b, this.f23472a, z);
                rectF.union(this.f23481b);
            }
        }
    }

    /* renamed from: c */
    public void mo14992c() {
        this.f23476a.invalidateSelf();
    }

    /* renamed from: e */
    public Path mo17060e() {
        this.f23472a.reset();
        rg4 rg4 = this.f23477a;
        if (rg4 != null) {
            this.f23472a.set(rg4.mo23861f());
        }
        this.f23474a.reset();
        if (this.f23480a) {
            return this.f23474a;
        }
        for (int size = this.f23479a.size() - 1; size >= 0; size--) {
            y60 y60 = this.f23479a.get(size);
            if (y60 instanceof pz2) {
                this.f23474a.addPath(((pz2) y60).mo17060e(), this.f23472a);
            }
        }
        return this.f23474a;
    }

    /* renamed from: f */
    public void mo14993f(Canvas canvas, Matrix matrix, int i) {
        if (!this.f23480a) {
            this.f23472a.set(matrix);
            rg4 rg4 = this.f23477a;
            if (rg4 != null) {
                this.f23472a.preConcat(rg4.mo23861f());
                i = (int) ((((((float) (this.f23477a.mo23863h() == null ? 100 : this.f23477a.mo23863h().mo15565h().intValue())) / 100.0f) * ((float) i)) / 255.0f) * 255.0f);
            }
            boolean z = this.f23476a.mo22981O() && mo27815l() && i != 255;
            if (z) {
                this.f23475a.set(0.0f, 0.0f, 0.0f, 0.0f);
                mo12685b(this.f23475a, this.f23472a, true);
                this.f23473a.setAlpha(i);
                yq4.m32611n(canvas, this.f23475a, this.f23473a);
            }
            if (z) {
                i = 255;
            }
            for (int size = this.f23479a.size() - 1; size >= 0; size--) {
                y60 y60 = this.f23479a.get(size);
                if (y60 instanceof op0) {
                    ((op0) y60).mo14993f(canvas, this.f23472a, i);
                }
            }
            if (z) {
                canvas.restore();
            }
        }
    }

    /* renamed from: g */
    public void mo14994g(List<y60> list, List<y60> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f23479a.size());
        arrayList.addAll(list);
        for (int size = this.f23479a.size() - 1; size >= 0; size--) {
            y60 y60 = this.f23479a.get(size);
            y60.mo14994g(arrayList, this.f23479a.subList(0, size));
            arrayList.add(y60);
        }
    }

    public String getName() {
        return this.f23478a;
    }

    /* renamed from: h */
    public void mo14996h(wy1 wy1, int i, List<wy1> list, wy1 wy12) {
        if (wy1.mo26725h(getName(), i)) {
            if (!"__container".equals(getName())) {
                wy12 = wy12.mo26718a(getName());
                if (wy1.mo26720c(getName(), i)) {
                    list.add(wy12.mo26727j(this));
                }
            }
            if (wy1.mo26726i(getName(), i)) {
                int e = i + wy1.mo26722e(getName(), i);
                for (int i2 = 0; i2 < this.f23479a.size(); i2++) {
                    y60 y60 = this.f23479a.get(i2);
                    if (y60 instanceof xy1) {
                        ((xy1) y60).mo14996h(wy1, e, list, wy12);
                    }
                }
            }
        }
    }

    /* renamed from: j */
    public List<pz2> mo27813j() {
        if (this.f23482b == null) {
            this.f23482b = new ArrayList();
            for (int i = 0; i < this.f23479a.size(); i++) {
                y60 y60 = this.f23479a.get(i);
                if (y60 instanceof pz2) {
                    this.f23482b.add((pz2) y60);
                }
            }
        }
        return this.f23482b;
    }

    /* renamed from: k */
    public Matrix mo27814k() {
        rg4 rg4 = this.f23477a;
        if (rg4 != null) {
            return rg4.mo23861f();
        }
        this.f23472a.reset();
        return this.f23472a;
    }

    /* renamed from: l */
    public final boolean mo27815l() {
        int i = 0;
        for (int i2 = 0; i2 < this.f23479a.size(); i2++) {
            if ((this.f23479a.get(i2) instanceof op0) && (i = i + 1) >= 2) {
                return true;
            }
        }
        return false;
    }
}
