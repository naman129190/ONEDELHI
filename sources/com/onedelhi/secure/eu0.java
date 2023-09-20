package com.onedelhi.secure;

import java.nio.charset.StandardCharsets;

public final class eu0 {

    /* renamed from: a */
    public int f28091a;

    /* renamed from: a */
    public bl0 f28092a;

    /* renamed from: a */
    public m84 f28093a;

    /* renamed from: a */
    public n84 f28094a;

    /* renamed from: a */
    public final String f28095a;

    /* renamed from: a */
    public final StringBuilder f28096a;

    /* renamed from: b */
    public int f28097b;

    /* renamed from: b */
    public bl0 f28098b;

    /* renamed from: c */
    public int f28099c;

    public eu0(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        int i = 0;
        while (i < length) {
            char c = (char) (bytes[i] & 255);
            if (c != '?' || str.charAt(i) == '?') {
                sb.append(c);
                i++;
            } else {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
        }
        this.f28095a = sb.toString();
        this.f28094a = n84.FORCE_NONE;
        this.f28096a = new StringBuilder(str.length());
        this.f28097b = -1;
    }

    /* renamed from: a */
    public int mo35614a() {
        return this.f28096a.length();
    }

    /* renamed from: b */
    public StringBuilder mo35615b() {
        return this.f28096a;
    }

    /* renamed from: c */
    public char mo35616c() {
        return this.f28095a.charAt(this.f28091a);
    }

    /* renamed from: d */
    public char mo35617d() {
        return this.f28095a.charAt(this.f28091a);
    }

    /* renamed from: e */
    public String mo35618e() {
        return this.f28095a;
    }

    /* renamed from: f */
    public int mo35619f() {
        return this.f28097b;
    }

    /* renamed from: g */
    public int mo35620g() {
        return mo35622i() - this.f28091a;
    }

    /* renamed from: h */
    public m84 mo35621h() {
        return this.f28093a;
    }

    /* renamed from: i */
    public final int mo35622i() {
        return this.f28095a.length() - this.f28099c;
    }

    /* renamed from: j */
    public boolean mo35623j() {
        return this.f28091a < mo35622i();
    }

    /* renamed from: k */
    public void mo35624k() {
        this.f28097b = -1;
    }

    /* renamed from: l */
    public void mo35625l() {
        this.f28093a = null;
    }

    /* renamed from: m */
    public void mo35626m(bl0 bl0, bl0 bl02) {
        this.f28092a = bl0;
        this.f28098b = bl02;
    }

    /* renamed from: n */
    public void mo35627n(int i) {
        this.f28099c = i;
    }

    /* renamed from: o */
    public void mo35628o(n84 n84) {
        this.f28094a = n84;
    }

    /* renamed from: p */
    public void mo35629p(int i) {
        this.f28097b = i;
    }

    /* renamed from: q */
    public void mo35630q() {
        mo35631r(mo35614a());
    }

    /* renamed from: r */
    public void mo35631r(int i) {
        m84 m84 = this.f28093a;
        if (m84 == null || i > m84.mo40511b()) {
            this.f28093a = m84.m56971o(i, this.f28094a, this.f28092a, this.f28098b, true);
        }
    }

    /* renamed from: s */
    public void mo35632s(char c) {
        this.f28096a.append(c);
    }

    /* renamed from: t */
    public void mo35633t(String str) {
        this.f28096a.append(str);
    }
}
