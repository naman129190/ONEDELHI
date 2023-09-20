package com.onedelhi.secure;

import java.io.IOException;

public final class zs6 implements gt6 {

    /* renamed from: a */
    public final pu6 f23878a;

    /* renamed from: a */
    public final qo6 f23879a;

    /* renamed from: a */
    public final vs6 f23880a;

    /* renamed from: a */
    public final boolean f23881a;

    public zs6(pu6 pu6, qo6 qo6, vs6 vs6) {
        this.f23878a = pu6;
        this.f23881a = qo6.mo23277c(vs6);
        this.f23879a = qo6;
        this.f23880a = vs6;
    }

    /* renamed from: j */
    public static zs6 m33397j(pu6 pu6, qo6 qo6, vs6 vs6) {
        return new zs6(pu6, qo6, vs6);
    }

    /* renamed from: a */
    public final int mo16907a(Object obj) {
        pu6 pu6 = this.f23878a;
        int b = pu6.mo22654b(pu6.mo22656d(obj));
        if (!this.f23881a) {
            return b;
        }
        this.f23879a.mo23275a(obj);
        throw null;
    }

    /* renamed from: b */
    public final boolean mo16908b(Object obj) {
        this.f23879a.mo23275a(obj);
        throw null;
    }

    /* renamed from: c */
    public final void mo16909c(Object obj) {
        this.f23878a.mo22659g(obj);
        this.f23879a.mo23276b(obj);
    }

    /* renamed from: d */
    public final void mo16910d(Object obj, byte[] bArr, int i, int i2, vl6 vl6) throws IOException {
        jq6 jq6 = (jq6) obj;
        if (jq6.zzc == qu6.m26175c()) {
            jq6.zzc = qu6.m26177f();
        }
        kp6 kp6 = (kp6) obj;
        throw null;
    }

    /* renamed from: e */
    public final boolean mo16911e(Object obj, Object obj2) {
        if (!this.f23878a.mo22656d(obj).equals(this.f23878a.mo22656d(obj2))) {
            return false;
        }
        if (!this.f23881a) {
            return true;
        }
        this.f23879a.mo23275a(obj);
        this.f23879a.mo23275a(obj2);
        throw null;
    }

    /* renamed from: f */
    public final void mo16912f(Object obj, yv6 yv6) throws IOException {
        this.f23879a.mo23275a(obj);
        throw null;
    }

    /* renamed from: g */
    public final void mo16913g(Object obj, Object obj2) {
        it6.m17861c(this.f23878a, obj, obj2);
        if (this.f23881a) {
            this.f23879a.mo23275a(obj2);
            throw null;
        }
    }

    /* renamed from: h */
    public final Object mo16914h() {
        vs6 vs6 = this.f23880a;
        return vs6 instanceof jq6 ? ((jq6) vs6).mo18544m() : vs6.mo18537e().mo17913F9();
    }

    /* renamed from: i */
    public final int mo16915i(Object obj) {
        int hashCode = this.f23878a.mo22656d(obj).hashCode();
        if (!this.f23881a) {
            return hashCode;
        }
        this.f23879a.mo23275a(obj);
        throw null;
    }
}
