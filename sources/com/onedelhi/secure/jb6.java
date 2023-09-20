package com.onedelhi.secure;

public final class jb6 implements z86 {

    /* renamed from: a */
    public final int f14085a;

    /* renamed from: a */
    public final i96 f14086a;

    /* renamed from: a */
    public final String f14087a = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a";

    /* renamed from: a */
    public final Object[] f14088a;

    public jb6(i96 i96, String str, Object[] objArr) {
        this.f14086a = i96;
        this.f14088a = objArr;
        char charAt = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(0);
        if (charAt < 55296) {
            this.f14085a = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i2);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.f14085a = (charAt2 << i) | c;
                return;
            }
        }
    }

    /* renamed from: a */
    public final i96 mo14104a() {
        return this.f14086a;
    }

    /* renamed from: b */
    public final boolean mo14105b() {
        return (this.f14085a & 2) == 2;
    }

    /* renamed from: c */
    public final String mo18248c() {
        return this.f14087a;
    }

    /* renamed from: d */
    public final Object[] mo18249d() {
        return this.f14088a;
    }

    public final int zzc() {
        return (this.f14085a & 1) == 1 ? 1 : 2;
    }
}
