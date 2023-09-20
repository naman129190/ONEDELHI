package com.google.gson.internal.bind;

import com.onedelhi.secure.C4602b;
import com.onedelhi.secure.cj4;
import com.onedelhi.secure.dj4;
import com.onedelhi.secure.fj1;
import com.onedelhi.secure.fw1;
import com.onedelhi.secure.lw1;
import com.onedelhi.secure.tj4;
import com.onedelhi.secure.xv1;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

public final class ArrayTypeAdapter<E> extends cj4<Object> {

    /* renamed from: a */
    public static final dj4 f25444a = new dj4() {
        /* renamed from: a */
        public <T> cj4<T> mo30126a(fj1 fj1, tj4<T> tj4) {
            Type type = tj4.getType();
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type g = C4602b.m39220g(type);
            return new ArrayTypeAdapter(fj1, fj1.mo36014p(tj4.get(g)), C4602b.m39224k(g));
        }
    };

    /* renamed from: a */
    public final cj4<E> f25445a;

    /* renamed from: a */
    public final Class<E> f25446a;

    public ArrayTypeAdapter(fj1 fj1, cj4<E> cj4, Class<E> cls) {
        this.f25445a = new C4435a(fj1, cj4, cls);
        this.f25446a = cls;
    }

    /* renamed from: e */
    public Object mo30144e(xv1 xv1) throws IOException {
        if (xv1.mo36944q0() == fw1.NULL) {
            xv1.mo36940j0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        xv1.mo36929a();
        while (xv1.mo36922A()) {
            arrayList.add(this.f25445a.mo30144e(xv1));
        }
        xv1.mo36937h();
        int size = arrayList.size();
        Object newInstance = Array.newInstance(this.f25446a, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    /* renamed from: i */
    public void mo30145i(lw1 lw1, Object obj) throws IOException {
        if (obj == null) {
            lw1.mo37582M();
            return;
        }
        lw1.mo37587c();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f25445a.mo30145i(lw1, Array.get(obj, i));
        }
        lw1.mo37591h();
    }
}
