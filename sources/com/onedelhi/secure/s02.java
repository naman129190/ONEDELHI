package com.onedelhi.secure;

import com.onedelhi.secure.r02;
import java.io.IOException;

public final class s02 extends r02 {

    /* renamed from: a */
    public final j02 f34819a;

    /* renamed from: a */
    public final C6729b f34820a = new C6729b();

    /* renamed from: a */
    public final C6730c f34821a;

    /* renamed from: a */
    public final se3 f34822a;

    /* renamed from: b */
    public final C6729b f34823b = new C6729b();

    /* renamed from: com.onedelhi.secure.s02$b */
    public class C6729b extends r02.C6630a {
        public C6729b() {
            super(s02.this);
        }

        /* renamed from: b */
        public int mo44132b(int i) throws IOException {
            return s02.this.f34822a.mo44302b(this.f34443a, 0) == 0 ? s02.this.f34822a.mo44303c(this.f34444a[i]) + 2 : s02.this.f34822a.mo44302b(this.f34443a, 1) == 0 ? s02.this.f34822a.mo44303c(this.f34446b[i]) + 2 + 8 : s02.this.f34822a.mo44303c(this.f34445b) + 2 + 8 + 8;
        }
    }

    /* renamed from: com.onedelhi.secure.s02$c */
    public class C6730c extends r02.C6631b {

        /* renamed from: a */
        public final C6731a[] f34826a;

        /* renamed from: com.onedelhi.secure.s02$c$a */
        public class C6731a extends r02.C6631b.C6632a {
            public C6731a() {
                super();
            }

            /* renamed from: b */
            public void mo44135b() throws IOException {
                int i = 1;
                if (s02.this.f34428a.mo32227b()) {
                    do {
                        i = s02.this.f34822a.mo44302b(this.f34451a, i) | (i << 1);
                    } while (i < 256);
                } else {
                    int c = s02.this.f34819a.mo38370c(s02.this.f34429a[0]);
                    int i2 = 256;
                    int i3 = 1;
                    do {
                        c <<= 1;
                        int i4 = c & i2;
                        int b = s02.this.f34822a.mo44302b(this.f34451a, i2 + i4 + i3);
                        i3 = (i3 << 1) | b;
                        i2 &= (~i4) ^ (0 - b);
                    } while (i3 < 256);
                    i = i3;
                }
                s02.this.f34819a.mo38375h((byte) i);
                s02.this.f34428a.mo32230e();
            }
        }

        public C6730c(int i, int i2) {
            super(i, i2);
            this.f34826a = new C6731a[(1 << (i + i2))];
            int i3 = 0;
            while (true) {
                C6731a[] aVarArr = this.f34826a;
                if (i3 < aVarArr.length) {
                    aVarArr[i3] = new C6731a();
                    i3++;
                } else {
                    return;
                }
            }
        }

        /* renamed from: b */
        public void mo44133b() throws IOException {
            this.f34826a[mo43777a(s02.this.f34819a.mo38370c(0), s02.this.f34819a.mo38371d())].mo44135b();
        }

        /* renamed from: c */
        public void mo44134c() {
            int i = 0;
            while (true) {
                C6731a[] aVarArr = this.f34826a;
                if (i < aVarArr.length) {
                    aVarArr[i].mo43778a();
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public s02(j02 j02, se3 se3, int i, int i2, int i3) {
        super(i3);
        this.f34819a = j02;
        this.f34822a = se3;
        this.f34821a = new C6730c(i, i2);
        mo43775b();
    }

    /* renamed from: b */
    public void mo43775b() {
        super.mo43775b();
        this.f34821a.mo44134c();
        this.f34820a.mo43776a();
        this.f34823b.mo43776a();
    }

    /* renamed from: e */
    public void mo44128e() throws IOException {
        this.f34819a.mo38377j();
        while (this.f34819a.mo38373f()) {
            int d = this.f34819a.mo38371d() & this.f34427a;
            if (this.f34822a.mo44302b(this.f34431a[this.f34428a.mo32226a()], d) == 0) {
                this.f34821a.mo44133b();
            } else {
                this.f34819a.mo38376i(this.f34429a[0], this.f34822a.mo44302b(this.f34430a, this.f34428a.mo32226a()) == 0 ? mo44129f(d) : mo44130g(d));
            }
        }
        this.f34822a.mo44306f();
    }

    /* renamed from: f */
    public final int mo44129f(int i) throws IOException {
        this.f34428a.mo32232g();
        int[] iArr = this.f34429a;
        iArr[3] = iArr[2];
        iArr[2] = iArr[1];
        iArr[1] = iArr[0];
        int b = this.f34820a.mo44132b(i);
        int c = this.f34822a.mo44303c(this.f34435c[r02.m63304a(b)]);
        if (c < 4) {
            this.f34429a[0] = c;
        } else {
            int i2 = (c >> 1) - 1;
            int[] iArr2 = this.f34429a;
            iArr2[0] = (2 | (c & 1)) << i2;
            if (c < 14) {
                iArr2[0] = this.f34822a.mo44305e(this.f34437d[c - 4]) | iArr2[0];
            } else {
                iArr2[0] = iArr2[0] | (this.f34822a.mo44304d(i2 - 4) << 4);
                int[] iArr3 = this.f34429a;
                iArr3[0] = iArr3[0] | this.f34822a.mo44305e(this.f34438e);
            }
        }
        return b;
    }

    /* renamed from: g */
    public final int mo44130g(int i) throws IOException {
        int i2;
        if (this.f34822a.mo44302b(this.f34432b, this.f34428a.mo32226a()) != 0) {
            if (this.f34822a.mo44302b(this.f34434c, this.f34428a.mo32226a()) == 0) {
                i2 = this.f34429a[1];
            } else {
                if (this.f34822a.mo44302b(this.f34436d, this.f34428a.mo32226a()) == 0) {
                    i2 = this.f34429a[2];
                } else {
                    int[] iArr = this.f34429a;
                    int i3 = iArr[3];
                    iArr[3] = iArr[2];
                    i2 = i3;
                }
                int[] iArr2 = this.f34429a;
                iArr2[2] = iArr2[1];
            }
            int[] iArr3 = this.f34429a;
            iArr3[1] = iArr3[0];
            iArr3[0] = i2;
        } else if (this.f34822a.mo44302b(this.f34433b[this.f34428a.mo32226a()], i) == 0) {
            this.f34428a.mo32233h();
            return 1;
        }
        this.f34428a.mo32231f();
        return this.f34823b.mo44132b(i);
    }

    /* renamed from: h */
    public boolean mo44131h() {
        return this.f34429a[0] == -1;
    }
}
