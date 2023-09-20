package com.onedelhi.secure;

public final class r86 extends jq6 implements ws6 {
    /* access modifiers changed from: private */
    public static final r86 zza;
    private int zzd;
    private int zze;
    private long zzf;

    static {
        r86 r86 = new r86();
        zza = r86;
        jq6.m18750w(r86.class, r86);
    }

    /* renamed from: D */
    public static o86 m26500D() {
        return (o86) zza.mo18542j();
    }

    /* renamed from: F */
    public static /* synthetic */ void m26502F(r86 r86, int i) {
        r86.zzd |= 1;
        r86.zze = i;
    }

    /* renamed from: G */
    public static /* synthetic */ void m26503G(r86 r86, long j) {
        r86.zzd |= 2;
        r86.zzf = j;
    }

    /* renamed from: A */
    public final Object mo12815A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return jq6.m18749t(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new r86();
        } else {
            if (i2 == 4) {
                return new o86((v76) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: B */
    public final int mo23712B() {
        return this.zze;
    }

    /* renamed from: C */
    public final long mo23713C() {
        return this.zzf;
    }

    /* renamed from: H */
    public final boolean mo23714H() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: I */
    public final boolean mo23715I() {
        return (this.zzd & 1) != 0;
    }
}
