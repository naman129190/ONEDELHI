package com.onedelhi.secure;

public final class hb6 extends jq6 implements ws6 {
    /* access modifiers changed from: private */
    public static final hb6 zza;
    private int zzd;
    private int zze = 1;
    private xq6 zzf = jq6.m18746q();

    static {
        hb6 hb6 = new hb6();
        zza = hb6;
        jq6.m18750w(hb6.class, hb6);
    }

    /* renamed from: B */
    public static bb6 m16622B() {
        return (bb6) zza.mo18542j();
    }

    /* renamed from: D */
    public static /* synthetic */ void m16624D(hb6 hb6, d96 d96) {
        d96.getClass();
        xq6 xq6 = hb6.zzf;
        if (!xq6.mo23936c()) {
            hb6.zzf = jq6.m18747r(xq6);
        }
        hb6.zzf.add(d96);
    }

    /* renamed from: A */
    public final Object mo12815A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return jq6.m18749t(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zzd", "zze", eb6.f11167a, "zzf", d96.class});
        } else if (i2 == 3) {
            return new hb6();
        } else {
            if (i2 == 4) {
                return new bb6((v76) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
