package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.List;

public class fu0 {

    /* renamed from: a */
    public final List<C2201a<?>> f12328a = new ArrayList();

    /* renamed from: com.onedelhi.secure.fu0$a */
    public static final class C2201a<T> {

        /* renamed from: a */
        public final cu0<T> f12329a;

        /* renamed from: a */
        public final Class<T> f12330a;

        public C2201a(@mr2 Class<T> cls, @mr2 cu0<T> cu0) {
            this.f12330a = cls;
            this.f12329a = cu0;
        }

        /* renamed from: a */
        public boolean mo16175a(@mr2 Class<?> cls) {
            return this.f12330a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized <T> void mo16172a(@mr2 Class<T> cls, @mr2 cu0<T> cu0) {
        this.f12328a.add(new C2201a(cls, cu0));
    }

    @ts2
    /* renamed from: b */
    public synchronized <T> cu0<T> mo16173b(@mr2 Class<T> cls) {
        for (C2201a next : this.f12328a) {
            if (next.mo16175a(cls)) {
                return next.f12329a;
            }
        }
        return null;
    }

    /* renamed from: c */
    public synchronized <T> void mo16174c(@mr2 Class<T> cls, @mr2 cu0<T> cu0) {
        this.f12328a.add(0, new C2201a(cls, cu0));
    }
}
