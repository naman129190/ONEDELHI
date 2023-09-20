package com.onedelhi.secure;

import java.lang.reflect.Array;

public abstract class r02 {

    /* renamed from: b */
    public static final int f34415b = 16;

    /* renamed from: c */
    public static final int f34416c = 2;

    /* renamed from: d */
    public static final int f34417d = 273;

    /* renamed from: e */
    public static final int f34418e = 4;

    /* renamed from: f */
    public static final int f34419f = 64;

    /* renamed from: g */
    public static final int f34420g = 4;

    /* renamed from: h */
    public static final int f34421h = 14;

    /* renamed from: i */
    public static final int f34422i = 128;

    /* renamed from: j */
    public static final int f34423j = 4;

    /* renamed from: k */
    public static final int f34424k = 16;

    /* renamed from: l */
    public static final int f34425l = 15;

    /* renamed from: m */
    public static final int f34426m = 4;

    /* renamed from: a */
    public final int f34427a;

    /* renamed from: a */
    public final c34 f34428a = new c34();

    /* renamed from: a */
    public final int[] f34429a = new int[4];

    /* renamed from: a */
    public final short[] f34430a;

    /* renamed from: a */
    public final short[][] f34431a;

    /* renamed from: b */
    public final short[] f34432b;

    /* renamed from: b */
    public final short[][] f34433b;

    /* renamed from: c */
    public final short[] f34434c;

    /* renamed from: c */
    public final short[][] f34435c;

    /* renamed from: d */
    public final short[] f34436d;

    /* renamed from: d */
    public final short[][] f34437d;

    /* renamed from: e */
    public final short[] f34438e;

    /* renamed from: com.onedelhi.secure.r02$a */
    public abstract class C6630a {

        /* renamed from: a */
        public static final int f34439a = 8;

        /* renamed from: b */
        public static final int f34440b = 8;

        /* renamed from: c */
        public static final int f34441c = 256;

        /* renamed from: a */
        public final /* synthetic */ r02 f34442a;

        /* renamed from: a */
        public final short[] f34443a = new short[2];

        /* renamed from: a */
        public final short[][] f34444a;

        /* renamed from: b */
        public final short[] f34445b;

        /* renamed from: b */
        public final short[][] f34446b;

        public C6630a(r02 r02) {
            Class<short> cls = short.class;
            this.f34442a = r02;
            this.f34444a = (short[][]) Array.newInstance(cls, new int[]{16, 8});
            this.f34446b = (short[][]) Array.newInstance(cls, new int[]{16, 8});
            this.f34445b = new short[256];
        }

        /* renamed from: a */
        public void mo43776a() {
            qe3.m62714a(this.f34443a);
            int i = 0;
            while (true) {
                short[][] sArr = this.f34444a;
                if (i >= sArr.length) {
                    break;
                }
                qe3.m62714a(sArr[i]);
                i++;
            }
            for (int i2 = 0; i2 < this.f34444a.length; i2++) {
                qe3.m62714a(this.f34446b[i2]);
            }
            qe3.m62714a(this.f34445b);
        }
    }

    /* renamed from: com.onedelhi.secure.r02$b */
    public abstract class C6631b {

        /* renamed from: a */
        public final int f34447a;

        /* renamed from: b */
        public final int f34449b;

        /* renamed from: com.onedelhi.secure.r02$b$a */
        public abstract class C6632a {

            /* renamed from: a */
            public final short[] f34451a = new short[768];

            public C6632a() {
            }

            /* renamed from: a */
            public void mo43778a() {
                qe3.m62714a(this.f34451a);
            }
        }

        public C6631b(int i, int i2) {
            this.f34447a = i;
            this.f34449b = (1 << i2) - 1;
        }

        /* renamed from: a */
        public final int mo43777a(int i, int i2) {
            int i3 = this.f34447a;
            return (i >> (8 - i3)) + ((i2 & this.f34449b) << i3);
        }
    }

    public r02(int i) {
        Class<short> cls = short.class;
        this.f34431a = (short[][]) Array.newInstance(cls, new int[]{12, 16});
        this.f34430a = new short[12];
        this.f34432b = new short[12];
        this.f34434c = new short[12];
        this.f34436d = new short[12];
        this.f34433b = (short[][]) Array.newInstance(cls, new int[]{12, 16});
        this.f34435c = (short[][]) Array.newInstance(cls, new int[]{4, 64});
        this.f34437d = new short[][]{new short[2], new short[2], new short[4], new short[4], new short[8], new short[8], new short[16], new short[16], new short[32], new short[32]};
        this.f34438e = new short[16];
        this.f34427a = (1 << i) - 1;
    }

    /* renamed from: a */
    public static final int m63304a(int i) {
        if (i < 6) {
            return i - 2;
        }
        return 3;
    }

    /* renamed from: b */
    public void mo43775b() {
        int[] iArr = this.f34429a;
        int i = 0;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        this.f34428a.mo32228c();
        int i2 = 0;
        while (true) {
            short[][] sArr = this.f34431a;
            if (i2 >= sArr.length) {
                break;
            }
            qe3.m62714a(sArr[i2]);
            i2++;
        }
        qe3.m62714a(this.f34430a);
        qe3.m62714a(this.f34432b);
        qe3.m62714a(this.f34434c);
        qe3.m62714a(this.f34436d);
        int i3 = 0;
        while (true) {
            short[][] sArr2 = this.f34433b;
            if (i3 >= sArr2.length) {
                break;
            }
            qe3.m62714a(sArr2[i3]);
            i3++;
        }
        int i4 = 0;
        while (true) {
            short[][] sArr3 = this.f34435c;
            if (i4 >= sArr3.length) {
                break;
            }
            qe3.m62714a(sArr3[i4]);
            i4++;
        }
        while (true) {
            short[][] sArr4 = this.f34437d;
            if (i < sArr4.length) {
                qe3.m62714a(sArr4[i]);
                i++;
            } else {
                qe3.m62714a(this.f34438e);
                return;
            }
        }
    }
}
