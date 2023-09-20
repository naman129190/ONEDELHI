package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class av3<T> {

    /* renamed from: a */
    public static final String f26007a = "Set contributions cannot be null";

    /* renamed from: a */
    public final List<T> f26008a;

    public av3(int i) {
        this.f26008a = new ArrayList(i);
    }

    /* renamed from: d */
    public static <T> av3<T> m39121d(int i) {
        return new av3<>(i);
    }

    /* renamed from: a */
    public av3<T> mo31215a(T t) {
        this.f26008a.add(j43.m52915c(t, "Set contributions cannot be null"));
        return this;
    }

    /* renamed from: b */
    public av3<T> mo31216b(Collection<? extends T> collection) {
        for (Object c : collection) {
            j43.m52915c(c, "Set contributions cannot be null");
        }
        this.f26008a.addAll(collection);
        return this;
    }

    /* renamed from: c */
    public Set<T> mo31217c() {
        int size = this.f26008a.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableSet(new HashSet(this.f26008a)) : Collections.singleton(this.f26008a.get(0)) : Collections.emptySet();
    }
}
