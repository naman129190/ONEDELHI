package com.onedelhi.secure;

import com.onedelhi.secure.fd3;

public final class hk1 {

    /* renamed from: b */
    public static final int[] f13146b = {fd3.C2153c.colorError, fd3.C2153c.colorOnError, fd3.C2153c.colorErrorContainer, fd3.C2153c.colorOnErrorContainer};
    @e64

    /* renamed from: a */
    public final int f13147a;

    /* renamed from: a */
    public final int[] f13148a;

    public hk1(@mr2 @C3982yb int[] iArr, @e64 int i) {
        if (i == 0 || iArr.length != 0) {
            this.f13148a = iArr;
            this.f13147a = i;
            return;
        }
        throw new IllegalArgumentException("Theme overlay should be used with the accompanying int[] attributes.");
    }

    @mr2
    /* renamed from: a */
    public static hk1 m16829a(@mr2 @C3982yb int[] iArr) {
        return new hk1(iArr, 0);
    }

    @mr2
    /* renamed from: b */
    public static hk1 m16830b(@mr2 @C3982yb int[] iArr, @e64 int i) {
        return new hk1(iArr, i);
    }

    @mr2
    /* renamed from: c */
    public static hk1 m16831c() {
        return m16830b(f13146b, fd3.C2164n.ThemeOverlay_Material3_HarmonizedColors);
    }

    @mr2
    /* renamed from: d */
    public int[] mo17323d() {
        return this.f13148a;
    }

    @e64
    /* renamed from: e */
    public int mo17324e() {
        return this.f13147a;
    }
}
