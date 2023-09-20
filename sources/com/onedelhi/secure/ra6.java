package com.onedelhi.secure;

import java.io.IOException;

public final class ra6 implements mb6 {

    /* renamed from: a */
    public final d46 f19750a;

    /* renamed from: a */
    public final i96 f19751a;

    /* renamed from: a */
    public final ld6 f19752a;

    public ra6(ld6 ld6, d46 d46, i96 i96) {
        this.f19752a = ld6;
        this.f19750a = d46;
        this.f19751a = i96;
    }

    /* renamed from: h */
    public static ra6 m26603h(ld6 ld6, d46 d46, i96 i96) {
        return new ra6(ld6, d46, i96);
    }

    /* renamed from: a */
    public final int mo20293a(Object obj) {
        return this.f19752a.mo19466a(obj).hashCode();
    }

    /* renamed from: b */
    public final boolean mo20294b(Object obj) {
        this.f19750a.mo14524a(obj);
        throw null;
    }

    /* renamed from: c */
    public final void mo20295c(Object obj) {
        this.f19752a.mo19470e(obj);
        this.f19750a.mo14525b(obj);
    }

    /* renamed from: d */
    public final void mo20296d(Object obj, byte[] bArr, int i, int i2, u06 u06) throws IOException {
        e56 e56 = (e56) obj;
        if (e56.zzc == od6.m23709a()) {
            e56.zzc = od6.m23711c();
        }
        b56 b56 = (b56) obj;
        throw null;
    }

    /* renamed from: e */
    public final boolean mo20297e(Object obj, Object obj2) {
        return this.f19752a.mo19466a(obj).equals(this.f19752a.mo19466a(obj2));
    }

    /* renamed from: f */
    public final Object mo20298f() {
        return ((y46) ((e56) this.f19751a).mo15053i(5, (Object) null, (Object) null)).mo15901l3();
    }

    /* renamed from: g */
    public final void mo20299g(Object obj, Object obj2) {
        sb6.m27427f(this.f19752a, obj, obj2);
    }
}
