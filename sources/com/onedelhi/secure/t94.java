package com.onedelhi.secure;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

public final class t94 implements y22 {

    /* renamed from: a */
    public final Set<s94<?>> f20712a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: c */
    public void mo15993c() {
        for (T c : oq4.m24023k(this.f20712a)) {
            c.mo15993c();
        }
    }

    /* renamed from: d */
    public void mo15995d() {
        for (T d : oq4.m24023k(this.f20712a)) {
            d.mo15995d();
        }
    }

    /* renamed from: f */
    public void mo24780f() {
        this.f20712a.clear();
    }

    /* renamed from: g */
    public void mo15999g() {
        for (T g : oq4.m24023k(this.f20712a)) {
            g.mo15999g();
        }
    }

    @mr2
    /* renamed from: i */
    public List<s94<?>> mo24781i() {
        return oq4.m24023k(this.f20712a);
    }

    /* renamed from: j */
    public void mo24782j(@mr2 s94<?> s94) {
        this.f20712a.add(s94);
    }

    /* renamed from: k */
    public void mo24783k(@mr2 s94<?> s94) {
        this.f20712a.remove(s94);
    }
}
