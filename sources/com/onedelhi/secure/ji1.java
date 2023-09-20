package com.onedelhi.secure;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.onedelhi.secure.C2760lj;
import java.util.ArrayList;
import java.util.List;

public class ji1 implements op0, C2760lj.C2762b, yy1 {

    /* renamed from: b */
    public static final int f14163b = 32;

    /* renamed from: a */
    public final int f14164a;

    /* renamed from: a */
    public final Paint f14165a;

    /* renamed from: a */
    public final Path f14166a;

    /* renamed from: a */
    public final RectF f14167a;
    @ts2

    /* renamed from: a */
    public es4 f14168a;

    /* renamed from: a */
    public final ga2<LinearGradient> f14169a = new ga2<>();

    /* renamed from: a */
    public final C2760lj<ei1, ei1> f14170a;

    /* renamed from: a */
    public final C2861mj f14171a;

    /* renamed from: a */
    public final oi1 f14172a;

    /* renamed from: a */
    public final qa2 f14173a;
    @mr2

    /* renamed from: a */
    public final String f14174a;

    /* renamed from: a */
    public final List<pz2> f14175a;

    /* renamed from: a */
    public final boolean f14176a;

    /* renamed from: b */
    public final ga2<RadialGradient> f14177b = new ga2<>();

    /* renamed from: b */
    public final C2760lj<Integer, Integer> f14178b;

    /* renamed from: c */
    public final C2760lj<PointF, PointF> f14179c;

    /* renamed from: d */
    public final C2760lj<PointF, PointF> f14180d;
    @ts2

    /* renamed from: e */
    public C2760lj<ColorFilter, ColorFilter> f14181e;

    public ji1(qa2 qa2, C2861mj mjVar, ii1 ii1) {
        Path path = new Path();
        this.f14166a = path;
        this.f14165a = new i02(1);
        this.f14167a = new RectF();
        this.f14175a = new ArrayList();
        this.f14171a = mjVar;
        this.f14174a = ii1.mo17820h();
        this.f14176a = ii1.mo17823k();
        this.f14173a = qa2;
        this.f14172a = ii1.mo17817e();
        path.setFillType(ii1.mo17815c());
        this.f14164a = (int) (qa2.mo23039t().mo19375d() / 32.0f);
        C2760lj<ei1, ei1> a = ii1.mo17816d().mo17597a();
        this.f14170a = a;
        a.mo19638a(this);
        mjVar.mo20432j(a);
        C2760lj<Integer, Integer> a2 = ii1.mo17821i().mo17597a();
        this.f14178b = a2;
        a2.mo19638a(this);
        mjVar.mo20432j(a2);
        C2760lj<PointF, PointF> a3 = ii1.mo17822j().mo17597a();
        this.f14179c = a3;
        a3.mo19638a(this);
        mjVar.mo20432j(a3);
        C2760lj<PointF, PointF> a4 = ii1.mo17814b().mo17597a();
        this.f14180d = a4;
        a4.mo19638a(this);
        mjVar.mo20432j(a4);
    }

    /* renamed from: a */
    public <T> void mo12684a(T t, @ts2 hb2<T> hb2) {
        C2861mj mjVar;
        C2760lj ljVar;
        if (t == ab2.f8968d) {
            this.f14178b.mo19645m(hb2);
            return;
        }
        if (t == ab2.f8954a) {
            C2760lj<ColorFilter, ColorFilter> ljVar2 = this.f14181e;
            if (ljVar2 != null) {
                this.f14171a.mo20427D(ljVar2);
            }
            if (hb2 == null) {
                this.f14181e = null;
                return;
            }
            es4 es4 = new es4(hb2);
            this.f14181e = es4;
            es4.mo19638a(this);
            mjVar = this.f14171a;
            ljVar = this.f14181e;
        } else if (t == ab2.f8959a) {
            es4 es42 = this.f14168a;
            if (es42 != null) {
                this.f14171a.mo20427D(es42);
            }
            if (hb2 == null) {
                this.f14168a = null;
                return;
            }
            es4 es43 = new es4(hb2);
            this.f14168a = es43;
            es43.mo19638a(this);
            mjVar = this.f14171a;
            ljVar = this.f14168a;
        } else {
            return;
        }
        mjVar.mo20432j(ljVar);
    }

    /* renamed from: b */
    public void mo12685b(RectF rectF, Matrix matrix, boolean z) {
        this.f14166a.reset();
        for (int i = 0; i < this.f14175a.size(); i++) {
            this.f14166a.addPath(this.f14175a.get(i).mo17060e(), matrix);
        }
        this.f14166a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    /* renamed from: c */
    public void mo14992c() {
        this.f14173a.invalidateSelf();
    }

    /* renamed from: d */
    public final int[] mo18436d(int[] iArr) {
        es4 es4 = this.f14168a;
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

    /* renamed from: f */
    public void mo14993f(Canvas canvas, Matrix matrix, int i) {
        if (!this.f14176a) {
            h02.m16420a("GradientFillContent#draw");
            this.f14166a.reset();
            for (int i2 = 0; i2 < this.f14175a.size(); i2++) {
                this.f14166a.addPath(this.f14175a.get(i2).mo17060e(), matrix);
            }
            this.f14166a.computeBounds(this.f14167a, false);
            Shader j = this.f14172a == oi1.LINEAR ? mo18438j() : mo18439k();
            j.setLocalMatrix(matrix);
            this.f14165a.setShader(j);
            C2760lj<ColorFilter, ColorFilter> ljVar = this.f14181e;
            if (ljVar != null) {
                this.f14165a.setColorFilter(ljVar.mo15565h());
            }
            this.f14165a.setAlpha(hj2.m16788c((int) ((((((float) i) / 255.0f) * ((float) this.f14178b.mo15565h().intValue())) / 100.0f) * 255.0f), 0, 255));
            canvas.drawPath(this.f14166a, this.f14165a);
            h02.m16421b("GradientFillContent#draw");
        }
    }

    /* renamed from: g */
    public void mo14994g(List<y60> list, List<y60> list2) {
        for (int i = 0; i < list2.size(); i++) {
            y60 y60 = list2.get(i);
            if (y60 instanceof pz2) {
                this.f14175a.add((pz2) y60);
            }
        }
    }

    public String getName() {
        return this.f14174a;
    }

    /* renamed from: h */
    public void mo14996h(wy1 wy1, int i, List<wy1> list, wy1 wy12) {
        hj2.m16797l(wy1, i, list, wy12, this);
    }

    /* renamed from: i */
    public final int mo18437i() {
        int round = Math.round(this.f14179c.mo19642f() * ((float) this.f14164a));
        int round2 = Math.round(this.f14180d.mo19642f() * ((float) this.f14164a));
        int round3 = Math.round(this.f14170a.mo19642f() * ((float) this.f14164a));
        int i = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    /* renamed from: j */
    public final LinearGradient mo18438j() {
        long i = (long) mo18437i();
        LinearGradient h = this.f14169a.mo16417h(i);
        if (h != null) {
            return h;
        }
        PointF h2 = this.f14179c.mo15565h();
        PointF h3 = this.f14180d.mo15565h();
        ei1 h4 = this.f14170a.mo15565h();
        LinearGradient linearGradient = new LinearGradient(h2.x, h2.y, h3.x, h3.y, mo18436d(h4.mo15190a()), h4.mo15191b(), Shader.TileMode.CLAMP);
        this.f14169a.mo16423n(i, linearGradient);
        return linearGradient;
    }

    /* renamed from: k */
    public final RadialGradient mo18439k() {
        long i = (long) mo18437i();
        RadialGradient h = this.f14177b.mo16417h(i);
        if (h != null) {
            return h;
        }
        PointF h2 = this.f14179c.mo15565h();
        PointF h3 = this.f14180d.mo15565h();
        ei1 h4 = this.f14170a.mo15565h();
        int[] d = mo18436d(h4.mo15190a());
        float[] b = h4.mo15191b();
        float f = h2.x;
        float f2 = h2.y;
        float hypot = (float) Math.hypot((double) (h3.x - f), (double) (h3.y - f2));
        RadialGradient radialGradient = new RadialGradient(f, f2, hypot <= 0.0f ? 0.001f : hypot, d, b, Shader.TileMode.CLAMP);
        this.f14177b.mo16423n(i, radialGradient);
        return radialGradient;
    }
}
