package com.onedelhi.secure;

import com.onedelhi.secure.f21;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class h04<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a */
    public volatile h04<K, V>.c f29357a;

    /* renamed from: a */
    public volatile h04<K, V>.g f29358a;

    /* renamed from: a */
    public List<h04<K, V>.e> f29359a;

    /* renamed from: a */
    public Map<K, V> f29360a;

    /* renamed from: b */
    public Map<K, V> f29361b;

    /* renamed from: b */
    public boolean f29362b;

    /* renamed from: n */
    public final int f29363n;

    /* renamed from: com.onedelhi.secure.h04$a */
    public static class C5461a extends h04<FieldDescriptorType, Object> {
        public C5461a(int i) {
            super(i, (C5461a) null);
        }

        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return h04.super.put((f21.C5210c) obj, obj2);
        }

        /* renamed from: u */
        public void mo37067u() {
            if (!mo37066t()) {
                for (int i = 0; i < mo37058o(); i++) {
                    Map.Entry n = mo37057n(i);
                    if (((f21.C5210c) n.getKey()).mo35766m()) {
                        n.setValue(Collections.unmodifiableList((List) n.getValue()));
                    }
                }
                for (Map.Entry entry : mo37061q()) {
                    if (((f21.C5210c) entry.getKey()).mo35766m()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            h04.super.mo37067u();
        }
    }

    /* renamed from: com.onedelhi.secure.h04$b */
    public class C5462b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a */
        public Iterator<Map.Entry<K, V>> f29365a;

        /* renamed from: n */
        public int f29366n;

        public C5462b() {
            this.f29366n = h04.this.f29359a.size();
        }

        public /* synthetic */ C5462b(h04 h04, C5461a aVar) {
            this();
        }

        /* renamed from: a */
        public final Iterator<Map.Entry<K, V>> mo37070a() {
            if (this.f29365a == null) {
                this.f29365a = h04.this.f29361b.entrySet().iterator();
            }
            return this.f29365a;
        }

        /* renamed from: b */
        public Map.Entry<K, V> next() {
            Object obj;
            if (mo37070a().hasNext()) {
                obj = mo37070a().next();
            } else {
                List d = h04.this.f29359a;
                int i = this.f29366n - 1;
                this.f29366n = i;
                obj = d.get(i);
            }
            return (Map.Entry) obj;
        }

        public boolean hasNext() {
            int i = this.f29366n;
            return (i > 0 && i <= h04.this.f29359a.size()) || mo37070a().hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.onedelhi.secure.h04$c */
    public class C5463c extends h04<K, V>.g {
        public C5463c() {
            super(h04.this, (C5461a) null);
        }

        public /* synthetic */ C5463c(h04 h04, C5461a aVar) {
            this();
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C5462b(h04.this, (C5461a) null);
        }
    }

    /* renamed from: com.onedelhi.secure.h04$d */
    public static class C5464d {

        /* renamed from: a */
        public static final Iterable<Object> f29368a = new C5466b();

        /* renamed from: a */
        public static final Iterator<Object> f29369a = new C5465a();

        /* renamed from: com.onedelhi.secure.h04$d$a */
        public static class C5465a implements Iterator<Object> {
            public boolean hasNext() {
                return false;
            }

            public Object next() {
                throw new NoSuchElementException();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: com.onedelhi.secure.h04$d$b */
        public static class C5466b implements Iterable<Object> {
            public Iterator<Object> iterator() {
                return C5464d.f29369a;
            }
        }

        /* renamed from: b */
        public static <T> Iterable<T> m50085b() {
            return f29368a;
        }
    }

    /* renamed from: com.onedelhi.secure.h04$e */
    public class C5467e implements Map.Entry<K, V>, Comparable<h04<K, V>.e> {

        /* renamed from: a */
        public final K f29371a;

        /* renamed from: a */
        public V f29372a;

        public C5467e(K k, V v) {
            this.f29371a = k;
            this.f29372a = v;
        }

        public C5467e(h04 h04, Map.Entry<K, V> entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        /* renamed from: a */
        public int compareTo(h04<K, V>.e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        /* renamed from: b */
        public final boolean mo37081b(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        /* renamed from: e */
        public K getKey() {
            return this.f29371a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return mo37081b(this.f29371a, entry.getKey()) && mo37081b(this.f29372a, entry.getValue());
        }

        public V getValue() {
            return this.f29372a;
        }

        public int hashCode() {
            K k = this.f29371a;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f29372a;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            h04.this.mo37054j();
            V v2 = this.f29372a;
            this.f29372a = v;
            return v2;
        }

        public String toString() {
            return this.f29371a + a13.f25713a + this.f29372a;
        }
    }

    /* renamed from: com.onedelhi.secure.h04$f */
    public class C5468f implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a */
        public Iterator<Map.Entry<K, V>> f29374a;

        /* renamed from: b */
        public boolean f29375b;

        /* renamed from: n */
        public int f29376n;

        public C5468f() {
            this.f29376n = -1;
        }

        public /* synthetic */ C5468f(h04 h04, C5461a aVar) {
            this();
        }

        /* renamed from: a */
        public final Iterator<Map.Entry<K, V>> mo37090a() {
            if (this.f29374a == null) {
                this.f29374a = h04.this.f29360a.entrySet().iterator();
            }
            return this.f29374a;
        }

        /* renamed from: b */
        public Map.Entry<K, V> next() {
            this.f29375b = true;
            int i = this.f29376n + 1;
            this.f29376n = i;
            return (Map.Entry) (i < h04.this.f29359a.size() ? h04.this.f29359a.get(this.f29376n) : mo37090a().next());
        }

        public boolean hasNext() {
            if (this.f29376n + 1 >= h04.this.f29359a.size()) {
                return !h04.this.f29360a.isEmpty() && mo37090a().hasNext();
            }
            return true;
        }

        public void remove() {
            if (this.f29375b) {
                this.f29375b = false;
                h04.this.mo37054j();
                if (this.f29376n < h04.this.f29359a.size()) {
                    h04 h04 = h04.this;
                    int i = this.f29376n;
                    this.f29376n = i - 1;
                    Object unused = h04.mo37069y(i);
                    return;
                }
                mo37090a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }

    /* renamed from: com.onedelhi.secure.h04$g */
    public class C5469g extends AbstractSet<Map.Entry<K, V>> {
        public C5469g() {
        }

        public /* synthetic */ C5469g(h04 h04, C5461a aVar) {
            this();
        }

        /* renamed from: b */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            h04.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public void clear() {
            h04.this.clear();
        }

        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = h04.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C5468f(h04.this, (C5461a) null);
        }

        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            h04.this.remove(entry.getKey());
            return true;
        }

        public int size() {
            return h04.this.size();
        }
    }

    public h04(int i) {
        this.f29363n = i;
        this.f29359a = Collections.emptyList();
        this.f29360a = Collections.emptyMap();
        this.f29361b = Collections.emptyMap();
    }

    public /* synthetic */ h04(int i, C5461a aVar) {
        this(i);
    }

    /* renamed from: v */
    public static <FieldDescriptorType extends f21.C5210c<FieldDescriptorType>> h04<FieldDescriptorType, Object> m50065v(int i) {
        return new C5461a(i);
    }

    /* renamed from: w */
    public static <K extends Comparable<K>, V> h04<K, V> m50066w(int i) {
        return new h04<>(i);
    }

    public void clear() {
        mo37054j();
        if (!this.f29359a.isEmpty()) {
            this.f29359a.clear();
        }
        if (!this.f29360a.isEmpty()) {
            this.f29360a.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return mo37053i(comparable) >= 0 || this.f29360a.containsKey(comparable);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f29358a == null) {
            this.f29358a = new C5469g(this, (C5461a) null);
        }
        return this.f29358a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h04)) {
            return super.equals(obj);
        }
        h04 h04 = (h04) obj;
        int size = size();
        if (size != h04.size()) {
            return false;
        }
        int o = mo37058o();
        if (o != h04.mo37058o()) {
            return entrySet().equals(h04.entrySet());
        }
        for (int i = 0; i < o; i++) {
            if (!mo37057n(i).equals(h04.mo37057n(i))) {
                return false;
            }
        }
        if (o != size) {
            return this.f29360a.equals(h04.f29360a);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int i = mo37053i(comparable);
        return i >= 0 ? this.f29359a.get(i).getValue() : this.f29360a.get(comparable);
    }

    public int hashCode() {
        int o = mo37058o();
        int i = 0;
        for (int i2 = 0; i2 < o; i2++) {
            i += this.f29359a.get(i2).hashCode();
        }
        return mo37059p() > 0 ? i + this.f29360a.hashCode() : i;
    }

    /* renamed from: i */
    public final int mo37053i(K k) {
        int size = this.f29359a.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f29359a.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.f29359a.get(i2).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: j */
    public final void mo37054j() {
        if (this.f29362b) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: l */
    public Set<Map.Entry<K, V>> mo37055l() {
        if (this.f29357a == null) {
            this.f29357a = new C5463c(this, (C5461a) null);
        }
        return this.f29357a;
    }

    /* renamed from: m */
    public final void mo37056m() {
        mo37054j();
        if (this.f29359a.isEmpty() && !(this.f29359a instanceof ArrayList)) {
            this.f29359a = new ArrayList(this.f29363n);
        }
    }

    /* renamed from: n */
    public Map.Entry<K, V> mo37057n(int i) {
        return this.f29359a.get(i);
    }

    /* renamed from: o */
    public int mo37058o() {
        return this.f29359a.size();
    }

    /* renamed from: p */
    public int mo37059p() {
        return this.f29360a.size();
    }

    /* renamed from: q */
    public Iterable<Map.Entry<K, V>> mo37061q() {
        return this.f29360a.isEmpty() ? C5464d.m50085b() : this.f29360a.entrySet();
    }

    /* renamed from: r */
    public Iterable<Map.Entry<K, V>> mo37062r() {
        return this.f29361b.isEmpty() ? C5464d.m50085b() : this.f29361b.entrySet();
    }

    public V remove(Object obj) {
        mo37054j();
        Comparable comparable = (Comparable) obj;
        int i = mo37053i(comparable);
        if (i >= 0) {
            return mo37069y(i);
        }
        if (this.f29360a.isEmpty()) {
            return null;
        }
        return this.f29360a.remove(comparable);
    }

    /* renamed from: s */
    public final SortedMap<K, V> mo37064s() {
        mo37054j();
        if (this.f29360a.isEmpty() && !(this.f29360a instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f29360a = treeMap;
            TreeMap treeMap2 = treeMap;
            this.f29361b = treeMap.descendingMap();
        }
        return (SortedMap) this.f29360a;
    }

    public int size() {
        return this.f29359a.size() + this.f29360a.size();
    }

    /* renamed from: t */
    public boolean mo37066t() {
        return this.f29362b;
    }

    /* renamed from: u */
    public void mo37067u() {
        if (!this.f29362b) {
            this.f29360a = this.f29360a.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f29360a);
            this.f29361b = this.f29361b.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f29361b);
            this.f29362b = true;
        }
    }

    /* renamed from: x */
    public V put(K k, V v) {
        mo37054j();
        int i = mo37053i(k);
        if (i >= 0) {
            return this.f29359a.get(i).setValue(v);
        }
        mo37056m();
        int i2 = -(i + 1);
        if (i2 >= this.f29363n) {
            return mo37064s().put(k, v);
        }
        int size = this.f29359a.size();
        int i3 = this.f29363n;
        if (size == i3) {
            C5467e remove = this.f29359a.remove(i3 - 1);
            mo37064s().put(remove.getKey(), remove.getValue());
        }
        this.f29359a.add(i2, new C5467e(k, v));
        return null;
    }

    /* renamed from: y */
    public final V mo37069y(int i) {
        mo37054j();
        V value = this.f29359a.remove(i).getValue();
        if (!this.f29360a.isEmpty()) {
            Iterator it = mo37064s().entrySet().iterator();
            this.f29359a.add(new C5467e(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }
}
