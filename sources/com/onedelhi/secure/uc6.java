package com.onedelhi.secure;

import java.util.List;

public final class uc6 extends jq6 implements ws6 {
    /* access modifiers changed from: private */
    public static final uc6 zza;
    private int zzd;
    private xq6 zze = jq6.m18746q();
    private ic6 zzf;

    static {
        uc6 uc6 = new uc6();
        zza = uc6;
        jq6.m18750w(uc6.class, uc6);
    }

    /* renamed from: A */
    public final Object mo12815A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return jq6.m18749t(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzd", "zze", jd6.class, "zzf"});
        } else if (i2 == 3) {
            return new uc6();
        } else {
            if (i2 == 4) {
                return new rc6((cc6) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: B */
    public final ic6 mo25564B() {
        ic6 ic6 = this.zzf;
        return ic6 == null ? ic6.m17405D() : ic6;
    }

    /* renamed from: D */
    public final List mo25565D() {
        return this.zze;
    }
}
