package com.onedelhi.secure;

public final class iv0 {

    /* renamed from: a */
    public final ck2 f30474a = ck2.f26875a;

    /* renamed from: a */
    public int mo38253a(int[] iArr, int i, int[] iArr2) throws C6619qx {
        dk2 dk2 = new dk2(this.f30474a, iArr);
        int[] iArr3 = new int[i];
        int i2 = 0;
        boolean z = false;
        for (int i3 = i; i3 > 0; i3--) {
            int b = dk2.mo34480b(this.f30474a.mo33770c(i3));
            iArr3[i - i3] = b;
            if (b != 0) {
                z = true;
            }
        }
        if (!z) {
            return 0;
        }
        dk2 d = this.f30474a.mo33771d();
        if (iArr2 != null) {
            for (int length : iArr2) {
                int c = this.f30474a.mo33770c((iArr.length - 1) - length);
                ck2 ck2 = this.f30474a;
                d = d.mo34486h(new dk2(ck2, new int[]{ck2.mo33777j(0, c), 1}));
            }
        }
        dk2[] d2 = mo38256d(this.f30474a.mo33769b(i, 1), new dk2(this.f30474a, iArr3), i);
        dk2 dk22 = d2[0];
        dk2 dk23 = d2[1];
        int[] b2 = mo38254b(dk22);
        int[] c2 = mo38255c(dk23, dk22, b2);
        while (i2 < b2.length) {
            int length2 = (iArr.length - 1) - this.f30474a.mo33775h(b2[i2]);
            if (length2 >= 0) {
                iArr[length2] = this.f30474a.mo33777j(iArr[length2], c2[i2]);
                i2++;
            } else {
                throw C6619qx.m63242a();
            }
        }
        return b2.length;
    }

    /* renamed from: b */
    public final int[] mo38254b(dk2 dk2) throws C6619qx {
        int e = dk2.mo34483e();
        int[] iArr = new int[e];
        int i = 0;
        for (int i2 = 1; i2 < this.f30474a.mo33772e() && i < e; i2++) {
            if (dk2.mo34480b(i2) == 0) {
                iArr[i] = this.f30474a.mo33774g(i2);
                i++;
            }
        }
        if (i == e) {
            return iArr;
        }
        throw C6619qx.m63242a();
    }

    /* renamed from: c */
    public final int[] mo38255c(dk2 dk2, dk2 dk22, int[] iArr) {
        int e = dk22.mo34483e();
        int[] iArr2 = new int[e];
        for (int i = 1; i <= e; i++) {
            iArr2[e - i] = this.f30474a.mo33776i(i, dk22.mo34481c(i));
        }
        dk2 dk23 = new dk2(this.f30474a, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            int g = this.f30474a.mo33774g(iArr[i2]);
            iArr3[i2] = this.f30474a.mo33776i(this.f30474a.mo33777j(0, dk2.mo34480b(g)), this.f30474a.mo33774g(dk23.mo34480b(g)));
        }
        return iArr3;
    }

    /* renamed from: d */
    public final dk2[] mo38256d(dk2 dk2, dk2 dk22, int i) throws C6619qx {
        if (dk2.mo34483e() < dk22.mo34483e()) {
            dk2 dk23 = dk22;
            dk22 = dk2;
            dk2 = dk23;
        }
        dk2 f = this.f30474a.mo33773f();
        dk2 d = this.f30474a.mo33771d();
        while (true) {
            dk2 dk24 = r11;
            r11 = dk2;
            dk2 = dk24;
            dk2 dk25 = d;
            dk2 dk26 = f;
            f = dk25;
            if (dk2.mo34483e() < i / 2) {
                int c = f.mo34481c(0);
                if (c != 0) {
                    int g = this.f30474a.mo33774g(c);
                    return new dk2[]{f.mo34485g(g), dk2.mo34485g(g)};
                }
                throw C6619qx.m63242a();
            } else if (!dk2.mo34484f()) {
                dk2 f2 = this.f30474a.mo33773f();
                int g2 = this.f30474a.mo33774g(dk2.mo34481c(dk2.mo34483e()));
                while (r11.mo34483e() >= dk2.mo34483e() && !r11.mo34484f()) {
                    int e = r11.mo34483e() - dk2.mo34483e();
                    int i2 = this.f30474a.mo33776i(r11.mo34481c(r11.mo34483e()), g2);
                    f2 = f2.mo34479a(this.f30474a.mo33769b(e, i2));
                    r11 = r11.mo34489k(dk2.mo34487i(e, i2));
                }
                d = f2.mo34486h(f).mo34489k(dk26).mo34488j();
            } else {
                throw C6619qx.m63242a();
            }
        }
    }
}
