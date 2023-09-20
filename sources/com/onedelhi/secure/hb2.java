package com.onedelhi.secure;

import com.onedelhi.secure.hl3;

public class hb2<T> {
    @ts2

    /* renamed from: a */
    public C2760lj<?, ?> f13024a;

    /* renamed from: a */
    public final ra2<T> f13025a;
    @ts2

    /* renamed from: a */
    public T f13026a;

    public hb2() {
        this.f13025a = new ra2<>();
        this.f13026a = null;
    }

    public hb2(@ts2 T t) {
        this.f13025a = new ra2<>();
        this.f13026a = t;
    }

    @ts2
    /* renamed from: a */
    public T mo7444a(ra2<T> ra2) {
        return this.f13026a;
    }

    @ts2
    @hl3({hl3.C2354a.f13185a})
    /* renamed from: b */
    public final T mo17180b(float f, float f2, T t, T t2, float f3, float f4, float f5) {
        return mo7444a(this.f13025a.mo23773h(f, f2, t, t2, f3, f4, f5));
    }

    @hl3({hl3.C2354a.f13185a})
    /* renamed from: c */
    public final void mo17181c(@ts2 C2760lj<?, ?> ljVar) {
        this.f13024a = ljVar;
    }

    /* renamed from: d */
    public final void mo17182d(@ts2 T t) {
        this.f13026a = t;
        C2760lj<?, ?> ljVar = this.f13024a;
        if (ljVar != null) {
            ljVar.mo15566j();
        }
    }
}
