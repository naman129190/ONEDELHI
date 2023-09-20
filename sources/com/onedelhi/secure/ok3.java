package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.List;

public class ok3 {

    /* renamed from: a */
    public final List<C3069a<?>> f17991a = new ArrayList();

    /* renamed from: com.onedelhi.secure.ok3$a */
    public static final class C3069a<T> {

        /* renamed from: a */
        public final nk3<T> f17992a;

        /* renamed from: a */
        public final Class<T> f17993a;

        public C3069a(@mr2 Class<T> cls, @mr2 nk3<T> nk3) {
            this.f17993a = cls;
            this.f17992a = nk3;
        }

        /* renamed from: a */
        public boolean mo21964a(@mr2 Class<?> cls) {
            return this.f17993a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized <Z> void mo21961a(@mr2 Class<Z> cls, @mr2 nk3<Z> nk3) {
        this.f17991a.add(new C3069a(cls, nk3));
    }

    @ts2
    /* renamed from: b */
    public synchronized <Z> nk3<Z> mo21962b(@mr2 Class<Z> cls) {
        int size = this.f17991a.size();
        for (int i = 0; i < size; i++) {
            C3069a aVar = this.f17991a.get(i);
            if (aVar.mo21964a(cls)) {
                return aVar.f17992a;
            }
        }
        return null;
    }

    /* renamed from: c */
    public synchronized <Z> void mo21963c(@mr2 Class<Z> cls, @mr2 nk3<Z> nk3) {
        this.f17991a.add(0, new C3069a(cls, nk3));
    }
}
