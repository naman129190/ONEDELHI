package com.onedelhi.secure;

import android.graphics.Bitmap;
import android.graphics.Color;
import com.google.android.gms.maps.model.LatLng;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class el1 implements od4 {

    /* renamed from: a */
    public static final float[] f27966a;

    /* renamed from: b */
    public static final double f27967b = 0.7d;

    /* renamed from: b */
    public static final int f27968b = 20;

    /* renamed from: b */
    public static final di1 f27969b;

    /* renamed from: b */
    public static final int[] f27970b;

    /* renamed from: c */
    public static final double f27971c = 1.0d;

    /* renamed from: c */
    public static final int f27972c = 512;

    /* renamed from: d */
    public static final int f27973d = 1280;

    /* renamed from: e */
    public static final int f27974e = 5;

    /* renamed from: f */
    public static final int f27975f = 11;

    /* renamed from: g */
    public static final int f27976g = 22;

    /* renamed from: h */
    public static final int f27977h = 10;

    /* renamed from: i */
    public static final int f27978i = 50;

    /* renamed from: a */
    public double f27979a;

    /* renamed from: a */
    public int f27980a;

    /* renamed from: a */
    public a33<ax4> f27981a;

    /* renamed from: a */
    public di1 f27982a;

    /* renamed from: a */
    public C7273xn f27983a;

    /* renamed from: a */
    public Collection<ax4> f27984a;

    /* renamed from: a */
    public double[] f27985a;

    /* renamed from: a */
    public int[] f27986a;

    /* renamed from: b */
    public double[] f27987b;

    /* renamed from: com.onedelhi.secure.el1$b */
    public static class C5162b {

        /* renamed from: a */
        public double f27988a = 0.7d;

        /* renamed from: a */
        public int f27989a = 20;

        /* renamed from: a */
        public di1 f27990a = el1.f27969b;

        /* renamed from: a */
        public Collection<ax4> f27991a;

        /* renamed from: e */
        public el1 mo35462e() {
            if (this.f27991a != null) {
                return new el1(this);
            }
            throw new IllegalStateException("No input data: you must use either .data or .weightedData before building");
        }

        /* renamed from: f */
        public C5162b mo35463f(Collection<LatLng> collection) {
            return mo35467j(el1.m46984o(collection));
        }

        /* renamed from: g */
        public C5162b mo35464g(di1 di1) {
            this.f27990a = di1;
            return this;
        }

        /* renamed from: h */
        public C5162b mo35465h(double d) {
            this.f27988a = d;
            if (d >= 0.0d && d <= 1.0d) {
                return this;
            }
            throw new IllegalArgumentException("Opacity must be in range [0, 1]");
        }

        /* renamed from: i */
        public C5162b mo35466i(int i) {
            this.f27989a = i;
            if (i >= 10 && i <= 50) {
                return this;
            }
            throw new IllegalArgumentException("Radius not within bounds.");
        }

        /* renamed from: j */
        public C5162b mo35467j(Collection<ax4> collection) {
            this.f27991a = collection;
            if (!collection.isEmpty()) {
                return this;
            }
            throw new IllegalArgumentException("No input points.");
        }
    }

    static {
        int[] iArr = {Color.rgb(102, 225, 0), Color.rgb(255, 0, 0)};
        f27970b = iArr;
        float[] fArr = {0.2f, 1.0f};
        f27966a = fArr;
        f27969b = new di1(iArr, fArr);
    }

    public el1(C5162b bVar) {
        this.f27984a = bVar.f27991a;
        this.f27980a = bVar.f27989a;
        this.f27982a = bVar.f27990a;
        this.f27979a = bVar.f27988a;
        int i = this.f27980a;
        this.f27985a = m46981f(i, ((double) i) / 3.0d);
        mo35458k(this.f27982a);
        mo35461n(this.f27984a);
    }

    /* renamed from: c */
    public static Bitmap m46978c(double[][] dArr, int[] iArr, double d) {
        double[][] dArr2 = dArr;
        int[] iArr2 = iArr;
        int i = iArr2[iArr2.length - 1];
        double length = ((double) (iArr2.length - 1)) / d;
        int length2 = dArr2.length;
        int[] iArr3 = new int[(length2 * length2)];
        for (int i2 = 0; i2 < length2; i2++) {
            for (int i3 = 0; i3 < length2; i3++) {
                double d2 = dArr2[i3][i2];
                int i4 = (i2 * length2) + i3;
                int i5 = (int) (d2 * length);
                if (d2 == 0.0d) {
                    iArr3[i4] = 0;
                } else if (i5 < iArr2.length) {
                    iArr3[i4] = iArr2[i5];
                } else {
                    iArr3[i4] = i;
                }
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(length2, length2, Bitmap.Config.ARGB_8888);
        createBitmap.setPixels(iArr3, 0, length2, 0, 0, length2, length2);
        return createBitmap;
    }

    /* renamed from: d */
    public static kd4 m46979d(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return new kd4(512, 512, byteArrayOutputStream.toByteArray());
    }

    /* renamed from: e */
    public static double[][] m46980e(double[][] dArr, double[] dArr2) {
        double[][] dArr3 = dArr;
        double[] dArr4 = dArr2;
        Class<double> cls = double.class;
        int floor = (int) Math.floor(((double) dArr4.length) / 2.0d);
        int length = dArr3.length;
        int i = length - (floor * 2);
        int i2 = 1;
        int i3 = (floor + i) - 1;
        int[] iArr = new int[2];
        iArr[1] = length;
        iArr[0] = length;
        double[][] dArr5 = (double[][]) Array.newInstance(cls, iArr);
        int i4 = 0;
        while (true) {
            double d = 0.0d;
            if (i4 >= length) {
                break;
            }
            int i5 = 0;
            while (i5 < length) {
                double d2 = dArr3[i4][i5];
                if (d2 != d) {
                    int i6 = i4 + floor;
                    if (i3 < i6) {
                        i6 = i3;
                    }
                    int i7 = i6 + 1;
                    int i8 = i4 - floor;
                    for (int i9 = floor > i8 ? floor : i8; i9 < i7; i9++) {
                        double[] dArr6 = dArr5[i9];
                        dArr6[i5] = dArr6[i5] + (dArr4[i9 - i8] * d2);
                    }
                }
                i5++;
                d = 0.0d;
            }
            i4++;
        }
        int[] iArr2 = new int[2];
        iArr2[1] = i;
        iArr2[0] = i;
        double[][] dArr7 = (double[][]) Array.newInstance(cls, iArr2);
        int i10 = floor;
        while (i10 < i3 + 1) {
            int i11 = 0;
            while (i11 < length) {
                double d3 = dArr5[i10][i11];
                if (d3 != 0.0d) {
                    int i12 = i11 + floor;
                    if (i3 < i12) {
                        i12 = i3;
                    }
                    int i13 = i12 + i2;
                    int i14 = i11 - floor;
                    for (int i15 = floor > i14 ? floor : i14; i15 < i13; i15++) {
                        double[] dArr8 = dArr7[i10 - floor];
                        int i16 = i15 - floor;
                        dArr8[i16] = dArr8[i16] + (dArr4[i15 - i14] * d3);
                    }
                }
                i11++;
                i2 = 1;
            }
            i10++;
            i2 = 1;
        }
        return dArr7;
    }

    /* renamed from: f */
    public static double[] m46981f(int i, double d) {
        double[] dArr = new double[((i * 2) + 1)];
        for (int i2 = -i; i2 <= i; i2++) {
            dArr[i2 + i] = Math.exp(((double) ((-i2) * i2)) / ((2.0d * d) * d));
        }
        return dArr;
    }

    /* renamed from: g */
    public static C7273xn m46982g(Collection<ax4> collection) {
        Iterator<ax4> it = collection.iterator();
        ax4 next = it.next();
        double d = next.mo30451d().f36408a;
        double d2 = next.mo30451d().f36408a;
        double d3 = d;
        double d4 = d2;
        double d5 = next.mo30451d().f36409b;
        double d6 = next.mo30451d().f36409b;
        while (it.hasNext()) {
            ax4 next2 = it.next();
            double d7 = next2.mo30451d().f36408a;
            double d8 = next2.mo30451d().f36409b;
            if (d7 < d3) {
                d3 = d7;
            }
            if (d7 > d4) {
                d4 = d7;
            }
            if (d8 < d5) {
                d5 = d8;
            }
            if (d8 > d6) {
                d6 = d8;
            }
        }
        return new C7273xn(d3, d4, d5, d6);
    }

    /* renamed from: i */
    public static double m46983i(Collection<ax4> collection, C7273xn xnVar, int i, int i2) {
        C7273xn xnVar2 = xnVar;
        double d = xnVar2.f37551a;
        double d2 = xnVar2.f37553c;
        double d3 = xnVar2.f37552b;
        double d4 = d2 - d;
        double d5 = xnVar2.f37554d - d3;
        if (d4 <= d5) {
            d4 = d5;
        }
        double d6 = ((double) ((int) (((double) (i2 / (i * 2))) + 0.5d))) / d4;
        ga2 ga2 = new ga2();
        double d7 = 0.0d;
        for (ax4 next : collection) {
            double d8 = next.mo30451d().f36408a;
            int i3 = (int) ((next.mo30451d().f36409b - d3) * d6);
            long j = (long) ((int) ((d8 - d) * d6));
            ga2 ga22 = (ga2) ga2.mo16417h(j);
            if (ga22 == null) {
                ga22 = new ga2();
                ga2.mo16423n(j, ga22);
            }
            long j2 = (long) i3;
            Double d9 = (Double) ga22.mo16417h(j2);
            if (d9 == null) {
                d9 = Double.valueOf(0.0d);
            }
            Double valueOf = Double.valueOf(d9.doubleValue() + next.mo31253a());
            ga22.mo16423n(j2, valueOf);
            if (valueOf.doubleValue() > d7) {
                d7 = valueOf.doubleValue();
            }
        }
        return d7;
    }

    /* renamed from: o */
    public static Collection<ax4> m46984o(Collection<LatLng> collection) {
        ArrayList arrayList = new ArrayList();
        for (LatLng ax4 : collection) {
            arrayList.add(new ax4(ax4));
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x00a8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.onedelhi.secure.kd4 mo14091a(int r37, int r38, int r39) {
        /*
            r36 = this;
            r0 = r36
            r1 = r37
            r2 = r38
            r3 = r39
            double r4 = (double) r3
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = java.lang.Math.pow(r6, r4)
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r8 / r4
            int r10 = r0.f27980a
            double r11 = (double) r10
            double r11 = r11 * r4
            r13 = 4647714815446351872(0x4080000000000000, double:512.0)
            double r11 = r11 / r13
            double r6 = r6 * r11
            double r6 = r6 + r4
            r13 = 2
            int r10 = r10 * 2
            int r10 = r10 + 512
            double r14 = (double) r10
            double r6 = r6 / r14
            double r14 = (double) r1
            double r14 = r14 * r4
            double r14 = r14 - r11
            r10 = 1
            int r1 = r1 + r10
            double r8 = (double) r1
            double r8 = r8 * r4
            double r19 = r8 + r11
            double r8 = (double) r2
            double r8 = r8 * r4
            double r8 = r8 - r11
            int r1 = r2 + 1
            double r1 = (double) r1
            double r1 = r1 * r4
            double r1 = r1 + r11
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r21 = 0
            int r5 = (r14 > r21 ? 1 : (r14 == r21 ? 0 : -1))
            if (r5 >= 0) goto L_0x0061
            com.onedelhi.secure.xn r4 = new com.onedelhi.secure.xn
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r22 = r14 + r16
            r24 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r21 = r4
            r26 = r8
            r28 = r1
            r21.<init>(r22, r24, r26, r28)
            r16 = -4616189618054758400(0xbff0000000000000, double:-1.0)
        L_0x0058:
            com.onedelhi.secure.a33<com.onedelhi.secure.ax4> r5 = r0.f27981a
            java.util.Collection r4 = r5.mo30448f(r4)
            r25 = r16
            goto L_0x0079
        L_0x0061:
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r5 = (r19 > r16 ? 1 : (r19 == r16 ? 0 : -1))
            if (r5 <= 0) goto L_0x0077
            com.onedelhi.secure.xn r4 = new com.onedelhi.secure.xn
            r22 = 0
            double r24 = r19 - r16
            r21 = r4
            r26 = r8
            r28 = r1
            r21.<init>(r22, r24, r26, r28)
            goto L_0x0058
        L_0x0077:
            r25 = r21
        L_0x0079:
            com.onedelhi.secure.xn r5 = new com.onedelhi.secure.xn
            r16 = r5
            r17 = r14
            r21 = r8
            r23 = r1
            r16.<init>(r17, r19, r21, r23)
            com.onedelhi.secure.xn r1 = new com.onedelhi.secure.xn
            com.onedelhi.secure.xn r2 = r0.f27983a
            double r13 = r2.f37551a
            double r28 = r13 - r11
            double r13 = r2.f37553c
            double r30 = r13 + r11
            double r13 = r2.f37552b
            double r32 = r13 - r11
            double r13 = r2.f37554d
            double r34 = r13 + r11
            r27 = r1
            r27.<init>(r28, r30, r32, r34)
            boolean r1 = r5.mo47369e(r1)
            if (r1 != 0) goto L_0x00a8
            com.onedelhi.secure.kd4 r1 = com.onedelhi.secure.od4.f17919a
            return r1
        L_0x00a8:
            com.onedelhi.secure.a33<com.onedelhi.secure.ax4> r1 = r0.f27981a
            java.util.Collection r1 = r1.mo30448f(r5)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x00b7
            com.onedelhi.secure.kd4 r1 = com.onedelhi.secure.od4.f17919a
            return r1
        L_0x00b7:
            int r2 = r0.f27980a
            int r5 = r2 * 2
            int r5 = r5 + 512
            r11 = 2
            int r2 = r2 * 2
            int r2 = r2 + 512
            int[] r11 = new int[r11]
            r11[r10] = r2
            r2 = 0
            r11[r2] = r5
            java.lang.Class<double> r2 = double.class
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r2, r11)
            double[][] r2 = (double[][]) r2
            java.util.Iterator r1 = r1.iterator()
        L_0x00d5:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x00fc
            java.lang.Object r5 = r1.next()
            com.onedelhi.secure.ax4 r5 = (com.onedelhi.secure.ax4) r5
            com.onedelhi.secure.v23 r10 = r5.mo30451d()
            double r11 = r10.f36408a
            double r11 = r11 - r17
            double r11 = r11 / r6
            int r11 = (int) r11
            double r12 = r10.f36409b
            double r12 = r12 - r8
            double r12 = r12 / r6
            int r10 = (int) r12
            r11 = r2[r11]
            r12 = r11[r10]
            double r14 = r5.mo31253a()
            double r12 = r12 + r14
            r11[r10] = r12
            goto L_0x00d5
        L_0x00fc:
            java.util.Iterator r1 = r4.iterator()
        L_0x0100:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0129
            java.lang.Object r4 = r1.next()
            com.onedelhi.secure.ax4 r4 = (com.onedelhi.secure.ax4) r4
            com.onedelhi.secure.v23 r5 = r4.mo30451d()
            double r10 = r5.f36408a
            double r10 = r10 + r25
            double r10 = r10 - r17
            double r10 = r10 / r6
            int r10 = (int) r10
            double r11 = r5.f36409b
            double r11 = r11 - r8
            double r11 = r11 / r6
            int r5 = (int) r11
            r10 = r2[r10]
            r11 = r10[r5]
            double r13 = r4.mo31253a()
            double r11 = r11 + r13
            r10[r5] = r11
            goto L_0x0100
        L_0x0129:
            double[] r1 = r0.f27985a
            double[][] r1 = m46980e(r2, r1)
            int[] r2 = r0.f27986a
            double[] r4 = r0.f27987b
            r3 = r4[r3]
            android.graphics.Bitmap r1 = m46978c(r1, r2, r3)
            com.onedelhi.secure.kd4 r1 = m46979d(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.el1.mo14091a(int, int, int):com.onedelhi.secure.kd4");
    }

    /* renamed from: h */
    public final double[] mo35456h(int i) {
        int i2;
        double[] dArr = new double[22];
        int i3 = 5;
        while (true) {
            if (i3 >= 11) {
                break;
            }
            dArr[i3] = m46983i(this.f27984a, this.f27983a, i, (int) (Math.pow(2.0d, (double) (i3 - 3)) * 1280.0d));
            if (i3 == 5) {
                for (int i4 = 0; i4 < i3; i4++) {
                    dArr[i4] = dArr[i3];
                }
            }
            i3++;
        }
        for (i2 = 11; i2 < 22; i2++) {
            dArr[i2] = dArr[10];
        }
        return dArr;
    }

    /* renamed from: j */
    public void mo35457j(Collection<LatLng> collection) {
        mo35461n(m46984o(collection));
    }

    /* renamed from: k */
    public void mo35458k(di1 di1) {
        this.f27982a = di1;
        this.f27986a = di1.mo34470b(this.f27979a);
    }

    /* renamed from: l */
    public void mo35459l(double d) {
        this.f27979a = d;
        mo35458k(this.f27982a);
    }

    /* renamed from: m */
    public void mo35460m(int i) {
        this.f27980a = i;
        this.f27985a = m46981f(i, ((double) i) / 3.0d);
        this.f27987b = mo35456h(this.f27980a);
    }

    /* renamed from: n */
    public void mo35461n(Collection<ax4> collection) {
        this.f27984a = collection;
        if (!collection.isEmpty()) {
            C7273xn g = m46982g(this.f27984a);
            this.f27983a = g;
            this.f27981a = new a33<>(g);
            for (ax4 a : this.f27984a) {
                this.f27981a.mo30443a(a);
            }
            this.f27987b = mo35456h(this.f27980a);
            return;
        }
        throw new IllegalArgumentException("No input points.");
    }
}
