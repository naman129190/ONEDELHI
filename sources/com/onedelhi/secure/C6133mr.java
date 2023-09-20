package com.onedelhi.secure;

/* renamed from: com.onedelhi.secure.mr */
public class C6133mr implements au0 {
    /* renamed from: e */
    public static String m57491e(CharSequence charSequence) {
        int charAt = (charSequence.charAt(0) * 1600) + (charSequence.charAt(1) * '(') + charSequence.charAt(2) + 1;
        return new String(new char[]{(char) (charAt / 256), (char) (charAt % 256)});
    }

    /* renamed from: g */
    public static void m57492g(eu0 eu0, StringBuilder sb) {
        eu0.mo35633t(m57491e(sb));
        sb.delete(0, 3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0053, code lost:
        if (r2 != 1) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0044, code lost:
        if (r2 != 2) goto L_0x0046;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0051  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo31183a(com.onedelhi.secure.eu0 r9) {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L_0x0005:
            boolean r1 = r9.mo35623j()
            if (r1 == 0) goto L_0x0075
            char r1 = r9.mo35617d()
            int r2 = r9.f28091a
            r3 = 1
            int r2 = r2 + r3
            r9.f28091a = r2
            int r1 = r8.mo40743d(r1, r0)
            int r2 = r0.length()
            r4 = 3
            int r2 = r2 / r4
            int r2 = r2 << r3
            int r5 = r9.mo35614a()
            int r5 = r5 + r2
            r9.mo35631r(r5)
            com.onedelhi.secure.m84 r2 = r9.mo35621h()
            int r2 = r2.mo40511b()
            int r2 = r2 - r5
            boolean r5 = r9.mo35623j()
            if (r5 != 0) goto L_0x0056
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r6 = r0.length()
            int r6 = r6 % r4
            r7 = 2
            if (r6 != r7) goto L_0x004a
            if (r2 == r7) goto L_0x004a
        L_0x0046:
            int r1 = r8.mo40742c(r9, r0, r5, r1)
        L_0x004a:
            int r6 = r0.length()
            int r6 = r6 % r4
            if (r6 != r3) goto L_0x0075
            if (r1 > r4) goto L_0x0046
            if (r2 == r3) goto L_0x0075
            goto L_0x0046
        L_0x0056:
            int r1 = r0.length()
            int r1 = r1 % r4
            if (r1 != 0) goto L_0x0005
            java.lang.String r1 = r9.mo35618e()
            int r2 = r9.f28091a
            int r3 = r8.mo31184b()
            int r1 = com.onedelhi.secure.ql1.m63050o(r1, r2, r3)
            int r2 = r8.mo31184b()
            if (r1 == r2) goto L_0x0005
            r1 = 0
            r9.mo35629p(r1)
        L_0x0075:
            r8.mo40744f(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C6133mr.mo31183a(com.onedelhi.secure.eu0):void");
    }

    /* renamed from: b */
    public int mo31184b() {
        return 1;
    }

    /* renamed from: c */
    public final int mo40742c(eu0 eu0, StringBuilder sb, StringBuilder sb2, int i) {
        int length = sb.length();
        sb.delete(length - i, length);
        eu0.f28091a--;
        int d = mo40743d(eu0.mo35617d(), sb2);
        eu0.mo35625l();
        return d;
    }

    /* renamed from: d */
    public int mo40743d(char c, StringBuilder sb) {
        int i;
        int i2;
        char c2;
        if (c == ' ') {
            c2 = 3;
        } else {
            if (c >= '0' && c <= '9') {
                i2 = (c - '0') + 4;
            } else if (c < 'A' || c > 'Z') {
                if (c < ' ') {
                    sb.append(0);
                } else {
                    if (c <= '/') {
                        sb.append(1);
                        i = c - '!';
                    } else if (c <= '@') {
                        sb.append(1);
                        i = (c - ':') + 15;
                    } else if (c <= '_') {
                        sb.append(1);
                        i = (c - '[') + 22;
                    } else if (c <= 127) {
                        sb.append(2);
                        i = c - '`';
                    } else {
                        sb.append("\u0001\u001e");
                        return mo40743d((char) (c - 128), sb) + 2;
                    }
                    c = (char) i;
                }
                sb.append(c);
                return 2;
            } else {
                i2 = (c - 'A') + 14;
            }
            c2 = (char) i2;
        }
        sb.append(c2);
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        if (r8.mo35623j() == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0035, code lost:
        if (r8.mo35623j() != false) goto L_0x0037;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo40744f(com.onedelhi.secure.eu0 r8, java.lang.StringBuilder r9) {
        /*
            r7 = this;
            int r0 = r9.length()
            r1 = 3
            int r0 = r0 / r1
            r2 = 1
            int r0 = r0 << r2
            int r3 = r9.length()
            int r3 = r3 % r1
            int r4 = r8.mo35614a()
            int r4 = r4 + r0
            r8.mo35631r(r4)
            com.onedelhi.secure.m84 r0 = r8.mo35621h()
            int r0 = r0.mo40511b()
            int r0 = r0 - r4
            r4 = 0
            r5 = 254(0xfe, float:3.56E-43)
            r6 = 2
            if (r3 != r6) goto L_0x003b
            r9.append(r4)
        L_0x0027:
            int r0 = r9.length()
            if (r0 < r1) goto L_0x0031
            m57492g(r8, r9)
            goto L_0x0027
        L_0x0031:
            boolean r9 = r8.mo35623j()
            if (r9 == 0) goto L_0x006d
        L_0x0037:
            r8.mo35632s(r5)
            goto L_0x006d
        L_0x003b:
            if (r0 != r2) goto L_0x0058
            if (r3 != r2) goto L_0x0058
        L_0x003f:
            int r0 = r9.length()
            if (r0 < r1) goto L_0x0049
            m57492g(r8, r9)
            goto L_0x003f
        L_0x0049:
            boolean r9 = r8.mo35623j()
            if (r9 == 0) goto L_0x0052
            r8.mo35632s(r5)
        L_0x0052:
            int r9 = r8.f28091a
            int r9 = r9 - r2
            r8.f28091a = r9
            goto L_0x006d
        L_0x0058:
            if (r3 != 0) goto L_0x0071
        L_0x005a:
            int r2 = r9.length()
            if (r2 < r1) goto L_0x0064
            m57492g(r8, r9)
            goto L_0x005a
        L_0x0064:
            if (r0 > 0) goto L_0x0037
            boolean r9 = r8.mo35623j()
            if (r9 == 0) goto L_0x006d
            goto L_0x0037
        L_0x006d:
            r8.mo35629p(r4)
            return
        L_0x0071:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Unexpected case. Please report!"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C6133mr.mo40744f(com.onedelhi.secure.eu0, java.lang.StringBuilder):void");
    }
}
