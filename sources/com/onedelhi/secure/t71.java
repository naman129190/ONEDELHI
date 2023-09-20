package com.onedelhi.secure;

public final class t71 {

    /* renamed from: a */
    public static final C7012v5 f35432a = C7012v5.m67717e();

    /* renamed from: a */
    public final b73<yh4> f35433a;

    /* renamed from: a */
    public vh4<d13> f35434a;

    /* renamed from: a */
    public final String f35435a;

    public t71(b73<yh4> b73, String str) {
        this.f35435a = str;
        this.f35433a = b73;
    }

    /* renamed from: a */
    public final boolean mo44932a() {
        if (this.f35434a == null) {
            yh4 yh4 = this.f35433a.get();
            if (yh4 != null) {
                this.f35434a = yh4.mo27493a(this.f35435a, d13.class, hu0.m16939b("proto"), s71.f34932a);
            } else {
                f35432a.mo46010l("Flg TransportFactory is not available at the moment");
            }
        }
        return this.f35434a != null;
    }

    @ly4
    /* renamed from: b */
    public void mo44933b(@mr2 d13 d13) {
        if (!mo44932a()) {
            f35432a.mo46010l("Unable to dispatch event because Flg Transport is not available");
        } else {
            this.f35434a.mo13726a(qv0.m26188e(d13));
        }
    }
}
