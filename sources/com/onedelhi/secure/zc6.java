package com.onedelhi.secure;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class zc6 extends AbstractMap {

    /* renamed from: a */
    public volatile tc6 f23569a;

    /* renamed from: a */
    public List f23570a = Collections.emptyList();

    /* renamed from: a */
    public Map f23571a = Collections.emptyMap();

    /* renamed from: b */
    public Map f23572b = Collections.emptyMap();

    /* renamed from: b */
    public boolean f23573b;

    /* renamed from: n */
    public final int f23574n;

    public /* synthetic */ zc6(int i, wc6 wc6) {
        this.f23574n = i;
    }

    /* renamed from: c */
    public void mo26000c() {
        if (!this.f23573b) {
            this.f23571a = this.f23571a.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f23571a);
            this.f23572b = this.f23572b.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f23572b);
            this.f23573b = true;
        }
    }

    public final void clear() {
        mo27937r();
        if (!this.f23570a.isEmpty()) {
            this.f23570a.clear();
        }
        if (!this.f23571a.isEmpty()) {
            this.f23571a.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return mo27933o(comparable) >= 0 || this.f23571a.containsKey(comparable);
    }

    /* renamed from: d */
    public final int mo27924d() {
        return this.f23570a.size();
    }

    public final Set entrySet() {
        if (this.f23569a == null) {
            this.f23569a = new tc6(this, (qc6) null);
        }
        return this.f23569a;
    }

    public final boolean equals(Object obj) {
        Object entrySet;
        Object entrySet2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zc6)) {
            return super.equals(obj);
        }
        zc6 zc6 = (zc6) obj;
        int size = size();
        if (size != zc6.size()) {
            return false;
        }
        int d = mo27924d();
        if (d == zc6.mo27924d()) {
            for (int i = 0; i < d; i++) {
                if (!mo27931j(i).equals(zc6.mo27931j(i))) {
                    return false;
                }
            }
            if (d == size) {
                return true;
            }
            entrySet = this.f23571a;
            entrySet2 = zc6.f23571a;
        } else {
            entrySet = entrySet();
            entrySet2 = zc6.entrySet();
        }
        return entrySet.equals(entrySet2);
    }

    /* renamed from: f */
    public final Iterable mo27927f() {
        return this.f23571a.isEmpty() ? ec6.m13675a() : this.f23571a.entrySet();
    }

    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int o = mo27933o(comparable);
        return o >= 0 ? ((hc6) this.f23570a.get(o)).getValue() : this.f23571a.get(comparable);
    }

    /* renamed from: h */
    public final Object put(Comparable comparable, Object obj) {
        mo27937r();
        int o = mo27933o(comparable);
        if (o >= 0) {
            return ((hc6) this.f23570a.get(o)).setValue(obj);
        }
        mo27937r();
        if (this.f23570a.isEmpty() && !(this.f23570a instanceof ArrayList)) {
            this.f23570a = new ArrayList(this.f23574n);
        }
        int i = -(o + 1);
        if (i >= this.f23574n) {
            return mo27936q().put(comparable, obj);
        }
        int size = this.f23570a.size();
        int i2 = this.f23574n;
        if (size == i2) {
            hc6 hc6 = (hc6) this.f23570a.remove(i2 - 1);
            mo27936q().put(hc6.mo17192a(), hc6.getValue());
        }
        this.f23570a.add(i, new hc6(this, comparable, obj));
        return null;
    }

    public final int hashCode() {
        int d = mo27924d();
        int i = 0;
        for (int i2 = 0; i2 < d; i2++) {
            i += ((hc6) this.f23570a.get(i2)).hashCode();
        }
        return this.f23571a.size() > 0 ? i + this.f23571a.hashCode() : i;
    }

    /* renamed from: j */
    public final Map.Entry mo27931j(int i) {
        return (Map.Entry) this.f23570a.get(i);
    }

    /* renamed from: n */
    public final boolean mo27932n() {
        return this.f23573b;
    }

    /* renamed from: o */
    public final int mo27933o(Comparable comparable) {
        int size = this.f23570a.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((hc6) this.f23570a.get(size)).mo17192a());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = comparable.compareTo(((hc6) this.f23570a.get(i2)).mo17192a());
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

    /* renamed from: p */
    public final Object mo27934p(int i) {
        mo27937r();
        Object value = ((hc6) this.f23570a.remove(i)).getValue();
        if (!this.f23571a.isEmpty()) {
            Iterator it = mo27936q().entrySet().iterator();
            List list = this.f23570a;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new hc6(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    /* renamed from: q */
    public final SortedMap mo27936q() {
        mo27937r();
        if (this.f23571a.isEmpty() && !(this.f23571a instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f23571a = treeMap;
            TreeMap treeMap2 = treeMap;
            this.f23572b = treeMap.descendingMap();
        }
        return (SortedMap) this.f23571a;
    }

    /* renamed from: r */
    public final void mo27937r() {
        if (this.f23573b) {
            throw new UnsupportedOperationException();
        }
    }

    public final Object remove(Object obj) {
        mo27937r();
        Comparable comparable = (Comparable) obj;
        int o = mo27933o(comparable);
        if (o >= 0) {
            return mo27934p(o);
        }
        if (this.f23571a.isEmpty()) {
            return null;
        }
        return this.f23571a.remove(comparable);
    }

    public final int size() {
        return this.f23570a.size() + this.f23571a.size();
    }
}
