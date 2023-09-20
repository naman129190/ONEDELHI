package com.onedelhi.secure;

import java.util.Map;

/* renamed from: com.onedelhi.secure.kq */
public final class C5926kq implements uf3 {

    /* renamed from: a */
    public final uf3 f31397a;

    public C5926kq(uf3 uf3) {
        this.f31397a = uf3;
    }

    /* renamed from: c */
    public static void m54829c(sl3[] sl3Arr, int i, int i2) {
        if (sl3Arr != null) {
            for (int i3 = 0; i3 < sl3Arr.length; i3++) {
                sl3 sl3 = sl3Arr[i3];
                if (sl3 != null) {
                    sl3Arr[i3] = new sl3(sl3.mo44403c() + ((float) i), sl3.mo44404d() + ((float) i2));
                }
            }
        }
    }

    /* renamed from: a */
    public ol3 mo34501a(C6969uk ukVar) throws tr2, C6619qx, ha1 {
        return mo34502b(ukVar, (Map<pf0, ?>) null);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:4|5|6) */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r2 = r5.f31397a.mo34502b(r6.mo45633a(r0, r1, r0, r1), r7);
        m54829c(r2.mo41828f(), r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004d, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004e, code lost:
        r2 = r0 / 2;
        r3 = r1 / 2;
        r6 = r5.f31397a.mo34502b(r6.mo45633a(r2, r3, r0, r1), r7);
        m54829c(r6.mo41828f(), r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0063, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
        r3 = r5.f31397a.mo34502b(r6.mo45633a(r0, 0, r0, r1), r7);
        m54829c(r3.mo41828f(), r0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0029, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r3 = r5.f31397a.mo34502b(r6.mo45633a(0, r1, r0, r1), r7);
        m54829c(r3.mo41828f(), 0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003b, code lost:
        return r3;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x003c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0018 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.onedelhi.secure.ol3 mo34502b(com.onedelhi.secure.C6969uk r6, java.util.Map<com.onedelhi.secure.pf0, ?> r7) throws com.onedelhi.secure.tr2, com.onedelhi.secure.C6619qx, com.onedelhi.secure.ha1 {
        /*
            r5 = this;
            int r0 = r6.mo45637e()
            int r1 = r6.mo45636d()
            int r0 = r0 / 2
            int r1 = r1 / 2
            r2 = 0
            com.onedelhi.secure.uf3 r3 = r5.f31397a     // Catch:{ tr2 -> 0x0018 }
            com.onedelhi.secure.uk r4 = r6.mo45633a(r2, r2, r0, r1)     // Catch:{ tr2 -> 0x0018 }
            com.onedelhi.secure.ol3 r6 = r3.mo34502b(r4, r7)     // Catch:{ tr2 -> 0x0018 }
            return r6
        L_0x0018:
            com.onedelhi.secure.uf3 r3 = r5.f31397a     // Catch:{ tr2 -> 0x002a }
            com.onedelhi.secure.uk r4 = r6.mo45633a(r0, r2, r0, r1)     // Catch:{ tr2 -> 0x002a }
            com.onedelhi.secure.ol3 r3 = r3.mo34502b(r4, r7)     // Catch:{ tr2 -> 0x002a }
            com.onedelhi.secure.sl3[] r4 = r3.mo41828f()     // Catch:{ tr2 -> 0x002a }
            m54829c(r4, r0, r2)     // Catch:{ tr2 -> 0x002a }
            return r3
        L_0x002a:
            com.onedelhi.secure.uf3 r3 = r5.f31397a     // Catch:{ tr2 -> 0x003c }
            com.onedelhi.secure.uk r4 = r6.mo45633a(r2, r1, r0, r1)     // Catch:{ tr2 -> 0x003c }
            com.onedelhi.secure.ol3 r3 = r3.mo34502b(r4, r7)     // Catch:{ tr2 -> 0x003c }
            com.onedelhi.secure.sl3[] r4 = r3.mo41828f()     // Catch:{ tr2 -> 0x003c }
            m54829c(r4, r2, r1)     // Catch:{ tr2 -> 0x003c }
            return r3
        L_0x003c:
            com.onedelhi.secure.uf3 r2 = r5.f31397a     // Catch:{ tr2 -> 0x004e }
            com.onedelhi.secure.uk r3 = r6.mo45633a(r0, r1, r0, r1)     // Catch:{ tr2 -> 0x004e }
            com.onedelhi.secure.ol3 r2 = r2.mo34502b(r3, r7)     // Catch:{ tr2 -> 0x004e }
            com.onedelhi.secure.sl3[] r3 = r2.mo41828f()     // Catch:{ tr2 -> 0x004e }
            m54829c(r3, r0, r1)     // Catch:{ tr2 -> 0x004e }
            return r2
        L_0x004e:
            int r2 = r0 / 2
            int r3 = r1 / 2
            com.onedelhi.secure.uk r6 = r6.mo45633a(r2, r3, r0, r1)
            com.onedelhi.secure.uf3 r0 = r5.f31397a
            com.onedelhi.secure.ol3 r6 = r0.mo34502b(r6, r7)
            com.onedelhi.secure.sl3[] r7 = r6.mo41828f()
            m54829c(r7, r2, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C5926kq.mo34502b(com.onedelhi.secure.uk, java.util.Map):com.onedelhi.secure.ol3");
    }

    public void reset() {
        this.f31397a.reset();
    }
}
