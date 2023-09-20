package com.onedelhi.secure;

import com.onedelhi.secure.n33;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class h62 {

    /* renamed from: a */
    public static final g62<?, ?, ?> f12919a = new g62(Object.class, Object.class, Object.class, Collections.singletonList(new rf0(Object.class, Object.class, Object.class, Collections.emptyList(), new yn4(), (n33.C2922a<List<Throwable>>) null)), (n33.C2922a<List<Throwable>>) null);

    /* renamed from: a */
    public final C3042oa<sl2, g62<?, ?, ?>> f12920a = new C3042oa<>();

    /* renamed from: a */
    public final AtomicReference<sl2> f12921a = new AtomicReference<>();

    @ts2
    /* renamed from: a */
    public <Data, TResource, Transcode> g62<Data, TResource, Transcode> mo17074a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        g62<Data, TResource, Transcode> g62;
        sl2 b = mo17075b(cls, cls2, cls3);
        synchronized (this.f12920a) {
            g62 = this.f12920a.get(b);
        }
        this.f12921a.set(b);
        return g62;
    }

    /* renamed from: b */
    public final sl2 mo17075b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        sl2 andSet = this.f12921a.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new sl2();
        }
        andSet.mo24477b(cls, cls2, cls3);
        return andSet;
    }

    /* renamed from: c */
    public boolean mo17076c(@ts2 g62<?, ?, ?> g62) {
        return f12919a.equals(g62);
    }

    /* renamed from: d */
    public void mo17077d(Class<?> cls, Class<?> cls2, Class<?> cls3, @ts2 g62<?, ?, ?> g62) {
        synchronized (this.f12920a) {
            C3042oa<sl2, g62<?, ?, ?>> oaVar = this.f12920a;
            sl2 sl2 = new sl2(cls, cls2, cls3);
            if (g62 == null) {
                g62 = f12919a;
            }
            oaVar.put(sl2, g62);
        }
    }
}
