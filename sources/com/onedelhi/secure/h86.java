package com.onedelhi.secure;

public final class h86 implements c96 {

    /* renamed from: a */
    public final c96[] f13002a;

    public h86(c96... c96Arr) {
        this.f13002a = c96Arr;
    }

    /* renamed from: a */
    public final boolean mo14072a(Class cls) {
        c96[] c96Arr = this.f13002a;
        for (int i = 0; i < 2; i++) {
            if (c96Arr[i].mo14072a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final z86 mo14073b(Class cls) {
        c96[] c96Arr = this.f13002a;
        for (int i = 0; i < 2; i++) {
            c96 c96 = c96Arr[i];
            if (c96.mo14072a(cls)) {
                return c96.mo14073b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
