package com.onedelhi.secure;

/* renamed from: com.onedelhi.secure.z */
public final class C7402z implements au0 {
    /* renamed from: c */
    public static char m72408c(char c, char c2) {
        if (ql1.m63042g(c) && ql1.m63042g(c2)) {
            return (char) (((c - '0') * 10) + (c2 - '0') + 130);
        }
        throw new IllegalArgumentException("not digits: " + c + c2);
    }

    /* renamed from: a */
    public void mo31183a(eu0 eu0) {
        if (ql1.m63036a(eu0.mo35618e(), eu0.f28091a) >= 2) {
            eu0.mo35632s(m72408c(eu0.mo35618e().charAt(eu0.f28091a), eu0.mo35618e().charAt(eu0.f28091a + 1)));
            eu0.f28091a += 2;
            return;
        }
        char d = eu0.mo35617d();
        int o = ql1.m63050o(eu0.mo35618e(), eu0.f28091a, mo31184b());
        if (o != mo31184b()) {
            if (o == 1) {
                eu0.mo35632s(ql1.f34276b);
                eu0.mo35629p(1);
            } else if (o == 2) {
                eu0.mo35632s(ql1.f34289h);
                eu0.mo35629p(2);
            } else if (o == 3) {
                eu0.mo35632s(ql1.f34288g);
                eu0.mo35629p(3);
            } else if (o == 4) {
                eu0.mo35632s(ql1.f34290i);
                eu0.mo35629p(4);
            } else if (o == 5) {
                eu0.mo35632s(ql1.f34279c);
                eu0.mo35629p(5);
            } else {
                throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(o)));
            }
        } else if (ql1.m63043h(d)) {
            eu0.mo35632s(ql1.f34282d);
            eu0.mo35632s((char) ((d - 128) + 1));
            eu0.f28091a++;
        } else {
            eu0.mo35632s((char) (d + 1));
            eu0.f28091a++;
        }
    }

    /* renamed from: b */
    public int mo31184b() {
        return 0;
    }
}
