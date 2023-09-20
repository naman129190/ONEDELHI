package com.onedelhi.secure;

import java.util.List;

public final class nb6 extends jq6 implements ws6 {
    /* access modifiers changed from: private */
    public static final nb6 zza;
    /* access modifiers changed from: private */
    public vq6 zzd = jq6.m18744o();
    /* access modifiers changed from: private */
    public vq6 zze = jq6.m18744o();
    /* access modifiers changed from: private */
    public xq6 zzf = jq6.m18746q();
    /* access modifiers changed from: private */
    public xq6 zzg = jq6.m18746q();

    static {
        nb6 nb6 = new nb6();
        zza = nb6;
        jq6.m18750w(nb6.class, nb6);
    }

    /* renamed from: F */
    public static kb6 m22628F() {
        return (kb6) zza.mo18542j();
    }

    /* renamed from: H */
    public static nb6 m22630H() {
        return zza;
    }

    /* renamed from: M */
    public static /* synthetic */ void m22631M(nb6 nb6, Iterable iterable) {
        vq6 vq6 = nb6.zzd;
        if (!vq6.mo23936c()) {
            nb6.zzd = jq6.m18745p(vq6);
        }
        pl6.m24800g(iterable, nb6.zzd);
    }

    /* renamed from: O */
    public static /* synthetic */ void m22633O(nb6 nb6, Iterable iterable) {
        vq6 vq6 = nb6.zze;
        if (!vq6.mo23936c()) {
            nb6.zze = jq6.m18745p(vq6);
        }
        pl6.m24800g(iterable, nb6.zze);
    }

    /* renamed from: Q */
    public static /* synthetic */ void m22635Q(nb6 nb6, Iterable iterable) {
        xq6 xq6 = nb6.zzf;
        if (!xq6.mo23936c()) {
            nb6.zzf = jq6.m18747r(xq6);
        }
        pl6.m24800g(iterable, nb6.zzf);
    }

    /* renamed from: S */
    public static /* synthetic */ void m22637S(nb6 nb6, Iterable iterable) {
        xq6 xq6 = nb6.zzg;
        if (!xq6.mo23936c()) {
            nb6.zzg = jq6.m18747r(xq6);
        }
        pl6.m24800g(iterable, nb6.zzg);
    }

    /* renamed from: A */
    public final Object mo12815A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return jq6.m18749t(zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzd", "zze", "zzf", r86.class, "zzg", tb6.class});
        } else if (i2 == 3) {
            return new nb6();
        } else {
            if (i2 == 4) {
                return new kb6((v76) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: B */
    public final int mo21063B() {
        return this.zzf.size();
    }

    /* renamed from: C */
    public final int mo21064C() {
        return this.zze.size();
    }

    /* renamed from: D */
    public final int mo21065D() {
        return this.zzg.size();
    }

    /* renamed from: E */
    public final int mo21066E() {
        return this.zzd.size();
    }

    /* renamed from: I */
    public final List mo21067I() {
        return this.zzf;
    }

    /* renamed from: J */
    public final List mo21068J() {
        return this.zze;
    }

    /* renamed from: K */
    public final List mo21069K() {
        return this.zzg;
    }

    /* renamed from: L */
    public final List mo21070L() {
        return this.zzd;
    }
}
