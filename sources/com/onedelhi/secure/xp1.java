package com.onedelhi.secure;

public class xp1 extends wp1 {

    /* renamed from: a */
    public static final /* synthetic */ boolean f37574a = false;

    /* renamed from: a */
    public final int f37575a;

    /* renamed from: a */
    public final h44 f37576a;

    /* renamed from: a */
    public final long[] f37577a;

    /* renamed from: b */
    public int f37578b = 0;

    /* renamed from: b */
    public final long[] f37579b;

    /* renamed from: e */
    public final long f37580e;

    /* renamed from: f */
    public long f37581f = 0;

    /* renamed from: g */
    public long f37582g = 0;

    /* renamed from: h */
    public long f37583h = 0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public xp1(com.onedelhi.secure.us3 r18, com.onedelhi.secure.h44 r19, long r20, int r22) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            r2 = r22
            com.onedelhi.secure.s90 r3 = new com.onedelhi.secure.s90
            java.lang.String r4 = "XZ Index is corrupt"
            r3.<init>(r4)
            r0.<init>(r3)
            r5 = 0
            r0.f37581f = r5
            r3 = 0
            r0.f37578b = r3
            r0.f37582g = r5
            r0.f37583h = r5
            r0.f37576a = r1
            r5 = r20
            r0.f37580e = r5
            long r5 = r18.mo45289b()
            long r7 = r1.f29454a
            long r5 = r5 + r7
            r7 = 4
            long r5 = r5 - r7
            java.util.zip.CRC32 r7 = new java.util.zip.CRC32
            r7.<init>()
            java.util.zip.CheckedInputStream r8 = new java.util.zip.CheckedInputStream
            r9 = r18
            r8.<init>(r9, r7)
            int r10 = r8.read()
            if (r10 != 0) goto L_0x011b
            long r10 = com.onedelhi.secure.jg0.m53344f(r8)     // Catch:{ EOFException -> 0x0114 }
            long r12 = r1.f29454a     // Catch:{ EOFException -> 0x0114 }
            r14 = 2
            long r12 = r12 / r14
            int r1 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r1 >= 0) goto L_0x010d
            r12 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r1 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r1 > 0) goto L_0x0104
            r12 = 16
            long r12 = r12 * r10
            r14 = 1023(0x3ff, double:5.054E-321)
            long r12 = r12 + r14
            r14 = 1024(0x400, double:5.06E-321)
            long r12 = r12 / r14
            int r1 = (int) r12     // Catch:{ EOFException -> 0x0114 }
            int r1 = r1 + 1
            r0.f37575a = r1     // Catch:{ EOFException -> 0x0114 }
            if (r2 < 0) goto L_0x006b
            if (r1 > r2) goto L_0x0065
            goto L_0x006b
        L_0x0065:
            com.onedelhi.secure.xg2 r3 = new com.onedelhi.secure.xg2     // Catch:{ EOFException -> 0x0114 }
            r3.<init>(r1, r2)     // Catch:{ EOFException -> 0x0114 }
            throw r3     // Catch:{ EOFException -> 0x0114 }
        L_0x006b:
            int r1 = (int) r10     // Catch:{ EOFException -> 0x0114 }
            long[] r2 = new long[r1]     // Catch:{ EOFException -> 0x0114 }
            r0.f37577a = r2     // Catch:{ EOFException -> 0x0114 }
            long[] r2 = new long[r1]     // Catch:{ EOFException -> 0x0114 }
            r0.f37579b = r2     // Catch:{ EOFException -> 0x0114 }
            r2 = 0
        L_0x0075:
            if (r1 <= 0) goto L_0x00bb
            long r10 = com.onedelhi.secure.jg0.m53344f(r8)     // Catch:{ EOFException -> 0x0114 }
            long r12 = com.onedelhi.secure.jg0.m53344f(r8)     // Catch:{ EOFException -> 0x0114 }
            long r14 = r18.mo45289b()     // Catch:{ EOFException -> 0x0114 }
            int r16 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r16 > 0) goto L_0x00ae
            long[] r14 = r0.f37577a     // Catch:{ EOFException -> 0x0114 }
            r15 = r4
            long r3 = r0.f37066a     // Catch:{ EOFException -> 0x00ab }
            long r3 = r3 + r10
            r14[r2] = r3     // Catch:{ EOFException -> 0x00ab }
            long[] r3 = r0.f37579b     // Catch:{ EOFException -> 0x00ab }
            r19 = r15
            long r14 = r0.f37068b     // Catch:{ EOFException -> 0x00b8 }
            long r14 = r14 + r12
            r3[r2] = r14     // Catch:{ EOFException -> 0x00b8 }
            int r2 = r2 + 1
            super.mo46813a(r10, r12)     // Catch:{ EOFException -> 0x00b8 }
            long r3 = r0.f37581f     // Catch:{ EOFException -> 0x00b8 }
            int r10 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r10 >= 0) goto L_0x00a5
            r0.f37581f = r12     // Catch:{ EOFException -> 0x00b8 }
        L_0x00a5:
            int r1 = r1 + -1
            r4 = r19
            r3 = 0
            goto L_0x0075
        L_0x00ab:
            r2 = r15
            goto L_0x0115
        L_0x00ae:
            r19 = r4
            com.onedelhi.secure.s90 r1 = new com.onedelhi.secure.s90     // Catch:{ EOFException -> 0x00b8 }
            r2 = r19
            r1.<init>(r2)     // Catch:{ EOFException -> 0x0115 }
            throw r1     // Catch:{ EOFException -> 0x0115 }
        L_0x00b8:
            r2 = r19
            goto L_0x0115
        L_0x00bb:
            r2 = r4
            int r1 = r17.mo46814b()
            long r3 = r18.mo45289b()
            long r10 = (long) r1
            long r3 = r3 + r10
            int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r10 != 0) goto L_0x00fe
        L_0x00ca:
            int r3 = r1 + -1
            if (r1 <= 0) goto L_0x00dc
            int r1 = r8.read()
            if (r1 != 0) goto L_0x00d6
            r1 = r3
            goto L_0x00ca
        L_0x00d6:
            com.onedelhi.secure.s90 r1 = new com.onedelhi.secure.s90
            r1.<init>(r2)
            throw r1
        L_0x00dc:
            long r3 = r7.getValue()
            r1 = 0
        L_0x00e1:
            r5 = 4
            if (r1 >= r5) goto L_0x00fd
            int r5 = r1 * 8
            long r5 = r3 >>> r5
            r7 = 255(0xff, double:1.26E-321)
            long r5 = r5 & r7
            int r7 = r18.read()
            long r7 = (long) r7
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 != 0) goto L_0x00f7
            int r1 = r1 + 1
            goto L_0x00e1
        L_0x00f7:
            com.onedelhi.secure.s90 r1 = new com.onedelhi.secure.s90
            r1.<init>(r2)
            throw r1
        L_0x00fd:
            return
        L_0x00fe:
            com.onedelhi.secure.s90 r1 = new com.onedelhi.secure.s90
            r1.<init>(r2)
            throw r1
        L_0x0104:
            r2 = r4
            com.onedelhi.secure.no4 r1 = new com.onedelhi.secure.no4     // Catch:{ EOFException -> 0x0115 }
            java.lang.String r3 = "XZ Index has over 2147483647 Records"
            r1.<init>(r3)     // Catch:{ EOFException -> 0x0115 }
            throw r1     // Catch:{ EOFException -> 0x0115 }
        L_0x010d:
            r2 = r4
            com.onedelhi.secure.s90 r1 = new com.onedelhi.secure.s90     // Catch:{ EOFException -> 0x0115 }
            r1.<init>(r2)     // Catch:{ EOFException -> 0x0115 }
            throw r1     // Catch:{ EOFException -> 0x0115 }
        L_0x0114:
            r2 = r4
        L_0x0115:
            com.onedelhi.secure.s90 r1 = new com.onedelhi.secure.s90
            r1.<init>(r2)
            throw r1
        L_0x011b:
            r2 = r4
            com.onedelhi.secure.s90 r1 = new com.onedelhi.secure.s90
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.xp1.<init>(com.onedelhi.secure.us3, com.onedelhi.secure.h44, long, int):void");
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ long mo46815c() {
        return super.mo46815c();
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ long mo46816d() {
        return super.mo46816d();
    }

    /* renamed from: f */
    public long mo47376f() {
        return this.f37581f;
    }

    /* renamed from: g */
    public int mo47377g() {
        return this.f37575a;
    }

    /* renamed from: h */
    public int mo47378h() {
        return (int) this.f37070d;
    }

    /* renamed from: i */
    public h44 mo47379i() {
        return this.f37576a;
    }

    /* renamed from: j */
    public long mo47380j() {
        return this.f37068b;
    }

    /* renamed from: k */
    public boolean mo47381k(int i) {
        int i2 = this.f37578b;
        return i >= i2 && ((long) i) < ((long) i2) + this.f37070d;
    }

    /* renamed from: l */
    public boolean mo47382l(long j) {
        long j2 = this.f37583h;
        return j >= j2 && j < j2 + this.f37068b;
    }

    /* renamed from: m */
    public void mo47383m(C7271xm xmVar, long j) {
        long j2 = j - this.f37583h;
        int i = 0;
        int length = this.f37577a.length - 1;
        while (i < length) {
            int i2 = ((length - i) / 2) + i;
            if (this.f37579b[i2] <= j2) {
                i = i2 + 1;
            } else {
                length = i2;
            }
        }
        mo47384n(xmVar, this.f37578b + i);
    }

    /* renamed from: n */
    public void mo47384n(C7271xm xmVar, int i) {
        xmVar.f37539a = this;
        xmVar.f37537a = i;
        int i2 = i - this.f37578b;
        if (i2 == 0) {
            xmVar.f37538a = 0;
            xmVar.f37540b = 0;
        } else {
            int i3 = i2 - 1;
            xmVar.f37538a = (this.f37577a[i3] + 3) & -4;
            xmVar.f37540b = this.f37579b[i3];
        }
        long j = this.f37577a[i2];
        long j2 = xmVar.f37538a;
        xmVar.f37541c = j - j2;
        long j3 = this.f37579b[i2];
        long j4 = xmVar.f37540b;
        xmVar.f37542d = j3 - j4;
        xmVar.f37538a = j2 + this.f37582g + 12;
        xmVar.f37540b = j4 + this.f37583h;
    }

    /* renamed from: o */
    public void mo47385o(xp1 xp1) {
        this.f37578b = xp1.f37578b + ((int) xp1.f37070d);
        this.f37582g = xp1.f37582g + xp1.mo46816d() + xp1.f37580e;
        this.f37583h = xp1.f37583h + xp1.f37068b;
    }
}
