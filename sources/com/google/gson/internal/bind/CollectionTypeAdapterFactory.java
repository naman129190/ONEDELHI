package com.google.gson.internal.bind;

import com.onedelhi.secure.C4602b;
import com.onedelhi.secure.cj4;
import com.onedelhi.secure.dj4;
import com.onedelhi.secure.fj1;
import com.onedelhi.secure.fw1;
import com.onedelhi.secure.jt2;
import com.onedelhi.secure.lw1;
import com.onedelhi.secure.r60;
import com.onedelhi.secure.tj4;
import com.onedelhi.secure.xv1;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;

public final class CollectionTypeAdapterFactory implements dj4 {

    /* renamed from: a */
    public final r60 f25447a;

    /* renamed from: com.google.gson.internal.bind.CollectionTypeAdapterFactory$a */
    public static final class C4385a<E> extends cj4<Collection<E>> {

        /* renamed from: a */
        public final cj4<E> f25448a;

        /* renamed from: a */
        public final jt2<? extends Collection<E>> f25449a;

        public C4385a(fj1 fj1, Type type, cj4<E> cj4, jt2<? extends Collection<E>> jt2) {
            this.f25448a = new C4435a(fj1, cj4, type);
            this.f25449a = jt2;
        }

        /* renamed from: j */
        public Collection<E> mo30144e(xv1 xv1) throws IOException {
            if (xv1.mo36944q0() == fw1.NULL) {
                xv1.mo36940j0();
                return null;
            }
            Collection<E> collection = (Collection) this.f25449a.mo38879a();
            xv1.mo36929a();
            while (xv1.mo36922A()) {
                collection.add(this.f25448a.mo30144e(xv1));
            }
            xv1.mo36937h();
            return collection;
        }

        /* renamed from: k */
        public void mo30145i(lw1 lw1, Collection<E> collection) throws IOException {
            if (collection == null) {
                lw1.mo37582M();
                return;
            }
            lw1.mo37587c();
            for (E i : collection) {
                this.f25448a.mo30145i(lw1, i);
            }
            lw1.mo37591h();
        }
    }

    public CollectionTypeAdapterFactory(r60 r60) {
        this.f25447a = r60;
    }

    /* renamed from: a */
    public <T> cj4<T> mo30126a(fj1 fj1, tj4<T> tj4) {
        Type type = tj4.getType();
        Class<? super T> rawType = tj4.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type h = C4602b.m39221h(type, rawType);
        return new C4385a(fj1, h, fj1.mo36014p(tj4.get(h)), this.f25447a.mo43820a(tj4));
    }
}
