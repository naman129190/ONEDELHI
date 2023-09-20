package com.onedelhi.secure;

public final class uo3 extends az2 {

    /* renamed from: a */
    public final String f36208a;

    /* renamed from: a */
    public final String[] f36209a;

    /* renamed from: b */
    public final String f36210b;

    /* renamed from: b */
    public final String[] f36211b;

    public uo3(String str, String str2, String str3, String str4) {
        super(bz2.SMS);
        this.f36209a = new String[]{str};
        this.f36211b = new String[]{str2};
        this.f36208a = str3;
        this.f36210b = str4;
    }

    public uo3(String[] strArr, String[] strArr2, String str, String str2) {
        super(bz2.SMS);
        this.f36209a = strArr;
        this.f36211b = strArr2;
        this.f36208a = str;
        this.f36210b = str2;
    }

    /* renamed from: a */
    public String mo31271a() {
        StringBuilder sb = new StringBuilder(100);
        az2.m39208d(this.f36209a, sb);
        az2.m39207c(this.f36208a, sb);
        az2.m39207c(this.f36210b, sb);
        return sb.toString();
    }

    /* renamed from: e */
    public String mo45778e() {
        return this.f36210b;
    }

    /* renamed from: f */
    public String[] mo45779f() {
        return this.f36209a;
    }

    /* renamed from: g */
    public String mo45780g() {
        StringBuilder sb = new StringBuilder();
        sb.append("sms:");
        boolean z = false;
        boolean z2 = true;
        for (int i = 0; i < this.f36209a.length; i++) {
            if (z2) {
                z2 = false;
            } else {
                sb.append(',');
            }
            sb.append(this.f36209a[i]);
            String[] strArr = this.f36211b;
            if (!(strArr == null || strArr[i] == null)) {
                sb.append(";via=");
                sb.append(this.f36211b[i]);
            }
        }
        boolean z3 = this.f36210b != null;
        if (this.f36208a != null) {
            z = true;
        }
        if (z3 || z) {
            sb.append('?');
            if (z3) {
                sb.append("body=");
                sb.append(this.f36210b);
            }
            if (z) {
                if (z3) {
                    sb.append(tk4.f35696c);
                }
                sb.append("subject=");
                sb.append(this.f36208a);
            }
        }
        return sb.toString();
    }

    /* renamed from: h */
    public String mo45781h() {
        return this.f36208a;
    }

    /* renamed from: i */
    public String[] mo45782i() {
        return this.f36211b;
    }
}
