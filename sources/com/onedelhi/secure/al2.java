package com.onedelhi.secure;

import java.util.HashSet;
import java.util.LinkedHashMap;

public class al2 implements Comparable<al2> {

    /* renamed from: a */
    public static String[] f9368a = {"position", "x", "y", yz1.f38148j, "height", "pathRotate"};

    /* renamed from: b */
    public static final String f9369b = "MotionPaths";

    /* renamed from: c */
    public static final boolean f9370c = false;

    /* renamed from: s */
    public static final int f9371s = 1;

    /* renamed from: t */
    public static final int f9372t = 2;

    /* renamed from: a */
    public float f9373a = 1.0f;

    /* renamed from: a */
    public ur0 f9374a;

    /* renamed from: a */
    public LinkedHashMap<String, qc0> f9375a = new LinkedHashMap<>();

    /* renamed from: a */
    public double[] f9376a = new double[18];

    /* renamed from: b */
    public float f9377b = 0.0f;

    /* renamed from: b */
    public boolean f9378b = false;

    /* renamed from: b */
    public double[] f9379b = new double[18];

    /* renamed from: c */
    public float f9380c = 0.0f;

    /* renamed from: d */
    public float f9381d = 0.0f;

    /* renamed from: e */
    public float f9382e = 0.0f;

    /* renamed from: f */
    public float f9383f = 1.0f;

    /* renamed from: g */
    public float f9384g = 1.0f;

    /* renamed from: h */
    public float f9385h = Float.NaN;

    /* renamed from: i */
    public float f9386i = Float.NaN;

    /* renamed from: j */
    public float f9387j = 0.0f;

    /* renamed from: k */
    public float f9388k = 0.0f;

    /* renamed from: l */
    public float f9389l = 0.0f;

    /* renamed from: m */
    public float f9390m;

    /* renamed from: n */
    public float f9391n;

    /* renamed from: n */
    public int f9392n = 0;

    /* renamed from: o */
    public float f9393o;

    /* renamed from: o */
    public int f9394o;

    /* renamed from: p */
    public float f9395p;

    /* renamed from: p */
    public int f9396p = 0;

    /* renamed from: q */
    public float f9397q;

    /* renamed from: q */
    public int f9398q = -1;

    /* renamed from: r */
    public float f9399r = Float.NaN;

    /* renamed from: r */
    public int f9400r = 0;

    /* renamed from: s */
    public float f9401s = Float.NaN;

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x014b, code lost:
        r2.mo13827g(r9, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01bb, code lost:
        r2.mo13827g(r9, r6);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13159a(java.util.HashMap<java.lang.String, com.onedelhi.secure.x14> r8, int r9) {
        /*
            r7 = this;
            java.util.Set r0 = r8.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01d8
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r8.get(r1)
            com.onedelhi.secure.x14 r2 = (com.onedelhi.secure.x14) r2
            r1.hashCode()
            r3 = -1
            int r4 = r1.hashCode()
            r5 = 1
            switch(r4) {
                case -1249320806: goto L_0x00bb;
                case -1249320805: goto L_0x00b0;
                case -1249320804: goto L_0x00a5;
                case -1225497657: goto L_0x009a;
                case -1225497656: goto L_0x008f;
                case -1225497655: goto L_0x0084;
                case -1001078227: goto L_0x0079;
                case -987906986: goto L_0x006e;
                case -987906985: goto L_0x0060;
                case -908189618: goto L_0x0052;
                case -908189617: goto L_0x0044;
                case 92909918: goto L_0x0036;
                case 803192288: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x00c5
        L_0x0028:
            java.lang.String r4 = "pathRotate"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0032
            goto L_0x00c5
        L_0x0032:
            r3 = 12
            goto L_0x00c5
        L_0x0036:
            java.lang.String r4 = "alpha"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0040
            goto L_0x00c5
        L_0x0040:
            r3 = 11
            goto L_0x00c5
        L_0x0044:
            java.lang.String r4 = "scaleY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x004e
            goto L_0x00c5
        L_0x004e:
            r3 = 10
            goto L_0x00c5
        L_0x0052:
            java.lang.String r4 = "scaleX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x005c
            goto L_0x00c5
        L_0x005c:
            r3 = 9
            goto L_0x00c5
        L_0x0060:
            java.lang.String r4 = "pivotY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x006a
            goto L_0x00c5
        L_0x006a:
            r3 = 8
            goto L_0x00c5
        L_0x006e:
            java.lang.String r4 = "pivotX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0077
            goto L_0x00c5
        L_0x0077:
            r3 = 7
            goto L_0x00c5
        L_0x0079:
            java.lang.String r4 = "progress"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0082
            goto L_0x00c5
        L_0x0082:
            r3 = 6
            goto L_0x00c5
        L_0x0084:
            java.lang.String r4 = "translationZ"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x008d
            goto L_0x00c5
        L_0x008d:
            r3 = 5
            goto L_0x00c5
        L_0x008f:
            java.lang.String r4 = "translationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0098
            goto L_0x00c5
        L_0x0098:
            r3 = 4
            goto L_0x00c5
        L_0x009a:
            java.lang.String r4 = "translationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00a3
            goto L_0x00c5
        L_0x00a3:
            r3 = 3
            goto L_0x00c5
        L_0x00a5:
            java.lang.String r4 = "rotationZ"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00ae
            goto L_0x00c5
        L_0x00ae:
            r3 = 2
            goto L_0x00c5
        L_0x00b0:
            java.lang.String r4 = "rotationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00b9
            goto L_0x00c5
        L_0x00b9:
            r3 = 1
            goto L_0x00c5
        L_0x00bb:
            java.lang.String r4 = "rotationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00c4
            goto L_0x00c5
        L_0x00c4:
            r3 = 0
        L_0x00c5:
            r4 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            switch(r3) {
                case 0: goto L_0x01cc;
                case 1: goto L_0x01c0;
                case 2: goto L_0x01b0;
                case 3: goto L_0x01a4;
                case 4: goto L_0x0198;
                case 5: goto L_0x018c;
                case 6: goto L_0x0180;
                case 7: goto L_0x0174;
                case 8: goto L_0x0168;
                case 9: goto L_0x015c;
                case 10: goto L_0x0150;
                case 11: goto L_0x0140;
                case 12: goto L_0x0132;
                default: goto L_0x00cb;
            }
        L_0x00cb:
            java.lang.String r3 = "CUSTOM"
            boolean r3 = r1.startsWith(r3)
            java.lang.String r4 = "MotionPaths"
            if (r3 == 0) goto L_0x0120
            java.lang.String r3 = ","
            java.lang.String[] r3 = r1.split(r3)
            r3 = r3[r5]
            java.util.LinkedHashMap<java.lang.String, com.onedelhi.secure.qc0> r5 = r7.f9375a
            boolean r5 = r5.containsKey(r3)
            if (r5 == 0) goto L_0x0008
            java.util.LinkedHashMap<java.lang.String, com.onedelhi.secure.qc0> r5 = r7.f9375a
            java.lang.Object r3 = r5.get(r3)
            com.onedelhi.secure.qc0 r3 = (com.onedelhi.secure.qc0) r3
            boolean r5 = r2 instanceof com.onedelhi.secure.x14.C3889c
            if (r5 == 0) goto L_0x00f8
            com.onedelhi.secure.x14$c r2 = (com.onedelhi.secure.x14.C3889c) r2
            r2.mo26756k(r9, r3)
            goto L_0x0008
        L_0x00f8:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            java.lang.String r1 = " ViewSpline not a CustomSet frame = "
            r5.append(r1)
            r5.append(r9)
            java.lang.String r1 = ", value"
            r5.append(r1)
            float r1 = r3.mo23086n()
            r5.append(r1)
            r5.append(r2)
            java.lang.String r1 = r5.toString()
        L_0x011b:
            com.onedelhi.secure.xq4.m31634f(r4, r1)
            goto L_0x0008
        L_0x0120:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "UNKNOWN spline "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            goto L_0x011b
        L_0x0132:
            float r1 = r7.f9399r
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x013c
            goto L_0x01bb
        L_0x013c:
            float r6 = r7.f9399r
            goto L_0x01bb
        L_0x0140:
            float r1 = r7.f9373a
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0149
            goto L_0x014b
        L_0x0149:
            float r4 = r7.f9373a
        L_0x014b:
            r2.mo13827g(r9, r4)
            goto L_0x0008
        L_0x0150:
            float r1 = r7.f9384g
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0159
            goto L_0x014b
        L_0x0159:
            float r4 = r7.f9384g
            goto L_0x014b
        L_0x015c:
            float r1 = r7.f9383f
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0165
            goto L_0x014b
        L_0x0165:
            float r4 = r7.f9383f
            goto L_0x014b
        L_0x0168:
            float r1 = r7.f9386i
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0171
            goto L_0x01bb
        L_0x0171:
            float r6 = r7.f9386i
            goto L_0x01bb
        L_0x0174:
            float r1 = r7.f9385h
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x017d
            goto L_0x01bb
        L_0x017d:
            float r6 = r7.f9385h
            goto L_0x01bb
        L_0x0180:
            float r1 = r7.f9401s
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0189
            goto L_0x01bb
        L_0x0189:
            float r6 = r7.f9401s
            goto L_0x01bb
        L_0x018c:
            float r1 = r7.f9389l
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x0195
            goto L_0x01bb
        L_0x0195:
            float r6 = r7.f9389l
            goto L_0x01bb
        L_0x0198:
            float r1 = r7.f9388k
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x01a1
            goto L_0x01bb
        L_0x01a1:
            float r6 = r7.f9388k
            goto L_0x01bb
        L_0x01a4:
            float r1 = r7.f9387j
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x01ad
            goto L_0x01bb
        L_0x01ad:
            float r6 = r7.f9387j
            goto L_0x01bb
        L_0x01b0:
            float r1 = r7.f9380c
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x01b9
            goto L_0x01bb
        L_0x01b9:
            float r6 = r7.f9380c
        L_0x01bb:
            r2.mo13827g(r9, r6)
            goto L_0x0008
        L_0x01c0:
            float r1 = r7.f9382e
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x01c9
            goto L_0x01bb
        L_0x01c9:
            float r6 = r7.f9382e
            goto L_0x01bb
        L_0x01cc:
            float r1 = r7.f9381d
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x01d5
            goto L_0x01bb
        L_0x01d5:
            float r6 = r7.f9381d
            goto L_0x01bb
        L_0x01d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.al2.mo13159a(java.util.HashMap, int):void");
    }

    /* renamed from: b */
    public void mo13160b(ql2 ql2) {
        this.f9394o = ql2.mo23202B();
        this.f9373a = ql2.mo23202B() != 4 ? 0.0f : ql2.mo23230g();
        this.f9378b = false;
        this.f9380c = ql2.mo23243t();
        this.f9381d = ql2.mo23241r();
        this.f9382e = ql2.mo23242s();
        this.f9383f = ql2.mo23245u();
        this.f9384g = ql2.mo23246v();
        this.f9385h = ql2.mo23238o();
        this.f9386i = ql2.mo23239p();
        this.f9387j = ql2.mo23248x();
        this.f9388k = ql2.mo23249y();
        this.f9389l = ql2.mo23250z();
        for (String next : ql2.mo23233j()) {
            qc0 i = ql2.mo23232i(next);
            if (i != null && i.mo23088q()) {
                this.f9375a.put(next, i);
            }
        }
    }

    /* renamed from: e */
    public int compareTo(al2 al2) {
        return Float.compare(this.f9390m, al2.f9390m);
    }

    /* renamed from: g */
    public final boolean mo13163g(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    /* renamed from: l */
    public void mo13164l(al2 al2, HashSet<String> hashSet) {
        if (mo13163g(this.f9373a, al2.f9373a)) {
            hashSet.add("alpha");
        }
        if (mo13163g(this.f9377b, al2.f9377b)) {
            hashSet.add("translationZ");
        }
        int i = this.f9394o;
        int i2 = al2.f9394o;
        if (i != i2 && this.f9392n == 0 && (i == 4 || i2 == 4)) {
            hashSet.add("alpha");
        }
        if (mo13163g(this.f9380c, al2.f9380c)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.f9399r) || !Float.isNaN(al2.f9399r)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.f9401s) || !Float.isNaN(al2.f9401s)) {
            hashSet.add("progress");
        }
        if (mo13163g(this.f9381d, al2.f9381d)) {
            hashSet.add("rotationX");
        }
        if (mo13163g(this.f9382e, al2.f9382e)) {
            hashSet.add("rotationY");
        }
        if (mo13163g(this.f9385h, al2.f9385h)) {
            hashSet.add("pivotX");
        }
        if (mo13163g(this.f9386i, al2.f9386i)) {
            hashSet.add("pivotY");
        }
        if (mo13163g(this.f9383f, al2.f9383f)) {
            hashSet.add("scaleX");
        }
        if (mo13163g(this.f9384g, al2.f9384g)) {
            hashSet.add("scaleY");
        }
        if (mo13163g(this.f9387j, al2.f9387j)) {
            hashSet.add("translationX");
        }
        if (mo13163g(this.f9388k, al2.f9388k)) {
            hashSet.add("translationY");
        }
        if (mo13163g(this.f9389l, al2.f9389l)) {
            hashSet.add("translationZ");
        }
        if (mo13163g(this.f9377b, al2.f9377b)) {
            hashSet.add("elevation");
        }
    }

    /* renamed from: q */
    public void mo13165q(al2 al2, boolean[] zArr, String[] strArr) {
        zArr[0] = zArr[0] | mo13163g(this.f9390m, al2.f9390m);
        zArr[1] = zArr[1] | mo13163g(this.f9391n, al2.f9391n);
        zArr[2] = zArr[2] | mo13163g(this.f9393o, al2.f9393o);
        zArr[3] = zArr[3] | mo13163g(this.f9395p, al2.f9395p);
        zArr[4] = mo13163g(this.f9397q, al2.f9397q) | zArr[4];
    }

    /* renamed from: r */
    public void mo13166r(double[] dArr, int[] iArr) {
        float[] fArr = {this.f9390m, this.f9391n, this.f9393o, this.f9395p, this.f9397q, this.f9373a, this.f9377b, this.f9380c, this.f9381d, this.f9382e, this.f9383f, this.f9384g, this.f9385h, this.f9386i, this.f9387j, this.f9388k, this.f9389l, this.f9399r};
        int i = 0;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] < 18) {
                dArr[i] = (double) fArr[iArr[i2]];
                i++;
            }
        }
    }

    /* renamed from: s */
    public int mo13167s(String str, double[] dArr, int i) {
        qc0 qc0 = this.f9375a.get(str);
        if (qc0.mo23089r() == 1) {
            dArr[i] = (double) qc0.mo23086n();
            return 1;
        }
        int r = qc0.mo23089r();
        float[] fArr = new float[r];
        qc0.mo23087o(fArr);
        int i2 = 0;
        while (i2 < r) {
            dArr[i] = (double) fArr[i2];
            i2++;
            i++;
        }
        return r;
    }

    /* renamed from: t */
    public int mo13168t(String str) {
        return this.f9375a.get(str).mo23089r();
    }

    /* renamed from: u */
    public boolean mo13169u(String str) {
        return this.f9375a.containsKey(str);
    }

    /* renamed from: v */
    public void mo13170v(float f, float f2, float f3, float f4) {
        this.f9391n = f;
        this.f9393o = f2;
        this.f9395p = f3;
        this.f9397q = f4;
    }

    /* renamed from: w */
    public void mo13171w(ql2 ql2) {
        mo13170v((float) ql2.mo23205E(), (float) ql2.mo23206F(), (float) ql2.mo23204D(), (float) ql2.mo23234k());
        mo13160b(ql2);
    }

    /* renamed from: x */
    public void mo13172x(ng3 ng3, ql2 ql2, int i, float f) {
        float f2;
        mo13170v((float) ng3.f17423b, (float) ng3.f17425d, (float) ng3.mo21266b(), (float) ng3.mo21265a());
        mo13160b(ql2);
        this.f9385h = Float.NaN;
        this.f9386i = Float.NaN;
        if (i == 1) {
            f2 = f - 90.0f;
        } else if (i == 2) {
            f2 = f + 90.0f;
        } else {
            return;
        }
        this.f9380c = f2;
    }
}
