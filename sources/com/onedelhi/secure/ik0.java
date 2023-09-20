package com.onedelhi.secure;

public final class ik0 extends hk0 {

    /* renamed from: a */
    public final boolean f30350a;

    public ik0(C7173wn wnVar, boolean z) {
        super(wnVar);
        this.f30350a = z;
    }

    /* renamed from: g */
    public void mo38121g(C4559aj ajVar) {
        k00[] d = mo37373d();
        mo38127m();
        mo38126l(d, ajVar);
        C7173wn a = mo37370a();
        sl3 h = this.f30350a ? a.mo46808h() : a.mo46809i();
        sl3 b = this.f30350a ? a.mo46802b() : a.mo46803c();
        int e = mo37374e((int) h.mo44404d());
        int e2 = mo37374e((int) b.mo44404d());
        int i = -1;
        int i2 = 0;
        int i3 = 1;
        while (e < e2) {
            if (d[e] != null) {
                k00 k00 = d[e];
                int c = k00.mo38957c() - i;
                if (c == 0) {
                    i2++;
                } else {
                    if (c == 1) {
                        i3 = Math.max(i3, i2);
                    } else if (c < 0 || k00.mo38957c() >= ajVar.mo30936c() || c > e) {
                        d[e] = null;
                    } else {
                        if (i3 > 2) {
                            c *= i3 - 2;
                        }
                        boolean z = c >= e;
                        for (int i4 = 1; i4 <= c && !z; i4++) {
                            z = d[e - i4] != null;
                        }
                        if (z) {
                            d[e] = null;
                        }
                    }
                    i = k00.mo38957c();
                    i2 = 1;
                }
            }
            e++;
        }
    }

    /* renamed from: h */
    public final void mo38122h(C4559aj ajVar) {
        C7173wn a = mo37370a();
        sl3 h = this.f30350a ? a.mo46808h() : a.mo46809i();
        sl3 b = this.f30350a ? a.mo46802b() : a.mo46803c();
        int e = mo37374e((int) b.mo44404d());
        k00[] d = mo37373d();
        int i = -1;
        int i2 = 0;
        int i3 = 1;
        for (int e2 = mo37374e((int) h.mo44404d()); e2 < e; e2++) {
            if (d[e2] != null) {
                k00 k00 = d[e2];
                k00.mo38964j();
                int c = k00.mo38957c() - i;
                if (c == 0) {
                    i2++;
                } else {
                    if (c == 1) {
                        i3 = Math.max(i3, i2);
                    } else if (k00.mo38957c() >= ajVar.mo30936c()) {
                        d[e2] = null;
                    }
                    i = k00.mo38957c();
                    i2 = 1;
                }
            }
        }
    }

    /* renamed from: i */
    public C4559aj mo38123i() {
        k00[] d = mo37373d();
        C5031dj djVar = new C5031dj();
        C5031dj djVar2 = new C5031dj();
        C5031dj djVar3 = new C5031dj();
        C5031dj djVar4 = new C5031dj();
        for (k00 k00 : d) {
            if (k00 != null) {
                k00.mo38964j();
                int e = k00.mo38959e() % 30;
                int c = k00.mo38957c();
                if (!this.f30350a) {
                    c += 2;
                }
                int i = c % 3;
                if (i == 0) {
                    djVar2.mo34474c((e * 3) + 1);
                } else if (i == 1) {
                    djVar4.mo34474c(e / 3);
                    djVar3.mo34474c(e % 3);
                } else if (i == 2) {
                    djVar.mo34474c(e + 1);
                }
            }
        }
        if (djVar.mo34473b().length == 0 || djVar2.mo34473b().length == 0 || djVar3.mo34473b().length == 0 || djVar4.mo34473b().length == 0 || djVar.mo34473b()[0] <= 0 || djVar2.mo34473b()[0] + djVar3.mo34473b()[0] < 3 || djVar2.mo34473b()[0] + djVar3.mo34473b()[0] > 90) {
            return null;
        }
        C4559aj ajVar = new C4559aj(djVar.mo34473b()[0], djVar2.mo34473b()[0], djVar3.mo34473b()[0], djVar4.mo34473b()[0]);
        mo38126l(d, ajVar);
        return ajVar;
    }

    /* renamed from: j */
    public int[] mo38124j() {
        int c;
        C4559aj i = mo38123i();
        if (i == null) {
            return null;
        }
        mo38122h(i);
        int c2 = i.mo30936c();
        int[] iArr = new int[c2];
        for (k00 k00 : mo37373d()) {
            if (k00 != null && (c = k00.mo38957c()) < c2) {
                iArr[c] = iArr[c] + 1;
            }
        }
        return iArr;
    }

    /* renamed from: k */
    public boolean mo38125k() {
        return this.f30350a;
    }

    /* renamed from: l */
    public final void mo38126l(k00[] k00Arr, C4559aj ajVar) {
        for (int i = 0; i < k00Arr.length; i++) {
            k00 k00 = k00Arr[i];
            if (k00Arr[i] != null) {
                int e = k00.mo38959e() % 30;
                int c = k00.mo38957c();
                if (c > ajVar.mo30936c()) {
                    k00Arr[i] = null;
                } else {
                    if (!this.f30350a) {
                        c += 2;
                    }
                    int i2 = c % 3;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2 && e + 1 != ajVar.mo30934a()) {
                                k00Arr[i] = null;
                            }
                        } else if (e / 3 != ajVar.mo30935b() || e % 3 != ajVar.mo30937d()) {
                            k00Arr[i] = null;
                        }
                    } else if ((e * 3) + 1 != ajVar.mo30938e()) {
                        k00Arr[i] = null;
                    }
                }
            }
        }
    }

    /* renamed from: m */
    public final void mo38127m() {
        for (k00 k00 : mo37373d()) {
            if (k00 != null) {
                k00.mo38964j();
            }
        }
    }

    public String toString() {
        return "IsLeft: " + this.f30350a + 10 + super.toString();
    }
}
