package com.onedelhi.secure;

import com.onedelhi.secure.p32;
import com.onedelhi.secure.v04;
import java.util.ArrayList;

/* renamed from: com.onedelhi.secure.ta */
public class C3580ta implements p32.C3123a {

    /* renamed from: c */
    public static final boolean f20715c = false;

    /* renamed from: d */
    public static final boolean f20716d = false;

    /* renamed from: a */
    public float f20717a = 0.0f;

    /* renamed from: a */
    public C3581a f20718a;

    /* renamed from: a */
    public v04 f20719a = null;

    /* renamed from: a */
    public ArrayList<v04> f20720a = new ArrayList<>();

    /* renamed from: a */
    public boolean f20721a = false;

    /* renamed from: b */
    public boolean f20722b = false;

    /* renamed from: com.onedelhi.secure.ta$a */
    public interface C3581a {
        /* renamed from: a */
        void mo20208a();

        /* renamed from: b */
        int mo20209b();

        /* renamed from: c */
        float mo20210c(v04 v04);

        void clear();

        /* renamed from: d */
        v04 mo20212d(int i);

        /* renamed from: e */
        void mo20213e(v04 v04, float f, boolean z);

        /* renamed from: f */
        float mo20214f(C3580ta taVar, boolean z);

        /* renamed from: g */
        int mo20215g(v04 v04);

        /* renamed from: h */
        void mo20216h(float f);

        /* renamed from: i */
        float mo20217i(v04 v04, boolean z);

        /* renamed from: j */
        void mo20218j();

        /* renamed from: k */
        void mo20219k(v04 v04, float f);

        /* renamed from: l */
        boolean mo20220l(v04 v04);

        /* renamed from: m */
        float mo20221m(int i);

        /* renamed from: n */
        int mo20222n();
    }

    public C3580ta() {
    }

    public C3580ta(C1990ds dsVar) {
        this.f20718a = new C2842ma(this, dsVar);
    }

    /* renamed from: A */
    public final boolean mo24789A(v04 v04, p32 p32) {
        return v04.f21621r <= 1;
    }

    /* renamed from: B */
    public v04 mo24790B(v04 v04) {
        return mo24791C((boolean[]) null, v04);
    }

    /* renamed from: C */
    public final v04 mo24791C(boolean[] zArr, v04 v04) {
        v04.C3759b bVar;
        int b = this.f20718a.mo20209b();
        v04 v042 = null;
        float f = 0.0f;
        for (int i = 0; i < b; i++) {
            float m = this.f20718a.mo20221m(i);
            if (m < 0.0f) {
                v04 d = this.f20718a.mo20212d(i);
                if ((zArr == null || !zArr[d.f21617n]) && d != v04 && (((bVar = d.f21607a) == v04.C3759b.SLACK || bVar == v04.C3759b.ERROR) && m < f)) {
                    f = m;
                    v042 = d;
                }
            }
        }
        return v042;
    }

    /* renamed from: D */
    public void mo24792D(v04 v04) {
        v04 v042 = this.f20719a;
        if (v042 != null) {
            this.f20718a.mo20219k(v042, -1.0f);
            this.f20719a.f21618o = -1;
            this.f20719a = null;
        }
        float i = this.f20718a.mo20217i(v04, true) * -1.0f;
        this.f20719a = v04;
        if (i != 1.0f) {
            this.f20717a /= i;
            this.f20718a.mo20216h(i);
        }
    }

    /* renamed from: E */
    public void mo24793E() {
        this.f20719a = null;
        this.f20718a.clear();
        this.f20717a = 0.0f;
        this.f20722b = false;
    }

    /* renamed from: F */
    public int mo24794F() {
        return (this.f20719a != null ? 4 : 0) + 4 + 4 + this.f20718a.mo20222n();
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b7  */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo24795G() {
        /*
            r10 = this;
            com.onedelhi.secure.v04 r0 = r10.f20719a
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0014
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            goto L_0x0021
        L_0x0014:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            com.onedelhi.secure.v04 r1 = r10.f20719a
            r0.append(r1)
        L_0x0021:
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r10.f20717a
            r2 = 0
            r3 = 1
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0052
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f20717a
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            goto L_0x0053
        L_0x0052:
            r1 = 0
        L_0x0053:
            com.onedelhi.secure.ta$a r5 = r10.f20718a
            int r5 = r5.mo20209b()
        L_0x0059:
            if (r2 >= r5) goto L_0x00d2
            com.onedelhi.secure.ta$a r6 = r10.f20718a
            com.onedelhi.secure.v04 r6 = r6.mo20212d(r2)
            if (r6 != 0) goto L_0x0064
            goto L_0x00cf
        L_0x0064:
            com.onedelhi.secure.ta$a r7 = r10.f20718a
            float r7 = r7.mo20221m(r2)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x006f
            goto L_0x00cf
        L_0x006f:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0086
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x00ab
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            goto L_0x00a2
        L_0x0086:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            if (r8 <= 0) goto L_0x009a
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00ab
        L_0x009a:
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
        L_0x00a2:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r7 = r7 * r9
        L_0x00ab:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00b7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L_0x00c4
        L_0x00b7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        L_0x00c4:
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            r1 = 1
        L_0x00cf:
            int r2 = r2 + 1
            goto L_0x0059
        L_0x00d2:
            if (r1 != 0) goto L_0x00e5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00e5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C3580ta.mo24795G():java.lang.String");
    }

    /* renamed from: H */
    public void mo24796H(p32 p32, v04 v04, boolean z) {
        if (v04 != null && v04.f21616d) {
            float c = this.f20718a.mo20210c(v04);
            this.f20717a += v04.f21611b * c;
            this.f20718a.mo20217i(v04, z);
            if (z) {
                v04.mo25826r(this);
            }
            this.f20718a.mo20213e(p32.f18341a.f10889a[v04.f21622s], c, z);
            if (p32.f18336j && this.f20718a.mo20209b() == 0) {
                this.f20722b = true;
                p32.f18344a = true;
            }
        }
    }

    /* renamed from: a */
    public void mo22296a(p32 p32, v04 v04, boolean z) {
        if (v04 != null && v04.f21615c) {
            this.f20717a += v04.f21606a * this.f20718a.mo20210c(v04);
            this.f20718a.mo20217i(v04, z);
            if (z) {
                v04.mo25826r(this);
            }
            if (p32.f18336j && this.f20718a.mo20209b() == 0) {
                this.f20722b = true;
                p32.f18344a = true;
            }
        }
    }

    /* renamed from: b */
    public void mo22297b(p32.C3123a aVar) {
        if (aVar instanceof C3580ta) {
            C3580ta taVar = (C3580ta) aVar;
            this.f20719a = null;
            this.f20718a.clear();
            for (int i = 0; i < taVar.f20718a.mo20209b(); i++) {
                this.f20718a.mo20213e(taVar.f20718a.mo20212d(i), taVar.f20718a.mo20221m(i), true);
            }
        }
    }

    /* renamed from: c */
    public void mo16343c(v04 v04) {
        int i = v04.f21619p;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.f20718a.mo20219k(v04, f);
    }

    public void clear() {
        this.f20718a.clear();
        this.f20719a = null;
        this.f20717a = 0.0f;
    }

    /* renamed from: d */
    public void mo22298d(p32 p32) {
        if (p32.f18345a.length != 0) {
            boolean z = false;
            while (!z) {
                int b = this.f20718a.mo20209b();
                for (int i = 0; i < b; i++) {
                    v04 d = this.f20718a.mo20212d(i);
                    if (d.f21618o != -1 || d.f21615c || d.f21616d) {
                        this.f20720a.add(d);
                    }
                }
                int size = this.f20720a.size();
                if (size > 0) {
                    for (int i2 = 0; i2 < size; i2++) {
                        v04 v04 = this.f20720a.get(i2);
                        if (v04.f21615c) {
                            mo22296a(p32, v04, true);
                        } else if (v04.f21616d) {
                            mo24796H(p32, v04, true);
                        } else {
                            mo16345f(p32, p32.f18345a[v04.f21618o], true);
                        }
                    }
                    this.f20720a.clear();
                } else {
                    z = true;
                }
            }
            if (p32.f18336j && this.f20719a != null && this.f20718a.mo20209b() == 0) {
                this.f20722b = true;
                p32.f18344a = true;
            }
        }
    }

    /* renamed from: e */
    public v04 mo22299e() {
        return this.f20719a;
    }

    /* renamed from: f */
    public void mo16345f(p32 p32, C3580ta taVar, boolean z) {
        this.f20717a += taVar.f20717a * this.f20718a.mo20214f(taVar, z);
        if (z) {
            taVar.f20719a.mo25826r(this);
        }
        if (p32.f18336j && this.f20719a != null && this.f20718a.mo20209b() == 0) {
            this.f20722b = true;
            p32.f18344a = true;
        }
    }

    /* renamed from: g */
    public v04 mo16346g(p32 p32, boolean[] zArr) {
        return mo24791C(zArr, (v04) null);
    }

    /* renamed from: h */
    public C3580ta mo24797h(p32 p32, int i) {
        this.f20718a.mo20219k(p32.mo22289s(i, "ep"), 1.0f);
        this.f20718a.mo20219k(p32.mo22289s(i, "em"), -1.0f);
        return this;
    }

    /* renamed from: i */
    public C3580ta mo24798i(v04 v04, int i) {
        this.f20718a.mo20219k(v04, (float) i);
        return this;
    }

    public boolean isEmpty() {
        return this.f20719a == null && this.f20717a == 0.0f && this.f20718a.mo20209b() == 0;
    }

    /* renamed from: j */
    public boolean mo24799j(p32 p32) {
        boolean z;
        v04 k = mo24800k(p32);
        if (k == null) {
            z = true;
        } else {
            mo24792D(k);
            z = false;
        }
        if (this.f20718a.mo20209b() == 0) {
            this.f20722b = true;
        }
        return z;
    }

    /* renamed from: k */
    public v04 mo24800k(p32 p32) {
        int b = this.f20718a.mo20209b();
        v04 v04 = null;
        v04 v042 = null;
        boolean z = false;
        boolean z2 = false;
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i = 0; i < b; i++) {
            float m = this.f20718a.mo20221m(i);
            v04 d = this.f20718a.mo20212d(i);
            if (d.f21607a == v04.C3759b.UNRESTRICTED) {
                if (v04 == null || f > m) {
                    z = mo24789A(d, p32);
                    f = m;
                    v04 = d;
                } else if (!z && mo24789A(d, p32)) {
                    f = m;
                    v04 = d;
                    z = true;
                }
            } else if (v04 == null && m < 0.0f) {
                if (v042 == null || f2 > m) {
                    z2 = mo24789A(d, p32);
                    f2 = m;
                    v042 = d;
                } else if (!z2 && mo24789A(d, p32)) {
                    f2 = m;
                    v042 = d;
                    z2 = true;
                }
            }
        }
        return v04 != null ? v04 : v042;
    }

    /* renamed from: l */
    public C3580ta mo24801l(v04 v04, v04 v042, int i, float f, v04 v043, v04 v044, int i2) {
        float f2;
        int i3;
        if (v042 == v043) {
            this.f20718a.mo20219k(v04, 1.0f);
            this.f20718a.mo20219k(v044, 1.0f);
            this.f20718a.mo20219k(v042, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.f20718a.mo20219k(v04, 1.0f);
            this.f20718a.mo20219k(v042, -1.0f);
            this.f20718a.mo20219k(v043, -1.0f);
            this.f20718a.mo20219k(v044, 1.0f);
            if (i > 0 || i2 > 0) {
                i3 = (-i) + i2;
            }
            return this;
        }
        if (f <= 0.0f) {
            this.f20718a.mo20219k(v04, -1.0f);
            this.f20718a.mo20219k(v042, 1.0f);
            f2 = (float) i;
        } else if (f >= 1.0f) {
            this.f20718a.mo20219k(v044, -1.0f);
            this.f20718a.mo20219k(v043, 1.0f);
            i3 = -i2;
        } else {
            float f3 = 1.0f - f;
            this.f20718a.mo20219k(v04, f3 * 1.0f);
            this.f20718a.mo20219k(v042, f3 * -1.0f);
            this.f20718a.mo20219k(v043, -1.0f * f);
            this.f20718a.mo20219k(v044, 1.0f * f);
            if (i > 0 || i2 > 0) {
                f2 = (((float) (-i)) * f3) + (((float) i2) * f);
            }
            return this;
        }
        this.f20717a = f2;
        return this;
        f2 = (float) i3;
        this.f20717a = f2;
        return this;
    }

    /* renamed from: m */
    public C3580ta mo24802m(v04 v04, int i) {
        this.f20719a = v04;
        float f = (float) i;
        v04.f21606a = f;
        this.f20717a = f;
        this.f20722b = true;
        return this;
    }

    /* renamed from: n */
    public C3580ta mo24803n(v04 v04, v04 v042, float f) {
        this.f20718a.mo20219k(v04, -1.0f);
        this.f20718a.mo20219k(v042, f);
        return this;
    }

    /* renamed from: o */
    public C3580ta mo24804o(v04 v04, v04 v042, v04 v043, v04 v044, float f) {
        this.f20718a.mo20219k(v04, -1.0f);
        this.f20718a.mo20219k(v042, 1.0f);
        this.f20718a.mo20219k(v043, f);
        this.f20718a.mo20219k(v044, -f);
        return this;
    }

    /* renamed from: p */
    public C3580ta mo24805p(float f, float f2, float f3, v04 v04, int i, v04 v042, int i2, v04 v043, int i3, v04 v044, int i4) {
        if (f2 == 0.0f || f == f3) {
            this.f20717a = (float) (((-i) - i2) + i3 + i4);
            this.f20718a.mo20219k(v04, 1.0f);
            this.f20718a.mo20219k(v042, -1.0f);
            this.f20718a.mo20219k(v044, 1.0f);
            this.f20718a.mo20219k(v043, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f20717a = ((float) ((-i) - i2)) + (((float) i3) * f4) + (((float) i4) * f4);
            this.f20718a.mo20219k(v04, 1.0f);
            this.f20718a.mo20219k(v042, -1.0f);
            this.f20718a.mo20219k(v044, f4);
            this.f20718a.mo20219k(v043, -f4);
        }
        return this;
    }

    /* renamed from: q */
    public C3580ta mo24806q(float f, float f2, float f3, v04 v04, v04 v042, v04 v043, v04 v044) {
        this.f20717a = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.f20718a.mo20219k(v04, 1.0f);
            this.f20718a.mo20219k(v042, -1.0f);
            this.f20718a.mo20219k(v044, 1.0f);
            this.f20718a.mo20219k(v043, -1.0f);
        } else if (f == 0.0f) {
            this.f20718a.mo20219k(v04, 1.0f);
            this.f20718a.mo20219k(v042, -1.0f);
        } else if (f3 == 0.0f) {
            this.f20718a.mo20219k(v043, 1.0f);
            this.f20718a.mo20219k(v044, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f20718a.mo20219k(v04, 1.0f);
            this.f20718a.mo20219k(v042, -1.0f);
            this.f20718a.mo20219k(v044, f4);
            this.f20718a.mo20219k(v043, -f4);
        }
        return this;
    }

    /* renamed from: r */
    public C3580ta mo24807r(v04 v04, int i) {
        C3581a aVar;
        float f;
        if (i < 0) {
            this.f20717a = (float) (i * -1);
            aVar = this.f20718a;
            f = 1.0f;
        } else {
            this.f20717a = (float) i;
            aVar = this.f20718a;
            f = -1.0f;
        }
        aVar.mo20219k(v04, f);
        return this;
    }

    /* renamed from: s */
    public C3580ta mo24808s(v04 v04, v04 v042, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f20717a = (float) i;
        }
        if (!z) {
            this.f20718a.mo20219k(v04, -1.0f);
            this.f20718a.mo20219k(v042, 1.0f);
        } else {
            this.f20718a.mo20219k(v04, 1.0f);
            this.f20718a.mo20219k(v042, -1.0f);
        }
        return this;
    }

    /* renamed from: t */
    public C3580ta mo24809t(v04 v04, int i, v04 v042) {
        this.f20717a = (float) i;
        this.f20718a.mo20219k(v04, -1.0f);
        return this;
    }

    public String toString() {
        return mo24795G();
    }

    /* renamed from: u */
    public C3580ta mo24810u(v04 v04, v04 v042, v04 v043, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f20717a = (float) i;
        }
        if (!z) {
            this.f20718a.mo20219k(v04, -1.0f);
            this.f20718a.mo20219k(v042, 1.0f);
            this.f20718a.mo20219k(v043, 1.0f);
        } else {
            this.f20718a.mo20219k(v04, 1.0f);
            this.f20718a.mo20219k(v042, -1.0f);
            this.f20718a.mo20219k(v043, -1.0f);
        }
        return this;
    }

    /* renamed from: v */
    public C3580ta mo24811v(v04 v04, v04 v042, v04 v043, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f20717a = (float) i;
        }
        if (!z) {
            this.f20718a.mo20219k(v04, -1.0f);
            this.f20718a.mo20219k(v042, 1.0f);
            this.f20718a.mo20219k(v043, -1.0f);
        } else {
            this.f20718a.mo20219k(v04, 1.0f);
            this.f20718a.mo20219k(v042, -1.0f);
            this.f20718a.mo20219k(v043, 1.0f);
        }
        return this;
    }

    /* renamed from: w */
    public C3580ta mo24812w(v04 v04, v04 v042, v04 v043, v04 v044, float f) {
        this.f20718a.mo20219k(v043, 0.5f);
        this.f20718a.mo20219k(v044, 0.5f);
        this.f20718a.mo20219k(v04, -0.5f);
        this.f20718a.mo20219k(v042, -0.5f);
        this.f20717a = -f;
        return this;
    }

    /* renamed from: x */
    public void mo24813x() {
        float f = this.f20717a;
        if (f < 0.0f) {
            this.f20717a = f * -1.0f;
            this.f20718a.mo20218j();
        }
    }

    /* renamed from: y */
    public boolean mo24814y() {
        v04 v04 = this.f20719a;
        return v04 != null && (v04.f21607a == v04.C3759b.UNRESTRICTED || this.f20717a >= 0.0f);
    }

    /* renamed from: z */
    public boolean mo24815z(v04 v04) {
        return this.f20718a.mo20220l(v04);
    }
}
