package com.onedelhi.secure;

import java.util.List;

public final class s36 extends jq6 implements ws6 {
    /* access modifiers changed from: private */
    public static final s36 zza;
    private int zzd;
    private int zze;
    private xq6 zzf = jq6.m18746q();
    private xq6 zzg = jq6.m18746q();
    private boolean zzh;
    private boolean zzi;

    static {
        s36 s36 = new s36();
        zza = s36;
        jq6.m18750w(s36.class, s36);
    }

    /* renamed from: J */
    public static /* synthetic */ void m27230J(s36 s36, int i, z46 z46) {
        z46.getClass();
        xq6 xq6 = s36.zzf;
        if (!xq6.mo23936c()) {
            s36.zzf = jq6.m18747r(xq6);
        }
        s36.zzf.set(i, z46);
    }

    /* renamed from: K */
    public static /* synthetic */ void m27231K(s36 s36, int i, y36 y36) {
        y36.getClass();
        xq6 xq6 = s36.zzg;
        if (!xq6.mo23936c()) {
            s36.zzg = jq6.m18747r(xq6);
        }
        s36.zzg.set(i, y36);
    }

    /* renamed from: A */
    public final Object mo12815A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return jq6.m18749t(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzd", "zze", "zzf", z46.class, "zzg", y36.class, "zzh", "zzi"});
        } else if (i2 == 3) {
            return new s36();
        } else {
            if (i2 == 4) {
                return new p36((m36) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: B */
    public final int mo24182B() {
        return this.zze;
    }

    /* renamed from: C */
    public final int mo24183C() {
        return this.zzg.size();
    }

    /* renamed from: D */
    public final int mo24184D() {
        return this.zzf.size();
    }

    /* renamed from: F */
    public final y36 mo24185F(int i) {
        return (y36) this.zzg.get(i);
    }

    /* renamed from: G */
    public final z46 mo24186G(int i) {
        return (z46) this.zzf.get(i);
    }

    /* renamed from: H */
    public final List mo24187H() {
        return this.zzg;
    }

    /* renamed from: I */
    public final List mo24188I() {
        return this.zzf;
    }

    /* renamed from: L */
    public final boolean mo24189L() {
        return (this.zzd & 1) != 0;
    }
}
