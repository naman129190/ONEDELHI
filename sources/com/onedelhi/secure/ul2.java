package com.onedelhi.secure;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public final class ul2 extends n31 {

    /* renamed from: a */
    public static final float f36172a = 180.0f;

    /* renamed from: a */
    public static final l31[] f36173a = new l31[0];

    /* renamed from: a */
    public static final o31[] f36174a = new o31[0];

    /* renamed from: a */
    public static final l31[][] f36175a = new l31[0][];

    /* renamed from: b */
    public static final float f36176b = 9.0f;

    /* renamed from: c */
    public static final float f36177c = 0.05f;

    /* renamed from: d */
    public static final float f36178d = 0.5f;

    /* renamed from: com.onedelhi.secure.ul2$b */
    public static final class C6971b implements Serializable, Comparator<l31> {
        public C6971b() {
        }

        /* renamed from: a */
        public int compare(l31 l31, l31 l312) {
            double i = (double) (l312.mo39636i() - l31.mo39636i());
            if (i < 0.0d) {
                return -1;
            }
            return i > 0.0d ? 1 : 0;
        }
    }

    public ul2(C6190nl nlVar, tl3 tl3) {
        super(nlVar, tl3);
    }

    /* renamed from: u */
    public o31[] mo45645u(Map<pf0, ?> map) throws tr2 {
        boolean z = map != null && map.containsKey(pf0.TRY_HARDER);
        C6190nl m = mo40910m();
        int h = m.mo41089h();
        int l = m.mo41094l();
        int i = (h * 3) / 388;
        if (i < 3 || z) {
            i = 3;
        }
        int[] iArr = new int[5];
        for (int i2 = i - 1; i2 < h; i2 += i) {
            n31.m57817f(iArr);
            int i3 = 0;
            for (int i4 = 0; i4 < l; i4++) {
                if (m.mo41085e(i4, i2)) {
                    if ((i3 & 1) == 1) {
                        i3++;
                    }
                    iArr[i3] = iArr[i3] + 1;
                } else if ((i3 & 1) != 0) {
                    iArr[i3] = iArr[i3] + 1;
                } else if (i3 != 4) {
                    i3++;
                    iArr[i3] = iArr[i3] + 1;
                } else if (!n31.m57819j(iArr) || !mo40912o(iArr, i2, i4)) {
                    n31.m57818g(iArr);
                    i3 = 3;
                } else {
                    n31.m57817f(iArr);
                    i3 = 0;
                }
            }
            if (n31.m57819j(iArr)) {
                mo40912o(iArr, i2, l);
            }
        }
        l31[][] v = mo45646v();
        ArrayList arrayList = new ArrayList();
        for (l31[] l31Arr : v) {
            sl3.m64701e(l31Arr);
            arrayList.add(new o31(l31Arr));
        }
        return arrayList.isEmpty() ? f36174a : (o31[]) arrayList.toArray(f36174a);
    }

    /* renamed from: v */
    public final l31[][] mo45646v() throws tr2 {
        List<l31> n = mo40911n();
        int size = n.size();
        int i = 3;
        if (size >= 3) {
            char c = 0;
            if (size == 3) {
                return new l31[][]{(l31[]) n.toArray(f36173a)};
            }
            Collections.sort(n, new C6971b());
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 < size - 2) {
                l31 l31 = n.get(i2);
                if (l31 != null) {
                    int i3 = i2 + 1;
                    while (i3 < size - 1) {
                        l31 l312 = n.get(i3);
                        if (l312 != null) {
                            float i4 = (l31.mo39636i() - l312.mo39636i()) / Math.min(l31.mo39636i(), l312.mo39636i());
                            float f = 0.05f;
                            float f2 = 0.5f;
                            if (Math.abs(l31.mo39636i() - l312.mo39636i()) > 0.5f && i4 >= 0.05f) {
                                break;
                            }
                            int i5 = i3 + 1;
                            while (i5 < size) {
                                l31 l313 = n.get(i5);
                                if (l313 != null) {
                                    float i6 = (l312.mo39636i() - l313.mo39636i()) / Math.min(l312.mo39636i(), l313.mo39636i());
                                    if (Math.abs(l312.mo39636i() - l313.mo39636i()) > f2 && i6 >= f) {
                                        break;
                                    }
                                    l31[] l31Arr = new l31[i];
                                    l31Arr[c] = l31;
                                    l31Arr[1] = l312;
                                    l31Arr[2] = l313;
                                    sl3.m64701e(l31Arr);
                                    o31 o31 = new o31(l31Arr);
                                    float b = sl3.m64700b(o31.mo41516b(), o31.mo41515a());
                                    float b2 = sl3.m64700b(o31.mo41517c(), o31.mo41515a());
                                    float b3 = sl3.m64700b(o31.mo41516b(), o31.mo41517c());
                                    float i7 = (b + b3) / (l31.mo39636i() * 2.0f);
                                    if (i7 <= 180.0f && i7 >= 9.0f && Math.abs((b - b3) / Math.min(b, b3)) < 0.1f) {
                                        double d = (double) b;
                                        double d2 = (double) b3;
                                        float sqrt = (float) Math.sqrt((d * d) + (d2 * d2));
                                        if (Math.abs((b2 - sqrt) / Math.min(b2, sqrt)) < 0.1f) {
                                            arrayList.add(l31Arr);
                                        }
                                    }
                                }
                                i5++;
                                i = 3;
                                c = 0;
                                f = 0.05f;
                                f2 = 0.5f;
                            }
                        }
                        i3++;
                        i = 3;
                        c = 0;
                    }
                }
                i2++;
                i = 3;
                c = 0;
            }
            if (!arrayList.isEmpty()) {
                return (l31[][]) arrayList.toArray(f36175a);
            }
            throw tr2.m66179a();
        }
        throw tr2.m66179a();
    }
}
