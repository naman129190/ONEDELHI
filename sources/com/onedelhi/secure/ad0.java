package com.onedelhi.secure;

import android.content.Context;
import com.onedelhi.secure.oi4;
import java.util.concurrent.Executor;

public final class ad0 extends oi4 {

    /* renamed from: a */
    public a73<Executor> f9000a;

    /* renamed from: b */
    public a73<Context> f9001b;

    /* renamed from: c */
    public a73 f9002c;

    /* renamed from: d */
    public a73 f9003d;

    /* renamed from: e */
    public a73 f9004e;

    /* renamed from: f */
    public a73<String> f9005f;

    /* renamed from: g */
    public a73<gq3> f9006g;

    /* renamed from: h */
    public a73<pr3> f9007h;

    /* renamed from: i */
    public a73<ky4> f9008i;

    /* renamed from: j */
    public a73<ph0> f9009j;

    /* renamed from: k */
    public a73<fp4> f9010k;

    /* renamed from: l */
    public a73<gy4> f9011l;

    /* renamed from: m */
    public a73<ni4> f9012m;

    /* renamed from: com.onedelhi.secure.ad0$b */
    public static final class C1692b implements oi4.C3066a {

        /* renamed from: a */
        public Context f9013a;

        public C1692b() {
        }

        /* renamed from: b */
        public oi4 mo13008b() {
            h43.m16474a(this.f9013a, Context.class);
            return new ad0(this.f9013a);
        }

        /* renamed from: c */
        public C1692b mo13007a(Context context) {
            this.f9013a = (Context) h43.m16475b(context);
            return this;
        }
    }

    public ad0(Context context) {
        mo13006d(context);
    }

    /* renamed from: c */
    public static oi4.C3066a m11091c() {
        return new C1692b();
    }

    /* renamed from: a */
    public aw0 mo13004a() {
        return this.f9006g.get();
    }

    /* renamed from: b */
    public ni4 mo13005b() {
        return this.f9012m.get();
    }

    /* renamed from: d */
    public final void mo13006d(Context context) {
        this.f9000a = fo0.m15138b(ww0.m31153a());
        lz0 a = or1.m24043a(context);
        this.f9001b = a;
        ib0 a2 = ib0.m17369a(a, ud4.m29291a(), vd4.m29997a());
        this.f9002c = a2;
        this.f9003d = fo0.m15138b(li2.m20728a(this.f9001b, a2));
        this.f9004e = fs3.m15280a(this.f9001b, dw0.m13380a(), fw0.m15348a());
        this.f9005f = fo0.m15138b(ew0.m14405a(this.f9001b));
        this.f9006g = fo0.m15138b(hq3.m16898a(ud4.m29291a(), vd4.m29997a(), gw0.m16308a(), this.f9004e, this.f9005f));
        ur3 b = ur3.m29545b(ud4.m29291a());
        this.f9007h = b;
        wr3 a3 = wr3.m31035a(this.f9001b, this.f9006g, b, vd4.m29997a());
        this.f9008i = a3;
        a73<Executor> a73 = this.f9000a;
        a73 a732 = this.f9003d;
        a73<gq3> a733 = this.f9006g;
        this.f9009j = qh0.m25757a(a73, a732, a3, a733, a733);
        a73<Context> a734 = this.f9001b;
        a73 a735 = this.f9003d;
        a73<gq3> a736 = this.f9006g;
        this.f9010k = gp4.m16036a(a734, a735, a736, this.f9008i, this.f9000a, a736, ud4.m29291a(), vd4.m29997a(), this.f9006g);
        a73<Executor> a737 = this.f9000a;
        a73<gq3> a738 = this.f9006g;
        this.f9011l = hy4.m17055a(a737, a738, this.f9008i, a738);
        this.f9012m = fo0.m15138b(pi4.m24727a(ud4.m29291a(), vd4.m29997a(), this.f9009j, this.f9010k, this.f9011l));
    }
}
