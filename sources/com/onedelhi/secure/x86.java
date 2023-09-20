package com.onedelhi.secure;

import java.util.List;

public final class x86 extends jq6 implements ws6 {
    /* access modifiers changed from: private */
    public static final x86 zza;
    private int zzd;
    /* access modifiers changed from: private */
    public xq6 zze = jq6.m18746q();
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;

    static {
        x86 x86 = new x86();
        zza = x86;
        jq6.m18750w(x86.class, x86);
    }

    /* renamed from: F */
    public static u86 m31321F() {
        return (u86) zza.mo18542j();
    }

    /* renamed from: K */
    public static /* synthetic */ void m31323K(x86 x86, int i, j96 j96) {
        j96.getClass();
        x86.mo26824V();
        x86.zze.set(i, j96);
    }

    /* renamed from: L */
    public static /* synthetic */ void m31324L(x86 x86, j96 j96) {
        j96.getClass();
        x86.mo26824V();
        x86.zze.add(j96);
    }

    /* renamed from: M */
    public static /* synthetic */ void m31325M(x86 x86, Iterable iterable) {
        x86.mo26824V();
        pl6.m24800g(iterable, x86.zze);
    }

    /* renamed from: O */
    public static /* synthetic */ void m31327O(x86 x86, int i) {
        x86.mo26824V();
        x86.zze.remove(i);
    }

    /* renamed from: P */
    public static /* synthetic */ void m31328P(x86 x86, String str) {
        str.getClass();
        x86.zzd |= 1;
        x86.zzf = str;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m31329Q(x86 x86, long j) {
        x86.zzd |= 2;
        x86.zzg = j;
    }

    /* renamed from: R */
    public static /* synthetic */ void m31330R(x86 x86, long j) {
        x86.zzd |= 4;
        x86.zzh = j;
    }

    /* renamed from: A */
    public final Object mo12815A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return jq6.m18749t(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zzd", "zze", j96.class, "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new x86();
        } else {
            if (i2 == 4) {
                return new u86((v76) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: B */
    public final int mo26814B() {
        return this.zzi;
    }

    /* renamed from: C */
    public final int mo26815C() {
        return this.zze.size();
    }

    /* renamed from: D */
    public final long mo26816D() {
        return this.zzh;
    }

    /* renamed from: E */
    public final long mo26817E() {
        return this.zzg;
    }

    /* renamed from: H */
    public final j96 mo26818H(int i) {
        return (j96) this.zze.get(i);
    }

    /* renamed from: I */
    public final String mo26819I() {
        return this.zzf;
    }

    /* renamed from: J */
    public final List mo26820J() {
        return this.zze;
    }

    /* renamed from: S */
    public final boolean mo26821S() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: T */
    public final boolean mo26822T() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: U */
    public final boolean mo26823U() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: V */
    public final void mo26824V() {
        xq6 xq6 = this.zze;
        if (!xq6.mo23936c()) {
            this.zze = jq6.m18747r(xq6);
        }
    }
}
