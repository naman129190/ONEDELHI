package com.onedelhi.secure;

public final class a76 extends jq6 implements ws6 {
    /* access modifiers changed from: private */
    public static final a76 zza;
    private int zzd;
    private String zze = "";
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        a76 a76 = new a76();
        zza = a76;
        jq6.m18750w(a76.class, a76);
    }

    /* renamed from: E */
    public static /* synthetic */ void m10901E(a76 a76, String str) {
        str.getClass();
        a76.zzd |= 1;
        a76.zze = str;
    }

    /* renamed from: A */
    public final Object mo12815A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return jq6.m18749t(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new a76();
        } else {
            if (i2 == 4) {
                return new x66((r56) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: B */
    public final int mo12816B() {
        return this.zzh;
    }

    /* renamed from: D */
    public final String mo12817D() {
        return this.zze;
    }

    /* renamed from: F */
    public final boolean mo12818F() {
        return this.zzf;
    }

    /* renamed from: G */
    public final boolean mo12819G() {
        return this.zzg;
    }

    /* renamed from: H */
    public final boolean mo12820H() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: I */
    public final boolean mo12821I() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: J */
    public final boolean mo12822J() {
        return (this.zzd & 8) != 0;
    }
}
