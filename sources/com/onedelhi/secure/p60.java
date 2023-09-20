package com.onedelhi.secure;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.onedelhi.secure.C1788bk;
import com.onedelhi.secure.o60;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class p60 extends dx4 {

    /* renamed from: H */
    public static final boolean f18370H = false;

    /* renamed from: I */
    public static final boolean f18371I = false;

    /* renamed from: J */
    public static final boolean f18372J = false;

    /* renamed from: y0 */
    public static final int f18373y0 = 8;

    /* renamed from: z0 */
    public static int f18374z0;

    /* renamed from: A */
    public boolean f18375A = false;

    /* renamed from: B */
    public boolean f18376B = false;

    /* renamed from: C */
    public boolean f18377C = false;

    /* renamed from: D */
    public boolean f18378D = false;

    /* renamed from: E */
    public boolean f18379E = false;

    /* renamed from: F */
    public boolean f18380F = false;

    /* renamed from: G */
    public boolean f18381G = false;

    /* renamed from: a */
    public C1788bk.C1789a f18382a = new C1788bk.C1789a();

    /* renamed from: a */
    public C1788bk.C1790b f18383a = null;

    /* renamed from: a */
    public C1788bk f18384a = new C1788bk(this);

    /* renamed from: a */
    public p32 f18385a = new p32();

    /* renamed from: a */
    public vj0 f18386a = new vj0(this);

    /* renamed from: a */
    public zi2 f18387a;

    /* renamed from: a */
    public WeakReference<m60> f18388a = null;

    /* renamed from: a */
    public HashSet<o60> f18389a = new HashSet<>();

    /* renamed from: a */
    public C3546sv[] f18390a = new C3546sv[4];

    /* renamed from: b */
    public WeakReference<m60> f18391b = null;

    /* renamed from: b */
    public C3546sv[] f18392b = new C3546sv[4];

    /* renamed from: c */
    public WeakReference<m60> f18393c = null;

    /* renamed from: d */
    public WeakReference<m60> f18394d = null;

    /* renamed from: n0 */
    public int f18395n0;

    /* renamed from: o0 */
    public int f18396o0;

    /* renamed from: p0 */
    public int f18397p0;

    /* renamed from: q0 */
    public int f18398q0;

    /* renamed from: r0 */
    public int f18399r0;

    /* renamed from: s0 */
    public int f18400s0 = 0;

    /* renamed from: t0 */
    public int f18401t0 = 0;

    /* renamed from: u0 */
    public int f18402u0 = 0;

    /* renamed from: v0 */
    public int f18403v0 = 0;

    /* renamed from: w0 */
    public int f18404w0 = 257;

    /* renamed from: x0 */
    public int f18405x0 = 0;

    public p60() {
    }

    public p60(int i, int i2) {
        super(i, i2);
    }

    public p60(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
    }

    public p60(String str, int i, int i2) {
        super(i, i2);
        mo21715j1(str);
    }

    /* renamed from: R2 */
    public static boolean m24475R2(int i, o60 o60, C1788bk.C1790b bVar, C1788bk.C1789a aVar, int i2) {
        int i3;
        int i4;
        if (bVar == null) {
            return false;
        }
        if (o60.mo21720l0() == 8 || (o60 instanceof nj1) || (o60 instanceof C2063ej)) {
            aVar.f9870c = 0;
            aVar.f9871d = 0;
            return false;
        }
        aVar.f9865a = o60.mo21630H();
        aVar.f9868b = o60.mo21714j0();
        aVar.f9864a = o60.mo21723m0();
        aVar.f9867b = o60.mo21619D();
        aVar.f9869b = false;
        aVar.f9873f = i2;
        o60.C3032b bVar2 = aVar.f9865a;
        o60.C3032b bVar3 = o60.C3032b.MATCH_CONSTRAINT;
        boolean z = bVar2 == bVar3;
        boolean z2 = aVar.f9868b == bVar3;
        boolean z3 = z && o60.f17783e > 0.0f;
        boolean z4 = z2 && o60.f17783e > 0.0f;
        if (z && o60.mo21736r0(0) && o60.f17788f == 0 && !z3) {
            aVar.f9865a = o60.C3032b.WRAP_CONTENT;
            if (z2 && o60.f17792g == 0) {
                aVar.f9865a = o60.C3032b.FIXED;
            }
            z = false;
        }
        if (z2 && o60.mo21736r0(1) && o60.f17792g == 0 && !z4) {
            aVar.f9868b = o60.C3032b.WRAP_CONTENT;
            if (z && o60.f17788f == 0) {
                aVar.f9868b = o60.C3032b.FIXED;
            }
            z2 = false;
        }
        if (o60.mo15197G0()) {
            aVar.f9865a = o60.C3032b.FIXED;
            z = false;
        }
        if (o60.mo15198H0()) {
            aVar.f9868b = o60.C3032b.FIXED;
            z2 = false;
        }
        if (z3) {
            if (o60.f17757a[0] == 4) {
                aVar.f9865a = o60.C3032b.FIXED;
            } else if (!z2) {
                o60.C3032b bVar4 = aVar.f9868b;
                o60.C3032b bVar5 = o60.C3032b.FIXED;
                if (bVar4 == bVar5) {
                    i4 = aVar.f9867b;
                } else {
                    aVar.f9865a = o60.C3032b.WRAP_CONTENT;
                    bVar.mo3259a(o60, aVar);
                    i4 = aVar.f9871d;
                }
                aVar.f9865a = bVar5;
                aVar.f9864a = (int) (o60.mo21610A() * ((float) i4));
            }
        }
        if (z4) {
            if (o60.f17757a[1] == 4) {
                aVar.f9868b = o60.C3032b.FIXED;
            } else if (!z) {
                o60.C3032b bVar6 = aVar.f9865a;
                o60.C3032b bVar7 = o60.C3032b.FIXED;
                if (bVar6 == bVar7) {
                    i3 = aVar.f9864a;
                } else {
                    aVar.f9868b = o60.C3032b.WRAP_CONTENT;
                    bVar.mo3259a(o60, aVar);
                    i3 = aVar.f9870c;
                }
                aVar.f9868b = bVar7;
                aVar.f9867b = o60.mo21613B() == -1 ? (int) (((float) i3) / o60.mo21610A()) : (int) (o60.mo21610A() * ((float) i3));
            }
        }
        bVar.mo3259a(o60, aVar);
        o60.mo21691c2(aVar.f9870c);
        o60.mo21758y1(aVar.f9871d);
        o60.mo21755x1(aVar.f9866a);
        o60.mo21704g1(aVar.f9872e);
        aVar.f9873f = C1788bk.C1789a.f9861g;
        return aVar.f9869b;
    }

    /* renamed from: A2 */
    public void mo22318A2() {
        this.f18386a.mo26123f(mo21630H(), mo21714j0());
    }

    /* renamed from: B2 */
    public boolean mo22319B2(boolean z) {
        return this.f18386a.mo26124g(z);
    }

    /* renamed from: C2 */
    public boolean mo22320C2(boolean z) {
        return this.f18386a.mo26125h(z);
    }

    /* renamed from: D2 */
    public boolean mo22321D2(boolean z, int i) {
        return this.f18386a.mo26126i(z, i);
    }

    /* renamed from: E2 */
    public void mo22322E2(zi2 zi2) {
        this.f18387a = zi2;
        this.f18385a.mo22252F(zi2);
    }

    /* renamed from: F2 */
    public ArrayList<nj1> mo22323F2() {
        ArrayList<nj1> arrayList = new ArrayList<>();
        int size = this.f10993b.size();
        for (int i = 0; i < size; i++) {
            o60 o60 = this.f10993b.get(i);
            if (o60 instanceof nj1) {
                nj1 nj1 = (nj1) o60;
                if (nj1.mo21322m2() == 0) {
                    arrayList.add(nj1);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: G2 */
    public C1788bk.C1790b mo22324G2() {
        return this.f18383a;
    }

    /* renamed from: H2 */
    public int mo22325H2() {
        return this.f18404w0;
    }

    /* renamed from: I2 */
    public p32 mo22326I2() {
        return this.f18385a;
    }

    /* renamed from: J2 */
    public ArrayList<nj1> mo22327J2() {
        ArrayList<nj1> arrayList = new ArrayList<>();
        int size = this.f10993b.size();
        for (int i = 0; i < size; i++) {
            o60 o60 = this.f10993b.get(i);
            if (o60 instanceof nj1) {
                nj1 nj1 = (nj1) o60;
                if (nj1.mo21322m2() == 1) {
                    arrayList.add(nj1);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: K2 */
    public boolean mo22328K2() {
        return false;
    }

    /* renamed from: L2 */
    public void mo22329L2() {
        this.f18386a.mo26132o();
    }

    /* renamed from: M2 */
    public void mo22330M2() {
        this.f18386a.mo26133p();
    }

    /* renamed from: N2 */
    public boolean mo22331N2() {
        return this.f18381G;
    }

    /* renamed from: O2 */
    public boolean mo22332O2() {
        return this.f18375A;
    }

    /* renamed from: P2 */
    public boolean mo22333P2() {
        return this.f18380F;
    }

    /* renamed from: Q2 */
    public long mo22334Q2(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = i8;
        this.f18396o0 = i10;
        int i11 = i9;
        this.f18397p0 = i11;
        return this.f18384a.mo13745d(this, i, i10, i11, i2, i3, i4, i5, i6, i7);
    }

    /* renamed from: R0 */
    public void mo14929R0() {
        this.f18385a.mo22270Y();
        this.f18396o0 = 0;
        this.f18398q0 = 0;
        this.f18397p0 = 0;
        this.f18399r0 = 0;
        this.f18379E = false;
        super.mo14929R0();
    }

    /* renamed from: S2 */
    public boolean mo22335S2(int i) {
        return (this.f18404w0 & i) == i;
    }

    /* renamed from: T2 */
    public final void mo22336T2() {
        this.f18400s0 = 0;
        this.f18401t0 = 0;
    }

    /* renamed from: U2 */
    public void mo22337U2(C1788bk.C1790b bVar) {
        this.f18383a = bVar;
        this.f18386a.mo26138u(bVar);
    }

    /* renamed from: V2 */
    public void mo22338V2(int i) {
        this.f18404w0 = i;
        p32.f18334h = mo22335S2(512);
    }

    /* renamed from: W2 */
    public void mo22339W2(int i, int i2, int i3, int i4) {
        this.f18396o0 = i;
        this.f18397p0 = i2;
        this.f18398q0 = i3;
        this.f18399r0 = i4;
    }

    /* renamed from: X2 */
    public void mo22340X2(int i) {
        this.f18395n0 = i;
    }

    /* renamed from: Y2 */
    public void mo22341Y2(boolean z) {
        this.f18375A = z;
    }

    /* renamed from: Z2 */
    public boolean mo22342Z2(p32 p32, boolean[] zArr) {
        zArr[2] = false;
        boolean S2 = mo22335S2(64);
        mo21319j2(p32, S2);
        int size = this.f10993b.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            o60 o60 = this.f10993b.get(i);
            o60.mo21319j2(p32, S2);
            if (o60.mo21742t0()) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a3 */
    public void mo22343a3() {
        this.f18384a.mo13746e(this);
    }

    /* renamed from: b0 */
    public void mo21686b0(StringBuilder sb) {
        sb.append(this.f17753a + ":{\n");
        sb.append("  actualWidth:" + this.f17810o);
        sb.append("\n");
        sb.append("  actualHeight:" + this.f17812p);
        sb.append("\n");
        Iterator<o60> it = mo14933l2().iterator();
        while (it.hasNext()) {
            it.next().mo21686b0(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }

    /* renamed from: f0 */
    public String mo21318f0() {
        return ConstraintLayout.f2471c;
    }

    /* renamed from: i2 */
    public void mo21712i2(boolean z, boolean z2) {
        super.mo21712i2(z, z2);
        int size = this.f10993b.size();
        for (int i = 0; i < size; i++) {
            this.f10993b.get(i).mo21712i2(z, z2);
        }
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0319  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x031b  */
    /* renamed from: n2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14935n2() {
        /*
            r18 = this;
            r1 = r18
            r2 = 0
            r1.f17816r = r2
            r1.f17818s = r2
            r1.f18380F = r2
            r1.f18381G = r2
            java.util.ArrayList<com.onedelhi.secure.o60> r0 = r1.f10993b
            int r3 = r0.size()
            int r0 = r18.mo21723m0()
            int r0 = java.lang.Math.max(r2, r0)
            int r4 = r18.mo21619D()
            int r4 = java.lang.Math.max(r2, r4)
            com.onedelhi.secure.o60$b[] r5 = r1.f17760a
            r6 = 1
            r7 = r5[r6]
            r5 = r5[r2]
            com.onedelhi.secure.zi2 r8 = r1.f18387a
            if (r8 == 0) goto L_0x0033
            long r9 = r8.f23679O
            r11 = 1
            long r9 = r9 + r11
            r8.f23679O = r9
        L_0x0033:
            int r8 = r1.f18395n0
            if (r8 != 0) goto L_0x0093
            int r8 = r1.f18404w0
            boolean r8 = com.onedelhi.secure.mw2.m22047b(r8, r6)
            if (r8 == 0) goto L_0x0093
            com.onedelhi.secure.bk$b r8 = r18.mo22324G2()
            com.onedelhi.secure.el0.m13858j(r1, r8)
            r8 = 0
        L_0x0047:
            if (r8 >= r3) goto L_0x0093
            java.util.ArrayList<com.onedelhi.secure.o60> r9 = r1.f10993b
            java.lang.Object r9 = r9.get(r8)
            com.onedelhi.secure.o60 r9 = (com.onedelhi.secure.o60) r9
            boolean r10 = r9.mo21626F0()
            if (r10 == 0) goto L_0x0090
            boolean r10 = r9 instanceof com.onedelhi.secure.nj1
            if (r10 != 0) goto L_0x0090
            boolean r10 = r9 instanceof com.onedelhi.secure.C2063ej
            if (r10 != 0) goto L_0x0090
            boolean r10 = r9 instanceof com.onedelhi.secure.dw4
            if (r10 != 0) goto L_0x0090
            boolean r10 = r9.mo21623E0()
            if (r10 != 0) goto L_0x0090
            com.onedelhi.secure.o60$b r10 = r9.mo21759z(r2)
            com.onedelhi.secure.o60$b r11 = r9.mo21759z(r6)
            com.onedelhi.secure.o60$b r12 = com.onedelhi.secure.o60.C3032b.MATCH_CONSTRAINT
            if (r10 != r12) goto L_0x0081
            int r10 = r9.f17788f
            if (r10 == r6) goto L_0x0081
            if (r11 != r12) goto L_0x0081
            int r10 = r9.f17792g
            if (r10 == r6) goto L_0x0081
            r10 = 1
            goto L_0x0082
        L_0x0081:
            r10 = 0
        L_0x0082:
            if (r10 != 0) goto L_0x0090
            com.onedelhi.secure.bk$a r10 = new com.onedelhi.secure.bk$a
            r10.<init>()
            com.onedelhi.secure.bk$b r11 = r1.f18383a
            int r12 = com.onedelhi.secure.C1788bk.C1789a.f9861g
            m24475R2(r2, r9, r11, r10, r12)
        L_0x0090:
            int r8 = r8 + 1
            goto L_0x0047
        L_0x0093:
            r8 = 2
            if (r3 <= r8) goto L_0x00dc
            com.onedelhi.secure.o60$b r9 = com.onedelhi.secure.o60.C3032b.WRAP_CONTENT
            if (r5 == r9) goto L_0x009c
            if (r7 != r9) goto L_0x00dc
        L_0x009c:
            int r10 = r1.f18404w0
            r11 = 1024(0x400, float:1.435E-42)
            boolean r10 = com.onedelhi.secure.mw2.m22047b(r10, r11)
            if (r10 == 0) goto L_0x00dc
            com.onedelhi.secure.bk$b r10 = r18.mo22324G2()
            boolean r10 = com.onedelhi.secure.aj1.m11227c(r1, r10)
            if (r10 == 0) goto L_0x00dc
            if (r5 != r9) goto L_0x00c4
            int r10 = r18.mo21723m0()
            if (r0 >= r10) goto L_0x00c0
            if (r0 <= 0) goto L_0x00c0
            r1.mo21691c2(r0)
            r1.f18380F = r6
            goto L_0x00c4
        L_0x00c0:
            int r0 = r18.mo21723m0()
        L_0x00c4:
            if (r7 != r9) goto L_0x00d8
            int r9 = r18.mo21619D()
            if (r4 >= r9) goto L_0x00d4
            if (r4 <= 0) goto L_0x00d4
            r1.mo21758y1(r4)
            r1.f18381G = r6
            goto L_0x00d8
        L_0x00d4:
            int r4 = r18.mo21619D()
        L_0x00d8:
            r9 = r4
            r4 = r0
            r0 = 1
            goto L_0x00df
        L_0x00dc:
            r9 = r4
            r4 = r0
            r0 = 0
        L_0x00df:
            r10 = 64
            boolean r11 = r1.mo22335S2(r10)
            if (r11 != 0) goto L_0x00f2
            r11 = 128(0x80, float:1.794E-43)
            boolean r11 = r1.mo22335S2(r11)
            if (r11 == 0) goto L_0x00f0
            goto L_0x00f2
        L_0x00f0:
            r11 = 0
            goto L_0x00f3
        L_0x00f2:
            r11 = 1
        L_0x00f3:
            com.onedelhi.secure.p32 r12 = r1.f18385a
            r12.f18350b = r2
            r12.f18352c = r2
            int r13 = r1.f18404w0
            if (r13 == 0) goto L_0x0101
            if (r11 == 0) goto L_0x0101
            r12.f18352c = r6
        L_0x0101:
            java.util.ArrayList<com.onedelhi.secure.o60> r11 = r1.f10993b
            com.onedelhi.secure.o60$b r12 = r18.mo21630H()
            com.onedelhi.secure.o60$b r13 = com.onedelhi.secure.o60.C3032b.WRAP_CONTENT
            if (r12 == r13) goto L_0x0114
            com.onedelhi.secure.o60$b r12 = r18.mo21714j0()
            if (r12 != r13) goto L_0x0112
            goto L_0x0114
        L_0x0112:
            r12 = 0
            goto L_0x0115
        L_0x0114:
            r12 = 1
        L_0x0115:
            r18.mo22336T2()
            r13 = 0
        L_0x0119:
            if (r13 >= r3) goto L_0x012f
            java.util.ArrayList<com.onedelhi.secure.o60> r14 = r1.f10993b
            java.lang.Object r14 = r14.get(r13)
            com.onedelhi.secure.o60 r14 = (com.onedelhi.secure.o60) r14
            boolean r15 = r14 instanceof com.onedelhi.secure.dx4
            if (r15 == 0) goto L_0x012c
            com.onedelhi.secure.dx4 r14 = (com.onedelhi.secure.dx4) r14
            r14.mo14935n2()
        L_0x012c:
            int r13 = r13 + 1
            goto L_0x0119
        L_0x012f:
            boolean r10 = r1.mo22335S2(r10)
            r13 = r0
            r0 = 0
            r14 = 1
        L_0x0136:
            if (r14 == 0) goto L_0x0322
            int r15 = r0 + 1
            com.onedelhi.secure.p32 r0 = r1.f18385a     // Catch:{ Exception -> 0x01e7 }
            r0.mo22270Y()     // Catch:{ Exception -> 0x01e7 }
            r18.mo22336T2()     // Catch:{ Exception -> 0x01e7 }
            com.onedelhi.secure.p32 r0 = r1.f18385a     // Catch:{ Exception -> 0x01e7 }
            r1.mo21727o(r0)     // Catch:{ Exception -> 0x01e7 }
            r0 = 0
        L_0x0148:
            if (r0 >= r3) goto L_0x015c
            java.util.ArrayList<com.onedelhi.secure.o60> r6 = r1.f10993b     // Catch:{ Exception -> 0x01e7 }
            java.lang.Object r6 = r6.get(r0)     // Catch:{ Exception -> 0x01e7 }
            com.onedelhi.secure.o60 r6 = (com.onedelhi.secure.o60) r6     // Catch:{ Exception -> 0x01e7 }
            com.onedelhi.secure.p32 r2 = r1.f18385a     // Catch:{ Exception -> 0x01e7 }
            r6.mo21727o(r2)     // Catch:{ Exception -> 0x01e7 }
            int r0 = r0 + 1
            r2 = 0
            r6 = 1
            goto L_0x0148
        L_0x015c:
            com.onedelhi.secure.p32 r0 = r1.f18385a     // Catch:{ Exception -> 0x01e7 }
            boolean r14 = r1.mo22345r2(r0)     // Catch:{ Exception -> 0x01e7 }
            java.lang.ref.WeakReference<com.onedelhi.secure.m60> r0 = r1.f18388a     // Catch:{ Exception -> 0x01e7 }
            r2 = 0
            if (r0 == 0) goto L_0x0182
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01e7 }
            if (r0 == 0) goto L_0x0182
            java.lang.ref.WeakReference<com.onedelhi.secure.m60> r0 = r1.f18388a     // Catch:{ Exception -> 0x01e7 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01e7 }
            com.onedelhi.secure.m60 r0 = (com.onedelhi.secure.m60) r0     // Catch:{ Exception -> 0x01e7 }
            com.onedelhi.secure.p32 r6 = r1.f18385a     // Catch:{ Exception -> 0x01e7 }
            com.onedelhi.secure.m60 r8 = r1.f17765b     // Catch:{ Exception -> 0x01e7 }
            com.onedelhi.secure.v04 r6 = r6.mo22291u(r8)     // Catch:{ Exception -> 0x01e7 }
            r1.mo22350w2(r0, r6)     // Catch:{ Exception -> 0x01e7 }
            r1.f18388a = r2     // Catch:{ Exception -> 0x01e7 }
        L_0x0182:
            java.lang.ref.WeakReference<com.onedelhi.secure.m60> r0 = r1.f18393c     // Catch:{ Exception -> 0x01e7 }
            if (r0 == 0) goto L_0x01a1
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01e7 }
            if (r0 == 0) goto L_0x01a1
            java.lang.ref.WeakReference<com.onedelhi.secure.m60> r0 = r1.f18393c     // Catch:{ Exception -> 0x01e7 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01e7 }
            com.onedelhi.secure.m60 r0 = (com.onedelhi.secure.m60) r0     // Catch:{ Exception -> 0x01e7 }
            com.onedelhi.secure.p32 r6 = r1.f18385a     // Catch:{ Exception -> 0x01e7 }
            com.onedelhi.secure.m60 r8 = r1.f17781d     // Catch:{ Exception -> 0x01e7 }
            com.onedelhi.secure.v04 r6 = r6.mo22291u(r8)     // Catch:{ Exception -> 0x01e7 }
            r1.mo22349v2(r0, r6)     // Catch:{ Exception -> 0x01e7 }
            r1.f18393c = r2     // Catch:{ Exception -> 0x01e7 }
        L_0x01a1:
            java.lang.ref.WeakReference<com.onedelhi.secure.m60> r0 = r1.f18391b     // Catch:{ Exception -> 0x01e7 }
            if (r0 == 0) goto L_0x01c0
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01e7 }
            if (r0 == 0) goto L_0x01c0
            java.lang.ref.WeakReference<com.onedelhi.secure.m60> r0 = r1.f18391b     // Catch:{ Exception -> 0x01e7 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01e7 }
            com.onedelhi.secure.m60 r0 = (com.onedelhi.secure.m60) r0     // Catch:{ Exception -> 0x01e7 }
            com.onedelhi.secure.p32 r6 = r1.f18385a     // Catch:{ Exception -> 0x01e7 }
            com.onedelhi.secure.m60 r8 = r1.f17748a     // Catch:{ Exception -> 0x01e7 }
            com.onedelhi.secure.v04 r6 = r6.mo22291u(r8)     // Catch:{ Exception -> 0x01e7 }
            r1.mo22350w2(r0, r6)     // Catch:{ Exception -> 0x01e7 }
            r1.f18391b = r2     // Catch:{ Exception -> 0x01e7 }
        L_0x01c0:
            java.lang.ref.WeakReference<com.onedelhi.secure.m60> r0 = r1.f18394d     // Catch:{ Exception -> 0x01e7 }
            if (r0 == 0) goto L_0x01df
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01e7 }
            if (r0 == 0) goto L_0x01df
            java.lang.ref.WeakReference<com.onedelhi.secure.m60> r0 = r1.f18394d     // Catch:{ Exception -> 0x01e7 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01e7 }
            com.onedelhi.secure.m60 r0 = (com.onedelhi.secure.m60) r0     // Catch:{ Exception -> 0x01e7 }
            com.onedelhi.secure.p32 r6 = r1.f18385a     // Catch:{ Exception -> 0x01e7 }
            com.onedelhi.secure.m60 r8 = r1.f17775c     // Catch:{ Exception -> 0x01e7 }
            com.onedelhi.secure.v04 r6 = r6.mo22291u(r8)     // Catch:{ Exception -> 0x01e7 }
            r1.mo22349v2(r0, r6)     // Catch:{ Exception -> 0x01e7 }
            r1.f18394d = r2     // Catch:{ Exception -> 0x01e7 }
        L_0x01df:
            if (r14 == 0) goto L_0x0201
            com.onedelhi.secure.p32 r0 = r1.f18385a     // Catch:{ Exception -> 0x01e7 }
            r0.mo22265T()     // Catch:{ Exception -> 0x01e7 }
            goto L_0x0201
        L_0x01e7:
            r0 = move-exception
            r0.printStackTrace()
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "EXCEPTION : "
            r6.append(r8)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r2.println(r0)
        L_0x0201:
            com.onedelhi.secure.p32 r0 = r1.f18385a
            if (r14 == 0) goto L_0x020c
            boolean[] r2 = com.onedelhi.secure.mw2.f16395a
            boolean r0 = r1.mo22342Z2(r0, r2)
            goto L_0x0223
        L_0x020c:
            r1.mo21319j2(r0, r10)
            r0 = 0
        L_0x0210:
            if (r0 >= r3) goto L_0x0222
            java.util.ArrayList<com.onedelhi.secure.o60> r2 = r1.f10993b
            java.lang.Object r2 = r2.get(r0)
            com.onedelhi.secure.o60 r2 = (com.onedelhi.secure.o60) r2
            com.onedelhi.secure.p32 r6 = r1.f18385a
            r2.mo21319j2(r6, r10)
            int r0 = r0 + 1
            goto L_0x0210
        L_0x0222:
            r0 = 0
        L_0x0223:
            r2 = 8
            if (r12 == 0) goto L_0x0294
            if (r15 >= r2) goto L_0x0294
            boolean[] r6 = com.onedelhi.secure.mw2.f16395a
            r8 = 2
            boolean r6 = r6[r8]
            if (r6 == 0) goto L_0x0294
            r6 = 0
            r8 = 0
            r14 = 0
        L_0x0233:
            if (r6 >= r3) goto L_0x025d
            java.util.ArrayList<com.onedelhi.secure.o60> r2 = r1.f10993b
            java.lang.Object r2 = r2.get(r6)
            com.onedelhi.secure.o60 r2 = (com.onedelhi.secure.o60) r2
            r16 = r0
            int r0 = r2.f17816r
            int r17 = r2.mo21723m0()
            int r0 = r0 + r17
            int r14 = java.lang.Math.max(r14, r0)
            int r0 = r2.f17818s
            int r2 = r2.mo21619D()
            int r0 = r0 + r2
            int r8 = java.lang.Math.max(r8, r0)
            int r6 = r6 + 1
            r0 = r16
            r2 = 8
            goto L_0x0233
        L_0x025d:
            r16 = r0
            int r0 = r1.f17830y
            int r0 = java.lang.Math.max(r0, r14)
            int r2 = r1.f17831z
            int r2 = java.lang.Math.max(r2, r8)
            com.onedelhi.secure.o60$b r6 = com.onedelhi.secure.o60.C3032b.WRAP_CONTENT
            if (r5 != r6) goto L_0x0280
            int r8 = r18.mo21723m0()
            if (r8 >= r0) goto L_0x0280
            r1.mo21691c2(r0)
            com.onedelhi.secure.o60$b[] r0 = r1.f17760a
            r8 = 0
            r0[r8] = r6
            r13 = 1
            r16 = 1
        L_0x0280:
            if (r7 != r6) goto L_0x0296
            int r0 = r18.mo21619D()
            if (r0 >= r2) goto L_0x0296
            r1.mo21758y1(r2)
            com.onedelhi.secure.o60$b[] r0 = r1.f17760a
            r2 = 1
            r0[r2] = r6
            r13 = 1
            r16 = 1
            goto L_0x0296
        L_0x0294:
            r16 = r0
        L_0x0296:
            int r0 = r1.f17830y
            int r2 = r18.mo21723m0()
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = r18.mo21723m0()
            if (r0 <= r2) goto L_0x02b3
            r1.mo21691c2(r0)
            com.onedelhi.secure.o60$b[] r0 = r1.f17760a
            com.onedelhi.secure.o60$b r2 = com.onedelhi.secure.o60.C3032b.FIXED
            r6 = 0
            r0[r6] = r2
            r13 = 1
            r16 = 1
        L_0x02b3:
            int r0 = r1.f17831z
            int r2 = r18.mo21619D()
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = r18.mo21619D()
            if (r0 <= r2) goto L_0x02d1
            r1.mo21758y1(r0)
            com.onedelhi.secure.o60$b[] r0 = r1.f17760a
            com.onedelhi.secure.o60$b r2 = com.onedelhi.secure.o60.C3032b.FIXED
            r6 = 1
            r0[r6] = r2
            r2 = 1
            r16 = 1
            goto L_0x02d3
        L_0x02d1:
            r6 = 1
            r2 = r13
        L_0x02d3:
            if (r2 != 0) goto L_0x0312
            com.onedelhi.secure.o60$b[] r0 = r1.f17760a
            r8 = 0
            r0 = r0[r8]
            com.onedelhi.secure.o60$b r13 = com.onedelhi.secure.o60.C3032b.WRAP_CONTENT
            if (r0 != r13) goto L_0x02f4
            if (r4 <= 0) goto L_0x02f4
            int r0 = r18.mo21723m0()
            if (r0 <= r4) goto L_0x02f4
            r1.f18380F = r6
            com.onedelhi.secure.o60$b[] r0 = r1.f17760a
            com.onedelhi.secure.o60$b r2 = com.onedelhi.secure.o60.C3032b.FIXED
            r0[r8] = r2
            r1.mo21691c2(r4)
            r2 = 1
            r16 = 1
        L_0x02f4:
            com.onedelhi.secure.o60$b[] r0 = r1.f17760a
            r0 = r0[r6]
            if (r0 != r13) goto L_0x0312
            if (r9 <= 0) goto L_0x0312
            int r0 = r18.mo21619D()
            if (r0 <= r9) goto L_0x0312
            r1.f18381G = r6
            com.onedelhi.secure.o60$b[] r0 = r1.f17760a
            com.onedelhi.secure.o60$b r2 = com.onedelhi.secure.o60.C3032b.FIXED
            r0[r6] = r2
            r1.mo21758y1(r9)
            r0 = 8
            r2 = 1
            r13 = 1
            goto L_0x0317
        L_0x0312:
            r13 = r2
            r2 = r16
            r0 = 8
        L_0x0317:
            if (r15 <= r0) goto L_0x031b
            r14 = 0
            goto L_0x031c
        L_0x031b:
            r14 = r2
        L_0x031c:
            r0 = r15
            r2 = 0
            r6 = 1
            r8 = 2
            goto L_0x0136
        L_0x0322:
            r1.f10993b = r11
            if (r13 == 0) goto L_0x032e
            com.onedelhi.secure.o60$b[] r0 = r1.f17760a
            r2 = 0
            r0[r2] = r5
            r2 = 1
            r0[r2] = r7
        L_0x032e:
            com.onedelhi.secure.p32 r0 = r1.f18385a
            com.onedelhi.secure.ds r0 = r0.mo22253G()
            r1.mo14930W0(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.p60.mo14935n2():void");
    }

    /* renamed from: q2 */
    public void mo22344q2(o60 o60, int i) {
        if (i == 0) {
            mo22346s2(o60);
        } else if (i == 1) {
            mo22351x2(o60);
        }
    }

    /* renamed from: r2 */
    public boolean mo22345r2(p32 p32) {
        boolean S2 = mo22335S2(64);
        mo15199g(p32, S2);
        int size = this.f10993b.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            o60 o60 = this.f10993b.get(i);
            o60.mo21629G1(0, false);
            o60.mo21629G1(1, false);
            if (o60 instanceof C2063ej) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                o60 o602 = this.f10993b.get(i2);
                if (o602 instanceof C2063ej) {
                    ((C2063ej) o602).mo15208s2();
                }
            }
        }
        this.f18389a.clear();
        for (int i3 = 0; i3 < size; i3++) {
            o60 o603 = this.f10993b.get(i3);
            if (o603.mo21700f()) {
                if (o603 instanceof dw4) {
                    this.f18389a.add(o603);
                } else {
                    o603.mo15199g(p32, S2);
                }
            }
        }
        while (this.f18389a.size() > 0) {
            int size2 = this.f18389a.size();
            Iterator<o60> it = this.f18389a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                dw4 dw4 = (dw4) it.next();
                if (dw4.mo14911o2(this.f18389a)) {
                    dw4.mo15199g(p32, S2);
                    this.f18389a.remove(dw4);
                    break;
                }
            }
            if (size2 == this.f18389a.size()) {
                Iterator<o60> it2 = this.f18389a.iterator();
                while (it2.hasNext()) {
                    it2.next().mo15199g(p32, S2);
                }
                this.f18389a.clear();
            }
        }
        if (p32.f18334h) {
            HashSet hashSet = new HashSet();
            for (int i4 = 0; i4 < size; i4++) {
                o60 o604 = this.f10993b.get(i4);
                if (!o604.mo21700f()) {
                    hashSet.add(o604);
                }
            }
            mo21696e(this, p32, hashSet, mo21630H() == o60.C3032b.WRAP_CONTENT ? 0 : 1, false);
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                o60 o605 = (o60) it3.next();
                mw2.m22046a(this, p32, o605);
                o605.mo15199g(p32, S2);
            }
        } else {
            for (int i5 = 0; i5 < size; i5++) {
                o60 o606 = this.f10993b.get(i5);
                if (o606 instanceof p60) {
                    o60.C3032b[] bVarArr = o606.f17760a;
                    o60.C3032b bVar = bVarArr[0];
                    o60.C3032b bVar2 = bVarArr[1];
                    o60.C3032b bVar3 = o60.C3032b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        o606.mo21621D1(o60.C3032b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        o606.mo21679Y1(o60.C3032b.FIXED);
                    }
                    o606.mo15199g(p32, S2);
                    if (bVar == bVar3) {
                        o606.mo21621D1(bVar);
                    }
                    if (bVar2 == bVar3) {
                        o606.mo21679Y1(bVar2);
                    }
                } else {
                    mw2.m22046a(this, p32, o606);
                    if (!o606.mo21700f()) {
                        o606.mo15199g(p32, S2);
                    }
                }
            }
        }
        if (this.f18400s0 > 0) {
            C3455rv.m27091b(this, p32, (ArrayList<o60>) null, 0);
        }
        if (this.f18401t0 > 0) {
            C3455rv.m27091b(this, p32, (ArrayList<o60>) null, 1);
        }
        return true;
    }

    /* renamed from: s2 */
    public final void mo22346s2(o60 o60) {
        int i = this.f18400s0 + 1;
        C3546sv[] svVarArr = this.f18392b;
        if (i >= svVarArr.length) {
            this.f18392b = (C3546sv[]) Arrays.copyOf(svVarArr, svVarArr.length * 2);
        }
        this.f18392b[this.f18400s0] = new C3546sv(o60, 0, mo22332O2());
        this.f18400s0++;
    }

    /* renamed from: t2 */
    public void mo22347t2(m60 m60) {
        WeakReference<m60> weakReference = this.f18394d;
        if (weakReference == null || weakReference.get() == null || m60.mo20111f() > ((m60) this.f18394d.get()).mo20111f()) {
            this.f18394d = new WeakReference<>(m60);
        }
    }

    /* renamed from: u2 */
    public void mo22348u2(m60 m60) {
        WeakReference<m60> weakReference = this.f18391b;
        if (weakReference == null || weakReference.get() == null || m60.mo20111f() > ((m60) this.f18391b.get()).mo20111f()) {
            this.f18391b = new WeakReference<>(m60);
        }
    }

    /* renamed from: v2 */
    public final void mo22349v2(m60 m60, v04 v04) {
        this.f18385a.mo22279i(v04, this.f18385a.mo22291u(m60), 0, 5);
    }

    /* renamed from: w2 */
    public final void mo22350w2(m60 m60, v04 v04) {
        this.f18385a.mo22279i(this.f18385a.mo22291u(m60), v04, 0, 5);
    }

    /* renamed from: x2 */
    public final void mo22351x2(o60 o60) {
        int i = this.f18401t0 + 1;
        C3546sv[] svVarArr = this.f18390a;
        if (i >= svVarArr.length) {
            this.f18390a = (C3546sv[]) Arrays.copyOf(svVarArr, svVarArr.length * 2);
        }
        this.f18390a[this.f18401t0] = new C3546sv(o60, 1, mo22332O2());
        this.f18401t0++;
    }

    /* renamed from: y2 */
    public void mo22352y2(m60 m60) {
        WeakReference<m60> weakReference = this.f18393c;
        if (weakReference == null || weakReference.get() == null || m60.mo20111f() > ((m60) this.f18393c.get()).mo20111f()) {
            this.f18393c = new WeakReference<>(m60);
        }
    }

    /* renamed from: z2 */
    public void mo22353z2(m60 m60) {
        WeakReference<m60> weakReference = this.f18388a;
        if (weakReference == null || weakReference.get() == null || m60.mo20111f() > ((m60) this.f18388a.get()).mo20111f()) {
            this.f18388a = new WeakReference<>(m60);
        }
    }
}
