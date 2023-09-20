package com.onedelhi.secure;

/* renamed from: com.onedelhi.secure.ur */
public class C3736ur {

    /* renamed from: b */
    public static boolean f21479b = false;

    /* renamed from: a */
    public int f21480a;

    /* renamed from: a */
    public String f21481a;

    /* renamed from: a */
    public boolean f21482a = false;

    /* renamed from: com.onedelhi.secure.ur$a */
    public static /* synthetic */ class C3737a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f21483a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.onedelhi.secure.ur$b[] r0 = com.onedelhi.secure.C3736ur.C3738b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21483a = r0
                com.onedelhi.secure.ur$b r1 = com.onedelhi.secure.C3736ur.C3738b.OBJECT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f21483a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.ur$b r1 = com.onedelhi.secure.C3736ur.C3738b.ARRAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f21483a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.ur$b r1 = com.onedelhi.secure.C3736ur.C3738b.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f21483a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onedelhi.secure.ur$b r1 = com.onedelhi.secure.C3736ur.C3738b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f21483a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onedelhi.secure.ur$b r1 = com.onedelhi.secure.C3736ur.C3738b.KEY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f21483a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onedelhi.secure.ur$b r1 = com.onedelhi.secure.C3736ur.C3738b.TOKEN     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C3736ur.C3737a.<clinit>():void");
        }
    }

    /* renamed from: com.onedelhi.secure.ur$b */
    public enum C3738b {
        UNKNOWN,
        OBJECT,
        ARRAY,
        NUMBER,
        STRING,
        KEY,
        TOKEN
    }

    public C3736ur(String str) {
        this.f21481a = str;
    }

    /* renamed from: d */
    public static C3652tr m29530d(String str) throws C3805vr {
        return new C3736ur(str).mo25710c();
    }

    /* renamed from: a */
    public final C3336qr mo25708a(C3336qr qrVar, int i, C3738b bVar, boolean z, char[] cArr) {
        C3336qr qrVar2;
        if (f21479b) {
            System.out.println("CREATE " + bVar + " at " + cArr[i]);
        }
        switch (C3737a.f21483a[bVar.ordinal()]) {
            case 1:
                qrVar2 = C3652tr.m28852h0(cArr);
                break;
            case 2:
                qrVar2 = C3086or.m24040B(cArr);
                break;
            case 3:
                qrVar2 = C3946xr.m31665A(cArr);
                break;
            case 4:
                qrVar2 = C3535sr.m27794A(cArr);
                break;
            case 5:
                qrVar2 = C3450rr.m27026B(cArr);
                break;
            case 6:
                qrVar2 = C4021yr.m32615A(cArr);
                break;
            default:
                qrVar2 = null;
                break;
        }
        i++;
        if (qrVar2 == null) {
            return null;
        }
        qrVar2.mo23419w(this.f21480a);
        if (z) {
            qrVar2.mo23420x((long) i);
        }
        if (qrVar instanceof C3182pr) {
            qrVar2.mo23417u((C3182pr) qrVar);
        }
        return qrVar2;
    }

    /* renamed from: b */
    public final C3336qr mo25709b(int i, char c, C3336qr qrVar, char[] cArr) throws C3805vr {
        if (c == 9 || c == 10 || c == 13 || c == ' ') {
            return qrVar;
        }
        if (c == '\"' || c == '\'') {
            if (qrVar instanceof C3652tr) {
                return mo25708a(qrVar, i, C3738b.KEY, true, cArr);
            }
            return mo25708a(qrVar, i, C3738b.STRING, true, cArr);
        } else if (c != '[') {
            if (c != ']') {
                if (c == '{') {
                    return mo25708a(qrVar, i, C3738b.OBJECT, true, cArr);
                } else if (c != '}') {
                    switch (c) {
                        case '+':
                        case '-':
                        case '.':
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            return mo25708a(qrVar, i, C3738b.NUMBER, true, cArr);
                        case ',':
                        case ':':
                            return qrVar;
                        case '/':
                            int i2 = i + 1;
                            if (i2 >= cArr.length || cArr[i2] != '/') {
                                return qrVar;
                            }
                            this.f21482a = true;
                            return qrVar;
                        default:
                            if (!(qrVar instanceof C3182pr) || (qrVar instanceof C3652tr)) {
                                return mo25708a(qrVar, i, C3738b.KEY, true, cArr);
                            }
                            C3336qr a = mo25708a(qrVar, i, C3738b.TOKEN, true, cArr);
                            C4021yr yrVar = (C4021yr) a;
                            if (yrVar.mo27671F(c, (long) i)) {
                                return a;
                            }
                            throw new C3805vr("incorrect token <" + c + "> at line " + this.f21480a, yrVar);
                    }
                }
            }
            qrVar.mo23418v((long) (i - 1));
            C3336qr f = qrVar.mo23406f();
            f.mo23418v((long) i);
            return f;
        } else {
            return mo25708a(qrVar, i, C3738b.ARRAY, true, cArr);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005f, code lost:
        if (r9 == '}') goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0068, code lost:
        if (r9 == ']') goto L_0x007c;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.onedelhi.secure.C3652tr mo25710c() throws com.onedelhi.secure.C3805vr {
        /*
            r16 = this;
            r0 = r16
            java.lang.String r1 = r0.f21481a
            char[] r1 = r1.toCharArray()
            int r2 = r1.length
            r3 = 1
            r0.f21480a = r3
            r4 = 0
            r5 = 0
        L_0x000e:
            r6 = -1
            r7 = 10
            if (r5 >= r2) goto L_0x0024
            char r8 = r1[r5]
            r9 = 123(0x7b, float:1.72E-43)
            if (r8 != r9) goto L_0x001a
            goto L_0x0025
        L_0x001a:
            if (r8 != r7) goto L_0x0021
            int r6 = r0.f21480a
            int r6 = r6 + r3
            r0.f21480a = r6
        L_0x0021:
            int r5 = r5 + 1
            goto L_0x000e
        L_0x0024:
            r5 = -1
        L_0x0025:
            if (r5 == r6) goto L_0x0173
            com.onedelhi.secure.tr r6 = com.onedelhi.secure.C3652tr.m28852h0(r1)
            int r8 = r0.f21480a
            r6.mo23419w(r8)
            long r8 = (long) r5
            r6.mo23420x(r8)
            int r5 = r5 + r3
            r8 = r6
        L_0x0036:
            if (r5 >= r2) goto L_0x0132
            char r9 = r1[r5]
            if (r9 != r7) goto L_0x0041
            int r10 = r0.f21480a
            int r10 = r10 + r3
            r0.f21480a = r10
        L_0x0041:
            boolean r10 = r0.f21482a
            if (r10 == 0) goto L_0x0049
            if (r9 != r7) goto L_0x012c
            r0.f21482a = r4
        L_0x0049:
            if (r8 != 0) goto L_0x004d
            goto L_0x0132
        L_0x004d:
            boolean r10 = r8.mo23414r()
            if (r10 == 0) goto L_0x0059
        L_0x0053:
            com.onedelhi.secure.qr r8 = r0.mo25709b(r5, r9, r8, r1)
            goto L_0x0113
        L_0x0059:
            boolean r10 = r8 instanceof com.onedelhi.secure.C3652tr
            r11 = 125(0x7d, float:1.75E-43)
            if (r10 == 0) goto L_0x0062
            if (r9 != r11) goto L_0x0053
        L_0x0061:
            goto L_0x007c
        L_0x0062:
            boolean r10 = r8 instanceof com.onedelhi.secure.C3086or
            r12 = 93
            if (r10 == 0) goto L_0x006b
            if (r9 != r12) goto L_0x0053
            goto L_0x0061
        L_0x006b:
            boolean r10 = r8 instanceof com.onedelhi.secure.C3946xr
            r13 = 1
            if (r10 == 0) goto L_0x0084
            long r10 = r8.f19440b
            int r12 = (int) r10
            char r12 = r1[r12]
            if (r12 != r9) goto L_0x0113
            long r10 = r10 + r13
            r8.mo23420x(r10)
        L_0x007c:
            int r9 = r5 + -1
            long r9 = (long) r9
            r8.mo23418v(r9)
            goto L_0x0113
        L_0x0084:
            boolean r15 = r8 instanceof com.onedelhi.secure.C4021yr
            if (r15 == 0) goto L_0x00b8
            r15 = r8
            com.onedelhi.secure.yr r15 = (com.onedelhi.secure.C4021yr) r15
            long r3 = (long) r5
            boolean r3 = r15.mo27671F(r9, r3)
            if (r3 == 0) goto L_0x0093
            goto L_0x00b8
        L_0x0093:
            com.onedelhi.secure.vr r1 = new com.onedelhi.secure.vr
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "parsing incorrect token "
            r2.append(r3)
            java.lang.String r3 = r15.mo23405e()
            r2.append(r3)
            java.lang.String r3 = " at line "
            r2.append(r3)
            int r3 = r0.f21480a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r15)
            throw r1
        L_0x00b8:
            boolean r3 = r8 instanceof com.onedelhi.secure.C3450rr
            if (r3 != 0) goto L_0x00be
            if (r10 == 0) goto L_0x00d7
        L_0x00be:
            long r3 = r8.f19440b
            int r10 = (int) r3
            char r10 = r1[r10]
            r15 = 39
            if (r10 == r15) goto L_0x00cb
            r15 = 34
            if (r10 != r15) goto L_0x00d7
        L_0x00cb:
            if (r10 != r9) goto L_0x00d7
            long r3 = r3 + r13
            r8.mo23420x(r3)
            int r3 = r5 + -1
            long r3 = (long) r3
            r8.mo23418v(r3)
        L_0x00d7:
            boolean r3 = r8.mo23414r()
            if (r3 != 0) goto L_0x0113
            if (r9 == r11) goto L_0x00f7
            if (r9 == r12) goto L_0x00f7
            r3 = 44
            if (r9 == r3) goto L_0x00f7
            r3 = 32
            if (r9 == r3) goto L_0x00f7
            r3 = 9
            if (r9 == r3) goto L_0x00f7
            r3 = 13
            if (r9 == r3) goto L_0x00f7
            if (r9 == r7) goto L_0x00f7
            r3 = 58
            if (r9 != r3) goto L_0x0113
        L_0x00f7:
            int r3 = r5 + -1
            long r3 = (long) r3
            r8.mo23418v(r3)
            if (r9 == r11) goto L_0x0101
            if (r9 != r12) goto L_0x0113
        L_0x0101:
            com.onedelhi.secure.qr r8 = r8.mo23406f()
            r8.mo23418v(r3)
            boolean r9 = r8 instanceof com.onedelhi.secure.C3450rr
            if (r9 == 0) goto L_0x0113
            com.onedelhi.secure.qr r8 = r8.mo23406f()
            r8.mo23418v(r3)
        L_0x0113:
            boolean r3 = r8.mo23414r()
            if (r3 == 0) goto L_0x012c
            boolean r3 = r8 instanceof com.onedelhi.secure.C3450rr
            if (r3 == 0) goto L_0x0128
            r3 = r8
            com.onedelhi.secure.rr r3 = (com.onedelhi.secure.C3450rr) r3
            java.util.ArrayList<com.onedelhi.secure.qr> r3 = r3.f18683a
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x012c
        L_0x0128:
            com.onedelhi.secure.qr r8 = r8.mo23406f()
        L_0x012c:
            int r5 = r5 + 1
            r3 = 1
            r4 = 0
            goto L_0x0036
        L_0x0132:
            if (r8 == 0) goto L_0x0154
            boolean r1 = r8.mo23414r()
            if (r1 != 0) goto L_0x0154
            boolean r1 = r8 instanceof com.onedelhi.secure.C3946xr
            if (r1 == 0) goto L_0x0148
            long r3 = r8.f19440b
            int r1 = (int) r3
            r3 = 1
            int r1 = r1 + r3
            long r4 = (long) r1
            r8.mo23420x(r4)
            goto L_0x0149
        L_0x0148:
            r3 = 1
        L_0x0149:
            int r1 = r2 + -1
            long r4 = (long) r1
            r8.mo23418v(r4)
            com.onedelhi.secure.qr r8 = r8.mo23406f()
            goto L_0x0132
        L_0x0154:
            boolean r1 = f21479b
            if (r1 == 0) goto L_0x0172
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Root: "
            r2.append(r3)
            java.lang.String r3 = r6.mo22058z()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.println(r2)
        L_0x0172:
            return r6
        L_0x0173:
            com.onedelhi.secure.vr r1 = new com.onedelhi.secure.vr
            r2 = 0
            java.lang.String r3 = "invalid json content"
            r1.<init>(r3, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C3736ur.mo25710c():com.onedelhi.secure.tr");
    }
}
