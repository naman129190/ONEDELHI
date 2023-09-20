package com.onedelhi.secure;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

public class u63 {

    /* renamed from: a */
    public final kt2<Object> f35985a;

    /* renamed from: a */
    public final Map<Class<?>, kt2<?>> f35986a;

    /* renamed from: b */
    public final Map<Class<?>, fs4<?>> f35987b;

    /* renamed from: com.onedelhi.secure.u63$a */
    public static final class C6936a implements du0<C6936a> {

        /* renamed from: b */
        public static final kt2<Object> f35988b = t63.f35431a;

        /* renamed from: a */
        public kt2<Object> f35989a = f35988b;

        /* renamed from: a */
        public final Map<Class<?>, kt2<?>> f35990a = new HashMap();

        /* renamed from: b */
        public final Map<Class<?>, fs4<?>> f35991b = new HashMap();

        /* renamed from: f */
        public static /* synthetic */ void m66716f(Object obj, lt2 lt2) throws IOException {
            throw new iu0("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        /* renamed from: d */
        public u63 mo45436d() {
            return new u63(new HashMap(this.f35990a), new HashMap(this.f35991b), this.f35989a);
        }

        @mr2
        /* renamed from: e */
        public C6936a mo45437e(@mr2 o50 o50) {
            o50.mo17709a(this);
            return this;
        }

        @mr2
        /* renamed from: g */
        public <U> C6936a mo34632a(@mr2 Class<U> cls, @mr2 kt2<? super U> kt2) {
            this.f35990a.put(cls, kt2);
            this.f35991b.remove(cls);
            return this;
        }

        @mr2
        /* renamed from: h */
        public <U> C6936a mo34633b(@mr2 Class<U> cls, @mr2 fs4<? super U> fs4) {
            this.f35991b.put(cls, fs4);
            this.f35990a.remove(cls);
            return this;
        }

        @mr2
        /* renamed from: i */
        public C6936a mo45440i(@mr2 kt2<Object> kt2) {
            this.f35989a = kt2;
            return this;
        }
    }

    public u63(Map<Class<?>, kt2<?>> map, Map<Class<?>, fs4<?>> map2, kt2<Object> kt2) {
        this.f35986a = map;
        this.f35987b = map2;
        this.f35985a = kt2;
    }

    /* renamed from: a */
    public static C6936a m66712a() {
        return new C6936a();
    }

    /* renamed from: b */
    public void mo45434b(@mr2 Object obj, @mr2 OutputStream outputStream) throws IOException {
        new s63(outputStream, this.f35986a, this.f35987b, this.f35985a).mo44209C(obj);
    }

    @mr2
    /* renamed from: c */
    public byte[] mo45435c(@mr2 Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            mo45434b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
