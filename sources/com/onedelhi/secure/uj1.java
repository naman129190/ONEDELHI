package com.onedelhi.secure;

public final class uj1 extends k02 {

    /* renamed from: c */
    public static final /* synthetic */ boolean f36159c = false;

    /* renamed from: a */
    public final fe2 f36160a;

    /* renamed from: a */
    public final lk1 f36161a;

    /* renamed from: a */
    public final int[] f36162a;

    /* renamed from: l */
    public final int f36163l;

    /* renamed from: m */
    public final int f36164m;

    /* renamed from: n */
    public int f36165n = -1;

    /* renamed from: o */
    public int f36166o;

    public uj1(int i, int i2, int i3, int i4, int i5, int i6, C4477aa aaVar) {
        super(i, i2, i3, i4, i5, aaVar);
        this.f36161a = new lk1(i, aaVar);
        int i7 = i + 1;
        this.f36164m = i7;
        this.f36162a = aaVar.mo30488d(i7, false);
        this.f36166o = i7;
        this.f36160a = new fe2(i4 - 1);
        this.f36163l = i6 <= 0 ? (i4 / 4) + 4 : i6;
    }

    /* renamed from: y */
    public static int m67087y(int i) {
        return lk1.m55721f(i) + (i / 256) + 10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008f A[LOOP:0: B:22:0x008f->B:25:0x009f, LOOP_START, PHI: r7 
      PHI: (r7v11 int) = (r7v4 int), (r7v12 int) binds: [B:21:0x008d, B:25:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0111 A[EDGE_INSN: B:59:0x0111->B:54:0x0111 ?: BREAK  
    EDGE_INSN: B:60:0x0111->B:54:0x0111 ?: BREAK  ] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.onedelhi.secure.fe2 mo34462j() {
        /*
            r13 = this;
            com.onedelhi.secure.fe2 r0 = r13.f36160a
            r1 = 0
            r0.f28271a = r1
            int r0 = r13.f31040c
            int r2 = r13.f31041d
            int r3 = r13.mo45622z()
            if (r3 >= r0) goto L_0x0018
            if (r3 != 0) goto L_0x0014
            com.onedelhi.secure.fe2 r0 = r13.f36160a
            return r0
        L_0x0014:
            r0 = r3
            if (r2 <= r3) goto L_0x0018
            r2 = r0
        L_0x0018:
            com.onedelhi.secure.lk1 r3 = r13.f36161a
            byte[] r4 = r13.f31038a
            int r5 = r13.f31043f
            r3.mo39892a(r4, r5)
            int r3 = r13.f36166o
            com.onedelhi.secure.lk1 r4 = r13.f36161a
            int r4 = r4.mo39893b()
            int r3 = r3 - r4
            int r4 = r13.f36166o
            com.onedelhi.secure.lk1 r5 = r13.f36161a
            int r5 = r5.mo39894c()
            int r4 = r4 - r5
            com.onedelhi.secure.lk1 r5 = r13.f36161a
            int r5 = r5.mo39895d()
            com.onedelhi.secure.lk1 r6 = r13.f36161a
            int r7 = r13.f36166o
            r6.mo39898i(r7)
            int[] r6 = r13.f36162a
            int r7 = r13.f36165n
            r6[r7] = r5
            int r6 = r13.f36164m
            r7 = 2
            r8 = 1
            if (r3 >= r6) goto L_0x0067
            byte[] r9 = r13.f31038a
            int r10 = r13.f31043f
            int r11 = r10 - r3
            byte r11 = r9[r11]
            byte r9 = r9[r10]
            if (r11 != r9) goto L_0x0067
            com.onedelhi.secure.fe2 r9 = r13.f36160a
            int[] r10 = r9.f28272a
            r10[r1] = r7
            int[] r10 = r9.f28273b
            int r11 = r3 + -1
            r10[r1] = r11
            r9.f28271a = r8
            goto L_0x0068
        L_0x0067:
            r7 = 0
        L_0x0068:
            r9 = 3
            if (r3 == r4) goto L_0x0089
            if (r4 >= r6) goto L_0x0089
            byte[] r6 = r13.f31038a
            int r10 = r13.f31043f
            int r11 = r10 - r4
            byte r11 = r6[r11]
            byte r6 = r6[r10]
            if (r11 != r6) goto L_0x0089
            com.onedelhi.secure.fe2 r3 = r13.f36160a
            int[] r6 = r3.f28273b
            int r7 = r3.f28271a
            int r10 = r7 + 1
            r3.f28271a = r10
            int r3 = r4 + -1
            r6[r7] = r3
            r3 = r4
            r7 = 3
        L_0x0089:
            com.onedelhi.secure.fe2 r4 = r13.f36160a
            int r4 = r4.f28271a
            if (r4 <= 0) goto L_0x00ae
        L_0x008f:
            if (r7 >= r0) goto L_0x00a2
            byte[] r4 = r13.f31038a
            int r6 = r13.f31043f
            int r10 = r6 + r7
            int r10 = r10 - r3
            byte r10 = r4[r10]
            int r6 = r6 + r7
            byte r4 = r4[r6]
            if (r10 != r4) goto L_0x00a2
            int r7 = r7 + 1
            goto L_0x008f
        L_0x00a2:
            com.onedelhi.secure.fe2 r3 = r13.f36160a
            int[] r4 = r3.f28272a
            int r6 = r3.f28271a
            int r6 = r6 - r8
            r4[r6] = r7
            if (r7 < r2) goto L_0x00ae
            return r3
        L_0x00ae:
            if (r7 >= r9) goto L_0x00b1
            goto L_0x00b2
        L_0x00b1:
            r9 = r7
        L_0x00b2:
            int r3 = r13.f36163l
        L_0x00b4:
            int r4 = r13.f36166o
            int r4 = r4 - r5
            int r5 = r3 + -1
            if (r3 == 0) goto L_0x0111
            int r3 = r13.f36164m
            if (r4 < r3) goto L_0x00c0
            goto L_0x0111
        L_0x00c0:
            int[] r6 = r13.f36162a
            int r7 = r13.f36165n
            int r10 = r7 - r4
            if (r4 <= r7) goto L_0x00c9
            goto L_0x00ca
        L_0x00c9:
            r3 = 0
        L_0x00ca:
            int r10 = r10 + r3
            r3 = r6[r10]
            byte[] r6 = r13.f31038a
            int r7 = r13.f31043f
            int r10 = r7 + r9
            int r10 = r10 - r4
            byte r10 = r6[r10]
            int r11 = r7 + r9
            byte r11 = r6[r11]
            if (r10 != r11) goto L_0x010d
            int r10 = r7 - r4
            byte r10 = r6[r10]
            byte r6 = r6[r7]
            if (r10 != r6) goto L_0x010d
            r6 = 0
        L_0x00e5:
            int r6 = r6 + r8
            if (r6 >= r0) goto L_0x00f6
            byte[] r7 = r13.f31038a
            int r10 = r13.f31043f
            int r11 = r10 + r6
            int r11 = r11 - r4
            byte r11 = r7[r11]
            int r10 = r10 + r6
            byte r7 = r7[r10]
            if (r11 == r7) goto L_0x00e5
        L_0x00f6:
            if (r6 <= r9) goto L_0x010d
            com.onedelhi.secure.fe2 r7 = r13.f36160a
            int[] r9 = r7.f28272a
            int r10 = r7.f28271a
            r9[r10] = r6
            int[] r9 = r7.f28273b
            int r4 = r4 + -1
            r9[r10] = r4
            int r10 = r10 + r8
            r7.f28271a = r10
            if (r6 < r2) goto L_0x010c
            return r7
        L_0x010c:
            r9 = r6
        L_0x010d:
            r12 = r5
            r5 = r3
            r3 = r12
            goto L_0x00b4
        L_0x0111:
            com.onedelhi.secure.fe2 r0 = r13.f36160a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.uj1.mo34462j():com.onedelhi.secure.fe2");
    }

    /* renamed from: s */
    public void mo34463s(C4477aa aaVar) {
        aaVar.mo30490f(this.f36162a);
        this.f36161a.mo39897h(aaVar);
        super.mo34463s(aaVar);
    }

    /* renamed from: w */
    public void mo34464w(int i) {
        while (true) {
            int i2 = i - 1;
            if (i > 0) {
                if (mo45622z() != 0) {
                    this.f36161a.mo39892a(this.f31038a, this.f31043f);
                    this.f36162a[this.f36165n] = this.f36161a.mo39895d();
                    this.f36161a.mo39898i(this.f36166o);
                }
                i = i2;
            } else {
                return;
            }
        }
    }

    /* renamed from: z */
    public final int mo45622z() {
        int o = mo38976o(4, 4);
        if (o != 0) {
            int i = this.f36166o + 1;
            this.f36166o = i;
            if (i == Integer.MAX_VALUE) {
                int i2 = Integer.MAX_VALUE - this.f36164m;
                this.f36161a.mo39896g(i2);
                k02.m53927q(this.f36162a, this.f36164m, i2);
                this.f36166o -= i2;
            }
            int i3 = this.f36165n + 1;
            this.f36165n = i3;
            if (i3 == this.f36164m) {
                this.f36165n = 0;
            }
        }
        return o;
    }
}
