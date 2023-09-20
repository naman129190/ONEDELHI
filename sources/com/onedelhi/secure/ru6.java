package com.onedelhi.secure;

import java.io.IOException;

public final class ru6 extends pu6 {
    /* renamed from: a */
    public final /* synthetic */ int mo22653a(Object obj) {
        return ((qu6) obj).mo23446a();
    }

    /* renamed from: b */
    public final /* synthetic */ int mo22654b(Object obj) {
        return ((qu6) obj).mo23447b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo22655c(Object obj) {
        jq6 jq6 = (jq6) obj;
        qu6 qu6 = jq6.zzc;
        if (qu6 != qu6.m26175c()) {
            return qu6;
        }
        qu6 f = qu6.m26177f();
        jq6.zzc = f;
        return f;
    }

    /* renamed from: d */
    public final /* synthetic */ Object mo22656d(Object obj) {
        return ((jq6) obj).zzc;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Object mo22657e(Object obj, Object obj2) {
        if (qu6.m26175c().equals(obj2)) {
            return obj;
        }
        qu6 qu6 = (qu6) obj2;
        if (qu6.m26175c().equals(obj)) {
            return qu6.m26176e((qu6) obj, qu6);
        }
        ((qu6) obj).mo23448d(qu6);
        return obj;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ void mo22658f(Object obj, int i, long j) {
        ((qu6) obj).mo23454j(i << 3, Long.valueOf(j));
    }

    /* renamed from: g */
    public final void mo22659g(Object obj) {
        ((jq6) obj).zzc.mo23451h();
    }

    /* renamed from: h */
    public final /* synthetic */ void mo22660h(Object obj, Object obj2) {
        ((jq6) obj).zzc = (qu6) obj2;
    }

    /* renamed from: i */
    public final /* synthetic */ void mo22661i(Object obj, yv6 yv6) throws IOException {
        ((qu6) obj).mo23455k(yv6);
    }
}
