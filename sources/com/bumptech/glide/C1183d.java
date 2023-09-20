package com.bumptech.glide;

import com.onedelhi.secure.ts2;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.d */
public class C1183d {

    /* renamed from: a */
    public final Map<Class<?>, C1185b> f6087a;

    /* renamed from: com.bumptech.glide.d$a */
    public static final class C1184a {

        /* renamed from: a */
        public final Map<Class<?>, C1185b> f6088a = new HashMap();

        /* renamed from: b */
        public C1184a mo7504b(C1185b bVar) {
            this.f6088a.put(bVar.getClass(), bVar);
            return this;
        }

        /* renamed from: c */
        public C1183d mo7505c() {
            return new C1183d(this);
        }

        /* renamed from: d */
        public C1184a mo7506d(C1185b bVar, boolean z) {
            if (z) {
                mo7504b(bVar);
            } else {
                this.f6088a.remove(bVar.getClass());
            }
            return this;
        }
    }

    /* renamed from: com.bumptech.glide.d$b */
    public interface C1185b {
    }

    public C1183d(C1184a aVar) {
        this.f6087a = Collections.unmodifiableMap(new HashMap(aVar.f6088a));
    }

    @ts2
    /* renamed from: a */
    public <T extends C1185b> T mo7502a(Class<T> cls) {
        return (C1185b) this.f6087a.get(cls);
    }

    /* renamed from: b */
    public boolean mo7503b(Class<? extends C1185b> cls) {
        return this.f6087a.containsKey(cls);
    }
}
