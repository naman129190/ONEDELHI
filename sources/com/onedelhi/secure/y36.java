package com.onedelhi.secure;

import java.util.List;

public final class y36 extends jq6 implements ws6 {
    /* access modifiers changed from: private */
    public static final y36 zza;
    private int zzd;
    private int zze;
    private String zzf = "";
    private xq6 zzg = jq6.m18746q();
    private boolean zzh;
    private t46 zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        y36 y36 = new y36();
        zza = y36;
        jq6.m18750w(y36.class, y36);
    }

    /* renamed from: D */
    public static v36 m31923D() {
        return (v36) zza.mo18542j();
    }

    /* renamed from: J */
    public static /* synthetic */ void m31925J(y36 y36, String str) {
        y36.zzd |= 2;
        y36.zzf = str;
    }

    /* renamed from: K */
    public static /* synthetic */ void m31926K(y36 y36, int i, e46 e46) {
        e46.getClass();
        xq6 xq6 = y36.zzg;
        if (!xq6.mo23936c()) {
            y36.zzg = jq6.m18747r(xq6);
        }
        y36.zzg.set(i, e46);
    }

    /* renamed from: A */
    public final Object mo12815A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return jq6.m18749t(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", e46.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        } else if (i2 == 3) {
            return new y36();
        } else {
            if (i2 == 4) {
                return new v36((m36) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: B */
    public final int mo27179B() {
        return this.zzg.size();
    }

    /* renamed from: C */
    public final int mo27180C() {
        return this.zze;
    }

    /* renamed from: F */
    public final e46 mo27181F(int i) {
        return (e46) this.zzg.get(i);
    }

    /* renamed from: G */
    public final t46 mo27182G() {
        t46 t46 = this.zzi;
        return t46 == null ? t46.m28091C() : t46;
    }

    /* renamed from: H */
    public final String mo27183H() {
        return this.zzf;
    }

    /* renamed from: I */
    public final List mo27184I() {
        return this.zzg;
    }

    /* renamed from: L */
    public final boolean mo27185L() {
        return this.zzj;
    }

    /* renamed from: M */
    public final boolean mo27186M() {
        return this.zzk;
    }

    /* renamed from: N */
    public final boolean mo27187N() {
        return this.zzl;
    }

    /* renamed from: O */
    public final boolean mo27188O() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: P */
    public final boolean mo27189P() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: Q */
    public final boolean mo27190Q() {
        return (this.zzd & 64) != 0;
    }
}
