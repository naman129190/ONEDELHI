package com.onedelhi.secure;

import java.util.List;

public final class jd6 extends jq6 implements ws6 {
    /* access modifiers changed from: private */
    public static final jd6 zza;
    private int zzd;
    private int zze;
    private xq6 zzf = jq6.m18746q();
    private String zzg = "";
    private String zzh = "";
    private boolean zzi;
    private double zzj;

    static {
        jd6 jd6 = new jd6();
        zza = jd6;
        jq6.m18750w(jd6.class, jd6);
    }

    /* renamed from: A */
    public final Object mo12815A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return jq6.m18749t(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzd", "zze", dd6.f10716a, "zzf", jd6.class, "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new jd6();
        } else {
            if (i2 == 4) {
                return new xc6((cc6) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: B */
    public final double mo18290B() {
        return this.zzj;
    }

    /* renamed from: D */
    public final String mo18291D() {
        return this.zzg;
    }

    /* renamed from: E */
    public final String mo18292E() {
        return this.zzh;
    }

    /* renamed from: F */
    public final List mo18293F() {
        return this.zzf;
    }

    /* renamed from: G */
    public final boolean mo18294G() {
        return this.zzi;
    }

    /* renamed from: H */
    public final boolean mo18295H() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: I */
    public final boolean mo18296I() {
        return (this.zzd & 16) != 0;
    }

    /* renamed from: J */
    public final boolean mo18297J() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: K */
    public final int mo18298K() {
        int a = gd6.m15713a(this.zze);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
