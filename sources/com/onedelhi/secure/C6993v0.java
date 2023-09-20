package com.onedelhi.secure;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

@gz3(version = "1.1")
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0007\b'\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003:\u0001*B\t\b\u0004¢\u0006\u0004\b(\u0010)J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\t\u0010\u0007J!\u0010\f\u001a\u00020\u00052\u0010\u0010\u000b\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\nH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002J\u001a\u0010\u0011\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0005H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u001c\u0010\u0018\u001a\u00020\u00162\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nH\bJ\u0012\u0010\u001a\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u000eH\u0002J%\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000 8VX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00010$8VX\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lcom/onedelhi/secure/v0;", "K", "V", "", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "value", "containsValue", "", "entry", "d", "(Ljava/util/Map$Entry;)Z", "", "other", "equals", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "hashCode", "isEmpty", "", "toString", "m", "o", "l", "j", "(Ljava/lang/Object;)Ljava/util/Map$Entry;", "h", "()I", "size", "", "g", "()Ljava/util/Set;", "keys", "", "i", "()Ljava/util/Collection;", "values", "<init>", "()V", "a", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* renamed from: com.onedelhi.secure.v0 */
public abstract class C6993v0<K, V> implements Map<K, V>, nx1 {
    @vr2

    /* renamed from: a */
    public static final C6994a f36365a = new C6994a((wg0) null);
    @ss2

    /* renamed from: a */
    public volatile Collection<? extends V> f36366a;
    @ss2

    /* renamed from: a */
    public volatile Set<? extends K> f36367a;

    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010&\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\b\u001a\u00020\u00072\u000e\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002H\u0000¢\u0006\u0004\b\b\u0010\tJ)\u0010\f\u001a\u00020\u000b2\u000e\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/onedelhi/secure/v0$a;", "", "", "e", "", "b", "(Ljava/util/Map$Entry;)I", "", "c", "(Ljava/util/Map$Entry;)Ljava/lang/String;", "other", "", "a", "(Ljava/util/Map$Entry;Ljava/lang/Object;)Z", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.v0$a */
    public static final class C6994a {
        public C6994a() {
        }

        public /* synthetic */ C6994a(wg0 wg0) {
            this();
        }

        /* renamed from: a */
        public final boolean mo45905a(@vr2 Map.Entry<?, ?> entry, @ss2 Object obj) {
            jt1.m53777p(entry, "e");
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry2 = (Map.Entry) obj;
            return jt1.m53768g(entry.getKey(), entry2.getKey()) && jt1.m53768g(entry.getValue(), entry2.getValue());
        }

        /* renamed from: b */
        public final int mo45906b(@vr2 Map.Entry<?, ?> entry) {
            jt1.m53777p(entry, "e");
            Object key = entry.getKey();
            int i = 0;
            int hashCode = key != null ? key.hashCode() : 0;
            Object value = entry.getValue();
            if (value != null) {
                i = value.hashCode();
            }
            return hashCode ^ i;
        }

        @vr2
        /* renamed from: c */
        public final String mo45907c(@vr2 Map.Entry<?, ?> entry) {
            jt1.m53777p(entry, "e");
            StringBuilder sb = new StringBuilder();
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            return sb.toString();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0002R\u0014\u0010\u000b\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"com/onedelhi/secure/v0$b", "Lcom/onedelhi/secure/l1;", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "iterator", "", "b", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.v0$b */
    public static final class C6995b extends C5952l1<K> {

        /* renamed from: a */
        public final /* synthetic */ C6993v0<K, V> f36368a;

        @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/onedelhi/secure/v0$b$a", "", "", "hasNext", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
        /* renamed from: com.onedelhi.secure.v0$b$a */
        public static final class C6996a implements Iterator<K>, nx1 {

            /* renamed from: a */
            public final /* synthetic */ Iterator<Map.Entry<K, V>> f36369a;

            public C6996a(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.f36369a = it;
            }

            public boolean hasNext() {
                return this.f36369a.hasNext();
            }

            public K next() {
                return this.f36369a.next().getKey();
            }

            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        public C6995b(C6993v0<K, ? extends V> v0Var) {
            this.f36368a = v0Var;
        }

        /* renamed from: b */
        public int mo34341b() {
            return this.f36368a.size();
        }

        public boolean contains(Object obj) {
            return this.f36368a.containsKey(obj);
        }

        @vr2
        public Iterator<K> iterator() {
            return new C6996a(this.f36368a.entrySet().iterator());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0010&\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001 \u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"K", "V", "", "it", "", "a", "(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.v0$c */
    public static final class C6997c extends d12 implements ec1<Map.Entry<? extends K, ? extends V>, CharSequence> {

        /* renamed from: a */
        public final /* synthetic */ C6993v0<K, V> f36370a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6997c(C6993v0<K, ? extends V> v0Var) {
            super(1);
            this.f36370a = v0Var;
        }

        @vr2
        /* renamed from: a */
        public final CharSequence mo17094X(@vr2 Map.Entry<? extends K, ? extends V> entry) {
            jt1.m53777p(entry, "it");
            return this.f36370a.mo45898m(entry);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0002R\u0014\u0010\u000b\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"com/onedelhi/secure/v0$d", "Lcom/onedelhi/secure/k0;", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "iterator", "", "b", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.v0$d */
    public static final class C6998d extends C5858k0<V> {

        /* renamed from: a */
        public final /* synthetic */ C6993v0<K, V> f36371a;

        @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/onedelhi/secure/v0$d$a", "", "", "hasNext", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
        /* renamed from: com.onedelhi.secure.v0$d$a */
        public static final class C6999a implements Iterator<V>, nx1 {

            /* renamed from: a */
            public final /* synthetic */ Iterator<Map.Entry<K, V>> f36372a;

            public C6999a(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.f36372a = it;
            }

            public boolean hasNext() {
                return this.f36372a.hasNext();
            }

            public V next() {
                return this.f36372a.next().getValue();
            }

            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        public C6998d(C6993v0<K, ? extends V> v0Var) {
            this.f36371a = v0Var;
        }

        /* renamed from: b */
        public int mo34341b() {
            return this.f36371a.size();
        }

        public boolean contains(Object obj) {
            return this.f36371a.containsValue(obj);
        }

        @vr2
        public Iterator<V> iterator() {
            return new C6999a(this.f36371a.entrySet().iterator());
        }
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return mo45895j(obj) != null;
    }

    public boolean containsValue(Object obj) {
        Set<Map.Entry> entrySet = entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return false;
        }
        for (Map.Entry value : entrySet) {
            if (jt1.m53768g(value.getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo45885d(@ss2 Map.Entry<?, ?> entry) {
        if (entry == null) {
            return false;
        }
        Object key = entry.getKey();
        Object value = entry.getValue();
        jt1.m53775n(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Object obj = get(key);
        if (!jt1.m53768g(value, obj)) {
            return false;
        }
        if (obj != null) {
            return true;
        }
        jt1.m53775n(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.containsKey, *>");
        return containsKey(key);
    }

    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return mo45888f();
    }

    public boolean equals(@ss2 Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        Set<Map.Entry> entrySet = map.entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return true;
        }
        for (Map.Entry d : entrySet) {
            if (!mo45885d(d)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public abstract Set mo45888f();

    @vr2
    /* renamed from: g */
    public Set<K> mo45889g() {
        if (this.f36367a == null) {
            this.f36367a = new C6995b(this);
        }
        Set<? extends K> set = this.f36367a;
        jt1.m53774m(set);
        return set;
    }

    @ss2
    public V get(Object obj) {
        Map.Entry j = mo45895j(obj);
        if (j != null) {
            return j.getValue();
        }
        return null;
    }

    /* renamed from: h */
    public int mo45891h() {
        return entrySet().size();
    }

    public int hashCode() {
        return entrySet().hashCode();
    }

    @vr2
    /* renamed from: i */
    public Collection<V> mo45893i() {
        if (this.f36366a == null) {
            this.f36366a = new C6998d(this);
        }
        Collection<? extends V> collection = this.f36366a;
        jt1.m53774m(collection);
        return collection;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: j */
    public final Map.Entry<K, V> mo45895j(K k) {
        Object obj;
        Iterator it = entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jt1.m53768g(((Map.Entry) obj).getKey(), k)) {
                break;
            }
        }
        return (Map.Entry) obj;
    }

    public final /* bridge */ Set<K> keySet() {
        return mo45889g();
    }

    /* renamed from: l */
    public final String mo45897l(Object obj) {
        return obj == this ? "(this Map)" : String.valueOf(obj);
    }

    /* renamed from: m */
    public final String mo45898m(Map.Entry<? extends K, ? extends V> entry) {
        return mo45897l(entry.getKey()) + '=' + mo45897l(entry.getValue());
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
        return mo45891h();
    }

    @vr2
    public String toString() {
        return a10.m35851h3(entrySet(), ", ", to1.f35745h, "}", 0, (CharSequence) null, new C6997c(this), 24, (Object) null);
    }

    public final /* bridge */ Collection<V> values() {
        return mo45893i();
    }
}
