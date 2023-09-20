package com.onedelhi.secure;

public final class r76 extends x76 {
    public r76() {
        super((u76) null);
    }

    public /* synthetic */ r76(o76 o76) {
        super((u76) null);
    }

    /* renamed from: a */
    public final void mo19293a(Object obj, long j) {
        ((q56) kf6.m19750f(obj, j)).mo19980a();
    }

    /* renamed from: b */
    public final void mo19294b(Object obj, Object obj2, long j) {
        q56 q56 = (q56) kf6.m19750f(obj, j);
        q56 q562 = (q56) kf6.m19750f(obj2, j);
        int size = q56.size();
        int size2 = q562.size();
        if (size > 0 && size2 > 0) {
            if (!q56.mo19982c()) {
                q56 = q56.mo12861z1(size2 + size);
            }
            q56.addAll(q562);
        }
        if (size > 0) {
            q562 = q56;
        }
        kf6.m19760p(obj, j, q562);
    }
}
