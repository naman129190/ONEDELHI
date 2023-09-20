package com.onedelhi.secure;

/* renamed from: com.onedelhi.secure.wn */
public final class C7173wn {

    /* renamed from: a */
    public final int f37047a;

    /* renamed from: a */
    public final C6190nl f37048a;

    /* renamed from: a */
    public final sl3 f37049a;

    /* renamed from: b */
    public final int f37050b;

    /* renamed from: b */
    public final sl3 f37051b;

    /* renamed from: c */
    public final int f37052c;

    /* renamed from: c */
    public final sl3 f37053c;

    /* renamed from: d */
    public final int f37054d;

    /* renamed from: d */
    public final sl3 f37055d;

    public C7173wn(C6190nl nlVar, sl3 sl3, sl3 sl32, sl3 sl33, sl3 sl34) throws tr2 {
        boolean z = false;
        boolean z2 = sl3 == null || sl32 == null;
        z = (sl33 == null || sl34 == null) ? true : z;
        if (!z2 || !z) {
            if (z2) {
                sl3 = new sl3(0.0f, sl33.mo44404d());
                sl32 = new sl3(0.0f, sl34.mo44404d());
            } else if (z) {
                sl33 = new sl3((float) (nlVar.mo41094l() - 1), sl3.mo44404d());
                sl34 = new sl3((float) (nlVar.mo41094l() - 1), sl32.mo44404d());
            }
            this.f37048a = nlVar;
            this.f37049a = sl3;
            this.f37051b = sl32;
            this.f37053c = sl33;
            this.f37055d = sl34;
            this.f37047a = (int) Math.min(sl3.mo44403c(), sl32.mo44403c());
            this.f37050b = (int) Math.max(sl33.mo44403c(), sl34.mo44403c());
            this.f37052c = (int) Math.min(sl3.mo44404d(), sl33.mo44404d());
            this.f37054d = (int) Math.max(sl32.mo44404d(), sl34.mo44404d());
            return;
        }
        throw tr2.m66179a();
    }

    public C7173wn(C7173wn wnVar) {
        this.f37048a = wnVar.f37048a;
        this.f37049a = wnVar.f37049a;
        this.f37051b = wnVar.f37051b;
        this.f37053c = wnVar.f37053c;
        this.f37055d = wnVar.f37055d;
        this.f37047a = wnVar.f37047a;
        this.f37050b = wnVar.f37050b;
        this.f37052c = wnVar.f37052c;
        this.f37054d = wnVar.f37054d;
    }

    /* renamed from: j */
    public static C7173wn m69495j(C7173wn wnVar, C7173wn wnVar2) throws tr2 {
        return wnVar == null ? wnVar2 : wnVar2 == null ? wnVar : new C7173wn(wnVar.f37048a, wnVar.f37049a, wnVar.f37051b, wnVar2.f37053c, wnVar2.f37055d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.onedelhi.secure.C7173wn mo46801a(int r13, int r14, boolean r15) throws com.onedelhi.secure.tr2 {
        /*
            r12 = this;
            com.onedelhi.secure.sl3 r0 = r12.f37049a
            com.onedelhi.secure.sl3 r1 = r12.f37051b
            com.onedelhi.secure.sl3 r2 = r12.f37053c
            com.onedelhi.secure.sl3 r3 = r12.f37055d
            if (r13 <= 0) goto L_0x0029
            if (r15 == 0) goto L_0x000e
            r4 = r0
            goto L_0x000f
        L_0x000e:
            r4 = r2
        L_0x000f:
            float r5 = r4.mo44404d()
            int r5 = (int) r5
            int r5 = r5 - r13
            if (r5 >= 0) goto L_0x0018
            r5 = 0
        L_0x0018:
            com.onedelhi.secure.sl3 r13 = new com.onedelhi.secure.sl3
            float r4 = r4.mo44403c()
            float r5 = (float) r5
            r13.<init>(r4, r5)
            if (r15 == 0) goto L_0x0026
            r8 = r13
            goto L_0x002a
        L_0x0026:
            r10 = r13
            r8 = r0
            goto L_0x002b
        L_0x0029:
            r8 = r0
        L_0x002a:
            r10 = r2
        L_0x002b:
            if (r14 <= 0) goto L_0x005b
            if (r15 == 0) goto L_0x0032
            com.onedelhi.secure.sl3 r13 = r12.f37051b
            goto L_0x0034
        L_0x0032:
            com.onedelhi.secure.sl3 r13 = r12.f37055d
        L_0x0034:
            float r0 = r13.mo44404d()
            int r0 = (int) r0
            int r0 = r0 + r14
            com.onedelhi.secure.nl r14 = r12.f37048a
            int r14 = r14.mo41089h()
            if (r0 < r14) goto L_0x004a
            com.onedelhi.secure.nl r14 = r12.f37048a
            int r14 = r14.mo41089h()
            int r0 = r14 + -1
        L_0x004a:
            com.onedelhi.secure.sl3 r14 = new com.onedelhi.secure.sl3
            float r13 = r13.mo44403c()
            float r0 = (float) r0
            r14.<init>(r13, r0)
            if (r15 == 0) goto L_0x0058
            r9 = r14
            goto L_0x005c
        L_0x0058:
            r11 = r14
            r9 = r1
            goto L_0x005d
        L_0x005b:
            r9 = r1
        L_0x005c:
            r11 = r3
        L_0x005d:
            com.onedelhi.secure.wn r13 = new com.onedelhi.secure.wn
            com.onedelhi.secure.nl r7 = r12.f37048a
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C7173wn.mo46801a(int, int, boolean):com.onedelhi.secure.wn");
    }

    /* renamed from: b */
    public sl3 mo46802b() {
        return this.f37051b;
    }

    /* renamed from: c */
    public sl3 mo46803c() {
        return this.f37055d;
    }

    /* renamed from: d */
    public int mo46804d() {
        return this.f37050b;
    }

    /* renamed from: e */
    public int mo46805e() {
        return this.f37054d;
    }

    /* renamed from: f */
    public int mo46806f() {
        return this.f37047a;
    }

    /* renamed from: g */
    public int mo46807g() {
        return this.f37052c;
    }

    /* renamed from: h */
    public sl3 mo46808h() {
        return this.f37049a;
    }

    /* renamed from: i */
    public sl3 mo46809i() {
        return this.f37053c;
    }
}
