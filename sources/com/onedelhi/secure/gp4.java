package com.onedelhi.secure;

import android.content.Context;
import java.util.concurrent.Executor;

public final class gp4 implements lz0<fp4> {

    /* renamed from: a */
    public final a73<Context> f12691a;

    /* renamed from: b */
    public final a73<C2448ii> f12692b;

    /* renamed from: c */
    public final a73<aw0> f12693c;

    /* renamed from: d */
    public final a73<ky4> f12694d;

    /* renamed from: e */
    public final a73<Executor> f12695e;

    /* renamed from: f */
    public final a73<q84> f12696f;

    /* renamed from: g */
    public final a73<C2106ez> f12697g;

    /* renamed from: h */
    public final a73<C2106ez> f12698h;

    /* renamed from: i */
    public final a73<C4029yy> f12699i;

    public gp4(a73<Context> a73, a73<C2448ii> a732, a73<aw0> a733, a73<ky4> a734, a73<Executor> a735, a73<q84> a736, a73<C2106ez> a737, a73<C2106ez> a738, a73<C4029yy> a739) {
        this.f12691a = a73;
        this.f12692b = a732;
        this.f12693c = a733;
        this.f12694d = a734;
        this.f12695e = a735;
        this.f12696f = a736;
        this.f12697g = a737;
        this.f12698h = a738;
        this.f12699i = a739;
    }

    /* renamed from: a */
    public static gp4 m16036a(a73<Context> a73, a73<C2448ii> a732, a73<aw0> a733, a73<ky4> a734, a73<Executor> a735, a73<q84> a736, a73<C2106ez> a737, a73<C2106ez> a738, a73<C4029yy> a739) {
        return new gp4(a73, a732, a733, a734, a735, a736, a737, a738, a739);
    }

    /* renamed from: c */
    public static fp4 m16037c(Context context, C2448ii iiVar, aw0 aw0, ky4 ky4, Executor executor, q84 q84, C2106ez ezVar, C2106ez ezVar2, C4029yy yyVar) {
        return new fp4(context, iiVar, aw0, ky4, executor, q84, ezVar, ezVar2, yyVar);
    }

    /* renamed from: b */
    public fp4 get() {
        return m16037c(this.f12691a.get(), this.f12692b.get(), this.f12693c.get(), this.f12694d.get(), this.f12695e.get(), this.f12696f.get(), this.f12697g.get(), this.f12698h.get(), this.f12699i.get());
    }
}
