package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.List;

public final class xx0 {

    /* renamed from: a */
    public final int f37677a;

    /* renamed from: a */
    public final List<ux0> f37678a;

    /* renamed from: a */
    public final boolean f37679a;

    public xx0(List<ux0> list, int i, boolean z) {
        this.f37678a = new ArrayList(list);
        this.f37677a = i;
        this.f37679a = z;
    }

    /* renamed from: a */
    public List<ux0> mo47430a() {
        return this.f37678a;
    }

    /* renamed from: b */
    public int mo47431b() {
        return this.f37677a;
    }

    /* renamed from: c */
    public boolean mo47432c(List<ux0> list) {
        return this.f37678a.equals(list);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof xx0)) {
            return false;
        }
        xx0 xx0 = (xx0) obj;
        return this.f37678a.equals(xx0.f37678a) && this.f37679a == xx0.f37679a;
    }

    public int hashCode() {
        return this.f37678a.hashCode() ^ Boolean.valueOf(this.f37679a).hashCode();
    }

    public String toString() {
        return "{ " + this.f37678a + " }";
    }
}
