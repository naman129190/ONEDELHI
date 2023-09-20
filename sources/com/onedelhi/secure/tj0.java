package com.onedelhi.secure;

import java.util.Arrays;
import java.util.List;

public class tj0 extends uj0 {

    /* renamed from: a */
    public final List<a30<?>> f35663a;

    public tj0(List<a30<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f35663a = list;
    }

    /* renamed from: a */
    public List<a30<?>> mo45155a() {
        return this.f35663a;
    }
}
