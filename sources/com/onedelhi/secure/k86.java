package com.onedelhi.secure;

public final class k86 implements pb6 {

    /* renamed from: b */
    public static final c96 f14790b = new e86();

    /* renamed from: a */
    public final c96 f14791a;

    public k86() {
        c96 c96;
        c96[] c96Arr = new c96[2];
        c96Arr[0] = v46.m29825c();
        try {
            c96 = (c96) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            c96 = f14790b;
        }
        c96Arr[1] = c96;
        h86 h86 = new h86(c96Arr);
        t56.m28114f(h86, "messageInfoFactory");
        this.f14791a = h86;
    }

    /* renamed from: b */
    public static boolean m19561b(z86 z86) {
        return z86.zzc() == 1;
    }

    /* renamed from: a */
    public final mb6 mo18960a(Class cls) {
        t86 t86;
        d46 d46;
        ld6 ld6;
        x76 x76;
        ua6 ua6;
        d46 d462;
        ld6 a;
        d46 a2;
        Class<e56> cls2 = e56.class;
        sb6.m27428g(cls);
        z86 b = this.f14791a.mo14073b(cls);
        if (b.mo14105b()) {
            if (cls2.isAssignableFrom(cls)) {
                a = sb6.m27424c();
                a2 = j46.m18165b();
            } else {
                a = sb6.m27422a();
                a2 = j46.m18164a();
            }
            return ra6.m26603h(a, a2, b.mo14104a());
        }
        if (cls2.isAssignableFrom(cls)) {
            boolean b2 = m19561b(b);
            ua6 = xa6.m31387b();
            x76 = x76.m31315d();
            ld6 = sb6.m27424c();
            d46 = b2 ? j46.m18165b() : null;
            t86 = w86.m30716b();
        } else {
            boolean b3 = m19561b(b);
            ua6 = xa6.m31386a();
            x76 = x76.m31314c();
            if (b3) {
                ld6 = sb6.m27422a();
                d462 = j46.m18164a();
            } else {
                ld6 = sb6.m27423b();
                d462 = null;
            }
            t86 = w86.m30715a();
        }
        return r96.m26541t(cls, b, ua6, x76, ld6, d46, t86);
    }
}
