package com.onedelhi.secure;

import java.util.List;

public final class j96 extends jq6 implements ws6 {
    /* access modifiers changed from: private */
    public static final j96 zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private float zzh;
    private double zzi;
    /* access modifiers changed from: private */
    public xq6 zzj = jq6.m18746q();

    static {
        j96 j96 = new j96();
        zza = j96;
        jq6.m18750w(j96.class, j96);
    }

    /* renamed from: F */
    public static g96 m18221F() {
        return (g96) zza.mo18542j();
    }

    /* renamed from: K */
    public static /* synthetic */ void m18223K(j96 j96, String str) {
        str.getClass();
        j96.zzd |= 1;
        j96.zze = str;
    }

    /* renamed from: L */
    public static /* synthetic */ void m18224L(j96 j96, String str) {
        str.getClass();
        j96.zzd |= 2;
        j96.zzf = str;
    }

    /* renamed from: M */
    public static /* synthetic */ void m18225M(j96 j96) {
        j96.zzd &= -3;
        j96.zzf = zza.zzf;
    }

    /* renamed from: N */
    public static /* synthetic */ void m18226N(j96 j96, long j) {
        j96.zzd |= 4;
        j96.zzg = j;
    }

    /* renamed from: O */
    public static /* synthetic */ void m18227O(j96 j96) {
        j96.zzd &= -5;
        j96.zzg = 0;
    }

    /* renamed from: P */
    public static /* synthetic */ void m18228P(j96 j96, double d) {
        j96.zzd |= 16;
        j96.zzi = d;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m18229Q(j96 j96) {
        j96.zzd &= -17;
        j96.zzi = 0.0d;
    }

    /* renamed from: R */
    public static /* synthetic */ void m18230R(j96 j96, j96 j962) {
        j962.getClass();
        j96.mo18182Z();
        j96.zzj.add(j962);
    }

    /* renamed from: S */
    public static /* synthetic */ void m18231S(j96 j96, Iterable iterable) {
        j96.mo18182Z();
        pl6.m24800g(iterable, j96.zzj);
    }

    /* renamed from: A */
    public final Object mo12815A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return jq6.m18749t(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", j96.class});
        } else if (i2 == 3) {
            return new j96();
        } else {
            if (i2 == 4) {
                return new g96((v76) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: B */
    public final double mo18170B() {
        return this.zzi;
    }

    /* renamed from: C */
    public final float mo18171C() {
        return this.zzh;
    }

    /* renamed from: D */
    public final int mo18172D() {
        return this.zzj.size();
    }

    /* renamed from: E */
    public final long mo18173E() {
        return this.zzg;
    }

    /* renamed from: H */
    public final String mo18174H() {
        return this.zze;
    }

    /* renamed from: I */
    public final String mo18175I() {
        return this.zzf;
    }

    /* renamed from: J */
    public final List mo18176J() {
        return this.zzj;
    }

    /* renamed from: U */
    public final boolean mo18177U() {
        return (this.zzd & 16) != 0;
    }

    /* renamed from: V */
    public final boolean mo18178V() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: W */
    public final boolean mo18179W() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: X */
    public final boolean mo18180X() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: Y */
    public final boolean mo18181Y() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: Z */
    public final void mo18182Z() {
        xq6 xq6 = this.zzj;
        if (!xq6.mo23936c()) {
            this.zzj = jq6.m18747r(xq6);
        }
    }
}
