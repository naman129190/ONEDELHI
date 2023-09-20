package com.onedelhi.secure;

public final class t46 extends jq6 implements ws6 {
    /* access modifiers changed from: private */
    public static final t46 zza;
    private int zzd;
    private int zze;
    private boolean zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        t46 t46 = new t46();
        zza = t46;
        jq6.m18750w(t46.class, t46);
    }

    /* renamed from: C */
    public static t46 m28091C() {
        return zza;
    }

    /* renamed from: A */
    public final Object mo12815A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return jq6.m18749t(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzd", "zze", n46.f17100a, "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new t46();
        } else {
            if (i2 == 4) {
                return new h46((m36) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: D */
    public final String mo24704D() {
        return this.zzg;
    }

    /* renamed from: E */
    public final String mo24705E() {
        return this.zzi;
    }

    /* renamed from: F */
    public final String mo24706F() {
        return this.zzh;
    }

    /* renamed from: G */
    public final boolean mo24707G() {
        return this.zzf;
    }

    /* renamed from: H */
    public final boolean mo24708H() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: I */
    public final boolean mo24709I() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: J */
    public final boolean mo24710J() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: K */
    public final boolean mo24711K() {
        return (this.zzd & 16) != 0;
    }

    /* renamed from: L */
    public final boolean mo24712L() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: M */
    public final int mo24713M() {
        int a = q46.m25325a(this.zze);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
