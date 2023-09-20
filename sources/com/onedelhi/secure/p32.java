package com.onedelhi.secure;

import com.onedelhi.secure.m60;
import com.onedelhi.secure.v04;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;

public class p32 {

    /* renamed from: a */
    public static long f18326a = 0;

    /* renamed from: a */
    public static zi2 f18327a = null;

    /* renamed from: b */
    public static long f18328b = 0;

    /* renamed from: d */
    public static final boolean f18329d = false;

    /* renamed from: e */
    public static final boolean f18330e = false;

    /* renamed from: f */
    public static final boolean f18331f = false;

    /* renamed from: g */
    public static final boolean f18332g = false;

    /* renamed from: h */
    public static int f18333h = 1000;

    /* renamed from: h */
    public static boolean f18334h = false;

    /* renamed from: i */
    public static boolean f18335i = true;

    /* renamed from: j */
    public static boolean f18336j = true;

    /* renamed from: k */
    public static boolean f18337k = true;

    /* renamed from: l */
    public static boolean f18338l = true;

    /* renamed from: m */
    public static boolean f18339m = false;

    /* renamed from: a */
    public int f18340a;

    /* renamed from: a */
    public final C1990ds f18341a;

    /* renamed from: a */
    public C3123a f18342a;

    /* renamed from: a */
    public HashMap<String, v04> f18343a;

    /* renamed from: a */
    public boolean f18344a;

    /* renamed from: a */
    public C3580ta[] f18345a;

    /* renamed from: a */
    public v04[] f18346a;

    /* renamed from: a */
    public boolean[] f18347a;

    /* renamed from: b */
    public int f18348b;

    /* renamed from: b */
    public C3123a f18349b;

    /* renamed from: b */
    public boolean f18350b;

    /* renamed from: c */
    public int f18351c;

    /* renamed from: c */
    public boolean f18352c;

    /* renamed from: d */
    public int f18353d;

    /* renamed from: e */
    public int f18354e;

    /* renamed from: f */
    public int f18355f;

    /* renamed from: g */
    public int f18356g;

    /* renamed from: com.onedelhi.secure.p32$a */
    public interface C3123a {
        /* renamed from: a */
        void mo22296a(p32 p32, v04 v04, boolean z);

        /* renamed from: b */
        void mo22297b(C3123a aVar);

        /* renamed from: c */
        void mo16343c(v04 v04);

        void clear();

        /* renamed from: d */
        void mo22298d(p32 p32);

        /* renamed from: e */
        v04 mo22299e();

        /* renamed from: f */
        void mo16345f(p32 p32, C3580ta taVar, boolean z);

        /* renamed from: g */
        v04 mo16346g(p32 p32, boolean[] zArr);

        boolean isEmpty();
    }

    /* renamed from: com.onedelhi.secure.p32$b */
    public class C3124b extends C3580ta {
        public C3124b(C1990ds dsVar) {
            this.f20718a = new w04(this, dsVar);
        }
    }

    public p32() {
        this.f18344a = false;
        this.f18340a = 0;
        this.f18343a = null;
        this.f18348b = 32;
        this.f18351c = 32;
        this.f18345a = null;
        this.f18350b = false;
        this.f18352c = false;
        this.f18347a = new boolean[32];
        this.f18353d = 1;
        this.f18354e = 0;
        this.f18355f = 32;
        this.f18346a = new v04[f18333h];
        this.f18356g = 0;
        this.f18345a = new C3580ta[32];
        mo22268W();
        C1990ds dsVar = new C1990ds();
        this.f18341a = dsVar;
        this.f18342a = new g53(dsVar);
        this.f18349b = f18339m ? new C3124b(dsVar) : new C3580ta(dsVar);
    }

    /* renamed from: L */
    public static zi2 m24397L() {
        return f18327a;
    }

    /* renamed from: w */
    public static C3580ta m24398w(p32 p32, v04 v04, v04 v042, float f) {
        return p32.mo22292v().mo24803n(v04, v042, f);
    }

    /* renamed from: A */
    public final void mo22247A() {
        mo22248B();
        String str = "";
        for (int i = 0; i < this.f18354e; i++) {
            str = (str + this.f18345a[i]) + "\n";
        }
        System.out.println(str + this.f18342a + "\n");
    }

    /* renamed from: B */
    public final void mo22248B() {
        System.out.println("Display Rows (" + this.f18354e + "x" + this.f18353d + ")\n");
    }

    /* renamed from: C */
    public void mo22249C() {
        int i = 0;
        for (int i2 = 0; i2 < this.f18348b; i2++) {
            C3580ta[] taVarArr = this.f18345a;
            if (taVarArr[i2] != null) {
                i += taVarArr[i2].mo24794F();
            }
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f18354e; i4++) {
            C3580ta[] taVarArr2 = this.f18345a;
            if (taVarArr2[i4] != null) {
                i3 += taVarArr2[i4].mo24794F();
            }
        }
        PrintStream printStream = System.out;
        StringBuilder sb = new StringBuilder();
        sb.append("Linear System -> Table size: ");
        sb.append(this.f18348b);
        sb.append(" (");
        int i5 = this.f18348b;
        sb.append(mo22254H(i5 * i5));
        sb.append(") -- row sizes: ");
        sb.append(mo22254H(i));
        sb.append(", actual size: ");
        sb.append(mo22254H(i3));
        sb.append(" rows: ");
        sb.append(this.f18354e);
        sb.append("/");
        sb.append(this.f18355f);
        sb.append(" cols: ");
        sb.append(this.f18353d);
        sb.append("/");
        sb.append(this.f18351c);
        sb.append(" ");
        sb.append(0);
        sb.append(" occupied cells, ");
        sb.append(mo22254H(0));
        printStream.println(sb.toString());
    }

    /* renamed from: D */
    public void mo22250D() {
        mo22248B();
        String str = "";
        for (int i = 0; i < this.f18354e; i++) {
            if (this.f18345a[i].f20719a.f21607a == v04.C3759b.UNRESTRICTED) {
                str = (str + this.f18345a[i].mo24795G()) + "\n";
            }
        }
        System.out.println(str + this.f18342a + "\n");
    }

    /* renamed from: E */
    public final int mo22251E(C3123a aVar) throws Exception {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= this.f18354e) {
                z = false;
                break;
            }
            C3580ta[] taVarArr = this.f18345a;
            if (taVarArr[i].f20719a.f21607a != v04.C3759b.UNRESTRICTED && taVarArr[i].f20717a < 0.0f) {
                z = true;
                break;
            }
            i++;
        }
        if (!z) {
            return 0;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            zi2 zi2 = f18327a;
            if (zi2 != null) {
                zi2.f23696o++;
            }
            i2++;
            float f = Float.MAX_VALUE;
            int i3 = -1;
            int i4 = -1;
            int i5 = 0;
            for (int i6 = 0; i6 < this.f18354e; i6++) {
                C3580ta taVar = this.f18345a[i6];
                if (taVar.f20719a.f21607a != v04.C3759b.UNRESTRICTED && !taVar.f20722b && taVar.f20717a < 0.0f) {
                    int i7 = 9;
                    if (f18338l) {
                        int b = taVar.f20718a.mo20209b();
                        int i8 = 0;
                        while (i8 < b) {
                            v04 d = taVar.f20718a.mo20212d(i8);
                            float c = taVar.f20718a.mo20210c(d);
                            if (c > 0.0f) {
                                int i9 = 0;
                                while (i9 < i7) {
                                    float f2 = d.f21609a[i9] / c;
                                    if ((f2 < f && i9 == i5) || i9 > i5) {
                                        i4 = d.f21617n;
                                        i5 = i9;
                                        i3 = i6;
                                        f = f2;
                                    }
                                    i9++;
                                    i7 = 9;
                                }
                            }
                            i8++;
                            i7 = 9;
                        }
                    } else {
                        for (int i10 = 1; i10 < this.f18353d; i10++) {
                            v04 v04 = this.f18341a.f10889a[i10];
                            float c2 = taVar.f20718a.mo20210c(v04);
                            if (c2 > 0.0f) {
                                for (int i11 = 0; i11 < 9; i11++) {
                                    float f3 = v04.f21609a[i11] / c2;
                                    if ((f3 < f && i11 == i5) || i11 > i5) {
                                        i4 = i10;
                                        i5 = i11;
                                        i3 = i6;
                                        f = f3;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (i3 != -1) {
                C3580ta taVar2 = this.f18345a[i3];
                taVar2.f20719a.f21618o = -1;
                zi2 zi22 = f18327a;
                if (zi22 != null) {
                    zi22.f23695n++;
                }
                taVar2.mo24792D(this.f18341a.f10889a[i4]);
                v04 v042 = taVar2.f20719a;
                v042.f21618o = i3;
                v042.mo25834y(this, taVar2);
            } else {
                z2 = true;
            }
            if (i2 > this.f18353d / 2) {
                z2 = true;
            }
        }
        return i2;
    }

    /* renamed from: F */
    public void mo22252F(zi2 zi2) {
        f18327a = zi2;
    }

    /* renamed from: G */
    public C1990ds mo22253G() {
        return this.f18341a;
    }

    /* renamed from: H */
    public final String mo22254H(int i) {
        int i2 = i * 4;
        int i3 = i2 / 1024;
        int i4 = i3 / 1024;
        if (i4 > 0) {
            return "" + i4 + " Mb";
        } else if (i3 > 0) {
            return "" + i3 + " Kb";
        } else {
            return "" + i2 + " bytes";
        }
    }

    /* renamed from: I */
    public final String mo22255I(int i) {
        return i == 1 ? "LOW" : i == 2 ? "MEDIUM" : i == 3 ? "HIGH" : i == 4 ? "HIGHEST" : i == 5 ? "EQUALITY" : i == 8 ? "FIXED" : i == 6 ? "BARRIER" : "NONE";
    }

    /* renamed from: J */
    public C3123a mo22256J() {
        return this.f18342a;
    }

    /* renamed from: K */
    public int mo22257K() {
        int i = 0;
        for (int i2 = 0; i2 < this.f18354e; i2++) {
            C3580ta[] taVarArr = this.f18345a;
            if (taVarArr[i2] != null) {
                i += taVarArr[i2].mo24794F();
            }
        }
        return i;
    }

    /* renamed from: M */
    public int mo22258M() {
        return this.f18354e;
    }

    /* renamed from: N */
    public int mo22259N() {
        return this.f18340a;
    }

    /* renamed from: O */
    public int mo22260O(Object obj) {
        v04 j = ((m60) obj).mo20115j();
        if (j != null) {
            return (int) (j.f21606a + 0.5f);
        }
        return 0;
    }

    /* renamed from: P */
    public C3580ta mo22261P(int i) {
        return this.f18345a[i];
    }

    /* renamed from: Q */
    public float mo22262Q(String str) {
        v04 R = mo22263R(str, v04.C3759b.UNRESTRICTED);
        if (R == null) {
            return 0.0f;
        }
        return R.f21606a;
    }

    /* renamed from: R */
    public v04 mo22263R(String str, v04.C3759b bVar) {
        if (this.f18343a == null) {
            this.f18343a = new HashMap<>();
        }
        v04 v04 = this.f18343a.get(str);
        return v04 == null ? mo22294y(str, bVar) : v04;
    }

    /* renamed from: S */
    public final void mo22264S() {
        int i = this.f18348b * 2;
        this.f18348b = i;
        this.f18345a = (C3580ta[]) Arrays.copyOf(this.f18345a, i);
        C1990ds dsVar = this.f18341a;
        dsVar.f10889a = (v04[]) Arrays.copyOf(dsVar.f10889a, this.f18348b);
        int i2 = this.f18348b;
        this.f18347a = new boolean[i2];
        this.f18351c = i2;
        this.f18355f = i2;
        zi2 zi2 = f18327a;
        if (zi2 != null) {
            zi2.f23689h++;
            zi2.f23701t = Math.max(zi2.f23701t, (long) i2);
            zi2 zi22 = f18327a;
            zi22.f23673I = zi22.f23701t;
        }
    }

    /* renamed from: T */
    public void mo22265T() throws Exception {
        zi2 zi2 = f18327a;
        if (zi2 != null) {
            zi2.f23690i++;
        }
        if (this.f18342a.isEmpty()) {
            mo22288r();
            return;
        }
        if (this.f18350b || this.f18352c) {
            zi2 zi22 = f18327a;
            if (zi22 != null) {
                zi22.f23703v++;
            }
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.f18354e) {
                    z = true;
                    break;
                } else if (!this.f18345a[i].f20722b) {
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                zi2 zi23 = f18327a;
                if (zi23 != null) {
                    zi23.f23702u++;
                }
                mo22288r();
                return;
            }
        }
        mo22266U(this.f18342a);
    }

    /* renamed from: U */
    public void mo22266U(C3123a aVar) throws Exception {
        zi2 zi2 = f18327a;
        if (zi2 != null) {
            zi2.f23707z++;
            zi2.f23665A = Math.max(zi2.f23665A, (long) this.f18353d);
            zi2 zi22 = f18327a;
            zi22.f23666B = Math.max(zi22.f23666B, (long) this.f18354e);
        }
        mo22251E(aVar);
        mo22267V(aVar, false);
        mo22288r();
    }

    /* renamed from: V */
    public final int mo22267V(C3123a aVar, boolean z) {
        zi2 zi2 = f18327a;
        if (zi2 != null) {
            zi2.f23693l++;
        }
        for (int i = 0; i < this.f18353d; i++) {
            this.f18347a[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            zi2 zi22 = f18327a;
            if (zi22 != null) {
                zi22.f23694m++;
            }
            i2++;
            if (i2 >= this.f18353d * 2) {
                return i2;
            }
            if (aVar.mo22299e() != null) {
                this.f18347a[aVar.mo22299e().f21617n] = true;
            }
            v04 g = aVar.mo16346g(this, this.f18347a);
            if (g != null) {
                boolean[] zArr = this.f18347a;
                int i3 = g.f21617n;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (g != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f18354e; i5++) {
                    C3580ta taVar = this.f18345a[i5];
                    if (taVar.f20719a.f21607a != v04.C3759b.UNRESTRICTED && !taVar.f20722b && taVar.mo24815z(g)) {
                        float c = taVar.f20718a.mo20210c(g);
                        if (c < 0.0f) {
                            float f2 = (-taVar.f20717a) / c;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C3580ta taVar2 = this.f18345a[i4];
                    taVar2.f20719a.f21618o = -1;
                    zi2 zi23 = f18327a;
                    if (zi23 != null) {
                        zi23.f23695n++;
                    }
                    taVar2.mo24792D(g);
                    v04 v04 = taVar2.f20719a;
                    v04.f21618o = i4;
                    v04.mo25834y(this, taVar2);
                }
            } else {
                z2 = true;
            }
        }
        return i2;
    }

    /* renamed from: W */
    public final void mo22268W() {
        int i = 0;
        if (f18339m) {
            while (i < this.f18354e) {
                C3580ta taVar = this.f18345a[i];
                if (taVar != null) {
                    this.f18341a.f10888a.mo20091a(taVar);
                }
                this.f18345a[i] = null;
                i++;
            }
            return;
        }
        while (i < this.f18354e) {
            C3580ta taVar2 = this.f18345a[i];
            if (taVar2 != null) {
                this.f18341a.f10890b.mo20091a(taVar2);
            }
            this.f18345a[i] = null;
            i++;
        }
    }

    /* renamed from: X */
    public void mo22269X(C3580ta taVar) {
        v04 v04;
        int i;
        if (taVar.f20722b && (v04 = taVar.f20719a) != null) {
            int i2 = v04.f21618o;
            if (i2 != -1) {
                while (true) {
                    i = this.f18354e;
                    if (i2 >= i - 1) {
                        break;
                    }
                    C3580ta[] taVarArr = this.f18345a;
                    int i3 = i2 + 1;
                    v04 v042 = taVarArr[i3].f20719a;
                    if (v042.f21618o == i3) {
                        v042.f21618o = i2;
                    }
                    taVarArr[i2] = taVarArr[i3];
                    i2 = i3;
                }
                this.f18354e = i - 1;
            }
            v04 v043 = taVar.f20719a;
            if (!v043.f21615c) {
                v043.mo25828t(this, taVar.f20717a);
            }
            (f18339m ? this.f18341a.f10888a : this.f18341a.f10890b).mo20091a(taVar);
        }
    }

    /* renamed from: Y */
    public void mo22270Y() {
        C1990ds dsVar;
        int i = 0;
        while (true) {
            dsVar = this.f18341a;
            v04[] v04Arr = dsVar.f10889a;
            if (i >= v04Arr.length) {
                break;
            }
            v04 v04 = v04Arr[i];
            if (v04 != null) {
                v04.mo25827s();
            }
            i++;
        }
        dsVar.f10891c.mo20093c(this.f18346a, this.f18356g);
        this.f18356g = 0;
        Arrays.fill(this.f18341a.f10889a, (Object) null);
        HashMap<String, v04> hashMap = this.f18343a;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f18340a = 0;
        this.f18342a.clear();
        this.f18353d = 1;
        for (int i2 = 0; i2 < this.f18354e; i2++) {
            C3580ta[] taVarArr = this.f18345a;
            if (taVarArr[i2] != null) {
                taVarArr[i2].f20721a = false;
            }
        }
        mo22268W();
        this.f18354e = 0;
        this.f18349b = f18339m ? new C3124b(this.f18341a) : new C3580ta(this.f18341a);
    }

    /* renamed from: a */
    public final v04 mo22271a(v04.C3759b bVar, String str) {
        v04 b = this.f18341a.f10891c.mo20092b();
        if (b == null) {
            b = new v04(bVar, str);
        } else {
            b.mo25827s();
        }
        b.mo25832w(bVar, str);
        int i = this.f18356g;
        int i2 = f18333h;
        if (i >= i2) {
            int i3 = i2 * 2;
            f18333h = i3;
            this.f18346a = (v04[]) Arrays.copyOf(this.f18346a, i3);
        }
        v04[] v04Arr = this.f18346a;
        int i4 = this.f18356g;
        this.f18356g = i4 + 1;
        v04Arr[i4] = b;
        return b;
    }

    /* renamed from: b */
    public void mo22272b(o60 o60, o60 o602, float f, int i) {
        o60 o603 = o60;
        o60 o604 = o602;
        m60.C2835b bVar = m60.C2835b.LEFT;
        v04 u = mo22291u(o603.mo21327r(bVar));
        m60.C2835b bVar2 = m60.C2835b.TOP;
        v04 u2 = mo22291u(o603.mo21327r(bVar2));
        m60.C2835b bVar3 = m60.C2835b.RIGHT;
        v04 u3 = mo22291u(o603.mo21327r(bVar3));
        m60.C2835b bVar4 = m60.C2835b.BOTTOM;
        v04 u4 = mo22291u(o603.mo21327r(bVar4));
        v04 u5 = mo22291u(o604.mo21327r(bVar));
        v04 u6 = mo22291u(o604.mo21327r(bVar2));
        v04 u7 = mo22291u(o604.mo21327r(bVar3));
        v04 u8 = mo22291u(o604.mo21327r(bVar4));
        C3580ta v = mo22292v();
        double d = (double) f;
        v04 v04 = u7;
        double d2 = (double) i;
        v.mo24812w(u2, u4, u6, u8, (float) (Math.sin(d) * d2));
        mo22274d(v);
        C3580ta v2 = mo22292v();
        v2.mo24812w(u, u3, u5, v04, (float) (Math.cos(d) * d2));
        mo22274d(v2);
    }

    /* renamed from: c */
    public void mo22273c(v04 v04, v04 v042, int i, float f, v04 v043, v04 v044, int i2, int i3) {
        int i4 = i3;
        C3580ta v = mo22292v();
        v.mo24801l(v04, v042, i, f, v043, v044, i2);
        if (i4 != 8) {
            v.mo24797h(this, i4);
        }
        mo22274d(v);
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x009c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x009d  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo22274d(com.onedelhi.secure.C3580ta r8) {
        /*
            r7 = this;
            if (r8 != 0) goto L_0x0003
            return
        L_0x0003:
            com.onedelhi.secure.zi2 r0 = f18327a
            r1 = 1
            if (r0 == 0) goto L_0x0017
            long r3 = r0.f23691j
            long r3 = r3 + r1
            r0.f23691j = r3
            boolean r3 = r8.f20722b
            if (r3 == 0) goto L_0x0017
            long r3 = r0.f23692k
            long r3 = r3 + r1
            r0.f23692k = r3
        L_0x0017:
            int r0 = r7.f18354e
            r3 = 1
            int r0 = r0 + r3
            int r4 = r7.f18355f
            if (r0 >= r4) goto L_0x0026
            int r0 = r7.f18353d
            int r0 = r0 + r3
            int r4 = r7.f18351c
            if (r0 < r4) goto L_0x0029
        L_0x0026:
            r7.mo22264S()
        L_0x0029:
            r0 = 0
            boolean r4 = r8.f20722b
            if (r4 != 0) goto L_0x009e
            r8.mo22298d(r7)
            boolean r4 = r8.isEmpty()
            if (r4 == 0) goto L_0x0038
            return
        L_0x0038:
            r8.mo24813x()
            boolean r4 = r8.mo24799j(r7)
            if (r4 == 0) goto L_0x0095
            com.onedelhi.secure.v04 r4 = r7.mo22290t()
            r8.f20719a = r4
            int r5 = r7.f18354e
            r7.mo22283m(r8)
            int r6 = r7.f18354e
            int r5 = r5 + r3
            if (r6 != r5) goto L_0x0095
            com.onedelhi.secure.p32$a r0 = r7.f18349b
            r0.mo22297b(r8)
            com.onedelhi.secure.p32$a r0 = r7.f18349b
            r7.mo22267V(r0, r3)
            int r0 = r4.f21618o
            r5 = -1
            if (r0 != r5) goto L_0x0096
            com.onedelhi.secure.v04 r0 = r8.f20719a
            if (r0 != r4) goto L_0x0076
            com.onedelhi.secure.v04 r0 = r8.mo24790B(r4)
            if (r0 == 0) goto L_0x0076
            com.onedelhi.secure.zi2 r4 = f18327a
            if (r4 == 0) goto L_0x0073
            long r5 = r4.f23695n
            long r5 = r5 + r1
            r4.f23695n = r5
        L_0x0073:
            r8.mo24792D(r0)
        L_0x0076:
            boolean r0 = r8.f20722b
            if (r0 != 0) goto L_0x007f
            com.onedelhi.secure.v04 r0 = r8.f20719a
            r0.mo25834y(r7, r8)
        L_0x007f:
            boolean r0 = f18339m
            if (r0 == 0) goto L_0x0088
            com.onedelhi.secure.ds r0 = r7.f18341a
            com.onedelhi.secure.m33$a<com.onedelhi.secure.ta> r0 = r0.f10888a
            goto L_0x008c
        L_0x0088:
            com.onedelhi.secure.ds r0 = r7.f18341a
            com.onedelhi.secure.m33$a<com.onedelhi.secure.ta> r0 = r0.f10890b
        L_0x008c:
            r0.mo20091a(r8)
            int r0 = r7.f18354e
            int r0 = r0 - r3
            r7.f18354e = r0
            goto L_0x0096
        L_0x0095:
            r3 = 0
        L_0x0096:
            boolean r0 = r8.mo24814y()
            if (r0 != 0) goto L_0x009d
            return
        L_0x009d:
            r0 = r3
        L_0x009e:
            if (r0 != 0) goto L_0x00a3
            r7.mo22283m(r8)
        L_0x00a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.p32.mo22274d(com.onedelhi.secure.ta):void");
    }

    /* renamed from: e */
    public C3580ta mo22275e(v04 v04, v04 v042, int i, int i2) {
        if (!f18335i || i2 != 8 || !v042.f21615c || v04.f21618o != -1) {
            C3580ta v = mo22292v();
            v.mo24808s(v04, v042, i);
            if (i2 != 8) {
                v.mo24797h(this, i2);
            }
            mo22274d(v);
            return v;
        }
        v04.mo25828t(this, v042.f21606a + ((float) i));
        return null;
    }

    /* renamed from: f */
    public void mo22276f(v04 v04, int i) {
        C3580ta taVar;
        if (!f18335i || v04.f21618o != -1) {
            int i2 = v04.f21618o;
            if (i2 != -1) {
                C3580ta taVar2 = this.f18345a[i2];
                if (!taVar2.f20722b) {
                    if (taVar2.f20718a.mo20209b() == 0) {
                        taVar2.f20722b = true;
                    } else {
                        taVar = mo22292v();
                        taVar.mo24807r(v04, i);
                    }
                }
                taVar2.f20717a = (float) i;
                return;
            }
            taVar = mo22292v();
            taVar.mo24802m(v04, i);
            mo22274d(taVar);
            return;
        }
        float f = (float) i;
        v04.mo25828t(this, f);
        for (int i3 = 0; i3 < this.f18340a + 1; i3++) {
            v04 v042 = this.f18341a.f10889a[i3];
            if (v042 != null && v042.f21616d && v042.f21622s == v04.f21617n) {
                v042.mo25828t(this, v042.f21611b + f);
            }
        }
    }

    /* renamed from: g */
    public final void mo22277g(C3580ta taVar) {
        taVar.mo24797h(this, 0);
    }

    /* renamed from: h */
    public void mo22278h(v04 v04, v04 v042, int i, boolean z) {
        C3580ta v = mo22292v();
        v04 x = mo22293x();
        x.f21619p = 0;
        v.mo24810u(v04, v042, x, i);
        mo22274d(v);
    }

    /* renamed from: i */
    public void mo22279i(v04 v04, v04 v042, int i, int i2) {
        C3580ta v = mo22292v();
        v04 x = mo22293x();
        x.f21619p = 0;
        v.mo24810u(v04, v042, x, i);
        if (i2 != 8) {
            mo22285o(v, (int) (v.f20718a.mo20210c(x) * -1.0f), i2);
        }
        mo22274d(v);
    }

    /* renamed from: j */
    public void mo22280j(v04 v04, v04 v042, int i, boolean z) {
        C3580ta v = mo22292v();
        v04 x = mo22293x();
        x.f21619p = 0;
        v.mo24811v(v04, v042, x, i);
        mo22274d(v);
    }

    /* renamed from: k */
    public void mo22281k(v04 v04, v04 v042, int i, int i2) {
        C3580ta v = mo22292v();
        v04 x = mo22293x();
        x.f21619p = 0;
        v.mo24811v(v04, v042, x, i);
        if (i2 != 8) {
            mo22285o(v, (int) (v.f20718a.mo20210c(x) * -1.0f), i2);
        }
        mo22274d(v);
    }

    /* renamed from: l */
    public void mo22282l(v04 v04, v04 v042, v04 v043, v04 v044, float f, int i) {
        C3580ta v = mo22292v();
        v.mo24804o(v04, v042, v043, v044, f);
        if (i != 8) {
            v.mo24797h(this, i);
        }
        mo22274d(v);
    }

    /* renamed from: m */
    public final void mo22283m(C3580ta taVar) {
        int i;
        if (!f18336j || !taVar.f20722b) {
            C3580ta[] taVarArr = this.f18345a;
            int i2 = this.f18354e;
            taVarArr[i2] = taVar;
            v04 v04 = taVar.f20719a;
            v04.f21618o = i2;
            this.f18354e = i2 + 1;
            v04.mo25834y(this, taVar);
        } else {
            taVar.f20719a.mo25828t(this, taVar.f20717a);
        }
        if (f18336j && this.f18344a) {
            int i3 = 0;
            while (i3 < this.f18354e) {
                if (this.f18345a[i3] == null) {
                    System.out.println("WTF");
                }
                C3580ta[] taVarArr2 = this.f18345a;
                if (taVarArr2[i3] != null && taVarArr2[i3].f20722b) {
                    C3580ta taVar2 = taVarArr2[i3];
                    taVar2.f20719a.mo25828t(this, taVar2.f20717a);
                    (f18339m ? this.f18341a.f10888a : this.f18341a.f10890b).mo20091a(taVar2);
                    this.f18345a[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f18354e;
                        if (i4 >= i) {
                            break;
                        }
                        C3580ta[] taVarArr3 = this.f18345a;
                        int i6 = i4 - 1;
                        taVarArr3[i6] = taVarArr3[i4];
                        if (taVarArr3[i6].f20719a.f21618o == i4) {
                            taVarArr3[i6].f20719a.f21618o = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f18345a[i5] = null;
                    }
                    this.f18354e = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f18344a = false;
        }
    }

    /* renamed from: n */
    public final void mo22284n(C3580ta taVar, int i) {
        mo22285o(taVar, i, 0);
    }

    /* renamed from: o */
    public void mo22285o(C3580ta taVar, int i, int i2) {
        taVar.mo24798i(mo22289s(i2, (String) null), i);
    }

    /* renamed from: p */
    public void mo22286p(v04 v04, v04 v042, int i) {
        if (v04.f21618o == -1 && i == 0) {
            if (v042.f21616d) {
                v042 = this.f18341a.f10889a[v042.f21622s];
            }
            if (v04.f21616d) {
                v04 v043 = this.f18341a.f10889a[v04.f21622s];
            } else {
                v04.mo25831v(this, v042, 0.0f);
            }
        } else {
            mo22275e(v04, v042, i, 8);
        }
    }

    /* renamed from: q */
    public final void mo22287q() {
        int i;
        int i2 = 0;
        while (i2 < this.f18354e) {
            C3580ta taVar = this.f18345a[i2];
            if (taVar.f20718a.mo20209b() == 0) {
                taVar.f20722b = true;
            }
            if (taVar.f20722b) {
                v04 v04 = taVar.f20719a;
                v04.f21606a = taVar.f20717a;
                v04.mo25826r(taVar);
                int i3 = i2;
                while (true) {
                    i = this.f18354e;
                    if (i3 >= i - 1) {
                        break;
                    }
                    C3580ta[] taVarArr = this.f18345a;
                    int i4 = i3 + 1;
                    taVarArr[i3] = taVarArr[i4];
                    i3 = i4;
                }
                this.f18345a[i - 1] = null;
                this.f18354e = i - 1;
                i2--;
                (f18339m ? this.f18341a.f10888a : this.f18341a.f10890b).mo20091a(taVar);
            }
            i2++;
        }
    }

    /* renamed from: r */
    public final void mo22288r() {
        for (int i = 0; i < this.f18354e; i++) {
            C3580ta taVar = this.f18345a[i];
            taVar.f20719a.f21606a = taVar.f20717a;
        }
    }

    /* renamed from: s */
    public v04 mo22289s(int i, String str) {
        zi2 zi2 = f18327a;
        if (zi2 != null) {
            zi2.f23698q++;
        }
        if (this.f18353d + 1 >= this.f18351c) {
            mo22264S();
        }
        v04 a = mo22271a(v04.C3759b.ERROR, str);
        int i2 = this.f18340a + 1;
        this.f18340a = i2;
        this.f18353d++;
        a.f21617n = i2;
        a.f21619p = i;
        this.f18341a.f10889a[i2] = a;
        this.f18342a.mo16343c(a);
        return a;
    }

    /* renamed from: t */
    public v04 mo22290t() {
        zi2 zi2 = f18327a;
        if (zi2 != null) {
            zi2.f23700s++;
        }
        if (this.f18353d + 1 >= this.f18351c) {
            mo22264S();
        }
        v04 a = mo22271a(v04.C3759b.SLACK, (String) null);
        int i = this.f18340a + 1;
        this.f18340a = i;
        this.f18353d++;
        a.f21617n = i;
        this.f18341a.f10889a[i] = a;
        return a;
    }

    /* renamed from: u */
    public v04 mo22291u(Object obj) {
        v04 v04 = null;
        if (obj == null) {
            return null;
        }
        if (this.f18353d + 1 >= this.f18351c) {
            mo22264S();
        }
        if (obj instanceof m60) {
            m60 m60 = (m60) obj;
            v04 = m60.mo20115j();
            if (v04 == null) {
                m60.mo20132z(this.f18341a);
                v04 = m60.mo20115j();
            }
            int i = v04.f21617n;
            if (i == -1 || i > this.f18340a || this.f18341a.f10889a[i] == null) {
                if (i != -1) {
                    v04.mo25827s();
                }
                int i2 = this.f18340a + 1;
                this.f18340a = i2;
                this.f18353d++;
                v04.f21617n = i2;
                v04.f21607a = v04.C3759b.UNRESTRICTED;
                this.f18341a.f10889a[i2] = v04;
            }
        }
        return v04;
    }

    /* renamed from: v */
    public C3580ta mo22292v() {
        C3580ta taVar;
        if (f18339m) {
            taVar = this.f18341a.f10888a.mo20092b();
            if (taVar == null) {
                taVar = new C3124b(this.f18341a);
                f18328b++;
                v04.m29754q();
                return taVar;
            }
        } else {
            taVar = this.f18341a.f10890b.mo20092b();
            if (taVar == null) {
                taVar = new C3580ta(this.f18341a);
                f18326a++;
                v04.m29754q();
                return taVar;
            }
        }
        taVar.mo24793E();
        v04.m29754q();
        return taVar;
    }

    /* renamed from: x */
    public v04 mo22293x() {
        zi2 zi2 = f18327a;
        if (zi2 != null) {
            zi2.f23699r++;
        }
        if (this.f18353d + 1 >= this.f18351c) {
            mo22264S();
        }
        v04 a = mo22271a(v04.C3759b.SLACK, (String) null);
        int i = this.f18340a + 1;
        this.f18340a = i;
        this.f18353d++;
        a.f21617n = i;
        this.f18341a.f10889a[i] = a;
        return a;
    }

    /* renamed from: y */
    public final v04 mo22294y(String str, v04.C3759b bVar) {
        zi2 zi2 = f18327a;
        if (zi2 != null) {
            zi2.f23697p++;
        }
        if (this.f18353d + 1 >= this.f18351c) {
            mo22264S();
        }
        v04 a = mo22271a(bVar, (String) null);
        a.mo25830u(str);
        int i = this.f18340a + 1;
        this.f18340a = i;
        this.f18353d++;
        a.f21617n = i;
        if (this.f18343a == null) {
            this.f18343a = new HashMap<>();
        }
        this.f18343a.put(str, a);
        this.f18341a.f10889a[this.f18340a] = a;
        return a;
    }

    /* renamed from: z */
    public void mo22295z() {
        mo22248B();
        String str = " num vars " + this.f18340a + "\n";
        for (int i = 0; i < this.f18340a + 1; i++) {
            v04 v04 = this.f18341a.f10889a[i];
            if (v04 != null && v04.f21615c) {
                str = str + " $[" + i + "] => " + v04 + " = " + v04.f21606a + "\n";
            }
        }
        String str2 = str + "\n";
        for (int i2 = 0; i2 < this.f18340a + 1; i2++) {
            v04[] v04Arr = this.f18341a.f10889a;
            v04 v042 = v04Arr[i2];
            if (v042 != null && v042.f21616d) {
                str2 = str2 + " ~[" + i2 + "] => " + v042 + " = " + v04Arr[v042.f21622s] + " + " + v042.f21611b + "\n";
            }
        }
        String str3 = str2 + "\n\n #  ";
        for (int i3 = 0; i3 < this.f18354e; i3++) {
            str3 = (str3 + this.f18345a[i3].mo24795G()) + "\n #  ";
        }
        if (this.f18342a != null) {
            str3 = str3 + "Goal: " + this.f18342a + "\n";
        }
        System.out.println(str3);
    }
}
