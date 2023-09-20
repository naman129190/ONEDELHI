package com.onedelhi.secure;

import java.util.List;

public final class oc6 extends jq6 implements ws6 {
    /* access modifiers changed from: private */
    public static final oc6 zza;
    private int zzd;
    private String zze = "";
    private xq6 zzf = jq6.m18746q();

    static {
        oc6 oc6 = new oc6();
        zza = oc6;
        jq6.m18750w(oc6.class, oc6);
    }

    /* renamed from: A */
    public final Object mo12815A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return jq6.m18749t(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzd", "zze", "zzf", jd6.class});
        } else if (i2 == 3) {
            return new oc6();
        } else {
            if (i2 == 4) {
                return new lc6((cc6) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: C */
    public final String mo21866C() {
        return this.zze;
    }

    /* renamed from: D */
    public final List mo21867D() {
        return this.zzf;
    }
}
