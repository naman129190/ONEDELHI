package com.onedelhi.secure;

public final class vg3 {

    /* renamed from: a */
    public final te1 f36543a;

    public vg3(te1 te1) {
        this.f36543a = te1;
    }

    /* renamed from: a */
    public void mo46148a(int[] iArr, int i) throws xg3 {
        ue1 ue1 = new ue1(this.f36543a, iArr);
        int[] iArr2 = new int[i];
        int i2 = 0;
        boolean z = true;
        for (int i3 = 0; i3 < i; i3++) {
            te1 te1 = this.f36543a;
            int c = ue1.mo45566c(te1.mo44964c(te1.mo44965d() + i3));
            iArr2[(i - 1) - i3] = c;
            if (c != 0) {
                z = false;
            }
        }
        if (!z) {
            ue1[] d = mo46151d(this.f36543a.mo44963b(i, 1), new ue1(this.f36543a, iArr2), i);
            ue1 ue12 = d[0];
            ue1 ue13 = d[1];
            int[] b = mo46149b(ue12);
            int[] c2 = mo46150c(ue13, b);
            while (i2 < b.length) {
                int length = (iArr.length - 1) - this.f36543a.mo44970i(b[i2]);
                if (length >= 0) {
                    iArr[length] = te1.m65582a(iArr[length], c2[i2]);
                    i2++;
                } else {
                    throw new xg3("Bad error location");
                }
            }
        }
    }

    /* renamed from: b */
    public final int[] mo46149b(ue1 ue1) throws xg3 {
        int f = ue1.mo45569f();
        int i = 0;
        if (f == 1) {
            return new int[]{ue1.mo45567d(1)};
        }
        int[] iArr = new int[f];
        for (int i2 = 1; i2 < this.f36543a.mo44967f() && i < f; i2++) {
            if (ue1.mo45566c(i2) == 0) {
                iArr[i] = this.f36543a.mo44969h(i2);
                i++;
            }
        }
        if (i == f) {
            return iArr;
        }
        throw new xg3("Error locator degree does not match number of roots");
    }

    /* renamed from: c */
    public final int[] mo46150c(ue1 ue1, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            int h = this.f36543a.mo44969h(iArr[i]);
            int i2 = 1;
            for (int i3 = 0; i3 < length; i3++) {
                if (i != i3) {
                    int j = this.f36543a.mo44971j(iArr[i3], h);
                    i2 = this.f36543a.mo44971j(i2, (j & 1) == 0 ? j | 1 : j & -2);
                }
            }
            iArr2[i] = this.f36543a.mo44971j(ue1.mo45566c(h), this.f36543a.mo44969h(i2));
            if (this.f36543a.mo44965d() != 0) {
                iArr2[i] = this.f36543a.mo44971j(iArr2[i], h);
            }
        }
        return iArr2;
    }

    /* renamed from: d */
    public final ue1[] mo46151d(ue1 ue1, ue1 ue12, int i) throws xg3 {
        if (ue1.mo45569f() < ue12.mo45569f()) {
            ue1 ue13 = ue12;
            ue12 = ue1;
            ue1 = ue13;
        }
        ue1 g = this.f36543a.mo44968g();
        ue1 e = this.f36543a.mo44966e();
        do {
            ue1 ue14 = r11;
            r11 = ue1;
            ue1 = ue14;
            ue1 ue15 = e;
            ue1 ue16 = g;
            g = ue15;
            if (ue1.mo45569f() < i / 2) {
                int d = g.mo45567d(0);
                if (d != 0) {
                    int h = this.f36543a.mo44969h(d);
                    return new ue1[]{g.mo45571h(h), ue1.mo45571h(h)};
                }
                throw new xg3("sigmaTilde(0) was zero");
            } else if (!ue1.mo45570g()) {
                ue1 g2 = this.f36543a.mo44968g();
                int h2 = this.f36543a.mo44969h(ue1.mo45567d(ue1.mo45569f()));
                while (r11.mo45569f() >= ue1.mo45569f() && !r11.mo45570g()) {
                    int f = r11.mo45569f() - ue1.mo45569f();
                    int j = this.f36543a.mo44971j(r11.mo45567d(r11.mo45569f()), h2);
                    g2 = g2.mo45564a(this.f36543a.mo44963b(f, j));
                    r11 = r11.mo45564a(ue1.mo45573j(f, j));
                }
                e = g2.mo45572i(g).mo45564a(ue16);
            } else {
                throw new xg3("r_{i-1} was zero");
            }
        } while (r11.mo45569f() < ue1.mo45569f());
        throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
    }
}
