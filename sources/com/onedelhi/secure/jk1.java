package com.onedelhi.secure;

import com.onedelhi.secure.fd3;

public class jk1 {
    @C3982yb

    /* renamed from: a */
    public final int f14204a;
    @ts2

    /* renamed from: a */
    public final hk1 f14205a;
    @mr2
    @k10

    /* renamed from: a */
    public final int[] f14206a;

    /* renamed from: com.onedelhi.secure.jk1$b */
    public static class C2524b {
        @C3982yb

        /* renamed from: a */
        public int f14207a = fd3.C2153c.colorPrimary;
        @ts2

        /* renamed from: a */
        public hk1 f14208a;
        @mr2
        @k10

        /* renamed from: a */
        public int[] f14209a = new int[0];

        @mr2
        /* renamed from: d */
        public jk1 mo18454d() {
            return new jk1(this);
        }

        @mr2
        /* renamed from: e */
        public C2524b mo18455e(@C3982yb int i) {
            this.f14207a = i;
            return this;
        }

        @mr2
        /* renamed from: f */
        public C2524b mo18456f(@ts2 hk1 hk1) {
            this.f14208a = hk1;
            return this;
        }

        @mr2
        /* renamed from: g */
        public C2524b mo18457g(@mr2 @k10 int[] iArr) {
            this.f14209a = iArr;
            return this;
        }
    }

    public jk1(C2524b bVar) {
        this.f14206a = bVar.f14209a;
        this.f14205a = bVar.f14208a;
        this.f14204a = bVar.f14207a;
    }

    @mr2
    /* renamed from: a */
    public static jk1 m18610a() {
        return new C2524b().mo18456f(hk1.m16831c()).mo18454d();
    }

    @C3982yb
    /* renamed from: b */
    public int mo18450b() {
        return this.f14204a;
    }

    @ts2
    /* renamed from: c */
    public hk1 mo18451c() {
        return this.f14205a;
    }

    @mr2
    @k10
    /* renamed from: d */
    public int[] mo18452d() {
        return this.f14206a;
    }

    @e64
    /* renamed from: e */
    public int mo18453e(@e64 int i) {
        hk1 hk1 = this.f14205a;
        return (hk1 == null || hk1.mo17324e() == 0) ? i : this.f14205a.mo17324e();
    }
}
