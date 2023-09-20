package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class dv3<T> implements lz0<Set<T>> {

    /* renamed from: a */
    public static final lz0<Set<Object>> f10950a = or1.m24043a(Collections.emptySet());

    /* renamed from: a */
    public final List<a73<T>> f10951a;

    /* renamed from: b */
    public final List<a73<Collection<T>>> f10952b;

    /* renamed from: com.onedelhi.secure.dv3$b */
    public static final class C2008b<T> {

        /* renamed from: a */
        public static final /* synthetic */ boolean f10953a = false;

        /* renamed from: a */
        public final List<a73<T>> f10954a;

        /* renamed from: b */
        public final List<a73<Collection<T>>> f10955b;

        public C2008b(int i, int i2) {
            this.f10954a = yc0.m32178e(i);
            this.f10955b = yc0.m32178e(i2);
        }

        /* renamed from: a */
        public C2008b<T> mo14893a(a73<? extends Collection<? extends T>> a73) {
            this.f10955b.add(a73);
            return this;
        }

        /* renamed from: b */
        public C2008b<T> mo14894b(a73<? extends T> a73) {
            this.f10954a.add(a73);
            return this;
        }

        /* renamed from: c */
        public dv3<T> mo14895c() {
            return new dv3<>(this.f10954a, this.f10955b);
        }
    }

    public dv3(List<a73<T>> list, List<a73<Collection<T>>> list2) {
        this.f10951a = list;
        this.f10952b = list2;
    }

    /* renamed from: a */
    public static <T> C2008b<T> m13369a(int i, int i2) {
        return new C2008b<>(i, i2);
    }

    /* renamed from: b */
    public static <T> lz0<Set<T>> m13370b() {
        return f10950a;
    }

    /* renamed from: c */
    public Set<T> get() {
        int size = this.f10951a.size();
        ArrayList arrayList = new ArrayList(this.f10952b.size());
        int size2 = this.f10952b.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) this.f10952b.get(i).get();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet c = yc0.m32176c(size);
        int size3 = this.f10951a.size();
        for (int i2 = 0; i2 < size3; i2++) {
            c.add(h43.m16475b(this.f10951a.get(i2).get()));
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object b : (Collection) arrayList.get(i3)) {
                c.add(h43.m16475b(b));
            }
        }
        return Collections.unmodifiableSet(c);
    }
}
