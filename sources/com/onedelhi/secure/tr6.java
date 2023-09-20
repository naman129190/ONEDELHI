package com.onedelhi.secure;

public final class tr6 implements ts6 {

    /* renamed from: a */
    public final ts6[] f21117a;

    public tr6(ts6... ts6Arr) {
        this.f21117a = ts6Arr;
    }

    /* renamed from: a */
    public final boolean mo16804a(Class cls) {
        ts6[] ts6Arr = this.f21117a;
        for (int i = 0; i < 2; i++) {
            if (ts6Arr[i].mo16804a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final ss6 mo16805b(Class cls) {
        ts6[] ts6Arr = this.f21117a;
        for (int i = 0; i < 2; i++) {
            ts6 ts6 = ts6Arr[i];
            if (ts6.mo16804a(cls)) {
                return ts6.mo16805b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
