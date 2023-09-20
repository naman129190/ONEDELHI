package com.onedelhi.secure;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.onedelhi.secure.hj */
public abstract class C2351hj<V, O> implements C3900x6<V, O> {

    /* renamed from: a */
    public final List<ez1<V>> f13128a;

    public C2351hj(V v) {
        this(Collections.singletonList(new ez1(v)));
    }

    public C2351hj(List<ez1<V>> list) {
        this.f13128a = list;
    }

    /* renamed from: b */
    public boolean mo17292b() {
        return this.f13128a.isEmpty() || (this.f13128a.size() == 1 && this.f13128a.get(0).mo15665h());
    }

    /* renamed from: c */
    public List<ez1<V>> mo17293c() {
        return this.f13128a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f13128a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.f13128a.toArray()));
        }
        return sb.toString();
    }
}
