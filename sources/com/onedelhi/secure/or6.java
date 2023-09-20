package com.onedelhi.secure;

public final class or6 extends qr6 {
    public or6() {
        super((pr6) null);
    }

    public /* synthetic */ or6(nr6 nr6) {
        super((pr6) null);
    }

    /* renamed from: a */
    public final void mo20589a(Object obj, long j) {
        ((xq6) zu6.m33464k(obj, j)).mo23934a();
    }

    /* renamed from: b */
    public final void mo20590b(Object obj, Object obj2, long j) {
        xq6 xq6 = (xq6) zu6.m33464k(obj, j);
        xq6 xq62 = (xq6) zu6.m33464k(obj2, j);
        int size = xq6.size();
        int size2 = xq62.size();
        if (size > 0 && size2 > 0) {
            if (!xq6.mo23936c()) {
                xq6 = xq6.mo14324d2(size2 + size);
            }
            xq6.addAll(xq62);
        }
        if (size > 0) {
            xq62 = xq6;
        }
        zu6.m33477x(obj, j, xq62);
    }
}
