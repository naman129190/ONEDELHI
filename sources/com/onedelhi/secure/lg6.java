package com.onedelhi.secure;

import java.util.List;

public final class lg6 extends e56 implements l96 {
    /* access modifiers changed from: private */
    public static final lg6 zzb;
    private q56 zzd = e56.m13586e();

    static {
        lg6 lg6 = new lg6();
        zzb = lg6;
        e56.m13589h(lg6.class, lg6);
    }

    /* renamed from: l */
    public static lg6 m20662l(byte[] bArr) throws t66 {
        return (lg6) e56.m13585d(zzb, bArr);
    }

    /* renamed from: i */
    public final Object mo15053i(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return e56.m13588g(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzd"});
        } else if (i2 == 3) {
            return new lg6();
        } else {
            if (i2 == 4) {
                return new ig6((fg6) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: m */
    public final List mo19551m() {
        return this.zzd;
    }
}
