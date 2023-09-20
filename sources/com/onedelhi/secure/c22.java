package com.onedelhi.secure;

import java.util.Iterator;
import java.util.Map;

public class c22 extends d22 {

    /* renamed from: b */
    public final yh2 f26616b;

    /* renamed from: com.onedelhi.secure.c22$b */
    public static class C4725b<K> implements Map.Entry<K, Object> {

        /* renamed from: a */
        public Map.Entry<K, c22> f26617a;

        public C4725b(Map.Entry<K, c22> entry) {
            this.f26617a = entry;
        }

        /* renamed from: a */
        public c22 mo32218a() {
            return this.f26617a.getValue();
        }

        public K getKey() {
            return this.f26617a.getKey();
        }

        public Object getValue() {
            c22 value = this.f26617a.getValue();
            if (value == null) {
                return null;
            }
            return value.mo32216p();
        }

        public Object setValue(Object obj) {
            if (obj instanceof yh2) {
                return this.f26617a.getValue().mo34158m((yh2) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* renamed from: com.onedelhi.secure.c22$c */
    public static class C4726c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: a */
        public Iterator<Map.Entry<K, Object>> f26618a;

        public C4726c(Iterator<Map.Entry<K, Object>> it) {
            this.f26618a = it;
        }

        /* renamed from: a */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f26618a.next();
            return next.getValue() instanceof c22 ? new C4725b(next) : next;
        }

        public boolean hasNext() {
            return this.f26618a.hasNext();
        }

        public void remove() {
            this.f26618a.remove();
        }
    }

    public c22(yh2 yh2, zy0 zy0, C5173er erVar) {
        super(zy0, erVar);
        this.f26616b = yh2;
    }

    /* renamed from: c */
    public boolean mo32213c() {
        return super.mo32213c() || this.f27185a == this.f26616b;
    }

    public boolean equals(Object obj) {
        return mo32216p().equals(obj);
    }

    public int hashCode() {
        return mo32216p().hashCode();
    }

    /* renamed from: p */
    public yh2 mo32216p() {
        return mo34153g(this.f26616b);
    }

    public String toString() {
        return mo32216p().toString();
    }
}
