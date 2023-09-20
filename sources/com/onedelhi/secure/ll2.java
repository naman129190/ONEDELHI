package com.onedelhi.secure;

import android.view.View;
import androidx.constraintlayout.widget.C0419a;
import androidx.constraintlayout.widget.C0426d;
import java.util.Arrays;
import java.util.LinkedHashMap;

public class ll2 implements Comparable<ll2> {

    /* renamed from: A */
    public static final int f15465A = 2;

    /* renamed from: a */
    public static String[] f15466a = {"position", "x", "y", yz1.f38148j, "height", "pathRotate"};

    /* renamed from: b */
    public static final String f15467b = "MotionPaths";

    /* renamed from: b */
    public static final boolean f15468b = false;

    /* renamed from: c */
    public static final boolean f15469c = false;

    /* renamed from: s */
    public static final int f15470s = 0;

    /* renamed from: t */
    public static final int f15471t = 1;

    /* renamed from: u */
    public static final int f15472u = 2;

    /* renamed from: v */
    public static final int f15473v = 3;

    /* renamed from: w */
    public static final int f15474w = 4;

    /* renamed from: x */
    public static final int f15475x = 5;

    /* renamed from: y */
    public static final int f15476y = 1;

    /* renamed from: z */
    public static final int f15477z = 0;

    /* renamed from: a */
    public float f15478a;

    /* renamed from: a */
    public cl2 f15479a;

    /* renamed from: a */
    public ur0 f15480a;

    /* renamed from: a */
    public LinkedHashMap<String, C0419a> f15481a;

    /* renamed from: a */
    public double[] f15482a;

    /* renamed from: b */
    public float f15483b;

    /* renamed from: b */
    public double[] f15484b;

    /* renamed from: c */
    public float f15485c;

    /* renamed from: d */
    public float f15486d;

    /* renamed from: e */
    public float f15487e;

    /* renamed from: f */
    public float f15488f;

    /* renamed from: g */
    public float f15489g = Float.NaN;

    /* renamed from: h */
    public float f15490h = Float.NaN;

    /* renamed from: i */
    public float f15491i;

    /* renamed from: n */
    public int f15492n = 0;

    /* renamed from: o */
    public int f15493o;

    /* renamed from: p */
    public int f15494p;

    /* renamed from: q */
    public int f15495q;

    /* renamed from: r */
    public int f15496r;

    public ll2() {
        int i = ly1.f15666d;
        this.f15493o = i;
        this.f15494p = i;
        this.f15491i = Float.NaN;
        this.f15479a = null;
        this.f15481a = new LinkedHashMap<>();
        this.f15495q = 0;
        this.f15482a = new double[18];
        this.f15484b = new double[18];
    }

    public ll2(int i, int i2, zy1 zy1, ll2 ll2, ll2 ll22) {
        int i3 = ly1.f15666d;
        this.f15493o = i3;
        this.f15494p = i3;
        this.f15491i = Float.NaN;
        this.f15479a = null;
        this.f15481a = new LinkedHashMap<>();
        this.f15495q = 0;
        this.f15482a = new double[18];
        this.f15484b = new double[18];
        if (ll2.f15494p != ly1.f15666d) {
            mo19675B(i, i2, zy1, ll2, ll22);
            return;
        }
        int i4 = zy1.f23966h;
        if (i4 == 1) {
            mo19674A(zy1, ll2, ll22);
        } else if (i4 != 2) {
            mo19696z(zy1, ll2, ll22);
        } else {
            mo19676C(i, i2, zy1, ll2, ll22);
        }
    }

    /* renamed from: H */
    public static final float m20808H(float f, float f2, float f3, float f4, float f5, float f6) {
        return (((f5 - f3) * f2) - ((f6 - f4) * f)) + f3;
    }

    /* renamed from: I */
    public static final float m20809I(float f, float f2, float f3, float f4, float f5, float f6) {
        return ((f5 - f3) * f) + ((f6 - f4) * f2) + f4;
    }

    /* renamed from: A */
    public void mo19674A(zy1 zy1, ll2 ll2, ll2 ll22) {
        zy1 zy12 = zy1;
        ll2 ll23 = ll2;
        ll2 ll24 = ll22;
        float f = ((float) zy12.f15688a) / 100.0f;
        this.f15478a = f;
        this.f15492n = zy12.f23964g;
        float f2 = Float.isNaN(zy12.f23957b) ? f : zy12.f23957b;
        float f3 = Float.isNaN(zy12.f23958c) ? f : zy12.f23958c;
        float f4 = ll24.f15487e - ll23.f15487e;
        float f5 = ll24.f15488f - ll23.f15488f;
        this.f15483b = this.f15478a;
        if (!Float.isNaN(zy12.f23959d)) {
            f = zy12.f23959d;
        }
        float f6 = ll23.f15485c;
        float f7 = ll23.f15487e;
        float f8 = ll23.f15486d;
        float f9 = ll23.f15488f;
        float f10 = (ll24.f15485c + (ll24.f15487e / 2.0f)) - ((f7 / 2.0f) + f6);
        float f11 = (ll24.f15486d + (ll24.f15488f / 2.0f)) - ((f9 / 2.0f) + f8);
        float f12 = f10 * f;
        float f13 = f4 * f2;
        float f14 = f13 / 2.0f;
        this.f15485c = (float) ((int) ((f6 + f12) - f14));
        float f15 = f * f11;
        float f16 = f5 * f3;
        float f17 = f16 / 2.0f;
        this.f15486d = (float) ((int) ((f8 + f15) - f17));
        this.f15487e = (float) ((int) (f7 + f13));
        this.f15488f = (float) ((int) (f9 + f16));
        zy1 zy13 = zy1;
        float f18 = Float.isNaN(zy13.f23960e) ? 0.0f : zy13.f23960e;
        float f19 = (-f11) * f18;
        float f20 = f10 * f18;
        this.f15495q = 1;
        ll2 ll25 = ll2;
        this.f15485c = ((float) ((int) ((ll25.f15485c + f12) - f14))) + f19;
        this.f15486d = ((float) ((int) ((ll25.f15486d + f15) - f17))) + f20;
        this.f15494p = this.f15494p;
        this.f15480a = ur0.m29534c(zy13.f23968y);
        this.f15493o = zy13.f23962f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0068, code lost:
        if (java.lang.Float.isNaN(r9.f23960e) != false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bb, code lost:
        if (java.lang.Float.isNaN(r9.f23960e) != false) goto L_0x006d;
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19675B(int r7, int r8, com.onedelhi.secure.zy1 r9, com.onedelhi.secure.ll2 r10, com.onedelhi.secure.ll2 r11) {
        /*
            r6 = this;
            int r7 = r9.f15688a
            float r7 = (float) r7
            r8 = 1120403456(0x42c80000, float:100.0)
            float r7 = r7 / r8
            r6.f15478a = r7
            int r8 = r9.f23964g
            r6.f15492n = r8
            int r8 = r9.f23966h
            r6.f15495q = r8
            float r8 = r9.f23957b
            boolean r8 = java.lang.Float.isNaN(r8)
            if (r8 == 0) goto L_0x001a
            r8 = r7
            goto L_0x001c
        L_0x001a:
            float r8 = r9.f23957b
        L_0x001c:
            float r0 = r9.f23958c
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L_0x0026
            r0 = r7
            goto L_0x0028
        L_0x0026:
            float r0 = r9.f23958c
        L_0x0028:
            float r1 = r11.f15487e
            float r2 = r10.f15487e
            float r1 = r1 - r2
            float r3 = r11.f15488f
            float r4 = r10.f15488f
            float r3 = r3 - r4
            float r5 = r6.f15478a
            r6.f15483b = r5
            float r1 = r1 * r8
            float r2 = r2 + r1
            int r1 = (int) r2
            float r1 = (float) r1
            r6.f15487e = r1
            float r3 = r3 * r0
            float r4 = r4 + r3
            int r1 = (int) r4
            float r1 = (float) r1
            r6.f15488f = r1
            int r1 = r9.f23966h
            r2 = 1
            if (r1 == r2) goto L_0x009f
            r2 = 2
            if (r1 == r2) goto L_0x0078
            float r8 = r9.f23959d
            boolean r8 = java.lang.Float.isNaN(r8)
            if (r8 == 0) goto L_0x0056
            r8 = r7
            goto L_0x0058
        L_0x0056:
            float r8 = r9.f23959d
        L_0x0058:
            float r0 = r11.f15485c
            float r1 = r10.f15485c
            float r0 = r0 - r1
            float r8 = r8 * r0
            float r8 = r8 + r1
            r6.f15485c = r8
            float r8 = r9.f23960e
            boolean r8 = java.lang.Float.isNaN(r8)
            if (r8 == 0) goto L_0x006b
            goto L_0x006d
        L_0x006b:
            float r7 = r9.f23960e
        L_0x006d:
            float r8 = r11.f15486d
            float r11 = r10.f15486d
            float r8 = r8 - r11
            float r7 = r7 * r8
            float r7 = r7 + r11
        L_0x0075:
            r6.f15486d = r7
            goto L_0x00be
        L_0x0078:
            float r1 = r9.f23959d
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0089
            float r8 = r11.f15485c
            float r0 = r10.f15485c
            float r8 = r8 - r0
            float r8 = r8 * r7
            float r8 = r8 + r0
            goto L_0x0091
        L_0x0089:
            float r1 = r9.f23959d
            float r8 = java.lang.Math.min(r0, r8)
            float r8 = r8 * r1
        L_0x0091:
            r6.f15485c = r8
            float r8 = r9.f23960e
            boolean r8 = java.lang.Float.isNaN(r8)
            if (r8 == 0) goto L_0x009c
            goto L_0x006d
        L_0x009c:
            float r7 = r9.f23960e
            goto L_0x0075
        L_0x009f:
            float r8 = r9.f23959d
            boolean r8 = java.lang.Float.isNaN(r8)
            if (r8 == 0) goto L_0x00a9
            r8 = r7
            goto L_0x00ab
        L_0x00a9:
            float r8 = r9.f23959d
        L_0x00ab:
            float r0 = r11.f15485c
            float r1 = r10.f15485c
            float r0 = r0 - r1
            float r8 = r8 * r0
            float r8 = r8 + r1
            r6.f15485c = r8
            float r8 = r9.f23960e
            boolean r8 = java.lang.Float.isNaN(r8)
            if (r8 == 0) goto L_0x006b
            goto L_0x006d
        L_0x00be:
            int r7 = r10.f15494p
            r6.f15494p = r7
            java.lang.String r7 = r9.f23968y
            com.onedelhi.secure.ur0 r7 = com.onedelhi.secure.ur0.m29534c(r7)
            r6.f15480a = r7
            int r7 = r9.f23962f
            r6.f15493o = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ll2.mo19675B(int, int, com.onedelhi.secure.zy1, com.onedelhi.secure.ll2, com.onedelhi.secure.ll2):void");
    }

    /* renamed from: C */
    public void mo19676C(int i, int i2, zy1 zy1, ll2 ll2, ll2 ll22) {
        zy1 zy12 = zy1;
        ll2 ll23 = ll2;
        ll2 ll24 = ll22;
        float f = ((float) zy12.f15688a) / 100.0f;
        this.f15478a = f;
        this.f15492n = zy12.f23964g;
        float f2 = Float.isNaN(zy12.f23957b) ? f : zy12.f23957b;
        float f3 = Float.isNaN(zy12.f23958c) ? f : zy12.f23958c;
        float f4 = ll24.f15487e;
        float f5 = ll23.f15487e;
        float f6 = ll24.f15488f;
        float f7 = ll23.f15488f;
        this.f15483b = this.f15478a;
        float f8 = ll23.f15485c;
        float f9 = ll23.f15486d;
        float f10 = ll24.f15485c + (f4 / 2.0f);
        float f11 = ll24.f15486d + (f6 / 2.0f);
        float f12 = (f4 - f5) * f2;
        this.f15485c = (float) ((int) ((f8 + ((f10 - ((f5 / 2.0f) + f8)) * f)) - (f12 / 2.0f)));
        float f13 = (f6 - f7) * f3;
        this.f15486d = (float) ((int) ((f9 + ((f11 - (f9 + (f7 / 2.0f))) * f)) - (f13 / 2.0f)));
        this.f15487e = (float) ((int) (f5 + f12));
        this.f15488f = (float) ((int) (f7 + f13));
        this.f15495q = 2;
        zy1 zy13 = zy1;
        if (!Float.isNaN(zy13.f23959d)) {
            this.f15485c = (float) ((int) (zy13.f23959d * ((float) ((int) (((float) i) - this.f15487e)))));
        }
        if (!Float.isNaN(zy13.f23960e)) {
            this.f15486d = (float) ((int) (zy13.f23960e * ((float) ((int) (((float) i2) - this.f15488f)))));
        }
        this.f15494p = this.f15494p;
        this.f15480a = ur0.m29534c(zy13.f23968y);
        this.f15493o = zy13.f23962f;
    }

    /* renamed from: D */
    public void mo19677D(float f, float f2, float f3, float f4) {
        this.f15485c = f;
        this.f15486d = f2;
        this.f15487e = f3;
        this.f15488f = f4;
    }

    /* renamed from: E */
    public void mo19678E(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
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
    public void mo19679F(float f, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3, boolean z) {
        float f2;
        boolean z2;
        float f3;
        View view2 = view;
        int[] iArr2 = iArr;
        double[] dArr4 = dArr2;
        float f4 = this.f15485c;
        float f5 = this.f15486d;
        float f6 = this.f15487e;
        float f7 = this.f15488f;
        if (iArr2.length != 0 && this.f15482a.length <= iArr2[iArr2.length - 1]) {
            int i = iArr2[iArr2.length - 1] + 1;
            this.f15482a = new double[i];
            this.f15484b = new double[i];
        }
        Arrays.fill(this.f15482a, Double.NaN);
        for (int i2 = 0; i2 < iArr2.length; i2++) {
            this.f15482a[iArr2[i2]] = dArr[i2];
            this.f15484b[iArr2[i2]] = dArr4[i2];
        }
        float f8 = Float.NaN;
        int i3 = 0;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        while (true) {
            double[] dArr5 = this.f15482a;
            if (i3 >= dArr5.length) {
                break;
            }
            double d = 0.0d;
            if (!Double.isNaN(dArr5[i3]) || !(dArr3 == null || dArr3[i3] == 0.0d)) {
                if (dArr3 != null) {
                    d = dArr3[i3];
                }
                if (!Double.isNaN(this.f15482a[i3])) {
                    d = this.f15482a[i3] + d;
                }
                f3 = f8;
                float f13 = (float) d;
                float f14 = (float) this.f15484b[i3];
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
        cl2 cl2 = this.f15479a;
        if (cl2 != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            cl2.mo14237m((double) f, fArr, fArr2);
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
                z2 = false;
                dArr7[0] = (double) sin2;
                dArr7[1] = (double) cos2;
            } else {
                z2 = false;
            }
            if (!Float.isNaN(f15)) {
                view2.setRotation((float) (((double) f15) + Math.toDegrees(Math.atan2((double) cos2, (double) sin2))));
            }
            f4 = f21;
            f5 = cos;
        } else {
            float f22 = f15;
            f2 = f7;
            z2 = false;
            if (!Float.isNaN(f22)) {
                view2.setRotation((float) (((double) 0.0f) + ((double) f22) + Math.toDegrees(Math.atan2((double) (f10 + (f12 / 2.0f)), (double) (f9 + (f11 / 2.0f))))));
            }
        }
        if (view2 instanceof a81) {
            ((a81) view2).mo3135a(f4, f5, f6 + f4, f5 + f2);
            return;
        }
        float f23 = f4 + 0.5f;
        int i4 = (int) f23;
        float f24 = f5 + 0.5f;
        int i5 = (int) f24;
        int i6 = (int) (f23 + f6);
        int i7 = (int) (f24 + f2);
        int i8 = i6 - i4;
        int i9 = i7 - i5;
        if (!(i8 == view.getMeasuredWidth() && i9 == view.getMeasuredHeight())) {
            z2 = true;
        }
        if (z2 || z) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(i9, 1073741824));
        }
        view2.layout(i4, i5, i6, i7);
    }

    /* renamed from: G */
    public void mo19680G(cl2 cl2, ll2 ll2) {
        double d = (double) (((this.f15485c + (this.f15487e / 2.0f)) - ll2.f15485c) - (ll2.f15487e / 2.0f));
        double d2 = (double) (((this.f15486d + (this.f15488f / 2.0f)) - ll2.f15486d) - (ll2.f15488f / 2.0f));
        this.f15479a = cl2;
        this.f15485c = (float) Math.hypot(d2, d);
        this.f15486d = (float) (Float.isNaN(this.f15491i) ? Math.atan2(d2, d) + 1.5707963267948966d : Math.toRadians((double) this.f15491i));
    }

    /* renamed from: a */
    public void mo19681a(C0426d.C0427a aVar) {
        this.f15480a = ur0.m29534c(aVar.f2905a.f3082a);
        C0426d.C0430c cVar = aVar.f2905a;
        this.f15493o = cVar.f3088c;
        this.f15494p = cVar.f3081a;
        this.f15489g = cVar.f3084b;
        this.f15492n = cVar.f3089d;
        this.f15496r = cVar.f3085b;
        this.f15490h = aVar.f2906a.f3097b;
        this.f15491i = aVar.f2904a.f3034d;
        for (String next : aVar.f2909a.keySet()) {
            C0419a aVar2 = aVar.f2909a.get(next);
            if (aVar2 != null && aVar2.mo3315n()) {
                this.f15481a.put(next, aVar2);
            }
        }
    }

    /* renamed from: b */
    public int compareTo(@mr2 ll2 ll2) {
        return Float.compare(this.f15483b, ll2.f15483b);
    }

    /* renamed from: e */
    public void mo19684e(cl2 cl2) {
        cl2.mo14197A((double) this.f15490h);
    }

    /* renamed from: g */
    public final boolean mo19685g(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    /* renamed from: l */
    public void mo19686l(ll2 ll2, boolean[] zArr, String[] strArr, boolean z) {
        boolean g = mo19685g(this.f15485c, ll2.f15485c);
        boolean g2 = mo19685g(this.f15486d, ll2.f15486d);
        zArr[0] = zArr[0] | mo19685g(this.f15483b, ll2.f15483b);
        boolean z2 = g | g2 | z;
        zArr[1] = zArr[1] | z2;
        zArr[2] = z2 | zArr[2];
        zArr[3] = zArr[3] | mo19685g(this.f15487e, ll2.f15487e);
        zArr[4] = mo19685g(this.f15488f, ll2.f15488f) | zArr[4];
    }

    /* renamed from: q */
    public void mo19687q(double[] dArr, int[] iArr) {
        float[] fArr = {this.f15483b, this.f15485c, this.f15486d, this.f15487e, this.f15488f, this.f15489g};
        int i = 0;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] < 6) {
                dArr[i] = (double) fArr[iArr[i2]];
                i++;
            }
        }
    }

    /* renamed from: r */
    public void mo19688r(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f15487e;
        float f2 = this.f15488f;
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
    public void mo19689s(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        int[] iArr2 = iArr;
        float f = this.f15485c;
        float f2 = this.f15486d;
        float f3 = this.f15487e;
        float f4 = this.f15488f;
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
        cl2 cl2 = this.f15479a;
        if (cl2 != null) {
            float[] fArr2 = new float[2];
            cl2.mo14237m(d, fArr2, new float[2]);
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
    public void mo19690t(double d, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f;
        int[] iArr2 = iArr;
        float f2 = this.f15485c;
        float f3 = this.f15486d;
        float f4 = this.f15487e;
        float f5 = this.f15488f;
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
        cl2 cl2 = this.f15479a;
        if (cl2 != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            cl2.mo14237m(d, fArr3, fArr4);
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
    public void mo19691u(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        int[] iArr2 = iArr;
        float f = this.f15485c;
        float f2 = this.f15486d;
        float f3 = this.f15487e;
        float f4 = this.f15488f;
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
        cl2 cl2 = this.f15479a;
        if (cl2 != null) {
            float[] fArr2 = new float[2];
            cl2.mo14237m(d, fArr2, new float[2]);
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
    public int mo19692v(String str, double[] dArr, int i) {
        C0419a aVar = this.f15481a.get(str);
        int i2 = 0;
        if (aVar == null) {
            return 0;
        }
        if (aVar.mo3317p() == 1) {
            dArr[i] = (double) aVar.mo3312k();
            return 1;
        }
        int p = aVar.mo3317p();
        float[] fArr = new float[p];
        aVar.mo3313l(fArr);
        while (i2 < p) {
            dArr[i] = (double) fArr[i2];
            i2++;
            i++;
        }
        return p;
    }

    /* renamed from: w */
    public int mo19693w(String str) {
        C0419a aVar = this.f15481a.get(str);
        if (aVar == null) {
            return 0;
        }
        return aVar.mo3317p();
    }

    /* renamed from: x */
    public void mo19694x(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f15485c;
        float f2 = this.f15486d;
        float f3 = this.f15487e;
        float f4 = this.f15488f;
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
        cl2 cl2 = this.f15479a;
        if (cl2 != null) {
            float n = cl2.mo14238n();
            double d = (double) f;
            double d2 = (double) f2;
            f2 = (float) ((((double) this.f15479a.mo14239o()) - (d * Math.cos(d2))) - ((double) (f4 / 2.0f)));
            f = (float) ((((double) n) + (Math.sin(d2) * d)) - ((double) (f3 / 2.0f)));
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
    public boolean mo19695y(String str) {
        return this.f15481a.containsKey(str);
    }

    /* renamed from: z */
    public void mo19696z(zy1 zy1, ll2 ll2, ll2 ll22) {
        zy1 zy12 = zy1;
        ll2 ll23 = ll2;
        ll2 ll24 = ll22;
        float f = ((float) zy12.f15688a) / 100.0f;
        this.f15478a = f;
        this.f15492n = zy12.f23964g;
        float f2 = Float.isNaN(zy12.f23957b) ? f : zy12.f23957b;
        float f3 = Float.isNaN(zy12.f23958c) ? f : zy12.f23958c;
        float f4 = ll24.f15487e;
        float f5 = ll23.f15487e;
        float f6 = ll24.f15488f;
        float f7 = ll23.f15488f;
        this.f15483b = this.f15478a;
        float f8 = ll23.f15485c;
        float f9 = ll23.f15486d;
        float f10 = (ll24.f15485c + (f4 / 2.0f)) - ((f5 / 2.0f) + f8);
        float f11 = (ll24.f15486d + (f6 / 2.0f)) - (f9 + (f7 / 2.0f));
        float f12 = (f4 - f5) * f2;
        float f13 = f12 / 2.0f;
        this.f15485c = (float) ((int) ((f8 + (f10 * f)) - f13));
        float f14 = (f6 - f7) * f3;
        float f15 = f14 / 2.0f;
        this.f15486d = (float) ((int) ((f9 + (f11 * f)) - f15));
        this.f15487e = (float) ((int) (f5 + f12));
        this.f15488f = (float) ((int) (f7 + f14));
        zy1 zy13 = zy1;
        float f16 = Float.isNaN(zy13.f23959d) ? f : zy13.f23959d;
        float f17 = 0.0f;
        float f18 = Float.isNaN(zy13.f23963g) ? 0.0f : zy13.f23963g;
        if (!Float.isNaN(zy13.f23960e)) {
            f = zy13.f23960e;
        }
        if (!Float.isNaN(zy13.f23961f)) {
            f17 = zy13.f23961f;
        }
        this.f15495q = 0;
        ll2 ll25 = ll2;
        this.f15485c = (float) ((int) (((ll25.f15485c + (f16 * f10)) + (f17 * f11)) - f13));
        this.f15486d = (float) ((int) (((ll25.f15486d + (f10 * f18)) + (f11 * f)) - f15));
        this.f15480a = ur0.m29534c(zy13.f23968y);
        this.f15493o = zy13.f23962f;
    }
}
