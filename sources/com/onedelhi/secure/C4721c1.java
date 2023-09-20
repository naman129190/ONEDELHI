package com.onedelhi.secure;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

@gz3(version = "1.1")
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\t\b\u0004¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0007\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0001H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/onedelhi/secure/c1;", "K", "V", "", "Ljava/util/AbstractMap;", "key", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* renamed from: com.onedelhi.secure.c1 */
public abstract class C4721c1<K, V> extends AbstractMap<K, V> implements Map<K, V>, tx1 {
    /* renamed from: c */
    public abstract Set mo32201c();

    /* renamed from: d */
    public /* bridge */ Set<Object> mo32202d() {
        return super.keySet();
    }

    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return mo32201c();
    }

    /* renamed from: f */
    public /* bridge */ int mo32204f() {
        return super.size();
    }

    /* renamed from: g */
    public /* bridge */ Collection<Object> mo32205g() {
        return super.values();
    }

    public final /* bridge */ Set<K> keySet() {
        return mo32202d();
    }

    @ss2
    public abstract V put(K k, V v);

    public final /* bridge */ int size() {
        return mo32204f();
    }

    public final /* bridge */ Collection<V> values() {
        return mo32205g();
    }
}
