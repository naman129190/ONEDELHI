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

public class lu6 extends AbstractMap {

    /* renamed from: a */
    public volatile ju6 f15632a;

    /* renamed from: a */
    public List f15633a = Collections.emptyList();

    /* renamed from: a */
    public Map f15634a = Collections.emptyMap();

    /* renamed from: b */
    public Map f15635b = Collections.emptyMap();

    /* renamed from: b */
    public boolean f15636b;

    /* renamed from: n */
    public final int f15637n;

    public /* synthetic */ lu6(int i, ku6 ku6) {
        this.f15637n = i;
    }

    /* renamed from: c */
    public void mo18666c() {
        if (!this.f15636b) {
            this.f15634a = this.f15634a.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f15634a);
            this.f15635b = this.f15635b.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f15635b);
            this.f15636b = true;
        }
    }

    public final void clear() {
        mo19916r();
        if (!this.f15633a.isEmpty()) {
            this.f15633a.clear();
        }
        if (!this.f15634a.isEmpty()) {
            this.f15634a.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return mo19912o(comparable) >= 0 || this.f15634a.containsKey(comparable);
    }

    /* renamed from: d */
    public final int mo19903d() {
        return this.f15633a.size();
    }

    public final Set entrySet() {
        if (this.f15632a == null) {
            this.f15632a = new ju6(this, (iu6) null);
        }
        return this.f15632a;
    }

    public final boolean equals(Object obj) {
        Object entrySet;
        Object entrySet2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lu6)) {
            return super.equals(obj);
        }
        lu6 lu6 = (lu6) obj;
        int size = size();
        if (size != lu6.size()) {
            return false;
        }
        int d = mo19903d();
        if (d == lu6.mo19903d()) {
            for (int i = 0; i < d; i++) {
                if (!mo19910j(i).equals(lu6.mo19910j(i))) {
                    return false;
                }
            }
            if (d == size) {
                return true;
            }
            entrySet = this.f15634a;
            entrySet2 = lu6.f15634a;
        } else {
            entrySet = entrySet();
            entrySet2 = lu6.entrySet();
        }
        return entrySet.equals(entrySet2);
    }

    /* renamed from: f */
    public final Iterable mo19906f() {
        return this.f15634a.isEmpty() ? mt6.m22014a() : this.f15634a.entrySet();
    }

    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int o = mo19912o(comparable);
        return o >= 0 ? ((fu6) this.f15633a.get(o)).getValue() : this.f15634a.get(comparable);
    }

    /* renamed from: h */
    public final Object put(Comparable comparable, Object obj) {
        mo19916r();
        int o = mo19912o(comparable);
        if (o >= 0) {
            return ((fu6) this.f15633a.get(o)).setValue(obj);
        }
        mo19916r();
        if (this.f15633a.isEmpty() && !(this.f15633a instanceof ArrayList)) {
            this.f15633a = new ArrayList(this.f15637n);
        }
        int i = -(o + 1);
        if (i >= this.f15637n) {
            return mo19915q().put(comparable, obj);
        }
        int size = this.f15633a.size();
        int i2 = this.f15637n;
        if (size == i2) {
            fu6 fu6 = (fu6) this.f15633a.remove(i2 - 1);
            mo19915q().put(fu6.mo16176a(), fu6.getValue());
        }
        this.f15633a.add(i, new fu6(this, comparable, obj));
        return null;
    }

    public final int hashCode() {
        int d = mo19903d();
        int i = 0;
        for (int i2 = 0; i2 < d; i2++) {
            i += ((fu6) this.f15633a.get(i2)).hashCode();
        }
        return this.f15634a.size() > 0 ? i + this.f15634a.hashCode() : i;
    }

    /* renamed from: j */
    public final Map.Entry mo19910j(int i) {
        return (Map.Entry) this.f15633a.get(i);
    }

    /* renamed from: n */
    public final boolean mo19911n() {
        return this.f15636b;
    }

    /* renamed from: o */
    public final int mo19912o(Comparable comparable) {
        int size = this.f15633a.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((fu6) this.f15633a.get(size)).mo16176a());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = comparable.compareTo(((fu6) this.f15633a.get(i2)).mo16176a());
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
    public final Object mo19913p(int i) {
        mo19916r();
        Object value = ((fu6) this.f15633a.remove(i)).getValue();
        if (!this.f15634a.isEmpty()) {
            Iterator it = mo19915q().entrySet().iterator();
            List list = this.f15633a;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new fu6(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    /* renamed from: q */
    public final SortedMap mo19915q() {
        mo19916r();
        if (this.f15634a.isEmpty() && !(this.f15634a instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f15634a = treeMap;
            TreeMap treeMap2 = treeMap;
            this.f15635b = treeMap.descendingMap();
        }
        return (SortedMap) this.f15634a;
    }

    /* renamed from: r */
    public final void mo19916r() {
        if (this.f15636b) {
            throw new UnsupportedOperationException();
        }
    }

    public final Object remove(Object obj) {
        mo19916r();
        Comparable comparable = (Comparable) obj;
        int o = mo19912o(comparable);
        if (o >= 0) {
            return mo19913p(o);
        }
        if (this.f15634a.isEmpty()) {
            return null;
        }
        return this.f15634a.remove(comparable);
    }

    public final int size() {
        return this.f15633a.size() + this.f15634a.size();
    }
}
