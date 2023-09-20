package com.onedelhi.secure;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public final class pl1 {

    /* renamed from: a */
    public static final int f33713a = 0;

    /* renamed from: a */
    public static final String[] f33714a = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* renamed from: a */
    public static final int[][] f33715a = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* renamed from: b */
    public static final int f33716b = 1;

    /* renamed from: b */
    public static final int[][] f33717b;

    /* renamed from: c */
    public static final int f33718c = 2;

    /* renamed from: c */
    public static final int[][] f33719c;

    /* renamed from: d */
    public static final int f33720d = 3;

    /* renamed from: e */
    public static final int f33721e = 4;

    /* renamed from: a */
    public final byte[] f33722a;

    /* renamed from: com.onedelhi.secure.pl1$a */
    public class C6461a implements Comparator<a34> {
        public C6461a() {
        }

        /* renamed from: a */
        public int compare(a34 a34, a34 a342) {
            return a34.mo30455e() - a342.mo30455e();
        }
    }

    static {
        Class<int> cls = int.class;
        int[][] iArr = (int[][]) Array.newInstance(cls, new int[]{5, 256});
        f33717b = iArr;
        iArr[0][32] = 1;
        for (int i = 65; i <= 90; i++) {
            f33717b[0][i] = (i - 65) + 2;
        }
        f33717b[1][32] = 1;
        for (int i2 = 97; i2 <= 122; i2++) {
            f33717b[1][i2] = (i2 - 97) + 2;
        }
        f33717b[2][32] = 1;
        for (int i3 = 48; i3 <= 57; i3++) {
            f33717b[2][i3] = (i3 - 48) + 2;
        }
        int[][] iArr2 = f33717b;
        iArr2[2][44] = 12;
        iArr2[2][46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i4 = 0; i4 < 28; i4++) {
            f33717b[3][iArr3[i4]] = i4;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i5 = 0; i5 < 31; i5++) {
            if (iArr4[i5] > 0) {
                f33717b[4][iArr4[i5]] = i5;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance(cls, new int[]{6, 6});
        f33719c = iArr5;
        for (int[] fill : iArr5) {
            Arrays.fill(fill, -1);
        }
        int[][] iArr6 = f33719c;
        iArr6[0][4] = 0;
        iArr6[1][4] = 0;
        iArr6[1][0] = 28;
        iArr6[3][4] = 0;
        iArr6[2][4] = 0;
        iArr6[2][0] = 15;
    }

    public pl1(byte[] bArr) {
        this.f33722a = bArr;
    }

    /* renamed from: b */
    public static Collection<a34> m61409b(Iterable<a34> iterable) {
        LinkedList linkedList = new LinkedList();
        for (a34 next : iterable) {
            boolean z = true;
            Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                a34 a34 = (a34) it.next();
                if (a34.mo30458h(next)) {
                    z = false;
                    break;
                } else if (next.mo30458h(a34)) {
                    it.remove();
                }
            }
            if (z) {
                linkedList.add(next);
            }
        }
        return linkedList;
    }

    /* renamed from: d */
    public static void m61410d(a34 a34, int i, int i2, Collection<a34> collection) {
        a34 c = a34.mo30453c(i);
        collection.add(c.mo30459i(4, i2));
        if (a34.mo30456f() != 4) {
            collection.add(c.mo30460j(4, i2));
        }
        if (i2 == 3 || i2 == 4) {
            collection.add(c.mo30459i(2, 16 - i2).mo30459i(2, 1));
        }
        if (a34.mo30454d() > 0) {
            collection.add(a34.mo30452a(i).mo30452a(i + 1));
        }
    }

    /* renamed from: f */
    public static Collection<a34> m61411f(Iterable<a34> iterable, int i, int i2) {
        LinkedList linkedList = new LinkedList();
        for (a34 d : iterable) {
            m61410d(d, i, i2, linkedList);
        }
        return m61409b(linkedList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0045  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.onedelhi.secure.C6014ll mo42811a() {
        /*
            r8 = this;
            com.onedelhi.secure.a34 r0 = com.onedelhi.secure.a34.f25748a
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1 = 0
            r2 = 0
        L_0x0008:
            byte[] r3 = r8.f33722a
            int r4 = r3.length
            if (r2 >= r4) goto L_0x004c
            int r4 = r2 + 1
            int r5 = r3.length
            if (r4 >= r5) goto L_0x0015
            byte r5 = r3[r4]
            goto L_0x0016
        L_0x0015:
            r5 = 0
        L_0x0016:
            byte r3 = r3[r2]
            r6 = 13
            if (r3 == r6) goto L_0x0038
            r6 = 44
            r7 = 32
            if (r3 == r6) goto L_0x0034
            r6 = 46
            if (r3 == r6) goto L_0x0030
            r6 = 58
            if (r3 == r6) goto L_0x002c
        L_0x002a:
            r3 = 0
            goto L_0x003d
        L_0x002c:
            if (r5 != r7) goto L_0x002a
            r3 = 5
            goto L_0x003d
        L_0x0030:
            if (r5 != r7) goto L_0x002a
            r3 = 3
            goto L_0x003d
        L_0x0034:
            if (r5 != r7) goto L_0x002a
            r3 = 4
            goto L_0x003d
        L_0x0038:
            r3 = 10
            if (r5 != r3) goto L_0x002a
            r3 = 2
        L_0x003d:
            if (r3 <= 0) goto L_0x0045
            java.util.Collection r0 = m61411f(r0, r2, r3)
            r2 = r4
            goto L_0x0049
        L_0x0045:
            java.util.Collection r0 = r8.mo42813e(r0, r2)
        L_0x0049:
            int r2 = r2 + 1
            goto L_0x0008
        L_0x004c:
            com.onedelhi.secure.pl1$a r1 = new com.onedelhi.secure.pl1$a
            r1.<init>()
            java.lang.Object r0 = java.util.Collections.min(r0, r1)
            com.onedelhi.secure.a34 r0 = (com.onedelhi.secure.a34) r0
            byte[] r1 = r8.f33722a
            com.onedelhi.secure.ll r0 = r0.mo30461k(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.pl1.mo42811a():com.onedelhi.secure.ll");
    }

    /* renamed from: c */
    public final void mo42812c(a34 a34, int i, Collection<a34> collection) {
        char c = (char) (this.f33722a[i] & 255);
        boolean z = f33717b[a34.mo30456f()][c] > 0;
        a34 a342 = null;
        for (int i2 = 0; i2 <= 4; i2++) {
            int i3 = f33717b[i2][c];
            if (i3 > 0) {
                if (a342 == null) {
                    a342 = a34.mo30453c(i);
                }
                if (!z || i2 == a34.mo30456f() || i2 == 2) {
                    collection.add(a342.mo30459i(i2, i3));
                }
                if (!z && f33719c[a34.mo30456f()][i2] >= 0) {
                    collection.add(a342.mo30460j(i2, i3));
                }
            }
        }
        if (a34.mo30454d() > 0 || f33717b[a34.mo30456f()][c] == 0) {
            collection.add(a34.mo30452a(i));
        }
    }

    /* renamed from: e */
    public final Collection<a34> mo42813e(Iterable<a34> iterable, int i) {
        LinkedList linkedList = new LinkedList();
        for (a34 c : iterable) {
            mo42812c(c, i, linkedList);
        }
        return m61409b(linkedList);
    }
}
