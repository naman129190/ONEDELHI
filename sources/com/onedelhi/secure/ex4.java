package com.onedelhi.secure;

import com.onedelhi.secure.ak4;
import com.onedelhi.secure.ih4;
import com.onedelhi.secure.m60;
import java.util.HashMap;
import java.util.Set;

public class ex4 {

    /* renamed from: a */
    public static final boolean f11736a = true;

    /* renamed from: m */
    public static float f11737m = Float.NaN;

    /* renamed from: a */
    public float f11738a = Float.NaN;

    /* renamed from: a */
    public int f11739a = 0;

    /* renamed from: a */
    public o60 f11740a = null;

    /* renamed from: a */
    public String f11741a = null;

    /* renamed from: a */
    public final HashMap<String, qc0> f11742a = new HashMap<>();

    /* renamed from: b */
    public float f11743b = Float.NaN;

    /* renamed from: b */
    public int f11744b = 0;

    /* renamed from: c */
    public float f11745c = Float.NaN;

    /* renamed from: c */
    public int f11746c = 0;

    /* renamed from: d */
    public float f11747d = Float.NaN;

    /* renamed from: d */
    public int f11748d = 0;

    /* renamed from: e */
    public float f11749e = Float.NaN;

    /* renamed from: e */
    public int f11750e = 0;

    /* renamed from: f */
    public float f11751f = Float.NaN;

    /* renamed from: g */
    public float f11752g = Float.NaN;

    /* renamed from: h */
    public float f11753h = Float.NaN;

    /* renamed from: i */
    public float f11754i = Float.NaN;

    /* renamed from: j */
    public float f11755j = Float.NaN;

    /* renamed from: k */
    public float f11756k = Float.NaN;

    /* renamed from: l */
    public float f11757l = Float.NaN;

    public ex4() {
    }

    public ex4(ex4 ex4) {
        this.f11740a = ex4.f11740a;
        this.f11739a = ex4.f11739a;
        this.f11744b = ex4.f11744b;
        this.f11746c = ex4.f11746c;
        this.f11748d = ex4.f11748d;
        mo15626D(ex4);
    }

    public ex4(o60 o60) {
        this.f11740a = o60;
    }

    /* renamed from: a */
    public static void m14418a(StringBuilder sb, String str, float f) {
        if (!Float.isNaN(f)) {
            sb.append(str);
            sb.append(": ");
            sb.append(f);
            sb.append(",\n");
        }
    }

    /* renamed from: b */
    public static void m14419b(StringBuilder sb, String str, int i) {
        sb.append(str);
        sb.append(": ");
        sb.append(i);
        sb.append(",\n");
    }

    /* renamed from: m */
    public static float m14420m(float f, float f2, float f3, float f4) {
        boolean isNaN = Float.isNaN(f);
        boolean isNaN2 = Float.isNaN(f2);
        if (isNaN && isNaN2) {
            return Float.NaN;
        }
        if (isNaN) {
            f = f3;
        }
        if (isNaN2) {
            f2 = f3;
        }
        return f + (f4 * (f2 - f));
    }

    /* renamed from: n */
    public static void m14421n(int i, int i2, ex4 ex4, ex4 ex42, ex4 ex43, ih4 ih4, float f) {
        float f2;
        int i3;
        int i4;
        float f3;
        float f4;
        int i5;
        float f5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = i;
        int i11 = i2;
        ex4 ex44 = ex4;
        ex4 ex45 = ex42;
        ex4 ex46 = ex43;
        ih4 ih42 = ih4;
        float f6 = 100.0f * f;
        int i12 = (int) f6;
        int i13 = ex45.f11739a;
        int i14 = ex45.f11744b;
        int i15 = ex46.f11739a;
        int i16 = ex46.f11744b;
        int i17 = ex46.f11746c - i15;
        int i18 = ex45.f11746c - i13;
        int i19 = ex46.f11748d - i16;
        int i20 = ex45.f11748d - i14;
        float f7 = ex45.f11756k;
        float f8 = ex46.f11756k;
        float f9 = f6;
        if (ex45.f11750e == 8) {
            i13 = (int) (((float) i13) - (((float) i17) / 2.0f));
            i14 = (int) (((float) i14) - (((float) i19) / 2.0f));
            if (Float.isNaN(f7)) {
                i3 = i19;
                i4 = i17;
                f2 = 0.0f;
            } else {
                f2 = f7;
                i4 = i17;
                i3 = i19;
            }
        } else {
            i4 = i18;
            f2 = f7;
            i3 = i20;
        }
        if (ex46.f11750e == 8) {
            i15 = (int) (((float) i15) - (((float) i4) / 2.0f));
            i16 = (int) (((float) i16) - (((float) i3) / 2.0f));
            i17 = i4;
            i19 = i3;
            if (Float.isNaN(f8)) {
                f8 = 0.0f;
            }
        }
        if (Float.isNaN(f2) && !Float.isNaN(f8)) {
            f2 = 1.0f;
        }
        if (!Float.isNaN(f2) && Float.isNaN(f8)) {
            f8 = 1.0f;
        }
        if (ex45.f11750e == 4) {
            f3 = f8;
            f4 = 0.0f;
        } else {
            f4 = f2;
            f3 = f8;
        }
        float f10 = ex46.f11750e == 4 ? 0.0f : f3;
        if (ex44.f11740a == null || !ih4.mo17782N()) {
            i5 = i13;
            f5 = f;
        } else {
            ih4.C2446a x = ih42.mo17797x(ex44.f11740a.f17753a, i12);
            i5 = i13;
            ih4.C2446a w = ih42.mo17796w(ex44.f11740a.f17753a, i12);
            if (x == w) {
                w = null;
            }
            if (x != null) {
                i5 = (int) (x.f13694a * ((float) i));
                i7 = i2;
                i14 = (int) (x.f13697b * ((float) i7));
                i6 = x.f13695a;
                i8 = i;
            } else {
                i8 = i;
                i7 = i2;
                i6 = 0;
            }
            if (w != null) {
                i15 = (int) (w.f13694a * ((float) i8));
                i16 = (int) (w.f13697b * ((float) i7));
                i9 = w.f13695a;
            } else {
                i9 = 100;
            }
            f5 = (f9 - ((float) i6)) / ((float) (i9 - i6));
        }
        int i21 = i5;
        ex44.f11740a = ex45.f11740a;
        int i22 = (int) (((float) i21) + (((float) (i15 - i21)) * f5));
        ex44.f11739a = i22;
        int i23 = (int) (((float) i14) + (f5 * ((float) (i16 - i14))));
        ex44.f11744b = i23;
        float f11 = f;
        float f12 = 1.0f - f11;
        ex44.f11746c = i22 + ((int) ((((float) i4) * f12) + (((float) i17) * f11)));
        ex44.f11748d = i23 + ((int) ((f12 * ((float) i3)) + (((float) i19) * f11)));
        ex44.f11738a = m14420m(ex45.f11738a, ex46.f11738a, 0.5f, f11);
        ex44.f11743b = m14420m(ex45.f11743b, ex46.f11743b, 0.5f, f11);
        ex44.f11745c = m14420m(ex45.f11745c, ex46.f11745c, 0.0f, f11);
        ex44.f11747d = m14420m(ex45.f11747d, ex46.f11747d, 0.0f, f11);
        ex44.f11749e = m14420m(ex45.f11749e, ex46.f11749e, 0.0f, f11);
        ex44.f11754i = m14420m(ex45.f11754i, ex46.f11754i, 1.0f, f11);
        ex44.f11755j = m14420m(ex45.f11755j, ex46.f11755j, 1.0f, f11);
        ex44.f11751f = m14420m(ex45.f11751f, ex46.f11751f, 0.0f, f11);
        ex44.f11752g = m14420m(ex45.f11752g, ex46.f11752g, 0.0f, f11);
        ex44.f11753h = m14420m(ex45.f11753h, ex46.f11753h, 0.0f, f11);
        ex44.f11756k = m14420m(f4, f10, 1.0f, f11);
        Set<String> keySet = ex46.f11742a.keySet();
        ex44.f11742a.clear();
        for (String next : keySet) {
            if (ex45.f11742a.containsKey(next)) {
                qc0 qc0 = ex45.f11742a.get(next);
                qc0 qc02 = ex46.f11742a.get(next);
                qc0 qc03 = new qc0(qc0);
                ex44.f11742a.put(next, qc03);
                if (qc0.mo23089r() == 1) {
                    qc03.mo23096y(Float.valueOf(m14420m(qc0.mo23086n(), qc02.mo23086n(), 0.0f, f11)));
                } else {
                    int r = qc0.mo23089r();
                    float[] fArr = new float[r];
                    float[] fArr2 = new float[r];
                    qc0.mo23087o(fArr);
                    qc02.mo23087o(fArr2);
                    for (int i24 = 0; i24 < r; i24++) {
                        fArr[i24] = m14420m(fArr[i24], fArr2[i24], 0.0f, f11);
                        qc03.mo23097z(fArr);
                    }
                }
            }
        }
    }

    /* renamed from: A */
    public boolean mo15623A(String str, C3336qr qrVar) throws C3805vr {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1881940865:
                if (str.equals("phone_orientation")) {
                    c = 0;
                    break;
                }
                break;
            case -1383228885:
                if (str.equals("bottom")) {
                    c = 1;
                    break;
                }
                break;
            case -1349088399:
                if (str.equals("custom")) {
                    c = 2;
                    break;
                }
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    c = 3;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c = 4;
                    break;
                }
                break;
            case -1249320804:
                if (str.equals("rotationZ")) {
                    c = 5;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 6;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 7;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = 8;
                    break;
                }
                break;
            case -987906986:
                if (str.equals("pivotX")) {
                    c = 9;
                    break;
                }
                break;
            case -987906985:
                if (str.equals("pivotY")) {
                    c = 10;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = 11;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = 12;
                    break;
                }
                break;
            case 115029:
                if (str.equals("top")) {
                    c = 13;
                    break;
                }
                break;
            case 3317767:
                if (str.equals("left")) {
                    c = 14;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 15;
                    break;
                }
                break;
            case 108511772:
                if (str.equals("right")) {
                    c = 16;
                    break;
                }
                break;
            case 642850769:
                if (str.equals("interpolatedPos")) {
                    c = 17;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                f11737m = qrVar.mo23409j();
                break;
            case 1:
                this.f11748d = qrVar.mo23410k();
                break;
            case 2:
                mo15640q(qrVar);
                break;
            case 3:
                this.f11745c = qrVar.mo23409j();
                break;
            case 4:
                this.f11747d = qrVar.mo23409j();
                break;
            case 5:
                this.f11749e = qrVar.mo23409j();
                break;
            case 6:
                this.f11751f = qrVar.mo23409j();
                break;
            case 7:
                this.f11752g = qrVar.mo23409j();
                break;
            case 8:
                this.f11753h = qrVar.mo23409j();
                break;
            case 9:
                this.f11738a = qrVar.mo23409j();
                break;
            case 10:
                this.f11743b = qrVar.mo23409j();
                break;
            case 11:
                this.f11754i = qrVar.mo23409j();
                break;
            case 12:
                this.f11755j = qrVar.mo23409j();
                break;
            case 13:
                this.f11744b = qrVar.mo23410k();
                break;
            case 14:
                this.f11739a = qrVar.mo23410k();
                break;
            case 15:
                this.f11756k = qrVar.mo23409j();
                break;
            case 16:
                this.f11746c = qrVar.mo23410k();
                break;
            case 17:
                this.f11757l = qrVar.mo23409j();
                break;
            default:
                return false;
        }
        return true;
    }

    /* renamed from: B */
    public ex4 mo15624B() {
        o60 o60 = this.f11740a;
        if (o60 != null) {
            this.f11739a = o60.mo21641L();
            this.f11744b = this.f11740a.mo21697e0();
            this.f11746c = this.f11740a.mo21674X();
            this.f11748d = this.f11740a.mo21747v();
            mo15626D(this.f11740a.f17747a);
        }
        return this;
    }

    /* renamed from: C */
    public ex4 mo15625C(o60 o60) {
        if (o60 == null) {
            return this;
        }
        this.f11740a = o60;
        mo15624B();
        return this;
    }

    /* renamed from: D */
    public void mo15626D(ex4 ex4) {
        this.f11738a = ex4.f11738a;
        this.f11743b = ex4.f11743b;
        this.f11745c = ex4.f11745c;
        this.f11747d = ex4.f11747d;
        this.f11749e = ex4.f11749e;
        this.f11751f = ex4.f11751f;
        this.f11752g = ex4.f11752g;
        this.f11753h = ex4.f11753h;
        this.f11754i = ex4.f11754i;
        this.f11755j = ex4.f11755j;
        this.f11756k = ex4.f11756k;
        this.f11750e = ex4.f11750e;
        this.f11742a.clear();
        for (qc0 next : ex4.f11742a.values()) {
            this.f11742a.put(next.mo23083k(), next.mo23076d());
        }
    }

    /* renamed from: E */
    public int mo15627E() {
        return Math.max(0, this.f11746c - this.f11739a);
    }

    /* renamed from: c */
    public void mo15628c(String str, int i) {
        mo15646w(str, 902, i);
    }

    /* renamed from: d */
    public void mo15629d(String str, float f) {
        mo15645v(str, 901, f);
    }

    /* renamed from: e */
    public float mo15630e() {
        int i = this.f11739a;
        return ((float) i) + (((float) (this.f11746c - i)) / 2.0f);
    }

    /* renamed from: f */
    public float mo15631f() {
        int i = this.f11744b;
        return ((float) i) + (((float) (this.f11748d - i)) / 2.0f);
    }

    /* renamed from: g */
    public qc0 mo15632g(String str) {
        return this.f11742a.get(str);
    }

    /* renamed from: h */
    public Set<String> mo15633h() {
        return this.f11742a.keySet();
    }

    /* renamed from: i */
    public int mo15634i(String str) {
        if (this.f11742a.containsKey(str)) {
            return this.f11742a.get(str).mo23079g();
        }
        return -21880;
    }

    /* renamed from: j */
    public float mo15635j(String str) {
        if (this.f11742a.containsKey(str)) {
            return this.f11742a.get(str).mo23080h();
        }
        return Float.NaN;
    }

    /* renamed from: k */
    public String mo15636k() {
        o60 o60 = this.f11740a;
        return o60 == null ? dv0.f10947b : o60.f17753a;
    }

    /* renamed from: l */
    public int mo15637l() {
        return Math.max(0, this.f11748d - this.f11744b);
    }

    /* renamed from: o */
    public boolean mo15638o() {
        return Float.isNaN(this.f11745c) && Float.isNaN(this.f11747d) && Float.isNaN(this.f11749e) && Float.isNaN(this.f11751f) && Float.isNaN(this.f11752g) && Float.isNaN(this.f11753h) && Float.isNaN(this.f11754i) && Float.isNaN(this.f11755j) && Float.isNaN(this.f11756k);
    }

    /* renamed from: p */
    public void mo15639p(String str) {
        StringBuilder sb;
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = (".(" + stackTraceElement.getFileName() + ar4.f25981a + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName()) + " " + (hashCode() % 1000);
        if (this.f11740a != null) {
            sb = new StringBuilder();
            sb.append(str2);
            sb.append("/");
            sb.append(this.f11740a.hashCode() % 1000);
        } else {
            sb = new StringBuilder();
            sb.append(str2);
            sb.append("/NULL");
        }
        String sb2 = sb.toString();
        System.out.println(sb2 + " " + str);
    }

    /* renamed from: q */
    public void mo15640q(C3336qr qrVar) throws C3805vr {
        C3652tr trVar = (C3652tr) qrVar;
        int size = trVar.size();
        for (int i = 0; i < size; i++) {
            C3450rr rrVar = (C3450rr) trVar.mo22582C(i);
            rrVar.mo23405e();
            C3336qr k0 = rrVar.mo24058k0();
            String e = k0.mo23405e();
            if (e.matches("#[0-9a-fA-F]+")) {
                mo15646w(rrVar.mo23405e(), 902, Integer.parseInt(e.substring(1), 16));
            } else {
                boolean z = k0 instanceof C3535sr;
                String e2 = rrVar.mo23405e();
                if (z) {
                    mo15645v(e2, 901, k0.mo23409j());
                } else {
                    mo15647x(e2, ak4.C1709b.f9164d, e);
                }
            }
        }
    }

    /* renamed from: r */
    public void mo15641r() {
        String str;
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = (".(" + stackTraceElement.getFileName() + ar4.f25981a + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName()) + " " + (hashCode() % 1000);
        if (this.f11740a != null) {
            str = str2 + "/" + (this.f11740a.hashCode() % 1000) + " ";
        } else {
            str = str2 + "/NULL ";
        }
        HashMap<String, qc0> hashMap = this.f11742a;
        if (hashMap != null) {
            for (String str3 : hashMap.keySet()) {
                System.out.println(str + this.f11742a.get(str3).toString());
            }
        }
    }

    /* renamed from: s */
    public StringBuilder mo15642s(StringBuilder sb) {
        return mo15643t(sb, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0101, code lost:
        r7.append(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0104, code lost:
        r7.append("',\n");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0117, code lost:
        r7.append(",\n");
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.StringBuilder mo15643t(java.lang.StringBuilder r7, boolean r8) {
        /*
            r6 = this;
            java.lang.String r0 = "{\n"
            r7.append(r0)
            int r0 = r6.f11739a
            java.lang.String r1 = "left"
            m14419b(r7, r1, r0)
            int r0 = r6.f11744b
            java.lang.String r1 = "top"
            m14419b(r7, r1, r0)
            int r0 = r6.f11746c
            java.lang.String r1 = "right"
            m14419b(r7, r1, r0)
            int r0 = r6.f11748d
            java.lang.String r1 = "bottom"
            m14419b(r7, r1, r0)
            float r0 = r6.f11738a
            java.lang.String r1 = "pivotX"
            m14418a(r7, r1, r0)
            float r0 = r6.f11743b
            java.lang.String r1 = "pivotY"
            m14418a(r7, r1, r0)
            float r0 = r6.f11745c
            java.lang.String r1 = "rotationX"
            m14418a(r7, r1, r0)
            float r0 = r6.f11747d
            java.lang.String r1 = "rotationY"
            m14418a(r7, r1, r0)
            float r0 = r6.f11749e
            java.lang.String r1 = "rotationZ"
            m14418a(r7, r1, r0)
            float r0 = r6.f11751f
            java.lang.String r1 = "translationX"
            m14418a(r7, r1, r0)
            float r0 = r6.f11752g
            java.lang.String r1 = "translationY"
            m14418a(r7, r1, r0)
            float r0 = r6.f11753h
            java.lang.String r1 = "translationZ"
            m14418a(r7, r1, r0)
            float r0 = r6.f11754i
            java.lang.String r1 = "scaleX"
            m14418a(r7, r1, r0)
            float r0 = r6.f11755j
            java.lang.String r1 = "scaleY"
            m14418a(r7, r1, r0)
            float r0 = r6.f11756k
            java.lang.String r1 = "alpha"
            m14418a(r7, r1, r0)
            int r0 = r6.f11750e
            java.lang.String r1 = "visibility"
            m14419b(r7, r1, r0)
            float r0 = r6.f11757l
            java.lang.String r1 = "interpolatedPos"
            m14418a(r7, r1, r0)
            com.onedelhi.secure.o60 r0 = r6.f11740a
            if (r0 == 0) goto L_0x0090
            com.onedelhi.secure.m60$b[] r0 = com.onedelhi.secure.m60.C2835b.values()
            int r1 = r0.length
            r2 = 0
        L_0x0086:
            if (r2 >= r1) goto L_0x0090
            r3 = r0[r2]
            r6.mo15644u(r7, r3)
            int r2 = r2 + 1
            goto L_0x0086
        L_0x0090:
            java.lang.String r0 = "phone_orientation"
            if (r8 == 0) goto L_0x0099
            float r1 = f11737m
            m14418a(r7, r0, r1)
        L_0x0099:
            if (r8 == 0) goto L_0x00a0
            float r8 = f11737m
            m14418a(r7, r0, r8)
        L_0x00a0:
            java.util.HashMap<java.lang.String, com.onedelhi.secure.qc0> r8 = r6.f11742a
            int r8 = r8.size()
            java.lang.String r0 = "}\n"
            if (r8 == 0) goto L_0x011e
            java.lang.String r8 = "custom : {\n"
            r7.append(r8)
            java.util.HashMap<java.lang.String, com.onedelhi.secure.qc0> r8 = r6.f11742a
            java.util.Set r8 = r8.keySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x00b9:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x011b
            java.lang.Object r1 = r8.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.HashMap<java.lang.String, com.onedelhi.secure.qc0> r2 = r6.f11742a
            java.lang.Object r2 = r2.get(r1)
            com.onedelhi.secure.qc0 r2 = (com.onedelhi.secure.qc0) r2
            r7.append(r1)
            java.lang.String r1 = ": "
            r7.append(r1)
            int r1 = r2.mo23085m()
            java.lang.String r3 = ",\n"
            java.lang.String r4 = "',\n"
            java.lang.String r5 = "'"
            switch(r1) {
                case 900: goto L_0x0110;
                case 901: goto L_0x0108;
                case 902: goto L_0x00f6;
                case 903: goto L_0x00ee;
                case 904: goto L_0x00e3;
                case 905: goto L_0x0108;
                default: goto L_0x00e2;
            }
        L_0x00e2:
            goto L_0x00b9
        L_0x00e3:
            r7.append(r5)
            boolean r1 = r2.mo23078f()
            r7.append(r1)
            goto L_0x0104
        L_0x00ee:
            r7.append(r5)
            java.lang.String r1 = r2.mo23084l()
            goto L_0x0101
        L_0x00f6:
            r7.append(r5)
            int r1 = r2.mo23081i()
            java.lang.String r1 = com.onedelhi.secure.qc0.m25643c(r1)
        L_0x0101:
            r7.append(r1)
        L_0x0104:
            r7.append(r4)
            goto L_0x00b9
        L_0x0108:
            float r1 = r2.mo23080h()
            r7.append(r1)
            goto L_0x0117
        L_0x0110:
            int r1 = r2.mo23081i()
            r7.append(r1)
        L_0x0117:
            r7.append(r3)
            goto L_0x00b9
        L_0x011b:
            r7.append(r0)
        L_0x011e:
            r7.append(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ex4.mo15643t(java.lang.StringBuilder, boolean):java.lang.StringBuilder");
    }

    /* renamed from: u */
    public final void mo15644u(StringBuilder sb, m60.C2835b bVar) {
        m60 r = this.f11740a.mo21327r(bVar);
        if (r != null && r.f15915a != null) {
            sb.append("Anchor");
            sb.append(bVar.name());
            sb.append(": ['");
            String str = r.f15915a.mo20114i().f17753a;
            if (str == null) {
                str = "#PARENT";
            }
            sb.append(str);
            sb.append("', '");
            sb.append(r.f15915a.mo20117l().name());
            sb.append("', '");
            sb.append(r.f15920b);
            sb.append("'],\n");
        }
    }

    /* renamed from: v */
    public void mo15645v(String str, int i, float f) {
        if (this.f11742a.containsKey(str)) {
            this.f11742a.get(str).mo23092u(f);
        } else {
            this.f11742a.put(str, new qc0(str, i, f));
        }
    }

    /* renamed from: w */
    public void mo15646w(String str, int i, int i2) {
        if (this.f11742a.containsKey(str)) {
            this.f11742a.get(str).mo23093v(i2);
        } else {
            this.f11742a.put(str, new qc0(str, i, i2));
        }
    }

    /* renamed from: x */
    public void mo15647x(String str, int i, String str2) {
        if (this.f11742a.containsKey(str)) {
            this.f11742a.get(str).mo23095x(str2);
        } else {
            this.f11742a.put(str, new qc0(str, i, str2));
        }
    }

    /* renamed from: y */
    public void mo15648y(String str, int i, boolean z) {
        if (this.f11742a.containsKey(str)) {
            this.f11742a.get(str).mo23090t(z);
        } else {
            this.f11742a.put(str, new qc0(str, i, z));
        }
    }

    /* renamed from: z */
    public void mo15649z(ec0 ec0, float[] fArr) {
    }
}
