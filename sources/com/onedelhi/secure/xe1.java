package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class xe1 implements gm2 {

    /* renamed from: a */
    public static final int f37404a = 100;

    /* renamed from: a */
    public static final ol3[] f37405a = new ol3[0];

    /* renamed from: b */
    public static final int f37406b = 4;

    /* renamed from: a */
    public final uf3 f37407a;

    public xe1(uf3 uf3) {
        this.f37407a = uf3;
    }

    /* renamed from: b */
    public static ol3 m70175b(ol3 ol3, int i, int i2) {
        sl3[] f = ol3.mo41828f();
        if (f == null) {
            return ol3;
        }
        sl3[] sl3Arr = new sl3[f.length];
        for (int i3 = 0; i3 < f.length; i3++) {
            sl3 sl3 = f[i3];
            if (sl3 != null) {
                sl3Arr[i3] = new sl3(sl3.mo44403c() + ((float) i), sl3.mo44404d() + ((float) i2));
            }
        }
        ol3 ol32 = new ol3(ol3.mo41829g(), ol3.mo41826d(), ol3.mo41825c(), sl3Arr, ol3.mo41824b(), ol3.mo41830h());
        ol32.mo41831i(ol3.mo41827e());
        return ol32;
    }

    /* renamed from: a */
    public final void mo47140a(C6969uk ukVar, Map<pf0, ?> map, List<ol3> list, int i, int i2, int i3) {
        boolean z;
        int i4;
        int i5;
        float f;
        float f2;
        int i6;
        int i7;
        C6969uk ukVar2 = ukVar;
        int i8 = i;
        int i9 = i2;
        int i10 = i3;
        if (i10 <= 4) {
            try {
                ol3 b = this.f37407a.mo34502b(ukVar2, map);
                Iterator<ol3> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().mo41829g().equals(b.mo41829g())) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    list.add(m70175b(b, i8, i9));
                } else {
                    List<ol3> list2 = list;
                }
                sl3[] f3 = b.mo41828f();
                if (f3 != null && f3.length != 0) {
                    int e = ukVar.mo45637e();
                    int d = ukVar.mo45636d();
                    float f4 = (float) e;
                    float f5 = (float) d;
                    float f6 = 0.0f;
                    float f7 = 0.0f;
                    for (sl3 sl3 : f3) {
                        if (sl3 != null) {
                            float c = sl3.mo44403c();
                            float d2 = sl3.mo44404d();
                            if (c < f4) {
                                f4 = c;
                            }
                            if (d2 < f5) {
                                f5 = d2;
                            }
                            if (c > f6) {
                                f6 = c;
                            }
                            if (d2 > f7) {
                                f7 = d2;
                            }
                        }
                    }
                    if (f4 > 100.0f) {
                        f = f6;
                        f2 = f5;
                        i5 = d;
                        i4 = e;
                        mo47140a(ukVar2.mo45633a(0, 0, (int) f4, d), map, list, i, i2, i10 + 1);
                    } else {
                        f = f6;
                        f2 = f5;
                        i5 = d;
                        i4 = e;
                    }
                    if (f2 > 100.0f) {
                        int i11 = (int) f2;
                        i6 = i4;
                        mo47140a(ukVar2.mo45633a(0, 0, i6, i11), map, list, i, i2, i10 + 1);
                    } else {
                        i6 = i4;
                    }
                    float f8 = f;
                    if (f8 < ((float) (i6 - 100))) {
                        int i12 = (int) f8;
                        i7 = i5;
                        mo47140a(ukVar2.mo45633a(i12, 0, i6 - i12, i7), map, list, i8 + i12, i2, i10 + 1);
                    } else {
                        i7 = i5;
                    }
                    if (f7 < ((float) (i7 - 100))) {
                        int i13 = (int) f7;
                        mo47140a(ukVar2.mo45633a(0, i13, i6, i7 - i13), map, list, i, i9 + i13, i10 + 1);
                    }
                }
            } catch (wf3 unused) {
            }
        }
    }

    /* renamed from: c */
    public ol3[] mo36787c(C6969uk ukVar) throws tr2 {
        return mo36788d(ukVar, (Map<pf0, ?>) null);
    }

    /* renamed from: d */
    public ol3[] mo36788d(C6969uk ukVar, Map<pf0, ?> map) throws tr2 {
        ArrayList arrayList = new ArrayList();
        mo47140a(ukVar, map, arrayList, 0, 0, 0);
        if (!arrayList.isEmpty()) {
            return (ol3[]) arrayList.toArray(f37405a);
        }
        throw tr2.m66179a();
    }
}
