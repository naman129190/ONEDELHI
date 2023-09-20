package com.onedelhi.secure;

import android.graphics.Path;
import android.graphics.PointF;
import com.onedelhi.secure.C2760lj;
import com.onedelhi.secure.i33;
import com.onedelhi.secure.lx3;
import java.util.List;

public class h33 implements pz2, C2760lj.C2762b, yy1 {

    /* renamed from: a */
    public static final float f12891a = 0.47829f;

    /* renamed from: b */
    public static final float f12892b = 0.25f;

    /* renamed from: a */
    public final Path f12893a = new Path();

    /* renamed from: a */
    public d40 f12894a = new d40();

    /* renamed from: a */
    public final i33.C2396a f12895a;

    /* renamed from: a */
    public final C2760lj<?, Float> f12896a;

    /* renamed from: a */
    public final qa2 f12897a;

    /* renamed from: a */
    public final String f12898a;

    /* renamed from: a */
    public final boolean f12899a;

    /* renamed from: b */
    public final C2760lj<?, PointF> f12900b;

    /* renamed from: b */
    public boolean f12901b;

    /* renamed from: c */
    public final C2760lj<?, Float> f12902c;
    @ts2

    /* renamed from: d */
    public final C2760lj<?, Float> f12903d;

    /* renamed from: e */
    public final C2760lj<?, Float> f12904e;
    @ts2

    /* renamed from: f */
    public final C2760lj<?, Float> f12905f;

    /* renamed from: g */
    public final C2760lj<?, Float> f12906g;

    /* renamed from: com.onedelhi.secure.h33$a */
    public static /* synthetic */ class C2296a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12907a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.onedelhi.secure.i33$a[] r0 = com.onedelhi.secure.i33.C2396a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12907a = r0
                com.onedelhi.secure.i33$a r1 = com.onedelhi.secure.i33.C2396a.STAR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12907a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.i33$a r1 = com.onedelhi.secure.i33.C2396a.POLYGON     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.h33.C2296a.<clinit>():void");
        }
    }

    public h33(qa2 qa2, C2861mj mjVar, i33 i33) {
        C2760lj<Float, Float> ljVar;
        this.f12897a = qa2;
        this.f12898a = i33.mo17526d();
        i33.C2396a j = i33.mo17532j();
        this.f12895a = j;
        this.f12899a = i33.mo17533k();
        C2760lj<Float, Float> a = i33.mo17529g().mo17597a();
        this.f12896a = a;
        C2760lj<PointF, PointF> a2 = i33.mo17530h().mo17597a();
        this.f12900b = a2;
        C2760lj<Float, Float> a3 = i33.mo17531i().mo17597a();
        this.f12902c = a3;
        C2760lj<Float, Float> a4 = i33.mo17527e().mo17597a();
        this.f12904e = a4;
        C2760lj<Float, Float> a5 = i33.mo17528f().mo17597a();
        this.f12906g = a5;
        i33.C2396a aVar = i33.C2396a.STAR;
        if (j == aVar) {
            this.f12903d = i33.mo17524b().mo17597a();
            ljVar = i33.mo17525c().mo17597a();
        } else {
            ljVar = null;
            this.f12903d = null;
        }
        this.f12905f = ljVar;
        mjVar.mo20432j(a);
        mjVar.mo20432j(a2);
        mjVar.mo20432j(a3);
        mjVar.mo20432j(a4);
        mjVar.mo20432j(a5);
        if (j == aVar) {
            mjVar.mo20432j(this.f12903d);
            mjVar.mo20432j(this.f12905f);
        }
        a.mo19638a(this);
        a2.mo19638a(this);
        a3.mo19638a(this);
        a4.mo19638a(this);
        a5.mo19638a(this);
        if (j == aVar) {
            this.f12903d.mo19638a(this);
            this.f12905f.mo19638a(this);
        }
    }

    /* renamed from: a */
    public <T> void mo12684a(T t, @ts2 hb2<T> hb2) {
        C2760lj ljVar;
        C2760lj<?, Float> ljVar2;
        if (t == ab2.f8974i) {
            ljVar = this.f12896a;
        } else if (t == ab2.f8975j) {
            ljVar = this.f12902c;
        } else if (t == ab2.f8969e) {
            ljVar = this.f12900b;
        } else {
            if (t != ab2.f8976k || (ljVar2 = this.f12903d) == null) {
                if (t == ab2.f8977l) {
                    ljVar = this.f12904e;
                } else if (t != ab2.f8978m || (ljVar2 = this.f12905f) == null) {
                    if (t == ab2.f8979n) {
                        ljVar = this.f12906g;
                    } else {
                        return;
                    }
                }
            }
            ljVar2.mo19645m(hb2);
            return;
        }
        ljVar.mo19645m(hb2);
    }

    /* renamed from: c */
    public void mo14992c() {
        mo17062j();
    }

    /* renamed from: d */
    public final void mo17059d() {
        double d;
        double d2;
        double d3;
        int i;
        int floor = (int) Math.floor((double) this.f12896a.mo15565h().floatValue());
        C2760lj<?, Float> ljVar = this.f12902c;
        double radians = Math.toRadians((ljVar == null ? 0.0d : (double) ljVar.mo15565h().floatValue()) - 90.0d);
        double d4 = (double) floor;
        float floatValue = this.f12906g.mo15565h().floatValue() / 100.0f;
        float floatValue2 = this.f12904e.mo15565h().floatValue();
        double d5 = (double) floatValue2;
        float cos = (float) (Math.cos(radians) * d5);
        float sin = (float) (Math.sin(radians) * d5);
        this.f12893a.moveTo(cos, sin);
        double d6 = (double) ((float) (6.283185307179586d / d4));
        double d7 = radians + d6;
        double ceil = Math.ceil(d4);
        int i2 = 0;
        while (((double) i2) < ceil) {
            float cos2 = (float) (Math.cos(d7) * d5);
            double d8 = ceil;
            float sin2 = (float) (d5 * Math.sin(d7));
            if (floatValue != 0.0f) {
                d3 = d5;
                i = i2;
                d2 = d7;
                double atan2 = (double) ((float) (Math.atan2((double) sin, (double) cos) - 1.5707963267948966d));
                float cos3 = (float) Math.cos(atan2);
                d = d6;
                double atan22 = (double) ((float) (Math.atan2((double) sin2, (double) cos2) - 1.5707963267948966d));
                float f = floatValue2 * floatValue * 0.25f;
                this.f12893a.cubicTo(cos - (cos3 * f), sin - (((float) Math.sin(atan2)) * f), cos2 + (((float) Math.cos(atan22)) * f), sin2 + (f * ((float) Math.sin(atan22))), cos2, sin2);
            } else {
                d2 = d7;
                d3 = d5;
                d = d6;
                i = i2;
                this.f12893a.lineTo(cos2, sin2);
            }
            d7 = d2 + d;
            i2 = i + 1;
            sin = sin2;
            cos = cos2;
            ceil = d8;
            d5 = d3;
            d6 = d;
        }
        PointF h = this.f12900b.mo15565h();
        this.f12893a.offset(h.x, h.y);
        this.f12893a.close();
    }

    /* renamed from: e */
    public Path mo17060e() {
        if (this.f12901b) {
            return this.f12893a;
        }
        this.f12893a.reset();
        if (!this.f12899a) {
            int i = C2296a.f12907a[this.f12895a.ordinal()];
            if (i == 1) {
                mo17061i();
            } else if (i == 2) {
                mo17059d();
            }
            this.f12893a.close();
            this.f12894a.mo14492b(this.f12893a);
        }
        this.f12901b = true;
        return this.f12893a;
    }

    /* renamed from: g */
    public void mo14994g(List<y60> list, List<y60> list2) {
        for (int i = 0; i < list.size(); i++) {
            y60 y60 = list.get(i);
            if (y60 instanceof ti4) {
                ti4 ti4 = (ti4) y60;
                if (ti4.mo25121j() == lx3.C2789a.SIMULTANEOUSLY) {
                    this.f12894a.mo14491a(ti4);
                    ti4.mo25117a(this);
                }
            }
        }
    }

    public String getName() {
        return this.f12898a;
    }

    /* renamed from: h */
    public void mo14996h(wy1 wy1, int i, List<wy1> list, wy1 wy12) {
        hj2.m16797l(wy1, i, list, wy12, this);
    }

    /* renamed from: i */
    public final void mo17061i() {
        double d;
        int i;
        float f;
        float f2;
        float f3;
        double d2;
        float f4;
        float f5;
        double d3;
        float f6;
        float f7;
        float f8;
        float f9;
        float floatValue = this.f12896a.mo15565h().floatValue();
        C2760lj<?, Float> ljVar = this.f12902c;
        double radians = Math.toRadians((ljVar == null ? 0.0d : (double) ljVar.mo15565h().floatValue()) - 90.0d);
        double d4 = (double) floatValue;
        float f10 = (float) (6.283185307179586d / d4);
        float f11 = f10 / 2.0f;
        float f12 = floatValue - ((float) ((int) floatValue));
        int i2 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
        if (i2 != 0) {
            radians += (double) ((1.0f - f12) * f11);
        }
        float floatValue2 = this.f12904e.mo15565h().floatValue();
        float floatValue3 = this.f12903d.mo15565h().floatValue();
        C2760lj<?, Float> ljVar2 = this.f12905f;
        float floatValue4 = ljVar2 != null ? ljVar2.mo15565h().floatValue() / 100.0f : 0.0f;
        C2760lj<?, Float> ljVar3 = this.f12906g;
        float floatValue5 = ljVar3 != null ? ljVar3.mo15565h().floatValue() / 100.0f : 0.0f;
        if (i2 != 0) {
            f = ((floatValue2 - floatValue3) * f12) + floatValue3;
            i = i2;
            double d5 = (double) f;
            d = d4;
            f3 = (float) (d5 * Math.cos(radians));
            f2 = (float) (d5 * Math.sin(radians));
            this.f12893a.moveTo(f3, f2);
            d2 = radians + ((double) ((f10 * f12) / 2.0f));
        } else {
            d = d4;
            i = i2;
            double d6 = (double) floatValue2;
            float cos = (float) (Math.cos(radians) * d6);
            float sin = (float) (d6 * Math.sin(radians));
            this.f12893a.moveTo(cos, sin);
            d2 = radians + ((double) f11);
            f3 = cos;
            f2 = sin;
            f = 0.0f;
        }
        double ceil = Math.ceil(d) * 2.0d;
        float f13 = floatValue2;
        float f14 = floatValue3;
        int i3 = 0;
        boolean z = false;
        while (true) {
            double d7 = (double) i3;
            if (d7 < ceil) {
                float f15 = z ? f13 : f14;
                int i4 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i4 == 0 || d7 != ceil - 2.0d) {
                    f4 = f10;
                    f5 = f11;
                } else {
                    f4 = f10;
                    f5 = (f10 * f12) / 2.0f;
                }
                if (i4 == 0 || d7 != ceil - 1.0d) {
                    f6 = f11;
                    d3 = d7;
                    f7 = f15;
                } else {
                    f6 = f11;
                    d3 = d7;
                    f7 = f;
                }
                double d8 = (double) f7;
                double d9 = ceil;
                float cos2 = (float) (d8 * Math.cos(d2));
                float sin2 = (float) (d8 * Math.sin(d2));
                if (floatValue4 == 0.0f && floatValue5 == 0.0f) {
                    this.f12893a.lineTo(cos2, sin2);
                    f9 = floatValue4;
                    f8 = f;
                } else {
                    f9 = floatValue4;
                    f8 = f;
                    double atan2 = (double) ((float) (Math.atan2((double) f2, (double) f3) - 1.5707963267948966d));
                    float sin3 = (float) Math.sin(atan2);
                    float cos3 = (float) Math.cos(atan2);
                    double atan22 = (double) ((float) (Math.atan2((double) sin2, (double) cos2) - 1.5707963267948966d));
                    float cos4 = (float) Math.cos(atan22);
                    float sin4 = (float) Math.sin(atan22);
                    float f16 = z ? f9 : floatValue5;
                    float f17 = z ? floatValue5 : f9;
                    float f18 = (z ? f14 : f13) * f16 * 0.47829f;
                    float f19 = cos3 * f18;
                    float f20 = f18 * sin3;
                    float f21 = (z ? f13 : f14) * f17 * 0.47829f;
                    float f22 = cos4 * f21;
                    float f23 = f21 * sin4;
                    if (i != 0) {
                        if (i3 == 0) {
                            f19 *= f12;
                            f20 *= f12;
                        } else if (d3 == d9 - 1.0d) {
                            f22 *= f12;
                            f23 *= f12;
                        }
                    }
                    this.f12893a.cubicTo(f3 - f19, f2 - f20, cos2 + f22, sin2 + f23, cos2, sin2);
                }
                d2 += (double) f5;
                z = !z;
                i3++;
                f3 = cos2;
                f2 = sin2;
                floatValue4 = f9;
                f = f8;
                f11 = f6;
                f10 = f4;
                ceil = d9;
            } else {
                PointF h = this.f12900b.mo15565h();
                this.f12893a.offset(h.x, h.y);
                this.f12893a.close();
                return;
            }
        }
    }

    /* renamed from: j */
    public final void mo17062j() {
        this.f12901b = false;
        this.f12897a.invalidateSelf();
    }
}
