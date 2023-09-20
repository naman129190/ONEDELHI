package com.onedelhi.secure;

public final class wy4 extends C6133mr {
    /* renamed from: a */
    public void mo31183a(eu0 eu0) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!eu0.mo35623j()) {
                break;
            }
            char d = eu0.mo35617d();
            eu0.f28091a++;
            mo40743d(d, sb);
            if (sb.length() % 3 == 0) {
                C6133mr.m57492g(eu0, sb);
                if (ql1.m63050o(eu0.mo35618e(), eu0.f28091a, mo31184b()) != mo31184b()) {
                    eu0.mo35629p(0);
                    break;
                }
            }
        }
        mo40744f(eu0, sb);
    }

    /* renamed from: b */
    public int mo31184b() {
        return 3;
    }

    /* renamed from: d */
    public int mo40743d(char c, StringBuilder sb) {
        char c2;
        int i;
        if (c == 13) {
            c2 = 0;
        } else if (c != ' ') {
            if (c == '*') {
                sb.append(1);
            } else if (c != '>') {
                if (c >= '0' && c <= '9') {
                    i = (c - '0') + 4;
                } else if (c < 'A' || c > 'Z') {
                    ql1.m63041f(c);
                } else {
                    i = (c - 'A') + 14;
                }
                c2 = (char) i;
            } else {
                c2 = 2;
            }
            return 1;
        } else {
            c2 = 3;
        }
        sb.append(c2);
        return 1;
    }

    /* renamed from: f */
    public void mo40744f(eu0 eu0, StringBuilder sb) {
        eu0.mo35630q();
        int b = eu0.mo35621h().mo40511b() - eu0.mo35614a();
        eu0.f28091a -= sb.length();
        if (eu0.mo35620g() > 1 || b > 1 || eu0.mo35620g() != b) {
            eu0.mo35632s(254);
        }
        if (eu0.mo35619f() < 0) {
            eu0.mo35629p(0);
        }
    }
}
