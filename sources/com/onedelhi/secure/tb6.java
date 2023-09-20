package com.onedelhi.secure;

import java.util.List;

public final class tb6 extends jq6 implements ws6 {
    /* access modifiers changed from: private */
    public static final tb6 zza;
    private int zzd;
    private int zze;
    private vq6 zzf = jq6.m18744o();

    static {
        tb6 tb6 = new tb6();
        zza = tb6;
        jq6.m18750w(tb6.class, tb6);
    }

    /* renamed from: E */
    public static qb6 m28314E() {
        return (qb6) zza.mo18542j();
    }

    /* renamed from: H */
    public static /* synthetic */ void m28316H(tb6 tb6, int i) {
        tb6.zzd |= 1;
        tb6.zze = i;
    }

    /* renamed from: I */
    public static /* synthetic */ void m28317I(tb6 tb6, Iterable iterable) {
        vq6 vq6 = tb6.zzf;
        if (!vq6.mo23936c()) {
            tb6.zzf = jq6.m18745p(vq6);
        }
        pl6.m24800g(iterable, tb6.zzf);
    }

    /* renamed from: A */
    public final Object mo12815A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return jq6.m18749t(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new tb6();
        } else {
            if (i2 == 4) {
                return new qb6((v76) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: B */
    public final int mo24833B() {
        return this.zzf.size();
    }

    /* renamed from: C */
    public final int mo24834C() {
        return this.zze;
    }

    /* renamed from: D */
    public final long mo24835D(int i) {
        return this.zzf.mo24060O0(i);
    }

    /* renamed from: G */
    public final List mo24836G() {
        return this.zzf;
    }

    /* renamed from: J */
    public final boolean mo24837J() {
        return (this.zzd & 1) != 0;
    }
}
