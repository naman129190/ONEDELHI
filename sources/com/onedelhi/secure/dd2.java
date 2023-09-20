package com.onedelhi.secure;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B>\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0015\u0012!\u0010+\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00028\u00010(¢\u0006\u0004\b,\u0010-J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u001a\u0010\u0012\u001a\u0004\u0018\u00018\u00012\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00028\u00012\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0013R&\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00158\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001d8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010!8VX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R&\u0010'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010%0\u001d8VX\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u001f¨\u0006."}, d2 = {"Lcom/onedelhi/secure/dd2;", "K", "V", "Lcom/onedelhi/secure/cd2;", "", "other", "", "equals", "", "hashCode", "", "toString", "isEmpty", "key", "containsKey", "(Ljava/lang/Object;)Z", "value", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "k", "", "map", "Ljava/util/Map;", "e", "()Ljava/util/Map;", "f", "()I", "size", "", "d", "()Ljava/util/Set;", "keys", "", "g", "()Ljava/util/Collection;", "values", "", "c", "entries", "Lkotlin/Function1;", "Lcom/onedelhi/secure/iy2;", "name", "default", "<init>", "(Ljava/util/Map;Lcom/onedelhi/secure/ec1;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class dd2<K, V> implements cd2<K, V> {
    @vr2

    /* renamed from: a */
    public final ec1<K, V> f27374a;
    @vr2

    /* renamed from: a */
    public final Map<K, V> f27375a;

    public dd2(@vr2 Map<K, ? extends V> map, @vr2 ec1<? super K, ? extends V> ec1) {
        jt1.m53777p(map, "map");
        jt1.m53777p(ec1, "default");
        this.f27375a = map;
        this.f27374a = ec1;
    }

    @vr2
    /* renamed from: c */
    public Set<Map.Entry<K, V>> mo34304c() {
        return mo32304e().entrySet();
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return mo32304e().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return mo32304e().containsValue(obj);
    }

    @vr2
    /* renamed from: d */
    public Set<K> mo34308d() {
        return mo32304e().keySet();
    }

    @vr2
    /* renamed from: e */
    public Map<K, V> mo32304e() {
        return this.f27375a;
    }

    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return mo34304c();
    }

    public boolean equals(@ss2 Object obj) {
        return mo32304e().equals(obj);
    }

    /* renamed from: f */
    public int mo34311f() {
        return mo32304e().size();
    }

    @vr2
    /* renamed from: g */
    public Collection<V> mo34312g() {
        return mo32304e().values();
    }

    @ss2
    public V get(Object obj) {
        return mo32304e().get(obj);
    }

    public int hashCode() {
        return mo32304e().hashCode();
    }

    public boolean isEmpty() {
        return mo32304e().isEmpty();
    }

    /* renamed from: k */
    public V mo32305k(K k) {
        Map e = mo32304e();
        V v = e.get(k);
        return (v != null || e.containsKey(k)) ? v : this.f27374a.mo17094X(k);
    }

    public final /* bridge */ Set<K> keySet() {
        return mo34308d();
    }

    public V put(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo34311f();
    }

    @vr2
    public String toString() {
        return mo32304e().toString();
    }

    public final /* bridge */ Collection<V> values() {
        return mo34312g();
    }
}
