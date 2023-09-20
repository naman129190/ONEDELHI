package com.onedelhi.secure;

import java.util.List;

public final class g76 extends jq6 implements ws6 {
    /* access modifiers changed from: private */
    public static final g76 zza;
    private int zzd;
    private long zze;
    private String zzf = "";
    private int zzg;
    private xq6 zzh = jq6.m18746q();
    private xq6 zzi = jq6.m18746q();
    /* access modifiers changed from: private */
    public xq6 zzj = jq6.m18746q();
    private String zzk = "";
    private boolean zzl;
    private xq6 zzm = jq6.m18746q();
    private xq6 zzn = jq6.m18746q();
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";

    static {
        g76 g76 = new g76();
        zza = g76;
        jq6.m18750w(g76.class, g76);
    }

    /* renamed from: F */
    public static d76 m15569F() {
        return (d76) zza.mo18542j();
    }

    /* renamed from: H */
    public static g76 m15571H() {
        return zza;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m15572Q(g76 g76, int i, a76 a76) {
        a76.getClass();
        xq6 xq6 = g76.zzi;
        if (!xq6.mo23936c()) {
            g76.zzi = jq6.m18747r(xq6);
        }
        g76.zzi.set(i, a76);
    }

    /* renamed from: A */
    public final Object mo12815A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return jq6.m18749t(zza, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\fဈ\u0006\rဈ\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", s76.class, "zzi", a76.class, "zzj", s36.class, "zzk", "zzl", "zzm", uc6.class, "zzn", u66.class, "zzo", "zzp", "zzq"});
        } else if (i2 == 3) {
            return new g76();
        } else {
            if (i2 == 4) {
                return new d76((r56) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: B */
    public final int mo16369B() {
        return this.zzm.size();
    }

    /* renamed from: C */
    public final int mo16370C() {
        return this.zzi.size();
    }

    /* renamed from: D */
    public final long mo16371D() {
        return this.zze;
    }

    /* renamed from: E */
    public final a76 mo16372E(int i) {
        return (a76) this.zzi.get(i);
    }

    /* renamed from: I */
    public final String mo16373I() {
        return this.zzf;
    }

    /* renamed from: J */
    public final String mo16374J() {
        return this.zzq;
    }

    /* renamed from: K */
    public final String mo16375K() {
        return this.zzp;
    }

    /* renamed from: L */
    public final String mo16376L() {
        return this.zzo;
    }

    /* renamed from: M */
    public final List mo16377M() {
        return this.zzj;
    }

    /* renamed from: N */
    public final List mo16378N() {
        return this.zzn;
    }

    /* renamed from: O */
    public final List mo16379O() {
        return this.zzm;
    }

    /* renamed from: P */
    public final List mo16380P() {
        return this.zzh;
    }

    /* renamed from: S */
    public final boolean mo16381S() {
        return this.zzl;
    }

    /* renamed from: T */
    public final boolean mo16382T() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: U */
    public final boolean mo16383U() {
        return (this.zzd & 1) != 0;
    }
}
