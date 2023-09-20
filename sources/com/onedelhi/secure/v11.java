package com.onedelhi.secure;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class v11 {

    /* renamed from: a */
    public final String f36396a;

    /* renamed from: a */
    public final Map<Class<?>, Object> f36397a;

    /* renamed from: com.onedelhi.secure.v11$b */
    public static final class C7003b {

        /* renamed from: a */
        public final String f36398a;

        /* renamed from: a */
        public Map<Class<?>, Object> f36399a = null;

        public C7003b(String str) {
            this.f36398a = str;
        }

        @mr2
        /* renamed from: a */
        public v11 mo45927a() {
            return new v11(this.f36398a, this.f36399a == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(this.f36399a)));
        }

        @mr2
        /* renamed from: b */
        public <T extends Annotation> C7003b mo45928b(@mr2 T t) {
            if (this.f36399a == null) {
                this.f36399a = new HashMap();
            }
            this.f36399a.put(t.annotationType(), t);
            return this;
        }
    }

    public v11(String str, Map<Class<?>, Object> map) {
        this.f36396a = str;
        this.f36397a = map;
    }

    @mr2
    /* renamed from: a */
    public static C7003b m67579a(@mr2 String str) {
        return new C7003b(str);
    }

    @mr2
    /* renamed from: d */
    public static v11 m67580d(@mr2 String str) {
        return new v11(str, Collections.emptyMap());
    }

    @mr2
    /* renamed from: b */
    public String mo45922b() {
        return this.f36396a;
    }

    @ts2
    /* renamed from: c */
    public <T extends Annotation> T mo45923c(@mr2 Class<T> cls) {
        return (Annotation) this.f36397a.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11)) {
            return false;
        }
        v11 v11 = (v11) obj;
        return this.f36396a.equals(v11.f36396a) && this.f36397a.equals(v11.f36397a);
    }

    public int hashCode() {
        return (this.f36396a.hashCode() * 31) + this.f36397a.hashCode();
    }

    @mr2
    public String toString() {
        return "FieldDescriptor{name=" + this.f36396a + ", properties=" + this.f36397a.values() + "}";
    }
}
