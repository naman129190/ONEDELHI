package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class ev3<T> implements kz0<Set<T>> {

    /* renamed from: a */
    public static final kz0<Set<Object>> f28103a = nr1.m58727a(Collections.emptySet());

    /* renamed from: a */
    public final List<a73<T>> f28104a;

    /* renamed from: b */
    public final List<a73<Collection<T>>> f28105b;

    /* renamed from: com.onedelhi.secure.ev3$b */
    public static final class C5198b<T> {

        /* renamed from: a */
        public static final /* synthetic */ boolean f28106a = false;

        /* renamed from: a */
        public final List<a73<T>> f28107a;

        /* renamed from: b */
        public final List<a73<Collection<T>>> f28108b;

        public C5198b(int i, int i2) {
            this.f28107a = xc0.m70133e(i);
            this.f28108b = xc0.m70133e(i2);
        }

        /* renamed from: a */
        public C5198b<T> mo35644a(a73<? extends Collection<? extends T>> a73) {
            this.f28108b.add(a73);
            return this;
        }

        /* renamed from: b */
        public C5198b<T> mo35645b(a73<? extends T> a73) {
            this.f28107a.add(a73);
            return this;
        }

        /* renamed from: c */
        public ev3<T> mo35646c() {
            return new ev3<>(this.f28107a, this.f28108b);
        }
    }

    public ev3(List<a73<T>> list, List<a73<Collection<T>>> list2) {
        this.f28104a = list;
        this.f28105b = list2;
    }

    /* renamed from: a */
    public static <T> C5198b<T> m47302a(int i, int i2) {
        return new C5198b<>(i, i2);
    }

    /* renamed from: b */
    public static <T> kz0<Set<T>> m47303b() {
        return f28103a;
    }

    /* renamed from: c */
    public Set<T> get() {
        int size = this.f28104a.size();
        ArrayList arrayList = new ArrayList(this.f28105b.size());
        int size2 = this.f28105b.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) this.f28105b.get(i).get();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet c = xc0.m70131c(size);
        int size3 = this.f28104a.size();
        for (int i2 = 0; i2 < size3; i2++) {
            c.add(j43.m52914b(this.f28104a.get(i2).get()));
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object b : (Collection) arrayList.get(i3)) {
                c.add(j43.m52914b(b));
            }
        }
        return Collections.unmodifiableSet(c);
    }
}
