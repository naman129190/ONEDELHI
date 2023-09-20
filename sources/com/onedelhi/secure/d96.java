package com.onedelhi.secure;

public final class d96 extends jq6 implements ws6 {
    /* access modifiers changed from: private */
    public static final d96 zza;
    private int zzd;
    private String zze = "";
    private long zzf;

    static {
        d96 d96 = new d96();
        zza = d96;
        jq6.m18750w(d96.class, d96);
    }

    /* renamed from: B */
    public static a96 m13010B() {
        return (a96) zza.mo18542j();
    }

    /* renamed from: D */
    public static /* synthetic */ void m13012D(d96 d96, String str) {
        str.getClass();
        d96.zzd |= 1;
        d96.zze = str;
    }

    /* renamed from: E */
    public static /* synthetic */ void m13013E(d96 d96, long j) {
        d96.zzd |= 2;
        d96.zzf = j;
    }

    /* renamed from: A */
    public final Object mo12815A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return jq6.m18749t(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new d96();
        } else {
            if (i2 == 4) {
                return new a96((v76) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
