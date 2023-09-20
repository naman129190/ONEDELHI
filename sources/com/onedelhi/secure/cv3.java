package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class cv3<T> {

    /* renamed from: a */
    public static final String f10498a = "Set contributions cannot be null";

    /* renamed from: a */
    public final List<T> f10499a;

    public cv3(int i) {
        this.f10499a = new ArrayList(i);
    }

    /* renamed from: d */
    public static <T> cv3<T> m12762d(int i) {
        return new cv3<>(i);
    }

    /* renamed from: a */
    public cv3<T> mo14392a(T t) {
        this.f10499a.add(h43.m16476c(t, "Set contributions cannot be null"));
        return this;
    }

    /* renamed from: b */
    public cv3<T> mo14393b(Collection<? extends T> collection) {
        for (Object c : collection) {
            h43.m16476c(c, "Set contributions cannot be null");
        }
        this.f10499a.addAll(collection);
        return this;
    }

    /* renamed from: c */
    public Set<T> mo14394c() {
        int size = this.f10499a.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableSet(new HashSet(this.f10499a)) : Collections.singleton(this.f10499a.get(0)) : Collections.emptySet();
    }
}
