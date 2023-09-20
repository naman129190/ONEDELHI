package com.onedelhi.secure;

public final class l86 extends jq6 implements ws6 {
    /* access modifiers changed from: private */
    public static final l86 zza;
    private int zzd;
    private int zze;
    private nb6 zzf;
    private nb6 zzg;
    private boolean zzh;

    static {
        l86 l86 = new l86();
        zza = l86;
        jq6.m18750w(l86.class, l86);
    }

    /* renamed from: C */
    public static i86 m20322C() {
        return (i86) zza.mo18542j();
    }

    /* renamed from: G */
    public static /* synthetic */ void m20324G(l86 l86, int i) {
        l86.zzd |= 1;
        l86.zze = i;
    }

    /* renamed from: H */
    public static /* synthetic */ void m20325H(l86 l86, nb6 nb6) {
        nb6.getClass();
        l86.zzf = nb6;
        l86.zzd |= 2;
    }

    /* renamed from: I */
    public static /* synthetic */ void m20326I(l86 l86, nb6 nb6) {
        l86.zzg = nb6;
        l86.zzd |= 4;
    }

    /* renamed from: J */
    public static /* synthetic */ void m20327J(l86 l86, boolean z) {
        l86.zzd |= 8;
        l86.zzh = z;
    }

    /* renamed from: A */
    public final Object mo12815A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return jq6.m18749t(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new l86();
        } else {
            if (i2 == 4) {
                return new i86((v76) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: B */
    public final int mo19331B() {
        return this.zze;
    }

    /* renamed from: E */
    public final nb6 mo19332E() {
        nb6 nb6 = this.zzf;
        return nb6 == null ? nb6.m22630H() : nb6;
    }

    /* renamed from: F */
    public final nb6 mo19333F() {
        nb6 nb6 = this.zzg;
        return nb6 == null ? nb6.m22630H() : nb6;
    }

    /* renamed from: K */
    public final boolean mo19334K() {
        return this.zzh;
    }

    /* renamed from: L */
    public final boolean mo19335L() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: M */
    public final boolean mo19336M() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: N */
    public final boolean mo19337N() {
        return (this.zzd & 4) != 0;
    }
}
