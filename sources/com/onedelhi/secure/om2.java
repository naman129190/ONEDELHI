package com.onedelhi.secure;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B>\u0012\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d\u0012!\u00103\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00028\u000100¢\u0006\u0004\b4\u00105J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u001a\u0010\u0012\u001a\u0004\u0018\u00018\u00012\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0014\u001a\u0004\u0018\u00018\u00012\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u0004\u0018\u00018\u00012\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0013J\u001e\u0010\u001a\u001a\u00020\u00192\u0014\u0010\u0018\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u0019H\u0016J\u0017\u0010\u001c\u001a\u00028\u00012\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u0013R&\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d8\u0016X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000%8VX\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010)8VX\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R&\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010-0%8VX\u0004¢\u0006\u0006\u001a\u0004\b.\u0010'¨\u00066"}, d2 = {"Lcom/onedelhi/secure/om2;", "K", "V", "Lcom/onedelhi/secure/nm2;", "", "other", "", "equals", "", "hashCode", "", "toString", "isEmpty", "key", "containsKey", "(Ljava/lang/Object;)Z", "value", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove", "", "from", "Lcom/onedelhi/secure/un4;", "putAll", "clear", "k", "", "map", "Ljava/util/Map;", "e", "()Ljava/util/Map;", "f", "()I", "size", "", "d", "()Ljava/util/Set;", "keys", "", "g", "()Ljava/util/Collection;", "values", "", "c", "entries", "Lkotlin/Function1;", "Lcom/onedelhi/secure/iy2;", "name", "default", "<init>", "(Ljava/util/Map;Lcom/onedelhi/secure/ec1;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class om2<K, V> implements nm2<K, V> {
    @vr2

    /* renamed from: a */
    public final ec1<K, V> f33088a;
    @vr2

    /* renamed from: a */
    public final Map<K, V> f33089a;

    public om2(@vr2 Map<K, V> map, @vr2 ec1<? super K, ? extends V> ec1) {
        jt1.m53777p(map, "map");
        jt1.m53777p(ec1, "default");
        this.f33089a = map;
        this.f33088a = ec1;
    }

    @vr2
    /* renamed from: c */
    public Set<Map.Entry<K, V>> mo41834c() {
        return mo32304e().entrySet();
    }

    public void clear() {
        mo32304e().clear();
    }

    public boolean containsKey(Object obj) {
        return mo32304e().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return mo32304e().containsValue(obj);
    }

    @vr2
    /* renamed from: d */
    public Set<K> mo41838d() {
        return mo32304e().keySet();
    }

    @vr2
    /* renamed from: e */
    public Map<K, V> mo32304e() {
        return this.f33089a;
    }

    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return mo41834c();
    }

    public boolean equals(@ss2 Object obj) {
        return mo32304e().equals(obj);
    }

    /* renamed from: f */
    public int mo41841f() {
        return mo32304e().size();
    }

    @vr2
    /* renamed from: g */
    public Collection<V> mo41842g() {
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
        return (v != null || e.containsKey(k)) ? v : this.f33088a.mo17094X(k);
    }

    public final /* bridge */ Set<K> keySet() {
        return mo41838d();
    }

    @ss2
    public V put(K k, V v) {
        return mo32304e().put(k, v);
    }

    public void putAll(@vr2 Map<? extends K, ? extends V> map) {
        jt1.m53777p(map, "from");
        mo32304e().putAll(map);
    }

    @ss2
    public V remove(Object obj) {
        return mo32304e().remove(obj);
    }

    public final /* bridge */ int size() {
        return mo41841f();
    }

    @vr2
    public String toString() {
        return mo32304e().toString();
    }

    public final /* bridge */ Collection<V> values() {
        return mo41842g();
    }
}
