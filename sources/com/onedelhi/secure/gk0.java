package com.onedelhi.secure;

public final class gk0 {

    /* renamed from: b */
    public static final int f29213b = 2;

    /* renamed from: a */
    public final int f29214a;

    /* renamed from: a */
    public final C4559aj f29215a;

    /* renamed from: a */
    public C7173wn f29216a;

    /* renamed from: a */
    public final hk0[] f29217a;

    public gk0(C4559aj ajVar, C7173wn wnVar) {
        this.f29215a = ajVar;
        int a = ajVar.mo30934a();
        this.f29214a = a;
        this.f29216a = wnVar;
        this.f29217a = new hk0[(a + 2)];
    }

    /* renamed from: b */
    public static boolean m49531b(k00 k00, k00 k002) {
        if (k002 == null || !k002.mo38961g() || k002.mo38955a() != k00.mo38955a()) {
            return false;
        }
        k00.mo38963i(k002.mo38957c());
        return true;
    }

    /* renamed from: c */
    public static int m49532c(int i, int i2, k00 k00) {
        if (k00 == null || k00.mo38961g()) {
            return i2;
        }
        if (!k00.mo38962h(i)) {
            return i2 + 1;
        }
        k00.mo38963i(i);
        return 0;
    }

    /* renamed from: a */
    public final void mo36753a(hk0 hk0) {
        if (hk0 != null) {
            ((ik0) hk0).mo38121g(this.f29215a);
        }
    }

    /* renamed from: d */
    public final int mo36754d() {
        int f = mo36756f();
        if (f == 0) {
            return 0;
        }
        for (int i = 1; i < this.f29214a + 1; i++) {
            k00[] d = this.f29217a[i].mo37373d();
            for (int i2 = 0; i2 < d.length; i2++) {
                if (d[i2] != null && !d[i2].mo38961g()) {
                    mo36755e(i, i2, d);
                }
            }
        }
        return f;
    }

    /* renamed from: e */
    public final void mo36755e(int i, int i2, k00[] k00Arr) {
        k00 k00 = k00Arr[i2];
        k00[] d = this.f29217a[i - 1].mo37373d();
        hk0[] hk0Arr = this.f29217a;
        int i3 = i + 1;
        k00[] d2 = hk0Arr[i3] != null ? hk0Arr[i3].mo37373d() : d;
        k00[] k00Arr2 = new k00[14];
        k00Arr2[2] = d[i2];
        k00Arr2[3] = d2[i2];
        int i4 = 0;
        if (i2 > 0) {
            int i5 = i2 - 1;
            k00Arr2[0] = k00Arr[i5];
            k00Arr2[4] = d[i5];
            k00Arr2[5] = d2[i5];
        }
        if (i2 > 1) {
            int i6 = i2 - 2;
            k00Arr2[8] = k00Arr[i6];
            k00Arr2[10] = d[i6];
            k00Arr2[11] = d2[i6];
        }
        if (i2 < k00Arr.length - 1) {
            int i7 = i2 + 1;
            k00Arr2[1] = k00Arr[i7];
            k00Arr2[6] = d[i7];
            k00Arr2[7] = d2[i7];
        }
        if (i2 < k00Arr.length - 2) {
            int i8 = i2 + 2;
            k00Arr2[9] = k00Arr[i8];
            k00Arr2[12] = d[i8];
            k00Arr2[13] = d2[i8];
        }
        while (i4 < 14 && !m49531b(k00, k00Arr2[i4])) {
            i4++;
        }
    }

    /* renamed from: f */
    public final int mo36756f() {
        mo36757g();
        return mo36758h() + mo36759i();
    }

    /* renamed from: g */
    public final void mo36757g() {
        hk0[] hk0Arr = this.f29217a;
        if (hk0Arr[0] != null && hk0Arr[this.f29214a + 1] != null) {
            k00[] d = hk0Arr[0].mo37373d();
            k00[] d2 = this.f29217a[this.f29214a + 1].mo37373d();
            for (int i = 0; i < d.length; i++) {
                if (!(d[i] == null || d2[i] == null || d[i].mo38957c() != d2[i].mo38957c())) {
                    for (int i2 = 1; i2 <= this.f29214a; i2++) {
                        k00 k00 = this.f29217a[i2].mo37373d()[i];
                        if (k00 != null) {
                            k00.mo38963i(d[i].mo38957c());
                            if (!k00.mo38961g()) {
                                this.f29217a[i2].mo37373d()[i] = null;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public final int mo36758h() {
        hk0[] hk0Arr = this.f29217a;
        if (hk0Arr[0] == null) {
            return 0;
        }
        k00[] d = hk0Arr[0].mo37373d();
        int i = 0;
        for (int i2 = 0; i2 < d.length; i2++) {
            if (d[i2] != null) {
                int c = d[i2].mo38957c();
                int i3 = 0;
                for (int i4 = 1; i4 < this.f29214a + 1 && i3 < 2; i4++) {
                    k00 k00 = this.f29217a[i4].mo37373d()[i2];
                    if (k00 != null) {
                        i3 = m49532c(c, i3, k00);
                        if (!k00.mo38961g()) {
                            i++;
                        }
                    }
                }
            }
        }
        return i;
    }

    /* renamed from: i */
    public final int mo36759i() {
        hk0[] hk0Arr = this.f29217a;
        int i = this.f29214a;
        if (hk0Arr[i + 1] == null) {
            return 0;
        }
        k00[] d = hk0Arr[i + 1].mo37373d();
        int i2 = 0;
        for (int i3 = 0; i3 < d.length; i3++) {
            if (d[i3] != null) {
                int c = d[i3].mo38957c();
                int i4 = 0;
                for (int i5 = this.f29214a + 1; i5 > 0 && i4 < 2; i5--) {
                    k00 k00 = this.f29217a[i5].mo37373d()[i3];
                    if (k00 != null) {
                        i4 = m49532c(c, i4, k00);
                        if (!k00.mo38961g()) {
                            i2++;
                        }
                    }
                }
            }
        }
        return i2;
    }

    /* renamed from: j */
    public int mo36760j() {
        return this.f29214a;
    }

    /* renamed from: k */
    public int mo36761k() {
        return this.f29215a.mo30935b();
    }

    /* renamed from: l */
    public int mo36762l() {
        return this.f29215a.mo30936c();
    }

    /* renamed from: m */
    public C7173wn mo36763m() {
        return this.f29216a;
    }

    /* renamed from: n */
    public hk0 mo36764n(int i) {
        return this.f29217a[i];
    }

    /* renamed from: o */
    public hk0[] mo36765o() {
        mo36753a(this.f29217a[0]);
        mo36753a(this.f29217a[this.f29214a + 1]);
        int i = 928;
        while (true) {
            int d = mo36754d();
            if (d > 0 && d < i) {
                i = d;
            }
        }
        return this.f29217a;
    }

    /* renamed from: p */
    public void mo36766p(C7173wn wnVar) {
        this.f29216a = wnVar;
    }

    /* renamed from: q */
    public void mo36767q(int i, hk0 hk0) {
        this.f29217a[i] = hk0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0083, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0084, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0087, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r10 = this;
            com.onedelhi.secure.hk0[] r0 = r10.f29217a
            r1 = 0
            r2 = r0[r1]
            r3 = 1
            if (r2 != 0) goto L_0x000d
            int r2 = r10.f29214a
            int r2 = r2 + r3
            r2 = r0[r2]
        L_0x000d:
            java.util.Formatter r0 = new java.util.Formatter
            r0.<init>()
            r4 = 0
        L_0x0013:
            com.onedelhi.secure.k00[] r5 = r2.mo37373d()     // Catch:{ all -> 0x007c }
            int r5 = r5.length     // Catch:{ all -> 0x007c }
            if (r4 >= r5) goto L_0x0074
            java.lang.String r5 = "CW %3d:"
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x007c }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x007c }
            r6[r1] = r7     // Catch:{ all -> 0x007c }
            r0.format(r5, r6)     // Catch:{ all -> 0x007c }
            r5 = 0
        L_0x0028:
            int r6 = r10.f29214a     // Catch:{ all -> 0x007c }
            r7 = 2
            int r6 = r6 + r7
            if (r5 >= r6) goto L_0x006a
            com.onedelhi.secure.hk0[] r6 = r10.f29217a     // Catch:{ all -> 0x007c }
            r8 = r6[r5]     // Catch:{ all -> 0x007c }
            java.lang.String r9 = "    |   "
            if (r8 != 0) goto L_0x003c
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x007c }
            r0.format(r9, r6)     // Catch:{ all -> 0x007c }
            goto L_0x0067
        L_0x003c:
            r6 = r6[r5]     // Catch:{ all -> 0x007c }
            com.onedelhi.secure.k00[] r6 = r6.mo37373d()     // Catch:{ all -> 0x007c }
            r6 = r6[r4]     // Catch:{ all -> 0x007c }
            if (r6 != 0) goto L_0x004c
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x007c }
            r0.format(r9, r6)     // Catch:{ all -> 0x007c }
            goto L_0x0067
        L_0x004c:
            java.lang.String r8 = " %3d|%3d"
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x007c }
            int r9 = r6.mo38957c()     // Catch:{ all -> 0x007c }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x007c }
            r7[r1] = r9     // Catch:{ all -> 0x007c }
            int r6 = r6.mo38959e()     // Catch:{ all -> 0x007c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x007c }
            r7[r3] = r6     // Catch:{ all -> 0x007c }
            r0.format(r8, r7)     // Catch:{ all -> 0x007c }
        L_0x0067:
            int r5 = r5 + 1
            goto L_0x0028
        L_0x006a:
            java.lang.String r5 = "%n"
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x007c }
            r0.format(r5, r6)     // Catch:{ all -> 0x007c }
            int r4 = r4 + 1
            goto L_0x0013
        L_0x0074:
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x007c }
            r0.close()
            return r1
        L_0x007c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x007e }
        L_0x007e:
            r2 = move-exception
            r0.close()     // Catch:{ all -> 0x0083 }
            goto L_0x0087
        L_0x0083:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x0087:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.gk0.toString():java.lang.String");
    }
}
