package com.onedelhi.secure;

import com.onedelhi.secure.py1;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class yk2 implements ak4 {

    /* renamed from: A */
    public static final int f23138A = 2;

    /* renamed from: B */
    public static final int f23139B = 0;

    /* renamed from: C */
    public static final int f23140C = 1;

    /* renamed from: D */
    public static final int f23141D = 2;

    /* renamed from: E */
    public static final int f23142E = 3;

    /* renamed from: F */
    public static final int f23143F = 4;

    /* renamed from: G */
    public static final int f23144G = 5;

    /* renamed from: H */
    public static final int f23145H = -1;

    /* renamed from: I */
    public static final int f23146I = -2;

    /* renamed from: J */
    public static final int f23147J = -3;

    /* renamed from: b */
    public static final boolean f23148b = false;

    /* renamed from: c */
    public static final String f23149c = "MotionController";

    /* renamed from: c */
    public static final boolean f23150c = false;

    /* renamed from: m */
    public static final int f23151m = 0;

    /* renamed from: n */
    public static final int f23152n = 1;

    /* renamed from: o */
    public static final int f23153o = 2;

    /* renamed from: p */
    public static final int f23154p = 3;

    /* renamed from: q */
    public static final int f23155q = 4;

    /* renamed from: r */
    public static final int f23156r = 5;

    /* renamed from: s */
    public static final int f23157s = 0;

    /* renamed from: t */
    public static final int f23158t = 1;

    /* renamed from: u */
    public static final int f23159u = 2;

    /* renamed from: v */
    public static final int f23160v = 3;

    /* renamed from: w */
    public static final int f23161w = 4;

    /* renamed from: x */
    public static final int f23162x = 5;

    /* renamed from: y */
    public static final int f23163y = 6;

    /* renamed from: z */
    public static final int f23164z = 1;

    /* renamed from: a */
    public float f23165a = Float.NaN;

    /* renamed from: a */
    public al2 f23166a = new al2();

    /* renamed from: a */
    public dc0 f23167a;

    /* renamed from: a */
    public ml2 f23168a = new ml2();

    /* renamed from: a */
    public ng3 f23169a = new ng3();

    /* renamed from: a */
    public ql2 f23170a;

    /* renamed from: a */
    public xk0 f23171a = null;

    /* renamed from: a */
    public ArrayList<ml2> f23172a = new ArrayList<>();

    /* renamed from: a */
    public HashMap<String, pd4> f23173a;

    /* renamed from: a */
    public boolean f23174a = false;

    /* renamed from: a */
    public double[] f23175a;

    /* renamed from: a */
    public float[] f23176a = new float[4];

    /* renamed from: a */
    public int[] f23177a;

    /* renamed from: a */
    public dc0[] f23178a;

    /* renamed from: a */
    public kl2[] f23179a;

    /* renamed from: a */
    public String[] f23180a;

    /* renamed from: b */
    public float f23181b = 0.0f;

    /* renamed from: b */
    public al2 f23182b = new al2();

    /* renamed from: b */
    public ml2 f23183b = new ml2();

    /* renamed from: b */
    public ql2 f23184b = null;

    /* renamed from: b */
    public String f23185b;

    /* renamed from: b */
    public ArrayList<fl2> f23186b = new ArrayList<>();

    /* renamed from: b */
    public HashMap<String, x14> f23187b;

    /* renamed from: b */
    public double[] f23188b;

    /* renamed from: b */
    public float[] f23189b = new float[1];

    /* renamed from: b */
    public int[] f23190b;

    /* renamed from: b */
    public String[] f23191b;

    /* renamed from: c */
    public float f23192c = 1.0f;

    /* renamed from: c */
    public HashMap<String, py1> f23193c;

    /* renamed from: d */
    public float f23194d;

    /* renamed from: e */
    public float f23195e;

    /* renamed from: f */
    public float f23196f = Float.NaN;

    /* renamed from: g */
    public int f23197g;

    /* renamed from: h */
    public int f23198h = -1;

    /* renamed from: i */
    public int f23199i = 4;

    /* renamed from: j */
    public int f23200j = -1;

    /* renamed from: k */
    public int f23201k = -1;

    /* renamed from: l */
    public int f23202l = -1;

    /* renamed from: com.onedelhi.secure.yk2$a */
    public static class C4005a implements xk0 {

        /* renamed from: a */
        public float f23203a;

        /* renamed from: a */
        public final /* synthetic */ ur0 f23204a;

        public C4005a(ur0 ur0) {
            this.f23204a = ur0;
        }

        /* renamed from: a */
        public float mo26962a() {
            return (float) this.f23204a.mo17399b((double) this.f23203a);
        }

        public float getInterpolation(float f) {
            this.f23203a = f;
            return (float) this.f23204a.mo17398a((double) f);
        }
    }

    public yk2(ql2 ql2) {
        mo27550c0(ql2);
    }

    /* renamed from: A */
    public static xk0 m32412A(int i, String str, int i2) {
        if (i != -1) {
            return null;
        }
        return new C4005a(ur0.m29534c(str));
    }

    /* renamed from: B */
    public ml2 mo27523B(int i) {
        return this.f23172a.get(i);
    }

    /* renamed from: C */
    public int mo27524C(int i, int[] iArr) {
        int i2 = i;
        float[] fArr = new float[2];
        Iterator<fl2> it = this.f23186b.iterator();
        int i3 = 0;
        int i4 = 0;
        while (it.hasNext()) {
            fl2 next = it.next();
            int i5 = next.f12144i;
            if (i5 == i2 || i2 != -1) {
                iArr[i4] = 0;
                int i6 = i4 + 1;
                iArr[i6] = i5;
                int i7 = i6 + 1;
                int i8 = next.f12142g;
                iArr[i7] = i8;
                double d = (double) (((float) i8) / 100.0f);
                this.f23178a[0].mo14611d(d, this.f23175a);
                this.f23168a.mo20482s(d, this.f23177a, this.f23175a, fArr, 0);
                int i9 = i7 + 1;
                iArr[i9] = Float.floatToIntBits(fArr[0]);
                int i10 = i9 + 1;
                iArr[i10] = Float.floatToIntBits(fArr[1]);
                if (next instanceof il2) {
                    il2 il2 = (il2) next;
                    int i11 = i10 + 1;
                    iArr[i11] = il2.f13749n;
                    int i12 = i11 + 1;
                    iArr[i12] = Float.floatToIntBits(il2.f13740c);
                    i10 = i12 + 1;
                    iArr[i10] = Float.floatToIntBits(il2.f13741d);
                }
                int i13 = i10 + 1;
                iArr[i4] = i13 - i4;
                i3++;
                i4 = i13;
            }
        }
        return i3;
    }

    /* renamed from: D */
    public float mo27525D(int i, float f, float f2) {
        ml2 ml2 = this.f23183b;
        float f3 = ml2.f16201c;
        ml2 ml22 = this.f23168a;
        float f4 = ml22.f16201c;
        float f5 = f3 - f4;
        float f6 = ml2.f16202d;
        float f7 = ml22.f16202d;
        float f8 = f6 - f7;
        float f9 = f4 + (ml22.f16203e / 2.0f);
        float f10 = f7 + (ml22.f16204f / 2.0f);
        float hypot = (float) Math.hypot((double) f5, (double) f8);
        if (((double) hypot) < 1.0E-7d) {
            return Float.NaN;
        }
        float f11 = f - f9;
        float f12 = f2 - f10;
        if (((float) Math.hypot((double) f11, (double) f12)) == 0.0f) {
            return 0.0f;
        }
        float f13 = (f11 * f5) + (f12 * f8);
        if (i == 0) {
            return f13 / hypot;
        }
        if (i == 1) {
            return (float) Math.sqrt((double) ((hypot * hypot) - (f13 * f13)));
        }
        if (i == 2) {
            return f11 / f5;
        }
        if (i == 3) {
            return f12 / f5;
        }
        if (i == 4) {
            return f11 / f8;
        }
        if (i != 5) {
            return 0.0f;
        }
        return f12 / f8;
    }

    /* renamed from: E */
    public int mo27526E(int[] iArr, float[] fArr) {
        Iterator<fl2> it = this.f23186b.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            fl2 next = it.next();
            int i3 = next.f12142g;
            iArr[i] = (next.f12144i * 1000) + i3;
            double d = (double) (((float) i3) / 100.0f);
            this.f23178a[0].mo14611d(d, this.f23175a);
            this.f23168a.mo20482s(d, this.f23177a, this.f23175a, fArr, i2);
            i2 += 2;
            i++;
        }
        return i;
    }

    /* renamed from: F */
    public double[] mo27527F(double d) {
        this.f23178a[0].mo14611d(d, this.f23175a);
        dc0 dc0 = this.f23167a;
        if (dc0 != null) {
            double[] dArr = this.f23175a;
            if (dArr.length > 0) {
                dc0.mo14611d(d, dArr);
            }
        }
        return this.f23175a;
    }

    /* renamed from: G */
    public il2 mo27528G(int i, int i2, float f, float f2) {
        e81 e81 = new e81();
        ml2 ml2 = this.f23168a;
        float f3 = ml2.f16201c;
        e81.f11146b = f3;
        float f4 = ml2.f16202d;
        e81.f11148d = f4;
        e81.f11147c = f3 + ml2.f16203e;
        e81.f11145a = f4 + ml2.f16204f;
        e81 e812 = new e81();
        ml2 ml22 = this.f23183b;
        float f5 = ml22.f16201c;
        e812.f11146b = f5;
        float f6 = ml22.f16202d;
        e812.f11148d = f6;
        e812.f11147c = f5 + ml22.f16203e;
        e812.f11145a = f6 + ml22.f16204f;
        Iterator<fl2> it = this.f23186b.iterator();
        while (it.hasNext()) {
            fl2 next = it.next();
            if (next instanceof il2) {
                il2 il2 = (il2) next;
                if (il2.mo17834B(i, i2, e81, e812, f, f2)) {
                    return il2;
                }
            }
        }
        return null;
    }

    /* renamed from: H */
    public void mo27529H(float f, int i, int i2, float f2, float f3, float[] fArr) {
        float o = mo27562o(f, this.f23189b);
        HashMap<String, x14> hashMap = this.f23187b;
        py1 py1 = null;
        x14 x14 = hashMap == null ? null : hashMap.get("translationX");
        HashMap<String, x14> hashMap2 = this.f23187b;
        x14 x142 = hashMap2 == null ? null : hashMap2.get("translationY");
        HashMap<String, x14> hashMap3 = this.f23187b;
        x14 x143 = hashMap3 == null ? null : hashMap3.get("rotationZ");
        HashMap<String, x14> hashMap4 = this.f23187b;
        x14 x144 = hashMap4 == null ? null : hashMap4.get("scaleX");
        HashMap<String, x14> hashMap5 = this.f23187b;
        x14 x145 = hashMap5 == null ? null : hashMap5.get("scaleY");
        HashMap<String, py1> hashMap6 = this.f23193c;
        py1 py12 = hashMap6 == null ? null : hashMap6.get("translationX");
        HashMap<String, py1> hashMap7 = this.f23193c;
        py1 py13 = hashMap7 == null ? null : hashMap7.get("translationY");
        HashMap<String, py1> hashMap8 = this.f23193c;
        py1 py14 = hashMap8 == null ? null : hashMap8.get("rotationZ");
        HashMap<String, py1> hashMap9 = this.f23193c;
        py1 py15 = hashMap9 == null ? null : hashMap9.get("scaleX");
        HashMap<String, py1> hashMap10 = this.f23193c;
        if (hashMap10 != null) {
            py1 = hashMap10.get("scaleY");
        }
        ns4 ns4 = new ns4();
        ns4.mo21454b();
        ns4.mo21456d(x143, o);
        ns4.mo21460h(x14, x142, o);
        ns4.mo21458f(x144, x145, o);
        ns4.mo21455c(py14, o);
        ns4.mo21459g(py12, py13, o);
        ns4.mo21457e(py15, py1, o);
        dc0 dc0 = this.f23167a;
        if (dc0 != null) {
            double[] dArr = this.f23175a;
            if (dArr.length > 0) {
                double d = (double) o;
                dc0.mo14611d(d, dArr);
                this.f23167a.mo14614g(d, this.f23188b);
                this.f23168a.mo20471E(f2, f3, fArr, this.f23177a, this.f23188b, this.f23175a);
            }
            ns4.mo21453a(f2, f3, i, i2, fArr);
            return;
        }
        int i3 = 0;
        if (this.f23178a != null) {
            double o2 = (double) mo27562o(o, this.f23189b);
            this.f23178a[0].mo14614g(o2, this.f23188b);
            this.f23178a[0].mo14611d(o2, this.f23175a);
            float f4 = this.f23189b[0];
            while (true) {
                double[] dArr2 = this.f23188b;
                if (i3 < dArr2.length) {
                    dArr2[i3] = dArr2[i3] * ((double) f4);
                    i3++;
                } else {
                    float f5 = f2;
                    float f6 = f3;
                    this.f23168a.mo20471E(f5, f6, fArr, this.f23177a, dArr2, this.f23175a);
                    ns4.mo21453a(f5, f6, i, i2, fArr);
                    return;
                }
            }
        } else {
            ml2 ml2 = this.f23183b;
            float f7 = ml2.f16201c;
            ml2 ml22 = this.f23168a;
            float f8 = f7 - ml22.f16201c;
            float f9 = ml2.f16202d - ml22.f16202d;
            py1 py16 = py15;
            float f10 = (ml2.f16204f - ml22.f16204f) + f9;
            fArr[0] = (f8 * (1.0f - f2)) + (((ml2.f16203e - ml22.f16203e) + f8) * f2);
            fArr[1] = (f9 * (1.0f - f3)) + (f10 * f3);
            ns4.mo21454b();
            ns4.mo21456d(x143, o);
            ns4.mo21460h(x14, x142, o);
            ns4.mo21458f(x144, x145, o);
            ns4.mo21455c(py14, o);
            ns4.mo21459g(py12, py13, o);
            ns4.mo21457e(py16, py1, o);
            ns4.mo21453a(f2, f3, i, i2, fArr);
        }
    }

    /* renamed from: I */
    public final float mo27530I() {
        char c;
        float f;
        float[] fArr = new float[2];
        float f2 = 1.0f / ((float) 99);
        double d = 0.0d;
        double d2 = 0.0d;
        float f3 = 0.0f;
        int i = 0;
        while (i < 100) {
            float f4 = ((float) i) * f2;
            double d3 = (double) f4;
            ur0 ur0 = this.f23168a.f16195a;
            Iterator<ml2> it = this.f23172a.iterator();
            float f5 = Float.NaN;
            float f6 = 0.0f;
            while (it.hasNext()) {
                ml2 next = it.next();
                ur0 ur02 = next.f16195a;
                if (ur02 != null) {
                    float f7 = next.f16194a;
                    if (f7 < f4) {
                        ur0 = ur02;
                        f6 = f7;
                    } else if (Float.isNaN(f5)) {
                        f5 = next.f16194a;
                    }
                }
            }
            if (ur0 != null) {
                if (Float.isNaN(f5)) {
                    f5 = 1.0f;
                }
                float f8 = f5 - f6;
                d3 = (double) ((((float) ur0.mo17398a((double) ((f4 - f6) / f8))) * f8) + f6);
            }
            this.f23178a[0].mo14611d(d3, this.f23175a);
            float f9 = f3;
            int i2 = i;
            this.f23168a.mo20482s(d3, this.f23177a, this.f23175a, fArr, 0);
            if (i2 > 0) {
                c = 0;
                f = (float) (((double) f9) + Math.hypot(d2 - ((double) fArr[1]), d - ((double) fArr[0])));
            } else {
                c = 0;
                f = f9;
            }
            d = (double) fArr[c];
            i = i2 + 1;
            f3 = f;
            d2 = (double) fArr[1];
        }
        return f3;
    }

    /* renamed from: J */
    public float mo27531J() {
        return this.f23168a.f16204f;
    }

    /* renamed from: K */
    public float mo27532K() {
        return this.f23168a.f16203e;
    }

    /* renamed from: L */
    public float mo27533L() {
        return this.f23168a.f16201c;
    }

    /* renamed from: M */
    public float mo27534M() {
        return this.f23168a.f16202d;
    }

    /* renamed from: N */
    public int mo27535N() {
        return this.f23201k;
    }

    /* renamed from: O */
    public ql2 mo27536O() {
        return this.f23170a;
    }

    /* renamed from: P */
    public final void mo27537P(ml2 ml2) {
        Iterator<ml2> it = this.f23172a.iterator();
        ml2 ml22 = null;
        while (it.hasNext()) {
            ml2 next = it.next();
            if (ml2.f16199b == next.f16199b) {
                ml22 = next;
            }
        }
        if (ml22 != null) {
            this.f23172a.remove(ml22);
        }
        int binarySearch = Collections.binarySearch(this.f23172a, ml2);
        if (binarySearch == 0) {
            xq4.m31634f("MotionController", " KeyPath position \"" + ml2.f16199b + "\" outside of range");
        }
        this.f23172a.add((-binarySearch) - 1, ml2);
    }

    /* renamed from: Q */
    public boolean mo27538Q(ql2 ql2, float f, long j, ny1 ny1) {
        double d;
        int i;
        ql2 ql22 = ql2;
        float o = mo27562o(f, (float[]) null);
        int i2 = this.f23202l;
        if (i2 != -1) {
            float f2 = 1.0f / ((float) i2);
            float floor = ((float) Math.floor((double) (o / f2))) * f2;
            float f3 = (o % f2) / f2;
            if (!Float.isNaN(this.f23196f)) {
                f3 = (f3 + this.f23196f) % 1.0f;
            }
            xk0 xk0 = this.f23171a;
            o = ((xk0 != null ? xk0.getInterpolation(f3) : ((double) f3) > 0.5d ? 1.0f : 0.0f) * f2) + floor;
        }
        float f4 = o;
        HashMap<String, x14> hashMap = this.f23187b;
        if (hashMap != null) {
            for (x14 h : hashMap.values()) {
                h.mo26751h(ql22, f4);
            }
        }
        dc0[] dc0Arr = this.f23178a;
        if (dc0Arr != null) {
            double d2 = (double) f4;
            dc0Arr[0].mo14611d(d2, this.f23175a);
            this.f23178a[0].mo14614g(d2, this.f23188b);
            dc0 dc0 = this.f23167a;
            if (dc0 != null) {
                double[] dArr = this.f23175a;
                if (dArr.length > 0) {
                    dc0.mo14611d(d2, dArr);
                    this.f23167a.mo14614g(d2, this.f23188b);
                }
            }
            if (!this.f23174a) {
                d = d2;
                this.f23168a.mo20472F(f4, ql2, this.f23177a, this.f23175a, this.f23188b, (double[]) null);
            } else {
                d = d2;
            }
            if (this.f23201k != -1) {
                if (this.f23184b == null) {
                    this.f23184b = ql2.mo23237n().mo23229f(this.f23201k);
                }
                ql2 ql23 = this.f23184b;
                if (ql23 != null) {
                    float w = ((float) (ql23.mo23247w() + this.f23184b.mo23231h())) / 2.0f;
                    float l = ((float) (this.f23184b.mo23235l() + this.f23184b.mo23240q())) / 2.0f;
                    if (ql2.mo23240q() - ql2.mo23235l() > 0 && ql2.mo23231h() - ql2.mo23247w() > 0) {
                        ql22.mo23214N(l - ((float) ql2.mo23235l()));
                        ql22.mo23215O(w - ((float) ql2.mo23247w()));
                    }
                }
            }
            int i3 = 1;
            while (true) {
                dc0[] dc0Arr2 = this.f23178a;
                if (i3 >= dc0Arr2.length) {
                    break;
                }
                dc0Arr2[i3].mo14612e(d, this.f23176a);
                this.f23168a.f16197a.get(this.f23180a[i3 - 1]).mo23094w(ql22, this.f23176a);
                i3++;
            }
            al2 al2 = this.f23166a;
            if (al2.f9392n == 0) {
                if (f4 > 0.0f) {
                    if (f4 >= 1.0f) {
                        al2 = this.f23182b;
                    } else if (this.f23182b.f9394o != al2.f9394o) {
                        i = 4;
                        ql22.mo23228b0(i);
                    }
                }
                i = al2.f9394o;
                ql22.mo23228b0(i);
            }
            if (this.f23179a != null) {
                int i4 = 0;
                while (true) {
                    kl2[] kl2Arr = this.f23179a;
                    if (i4 >= kl2Arr.length) {
                        break;
                    }
                    kl2Arr[i4].mo19149v(f4, ql22);
                    i4++;
                }
            }
        } else {
            ml2 ml2 = this.f23168a;
            float f5 = ml2.f16201c;
            ml2 ml22 = this.f23183b;
            float f6 = f5 + ((ml22.f16201c - f5) * f4);
            float f7 = ml2.f16202d;
            float f8 = f7 + ((ml22.f16202d - f7) * f4);
            float f9 = ml2.f16203e;
            float f10 = f9 + ((ml22.f16203e - f9) * f4);
            float f11 = ml2.f16204f;
            float f12 = f6 + 0.5f;
            float f13 = f8 + 0.5f;
            ql22.mo23207G((int) f12, (int) f13, (int) (f12 + f10), (int) (f13 + f11 + ((ml22.f16204f - f11) * f4)));
        }
        HashMap<String, py1> hashMap2 = this.f23193c;
        if (hashMap2 == null) {
            return false;
        }
        for (py1 next : hashMap2.values()) {
            if (next instanceof py1.C3217f) {
                double[] dArr2 = this.f23188b;
                ((py1.C3217f) next).mo22780l(ql2, f4, dArr2[0], dArr2[1]);
            } else {
                next.mo22768h(ql22, f4);
            }
        }
        return false;
    }

    /* renamed from: R */
    public String mo27539R() {
        return this.f23170a.mo23236m();
    }

    /* renamed from: S */
    public void mo27540S(ql2 ql2, il2 il2, float f, float f2, String[] strArr, float[] fArr) {
        e81 e81 = new e81();
        ml2 ml2 = this.f23168a;
        float f3 = ml2.f16201c;
        e81.f11146b = f3;
        float f4 = ml2.f16202d;
        e81.f11148d = f4;
        e81.f11147c = f3 + ml2.f16203e;
        e81.f11145a = f4 + ml2.f16204f;
        e81 e812 = new e81();
        ml2 ml22 = this.f23183b;
        float f5 = ml22.f16201c;
        e812.f11146b = f5;
        float f6 = ml22.f16202d;
        e812.f11148d = f6;
        e812.f11147c = f5 + ml22.f16203e;
        e812.f11145a = f6 + ml22.f16204f;
        il2.mo17835C(ql2, e81, e812, f, f2, strArr, fArr);
    }

    /* renamed from: T */
    public final void mo27541T(ml2 ml2) {
        ml2.mo20470D((float) this.f23170a.mo23205E(), (float) this.f23170a.mo23206F(), (float) this.f23170a.mo23204D(), (float) this.f23170a.mo23234k());
    }

    /* renamed from: U */
    public void mo27542U(ng3 ng3, ng3 ng32, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if (i != 1) {
            if (i == 2) {
                i7 = ng3.f17423b + ng3.f17424c;
                i6 = ng3.f17425d;
                i8 = ng3.f17422a;
            } else if (i == 3) {
                i5 = ng3.f17423b + ng3.f17424c;
                i4 = ((ng3.mo21265a() / 2) + ng3.f17425d) - (i5 / 2);
            } else if (i == 4) {
                i7 = ng3.f17423b + ng3.f17424c;
                i6 = ng3.f17422a;
                i8 = ng3.f17425d;
            } else {
                return;
            }
            ng32.f17423b = i2 - (((i6 + i8) + ng3.mo21266b()) / 2);
            ng32.f17425d = (i7 - ng3.mo21265a()) / 2;
            ng32.f17424c = ng32.f17423b + ng3.mo21266b();
            ng32.f17422a = ng32.f17425d + ng3.mo21265a();
        }
        i5 = ng3.f17423b + ng3.f17424c;
        i4 = ((ng3.f17425d + ng3.f17422a) - ng3.mo21266b()) / 2;
        ng32.f17423b = i4;
        ng32.f17425d = i3 - ((i5 + ng3.mo21265a()) / 2);
        ng32.f17424c = ng32.f17423b + ng3.mo21266b();
        ng32.f17422a = ng32.f17425d + ng3.mo21265a();
    }

    /* renamed from: V */
    public void mo27543V(ql2 ql2) {
        ml2 ml2 = this.f23168a;
        ml2.f16194a = 0.0f;
        ml2.f16199b = 0.0f;
        this.f23174a = true;
        ml2.mo20470D((float) ql2.mo23205E(), (float) ql2.mo23206F(), (float) ql2.mo23204D(), (float) ql2.mo23234k());
        this.f23183b.mo20470D((float) ql2.mo23205E(), (float) ql2.mo23206F(), (float) ql2.mo23204D(), (float) ql2.mo23234k());
        this.f23166a.mo13171w(ql2);
        this.f23182b.mo13171w(ql2);
    }

    /* renamed from: W */
    public void mo27544W(int i) {
        this.f23168a.f16208n = i;
    }

    /* renamed from: X */
    public void mo27545X(ql2 ql2) {
        ml2 ml2 = this.f23183b;
        ml2.f16194a = 1.0f;
        ml2.f16199b = 1.0f;
        mo27541T(ml2);
        this.f23183b.mo20470D((float) ql2.mo23235l(), (float) ql2.mo23247w(), (float) ql2.mo23204D(), (float) ql2.mo23234k());
        this.f23183b.mo20474a(ql2);
        this.f23182b.mo13171w(ql2);
    }

    /* renamed from: Y */
    public void mo27546Y(int i) {
        this.f23200j = i;
    }

    /* renamed from: Z */
    public void mo27547Z(ql2 ql2) {
        ml2 ml2 = this.f23168a;
        ml2.f16194a = 0.0f;
        ml2.f16199b = 0.0f;
        ml2.mo20470D((float) ql2.mo23205E(), (float) ql2.mo23206F(), (float) ql2.mo23204D(), (float) ql2.mo23234k());
        this.f23168a.mo20474a(ql2);
        this.f23166a.mo13171w(ql2);
    }

    /* renamed from: a */
    public boolean mo13120a(int i, int i2) {
        if (i != 509) {
            return i == 704;
        }
        mo27546Y(i2);
        return true;
    }

    /* renamed from: a0 */
    public void mo27548a0(dv4 dv4, ql2 ql2, int i, int i2, int i3) {
        int i4;
        ml2 ml2 = this.f23168a;
        ml2.f16194a = 0.0f;
        ml2.f16199b = 0.0f;
        ng3 ng3 = new ng3();
        if (i != 1) {
            if (i == 2) {
                int i5 = dv4.f10957a + dv4.f10959c;
                ng3.f17423b = i3 - (((dv4.f10958b + dv4.f10960d) + dv4.mo14898c()) / 2);
                i4 = (i5 - dv4.mo14897b()) / 2;
            }
            this.f23168a.mo20470D((float) ng3.f17423b, (float) ng3.f17425d, (float) ng3.mo21266b(), (float) ng3.mo21265a());
            this.f23166a.mo13172x(ng3, ql2, i, dv4.f10956a);
        }
        int i6 = dv4.f10957a + dv4.f10959c;
        ng3.f17423b = ((dv4.f10958b + dv4.f10960d) - dv4.mo14898c()) / 2;
        i4 = i2 - ((i6 + dv4.mo14897b()) / 2);
        ng3.f17425d = i4;
        ng3.f17424c = ng3.f17423b + dv4.mo14898c();
        ng3.f17422a = ng3.f17425d + dv4.mo14897b();
        this.f23168a.mo20470D((float) ng3.f17423b, (float) ng3.f17425d, (float) ng3.mo21266b(), (float) ng3.mo21265a());
        this.f23166a.mo13172x(ng3, ql2, i, dv4.f10956a);
    }

    /* renamed from: b */
    public int mo13121b(String str) {
        return 0;
    }

    /* renamed from: b0 */
    public void mo27549b0(int i) {
        this.f23201k = i;
        this.f23184b = null;
    }

    /* renamed from: c */
    public boolean mo13122c(int i, float f) {
        return false;
    }

    /* renamed from: c0 */
    public void mo27550c0(ql2 ql2) {
        this.f23170a = ql2;
    }

    /* renamed from: d */
    public boolean mo13123d(int i, boolean z) {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0166, code lost:
        r10 = (java.lang.Integer) r7.get(r9);
     */
    /* renamed from: d0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo27551d0(int r21, int r22, float r23, long r24) {
        /*
            r20 = this;
            r0 = r20
            r1 = r24
            java.lang.Class<double> r3 = double.class
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            int r8 = r0.f23200j
            r9 = -1
            if (r8 == r9) goto L_0x0028
            com.onedelhi.secure.ml2 r10 = r0.f23168a
            r10.f16209o = r8
        L_0x0028:
            com.onedelhi.secure.al2 r8 = r0.f23166a
            com.onedelhi.secure.al2 r10 = r0.f23182b
            r8.mo13164l(r10, r5)
            java.util.ArrayList<com.onedelhi.secure.fl2> r8 = r0.f23186b
            if (r8 == 0) goto L_0x0090
            java.util.Iterator r8 = r8.iterator()
            r11 = 0
        L_0x0038:
            boolean r12 = r8.hasNext()
            if (r12 == 0) goto L_0x0091
            java.lang.Object r12 = r8.next()
            com.onedelhi.secure.fl2 r12 = (com.onedelhi.secure.fl2) r12
            boolean r13 = r12 instanceof com.onedelhi.secure.il2
            if (r13 == 0) goto L_0x0068
            com.onedelhi.secure.il2 r12 = (com.onedelhi.secure.il2) r12
            com.onedelhi.secure.ml2 r13 = new com.onedelhi.secure.ml2
            com.onedelhi.secure.ml2 r15 = r0.f23168a
            com.onedelhi.secure.ml2 r14 = r0.f23183b
            r19 = r14
            r14 = r13
            r18 = r15
            r15 = r21
            r16 = r22
            r17 = r12
            r14.<init>(r15, r16, r17, r18, r19)
            r0.mo27537P(r13)
            int r12 = r12.f13746k
            if (r12 == r9) goto L_0x0038
            r0.f23198h = r12
            goto L_0x0038
        L_0x0068:
            boolean r13 = r12 instanceof com.onedelhi.secure.hl2
            if (r13 == 0) goto L_0x0070
            r12.mo16044i(r6)
            goto L_0x0038
        L_0x0070:
            boolean r13 = r12 instanceof com.onedelhi.secure.jl2
            if (r13 == 0) goto L_0x0078
            r12.mo16044i(r4)
            goto L_0x0038
        L_0x0078:
            boolean r13 = r12 instanceof com.onedelhi.secure.kl2
            if (r13 == 0) goto L_0x0089
            if (r11 != 0) goto L_0x0083
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
        L_0x0083:
            com.onedelhi.secure.kl2 r12 = (com.onedelhi.secure.kl2) r12
            r11.add(r12)
            goto L_0x0038
        L_0x0089:
            r12.mo16052q(r7)
            r12.mo16044i(r5)
            goto L_0x0038
        L_0x0090:
            r11 = 0
        L_0x0091:
            r8 = 0
            if (r11 == 0) goto L_0x009e
            com.onedelhi.secure.kl2[] r12 = new com.onedelhi.secure.kl2[r8]
            java.lang.Object[] r11 = r11.toArray(r12)
            com.onedelhi.secure.kl2[] r11 = (com.onedelhi.secure.kl2[]) r11
            r0.f23179a = r11
        L_0x009e:
            boolean r11 = r5.isEmpty()
            java.lang.String r12 = ","
            java.lang.String r13 = "CUSTOM,"
            r14 = 1
            if (r11 != 0) goto L_0x0182
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            r0.f23187b = r11
            java.util.Iterator r11 = r5.iterator()
        L_0x00b4:
            boolean r15 = r11.hasNext()
            if (r15 == 0) goto L_0x011b
            java.lang.Object r15 = r11.next()
            java.lang.String r15 = (java.lang.String) r15
            boolean r16 = r15.startsWith(r13)
            if (r16 == 0) goto L_0x0104
            com.onedelhi.secure.ry1$b r10 = new com.onedelhi.secure.ry1$b
            r10.<init>()
            java.lang.String[] r16 = r15.split(r12)
            r9 = r16[r14]
            java.util.ArrayList<com.onedelhi.secure.fl2> r14 = r0.f23186b
            java.util.Iterator r14 = r14.iterator()
        L_0x00d7:
            boolean r16 = r14.hasNext()
            if (r16 == 0) goto L_0x00fd
            java.lang.Object r16 = r14.next()
            r8 = r16
            com.onedelhi.secure.fl2 r8 = (com.onedelhi.secure.fl2) r8
            r16 = r11
            java.util.HashMap<java.lang.String, com.onedelhi.secure.qc0> r11 = r8.f12140a
            if (r11 != 0) goto L_0x00ef
        L_0x00eb:
            r11 = r16
            r8 = 0
            goto L_0x00d7
        L_0x00ef:
            java.lang.Object r11 = r11.get(r9)
            com.onedelhi.secure.qc0 r11 = (com.onedelhi.secure.qc0) r11
            if (r11 == 0) goto L_0x00eb
            int r8 = r8.f12142g
            r10.mo24120a(r8, r11)
            goto L_0x00eb
        L_0x00fd:
            r16 = r11
            com.onedelhi.secure.x14 r8 = com.onedelhi.secure.x14.m31218e(r15, r10)
            goto L_0x010a
        L_0x0104:
            r16 = r11
            com.onedelhi.secure.x14 r8 = com.onedelhi.secure.x14.m31219f(r15, r1)
        L_0x010a:
            if (r8 != 0) goto L_0x010d
            goto L_0x0115
        L_0x010d:
            r8.mo26752i(r15)
            java.util.HashMap<java.lang.String, com.onedelhi.secure.x14> r9 = r0.f23187b
            r9.put(r15, r8)
        L_0x0115:
            r11 = r16
            r8 = 0
            r9 = -1
            r14 = 1
            goto L_0x00b4
        L_0x011b:
            java.util.ArrayList<com.onedelhi.secure.fl2> r8 = r0.f23186b
            if (r8 == 0) goto L_0x0139
            java.util.Iterator r8 = r8.iterator()
        L_0x0123:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0139
            java.lang.Object r9 = r8.next()
            com.onedelhi.secure.fl2 r9 = (com.onedelhi.secure.fl2) r9
            boolean r10 = r9 instanceof com.onedelhi.secure.gl2
            if (r10 == 0) goto L_0x0123
            java.util.HashMap<java.lang.String, com.onedelhi.secure.x14> r10 = r0.f23187b
            r9.mo16041f(r10)
            goto L_0x0123
        L_0x0139:
            com.onedelhi.secure.al2 r8 = r0.f23166a
            java.util.HashMap<java.lang.String, com.onedelhi.secure.x14> r9 = r0.f23187b
            r10 = 0
            r8.mo13159a(r9, r10)
            com.onedelhi.secure.al2 r8 = r0.f23182b
            java.util.HashMap<java.lang.String, com.onedelhi.secure.x14> r9 = r0.f23187b
            r10 = 100
            r8.mo13159a(r9, r10)
            java.util.HashMap<java.lang.String, com.onedelhi.secure.x14> r8 = r0.f23187b
            java.util.Set r8 = r8.keySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x0154:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0182
            java.lang.Object r9 = r8.next()
            java.lang.String r9 = (java.lang.String) r9
            boolean r10 = r7.containsKey(r9)
            if (r10 == 0) goto L_0x0173
            java.lang.Object r10 = r7.get(r9)
            java.lang.Integer r10 = (java.lang.Integer) r10
            if (r10 == 0) goto L_0x0173
            int r10 = r10.intValue()
            goto L_0x0174
        L_0x0173:
            r10 = 0
        L_0x0174:
            java.util.HashMap<java.lang.String, com.onedelhi.secure.x14> r11 = r0.f23187b
            java.lang.Object r9 = r11.get(r9)
            com.onedelhi.secure.x14 r9 = (com.onedelhi.secure.x14) r9
            if (r9 == 0) goto L_0x0154
            r9.mo13828j(r10)
            goto L_0x0154
        L_0x0182:
            boolean r8 = r4.isEmpty()
            if (r8 != 0) goto L_0x0247
            java.util.HashMap<java.lang.String, com.onedelhi.secure.pd4> r8 = r0.f23173a
            if (r8 != 0) goto L_0x0193
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            r0.f23173a = r8
        L_0x0193:
            java.util.Iterator r4 = r4.iterator()
        L_0x0197:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x01f3
            java.lang.Object r8 = r4.next()
            java.lang.String r8 = (java.lang.String) r8
            java.util.HashMap<java.lang.String, com.onedelhi.secure.pd4> r9 = r0.f23173a
            boolean r9 = r9.containsKey(r8)
            if (r9 == 0) goto L_0x01ac
            goto L_0x0197
        L_0x01ac:
            boolean r9 = r8.startsWith(r13)
            if (r9 == 0) goto L_0x01e8
            com.onedelhi.secure.ry1$b r9 = new com.onedelhi.secure.ry1$b
            r9.<init>()
            java.lang.String[] r10 = r8.split(r12)
            r11 = 1
            r10 = r10[r11]
            java.util.ArrayList<com.onedelhi.secure.fl2> r11 = r0.f23186b
            java.util.Iterator r11 = r11.iterator()
        L_0x01c4:
            boolean r14 = r11.hasNext()
            if (r14 == 0) goto L_0x01e3
            java.lang.Object r14 = r11.next()
            com.onedelhi.secure.fl2 r14 = (com.onedelhi.secure.fl2) r14
            java.util.HashMap<java.lang.String, com.onedelhi.secure.qc0> r15 = r14.f12140a
            if (r15 != 0) goto L_0x01d5
            goto L_0x01c4
        L_0x01d5:
            java.lang.Object r15 = r15.get(r10)
            com.onedelhi.secure.qc0 r15 = (com.onedelhi.secure.qc0) r15
            if (r15 == 0) goto L_0x01c4
            int r14 = r14.f12142g
            r9.mo24120a(r14, r15)
            goto L_0x01c4
        L_0x01e3:
            com.onedelhi.secure.x14 r9 = com.onedelhi.secure.x14.m31218e(r8, r9)
            goto L_0x01ec
        L_0x01e8:
            com.onedelhi.secure.x14 r9 = com.onedelhi.secure.x14.m31219f(r8, r1)
        L_0x01ec:
            if (r9 != 0) goto L_0x01ef
            goto L_0x0197
        L_0x01ef:
            r9.mo26752i(r8)
            goto L_0x0197
        L_0x01f3:
            java.util.ArrayList<com.onedelhi.secure.fl2> r1 = r0.f23186b
            if (r1 == 0) goto L_0x0213
            java.util.Iterator r1 = r1.iterator()
        L_0x01fb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0213
            java.lang.Object r2 = r1.next()
            com.onedelhi.secure.fl2 r2 = (com.onedelhi.secure.fl2) r2
            boolean r4 = r2 instanceof com.onedelhi.secure.jl2
            if (r4 == 0) goto L_0x01fb
            com.onedelhi.secure.jl2 r2 = (com.onedelhi.secure.jl2) r2
            java.util.HashMap<java.lang.String, com.onedelhi.secure.pd4> r4 = r0.f23173a
            r2.mo18470v(r4)
            goto L_0x01fb
        L_0x0213:
            java.util.HashMap<java.lang.String, com.onedelhi.secure.pd4> r1 = r0.f23173a
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x021d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0247
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r4 = r7.containsKey(r2)
            if (r4 == 0) goto L_0x023a
            java.lang.Object r4 = r7.get(r2)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            goto L_0x023b
        L_0x023a:
            r4 = 0
        L_0x023b:
            java.util.HashMap<java.lang.String, com.onedelhi.secure.pd4> r8 = r0.f23173a
            java.lang.Object r2 = r8.get(r2)
            com.onedelhi.secure.pd4 r2 = (com.onedelhi.secure.pd4) r2
            r2.mo17459f(r4)
            goto L_0x021d
        L_0x0247:
            java.util.ArrayList<com.onedelhi.secure.ml2> r1 = r0.f23172a
            int r1 = r1.size()
            r2 = 2
            int r1 = r1 + r2
            com.onedelhi.secure.ml2[] r4 = new com.onedelhi.secure.ml2[r1]
            com.onedelhi.secure.ml2 r7 = r0.f23168a
            r8 = 0
            r4[r8] = r7
            int r7 = r1 + -1
            com.onedelhi.secure.ml2 r9 = r0.f23183b
            r4[r7] = r9
            java.util.ArrayList<com.onedelhi.secure.ml2> r7 = r0.f23172a
            int r7 = r7.size()
            if (r7 <= 0) goto L_0x026c
            int r7 = r0.f23198h
            int r9 = com.onedelhi.secure.fl2.f12135j
            if (r7 != r9) goto L_0x026c
            r0.f23198h = r8
        L_0x026c:
            java.util.ArrayList<com.onedelhi.secure.ml2> r7 = r0.f23172a
            java.util.Iterator r7 = r7.iterator()
            r8 = 1
        L_0x0273:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x0285
            java.lang.Object r9 = r7.next()
            com.onedelhi.secure.ml2 r9 = (com.onedelhi.secure.ml2) r9
            int r10 = r8 + 1
            r4[r8] = r9
            r8 = r10
            goto L_0x0273
        L_0x0285:
            r7 = 18
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            com.onedelhi.secure.ml2 r9 = r0.f23183b
            java.util.HashMap<java.lang.String, com.onedelhi.secure.qc0> r9 = r9.f16197a
            java.util.Set r9 = r9.keySet()
            java.util.Iterator r9 = r9.iterator()
        L_0x0298:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x02c7
            java.lang.Object r10 = r9.next()
            java.lang.String r10 = (java.lang.String) r10
            com.onedelhi.secure.ml2 r11 = r0.f23168a
            java.util.HashMap<java.lang.String, com.onedelhi.secure.qc0> r11 = r11.f16197a
            boolean r11 = r11.containsKey(r10)
            if (r11 == 0) goto L_0x0298
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r13)
            r11.append(r10)
            java.lang.String r11 = r11.toString()
            boolean r11 = r5.contains(r11)
            if (r11 != 0) goto L_0x0298
            r8.add(r10)
            goto L_0x0298
        L_0x02c7:
            r10 = 0
            java.lang.String[] r5 = new java.lang.String[r10]
            java.lang.Object[] r5 = r8.toArray(r5)
            java.lang.String[] r5 = (java.lang.String[]) r5
            r0.f23180a = r5
            int r5 = r5.length
            int[] r5 = new int[r5]
            r0.f23190b = r5
            r5 = 0
        L_0x02d8:
            java.lang.String[] r8 = r0.f23180a
            int r9 = r8.length
            if (r5 >= r9) goto L_0x030f
            r8 = r8[r5]
            int[] r9 = r0.f23190b
            r10 = 0
            r9[r5] = r10
            r9 = 0
        L_0x02e5:
            if (r9 >= r1) goto L_0x030c
            r10 = r4[r9]
            java.util.HashMap<java.lang.String, com.onedelhi.secure.qc0> r10 = r10.f16197a
            boolean r10 = r10.containsKey(r8)
            if (r10 == 0) goto L_0x0309
            r10 = r4[r9]
            java.util.HashMap<java.lang.String, com.onedelhi.secure.qc0> r10 = r10.f16197a
            java.lang.Object r10 = r10.get(r8)
            com.onedelhi.secure.qc0 r10 = (com.onedelhi.secure.qc0) r10
            if (r10 == 0) goto L_0x0309
            int[] r8 = r0.f23190b
            r9 = r8[r5]
            int r10 = r10.mo23089r()
            int r9 = r9 + r10
            r8[r5] = r9
            goto L_0x030c
        L_0x0309:
            int r9 = r9 + 1
            goto L_0x02e5
        L_0x030c:
            int r5 = r5 + 1
            goto L_0x02d8
        L_0x030f:
            r5 = 0
            r9 = r4[r5]
            int r5 = r9.f16209o
            r9 = -1
            if (r5 == r9) goto L_0x0319
            r5 = 1
            goto L_0x031a
        L_0x0319:
            r5 = 0
        L_0x031a:
            int r8 = r8.length
            int r7 = r7 + r8
            boolean[] r8 = new boolean[r7]
            r9 = 1
        L_0x031f:
            if (r9 >= r1) goto L_0x032f
            r10 = r4[r9]
            int r11 = r9 + -1
            r11 = r4[r11]
            java.lang.String[] r12 = r0.f23180a
            r10.mo20479l(r11, r8, r12, r5)
            int r9 = r9 + 1
            goto L_0x031f
        L_0x032f:
            r5 = 1
            r9 = 0
        L_0x0331:
            if (r5 >= r7) goto L_0x033c
            boolean r10 = r8[r5]
            if (r10 == 0) goto L_0x0339
            int r9 = r9 + 1
        L_0x0339:
            int r5 = r5 + 1
            goto L_0x0331
        L_0x033c:
            int[] r5 = new int[r9]
            r0.f23177a = r5
            int r5 = java.lang.Math.max(r2, r9)
            double[] r9 = new double[r5]
            r0.f23175a = r9
            double[] r5 = new double[r5]
            r0.f23188b = r5
            r5 = 1
            r9 = 0
        L_0x034e:
            if (r5 >= r7) goto L_0x035e
            boolean r10 = r8[r5]
            if (r10 == 0) goto L_0x035b
            int[] r10 = r0.f23177a
            int r11 = r9 + 1
            r10[r9] = r5
            r9 = r11
        L_0x035b:
            int r5 = r5 + 1
            goto L_0x034e
        L_0x035e:
            int[] r5 = r0.f23177a
            int r5 = r5.length
            int[] r7 = new int[r2]
            r8 = 1
            r7[r8] = r5
            r5 = 0
            r7[r5] = r1
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r3, r7)
            double[][] r5 = (double[][]) r5
            double[] r7 = new double[r1]
            r8 = 0
        L_0x0372:
            if (r8 >= r1) goto L_0x0387
            r9 = r4[r8]
            r10 = r5[r8]
            int[] r11 = r0.f23177a
            r9.mo20480q(r10, r11)
            r9 = r4[r8]
            float r9 = r9.f16194a
            double r9 = (double) r9
            r7[r8] = r9
            int r8 = r8 + 1
            goto L_0x0372
        L_0x0387:
            r8 = 0
        L_0x0388:
            int[] r9 = r0.f23177a
            int r10 = r9.length
            if (r8 >= r10) goto L_0x03ca
            r9 = r9[r8]
            java.lang.String[] r10 = com.onedelhi.secure.ml2.f16182a
            int r10 = r10.length
            if (r9 >= r10) goto L_0x03c7
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String[] r10 = com.onedelhi.secure.ml2.f16182a
            int[] r11 = r0.f23177a
            r11 = r11[r8]
            r10 = r10[r11]
            r9.append(r10)
            java.lang.String r10 = " ["
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r10 = r9
            r9 = 0
        L_0x03af:
            if (r9 >= r1) goto L_0x03c7
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            r10 = r5[r9]
            r12 = r10[r8]
            r11.append(r12)
            java.lang.String r10 = r11.toString()
            int r9 = r9 + 1
            goto L_0x03af
        L_0x03c7:
            int r8 = r8 + 1
            goto L_0x0388
        L_0x03ca:
            java.lang.String[] r8 = r0.f23180a
            int r8 = r8.length
            r9 = 1
            int r8 = r8 + r9
            com.onedelhi.secure.dc0[] r8 = new com.onedelhi.secure.dc0[r8]
            r0.f23178a = r8
            r8 = 0
        L_0x03d4:
            java.lang.String[] r9 = r0.f23180a
            int r10 = r9.length
            if (r8 >= r10) goto L_0x043a
            r9 = r9[r8]
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x03df:
            if (r10 >= r1) goto L_0x041e
            r14 = r4[r10]
            boolean r14 = r14.mo20488y(r9)
            if (r14 == 0) goto L_0x0416
            if (r13 != 0) goto L_0x0402
            double[] r12 = new double[r1]
            r13 = r4[r10]
            int r13 = r13.mo20486w(r9)
            int[] r14 = new int[r2]
            r15 = 1
            r14[r15] = r13
            r15 = 0
            r14[r15] = r1
            java.lang.Object r13 = java.lang.reflect.Array.newInstance(r3, r14)
            double[][] r13 = (double[][]) r13
            goto L_0x0403
        L_0x0402:
            r15 = 0
        L_0x0403:
            r14 = r4[r10]
            float r14 = r14.f16194a
            r16 = r3
            double r2 = (double) r14
            r12[r11] = r2
            r2 = r4[r10]
            r3 = r13[r11]
            r2.mo20485v(r9, r3, r15)
            int r11 = r11 + 1
            goto L_0x0418
        L_0x0416:
            r16 = r3
        L_0x0418:
            int r10 = r10 + 1
            r3 = r16
            r2 = 2
            goto L_0x03df
        L_0x041e:
            r16 = r3
            double[] r2 = java.util.Arrays.copyOf(r12, r11)
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r13, r11)
            double[][] r3 = (double[][]) r3
            com.onedelhi.secure.dc0[] r9 = r0.f23178a
            int r8 = r8 + 1
            int r10 = r0.f23198h
            com.onedelhi.secure.dc0 r2 = com.onedelhi.secure.dc0.m13061a(r10, r2, r3)
            r9[r8] = r2
            r3 = r16
            r2 = 2
            goto L_0x03d4
        L_0x043a:
            r16 = r3
            com.onedelhi.secure.dc0[] r2 = r0.f23178a
            int r3 = r0.f23198h
            com.onedelhi.secure.dc0 r3 = com.onedelhi.secure.dc0.m13061a(r3, r7, r5)
            r5 = 0
            r2[r5] = r3
            r2 = r4[r5]
            int r2 = r2.f16209o
            r3 = -1
            if (r2 == r3) goto L_0x048f
            int[] r2 = new int[r1]
            double[] r3 = new double[r1]
            r7 = 2
            int[] r8 = new int[r7]
            r9 = 1
            r8[r9] = r7
            r8[r5] = r1
            r5 = r16
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r5, r8)
            double[][] r5 = (double[][]) r5
            r10 = 0
        L_0x0463:
            if (r10 >= r1) goto L_0x0489
            r7 = r4[r10]
            int r7 = r7.f16209o
            r2[r10] = r7
            r7 = r4[r10]
            float r7 = r7.f16194a
            double r7 = (double) r7
            r3[r10] = r7
            r7 = r5[r10]
            r8 = r4[r10]
            float r8 = r8.f16201c
            double r8 = (double) r8
            r11 = 0
            r7[r11] = r8
            r7 = r5[r10]
            r8 = r4[r10]
            float r8 = r8.f16202d
            double r8 = (double) r8
            r12 = 1
            r7[r12] = r8
            int r10 = r10 + 1
            goto L_0x0463
        L_0x0489:
            com.onedelhi.secure.dc0 r1 = com.onedelhi.secure.dc0.m13062b(r2, r3, r5)
            r0.f23167a = r1
        L_0x048f:
            r1 = 2143289344(0x7fc00000, float:NaN)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r0.f23193c = r2
            java.util.ArrayList<com.onedelhi.secure.fl2> r2 = r0.f23186b
            if (r2 == 0) goto L_0x0504
            java.util.Iterator r2 = r6.iterator()
        L_0x04a0:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04cc
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            com.onedelhi.secure.py1 r4 = com.onedelhi.secure.py1.m25182d(r3)
            if (r4 != 0) goto L_0x04b3
            goto L_0x04a0
        L_0x04b3:
            boolean r5 = r4.mo22771k()
            if (r5 == 0) goto L_0x04c3
            boolean r5 = java.lang.Float.isNaN(r1)
            if (r5 == 0) goto L_0x04c3
            float r1 = r20.mo27530I()
        L_0x04c3:
            r4.mo22769i(r3)
            java.util.HashMap<java.lang.String, com.onedelhi.secure.py1> r5 = r0.f23193c
            r5.put(r3, r4)
            goto L_0x04a0
        L_0x04cc:
            java.util.ArrayList<com.onedelhi.secure.fl2> r2 = r0.f23186b
            java.util.Iterator r2 = r2.iterator()
        L_0x04d2:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04ea
            java.lang.Object r3 = r2.next()
            com.onedelhi.secure.fl2 r3 = (com.onedelhi.secure.fl2) r3
            boolean r4 = r3 instanceof com.onedelhi.secure.hl2
            if (r4 == 0) goto L_0x04d2
            com.onedelhi.secure.hl2 r3 = (com.onedelhi.secure.hl2) r3
            java.util.HashMap<java.lang.String, com.onedelhi.secure.py1> r4 = r0.f23193c
            r3.mo17333v(r4)
            goto L_0x04d2
        L_0x04ea:
            java.util.HashMap<java.lang.String, com.onedelhi.secure.py1> r2 = r0.f23193c
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x04f4:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0504
            java.lang.Object r3 = r2.next()
            com.onedelhi.secure.py1 r3 = (com.onedelhi.secure.py1) r3
            r3.mo22770j(r1)
            goto L_0x04f4
        L_0x0504:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.yk2.mo27551d0(int, int, float, long):void");
    }

    /* renamed from: e */
    public boolean mo13124e(int i, String str) {
        if (705 == i) {
            PrintStream printStream = System.out;
            printStream.println("TYPE_INTERPOLATOR  " + str);
            this.f23171a = m32412A(-1, str, 0);
        }
        return false;
    }

    /* renamed from: e0 */
    public void mo27552e0(yk2 yk2) {
        this.f23168a.mo20473G(yk2, yk2.f23168a);
        this.f23183b.mo20473G(yk2, yk2.f23183b);
    }

    /* renamed from: f */
    public void mo27553f(fl2 fl2) {
        this.f23186b.add(fl2);
    }

    /* renamed from: g */
    public void mo27554g(ArrayList<fl2> arrayList) {
        this.f23186b.addAll(arrayList);
    }

    /* renamed from: h */
    public void mo27555h(float[] fArr, int i) {
        int i2 = i;
        float f = 1.0f / ((float) (i2 - 1));
        HashMap<String, x14> hashMap = this.f23187b;
        if (hashMap != null) {
            x14 x14 = hashMap.get("translationX");
        }
        HashMap<String, x14> hashMap2 = this.f23187b;
        if (hashMap2 != null) {
            x14 x142 = hashMap2.get("translationY");
        }
        HashMap<String, py1> hashMap3 = this.f23193c;
        if (hashMap3 != null) {
            py1 py1 = hashMap3.get("translationX");
        }
        HashMap<String, py1> hashMap4 = this.f23193c;
        if (hashMap4 != null) {
            py1 py12 = hashMap4.get("translationY");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            float f2 = ((float) i3) * f;
            float f3 = this.f23192c;
            float f4 = 0.0f;
            if (f3 != 1.0f) {
                float f5 = this.f23181b;
                if (f2 < f5) {
                    f2 = 0.0f;
                }
                if (f2 > f5 && ((double) f2) < 1.0d) {
                    f2 = Math.min((f2 - f5) * f3, 1.0f);
                }
            }
            double d = (double) f2;
            ur0 ur0 = this.f23168a.f16195a;
            float f6 = Float.NaN;
            Iterator<ml2> it = this.f23172a.iterator();
            while (it.hasNext()) {
                ml2 next = it.next();
                ur0 ur02 = next.f16195a;
                if (ur02 != null) {
                    float f7 = next.f16194a;
                    if (f7 < f2) {
                        ur0 = ur02;
                        f4 = f7;
                    } else if (Float.isNaN(f6)) {
                        f6 = next.f16194a;
                    }
                }
            }
            if (ur0 != null) {
                if (Float.isNaN(f6)) {
                    f6 = 1.0f;
                }
                float f8 = f6 - f4;
                d = (double) ((((float) ur0.mo17398a((double) ((f2 - f4) / f8))) * f8) + f4);
            }
            this.f23178a[0].mo14611d(d, this.f23175a);
            dc0 dc0 = this.f23167a;
            if (dc0 != null) {
                double[] dArr = this.f23175a;
                if (dArr.length > 0) {
                    dc0.mo14611d(d, dArr);
                }
            }
            this.f23168a.mo20481r(this.f23177a, this.f23175a, fArr, i3 * 2);
        }
    }

    /* renamed from: i */
    public int mo27556i(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] h = this.f23178a[0].mo14615h();
        if (iArr != null) {
            Iterator<ml2> it = this.f23172a.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = it.next().f16211q;
                i++;
            }
        }
        int i2 = 0;
        for (double d : h) {
            this.f23178a[0].mo14611d(d, this.f23175a);
            this.f23168a.mo20481r(this.f23177a, this.f23175a, fArr, i2);
            i2 += 2;
        }
        return i2 / 2;
    }

    /* renamed from: j */
    public int mo27557j(float[] fArr, int[] iArr, int[] iArr2) {
        if (fArr == null) {
            return 0;
        }
        double[] h = this.f23178a[0].mo14615h();
        if (iArr != null) {
            Iterator<ml2> it = this.f23172a.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = it.next().f16211q;
                i++;
            }
        }
        if (iArr2 != null) {
            Iterator<ml2> it2 = this.f23172a.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                iArr2[i2] = (int) (it2.next().f16199b * 100.0f);
                i2++;
            }
        }
        int i3 = 0;
        for (int i4 = 0; i4 < h.length; i4++) {
            this.f23178a[0].mo14611d(h[i4], this.f23175a);
            this.f23168a.mo20482s(h[i4], this.f23177a, this.f23175a, fArr, i3);
            i3 += 2;
        }
        return i3 / 2;
    }

    /* renamed from: k */
    public void mo27558k(float[] fArr, int i) {
        double d;
        int i2 = i;
        float f = 1.0f;
        float f2 = 1.0f / ((float) (i2 - 1));
        HashMap<String, x14> hashMap = this.f23187b;
        py1 py1 = null;
        x14 x14 = hashMap == null ? null : hashMap.get("translationX");
        HashMap<String, x14> hashMap2 = this.f23187b;
        x14 x142 = hashMap2 == null ? null : hashMap2.get("translationY");
        HashMap<String, py1> hashMap3 = this.f23193c;
        py1 py12 = hashMap3 == null ? null : hashMap3.get("translationX");
        HashMap<String, py1> hashMap4 = this.f23193c;
        if (hashMap4 != null) {
            py1 = hashMap4.get("translationY");
        }
        py1 py13 = py1;
        int i3 = 0;
        while (i3 < i2) {
            float f3 = ((float) i3) * f2;
            float f4 = this.f23192c;
            if (f4 != f) {
                float f5 = this.f23181b;
                if (f3 < f5) {
                    f3 = 0.0f;
                }
                if (f3 > f5 && ((double) f3) < 1.0d) {
                    f3 = Math.min((f3 - f5) * f4, f);
                }
            }
            float f6 = f3;
            double d2 = (double) f6;
            ur0 ur0 = this.f23168a.f16195a;
            float f7 = Float.NaN;
            Iterator<ml2> it = this.f23172a.iterator();
            float f8 = 0.0f;
            while (it.hasNext()) {
                ml2 next = it.next();
                ur0 ur02 = next.f16195a;
                double d3 = d2;
                if (ur02 != null) {
                    float f9 = next.f16194a;
                    if (f9 < f6) {
                        f8 = f9;
                        ur0 = ur02;
                    } else if (Float.isNaN(f7)) {
                        f7 = next.f16194a;
                    }
                }
                d2 = d3;
            }
            double d4 = d2;
            if (ur0 != null) {
                if (Float.isNaN(f7)) {
                    f7 = 1.0f;
                }
                float f10 = f7 - f8;
                d = (double) ((((float) ur0.mo17398a((double) ((f6 - f8) / f10))) * f10) + f8);
            } else {
                d = d4;
            }
            this.f23178a[0].mo14611d(d, this.f23175a);
            dc0 dc0 = this.f23167a;
            if (dc0 != null) {
                double[] dArr = this.f23175a;
                if (dArr.length > 0) {
                    dc0.mo14611d(d, dArr);
                }
            }
            int i4 = i3 * 2;
            float f11 = f6;
            int i5 = i3;
            this.f23168a.mo20482s(d, this.f23177a, this.f23175a, fArr, i4);
            if (py12 != null) {
                fArr[i4] = fArr[i4] + py12.mo22763a(f11);
            } else if (x14 != null) {
                fArr[i4] = fArr[i4] + x14.mo26748a(f11);
            }
            if (py13 != null) {
                int i6 = i4 + 1;
                fArr[i6] = fArr[i6] + py13.mo22763a(f11);
            } else if (x142 != null) {
                int i7 = i4 + 1;
                fArr[i7] = fArr[i7] + x142.mo26748a(f11);
            }
            i3 = i5 + 1;
            f = 1.0f;
        }
    }

    /* renamed from: l */
    public void mo27559l(float f, float[] fArr, int i) {
        this.f23178a[0].mo14611d((double) mo27562o(f, (float[]) null), this.f23175a);
        this.f23168a.mo20487x(this.f23177a, this.f23175a, fArr, i);
    }

    /* renamed from: m */
    public void mo27560m(float[] fArr, int i) {
        float f = 1.0f / ((float) (i - 1));
        for (int i2 = 0; i2 < i; i2++) {
            this.f23178a[0].mo14611d((double) mo27562o(((float) i2) * f, (float[]) null), this.f23175a);
            this.f23168a.mo20487x(this.f23177a, this.f23175a, fArr, i2 * 8);
        }
    }

    /* renamed from: n */
    public void mo27561n(boolean z) {
    }

    /* renamed from: o */
    public final float mo27562o(float f, float[] fArr) {
        float f2 = 0.0f;
        float f3 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f4 = this.f23192c;
            if (((double) f4) != 1.0d) {
                float f5 = this.f23181b;
                if (f < f5) {
                    f = 0.0f;
                }
                if (f > f5 && ((double) f) < 1.0d) {
                    f = Math.min((f - f5) * f4, 1.0f);
                }
            }
        }
        ur0 ur0 = this.f23168a.f16195a;
        float f6 = Float.NaN;
        Iterator<ml2> it = this.f23172a.iterator();
        while (it.hasNext()) {
            ml2 next = it.next();
            ur0 ur02 = next.f16195a;
            if (ur02 != null) {
                float f7 = next.f16194a;
                if (f7 < f) {
                    ur0 = ur02;
                    f2 = f7;
                } else if (Float.isNaN(f6)) {
                    f6 = next.f16194a;
                }
            }
        }
        if (ur0 != null) {
            if (!Float.isNaN(f6)) {
                f3 = f6;
            }
            float f8 = f3 - f2;
            double d = (double) ((f - f2) / f8);
            f = (((float) ur0.mo17398a(d)) * f8) + f2;
            if (fArr != null) {
                fArr[0] = (float) ur0.mo17399b(d);
            }
        }
        return f;
    }

    /* renamed from: p */
    public int mo27563p() {
        return this.f23168a.f16210p;
    }

    /* renamed from: q */
    public int mo27564q(String str, float[] fArr, int i) {
        x14 x14 = this.f23187b.get(str);
        if (x14 == null) {
            return -1;
        }
        for (int i2 = 0; i2 < fArr.length; i2++) {
            fArr[i2] = x14.mo26748a((float) (i2 / (fArr.length - 1)));
        }
        return fArr.length;
    }

    /* renamed from: r */
    public void mo27565r(double d, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f23178a[0].mo14611d(d, dArr);
        this.f23178a[0].mo14614g(d, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.f23168a.mo20483t(d, this.f23177a, dArr, fArr, dArr2, fArr2);
    }

    /* renamed from: s */
    public float mo27566s() {
        return this.f23194d;
    }

    /* renamed from: t */
    public float mo27567t() {
        return this.f23195e;
    }

    public String toString() {
        return " start: x: " + this.f23168a.f16201c + " y: " + this.f23168a.f16202d + " end: x: " + this.f23183b.f16201c + " y: " + this.f23183b.f16202d;
    }

    /* renamed from: u */
    public void mo27569u(float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        float o = mo27562o(f, this.f23189b);
        dc0[] dc0Arr = this.f23178a;
        int i = 0;
        if (dc0Arr != null) {
            double d = (double) o;
            dc0Arr[0].mo14614g(d, this.f23188b);
            this.f23178a[0].mo14611d(d, this.f23175a);
            float f4 = this.f23189b[0];
            while (true) {
                dArr = this.f23188b;
                if (i >= dArr.length) {
                    break;
                }
                dArr[i] = dArr[i] * ((double) f4);
                i++;
            }
            dc0 dc0 = this.f23167a;
            if (dc0 != null) {
                double[] dArr2 = this.f23175a;
                if (dArr2.length > 0) {
                    dc0.mo14611d(d, dArr2);
                    this.f23167a.mo14614g(d, this.f23188b);
                    this.f23168a.mo20471E(f2, f3, fArr, this.f23177a, this.f23188b, this.f23175a);
                    return;
                }
                return;
            }
            this.f23168a.mo20471E(f2, f3, fArr, this.f23177a, dArr, this.f23175a);
            return;
        }
        ml2 ml2 = this.f23183b;
        float f5 = ml2.f16201c;
        ml2 ml22 = this.f23168a;
        float f6 = f5 - ml22.f16201c;
        float f7 = ml2.f16202d - ml22.f16202d;
        float f8 = (ml2.f16203e - ml22.f16203e) + f6;
        float f9 = (ml2.f16204f - ml22.f16204f) + f7;
        fArr[0] = (f6 * (1.0f - f2)) + (f8 * f2);
        fArr[1] = (f7 * (1.0f - f3)) + (f9 * f3);
    }

    /* renamed from: v */
    public int mo27570v() {
        int i = this.f23168a.f16208n;
        Iterator<ml2> it = this.f23172a.iterator();
        while (it.hasNext()) {
            i = Math.max(i, it.next().f16208n);
        }
        return Math.max(i, this.f23183b.f16208n);
    }

    /* renamed from: w */
    public float mo27571w() {
        return this.f23183b.f16204f;
    }

    /* renamed from: x */
    public float mo27572x() {
        return this.f23183b.f16203e;
    }

    /* renamed from: y */
    public float mo27573y() {
        return this.f23183b.f16201c;
    }

    /* renamed from: z */
    public float mo27574z() {
        return this.f23183b.f16202d;
    }
}
