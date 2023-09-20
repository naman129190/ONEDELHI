package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.C1195a;
import com.onedelhi.secure.g43;
import com.onedelhi.secure.mr2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.data.b */
public class C1197b {

    /* renamed from: a */
    public static final C1195a.C1196a<?> f6102a = new C1198a();

    /* renamed from: a */
    public final Map<Class<?>, C1195a.C1196a<?>> f6103a = new HashMap();

    /* renamed from: com.bumptech.glide.load.data.b$a */
    public class C1198a implements C1195a.C1196a<Object> {
        @mr2
        /* renamed from: a */
        public Class<Object> mo7518a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @mr2
        /* renamed from: b */
        public C1195a<Object> mo7519b(@mr2 Object obj) {
            return new C1199b(obj);
        }
    }

    /* renamed from: com.bumptech.glide.load.data.b$b */
    public static final class C1199b implements C1195a<Object> {

        /* renamed from: a */
        public final Object f6104a;

        public C1199b(@mr2 Object obj) {
            this.f6104a = obj;
        }

        /* renamed from: b */
        public void mo7514b() {
        }

        @mr2
        /* renamed from: c */
        public Object mo7515c() {
            return this.f6104a;
        }
    }

    @mr2
    /* renamed from: a */
    public synchronized <T> C1195a<T> mo7521a(@mr2 T t) {
        C1195a.C1196a<?> aVar;
        g43.m15509d(t);
        aVar = this.f6103a.get(t.getClass());
        if (aVar == null) {
            Iterator<C1195a.C1196a<?>> it = this.f6103a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C1195a.C1196a<?> next = it.next();
                if (next.mo7518a().isAssignableFrom(t.getClass())) {
                    aVar = next;
                    break;
                }
            }
        }
        if (aVar == null) {
            aVar = f6102a;
        }
        return aVar.mo7519b(t);
    }

    /* renamed from: b */
    public synchronized void mo7522b(@mr2 C1195a.C1196a<?> aVar) {
        this.f6103a.put(aVar.mo7518a(), aVar);
    }
}
