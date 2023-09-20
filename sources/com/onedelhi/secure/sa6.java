package com.onedelhi.secure;

import java.util.List;

public final class sa6 extends jq6 implements ws6 {
    /* access modifiers changed from: private */
    public static final sa6 zza;
    private xq6 zzd = jq6.m18746q();

    static {
        sa6 sa6 = new sa6();
        zza = sa6;
        jq6.m18750w(sa6.class, sa6);
    }

    /* renamed from: B */
    public static pa6 m27406B() {
        return (pa6) zza.mo18542j();
    }

    /* renamed from: F */
    public static /* synthetic */ void m27408F(sa6 sa6, ya6 ya6) {
        ya6.getClass();
        xq6 xq6 = sa6.zzd;
        if (!xq6.mo23936c()) {
            sa6.zzd = jq6.m18747r(xq6);
        }
        sa6.zzd.add(ya6);
    }

    /* renamed from: A */
    public final Object mo12815A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return jq6.m18749t(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", ya6.class});
        } else if (i2 == 3) {
            return new sa6();
        } else {
            if (i2 == 4) {
                return new pa6((v76) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: D */
    public final ya6 mo24280D(int i) {
        return (ya6) this.zzd.get(0);
    }

    /* renamed from: E */
    public final List mo24281E() {
        return this.zzd;
    }
}
