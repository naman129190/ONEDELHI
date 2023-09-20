package com.onedelhi.secure;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.onedelhi.secure.C2760lj;
import java.util.Collections;

public class rg4 {

    /* renamed from: a */
    public final Matrix f19850a = new Matrix();
    @mr2

    /* renamed from: a */
    public C2760lj<PointF, PointF> f19851a;
    @ts2

    /* renamed from: a */
    public z71 f19852a;

    /* renamed from: a */
    public final float[] f19853a;

    /* renamed from: b */
    public final Matrix f19854b;
    @mr2

    /* renamed from: b */
    public C2760lj<?, PointF> f19855b;
    @ts2

    /* renamed from: b */
    public z71 f19856b;

    /* renamed from: c */
    public final Matrix f19857c;
    @mr2

    /* renamed from: c */
    public C2760lj<jr3, jr3> f19858c;

    /* renamed from: d */
    public final Matrix f19859d;
    @mr2

    /* renamed from: d */
    public C2760lj<Float, Float> f19860d;
    @mr2

    /* renamed from: e */
    public C2760lj<Integer, Integer> f19861e;
    @ts2

    /* renamed from: f */
    public C2760lj<?, Float> f19862f;
    @ts2

    /* renamed from: g */
    public C2760lj<?, Float> f19863g;

    public rg4(C3766v6 v6Var) {
        this.f19851a = v6Var.mo25856c() == null ? null : v6Var.mo25856c().mo17597a();
        this.f19855b = v6Var.mo25859f() == null ? null : v6Var.mo25859f().mo17597a();
        this.f19858c = v6Var.mo25861h() == null ? null : v6Var.mo25861h().mo17597a();
        this.f19860d = v6Var.mo25860g() == null ? null : v6Var.mo25860g().mo17597a();
        z71 z71 = v6Var.mo25862i() == null ? null : (z71) v6Var.mo25862i().mo17597a();
        this.f19852a = z71;
        if (z71 != null) {
            this.f19854b = new Matrix();
            this.f19857c = new Matrix();
            this.f19859d = new Matrix();
            this.f19853a = new float[9];
        } else {
            this.f19854b = null;
            this.f19857c = null;
            this.f19859d = null;
            this.f19853a = null;
        }
        this.f19856b = v6Var.mo25863j() == null ? null : (z71) v6Var.mo25863j().mo17597a();
        if (v6Var.mo25858e() != null) {
            this.f19861e = v6Var.mo25858e().mo17597a();
        }
        if (v6Var.mo25864k() != null) {
            this.f19862f = v6Var.mo25864k().mo17597a();
        } else {
            this.f19862f = null;
        }
        if (v6Var.mo25857d() != null) {
            this.f19863g = v6Var.mo25857d().mo17597a();
        } else {
            this.f19863g = null;
        }
    }

    /* renamed from: a */
    public void mo23856a(C2861mj mjVar) {
        mjVar.mo20432j(this.f19861e);
        mjVar.mo20432j(this.f19862f);
        mjVar.mo20432j(this.f19863g);
        mjVar.mo20432j(this.f19851a);
        mjVar.mo20432j(this.f19855b);
        mjVar.mo20432j(this.f19858c);
        mjVar.mo20432j(this.f19860d);
        mjVar.mo20432j(this.f19852a);
        mjVar.mo20432j(this.f19856b);
    }

    /* renamed from: b */
    public void mo23857b(C2760lj.C2762b bVar) {
        C2760lj<Integer, Integer> ljVar = this.f19861e;
        if (ljVar != null) {
            ljVar.mo19638a(bVar);
        }
        C2760lj<?, Float> ljVar2 = this.f19862f;
        if (ljVar2 != null) {
            ljVar2.mo19638a(bVar);
        }
        C2760lj<?, Float> ljVar3 = this.f19863g;
        if (ljVar3 != null) {
            ljVar3.mo19638a(bVar);
        }
        C2760lj<PointF, PointF> ljVar4 = this.f19851a;
        if (ljVar4 != null) {
            ljVar4.mo19638a(bVar);
        }
        C2760lj<?, PointF> ljVar5 = this.f19855b;
        if (ljVar5 != null) {
            ljVar5.mo19638a(bVar);
        }
        C2760lj<jr3, jr3> ljVar6 = this.f19858c;
        if (ljVar6 != null) {
            ljVar6.mo19638a(bVar);
        }
        C2760lj<Float, Float> ljVar7 = this.f19860d;
        if (ljVar7 != null) {
            ljVar7.mo19638a(bVar);
        }
        z71 z71 = this.f19852a;
        if (z71 != null) {
            z71.mo19638a(bVar);
        }
        z71 z712 = this.f19856b;
        if (z712 != null) {
            z712.mo19638a(bVar);
        }
    }

    /* renamed from: c */
    public <T> boolean mo23858c(T t, @ts2 hb2<T> hb2) {
        z71 z71;
        C2760lj ljVar;
        z71 z712;
        C2760lj<?, Float> ljVar2;
        if (t == ab2.f8955a) {
            ljVar = this.f19851a;
            if (ljVar == null) {
                this.f19851a = new es4(hb2, new PointF());
                return true;
            }
        } else if (t == ab2.f8960b) {
            ljVar = this.f19855b;
            if (ljVar == null) {
                this.f19855b = new es4(hb2, new PointF());
                return true;
            }
        } else if (t == ab2.f8956a) {
            ljVar = this.f19858c;
            if (ljVar == null) {
                this.f19858c = new es4(hb2, new jr3());
                return true;
            }
        } else if (t == ab2.f8961b) {
            ljVar = this.f19860d;
            if (ljVar == null) {
                this.f19860d = new es4(hb2, Float.valueOf(0.0f));
                return true;
            }
        } else if (t == ab2.f8965c) {
            ljVar = this.f19861e;
            if (ljVar == null) {
                this.f19861e = new es4(hb2, 100);
                return true;
            }
        } else {
            if (t != ab2.f8980o || (ljVar2 = this.f19862f) == null) {
                if (t != ab2.f8981p || (ljVar2 = this.f19863g) == null) {
                    if (t == ab2.f8964c && (z712 = this.f19852a) != null) {
                        if (z712 == null) {
                            this.f19852a = new z71(Collections.singletonList(new ez1(Float.valueOf(0.0f))));
                        }
                        ljVar = this.f19852a;
                    } else if (t != ab2.f8967d || (z71 = this.f19856b) == null) {
                        return false;
                    } else {
                        if (z71 == null) {
                            this.f19856b = new z71(Collections.singletonList(new ez1(Float.valueOf(0.0f))));
                        }
                        ljVar = this.f19856b;
                    }
                } else if (ljVar2 == null) {
                    this.f19863g = new es4(hb2, 100);
                    return true;
                }
            } else if (ljVar2 == null) {
                this.f19862f = new es4(hb2, 100);
                return true;
            }
            ljVar2.mo19645m(hb2);
            return true;
        }
        ljVar.mo19645m(hb2);
        return true;
    }

    /* renamed from: d */
    public final void mo23859d() {
        for (int i = 0; i < 9; i++) {
            this.f19853a[i] = 0.0f;
        }
    }

    @ts2
    /* renamed from: e */
    public C2760lj<?, Float> mo23860e() {
        return this.f19863g;
    }

    /* renamed from: f */
    public Matrix mo23861f() {
        this.f19850a.reset();
        C2760lj<?, PointF> ljVar = this.f19855b;
        if (ljVar != null) {
            PointF h = ljVar.mo15565h();
            float f = h.x;
            if (!(f == 0.0f && h.y == 0.0f)) {
                this.f19850a.preTranslate(f, h.y);
            }
        }
        C2760lj<Float, Float> ljVar2 = this.f19860d;
        if (ljVar2 != null) {
            float floatValue = ljVar2 instanceof es4 ? ljVar2.mo15565h().floatValue() : ((z71) ljVar2).mo27830o();
            if (floatValue != 0.0f) {
                this.f19850a.preRotate(floatValue);
            }
        }
        if (this.f19852a != null) {
            z71 z71 = this.f19856b;
            float cos = z71 == null ? 0.0f : (float) Math.cos(Math.toRadians((double) ((-z71.mo27830o()) + 90.0f)));
            z71 z712 = this.f19856b;
            float sin = z712 == null ? 1.0f : (float) Math.sin(Math.toRadians((double) ((-z712.mo27830o()) + 90.0f)));
            mo23859d();
            float[] fArr = this.f19853a;
            fArr[0] = cos;
            fArr[1] = sin;
            float f2 = -sin;
            fArr[3] = f2;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.f19854b.setValues(fArr);
            mo23859d();
            float[] fArr2 = this.f19853a;
            fArr2[0] = 1.0f;
            fArr2[3] = (float) Math.tan(Math.toRadians((double) this.f19852a.mo27830o()));
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f19857c.setValues(fArr2);
            mo23859d();
            float[] fArr3 = this.f19853a;
            fArr3[0] = cos;
            fArr3[1] = f2;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.f19859d.setValues(fArr3);
            this.f19857c.preConcat(this.f19854b);
            this.f19859d.preConcat(this.f19857c);
            this.f19850a.preConcat(this.f19859d);
        }
        C2760lj<jr3, jr3> ljVar3 = this.f19858c;
        if (ljVar3 != null) {
            jr3 h2 = ljVar3.mo15565h();
            if (!(h2.mo18553b() == 1.0f && h2.mo18554c() == 1.0f)) {
                this.f19850a.preScale(h2.mo18553b(), h2.mo18554c());
            }
        }
        C2760lj<PointF, PointF> ljVar4 = this.f19851a;
        if (ljVar4 != null) {
            PointF h3 = ljVar4.mo15565h();
            float f3 = h3.x;
            if (!(f3 == 0.0f && h3.y == 0.0f)) {
                this.f19850a.preTranslate(-f3, -h3.y);
            }
        }
        return this.f19850a;
    }

    /* renamed from: g */
    public Matrix mo23862g(float f) {
        C2760lj<?, PointF> ljVar = this.f19855b;
        PointF pointF = null;
        PointF h = ljVar == null ? null : ljVar.mo15565h();
        C2760lj<jr3, jr3> ljVar2 = this.f19858c;
        jr3 h2 = ljVar2 == null ? null : ljVar2.mo15565h();
        this.f19850a.reset();
        if (h != null) {
            this.f19850a.preTranslate(h.x * f, h.y * f);
        }
        if (h2 != null) {
            double d = (double) f;
            this.f19850a.preScale((float) Math.pow((double) h2.mo18553b(), d), (float) Math.pow((double) h2.mo18554c(), d));
        }
        C2760lj<Float, Float> ljVar3 = this.f19860d;
        if (ljVar3 != null) {
            float floatValue = ljVar3.mo15565h().floatValue();
            C2760lj<PointF, PointF> ljVar4 = this.f19851a;
            if (ljVar4 != null) {
                pointF = ljVar4.mo15565h();
            }
            Matrix matrix = this.f19850a;
            float f2 = floatValue * f;
            float f3 = 0.0f;
            float f4 = pointF == null ? 0.0f : pointF.x;
            if (pointF != null) {
                f3 = pointF.y;
            }
            matrix.preRotate(f2, f4, f3);
        }
        return this.f19850a;
    }

    @ts2
    /* renamed from: h */
    public C2760lj<?, Integer> mo23863h() {
        return this.f19861e;
    }

    @ts2
    /* renamed from: i */
    public C2760lj<?, Float> mo23864i() {
        return this.f19862f;
    }

    /* renamed from: j */
    public void mo23865j(float f) {
        C2760lj<Integer, Integer> ljVar = this.f19861e;
        if (ljVar != null) {
            ljVar.mo15567l(f);
        }
        C2760lj<?, Float> ljVar2 = this.f19862f;
        if (ljVar2 != null) {
            ljVar2.mo15567l(f);
        }
        C2760lj<?, Float> ljVar3 = this.f19863g;
        if (ljVar3 != null) {
            ljVar3.mo15567l(f);
        }
        C2760lj<PointF, PointF> ljVar4 = this.f19851a;
        if (ljVar4 != null) {
            ljVar4.mo15567l(f);
        }
        C2760lj<?, PointF> ljVar5 = this.f19855b;
        if (ljVar5 != null) {
            ljVar5.mo15567l(f);
        }
        C2760lj<jr3, jr3> ljVar6 = this.f19858c;
        if (ljVar6 != null) {
            ljVar6.mo15567l(f);
        }
        C2760lj<Float, Float> ljVar7 = this.f19860d;
        if (ljVar7 != null) {
            ljVar7.mo15567l(f);
        }
        z71 z71 = this.f19852a;
        if (z71 != null) {
            z71.mo15567l(f);
        }
        z71 z712 = this.f19856b;
        if (z712 != null) {
            z712.mo15567l(f);
        }
    }
}
