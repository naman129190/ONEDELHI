package com.onedelhi.secure;

public final class ec2 implements yr3 {

    /* renamed from: b */
    public static final xh2 f27850b = new C5120a();

    /* renamed from: a */
    public final xh2 f27851a;

    /* renamed from: com.onedelhi.secure.ec2$a */
    public static class C5120a implements xh2 {
        /* renamed from: a */
        public wh2 mo35119a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        /* renamed from: b */
        public boolean mo35120b(Class<?> cls) {
            return false;
        }
    }

    /* renamed from: com.onedelhi.secure.ec2$b */
    public static class C5121b implements xh2 {

        /* renamed from: a */
        public xh2[] f27852a;

        public C5121b(xh2... xh2Arr) {
            this.f27852a = xh2Arr;
        }

        /* renamed from: a */
        public wh2 mo35119a(Class<?> cls) {
            for (xh2 xh2 : this.f27852a) {
                if (xh2.mo35120b(cls)) {
                    return xh2.mo35119a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        /* renamed from: b */
        public boolean mo35120b(Class<?> cls) {
            for (xh2 b : this.f27852a) {
                if (b.mo35120b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public ec2() {
        this(m46442b());
    }

    public ec2(xh2 xh2) {
        this.f27851a = (xh2) vs1.m68433e(xh2, "messageInfoFactory");
    }

    /* renamed from: b */
    public static xh2 m46442b() {
        return new C5121b(pe1.m60880c(), m46443c());
    }

    /* renamed from: c */
    public static xh2 m46443c() {
        try {
            return (xh2) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return f27850b;
        }
    }

    /* renamed from: d */
    public static boolean m46444d(wh2 wh2) {
        return wh2.mo34230b() == n63.PROTO2;
    }

    /* renamed from: e */
    public static <T> xr3<T> m46445e(Class<T> cls, wh2 wh2) {
        if (qe1.class.isAssignableFrom(cls)) {
            if (m46444d(wh2)) {
                return bi2.m39893S(cls, wh2, uq2.m67407b(), z32.m72532b(), gs3.m49740S(), cz0.m44381b(), uc2.m66945b());
            }
            return bi2.m39893S(cls, wh2, uq2.m67407b(), z32.m72532b(), gs3.m49740S(), (az0<?>) null, uc2.m66945b());
        } else if (m46444d(wh2)) {
            return bi2.m39893S(cls, wh2, uq2.m67406a(), z32.m72531a(), gs3.m49732K(), cz0.m44380a(), uc2.m66944a());
        } else {
            return bi2.m39893S(cls, wh2, uq2.m67406a(), z32.m72531a(), gs3.m49733L(), (az0<?>) null, uc2.m66944a());
        }
    }

    /* renamed from: a */
    public <T> xr3<T> mo35118a(Class<T> cls) {
        ao4<?, ?> K;
        az0<?> a;
        gs3.m49734M(cls);
        wh2 a2 = this.f27851a.mo35119a(cls);
        if (!a2.mo34229a()) {
            return m46445e(cls, a2);
        }
        if (qe1.class.isAssignableFrom(cls)) {
            K = gs3.m49740S();
            a = cz0.m44381b();
        } else {
            K = gs3.m49732K();
            a = cz0.m44380a();
        }
        return ci2.m40981m(K, a, a2.mo34231c());
    }
}
