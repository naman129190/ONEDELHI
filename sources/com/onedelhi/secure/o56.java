package com.onedelhi.secure;

import java.util.List;

public final class o56 extends jq6 implements ws6 {
    /* access modifiers changed from: private */
    public static final o56 zza;
    private int zzd;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private xq6 zzh = jq6.m18746q();

    static {
        o56 o56 = new o56();
        zza = o56;
        jq6.m18750w(o56.class, o56);
    }

    /* renamed from: D */
    public static o56 m23340D() {
        return zza;
    }

    /* renamed from: A */
    public final Object mo12815A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return jq6.m18749t(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzd", "zze", i56.f13493a, "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new o56();
        } else {
            if (i2 == 4) {
                return new c56((m36) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: B */
    public final int mo21602B() {
        return this.zzh.size();
    }

    /* renamed from: E */
    public final String mo21603E() {
        return this.zzf;
    }

    /* renamed from: F */
    public final List mo21604F() {
        return this.zzh;
    }

    /* renamed from: G */
    public final boolean mo21605G() {
        return this.zzg;
    }

    /* renamed from: H */
    public final boolean mo21606H() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: I */
    public final boolean mo21607I() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: J */
    public final boolean mo21608J() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: K */
    public final int mo21609K() {
        int a = l56.m20230a(this.zze);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
