package com.onedelhi.secure;

import java.util.Arrays;
import java.util.Map;

public abstract class im4 extends rv2 {

    /* renamed from: a */
    public static final float f30360a = 0.48f;

    /* renamed from: a */
    public static final int[] f30361a = {1, 1, 1};

    /* renamed from: a */
    public static final int[][] f30362a;

    /* renamed from: b */
    public static final float f30363b = 0.7f;

    /* renamed from: b */
    public static final int[] f30364b = {1, 1, 1, 1, 1};

    /* renamed from: b */
    public static final int[][] f30365b;

    /* renamed from: c */
    public static final int[] f30366c = {1, 1, 1, 1, 1, 1};

    /* renamed from: a */
    public final hm4 f30367a = new hm4();

    /* renamed from: a */
    public final xq0 f30368a = new xq0();

    /* renamed from: a */
    public final StringBuilder f30369a = new StringBuilder(20);

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f30362a = iArr;
        int[][] iArr2 = new int[20][];
        f30365b = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr3 = f30362a[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i2 = 0; i2 < iArr3.length; i2++) {
                iArr4[i2] = iArr3[(iArr3.length - i2) - 1];
            }
            f30365b[i] = iArr4;
        }
    }

    /* renamed from: i */
    public static boolean m52452i(CharSequence charSequence) throws ha1 {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i = length - 1;
        return m52457r(charSequence.subSequence(0, i)) == Character.digit(charSequence.charAt(i), 10);
    }

    /* renamed from: j */
    public static int m52453j(C6014ll llVar, int[] iArr, int i, int[][] iArr2) throws tr2 {
        rv2.m63923f(llVar, i, iArr);
        int length = iArr2.length;
        float f = 0.48f;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            float e = rv2.m63922e(iArr, iArr2[i3], 0.7f);
            if (e < f) {
                i2 = i3;
                f = e;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        throw tr2.m66179a();
    }

    /* renamed from: n */
    public static int[] m52454n(C6014ll llVar, int i, boolean z, int[] iArr) throws tr2 {
        return m52455o(llVar, i, z, iArr, new int[iArr.length]);
    }

    /* renamed from: o */
    public static int[] m52455o(C6014ll llVar, int i, boolean z, int[] iArr, int[] iArr2) throws tr2 {
        int l = llVar.mo39935l();
        int k = z ? llVar.mo39934k(i) : llVar.mo39933j(i);
        int length = iArr.length;
        boolean z2 = z;
        int i2 = 0;
        int i3 = k;
        while (k < l) {
            if (llVar.mo39930h(k) != z2) {
                iArr2[i2] = iArr2[i2] + 1;
            } else {
                if (i2 != length - 1) {
                    i2++;
                } else if (rv2.m63922e(iArr2, iArr, 0.7f) < 0.48f) {
                    return new int[]{i3, k};
                } else {
                    i3 += iArr2[0] + iArr2[1];
                    int i4 = i2 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i4);
                    iArr2[i4] = 0;
                    iArr2[i2] = 0;
                    i2--;
                }
                iArr2[i2] = 1;
                z2 = !z2;
            }
            k++;
        }
        throw tr2.m66179a();
    }

    /* renamed from: p */
    public static int[] m52456p(C6014ll llVar) throws tr2 {
        int[] iArr = new int[f30361a.length];
        int[] iArr2 = null;
        boolean z = false;
        int i = 0;
        while (!z) {
            int[] iArr3 = f30361a;
            Arrays.fill(iArr, 0, iArr3.length, 0);
            iArr2 = m52455o(llVar, i, false, iArr3, iArr);
            int i2 = iArr2[0];
            int i3 = iArr2[1];
            int i4 = i2 - (i3 - i2);
            if (i4 >= 0) {
                z = llVar.mo39937n(i4, i2, false);
            }
            i = i3;
        }
        return iArr2;
    }

    /* renamed from: r */
    public static int m52457r(CharSequence charSequence) throws ha1 {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 1; i2 >= 0; i2 -= 2) {
            int charAt = charSequence.charAt(i2) - '0';
            if (charAt < 0 || charAt > 9) {
                throw ha1.m50341a();
            }
            i += charAt;
        }
        int i3 = i * 3;
        for (int i4 = length - 2; i4 >= 0; i4 -= 2) {
            int charAt2 = charSequence.charAt(i4) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw ha1.m50341a();
            }
            i3 += charAt2;
        }
        return (1000 - i3) % 10;
    }

    /* renamed from: c */
    public ol3 mo31296c(int i, C6014ll llVar, Map<pf0, ?> map) throws tr2, C6619qx, ha1 {
        return mo34504m(i, llVar, m52456p(llVar), map);
    }

    /* renamed from: h */
    public boolean mo38160h(String str) throws ha1 {
        return m52452i(str);
    }

    /* renamed from: k */
    public int[] mo38161k(C6014ll llVar, int i) throws tr2 {
        return m52454n(llVar, i, false, f30361a);
    }

    /* renamed from: l */
    public abstract int mo34503l(C6014ll llVar, int[] iArr, StringBuilder sb) throws tr2;

    /* renamed from: m */
    public ol3 mo34504m(int i, C6014ll llVar, int[] iArr, Map<pf0, ?> map) throws tr2, C6619qx, ha1 {
        int i2;
        String c;
        int[] iArr2 = null;
        tl3 tl3 = map == null ? null : (tl3) map.get(pf0.NEED_RESULT_POINT_CALLBACK);
        boolean z = true;
        if (tl3 != null) {
            tl3.mo35233a(new sl3(((float) (iArr[0] + iArr[1])) / 2.0f, (float) i));
        }
        StringBuilder sb = this.f30369a;
        sb.setLength(0);
        int l = mo34503l(llVar, iArr, sb);
        if (tl3 != null) {
            tl3.mo35233a(new sl3((float) l, (float) i));
        }
        int[] k = mo38161k(llVar, l);
        if (tl3 != null) {
            tl3.mo35233a(new sl3(((float) (k[0] + k[1])) / 2.0f, (float) i));
        }
        int i3 = k[1];
        int i4 = (i3 - k[0]) + i3;
        if (i4 >= llVar.mo39935l() || !llVar.mo39937n(i3, i4, false)) {
            throw tr2.m66179a();
        }
        String sb2 = sb.toString();
        if (sb2.length() < 8) {
            throw ha1.m50341a();
        } else if (mo38160h(sb2)) {
            C7363yi q = mo34505q();
            float f = (float) i;
            ol3 ol3 = new ol3(sb2, (byte[]) null, new sl3[]{new sl3(((float) (iArr[1] + iArr[0])) / 2.0f, f), new sl3(((float) (k[1] + k[0])) / 2.0f, f)}, q);
            try {
                ol3 a = this.f30367a.mo37413a(i, llVar, k[1]);
                ol3.mo41832j(ql3.UPC_EAN_EXTENSION, a.mo41829g());
                ol3.mo41831i(a.mo41827e());
                ol3.mo41823a(a.mo41828f());
                i2 = a.mo41829g().length();
            } catch (wf3 unused) {
                i2 = 0;
            }
            if (map != null) {
                iArr2 = (int[]) map.get(pf0.ALLOWED_EAN_EXTENSIONS);
            }
            if (iArr2 != null) {
                int length = iArr2.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        z = false;
                        break;
                    } else if (i2 == iArr2[i5]) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (!z) {
                    throw tr2.m66179a();
                }
            }
            if ((q == C7363yi.EAN_13 || q == C7363yi.UPC_A) && (c = this.f30368a.mo47388c(sb2)) != null) {
                ol3.mo41832j(ql3.POSSIBLE_COUNTRY, c);
            }
            return ol3;
        } else {
            throw C6619qx.m63242a();
        }
    }

    /* renamed from: q */
    public abstract C7363yi mo34505q();
}
