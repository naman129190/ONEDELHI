package com.onedelhi.secure;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

public class a40 extends C2861mj {
    @ts2

    /* renamed from: a */
    public C2760lj<Float, Float> f8697a;
    @ts2

    /* renamed from: a */
    public Boolean f8698a;
    @ts2

    /* renamed from: b */
    public Boolean f8699b;

    /* renamed from: c */
    public final List<C2861mj> f8700c = new ArrayList();

    /* renamed from: e */
    public final RectF f8701e = new RectF();

    /* renamed from: f */
    public Paint f8702f = new Paint();

    /* renamed from: f */
    public final RectF f8703f = new RectF();

    /* renamed from: com.onedelhi.secure.a40$a */
    public static /* synthetic */ class C1645a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8704a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.onedelhi.secure.m12$b[] r0 = com.onedelhi.secure.m12.C2807b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8704a = r0
                com.onedelhi.secure.m12$b r1 = com.onedelhi.secure.m12.C2807b.ADD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8704a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.m12$b r1 = com.onedelhi.secure.m12.C2807b.INVERT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.a40.C1645a.<clinit>():void");
        }
    }

    public a40(qa2 qa2, m12 m12, List<m12> list, la2 la2) {
        super(qa2, m12);
        int i;
        C2861mj mjVar;
        C2475j6 s = m12.mo20031s();
        if (s != null) {
            C2760lj<Float, Float> a = s.mo17597a();
            this.f8697a = a;
            mo20432j(a);
            this.f8697a.mo19638a(this);
        } else {
            this.f8697a = null;
        }
        ga2 ga2 = new ga2(la2.mo19381j().size());
        int size = list.size() - 1;
        C2861mj mjVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            m12 m122 = list.get(size);
            C2861mj v = C2861mj.m21611v(m122, qa2, la2);
            if (v != null) {
                ga2.mo16423n(v.mo20443w().mo20014b(), v);
                if (mjVar2 != null) {
                    mjVar2.mo20428F(v);
                    mjVar2 = null;
                } else {
                    this.f8700c.add(0, v);
                    int i2 = C1645a.f8704a[m122.mo20018f().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        mjVar2 = v;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < ga2.mo16433w(); i++) {
            C2861mj mjVar3 = (C2861mj) ga2.mo16417h(ga2.mo16422m(i));
            if (!(mjVar3 == null || (mjVar = (C2861mj) ga2.mo16417h(mjVar3.mo20443w().mo20020h())) == null)) {
                mjVar3.mo20429G(mjVar);
            }
        }
    }

    /* renamed from: E */
    public void mo12680E(wy1 wy1, int i, List<wy1> list, wy1 wy12) {
        for (int i2 = 0; i2 < this.f8700c.size(); i2++) {
            this.f8700c.get(i2).mo14996h(wy1, i, list, wy12);
        }
    }

    /* renamed from: H */
    public void mo12681H(@d81(from = 0.0d, mo14561to = 1.0d) float f) {
        super.mo12681H(f);
        if (this.f8697a != null) {
            f = ((this.f8697a.mo15565h().floatValue() * this.f16133a.mo20013a().mo19379h()) - this.f16133a.mo20013a().mo19387p()) / (this.f16135a.mo23039t().mo19376e() + 0.01f);
        }
        if (this.f8697a == null) {
            f -= this.f16133a.mo20028p();
        }
        if (this.f16133a.mo20032t() != 0.0f) {
            f /= this.f16133a.mo20032t();
        }
        for (int size = this.f8700c.size() - 1; size >= 0; size--) {
            this.f8700c.get(size).mo12681H(f);
        }
    }

    /* renamed from: K */
    public boolean mo12682K() {
        if (this.f8699b == null) {
            int size = this.f8700c.size() - 1;
            while (size >= 0) {
                C2861mj mjVar = this.f8700c.get(size);
                if (!(mjVar instanceof ex3)) {
                    if ((mjVar instanceof a40) && ((a40) mjVar).mo12682K()) {
                    }
                    size--;
                } else if (!mjVar.mo20444x()) {
                    size--;
                }
                this.f8699b = Boolean.TRUE;
                return true;
            }
            this.f8699b = Boolean.FALSE;
        }
        return this.f8699b.booleanValue();
    }

    /* renamed from: L */
    public boolean mo12683L() {
        if (this.f8698a == null) {
            if (!mo20445y()) {
                int size = this.f8700c.size() - 1;
                while (size >= 0) {
                    if (!this.f8700c.get(size).mo20445y()) {
                        size--;
                    }
                }
                this.f8698a = Boolean.FALSE;
            }
            this.f8698a = Boolean.TRUE;
            return true;
        }
        return this.f8698a.booleanValue();
    }

    /* renamed from: a */
    public <T> void mo12684a(T t, @ts2 hb2<T> hb2) {
        super.mo12684a(t, hb2);
        if (t != ab2.f8982q) {
            return;
        }
        if (hb2 == null) {
            C2760lj<Float, Float> ljVar = this.f8697a;
            if (ljVar != null) {
                ljVar.mo19645m((hb2<Float>) null);
                return;
            }
            return;
        }
        es4 es4 = new es4(hb2);
        this.f8697a = es4;
        es4.mo19638a(this);
        mo20432j(this.f8697a);
    }

    /* renamed from: b */
    public void mo12685b(RectF rectF, Matrix matrix, boolean z) {
        super.mo12685b(rectF, matrix, z);
        for (int size = this.f8700c.size() - 1; size >= 0; size--) {
            this.f8701e.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f8700c.get(size).mo12685b(this.f8701e, this.f16142b, true);
            rectF.union(this.f8701e);
        }
    }

    /* renamed from: u */
    public void mo12686u(Canvas canvas, Matrix matrix, int i) {
        h02.m16420a("CompositionLayer#draw");
        this.f8703f.set(0.0f, 0.0f, (float) this.f16133a.mo20022j(), (float) this.f16133a.mo20021i());
        matrix.mapRect(this.f8703f);
        boolean z = this.f16135a.mo22981O() && this.f8700c.size() > 1 && i != 255;
        if (z) {
            this.f8702f.setAlpha(i);
            yq4.m32611n(canvas, this.f8703f, this.f8702f);
        } else {
            canvas.save();
        }
        if (z) {
            i = 255;
        }
        for (int size = this.f8700c.size() - 1; size >= 0; size--) {
            if (!this.f8703f.isEmpty() ? canvas.clipRect(this.f8703f) : true) {
                this.f8700c.get(size).mo14993f(canvas, matrix, i);
            }
        }
        canvas.restore();
        h02.m16421b("CompositionLayer#draw");
    }
}
