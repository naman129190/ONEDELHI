package com.onedelhi.secure;

public final class ns6 implements ht6 {

    /* renamed from: b */
    public static final ts6 f17562b = new sr6();

    /* renamed from: a */
    public final ts6 f17563a;

    public ns6() {
        ts6 ts6;
        ts6[] ts6Arr = new ts6[2];
        ts6Arr[0] = gp6.m16040c();
        try {
            ts6 = (ts6) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            ts6 = f17562b;
        }
        ts6Arr[1] = ts6;
        tr6 tr6 = new tr6(ts6Arr);
        byte[] bArr = zq6.f23858a;
        this.f17563a = tr6;
    }

    /* renamed from: b */
    public static boolean m23162b(ss6 ss6) {
        return ss6.zzc() == 1;
    }

    /* renamed from: a */
    public final gt6 mo17409a(Class cls) {
        qs6 qs6;
        qo6 qo6;
        pu6 pu6;
        qr6 qr6;
        at6 at6;
        qo6 qo62;
        pu6 W;
        qo6 a;
        Class<jq6> cls2 = jq6.class;
        it6.m17862d(cls);
        ss6 b = this.f17563a.mo16805b(cls);
        if (b.mo16168b()) {
            if (cls2.isAssignableFrom(cls)) {
                W = it6.m17859a();
                a = uo6.m29489b();
            } else {
                W = it6.m17857W();
                a = uo6.m29488a();
            }
            return zs6.m33397j(W, a, b.mo16167a());
        }
        if (cls2.isAssignableFrom(cls)) {
            boolean b2 = m23162b(b);
            at6 = bt6.m12068b();
            qr6 = qr6.m26143d();
            pu6 = it6.m17859a();
            qo6 = b2 ? uo6.m29489b() : null;
            qs6 = rs6.m27044b();
        } else {
            boolean b3 = m23162b(b);
            at6 = bt6.m12067a();
            qr6 = qr6.m26142c();
            if (b3) {
                pu6 = it6.m17857W();
                qo62 = uo6.m29488a();
            } else {
                pu6 = it6.m17858X();
                qo62 = null;
            }
            qs6 = rs6.m27043a();
        }
        return ys6.m32636H(cls, b, at6, qr6, pu6, qo6, qs6);
    }
}
