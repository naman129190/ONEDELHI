package com.onedelhi.secure;

import com.onedelhi.secure.ql2;
import java.util.Arrays;
import java.util.HashMap;

public class ml2 implements Comparable<ml2> {

    /* renamed from: A */
    public static final int f16181A = 2;

    /* renamed from: a */
    public static String[] f16182a = {"position", "x", "y", yz1.f38148j, "height", "pathRotate"};

    /* renamed from: b */
    public static final String f16183b = "MotionPaths";

    /* renamed from: b */
    public static final boolean f16184b = false;

    /* renamed from: c */
    public static final boolean f16185c = false;

    /* renamed from: s */
    public static final int f16186s = 0;

    /* renamed from: t */
    public static final int f16187t = 1;

    /* renamed from: u */
    public static final int f16188u = 2;

    /* renamed from: v */
    public static final int f16189v = 3;

    /* renamed from: w */
    public static final int f16190w = 4;

    /* renamed from: x */
    public static final int f16191x = 5;

    /* renamed from: y */
    public static final int f16192y = 1;

    /* renamed from: z */
    public static final int f16193z = 0;

    /* renamed from: a */
    public float f16194a;

    /* renamed from: a */
    public ur0 f16195a;

    /* renamed from: a */
    public yk2 f16196a = null;

    /* renamed from: a */
    public HashMap<String, qc0> f16197a = new HashMap<>();

    /* renamed from: a */
    public double[] f16198a = new double[18];

    /* renamed from: b */
    public float f16199b;

    /* renamed from: b */
    public double[] f16200b = new double[18];

    /* renamed from: c */
    public float f16201c;

    /* renamed from: d */
    public float f16202d;

    /* renamed from: e */
    public float f16203e;

    /* renamed from: f */
    public float f16204f;

    /* renamed from: g */
    public float f16205g = Float.NaN;

    /* renamed from: h */
    public float f16206h = Float.NaN;

    /* renamed from: i */
    public float f16207i = Float.NaN;

    /* renamed from: n */
    public int f16208n = 0;

    /* renamed from: o */
    public int f16209o = -1;

    /* renamed from: p */
    public int f16210p = -1;

    /* renamed from: q */
    public int f16211q = 0;

    /* renamed from: r */
    public int f16212r;

    public ml2() {
    }

    public ml2(int i, int i2, il2 il2, ml2 ml2, ml2 ml22) {
        if (ml2.f16210p != -1) {
            mo20468B(i, i2, il2, ml2, ml22);
            return;
        }
        int i3 = il2.f13749n;
        if (i3 == 1) {
            mo20467A(il2, ml2, ml22);
        } else if (i3 != 2) {
            mo20489z(il2, ml2, ml22);
        } else {
            mo20469C(i, i2, il2, ml2, ml22);
        }
    }

    /* renamed from: H */
    public static final float m21695H(float f, float f2, float f3, float f4, float f5, float f6) {
        return (((f5 - f3) * f2) - ((f6 - f4) * f)) + f3;
    }

    /* renamed from: I */
    public static final float m21696I(float f, float f2, float f3, float f4, float f5, float f6) {
        return ((f5 - f3) * f) + ((f6 - f4) * f2) + f4;
    }

    /* renamed from: A */
    public void mo20467A(il2 il2, ml2 ml2, ml2 ml22) {
        il2 il22 = il2;
        ml2 ml23 = ml2;
        ml2 ml24 = ml22;
        float f = ((float) il22.f12142g) / 100.0f;
        this.f16194a = f;
        this.f16208n = il22.f13748m;
        float f2 = Float.isNaN(il22.f13738a) ? f : il22.f13738a;
        float f3 = Float.isNaN(il22.f13739b) ? f : il22.f13739b;
        float f4 = ml24.f16203e - ml23.f16203e;
        float f5 = ml24.f16204f - ml23.f16204f;
        this.f16199b = this.f16194a;
        if (!Float.isNaN(il22.f13740c)) {
            f = il22.f13740c;
        }
        float f6 = ml23.f16201c;
        float f7 = ml23.f16203e;
        float f8 = ml23.f16202d;
        float f9 = ml23.f16204f;
        float f10 = (ml24.f16201c + (ml24.f16203e / 2.0f)) - ((f7 / 2.0f) + f6);
        float f11 = (ml24.f16202d + (ml24.f16204f / 2.0f)) - ((f9 / 2.0f) + f8);
        float f12 = f10 * f;
        float f13 = f4 * f2;
        float f14 = f13 / 2.0f;
        this.f16201c = (float) ((int) ((f6 + f12) - f14));
        float f15 = f * f11;
        float f16 = f5 * f3;
        float f17 = f16 / 2.0f;
        this.f16202d = (float) ((int) ((f8 + f15) - f17));
        this.f16203e = (float) ((int) (f7 + f13));
        this.f16204f = (float) ((int) (f9 + f16));
        il2 il23 = il2;
        float f18 = Float.isNaN(il23.f13741d) ? 0.0f : il23.f13741d;
        float f19 = (-f11) * f18;
        float f20 = f10 * f18;
        this.f16211q = 1;
        ml2 ml25 = ml2;
        this.f16201c = ((float) ((int) ((ml25.f16201c + f12) - f14))) + f19;
        this.f16202d = ((float) ((int) ((ml25.f16202d + f15) - f17))) + f20;
        this.f16210p = this.f16210p;
        this.f16195a = ur0.m29534c(il23.f13750n);
        this.f16209o = il23.f13747l;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0068, code lost:
        if (java.lang.Float.isNaN(r9.f13741d) != false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bb, code lost:
        if (java.lang.Float.isNaN(r9.f13741d) != false) goto L_0x006d;
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo20468B(int r7, int r8, com.onedelhi.secure.il2 r9, com.onedelhi.secure.ml2 r10, com.onedelhi.secure.ml2 r11) {
        /*
            r6 = this;
            int r7 = r9.f12142g
            float r7 = (float) r7
            r8 = 1120403456(0x42c80000, float:100.0)
            float r7 = r7 / r8
            r6.f16194a = r7
            int r8 = r9.f13748m
            r6.f16208n = r8
            int r8 = r9.f13749n
            r6.f16211q = r8
            float r8 = r9.f13738a
            boolean r8 = java.lang.Float.isNaN(r8)
            if (r8 == 0) goto L_0x001a
            r8 = r7
            goto L_0x001c
        L_0x001a:
            float r8 = r9.f13738a
        L_0x001c:
            float r0 = r9.f13739b
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L_0x0026
            r0 = r7
            goto L_0x0028
        L_0x0026:
            float r0 = r9.f13739b
        L_0x0028:
            float r1 = r11.f16203e
            float r2 = r10.f16203e
            float r1 = r1 - r2
            float r3 = r11.f16204f
            float r4 = r10.f16204f
            float r3 = r3 - r4
            float r5 = r6.f16194a
            r6.f16199b = r5
            float r1 = r1 * r8
            float r2 = r2 + r1
            int r1 = (int) r2
            float r1 = (float) r1
            r6.f16203e = r1
            float r3 = r3 * r0
            float r4 = r4 + r3
            int r1 = (int) r4
            float r1 = (float) r1
            r6.f16204f = r1
            int r1 = r9.f13749n
            r2 = 1
            if (r1 == r2) goto L_0x009f
            r2 = 2
            if (r1 == r2) goto L_0x0078
            float r8 = r9.f13740c
            boolean r8 = java.lang.Float.isNaN(r8)
            if (r8 == 0) goto L_0x0056
            r8 = r7
            goto L_0x0058
        L_0x0056:
            float r8 = r9.f13740c
        L_0x0058:
            float r0 = r11.f16201c
            float r1 = r10.f16201c
            float r0 = r0 - r1
            float r8 = r8 * r0
            float r8 = r8 + r1
            r6.f16201c = r8
            float r8 = r9.f13741d
            boolean r8 = java.lang.Float.isNaN(r8)
            if (r8 == 0) goto L_0x006b
            goto L_0x006d
        L_0x006b:
            float r7 = r9.f13741d
        L_0x006d:
            float r8 = r11.f16202d
            float r11 = r10.f16202d
            float r8 = r8 - r11
            float r7 = r7 * r8
            float r7 = r7 + r11
        L_0x0075:
            r6.f16202d = r7
            goto L_0x00be
        L_0x0078:
            float r1 = r9.f13740c
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0089
            float r8 = r11.f16201c
            float r0 = r10.f16201c
            float r8 = r8 - r0
            float r8 = r8 * r7
            float r8 = r8 + r0
            goto L_0x0091
        L_0x0089:
            float r1 = r9.f13740c
            float r8 = java.lang.Math.min(r0, r8)
            float r8 = r8 * r1
        L_0x0091:
            r6.f16201c = r8
            float r8 = r9.f13741d
            boolean r8 = java.lang.Float.isNaN(r8)
            if (r8 == 0) goto L_0x009c
            goto L_0x006d
        L_0x009c:
            float r7 = r9.f13741d
            goto L_0x0075
        L_0x009f:
            float r8 = r9.f13740c
            boolean r8 = java.lang.Float.isNaN(r8)
            if (r8 == 0) goto L_0x00a9
            r8 = r7
            goto L_0x00ab
        L_0x00a9:
            float r8 = r9.f13740c
        L_0x00ab:
            float r0 = r11.f16201c
            float r1 = r10.f16201c
            float r0 = r0 - r1
            float r8 = r8 * r0
            float r8 = r8 + r1
            r6.f16201c = r8
            float r8 = r9.f13741d
            boolean r8 = java.lang.Float.isNaN(r8)
            if (r8 == 0) goto L_0x006b
            goto L_0x006d
        L_0x00be:
            int r7 = r10.f16210p
            r6.f16210p = r7
            java.lang.String r7 = r9.f13750n
            com.onedelhi.secure.ur0 r7 = com.onedelhi.secure.ur0.m29534c(r7)
            r6.f16195a = r7
            int r7 = r9.f13747l
            r6.f16209o = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ml2.mo20468B(int, int, com.onedelhi.secure.il2, com.onedelhi.secure.ml2, com.onedelhi.secure.ml2):void");
    }

    /* renamed from: C */
    public void mo20469C(int i, int i2, il2 il2, ml2 ml2, ml2 ml22) {
        il2 il22 = il2;
        ml2 ml23 = ml2;
        ml2 ml24 = ml22;
        float f = ((float) il22.f12142g) / 100.0f;
        this.f16194a = f;
        this.f16208n = il22.f13748m;
        float f2 = Float.isNaN(il22.f13738a) ? f : il22.f13738a;
        float f3 = Float.isNaN(il22.f13739b) ? f : il22.f13739b;
        float f4 = ml24.f16203e;
        float f5 = ml23.f16203e;
        float f6 = ml24.f16204f;
        float f7 = ml23.f16204f;
        this.f16199b = this.f16194a;
        float f8 = ml23.f16201c;
        float f9 = ml23.f16202d;
        float f10 = ml24.f16201c + (f4 / 2.0f);
        float f11 = ml24.f16202d + (f6 / 2.0f);
        float f12 = (f4 - f5) * f2;
        this.f16201c = (float) ((int) ((f8 + ((f10 - ((f5 / 2.0f) + f8)) * f)) - (f12 / 2.0f)));
        float f13 = (f6 - f7) * f3;
        this.f16202d = (float) ((int) ((f9 + ((f11 - (f9 + (f7 / 2.0f))) * f)) - (f13 / 2.0f)));
        this.f16203e = (float) ((int) (f5 + f12));
        this.f16204f = (float) ((int) (f7 + f13));
        this.f16211q = 2;
        il2 il23 = il2;
        if (!Float.isNaN(il23.f13740c)) {
            this.f16201c = (float) ((int) (il23.f13740c * ((float) ((int) (((float) i) - this.f16203e)))));
        }
        if (!Float.isNaN(il23.f13741d)) {
            this.f16202d = (float) ((int) (il23.f13741d * ((float) ((int) (((float) i2) - this.f16204f)))));
        }
        this.f16210p = this.f16210p;
        this.f16195a = ur0.m29534c(il23.f13750n);
        this.f16209o = il23.f13747l;
    }

    /* renamed from: D */
    public void mo20470D(float f, float f2, float f3, float f4) {
        this.f16201c = f;
        this.f16202d = f2;
        this.f16203e = f3;
        this.f16204f = f4;
    }

    /* renamed from: E */
    public void mo20471E(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        int[] iArr2 = iArr;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr2.length; i++) {
            float f7 = (float) dArr[i];
            double d = dArr2[i];
            int i2 = iArr2[i];
            if (i2 == 1) {
                f3 = f7;
            } else if (i2 == 2) {
                f5 = f7;
            } else if (i2 == 3) {
                f4 = f7;
            } else if (i2 == 4) {
                f6 = f7;
            }
        }
        float f8 = f3 - ((0.0f * f4) / 2.0f);
        float f9 = f5 - ((0.0f * f6) / 2.0f);
        fArr[0] = (f8 * (1.0f - f)) + (((f4 * 1.0f) + f8) * f) + 0.0f;
        fArr[1] = (f9 * (1.0f - f2)) + (((f6 * 1.0f) + f9) * f2) + 0.0f;
    }

    /* renamed from: F */
    public void mo20472F(float f, ql2 ql2, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3) {
        float f2;
        float f3;
        ql2 ql22 = ql2;
        int[] iArr2 = iArr;
        double[] dArr4 = dArr2;
        float f4 = this.f16201c;
        float f5 = this.f16202d;
        float f6 = this.f16203e;
        float f7 = this.f16204f;
        if (iArr2.length != 0 && this.f16198a.length <= iArr2[iArr2.length - 1]) {
            int i = iArr2[iArr2.length - 1] + 1;
            this.f16198a = new double[i];
            this.f16200b = new double[i];
        }
        Arrays.fill(this.f16198a, Double.NaN);
        for (int i2 = 0; i2 < iArr2.length; i2++) {
            this.f16198a[iArr2[i2]] = dArr[i2];
            this.f16200b[iArr2[i2]] = dArr4[i2];
        }
        float f8 = Float.NaN;
        int i3 = 0;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        while (true) {
            double[] dArr5 = this.f16198a;
            if (i3 >= dArr5.length) {
                break;
            }
            double d = 0.0d;
            if (!Double.isNaN(dArr5[i3]) || !(dArr3 == null || dArr3[i3] == 0.0d)) {
                if (dArr3 != null) {
                    d = dArr3[i3];
                }
                if (!Double.isNaN(this.f16198a[i3])) {
                    d = this.f16198a[i3] + d;
                }
                f3 = f8;
                float f13 = (float) d;
                float f14 = (float) this.f16200b[i3];
                if (i3 == 1) {
                    f8 = f3;
                    f9 = f14;
                    f4 = f13;
                } else if (i3 == 2) {
                    f8 = f3;
                    f10 = f14;
                    f5 = f13;
                } else if (i3 == 3) {
                    f8 = f3;
                    f11 = f14;
                    f6 = f13;
                } else if (i3 == 4) {
                    f8 = f3;
                    f12 = f14;
                    f7 = f13;
                } else if (i3 == 5) {
                    f8 = f13;
                }
                i3++;
                double[] dArr6 = dArr2;
            } else {
                f3 = f8;
            }
            f8 = f3;
            i3++;
            double[] dArr62 = dArr2;
        }
        float f15 = f8;
        yk2 yk2 = this.f16196a;
        if (yk2 != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            yk2.mo27565r((double) f, fArr, fArr2);
            float f16 = fArr[0];
            float f17 = fArr[1];
            float f18 = fArr2[0];
            float f19 = fArr2[1];
            double d2 = (double) f4;
            double d3 = (double) f5;
            double sin = ((double) f16) + (Math.sin(d3) * d2);
            f2 = f7;
            float f20 = (float) (sin - ((double) (f6 / 2.0f)));
            float cos = (float) ((((double) f17) - (Math.cos(d3) * d2)) - ((double) (f7 / 2.0f)));
            double d4 = (double) f9;
            double d5 = (double) f10;
            float sin2 = (float) (((double) f18) + (Math.sin(d3) * d4) + (Math.cos(d3) * d2 * d5));
            float f21 = f20;
            float cos2 = (float) ((((double) f19) - (d4 * Math.cos(d3))) + (d2 * Math.sin(d3) * d5));
            double[] dArr7 = dArr2;
            if (dArr7.length >= 2) {
                dArr7[0] = (double) sin2;
                dArr7[1] = (double) cos2;
            }
            if (!Float.isNaN(f15)) {
                ql22.mo23218R((float) (((double) f15) + Math.toDegrees(Math.atan2((double) cos2, (double) sin2))));
            }
            f4 = f21;
            f5 = cos;
        } else {
            float f22 = f15;
            f2 = f7;
            if (!Float.isNaN(f22)) {
                ql22.mo23218R((float) (((double) 0.0f) + ((double) f22) + Math.toDegrees(Math.atan2((double) (f10 + (f12 / 2.0f)), (double) (f9 + (f11 / 2.0f))))));
            }
        }
        float f23 = f4 + 0.5f;
        float f24 = f5 + 0.5f;
        ql22.mo23207G((int) f23, (int) f24, (int) (f23 + f6), (int) (f24 + f2));
    }

    /* renamed from: G */
    public void mo20473G(yk2 yk2, ml2 ml2) {
        double d = (double) (((this.f16201c + (this.f16203e / 2.0f)) - ml2.f16201c) - (ml2.f16203e / 2.0f));
        double d2 = (double) (((this.f16202d + (this.f16204f / 2.0f)) - ml2.f16202d) - (ml2.f16204f / 2.0f));
        this.f16196a = yk2;
        this.f16201c = (float) Math.hypot(d2, d);
        this.f16202d = (float) (Float.isNaN(this.f16207i) ? Math.atan2(d2, d) + 1.5707963267948966d : Math.toRadians((double) this.f16207i));
    }

    /* renamed from: a */
    public void mo20474a(ql2 ql2) {
        this.f16195a = ur0.m29534c(ql2.f19229a.f19237a);
        ql2.C3308a aVar = ql2.f19229a;
        this.f16209o = aVar.f19242c;
        this.f16210p = aVar.f19236a;
        this.f16205g = aVar.f19238b;
        this.f16208n = aVar.f19243d;
        this.f16212r = aVar.f19239b;
        this.f16206h = ql2.f19230a.f19250b;
        this.f16207i = 0.0f;
        for (String next : ql2.mo23233j()) {
            qc0 i = ql2.mo23232i(next);
            if (i != null && i.mo23088q()) {
                this.f16197a.put(next, i);
            }
        }
    }

    /* renamed from: b */
    public int compareTo(ml2 ml2) {
        return Float.compare(this.f16199b, ml2.f16199b);
    }

    /* renamed from: e */
    public void mo20477e(yk2 yk2) {
        yk2.mo27527F((double) this.f16206h);
    }

    /* renamed from: g */
    public final boolean mo20478g(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    /* renamed from: l */
    public void mo20479l(ml2 ml2, boolean[] zArr, String[] strArr, boolean z) {
        boolean g = mo20478g(this.f16201c, ml2.f16201c);
        boolean g2 = mo20478g(this.f16202d, ml2.f16202d);
        zArr[0] = zArr[0] | mo20478g(this.f16199b, ml2.f16199b);
        boolean z2 = g | g2 | z;
        zArr[1] = zArr[1] | z2;
        zArr[2] = z2 | zArr[2];
        zArr[3] = zArr[3] | mo20478g(this.f16203e, ml2.f16203e);
        zArr[4] = mo20478g(this.f16204f, ml2.f16204f) | zArr[4];
    }

    /* renamed from: q */
    public void mo20480q(double[] dArr, int[] iArr) {
        float[] fArr = {this.f16199b, this.f16201c, this.f16202d, this.f16203e, this.f16204f, this.f16205g};
        int i = 0;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] < 6) {
                dArr[i] = (double) fArr[iArr[i2]];
                i++;
            }
        }
    }

    /* renamed from: r */
    public void mo20481r(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f16203e;
        float f2 = this.f16204f;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f3 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 3) {
                f = f3;
            } else if (i3 == 4) {
                f2 = f3;
            }
        }
        fArr[i] = f;
        fArr[i + 1] = f2;
    }

    /* renamed from: s */
    public void mo20482s(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        int[] iArr2 = iArr;
        float f = this.f16201c;
        float f2 = this.f16202d;
        float f3 = this.f16203e;
        float f4 = this.f16204f;
        for (int i2 = 0; i2 < iArr2.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr2[i2];
            if (i3 == 1) {
                f = f5;
            } else if (i3 == 2) {
                f2 = f5;
            } else if (i3 == 3) {
                f3 = f5;
            } else if (i3 == 4) {
                f4 = f5;
            }
        }
        yk2 yk2 = this.f16196a;
        if (yk2 != null) {
            float[] fArr2 = new float[2];
            yk2.mo27565r(d, fArr2, new float[2]);
            float f6 = fArr2[0];
            float f7 = fArr2[1];
            double d2 = (double) f6;
            double d3 = (double) f;
            double d4 = (double) f2;
            f = (float) ((d2 + (Math.sin(d4) * d3)) - ((double) (f3 / 2.0f)));
            f2 = (float) ((((double) f7) - (d3 * Math.cos(d4))) - ((double) (f4 / 2.0f)));
        }
        fArr[i] = f + (f3 / 2.0f) + 0.0f;
        fArr[i + 1] = f2 + (f4 / 2.0f) + 0.0f;
    }

    /* renamed from: t */
    public void mo20483t(double d, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f;
        int[] iArr2 = iArr;
        float f2 = this.f16201c;
        float f3 = this.f16202d;
        float f4 = this.f16203e;
        float f5 = this.f16204f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        for (int i = 0; i < iArr2.length; i++) {
            float f10 = (float) dArr[i];
            float f11 = (float) dArr2[i];
            int i2 = iArr2[i];
            if (i2 == 1) {
                f2 = f10;
                f6 = f11;
            } else if (i2 == 2) {
                f3 = f10;
                f8 = f11;
            } else if (i2 == 3) {
                f4 = f10;
                f7 = f11;
            } else if (i2 == 4) {
                f5 = f10;
                f9 = f11;
            }
        }
        float f12 = 2.0f;
        float f13 = (f7 / 2.0f) + f6;
        float f14 = (f9 / 2.0f) + f8;
        yk2 yk2 = this.f16196a;
        if (yk2 != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            yk2.mo27565r(d, fArr3, fArr4);
            float f15 = fArr3[0];
            float f16 = fArr3[1];
            float f17 = fArr4[0];
            double d2 = (double) f2;
            float f18 = fArr4[1];
            double d3 = (double) f3;
            f = f4;
            double d4 = (double) f6;
            double d5 = (double) f8;
            float sin = (float) (((double) f17) + (Math.sin(d3) * d4) + (Math.cos(d3) * d5));
            f14 = (float) ((((double) f18) - (d4 * Math.cos(d3))) + (Math.sin(d3) * d5));
            f13 = sin;
            f2 = (float) ((((double) f15) + (Math.sin(d3) * d2)) - ((double) (f4 / 2.0f)));
            f3 = (float) ((((double) f16) - (d2 * Math.cos(d3))) - ((double) (f5 / 2.0f)));
            f12 = 2.0f;
        } else {
            f = f4;
        }
        fArr[0] = f2 + (f / f12) + 0.0f;
        fArr[1] = f3 + (f5 / f12) + 0.0f;
        fArr2[0] = f13;
        fArr2[1] = f14;
    }

    /* renamed from: u */
    public void mo20484u(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        int[] iArr2 = iArr;
        float f = this.f16201c;
        float f2 = this.f16202d;
        float f3 = this.f16203e;
        float f4 = this.f16204f;
        for (int i2 = 0; i2 < iArr2.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr2[i2];
            if (i3 == 1) {
                f = f5;
            } else if (i3 == 2) {
                f2 = f5;
            } else if (i3 == 3) {
                f3 = f5;
            } else if (i3 == 4) {
                f4 = f5;
            }
        }
        yk2 yk2 = this.f16196a;
        if (yk2 != null) {
            float[] fArr2 = new float[2];
            yk2.mo27565r(d, fArr2, new float[2]);
            float f6 = fArr2[0];
            float f7 = fArr2[1];
            double d2 = (double) f6;
            double d3 = (double) f;
            double d4 = (double) f2;
            f = (float) ((d2 + (Math.sin(d4) * d3)) - ((double) (f3 / 2.0f)));
            f2 = (float) ((((double) f7) - (d3 * Math.cos(d4))) - ((double) (f4 / 2.0f)));
        }
        fArr[i] = f + (f3 / 2.0f) + 0.0f;
        fArr[i + 1] = f2 + (f4 / 2.0f) + 0.0f;
    }

    /* renamed from: v */
    public int mo20485v(String str, double[] dArr, int i) {
        qc0 qc0 = this.f16197a.get(str);
        int i2 = 0;
        if (qc0 == null) {
            return 0;
        }
        if (qc0.mo23089r() == 1) {
            dArr[i] = (double) qc0.mo23086n();
            return 1;
        }
        int r = qc0.mo23089r();
        float[] fArr = new float[r];
        qc0.mo23087o(fArr);
        while (i2 < r) {
            dArr[i] = (double) fArr[i2];
            i2++;
            i++;
        }
        return r;
    }

    /* renamed from: w */
    public int mo20486w(String str) {
        qc0 qc0 = this.f16197a.get(str);
        if (qc0 == null) {
            return 0;
        }
        return qc0.mo23089r();
    }

    /* renamed from: x */
    public void mo20487x(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f16201c;
        float f2 = this.f16202d;
        float f3 = this.f16203e;
        float f4 = this.f16204f;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f = f5;
            } else if (i3 == 2) {
                f2 = f5;
            } else if (i3 == 3) {
                f3 = f5;
            } else if (i3 == 4) {
                f4 = f5;
            }
        }
        yk2 yk2 = this.f16196a;
        if (yk2 != null) {
            float s = yk2.mo27566s();
            double d = (double) f;
            double d2 = (double) f2;
            f2 = (float) ((((double) this.f16196a.mo27567t()) - (d * Math.cos(d2))) - ((double) (f4 / 2.0f)));
            f = (float) ((((double) s) + (Math.sin(d2) * d)) - ((double) (f3 / 2.0f)));
        }
        float f6 = f3 + f;
        float f7 = f4 + f2;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        int i4 = i + 1;
        fArr[i] = f + 0.0f;
        int i5 = i4 + 1;
        fArr[i4] = f2 + 0.0f;
        int i6 = i5 + 1;
        fArr[i5] = f6 + 0.0f;
        int i7 = i6 + 1;
        fArr[i6] = f2 + 0.0f;
        int i8 = i7 + 1;
        fArr[i7] = f6 + 0.0f;
        int i9 = i8 + 1;
        fArr[i8] = f7 + 0.0f;
        fArr[i9] = f + 0.0f;
        fArr[i9 + 1] = f7 + 0.0f;
    }

    /* renamed from: y */
    public boolean mo20488y(String str) {
        return this.f16197a.containsKey(str);
    }

    /* renamed from: z */
    public void mo20489z(il2 il2, ml2 ml2, ml2 ml22) {
        il2 il22 = il2;
        ml2 ml23 = ml2;
        ml2 ml24 = ml22;
        float f = ((float) il22.f12142g) / 100.0f;
        this.f16194a = f;
        this.f16208n = il22.f13748m;
        float f2 = Float.isNaN(il22.f13738a) ? f : il22.f13738a;
        float f3 = Float.isNaN(il22.f13739b) ? f : il22.f13739b;
        float f4 = ml24.f16203e;
        float f5 = ml23.f16203e;
        float f6 = ml24.f16204f;
        float f7 = ml23.f16204f;
        this.f16199b = this.f16194a;
        float f8 = ml23.f16201c;
        float f9 = ml23.f16202d;
        float f10 = (ml24.f16201c + (f4 / 2.0f)) - ((f5 / 2.0f) + f8);
        float f11 = (ml24.f16202d + (f6 / 2.0f)) - (f9 + (f7 / 2.0f));
        float f12 = (f4 - f5) * f2;
        float f13 = f12 / 2.0f;
        this.f16201c = (float) ((int) ((f8 + (f10 * f)) - f13));
        float f14 = (f6 - f7) * f3;
        float f15 = f14 / 2.0f;
        this.f16202d = (float) ((int) ((f9 + (f11 * f)) - f15));
        this.f16203e = (float) ((int) (f5 + f12));
        this.f16204f = (float) ((int) (f7 + f14));
        il2 il23 = il2;
        float f16 = Float.isNaN(il23.f13740c) ? f : il23.f13740c;
        float f17 = 0.0f;
        float f18 = Float.isNaN(il23.f13743f) ? 0.0f : il23.f13743f;
        if (!Float.isNaN(il23.f13741d)) {
            f = il23.f13741d;
        }
        if (!Float.isNaN(il23.f13742e)) {
            f17 = il23.f13742e;
        }
        this.f16211q = 0;
        ml2 ml25 = ml2;
        this.f16201c = (float) ((int) (((ml25.f16201c + (f16 * f10)) + (f17 * f11)) - f13));
        this.f16202d = (float) ((int) (((ml25.f16202d + (f10 * f18)) + (f11 * f)) - f15));
        this.f16195a = ur0.m29534c(il23.f13750n);
        this.f16209o = il23.f13747l;
    }
}
