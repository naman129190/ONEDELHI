package com.onedelhi.secure;

public class hk0 {

    /* renamed from: a */
    public static final int f29662a = 5;

    /* renamed from: a */
    public final C7173wn f29663a;

    /* renamed from: a */
    public final k00[] f29664a;

    public hk0(C7173wn wnVar) {
        this.f29663a = new C7173wn(wnVar);
        this.f29664a = new k00[((wnVar.mo46805e() - wnVar.mo46807g()) + 1)];
    }

    /* renamed from: a */
    public final C7173wn mo37370a() {
        return this.f29663a;
    }

    /* renamed from: b */
    public final k00 mo37371b(int i) {
        return this.f29664a[mo37374e(i)];
    }

    /* renamed from: c */
    public final k00 mo37372c(int i) {
        k00 k00;
        k00 k002;
        k00 b = mo37371b(i);
        if (b != null) {
            return b;
        }
        for (int i2 = 1; i2 < 5; i2++) {
            int e = mo37374e(i) - i2;
            if (e >= 0 && (k002 = this.f29664a[e]) != null) {
                return k002;
            }
            int e2 = mo37374e(i) + i2;
            k00[] k00Arr = this.f29664a;
            if (e2 < k00Arr.length && (k00 = k00Arr[e2]) != null) {
                return k00;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final k00[] mo37373d() {
        return this.f29664a;
    }

    /* renamed from: e */
    public final int mo37374e(int i) {
        return i - this.f29663a.mo46807g();
    }

    /* renamed from: f */
    public final void mo37375f(int i, k00 k00) {
        this.f29664a[mo37374e(i)] = k00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0056, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005f, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r11 = this;
            java.util.Formatter r0 = new java.util.Formatter
            r0.<init>()
            com.onedelhi.secure.k00[] r1 = r11.f29664a     // Catch:{ all -> 0x0054 }
            int r2 = r1.length     // Catch:{ all -> 0x0054 }
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x000b:
            if (r4 >= r2) goto L_0x004c
            r6 = r1[r4]     // Catch:{ all -> 0x0054 }
            r7 = 1
            if (r6 != 0) goto L_0x0023
            java.lang.String r6 = "%3d:    |   %n"
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x0054 }
            int r8 = r5 + 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0054 }
            r7[r3] = r5     // Catch:{ all -> 0x0054 }
            r0.format(r6, r7)     // Catch:{ all -> 0x0054 }
            r5 = r8
            goto L_0x0049
        L_0x0023:
            java.lang.String r8 = "%3d: %3d|%3d%n"
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ all -> 0x0054 }
            int r10 = r5 + 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0054 }
            r9[r3] = r5     // Catch:{ all -> 0x0054 }
            int r5 = r6.mo38957c()     // Catch:{ all -> 0x0054 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0054 }
            r9[r7] = r5     // Catch:{ all -> 0x0054 }
            r5 = 2
            int r6 = r6.mo38959e()     // Catch:{ all -> 0x0054 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0054 }
            r9[r5] = r6     // Catch:{ all -> 0x0054 }
            r0.format(r8, r9)     // Catch:{ all -> 0x0054 }
            r5 = r10
        L_0x0049:
            int r4 = r4 + 1
            goto L_0x000b
        L_0x004c:
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x0054 }
            r0.close()
            return r1
        L_0x0054:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r2 = move-exception
            r0.close()     // Catch:{ all -> 0x005b }
            goto L_0x005f
        L_0x005b:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x005f:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.hk0.toString():java.lang.String");
    }
}
