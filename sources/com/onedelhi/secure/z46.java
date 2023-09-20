package com.onedelhi.secure;

public final class z46 extends jq6 implements ws6 {
    /* access modifiers changed from: private */
    public static final z46 zza;
    private int zzd;
    private int zze;
    private String zzf = "";
    private e46 zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        z46 z46 = new z46();
        zza = z46;
        jq6.m18750w(z46.class, z46);
    }

    /* renamed from: D */
    public static w46 m32857D() {
        return (w46) zza.mo18542j();
    }

    /* renamed from: G */
    public static /* synthetic */ void m32859G(z46 z46, String str) {
        z46.zzd |= 2;
        z46.zzf = str;
    }

    /* renamed from: A */
    public final Object mo12815A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return jq6.m18749t(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new z46();
        } else {
            if (i2 == 4) {
                return new w46((m36) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: B */
    public final int mo27800B() {
        return this.zze;
    }

    /* renamed from: C */
    public final e46 mo27801C() {
        e46 e46 = this.zzg;
        return e46 == null ? e46.m13572C() : e46;
    }

    /* renamed from: F */
    public final String mo27802F() {
        return this.zzf;
    }

    /* renamed from: H */
    public final boolean mo27803H() {
        return this.zzh;
    }

    /* renamed from: I */
    public final boolean mo27804I() {
        return this.zzi;
    }

    /* renamed from: J */
    public final boolean mo27805J() {
        return this.zzj;
    }

    /* renamed from: K */
    public final boolean mo27806K() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: L */
    public final boolean mo27807L() {
        return (this.zzd & 32) != 0;
    }
}
