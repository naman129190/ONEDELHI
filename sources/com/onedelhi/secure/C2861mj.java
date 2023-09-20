package com.onedelhi.secure;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.onedelhi.secure.C2760lj;
import com.onedelhi.secure.m12;
import com.onedelhi.secure.td2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.onedelhi.secure.mj */
public abstract class C2861mj implements op0, C2760lj.C2762b, xy1 {

    /* renamed from: a */
    public static final int f16125a = 2;

    /* renamed from: b */
    public static final int f16126b = 16;

    /* renamed from: c */
    public static final int f16127c = 1;

    /* renamed from: d */
    public static final int f16128d = 19;

    /* renamed from: a */
    public final Matrix f16129a = new Matrix();

    /* renamed from: a */
    public final Paint f16130a = new i02(1);

    /* renamed from: a */
    public final Path f16131a = new Path();

    /* renamed from: a */
    public final RectF f16132a;

    /* renamed from: a */
    public final m12 f16133a;
    @ts2

    /* renamed from: a */
    public C2861mj f16134a;

    /* renamed from: a */
    public final qa2 f16135a;

    /* renamed from: a */
    public final rg4 f16136a;
    @ts2

    /* renamed from: a */
    public wd2 f16137a;
    @ts2

    /* renamed from: a */
    public z71 f16138a;

    /* renamed from: a */
    public final String f16139a;

    /* renamed from: a */
    public List<C2861mj> f16140a;

    /* renamed from: a */
    public boolean f16141a;

    /* renamed from: b */
    public final Matrix f16142b;

    /* renamed from: b */
    public final Paint f16143b = new i02(1, PorterDuff.Mode.DST_IN);

    /* renamed from: b */
    public final RectF f16144b;
    @ts2

    /* renamed from: b */
    public C2861mj f16145b;

    /* renamed from: b */
    public final List<C2760lj<?, ?>> f16146b;

    /* renamed from: c */
    public final Paint f16147c = new i02(1, PorterDuff.Mode.DST_OUT);

    /* renamed from: c */
    public final RectF f16148c;

    /* renamed from: d */
    public final Paint f16149d;

    /* renamed from: d */
    public final RectF f16150d;

    /* renamed from: e */
    public final Paint f16151e;

    /* renamed from: com.onedelhi.secure.mj$a */
    public class C2862a implements C2760lj.C2762b {
        public C2862a() {
        }

        /* renamed from: c */
        public void mo14992c() {
            C2861mj mjVar = C2861mj.this;
            mjVar.mo20430I(mjVar.f16138a.mo27830o() == 1.0f);
        }
    }

    /* renamed from: com.onedelhi.secure.mj$b */
    public static /* synthetic */ class C2863b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f16153a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f16154b;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|(3:29|30|32)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        static {
            /*
                com.onedelhi.secure.td2$a[] r0 = com.onedelhi.secure.td2.C3595a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16154b = r0
                r1 = 1
                com.onedelhi.secure.td2$a r2 = com.onedelhi.secure.td2.C3595a.MASK_MODE_NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f16154b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.td2$a r3 = com.onedelhi.secure.td2.C3595a.MASK_MODE_SUBTRACT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f16154b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.td2$a r4 = com.onedelhi.secure.td2.C3595a.MASK_MODE_INTERSECT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f16154b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.td2$a r5 = com.onedelhi.secure.td2.C3595a.MASK_MODE_ADD     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.onedelhi.secure.m12$a[] r4 = com.onedelhi.secure.m12.C2806a.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f16153a = r4
                com.onedelhi.secure.m12$a r5 = com.onedelhi.secure.m12.C2806a.SHAPE     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f16153a     // Catch:{ NoSuchFieldError -> 0x004e }
                com.onedelhi.secure.m12$a r4 = com.onedelhi.secure.m12.C2806a.PRE_COMP     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f16153a     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.onedelhi.secure.m12$a r1 = com.onedelhi.secure.m12.C2806a.SOLID     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f16153a     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.onedelhi.secure.m12$a r1 = com.onedelhi.secure.m12.C2806a.IMAGE     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f16153a     // Catch:{ NoSuchFieldError -> 0x006d }
                com.onedelhi.secure.m12$a r1 = com.onedelhi.secure.m12.C2806a.NULL     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f16153a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.onedelhi.secure.m12$a r1 = com.onedelhi.secure.m12.C2806a.TEXT     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f16153a     // Catch:{ NoSuchFieldError -> 0x0083 }
                com.onedelhi.secure.m12$a r1 = com.onedelhi.secure.m12.C2806a.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C2861mj.C2863b.<clinit>():void");
        }
    }

    public C2861mj(qa2 qa2, m12 m12) {
        i02 i02 = new i02(1);
        this.f16149d = i02;
        this.f16151e = new i02(PorterDuff.Mode.CLEAR);
        this.f16132a = new RectF();
        this.f16144b = new RectF();
        this.f16148c = new RectF();
        this.f16150d = new RectF();
        this.f16142b = new Matrix();
        this.f16146b = new ArrayList();
        this.f16141a = true;
        this.f16135a = qa2;
        this.f16133a = m12;
        this.f16139a = m12.mo20019g() + "#draw";
        i02.setXfermode(m12.mo20018f() == m12.C2807b.INVERT ? new PorterDuffXfermode(PorterDuff.Mode.DST_OUT) : new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        rg4 b = m12.mo20034u().mo25855b();
        this.f16136a = b;
        b.mo23857b(this);
        if (m12.mo20017e() != null && !m12.mo20017e().isEmpty()) {
            wd2 wd2 = new wd2(m12.mo20017e());
            this.f16137a = wd2;
            for (C2760lj<xw3, Path> a : wd2.mo26492a()) {
                a.mo19638a(this);
            }
            for (C2760lj next : this.f16137a.mo26494c()) {
                mo20432j(next);
                next.mo19638a(this);
            }
        }
        mo20431J();
    }

    @ts2
    /* renamed from: v */
    public static C2861mj m21611v(m12 m12, qa2 qa2, la2 la2) {
        switch (C2863b.f16153a[m12.mo20016d().ordinal()]) {
            case 1:
                return new ex3(qa2, m12);
            case 2:
                return new a40(qa2, m12, la2.mo19386o(m12.mo20023k()), la2);
            case 3:
                return new u04(qa2, m12);
            case 4:
                return new bp1(qa2, m12);
            case 5:
                return new os2(qa2, m12);
            case 6:
                return new db4(qa2, m12);
            default:
                p92.m24544e("Unknown layer type " + m12.mo20016d());
                return null;
        }
    }

    /* renamed from: A */
    public final void mo20424A(RectF rectF, Matrix matrix) {
        if (mo20445y() && this.f16133a.mo20018f() != m12.C2807b.INVERT) {
            this.f16148c.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f16134a.mo12685b(this.f16148c, matrix, true);
            if (!rectF.intersect(this.f16148c)) {
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
    }

    /* renamed from: B */
    public final void mo20425B() {
        this.f16135a.invalidateSelf();
    }

    /* renamed from: C */
    public final void mo20426C(float f) {
        this.f16135a.mo23039t().mo19385n().mo18078e(this.f16133a.mo20019g(), f);
    }

    /* renamed from: D */
    public void mo20427D(C2760lj<?, ?> ljVar) {
        this.f16146b.remove(ljVar);
    }

    /* renamed from: E */
    public void mo12680E(wy1 wy1, int i, List<wy1> list, wy1 wy12) {
    }

    /* renamed from: F */
    public void mo20428F(@ts2 C2861mj mjVar) {
        this.f16134a = mjVar;
    }

    /* renamed from: G */
    public void mo20429G(@ts2 C2861mj mjVar) {
        this.f16145b = mjVar;
    }

    /* renamed from: H */
    public void mo12681H(@d81(from = 0.0d, mo14561to = 1.0d) float f) {
        this.f16136a.mo23865j(f);
        if (this.f16137a != null) {
            for (int i = 0; i < this.f16137a.mo26492a().size(); i++) {
                this.f16137a.mo26492a().get(i).mo15567l(f);
            }
        }
        if (this.f16133a.mo20032t() != 0.0f) {
            f /= this.f16133a.mo20032t();
        }
        z71 z71 = this.f16138a;
        if (z71 != null) {
            z71.mo15567l(f / this.f16133a.mo20032t());
        }
        C2861mj mjVar = this.f16134a;
        if (mjVar != null) {
            this.f16134a.mo12681H(mjVar.f16133a.mo20032t() * f);
        }
        for (int i2 = 0; i2 < this.f16146b.size(); i2++) {
            this.f16146b.get(i2).mo15567l(f);
        }
    }

    /* renamed from: I */
    public final void mo20430I(boolean z) {
        if (z != this.f16141a) {
            this.f16141a = z;
            mo20425B();
        }
    }

    /* renamed from: J */
    public final void mo20431J() {
        boolean z = true;
        if (!this.f16133a.mo20015c().isEmpty()) {
            z71 z71 = new z71(this.f16133a.mo20015c());
            this.f16138a = z71;
            z71.mo19644k();
            this.f16138a.mo19638a(new C2862a());
            if (((Float) this.f16138a.mo15565h()).floatValue() != 1.0f) {
                z = false;
            }
            mo20430I(z);
            mo20432j(this.f16138a);
            return;
        }
        mo20430I(true);
    }

    @C3740us
    /* renamed from: a */
    public <T> void mo12684a(T t, @ts2 hb2<T> hb2) {
        this.f16136a.mo23858c(t, hb2);
    }

    @C3740us
    /* renamed from: b */
    public void mo12685b(RectF rectF, Matrix matrix, boolean z) {
        this.f16132a.set(0.0f, 0.0f, 0.0f, 0.0f);
        mo20441s();
        this.f16142b.set(matrix);
        if (z) {
            List<C2861mj> list = this.f16140a;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f16142b.preConcat(this.f16140a.get(size).f16136a.mo23861f());
                }
            } else {
                C2861mj mjVar = this.f16145b;
                if (mjVar != null) {
                    this.f16142b.preConcat(mjVar.f16136a.mo23861f());
                }
            }
        }
        this.f16142b.preConcat(this.f16136a.mo23861f());
    }

    /* renamed from: c */
    public void mo14992c() {
        mo20425B();
    }

    /* renamed from: f */
    public void mo14993f(Canvas canvas, Matrix matrix, int i) {
        h02.m16420a(this.f16139a);
        if (!this.f16141a || this.f16133a.mo20035v()) {
            h02.m16421b(this.f16139a);
            return;
        }
        mo20441s();
        h02.m16420a("Layer#parentMatrix");
        this.f16129a.reset();
        this.f16129a.set(matrix);
        for (int size = this.f16140a.size() - 1; size >= 0; size--) {
            this.f16129a.preConcat(this.f16140a.get(size).f16136a.mo23861f());
        }
        h02.m16421b("Layer#parentMatrix");
        int intValue = (int) ((((((float) i) / 255.0f) * ((float) (this.f16136a.mo23863h() == null ? 100 : this.f16136a.mo23863h().mo15565h().intValue()))) / 100.0f) * 255.0f);
        if (mo20445y() || mo20444x()) {
            h02.m16420a("Layer#computeBounds");
            mo12685b(this.f16132a, this.f16129a, false);
            mo20424A(this.f16132a, matrix);
            this.f16129a.preConcat(this.f16136a.mo23861f());
            mo20446z(this.f16132a, this.f16129a);
            if (!this.f16132a.intersect(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight())) {
                this.f16132a.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
            h02.m16421b("Layer#computeBounds");
            if (!this.f16132a.isEmpty()) {
                h02.m16420a("Layer#saveLayer");
                this.f16130a.setAlpha(255);
                yq4.m32611n(canvas, this.f16132a, this.f16130a);
                h02.m16421b("Layer#saveLayer");
                mo20442t(canvas);
                h02.m16420a("Layer#drawLayer");
                mo12686u(canvas, this.f16129a, intValue);
                h02.m16421b("Layer#drawLayer");
                if (mo20444x()) {
                    mo20438p(canvas, this.f16129a);
                }
                if (mo20445y()) {
                    h02.m16420a("Layer#drawMatte");
                    h02.m16420a("Layer#saveLayer");
                    yq4.m32612o(canvas, this.f16132a, this.f16149d, 19);
                    h02.m16421b("Layer#saveLayer");
                    mo20442t(canvas);
                    this.f16134a.mo14993f(canvas, matrix, intValue);
                    h02.m16420a("Layer#restoreLayer");
                    canvas.restore();
                    h02.m16421b("Layer#restoreLayer");
                    h02.m16421b("Layer#drawMatte");
                }
                h02.m16420a("Layer#restoreLayer");
                canvas.restore();
                h02.m16421b("Layer#restoreLayer");
            }
            mo20426C(h02.m16421b(this.f16139a));
            return;
        }
        this.f16129a.preConcat(this.f16136a.mo23861f());
        h02.m16420a("Layer#drawLayer");
        mo12686u(canvas, this.f16129a, intValue);
        h02.m16421b("Layer#drawLayer");
        mo20426C(h02.m16421b(this.f16139a));
    }

    /* renamed from: g */
    public void mo14994g(List<y60> list, List<y60> list2) {
    }

    public String getName() {
        return this.f16133a.mo20019g();
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
                mo12680E(wy1, i + wy1.mo26722e(getName(), i), list, wy12);
            }
        }
    }

    /* renamed from: j */
    public void mo20432j(@ts2 C2760lj<?, ?> ljVar) {
        if (ljVar != null) {
            this.f16146b.add(ljVar);
        }
    }

    /* renamed from: k */
    public final void mo20433k(Canvas canvas, Matrix matrix, td2 td2, C2760lj<xw3, Path> ljVar, C2760lj<Integer, Integer> ljVar2) {
        this.f16131a.set(ljVar.mo15565h());
        this.f16131a.transform(matrix);
        this.f16130a.setAlpha((int) (((float) ljVar2.mo15565h().intValue()) * 2.55f));
        canvas.drawPath(this.f16131a, this.f16130a);
    }

    /* renamed from: l */
    public final void mo20434l(Canvas canvas, Matrix matrix, td2 td2, C2760lj<xw3, Path> ljVar, C2760lj<Integer, Integer> ljVar2) {
        yq4.m32611n(canvas, this.f16132a, this.f16143b);
        this.f16131a.set(ljVar.mo15565h());
        this.f16131a.transform(matrix);
        this.f16130a.setAlpha((int) (((float) ljVar2.mo15565h().intValue()) * 2.55f));
        canvas.drawPath(this.f16131a, this.f16130a);
        canvas.restore();
    }

    /* renamed from: m */
    public final void mo20435m(Canvas canvas, Matrix matrix, td2 td2, C2760lj<xw3, Path> ljVar, C2760lj<Integer, Integer> ljVar2) {
        yq4.m32611n(canvas, this.f16132a, this.f16130a);
        canvas.drawRect(this.f16132a, this.f16130a);
        this.f16131a.set(ljVar.mo15565h());
        this.f16131a.transform(matrix);
        this.f16130a.setAlpha((int) (((float) ljVar2.mo15565h().intValue()) * 2.55f));
        canvas.drawPath(this.f16131a, this.f16147c);
        canvas.restore();
    }

    /* renamed from: n */
    public final void mo20436n(Canvas canvas, Matrix matrix, td2 td2, C2760lj<xw3, Path> ljVar, C2760lj<Integer, Integer> ljVar2) {
        yq4.m32611n(canvas, this.f16132a, this.f16143b);
        canvas.drawRect(this.f16132a, this.f16130a);
        this.f16147c.setAlpha((int) (((float) ljVar2.mo15565h().intValue()) * 2.55f));
        this.f16131a.set(ljVar.mo15565h());
        this.f16131a.transform(matrix);
        canvas.drawPath(this.f16131a, this.f16147c);
        canvas.restore();
    }

    /* renamed from: o */
    public final void mo20437o(Canvas canvas, Matrix matrix, td2 td2, C2760lj<xw3, Path> ljVar, C2760lj<Integer, Integer> ljVar2) {
        yq4.m32611n(canvas, this.f16132a, this.f16147c);
        canvas.drawRect(this.f16132a, this.f16130a);
        this.f16147c.setAlpha((int) (((float) ljVar2.mo15565h().intValue()) * 2.55f));
        this.f16131a.set(ljVar.mo15565h());
        this.f16131a.transform(matrix);
        canvas.drawPath(this.f16131a, this.f16147c);
        canvas.restore();
    }

    /* renamed from: p */
    public final void mo20438p(Canvas canvas, Matrix matrix) {
        h02.m16420a("Layer#saveLayer");
        yq4.m32612o(canvas, this.f16132a, this.f16143b, 19);
        if (Build.VERSION.SDK_INT < 28) {
            mo20442t(canvas);
        }
        h02.m16421b("Layer#saveLayer");
        for (int i = 0; i < this.f16137a.mo26493b().size(); i++) {
            td2 td2 = this.f16137a.mo26493b().get(i);
            C2760lj ljVar = this.f16137a.mo26492a().get(i);
            C2760lj ljVar2 = this.f16137a.mo26494c().get(i);
            int i2 = C2863b.f16154b[td2.mo24871a().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == 0) {
                        this.f16130a.setColor(-16777216);
                        this.f16130a.setAlpha(255);
                        canvas.drawRect(this.f16132a, this.f16130a);
                    }
                    Canvas canvas2 = canvas;
                    Matrix matrix2 = matrix;
                    if (td2.mo24874d()) {
                        mo20437o(canvas2, matrix2, td2, ljVar, ljVar2);
                    } else {
                        mo20439q(canvas2, matrix2, td2, ljVar, ljVar2);
                    }
                } else if (i2 == 3) {
                    Canvas canvas3 = canvas;
                    Matrix matrix3 = matrix;
                    if (td2.mo24874d()) {
                        mo20436n(canvas3, matrix3, td2, ljVar, ljVar2);
                    } else {
                        mo20434l(canvas3, matrix3, td2, ljVar, ljVar2);
                    }
                } else if (i2 == 4) {
                    Canvas canvas4 = canvas;
                    Matrix matrix4 = matrix;
                    if (td2.mo24874d()) {
                        mo20435m(canvas4, matrix4, td2, ljVar, ljVar2);
                    } else {
                        mo20433k(canvas4, matrix4, td2, ljVar, ljVar2);
                    }
                }
            } else if (mo20440r()) {
                this.f16130a.setAlpha(255);
                canvas.drawRect(this.f16132a, this.f16130a);
            }
        }
        h02.m16420a("Layer#restoreLayer");
        canvas.restore();
        h02.m16421b("Layer#restoreLayer");
    }

    /* renamed from: q */
    public final void mo20439q(Canvas canvas, Matrix matrix, td2 td2, C2760lj<xw3, Path> ljVar, C2760lj<Integer, Integer> ljVar2) {
        this.f16131a.set(ljVar.mo15565h());
        this.f16131a.transform(matrix);
        canvas.drawPath(this.f16131a, this.f16147c);
    }

    /* renamed from: r */
    public final boolean mo20440r() {
        if (this.f16137a.mo26492a().isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.f16137a.mo26493b().size(); i++) {
            if (this.f16137a.mo26493b().get(i).mo24871a() != td2.C3595a.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: s */
    public final void mo20441s() {
        if (this.f16140a == null) {
            if (this.f16145b == null) {
                this.f16140a = Collections.emptyList();
                return;
            }
            this.f16140a = new ArrayList();
            for (C2861mj mjVar = this.f16145b; mjVar != null; mjVar = mjVar.f16145b) {
                this.f16140a.add(mjVar);
            }
        }
    }

    /* renamed from: t */
    public final void mo20442t(Canvas canvas) {
        h02.m16420a("Layer#clearLayer");
        RectF rectF = this.f16132a;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f16151e);
        h02.m16421b("Layer#clearLayer");
    }

    /* renamed from: u */
    public abstract void mo12686u(Canvas canvas, Matrix matrix, int i);

    /* renamed from: w */
    public m12 mo20443w() {
        return this.f16133a;
    }

    /* renamed from: x */
    public boolean mo20444x() {
        wd2 wd2 = this.f16137a;
        return wd2 != null && !wd2.mo26492a().isEmpty();
    }

    /* renamed from: y */
    public boolean mo20445y() {
        return this.f16134a != null;
    }

    /* renamed from: z */
    public final void mo20446z(RectF rectF, Matrix matrix) {
        this.f16144b.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (mo20444x()) {
            int size = this.f16137a.mo26493b().size();
            int i = 0;
            while (i < size) {
                td2 td2 = this.f16137a.mo26493b().get(i);
                this.f16131a.set((Path) this.f16137a.mo26492a().get(i).mo15565h());
                this.f16131a.transform(matrix);
                int i2 = C2863b.f16154b[td2.mo24871a().ordinal()];
                if (i2 != 1 && i2 != 2) {
                    if ((i2 != 3 && i2 != 4) || !td2.mo24874d()) {
                        this.f16131a.computeBounds(this.f16150d, false);
                        RectF rectF2 = this.f16144b;
                        if (i == 0) {
                            rectF2.set(this.f16150d);
                        } else {
                            rectF2.set(Math.min(rectF2.left, this.f16150d.left), Math.min(this.f16144b.top, this.f16150d.top), Math.max(this.f16144b.right, this.f16150d.right), Math.max(this.f16144b.bottom, this.f16150d.bottom));
                        }
                        i++;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (!rectF.intersect(this.f16144b)) {
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
    }
}
