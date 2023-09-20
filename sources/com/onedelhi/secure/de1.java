package com.onedelhi.secure;

import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

public final class de1 {

    /* renamed from: a */
    public final C6014ll f27378a;

    /* renamed from: a */
    public final vb0 f27379a = new vb0();

    /* renamed from: a */
    public final StringBuilder f27380a = new StringBuilder();

    public de1(C6014ll llVar) {
        this.f27378a = llVar;
    }

    /* renamed from: g */
    public static int m45003g(C6014ll llVar, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (llVar.mo39930h(i + i4)) {
                i3 |= 1 << ((i2 - i4) - 1);
            }
        }
        return i3;
    }

    /* renamed from: a */
    public String mo34324a(StringBuilder sb, int i) throws tr2, ha1 {
        String str = null;
        while (true) {
            xf0 c = mo34326c(i, str);
            String a = e21.m45850a(c.mo47144b());
            if (a != null) {
                sb.append(a);
            }
            String valueOf = c.mo47146d() ? String.valueOf(c.mo47145c()) : null;
            if (i == c.mo48249a()) {
                return sb.toString();
            }
            i = c.mo48249a();
            str = valueOf;
        }
    }

    /* renamed from: b */
    public final wf0 mo34325b(int i) {
        char c;
        int f = mo34329f(i, 5);
        if (f == 15) {
            return new wf0(i + 5, '$');
        }
        if (f >= 5 && f < 15) {
            return new wf0(i + 5, (char) ((f + 48) - 5));
        }
        int f2 = mo34329f(i, 6);
        if (f2 >= 32 && f2 < 58) {
            return new wf0(i + 6, (char) (f2 + 33));
        }
        switch (f2) {
            case 58:
                c = '*';
                break;
            case 59:
                c = ',';
                break;
            case 60:
                c = '-';
                break;
            case 61:
                c = '.';
                break;
            case 62:
                c = '/';
                break;
            default:
                throw new IllegalStateException("Decoding invalid alphanumeric value: ".concat(String.valueOf(f2)));
        }
        return new wf0(i + 6, c);
    }

    /* renamed from: c */
    public xf0 mo34326c(int i, String str) throws ha1 {
        this.f27380a.setLength(0);
        if (str != null) {
            this.f27380a.append(str);
        }
        this.f27379a.mo46072i(i);
        xf0 o = mo34337o();
        return (o == null || !o.mo47146d()) ? new xf0(this.f27379a.mo46064a(), this.f27380a.toString()) : new xf0(this.f27379a.mo46064a(), this.f27380a.toString(), o.mo47145c());
    }

    /* renamed from: d */
    public final wf0 mo34327d(int i) throws ha1 {
        char c;
        int f = mo34329f(i, 5);
        if (f == 15) {
            return new wf0(i + 5, '$');
        }
        if (f >= 5 && f < 15) {
            return new wf0(i + 5, (char) ((f + 48) - 5));
        }
        int f2 = mo34329f(i, 7);
        if (f2 >= 64 && f2 < 90) {
            return new wf0(i + 7, (char) (f2 + 1));
        }
        if (f2 >= 90 && f2 < 116) {
            return new wf0(i + 7, (char) (f2 + 7));
        }
        switch (mo34329f(i, 8)) {
            case 232:
                c = PublicSuffixDatabase.f38853a;
                break;
            case 233:
                c = tk4.f35693a;
                break;
            case 234:
                c = '%';
                break;
            case 235:
                c = tk4.f35696c;
                break;
            case 236:
                c = '\'';
                break;
            case 237:
                c = '(';
                break;
            case 238:
                c = ')';
                break;
            case 239:
                c = '*';
                break;
            case 240:
                c = '+';
                break;
            case 241:
                c = ',';
                break;
            case 242:
                c = '-';
                break;
            case 243:
                c = '.';
                break;
            case 244:
                c = '/';
                break;
            case 245:
                c = ':';
                break;
            case 246:
                c = ';';
                break;
            case 247:
                c = tk4.f35697d;
                break;
            case 248:
                c = '=';
                break;
            case wg1.f22106f:
                c = tk4.f35698e;
                break;
            case 250:
                c = '?';
                break;
            case 251:
                c = '_';
                break;
            case 252:
                c = ' ';
                break;
            default:
                throw ha1.m50341a();
        }
        return new wf0(i + 8, c);
    }

    /* renamed from: e */
    public final yf0 mo34328e(int i) throws ha1 {
        int i2 = i + 7;
        if (i2 > this.f27378a.mo39935l()) {
            int f = mo34329f(i, 4);
            return f == 0 ? new yf0(this.f27378a.mo39935l(), 10, 10) : new yf0(this.f27378a.mo39935l(), f - 1, 10);
        }
        int f2 = mo34329f(i, 7) - 8;
        return new yf0(i2, f2 / 11, f2 % 11);
    }

    /* renamed from: f */
    public int mo34329f(int i, int i2) {
        return m45003g(this.f27378a, i, i2);
    }

    /* renamed from: h */
    public final boolean mo34330h(int i) {
        int i2 = i + 3;
        if (i2 > this.f27378a.mo39935l()) {
            return false;
        }
        while (i < i2) {
            if (this.f27378a.mo39930h(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: i */
    public final boolean mo34331i(int i) {
        int i2;
        if (i + 1 > this.f27378a.mo39935l()) {
            return false;
        }
        int i3 = 0;
        while (i3 < 5 && (i2 = i3 + i) < this.f27378a.mo39935l()) {
            if (i3 == 2) {
                if (!this.f27378a.mo39930h(i + 2)) {
                    return false;
                }
            } else if (this.f27378a.mo39930h(i2)) {
                return false;
            }
            i3++;
        }
        return true;
    }

    /* renamed from: j */
    public final boolean mo34332j(int i) {
        int i2;
        if (i + 1 > this.f27378a.mo39935l()) {
            return false;
        }
        int i3 = 0;
        while (i3 < 4 && (i2 = i3 + i) < this.f27378a.mo39935l()) {
            if (this.f27378a.mo39930h(i2)) {
                return false;
            }
            i3++;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        r6 = mo34329f(r6, 6);
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo34333k(int r6) {
        /*
            r5 = this;
            int r0 = r6 + 5
            com.onedelhi.secure.ll r1 = r5.f27378a
            int r1 = r1.mo39935l()
            r2 = 0
            if (r0 <= r1) goto L_0x000c
            return r2
        L_0x000c:
            r0 = 5
            int r1 = r5.mo34329f(r6, r0)
            r3 = 1
            r4 = 16
            if (r1 < r0) goto L_0x0019
            if (r1 >= r4) goto L_0x0019
            return r3
        L_0x0019:
            int r0 = r6 + 6
            com.onedelhi.secure.ll r1 = r5.f27378a
            int r1 = r1.mo39935l()
            if (r0 <= r1) goto L_0x0024
            return r2
        L_0x0024:
            r0 = 6
            int r6 = r5.mo34329f(r6, r0)
            if (r6 < r4) goto L_0x0030
            r0 = 63
            if (r6 >= r0) goto L_0x0030
            return r3
        L_0x0030:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.de1.mo34333k(int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        r5 = mo34329f(r5, 8);
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo34334l(int r5) {
        /*
            r4 = this;
            int r0 = r5 + 5
            com.onedelhi.secure.ll r1 = r4.f27378a
            int r1 = r1.mo39935l()
            r2 = 0
            if (r0 <= r1) goto L_0x000c
            return r2
        L_0x000c:
            r0 = 5
            int r1 = r4.mo34329f(r5, r0)
            r3 = 1
            if (r1 < r0) goto L_0x0019
            r0 = 16
            if (r1 >= r0) goto L_0x0019
            return r3
        L_0x0019:
            int r0 = r5 + 7
            com.onedelhi.secure.ll r1 = r4.f27378a
            int r1 = r1.mo39935l()
            if (r0 <= r1) goto L_0x0024
            return r2
        L_0x0024:
            r0 = 7
            int r0 = r4.mo34329f(r5, r0)
            r1 = 64
            if (r0 < r1) goto L_0x0032
            r1 = 116(0x74, float:1.63E-43)
            if (r0 >= r1) goto L_0x0032
            return r3
        L_0x0032:
            int r0 = r5 + 8
            com.onedelhi.secure.ll r1 = r4.f27378a
            int r1 = r1.mo39935l()
            if (r0 <= r1) goto L_0x003d
            return r2
        L_0x003d:
            r0 = 8
            int r5 = r4.mo34329f(r5, r0)
            r0 = 232(0xe8, float:3.25E-43)
            if (r5 < r0) goto L_0x004c
            r0 = 253(0xfd, float:3.55E-43)
            if (r5 >= r0) goto L_0x004c
            return r3
        L_0x004c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.de1.mo34334l(int):boolean");
    }

    /* renamed from: m */
    public final boolean mo34335m(int i) {
        if (i + 7 > this.f27378a.mo39935l()) {
            return i + 4 <= this.f27378a.mo39935l();
        }
        int i2 = i;
        while (true) {
            int i3 = i + 3;
            if (i2 >= i3) {
                return this.f27378a.mo39930h(i3);
            }
            if (this.f27378a.mo39930h(i2)) {
                return true;
            }
            i2++;
        }
    }

    /* renamed from: n */
    public final C4683bn mo34336n() {
        while (mo34333k(this.f27379a.mo46064a())) {
            wf0 b = mo34325b(this.f27379a.mo46064a());
            this.f27379a.mo46072i(b.mo48249a());
            if (b.mo46711c()) {
                return new C4683bn(new xf0(this.f27379a.mo46064a(), this.f27380a.toString()), true);
            }
            this.f27380a.append(b.mo46710b());
        }
        if (mo34330h(this.f27379a.mo46064a())) {
            this.f27379a.mo46065b(3);
            this.f27379a.mo46071h();
        } else if (mo34331i(this.f27379a.mo46064a())) {
            if (this.f27379a.mo46064a() + 5 < this.f27378a.mo39935l()) {
                this.f27379a.mo46065b(5);
            } else {
                this.f27379a.mo46072i(this.f27378a.mo39935l());
            }
            this.f27379a.mo46070g();
        }
        return new C4683bn(false);
    }

    /* renamed from: o */
    public final xf0 mo34337o() throws ha1 {
        C4683bn n;
        boolean b;
        do {
            int a = this.f27379a.mo46064a();
            n = this.f27379a.mo46066c() ? mo34336n() : this.f27379a.mo46067d() ? mo34338p() : mo34339q();
            b = n.mo31953b();
            if (!(a != this.f27379a.mo46064a()) && !b) {
                break;
            }
        } while (!b);
        return n.mo31952a();
    }

    /* renamed from: p */
    public final C4683bn mo34338p() throws ha1 {
        while (mo34334l(this.f27379a.mo46064a())) {
            wf0 d = mo34327d(this.f27379a.mo46064a());
            this.f27379a.mo46072i(d.mo48249a());
            if (d.mo46711c()) {
                return new C4683bn(new xf0(this.f27379a.mo46064a(), this.f27380a.toString()), true);
            }
            this.f27380a.append(d.mo46710b());
        }
        if (mo34330h(this.f27379a.mo46064a())) {
            this.f27379a.mo46065b(3);
            this.f27379a.mo46071h();
        } else if (mo34331i(this.f27379a.mo46064a())) {
            if (this.f27379a.mo46064a() + 5 < this.f27378a.mo39935l()) {
                this.f27379a.mo46065b(5);
            } else {
                this.f27379a.mo46072i(this.f27378a.mo39935l());
            }
            this.f27379a.mo46069f();
        }
        return new C4683bn(false);
    }

    /* renamed from: q */
    public final C4683bn mo34339q() throws ha1 {
        while (mo34335m(this.f27379a.mo46064a())) {
            yf0 e = mo34328e(this.f27379a.mo46064a());
            this.f27379a.mo46072i(e.mo48249a());
            if (e.mo47783e()) {
                return new C4683bn(e.mo47784f() ? new xf0(this.f27379a.mo46064a(), this.f27380a.toString()) : new xf0(this.f27379a.mo46064a(), this.f27380a.toString(), e.mo47781c()), true);
            }
            this.f27380a.append(e.mo47780b());
            if (e.mo47784f()) {
                return new C4683bn(new xf0(this.f27379a.mo46064a(), this.f27380a.toString()), true);
            }
            this.f27380a.append(e.mo47781c());
        }
        if (mo34332j(this.f27379a.mo46064a())) {
            this.f27379a.mo46069f();
            this.f27379a.mo46065b(4);
        }
        return new C4683bn(false);
    }
}
