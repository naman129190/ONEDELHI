package com.onedelhi.secure;

public final class s76 extends jq6 implements ws6 {
    /* access modifiers changed from: private */
    public static final s76 zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        s76 s76 = new s76();
        zza = s76;
        jq6.m18750w(s76.class, s76);
    }

    /* renamed from: A */
    public final Object mo12815A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return jq6.m18749t(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new s76();
        } else {
            if (i2 == 4) {
                return new p76((r56) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: C */
    public final String mo24261C() {
        return this.zze;
    }

    /* renamed from: D */
    public final String mo24262D() {
        return this.zzf;
    }
}
