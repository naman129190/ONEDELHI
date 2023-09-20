package com.onedelhi.secure;

import java.util.Set;

public final class zh4 implements yh4 {

    /* renamed from: a */
    public final ei4 f23661a;

    /* renamed from: a */
    public final xh4 f23662a;

    /* renamed from: a */
    public final Set<hu0> f23663a;

    public zh4(Set<hu0> set, xh4 xh4, ei4 ei4) {
        this.f23663a = set;
        this.f23662a = xh4;
        this.f23661a = ei4;
    }

    /* renamed from: a */
    public <T> vh4<T> mo27493a(String str, Class<T> cls, hu0 hu0, wg4<T, byte[]> wg4) {
        if (this.f23663a.contains(hu0)) {
            return new bi4(this.f23662a, str, hu0, wg4, this.f23661a);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{hu0, this.f23663a}));
    }

    /* renamed from: b */
    public <T> vh4<T> mo27494b(String str, Class<T> cls, wg4<T, byte[]> wg4) {
        return mo27493a(str, cls, hu0.m16939b("proto"), wg4);
    }
}
