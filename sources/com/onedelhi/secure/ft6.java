package com.onedelhi.secure;

public final class ft6 implements ss6 {

    /* renamed from: a */
    public final int f12324a;

    /* renamed from: a */
    public final vs6 f12325a;

    /* renamed from: a */
    public final String f12326a;

    /* renamed from: a */
    public final Object[] f12327a;

    public ft6(vs6 vs6, String str, Object[] objArr) {
        this.f12325a = vs6;
        this.f12326a = str;
        this.f12327a = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f12324a = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 1;
        int i2 = 13;
        while (true) {
            int i3 = i + 1;
            char charAt2 = str.charAt(i);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i2;
                i2 += 13;
                i = i3;
            } else {
                this.f12324a = c | (charAt2 << i2);
                return;
            }
        }
    }

    /* renamed from: a */
    public final vs6 mo16167a() {
        return this.f12325a;
    }

    /* renamed from: b */
    public final boolean mo16168b() {
        return (this.f12324a & 2) == 2;
    }

    /* renamed from: c */
    public final String mo16169c() {
        return this.f12326a;
    }

    /* renamed from: d */
    public final Object[] mo16170d() {
        return this.f12327a;
    }

    public final int zzc() {
        return (this.f12324a & 1) == 1 ? 1 : 2;
    }
}
