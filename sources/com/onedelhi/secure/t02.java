package com.onedelhi.secure;

import com.onedelhi.secure.r02;
import java.io.IOException;
import java.lang.reflect.Array;

public abstract class t02 extends r02 {

    /* renamed from: a */
    public static final /* synthetic */ boolean f35287a = false;

    /* renamed from: u */
    public static final int f35288u = 1;

    /* renamed from: v */
    public static final int f35289v = 2;

    /* renamed from: w */
    public static final int f35290w = 2096879;

    /* renamed from: x */
    public static final int f35291x = 65510;

    /* renamed from: y */
    public static final int f35292y = 128;

    /* renamed from: z */
    public static final int f35293z = 16;

    /* renamed from: a */
    public final k02 f35294a;

    /* renamed from: a */
    public final C6816b f35295a;

    /* renamed from: a */
    public final C6817c f35296a;

    /* renamed from: a */
    public final ve3 f35297a;

    /* renamed from: a */
    public final int[][] f35298a;

    /* renamed from: b */
    public final C6816b f35299b;

    /* renamed from: b */
    public final int[] f35300b;

    /* renamed from: b */
    public final int[][] f35301b;

    /* renamed from: n */
    public final int f35302n;

    /* renamed from: o */
    public int f35303o = 0;

    /* renamed from: p */
    public int f35304p = 0;

    /* renamed from: q */
    public final int f35305q;

    /* renamed from: r */
    public int f35306r;

    /* renamed from: s */
    public int f35307s;

    /* renamed from: t */
    public int f35308t;

    /* renamed from: com.onedelhi.secure.t02$b */
    public class C6816b extends r02.C6630a {

        /* renamed from: d */
        public static final int f35309d = 32;

        /* renamed from: a */
        public final int[] f35311a;

        /* renamed from: a */
        public final int[][] f35312a;

        public C6816b(int i, int i2) {
            super(t02.this);
            int i3 = 1 << i;
            this.f35311a = new int[i3];
            int[] iArr = new int[2];
            iArr[1] = Math.max((i2 - 2) + 1, 16);
            iArr[0] = i3;
            this.f35312a = (int[][]) Array.newInstance(int.class, iArr);
        }

        /* renamed from: a */
        public void mo43776a() {
            super.mo43776a();
            int i = 0;
            while (true) {
                int[] iArr = this.f35311a;
                if (i < iArr.length) {
                    iArr[i] = 0;
                    i++;
                } else {
                    return;
                }
            }
        }

        /* renamed from: b */
        public void mo44712b(int i, int i2) throws IOException {
            int i3 = i - 2;
            if (i3 < 8) {
                t02.this.f35297a.mo46128b(this.f34443a, 0, 0);
                t02.this.f35297a.mo46129c(this.f34444a[i2], i3);
            } else {
                t02.this.f35297a.mo46128b(this.f34443a, 0, 1);
                int i4 = i3 - 8;
                if (i4 < 8) {
                    t02.this.f35297a.mo46128b(this.f34443a, 1, 0);
                    t02.this.f35297a.mo46129c(this.f34446b[i2], i4);
                } else {
                    t02.this.f35297a.mo46128b(this.f34443a, 1, 1);
                    t02.this.f35297a.mo46129c(this.f34445b, i4 - 8);
                }
            }
            int[] iArr = this.f35311a;
            iArr[i2] = iArr[i2] - 1;
        }

        /* renamed from: c */
        public int mo44713c(int i, int i2) {
            return this.f35312a[i2][i - 2];
        }

        /* renamed from: d */
        public void mo44714d() {
            int i = 0;
            while (true) {
                int[] iArr = this.f35311a;
                if (i < iArr.length) {
                    if (iArr[i] <= 0) {
                        iArr[i] = 32;
                        mo44715e(i);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }

        /* renamed from: e */
        public final void mo44715e(int i) {
            int g = ve3.m67977g(this.f34443a[0], 0);
            int i2 = 0;
            while (i2 < 8) {
                this.f35312a[i][i2] = ve3.m67978h(this.f34444a[i], i2) + g;
                i2++;
            }
            int g2 = ve3.m67977g(this.f34443a[0], 1);
            int g3 = ve3.m67977g(this.f34443a[1], 0);
            while (i2 < 16) {
                this.f35312a[i][i2] = g2 + g3 + ve3.m67978h(this.f34446b[i], i2 - 8);
                i2++;
            }
            int g4 = ve3.m67977g(this.f34443a[1], 1);
            while (true) {
                int[][] iArr = this.f35312a;
                if (i2 < iArr[i].length) {
                    iArr[i][i2] = g2 + g4 + ve3.m67978h(this.f34445b, (i2 - 8) - 8);
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: com.onedelhi.secure.t02$c */
    public class C6817c extends r02.C6631b {

        /* renamed from: a */
        public static final /* synthetic */ boolean f35313a = false;

        /* renamed from: a */
        public final C6818a[] f35315a;

        /* renamed from: com.onedelhi.secure.t02$c$a */
        public class C6818a extends r02.C6631b.C6632a {
            public C6818a() {
                super();
            }

            /* renamed from: b */
            public void mo44720b() throws IOException {
                t02 t02 = t02.this;
                int i = 256;
                int e = t02.f35294a.mo38969e(t02.f35307s) | 256;
                if (t02.this.f34428a.mo32227b()) {
                    do {
                        t02.this.f35297a.mo46128b(this.f34451a, e >>> 8, (e >>> 7) & 1);
                        e <<= 1;
                    } while (e < 65536);
                } else {
                    t02 t022 = t02.this;
                    int e2 = t022.f35294a.mo38969e(t022.f34429a[0] + 1 + t022.f35307s);
                    do {
                        e2 <<= 1;
                        t02.this.f35297a.mo46128b(this.f34451a, (e2 & i) + i + (e >>> 8), (e >>> 7) & 1);
                        e <<= 1;
                        i &= ~(e2 ^ e);
                    } while (e < 65536);
                }
                t02.this.f34428a.mo32230e();
            }

            /* renamed from: c */
            public int mo44721c(int i, int i2) {
                int i3 = 256;
                int i4 = i | 256;
                int i5 = 0;
                do {
                    i2 <<= 1;
                    i5 += ve3.m67977g(this.f34451a[(i2 & i3) + i3 + (i4 >>> 8)], (i4 >>> 7) & 1);
                    i4 <<= 1;
                    i3 &= ~(i2 ^ i4);
                } while (i4 < 65536);
                return i5;
            }

            /* renamed from: d */
            public int mo44722d(int i) {
                int i2 = i | 256;
                int i3 = 0;
                do {
                    i3 += ve3.m67977g(this.f34451a[i2 >>> 8], (i2 >>> 7) & 1);
                    i2 <<= 1;
                } while (i2 < 65536);
                return i3;
            }
        }

        public C6817c(int i, int i2) {
            super(i, i2);
            this.f35315a = new C6818a[(1 << (i + i2))];
            int i3 = 0;
            while (true) {
                C6818a[] aVarArr = this.f35315a;
                if (i3 < aVarArr.length) {
                    aVarArr[i3] = new C6818a();
                    i3++;
                } else {
                    return;
                }
            }
        }

        /* renamed from: b */
        public void mo44716b() throws IOException {
            t02 t02 = t02.this;
            this.f35315a[mo43777a(t02.f35294a.mo38969e(t02.f35307s + 1), t02.this.f35294a.mo38973l() - t02.this.f35307s)].mo44720b();
        }

        /* renamed from: c */
        public void mo44717c() throws IOException {
            this.f35315a[0].mo44720b();
        }

        /* renamed from: d */
        public int mo44718d(int i, int i2, int i3, int i4, c34 c34) {
            int g = ve3.m67977g(t02.this.f34431a[c34.mo32226a()][t02.this.f34427a & i4], 0);
            int a = mo43777a(i3, i4);
            return g + (c34.mo32227b() ? this.f35315a[a].mo44722d(i) : this.f35315a[a].mo44721c(i, i2));
        }

        /* renamed from: e */
        public void mo44719e() {
            int i = 0;
            while (true) {
                C6818a[] aVarArr = this.f35315a;
                if (i < aVarArr.length) {
                    aVarArr[i].mo43778a();
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t02(ve3 ve3, k02 k02, int i, int i2, int i3, int i4, int i5) {
        super(i3);
        Class<int> cls = int.class;
        this.f35301b = (int[][]) Array.newInstance(cls, new int[]{4, 128});
        this.f35300b = new int[16];
        this.f35306r = 0;
        this.f35307s = -1;
        this.f35308t = 0;
        this.f35297a = ve3;
        this.f35294a = k02;
        this.f35302n = i5;
        this.f35296a = new C6817c(i, i2);
        this.f35295a = new C6816b(i3, i5);
        this.f35299b = new C6816b(i3, i5);
        int m = m65078m(i4 - 1) + 1;
        this.f35305q = m;
        int[] iArr = new int[2];
        iArr[1] = m;
        iArr[0] = 4;
        this.f35298a = (int[][]) Array.newInstance(cls, iArr);
        mo43775b();
    }

    /* renamed from: m */
    public static int m65078m(int i) {
        int i2;
        int i3;
        if (i <= 4 && i >= 0) {
            return i;
        }
        if ((-65536 & i) == 0) {
            i3 = i << 16;
            i2 = 15;
        } else {
            i2 = 31;
            i3 = i;
        }
        if ((-16777216 & i3) == 0) {
            i3 <<= 8;
            i2 -= 8;
        }
        if ((-268435456 & i3) == 0) {
            i3 <<= 4;
            i2 -= 4;
        }
        if ((-1073741824 & i3) == 0) {
            i3 <<= 2;
            i2 -= 2;
        }
        if ((i3 & Integer.MIN_VALUE) == 0) {
            i2--;
        }
        return (i2 << 1) + ((i >>> (i2 - 1)) & 1);
    }

    /* renamed from: n */
    public static t02 m65079n(ve3 ve3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, C4477aa aaVar) {
        int i10 = i4;
        if (i10 == 1) {
            return new u02(ve3, i, i2, i3, i5, i6, i7, i8, i9, aaVar);
        }
        if (i10 == 2) {
            return new v02(ve3, i, i2, i3, i5, i6, i7, i8, i9, aaVar);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: t */
    public static int m65080t(int i, int i2, int i3, int i4) {
        int i5;
        if (i == 1) {
            i5 = u02.m66322F(i2, i3, i4);
        } else if (i == 2) {
            i5 = v02.m67567I(i2, i3, i4);
        } else {
            throw new IllegalArgumentException();
        }
        return i5 + 80;
    }

    /* renamed from: A */
    public void mo44688A(int i) {
        this.f35307s += i;
        this.f35294a.mo34464w(i);
    }

    /* renamed from: B */
    public final void mo44689B() {
        this.f35304p = 16;
        for (int i = 0; i < 16; i++) {
            this.f35300b[i] = ve3.m67980k(this.f34438e, i);
        }
    }

    /* renamed from: C */
    public final void mo44690C() {
        this.f35303o = 128;
        int i = 0;
        while (true) {
            if (i >= 4) {
                break;
            }
            for (int i2 = 0; i2 < this.f35305q; i2++) {
                this.f35298a[i][i2] = ve3.m67978h(this.f34435c[i], i2);
            }
            for (int i3 = 14; i3 < this.f35305q; i3++) {
                int[] iArr = this.f35298a[i];
                iArr[i3] = iArr[i3] + ve3.m67979i(((i3 >>> 1) - 1) - 4);
            }
            for (int i4 = 0; i4 < 4; i4++) {
                this.f35301b[i][i4] = this.f35298a[i][i4];
            }
            i++;
        }
        int i5 = 4;
        for (int i6 = 4; i6 < 14; i6++) {
            int i7 = ((i6 & 1) | 2) << ((i6 >>> 1) - 1);
            int i8 = i6 - 4;
            int length = this.f34437d[i8].length;
            for (int i9 = 0; i9 < length; i9++) {
                int k = ve3.m67980k(this.f34437d[i8], i5 - i7);
                for (int i10 = 0; i10 < 4; i10++) {
                    this.f35301b[i10][i5] = this.f35298a[i10][i6] + k;
                }
                i5++;
            }
        }
    }

    /* renamed from: D */
    public void mo44691D() {
        if (this.f35303o <= 0) {
            mo44690C();
        }
        if (this.f35304p <= 0) {
            mo44689B();
        }
        this.f35295a.mo44714d();
        this.f35299b.mo44714d();
    }

    /* renamed from: b */
    public void mo43775b() {
        super.mo43775b();
        this.f35296a.mo44719e();
        this.f35295a.mo43776a();
        this.f35299b.mo43776a();
        this.f35303o = 0;
        this.f35304p = 0;
        this.f35308t += this.f35307s + 1;
        this.f35307s = -1;
    }

    /* renamed from: d */
    public void mo44692d() throws IOException {
        if (this.f35294a.mo38975n() || mo44694f()) {
            do {
            } while (mo44698j());
        }
    }

    /* renamed from: e */
    public boolean mo44693e() {
        try {
            if (!this.f35294a.mo38975n() && !mo44694f()) {
                return false;
            }
            while (this.f35308t <= 2096879 && this.f35297a.mo46133j() <= 65510) {
                if (!mo44698j()) {
                    return false;
                }
            }
            return true;
        } catch (IOException unused) {
            throw new Error();
        }
    }

    /* renamed from: f */
    public final boolean mo44694f() throws IOException {
        if (!this.f35294a.mo38974m(0)) {
            return false;
        }
        mo44688A(1);
        this.f35297a.mo46128b(this.f34431a[this.f34428a.mo32226a()], 0, 0);
        this.f35296a.mo44717c();
        this.f35307s--;
        this.f35308t++;
        return true;
    }

    /* renamed from: g */
    public void mo44695g() throws IOException {
        int l = (this.f35294a.mo38973l() - this.f35307s) & this.f34427a;
        this.f35297a.mo46128b(this.f34431a[this.f34428a.mo32226a()], l, 1);
        this.f35297a.mo46128b(this.f34430a, this.f34428a.mo32226a(), 0);
        mo44696h(-1, 2, l);
    }

    /* renamed from: h */
    public final void mo44696h(int i, int i2, int i3) throws IOException {
        this.f34428a.mo32232g();
        this.f35295a.mo44712b(i2, i3);
        int m = m65078m(i);
        this.f35297a.mo46129c(this.f34435c[r02.m63304a(i2)], m);
        if (m >= 4) {
            int i4 = (m >>> 1) - 1;
            int i5 = i - (((m & 1) | 2) << i4);
            if (m < 14) {
                this.f35297a.mo46131e(this.f34437d[m - 4], i5);
            } else {
                this.f35297a.mo46130d(i5 >>> 4, i4 - 4);
                this.f35297a.mo46131e(this.f34438e, i5 & 15);
                this.f35304p--;
            }
        }
        int[] iArr = this.f34429a;
        iArr[3] = iArr[2];
        iArr[2] = iArr[1];
        iArr[1] = iArr[0];
        iArr[0] = i;
        this.f35303o--;
    }

    /* renamed from: i */
    public final void mo44697i(int i, int i2, int i3) throws IOException {
        int i4 = 0;
        if (i == 0) {
            this.f35297a.mo46128b(this.f34432b, this.f34428a.mo32226a(), 0);
            ve3 ve3 = this.f35297a;
            short[] sArr = this.f34433b[this.f34428a.mo32226a()];
            if (i2 != 1) {
                i4 = 1;
            }
            ve3.mo46128b(sArr, i3, i4);
        } else {
            int i5 = this.f34429a[i];
            this.f35297a.mo46128b(this.f34432b, this.f34428a.mo32226a(), 1);
            if (i == 1) {
                this.f35297a.mo46128b(this.f34434c, this.f34428a.mo32226a(), 0);
            } else {
                this.f35297a.mo46128b(this.f34434c, this.f34428a.mo32226a(), 1);
                this.f35297a.mo46128b(this.f34436d, this.f34428a.mo32226a(), i - 2);
                if (i == 3) {
                    int[] iArr = this.f34429a;
                    iArr[3] = iArr[2];
                }
                int[] iArr2 = this.f34429a;
                iArr2[2] = iArr2[1];
            }
            int[] iArr3 = this.f34429a;
            iArr3[1] = iArr3[0];
            iArr3[0] = i5;
        }
        if (i2 == 1) {
            this.f34428a.mo32233h();
            return;
        }
        this.f35299b.mo44712b(i2, i3);
        this.f34428a.mo32231f();
    }

    /* renamed from: j */
    public final boolean mo44698j() throws IOException {
        if (!this.f35294a.mo38974m(this.f35307s + 1)) {
            return false;
        }
        int u = mo44706u();
        int l = (this.f35294a.mo38973l() - this.f35307s) & this.f34427a;
        if (this.f35306r == -1) {
            this.f35297a.mo46128b(this.f34431a[this.f34428a.mo32226a()], l, 0);
            this.f35296a.mo44716b();
        } else {
            this.f35297a.mo46128b(this.f34431a[this.f34428a.mo32226a()], l, 1);
            if (this.f35306r < 4) {
                this.f35297a.mo46128b(this.f34430a, this.f34428a.mo32226a(), 1);
                mo44697i(this.f35306r, u, l);
            } else {
                this.f35297a.mo46128b(this.f34430a, this.f34428a.mo32226a(), 0);
                mo44696h(this.f35306r - 4, u, l);
            }
        }
        this.f35307s -= u;
        this.f35308t += u;
        return true;
    }

    /* renamed from: k */
    public int mo44699k(c34 c34, int i) {
        return ve3.m67977g(this.f34431a[c34.mo32226a()][i], 1);
    }

    /* renamed from: l */
    public int mo44700l(int i, c34 c34) {
        return i + ve3.m67977g(this.f34430a[c34.mo32226a()], 1);
    }

    /* renamed from: o */
    public k02 mo44701o() {
        return this.f35294a;
    }

    /* renamed from: p */
    public int mo44702p(int i, int i2, c34 c34, int i3) {
        return mo44703q(mo44700l(mo44699k(c34, i3), c34), i, c34, i3) + this.f35299b.mo44713c(i2, i3);
    }

    /* renamed from: q */
    public int mo44703q(int i, int i2, c34 c34, int i3) {
        int g;
        if (i2 == 0) {
            g = ve3.m67977g(this.f34432b[c34.mo32226a()], 0) + ve3.m67977g(this.f34433b[c34.mo32226a()][i3], 1);
        } else {
            i += ve3.m67977g(this.f34432b[c34.mo32226a()], 1);
            if (i2 != 1) {
                return i + ve3.m67977g(this.f34434c[c34.mo32226a()], 1) + ve3.m67977g(this.f34436d[c34.mo32226a()], i2 - 2);
            }
            g = ve3.m67977g(this.f34434c[c34.mo32226a()], 0);
        }
        return i + g;
    }

    /* renamed from: r */
    public int mo44704r(int i, int i2, int i3, int i4) {
        int c = i + this.f35295a.mo44713c(i3, i4);
        int a = r02.m63304a(i3);
        if (i2 < 128) {
            return c + this.f35301b[a][i2];
        }
        return c + this.f35298a[a][m65078m(i2)] + this.f35300b[i2 & 15];
    }

    /* renamed from: s */
    public fe2 mo44705s() {
        this.f35307s++;
        return this.f35294a.mo34462j();
    }

    /* renamed from: u */
    public abstract int mo44706u();

    /* renamed from: v */
    public int mo44707v(int i, c34 c34) {
        return i + ve3.m67977g(this.f34430a[c34.mo32226a()], 0);
    }

    /* renamed from: w */
    public int mo44708w(int i, c34 c34, int i2) {
        return i + ve3.m67977g(this.f34432b[c34.mo32226a()], 0) + ve3.m67977g(this.f34433b[c34.mo32226a()][i2], 0);
    }

    /* renamed from: x */
    public int mo44709x() {
        return this.f35308t;
    }

    /* renamed from: y */
    public void mo44710y(C4477aa aaVar) {
        this.f35294a.mo34463s(aaVar);
    }

    /* renamed from: z */
    public void mo44711z() {
        this.f35308t = 0;
    }
}
