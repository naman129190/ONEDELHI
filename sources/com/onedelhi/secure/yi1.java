package com.onedelhi.secure;

import com.onedelhi.secure.k33;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class yi1<K extends k33, V> {

    /* renamed from: a */
    public final C4003a<K, V> f23115a = new C4003a<>();

    /* renamed from: a */
    public final Map<K, C4003a<K, V>> f23116a = new HashMap();

    /* renamed from: com.onedelhi.secure.yi1$a */
    public static class C4003a<K, V> {

        /* renamed from: a */
        public C4003a<K, V> f23117a;

        /* renamed from: a */
        public final K f23118a;

        /* renamed from: a */
        public List<V> f23119a;

        /* renamed from: b */
        public C4003a<K, V> f23120b;

        public C4003a() {
            this((Object) null);
        }

        public C4003a(K k) {
            this.f23120b = this;
            this.f23117a = this;
            this.f23118a = k;
        }

        /* renamed from: a */
        public void mo27506a(V v) {
            if (this.f23119a == null) {
                this.f23119a = new ArrayList();
            }
            this.f23119a.add(v);
        }

        @ts2
        /* renamed from: b */
        public V mo27507b() {
            int c = mo27508c();
            if (c > 0) {
                return this.f23119a.remove(c - 1);
            }
            return null;
        }

        /* renamed from: c */
        public int mo27508c() {
            List<V> list = this.f23119a;
            if (list != null) {
                return list.size();
            }
            return 0;
        }
    }

    /* renamed from: e */
    public static <K, V> void m32386e(C4003a<K, V> aVar) {
        C4003a<K, V> aVar2 = aVar.f23120b;
        aVar2.f23117a = aVar.f23117a;
        aVar.f23117a.f23120b = aVar2;
    }

    /* renamed from: g */
    public static <K, V> void m32387g(C4003a<K, V> aVar) {
        aVar.f23117a.f23120b = aVar;
        aVar.f23120b.f23117a = aVar;
    }

    @ts2
    /* renamed from: a */
    public V mo27500a(K k) {
        C4003a aVar = this.f23116a.get(k);
        if (aVar == null) {
            aVar = new C4003a(k);
            this.f23116a.put(k, aVar);
        } else {
            k.mo14602a();
        }
        mo27501b(aVar);
        return aVar.mo27507b();
    }

    /* renamed from: b */
    public final void mo27501b(C4003a<K, V> aVar) {
        m32386e(aVar);
        C4003a<K, V> aVar2 = this.f23115a;
        aVar.f23120b = aVar2;
        aVar.f23117a = aVar2.f23117a;
        m32387g(aVar);
    }

    /* renamed from: c */
    public final void mo27502c(C4003a<K, V> aVar) {
        m32386e(aVar);
        C4003a<K, V> aVar2 = this.f23115a;
        aVar.f23120b = aVar2.f23120b;
        aVar.f23117a = aVar2;
        m32387g(aVar);
    }

    /* renamed from: d */
    public void mo27503d(K k, V v) {
        C4003a aVar = this.f23116a.get(k);
        if (aVar == null) {
            aVar = new C4003a(k);
            mo27502c(aVar);
            this.f23116a.put(k, aVar);
        } else {
            k.mo14602a();
        }
        aVar.mo27506a(v);
    }

    @ts2
    /* renamed from: f */
    public V mo27504f() {
        C4003a<K, V> aVar = this.f23115a;
        while (true) {
            aVar = aVar.f23120b;
            if (aVar.equals(this.f23115a)) {
                return null;
            }
            V b = aVar.mo27507b();
            if (b != null) {
                return b;
            }
            m32386e(aVar);
            this.f23116a.remove(aVar.f23118a);
            ((k33) aVar.f23118a).mo14602a();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (C4003a<K, V> aVar = this.f23115a.f23117a; !aVar.equals(this.f23115a); aVar = aVar.f23117a) {
            z = true;
            sb.append('{');
            sb.append(aVar.f23118a);
            sb.append(':');
            sb.append(aVar.mo27508c());
            sb.append("}, ");
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
