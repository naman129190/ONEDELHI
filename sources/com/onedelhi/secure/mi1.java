package com.onedelhi.secure;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

public class mi1 extends C3716uj {

    /* renamed from: b */
    public static final int f16100b = 32;

    /* renamed from: a */
    public final int f16101a;
    @ts2

    /* renamed from: a */
    public es4 f16102a;

    /* renamed from: a */
    public final ga2<LinearGradient> f16103a = new ga2<>();

    /* renamed from: a */
    public final oi1 f16104a;

    /* renamed from: a */
    public final String f16105a;

    /* renamed from: a */
    public final boolean f16106a;

    /* renamed from: b */
    public final RectF f16107b = new RectF();

    /* renamed from: b */
    public final ga2<RadialGradient> f16108b = new ga2<>();

    /* renamed from: e */
    public final C2760lj<ei1, ei1> f16109e;

    /* renamed from: f */
    public final C2760lj<PointF, PointF> f16110f;

    /* renamed from: g */
    public final C2760lj<PointF, PointF> f16111g;

    public mi1(qa2 qa2, C2861mj mjVar, li1 li1) {
        super(qa2, mjVar, li1.mo19618b().mo18710a(), li1.mo19623g().mo18711a(), li1.mo19625i(), li1.mo19627k(), li1.mo19629m(), li1.mo19624h(), li1.mo19619c());
        this.f16105a = li1.mo19626j();
        this.f16104a = li1.mo19622f();
        this.f16106a = li1.mo19630n();
        this.f16101a = (int) (qa2.mo23039t().mo19375d() / 32.0f);
        C2760lj<ei1, ei1> a = li1.mo19621e().mo17597a();
        this.f16109e = a;
        a.mo19638a(this);
        mjVar.mo20432j(a);
        C2760lj<PointF, PointF> a2 = li1.mo19628l().mo17597a();
        this.f16110f = a2;
        a2.mo19638a(this);
        mjVar.mo20432j(a2);
        C2760lj<PointF, PointF> a3 = li1.mo19620d().mo17597a();
        this.f16111g = a3;
        a3.mo19638a(this);
        mjVar.mo20432j(a3);
    }

    /* renamed from: a */
    public <T> void mo12684a(T t, @ts2 hb2<T> hb2) {
        super.mo12684a(t, hb2);
        if (t == ab2.f8959a) {
            es4 es4 = this.f16102a;
            if (es4 != null) {
                this.f21396a.mo20427D(es4);
            }
            if (hb2 == null) {
                this.f16102a = null;
                return;
            }
            es4 es42 = new es4(hb2);
            this.f16102a = es42;
            es42.mo19638a(this);
            this.f21396a.mo20432j(this.f16102a);
        }
    }

    /* renamed from: f */
    public void mo14993f(Canvas canvas, Matrix matrix, int i) {
        if (!this.f16106a) {
            mo12685b(this.f16107b, matrix, false);
            Shader l = this.f16104a == oi1.LINEAR ? mo20400l() : mo20401m();
            l.setLocalMatrix(matrix);
            this.f21391a.setShader(l);
            super.mo14993f(canvas, matrix, i);
        }
    }

    public String getName() {
        return this.f16105a;
    }

    /* renamed from: j */
    public final int[] mo20398j(int[] iArr) {
        es4 es4 = this.f16102a;
        if (es4 != null) {
            Integer[] numArr = (Integer[]) es4.mo15565h();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    /* renamed from: k */
    public final int mo20399k() {
        int round = Math.round(this.f16110f.mo19642f() * ((float) this.f16101a));
        int round2 = Math.round(this.f16111g.mo19642f() * ((float) this.f16101a));
        int round3 = Math.round(this.f16109e.mo19642f() * ((float) this.f16101a));
        int i = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    /* renamed from: l */
    public final LinearGradient mo20400l() {
        long k = (long) mo20399k();
        LinearGradient h = this.f16103a.mo16417h(k);
        if (h != null) {
            return h;
        }
        PointF h2 = this.f16110f.mo15565h();
        PointF h3 = this.f16111g.mo15565h();
        ei1 h4 = this.f16109e.mo15565h();
        LinearGradient linearGradient = new LinearGradient(h2.x, h2.y, h3.x, h3.y, mo20398j(h4.mo15190a()), h4.mo15191b(), Shader.TileMode.CLAMP);
        this.f16103a.mo16423n(k, linearGradient);
        return linearGradient;
    }

    /* renamed from: m */
    public final RadialGradient mo20401m() {
        long k = (long) mo20399k();
        RadialGradient h = this.f16108b.mo16417h(k);
        if (h != null) {
            return h;
        }
        PointF h2 = this.f16110f.mo15565h();
        PointF h3 = this.f16111g.mo15565h();
        ei1 h4 = this.f16109e.mo15565h();
        int[] j = mo20398j(h4.mo15190a());
        float[] b = h4.mo15191b();
        float f = h2.x;
        float f2 = h2.y;
        RadialGradient radialGradient = new RadialGradient(f, f2, (float) Math.hypot((double) (h3.x - f), (double) (h3.y - f2)), j, b, Shader.TileMode.CLAMP);
        this.f16108b.mo16423n(k, radialGradient);
        return radialGradient;
    }
}
