package com.onedelhi.secure;

public final class e46 extends jq6 implements ws6 {
    /* access modifiers changed from: private */
    public static final e46 zza;
    private int zzd;
    private o56 zze;
    private t46 zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        e46 e46 = new e46();
        zza = e46;
        jq6.m18750w(e46.class, e46);
    }

    /* renamed from: C */
    public static e46 m13572C() {
        return zza;
    }

    /* renamed from: G */
    public static /* synthetic */ void m13573G(e46 e46, String str) {
        e46.zzd |= 8;
        e46.zzh = str;
    }

    /* renamed from: A */
    public final Object mo12815A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return jq6.m18749t(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new e46();
        } else {
            if (i2 == 4) {
                return new b46((m36) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: D */
    public final t46 mo15040D() {
        t46 t46 = this.zzf;
        return t46 == null ? t46.m28091C() : t46;
    }

    /* renamed from: E */
    public final o56 mo15041E() {
        o56 o56 = this.zze;
        return o56 == null ? o56.m23340D() : o56;
    }

    /* renamed from: F */
    public final String mo15042F() {
        return this.zzh;
    }

    /* renamed from: H */
    public final boolean mo15043H() {
        return this.zzg;
    }

    /* renamed from: I */
    public final boolean mo15044I() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: J */
    public final boolean mo15045J() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: K */
    public final boolean mo15046K() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: L */
    public final boolean mo15047L() {
        return (this.zzd & 1) != 0;
    }
}
