package com.onedelhi.secure;

public final class cs0 implements au0 {
    /* renamed from: c */
    public static void m44248c(char c, StringBuilder sb) {
        if (c >= ' ' && c <= '?') {
            sb.append(c);
        } else if (c < '@' || c > '^') {
            ql1.m63041f(c);
        } else {
            sb.append((char) (c - '@'));
        }
    }

    /* renamed from: d */
    public static String m44249d(CharSequence charSequence) {
        int length = charSequence.length();
        if (length != 0) {
            char c = 0;
            char charAt = charSequence.charAt(0);
            char charAt2 = length >= 2 ? charSequence.charAt(1) : 0;
            char charAt3 = length >= 3 ? charSequence.charAt(2) : 0;
            if (length >= 4) {
                c = charSequence.charAt(3);
            }
            int i = (charAt << 18) + (charAt2 << 12) + (charAt3 << 6) + c;
            char c2 = (char) ((i >> 8) & 255);
            char c3 = (char) (i & 255);
            StringBuilder sb = new StringBuilder(3);
            sb.append((char) ((i >> 16) & 255));
            if (length >= 2) {
                sb.append(c2);
            }
            if (length >= 3) {
                sb.append(c3);
            }
            return sb.toString();
        }
        throw new IllegalStateException("StringBuilder must not be empty");
    }

    /* renamed from: e */
    public static void m44250e(eu0 eu0, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length != 0) {
                boolean z = true;
                if (length == 1) {
                    eu0.mo35630q();
                    int b = eu0.mo35621h().mo40511b() - eu0.mo35614a();
                    int g = eu0.mo35620g();
                    if (g > b) {
                        eu0.mo35631r(eu0.mo35614a() + 1);
                        b = eu0.mo35621h().mo40511b() - eu0.mo35614a();
                    }
                    if (g <= b && b <= 2) {
                        eu0.mo35629p(0);
                        return;
                    }
                }
                if (length <= 4) {
                    int i = length - 1;
                    String d = m44249d(charSequence);
                    if (!(!eu0.mo35623j()) || i > 2) {
                        z = false;
                    }
                    if (i <= 2) {
                        eu0.mo35631r(eu0.mo35614a() + i);
                        if (eu0.mo35621h().mo40511b() - eu0.mo35614a() >= 3) {
                            eu0.mo35631r(eu0.mo35614a() + d.length());
                            z = false;
                        }
                    }
                    if (z) {
                        eu0.mo35625l();
                        eu0.f28091a -= i;
                    } else {
                        eu0.mo35633t(d);
                    }
                    eu0.mo35629p(0);
                    return;
                }
                throw new IllegalStateException("Count must not exceed 4");
            }
        } finally {
            eu0.mo35629p(0);
        }
    }

    /* renamed from: a */
    public void mo31183a(eu0 eu0) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!eu0.mo35623j()) {
                break;
            }
            m44248c(eu0.mo35617d(), sb);
            eu0.f28091a++;
            if (sb.length() >= 4) {
                eu0.mo35633t(m44249d(sb));
                sb.delete(0, 4);
                if (ql1.m63050o(eu0.mo35618e(), eu0.f28091a, mo31184b()) != mo31184b()) {
                    eu0.mo35629p(0);
                    break;
                }
            }
        }
        sb.append(oo2.f33149a);
        m44250e(eu0, sb);
    }

    /* renamed from: b */
    public int mo31184b() {
        return 4;
    }
}
