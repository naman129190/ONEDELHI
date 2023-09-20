package com.onedelhi.secure;

/* renamed from: com.onedelhi.secure.gj */
public final class C5436gj implements au0 {
    /* renamed from: c */
    public static char m49513c(char c, int i) {
        int i2 = c + ((i * 149) % 255) + 1;
        return i2 <= 255 ? (char) i2 : (char) (i2 - 256);
    }

    /* renamed from: a */
    public void mo31183a(eu0 eu0) {
        StringBuilder sb = new StringBuilder();
        sb.append(0);
        while (true) {
            if (!eu0.mo35623j()) {
                break;
            }
            sb.append(eu0.mo35617d());
            eu0.f28091a++;
            if (ql1.m63050o(eu0.mo35618e(), eu0.f28091a, mo31184b()) != mo31184b()) {
                eu0.mo35629p(0);
                break;
            }
        }
        int length = sb.length() - 1;
        int a = eu0.mo35614a() + length + 1;
        eu0.mo35631r(a);
        boolean z = eu0.mo35621h().mo40511b() - a > 0;
        if (eu0.mo35623j() || z) {
            if (length <= 249) {
                sb.setCharAt(0, (char) length);
            } else if (length <= 1555) {
                sb.setCharAt(0, (char) ((length / 250) + wg1.f22106f));
                sb.insert(1, (char) (length % 250));
            } else {
                throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
            }
        }
        int length2 = sb.length();
        for (int i = 0; i < length2; i++) {
            eu0.mo35632s(m49513c(sb.charAt(i), eu0.mo35614a() + 1));
        }
    }

    /* renamed from: b */
    public int mo31184b() {
        return 5;
    }
}
