package com.onedelhi.secure;

public final class zb6 extends jq6 implements ws6 {
    /* access modifiers changed from: private */
    public static final zb6 zza;
    private int zzd;
    private long zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        zb6 zb6 = new zb6();
        zza = zb6;
        jq6.m18750w(zb6.class, zb6);
    }

    /* renamed from: E */
    public static wb6 m33030E() {
        return (wb6) zza.mo18542j();
    }

    /* renamed from: I */
    public static /* synthetic */ void m33032I(zb6 zb6, long j) {
        zb6.zzd |= 1;
        zb6.zze = j;
    }

    /* renamed from: J */
    public static /* synthetic */ void m33033J(zb6 zb6, String str) {
        str.getClass();
        zb6.zzd |= 2;
        zb6.zzf = str;
    }

    /* renamed from: K */
    public static /* synthetic */ void m33034K(zb6 zb6, String str) {
        str.getClass();
        zb6.zzd |= 4;
        zb6.zzg = str;
    }

    /* renamed from: L */
    public static /* synthetic */ void m33035L(zb6 zb6) {
        zb6.zzd &= -5;
        zb6.zzg = zza.zzg;
    }

    /* renamed from: M */
    public static /* synthetic */ void m33036M(zb6 zb6, long j) {
        zb6.zzd |= 8;
        zb6.zzh = j;
    }

    /* renamed from: N */
    public static /* synthetic */ void m33037N(zb6 zb6) {
        zb6.zzd &= -9;
        zb6.zzh = 0;
    }

    /* renamed from: O */
    public static /* synthetic */ void m33038O(zb6 zb6, double d) {
        zb6.zzd |= 32;
        zb6.zzj = d;
    }

    /* renamed from: P */
    public static /* synthetic */ void m33039P(zb6 zb6) {
        zb6.zzd &= -33;
        zb6.zzj = 0.0d;
    }

    /* renamed from: A */
    public final Object mo12815A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return jq6.m18749t(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new zb6();
        } else {
            if (i2 == 4) {
                return new wb6((v76) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: B */
    public final double mo27907B() {
        return this.zzj;
    }

    /* renamed from: C */
    public final long mo27908C() {
        return this.zzh;
    }

    /* renamed from: D */
    public final long mo27909D() {
        return this.zze;
    }

    /* renamed from: G */
    public final String mo27910G() {
        return this.zzf;
    }

    /* renamed from: H */
    public final String mo27911H() {
        return this.zzg;
    }

    /* renamed from: Q */
    public final boolean mo27912Q() {
        return (this.zzd & 32) != 0;
    }

    /* renamed from: R */
    public final boolean mo27913R() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: S */
    public final boolean mo27914S() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: T */
    public final boolean mo27915T() {
        return (this.zzd & 4) != 0;
    }
}
