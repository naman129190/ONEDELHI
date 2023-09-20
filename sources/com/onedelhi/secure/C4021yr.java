package com.onedelhi.secure;

/* renamed from: com.onedelhi.secure.yr */
public class C4021yr extends C3336qr {

    /* renamed from: a */
    public C4023b f23299a = C4023b.UNKNOWN;

    /* renamed from: b */
    public char[] f23300b = h60.f29487F.toCharArray();

    /* renamed from: c */
    public char[] f23301c = h60.f29488G.toCharArray();

    /* renamed from: d */
    public char[] f23302d = "null".toCharArray();

    /* renamed from: q */
    public int f23303q = 0;

    /* renamed from: com.onedelhi.secure.yr$a */
    public static /* synthetic */ class C4022a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23304a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.onedelhi.secure.yr$b[] r0 = com.onedelhi.secure.C4021yr.C4023b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23304a = r0
                com.onedelhi.secure.yr$b r1 = com.onedelhi.secure.C4021yr.C4023b.TRUE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f23304a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.yr$b r1 = com.onedelhi.secure.C4021yr.C4023b.FALSE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f23304a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.yr$b r1 = com.onedelhi.secure.C4021yr.C4023b.NULL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f23304a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.yr$b r1 = com.onedelhi.secure.C4021yr.C4023b.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C4021yr.C4022a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.yr$b */
    public enum C4023b {
        UNKNOWN,
        TRUE,
        FALSE,
        NULL
    }

    public C4021yr(char[] cArr) {
        super(cArr);
    }

    /* renamed from: A */
    public static C3336qr m32615A(char[] cArr) {
        return new C4021yr(cArr);
    }

    /* renamed from: B */
    public boolean mo27668B() throws C3805vr {
        C4023b bVar = this.f23299a;
        if (bVar == C4023b.TRUE) {
            return true;
        }
        if (bVar == C4023b.FALSE) {
            return false;
        }
        throw new C3805vr("this token is not a boolean: <" + mo23405e() + ">", this);
    }

    /* renamed from: C */
    public C4023b mo27669C() {
        return this.f23299a;
    }

    /* renamed from: D */
    public boolean mo27670D() throws C3805vr {
        if (this.f23299a == C4023b.NULL) {
            return true;
        }
        throw new C3805vr("this token is not a null: <" + mo23405e() + ">", this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        if ((r3 + 1) == r0.length) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0058, code lost:
        if ((r3 + 1) == r0.length) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0068, code lost:
        if ((r3 + 1) == r0.length) goto L_0x0047;
     */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo27671F(char r6, long r7) {
        /*
            r5 = this;
            int[] r0 = com.onedelhi.secure.C4021yr.C4022a.f23304a
            com.onedelhi.secure.yr$b r1 = r5.f23299a
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x005b
            r3 = 2
            if (r0 == r3) goto L_0x004b
            r3 = 3
            if (r0 == r3) goto L_0x0038
            r7 = 4
            if (r0 == r7) goto L_0x0018
            goto L_0x006b
        L_0x0018:
            char[] r7 = r5.f23300b
            int r8 = r5.f23303q
            char r7 = r7[r8]
            if (r7 != r6) goto L_0x0026
            com.onedelhi.secure.yr$b r6 = com.onedelhi.secure.C4021yr.C4023b.TRUE
        L_0x0022:
            r5.f23299a = r6
            r1 = 1
            goto L_0x006b
        L_0x0026:
            char[] r7 = r5.f23301c
            char r7 = r7[r8]
            if (r7 != r6) goto L_0x002f
            com.onedelhi.secure.yr$b r6 = com.onedelhi.secure.C4021yr.C4023b.FALSE
            goto L_0x0022
        L_0x002f:
            char[] r7 = r5.f23302d
            char r7 = r7[r8]
            if (r7 != r6) goto L_0x006b
            com.onedelhi.secure.yr$b r6 = com.onedelhi.secure.C4021yr.C4023b.NULL
            goto L_0x0022
        L_0x0038:
            char[] r0 = r5.f23302d
            int r3 = r5.f23303q
            char r4 = r0[r3]
            if (r4 != r6) goto L_0x0041
            r1 = 1
        L_0x0041:
            if (r1 == 0) goto L_0x006b
            int r3 = r3 + r2
            int r6 = r0.length
            if (r3 != r6) goto L_0x006b
        L_0x0047:
            r5.mo23418v(r7)
            goto L_0x006b
        L_0x004b:
            char[] r0 = r5.f23301c
            int r3 = r5.f23303q
            char r4 = r0[r3]
            if (r4 != r6) goto L_0x0054
            r1 = 1
        L_0x0054:
            if (r1 == 0) goto L_0x006b
            int r3 = r3 + r2
            int r6 = r0.length
            if (r3 != r6) goto L_0x006b
            goto L_0x0047
        L_0x005b:
            char[] r0 = r5.f23300b
            int r3 = r5.f23303q
            char r4 = r0[r3]
            if (r4 != r6) goto L_0x0064
            r1 = 1
        L_0x0064:
            if (r1 == 0) goto L_0x006b
            int r3 = r3 + r2
            int r6 = r0.length
            if (r3 != r6) goto L_0x006b
            goto L_0x0047
        L_0x006b:
            int r6 = r5.f23303q
            int r6 = r6 + r2
            r5.f23303q = r6
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C4021yr.mo27671F(char, long):boolean");
    }

    /* renamed from: y */
    public String mo22057y(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        mo23404b(sb, i);
        sb.append(mo23405e());
        return sb.toString();
    }

    /* renamed from: z */
    public String mo22058z() {
        if (!C3736ur.f21479b) {
            return mo23405e();
        }
        return "<" + mo23405e() + ">";
    }
}
