package com.onedelhi.secure;

import java.util.List;

public final class ic6 extends jq6 implements ws6 {
    /* access modifiers changed from: private */
    public static final ic6 zza;
    private xq6 zzd = jq6.m18746q();

    static {
        ic6 ic6 = new ic6();
        zza = ic6;
        jq6.m18750w(ic6.class, ic6);
    }

    /* renamed from: D */
    public static ic6 m17405D() {
        return zza;
    }

    /* renamed from: A */
    public final Object mo12815A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return jq6.m18749t(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", oc6.class});
        } else if (i2 == 3) {
            return new ic6();
        } else {
            if (i2 == 4) {
                return new fc6((cc6) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: B */
    public final int mo17707B() {
        return this.zzd.size();
    }

    /* renamed from: E */
    public final List mo17708E() {
        return this.zzd;
    }
}
