package com.onedelhi.secure;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

public final class r32<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: b */
    public static final Comparator<Comparable> f19572b = new C3355a();

    /* renamed from: b */
    public static final /* synthetic */ boolean f19573b = false;

    /* renamed from: a */
    public r32<K, V>.d f19574a;

    /* renamed from: a */
    public r32<K, V>.e f19575a;

    /* renamed from: a */
    public final C3363g<K, V> f19576a;

    /* renamed from: a */
    public Comparator<? super K> f19577a;

    /* renamed from: a */
    public C3363g<K, V>[] f19578a;

    /* renamed from: n */
    public int f19579n;

    /* renamed from: o */
    public int f19580o;

    /* renamed from: p */
    public int f19581p;

    /* renamed from: com.onedelhi.secure.r32$a */
    public class C3355a implements Comparator<Comparable> {
        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* renamed from: com.onedelhi.secure.r32$b */
    public static final class C3356b<K, V> {

        /* renamed from: a */
        public int f19582a;

        /* renamed from: a */
        public C3363g<K, V> f19583a;

        /* renamed from: b */
        public int f19584b;

        /* renamed from: c */
        public int f19585c;

        /* renamed from: a */
        public void mo23585a(C3363g<K, V> gVar) {
            gVar.f19599c = null;
            gVar.f19595a = null;
            gVar.f19597b = null;
            gVar.f19603o = 1;
            int i = this.f19582a;
            if (i > 0) {
                int i2 = this.f19585c;
                if ((i2 & 1) == 0) {
                    this.f19585c = i2 + 1;
                    this.f19582a = i - 1;
                    this.f19584b++;
                }
            }
            gVar.f19595a = this.f19583a;
            this.f19583a = gVar;
            int i3 = this.f19585c + 1;
            this.f19585c = i3;
            int i4 = this.f19582a;
            if (i4 > 0 && (i3 & 1) == 0) {
                this.f19585c = i3 + 1;
                this.f19582a = i4 - 1;
                this.f19584b++;
            }
            int i5 = 4;
            while (true) {
                int i6 = i5 - 1;
                if ((this.f19585c & i6) == i6) {
                    int i7 = this.f19584b;
                    if (i7 == 0) {
                        C3363g<K, V> gVar2 = this.f19583a;
                        C3363g<K, V> gVar3 = gVar2.f19595a;
                        C3363g<K, V> gVar4 = gVar3.f19595a;
                        gVar3.f19595a = gVar4.f19595a;
                        this.f19583a = gVar3;
                        gVar3.f19597b = gVar4;
                        gVar3.f19599c = gVar2;
                        gVar3.f19603o = gVar2.f19603o + 1;
                        gVar4.f19595a = gVar3;
                        gVar2.f19595a = gVar3;
                    } else {
                        if (i7 == 1) {
                            C3363g<K, V> gVar5 = this.f19583a;
                            C3363g<K, V> gVar6 = gVar5.f19595a;
                            this.f19583a = gVar6;
                            gVar6.f19599c = gVar5;
                            gVar6.f19603o = gVar5.f19603o + 1;
                            gVar5.f19595a = gVar6;
                        } else if (i7 != 2) {
                        }
                        this.f19584b = 0;
                    }
                    i5 *= 2;
                } else {
                    return;
                }
            }
        }

        /* renamed from: b */
        public void mo23586b(int i) {
            this.f19582a = ((Integer.highestOneBit(i) * 2) - 1) - i;
            this.f19585c = 0;
            this.f19584b = 0;
            this.f19583a = null;
        }

        /* renamed from: c */
        public C3363g<K, V> mo23587c() {
            C3363g<K, V> gVar = this.f19583a;
            if (gVar.f19595a == null) {
                return gVar;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: com.onedelhi.secure.r32$c */
    public static class C3357c<K, V> {

        /* renamed from: a */
        public C3363g<K, V> f19586a;

        /* renamed from: a */
        public C3363g<K, V> mo23588a() {
            C3363g<K, V> gVar = this.f19586a;
            if (gVar == null) {
                return null;
            }
            C3363g<K, V> gVar2 = gVar.f19595a;
            gVar.f19595a = null;
            C3363g<K, V> gVar3 = gVar.f19599c;
            while (true) {
                C3363g<K, V> gVar4 = gVar2;
                gVar2 = gVar3;
                C3363g<K, V> gVar5 = gVar4;
                if (gVar2 != null) {
                    gVar2.f19595a = gVar5;
                    gVar3 = gVar2.f19597b;
                } else {
                    this.f19586a = gVar5;
                    return gVar;
                }
            }
        }

        /* renamed from: b */
        public void mo23589b(C3363g<K, V> gVar) {
            C3363g<K, V> gVar2 = null;
            while (gVar != null) {
                gVar.f19595a = gVar2;
                gVar2 = gVar;
                gVar = gVar.f19597b;
            }
            this.f19586a = gVar2;
        }
    }

    /* renamed from: com.onedelhi.secure.r32$d */
    public final class C3358d extends AbstractSet<Map.Entry<K, V>> {

        /* renamed from: com.onedelhi.secure.r32$d$a */
        public class C3359a extends r32<K, V>.f<Map.Entry<K, V>> {
            public C3359a() {
                super();
            }

            /* renamed from: b */
            public Map.Entry<K, V> next() {
                return mo23603a();
            }
        }

        public C3358d() {
        }

        public void clear() {
            r32.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && r32.this.mo23570h((Map.Entry) obj) != null;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C3359a();
        }

        public boolean remove(Object obj) {
            C3363g h;
            if (!(obj instanceof Map.Entry) || (h = r32.this.mo23570h((Map.Entry) obj)) == null) {
                return false;
            }
            r32.this.mo23574l(h, true);
            return true;
        }

        public int size() {
            return r32.this.f19579n;
        }
    }

    /* renamed from: com.onedelhi.secure.r32$e */
    public final class C3360e extends AbstractSet<K> {

        /* renamed from: com.onedelhi.secure.r32$e$a */
        public class C3361a extends r32<K, V>.f<K> {
            public C3361a() {
                super();
            }

            public K next() {
                return mo23603a().f19596a;
            }
        }

        public C3360e() {
        }

        public void clear() {
            r32.this.clear();
        }

        public boolean contains(Object obj) {
            return r32.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return new C3361a();
        }

        public boolean remove(Object obj) {
            return r32.this.mo23575m(obj) != null;
        }

        public int size() {
            return r32.this.f19579n;
        }
    }

    /* renamed from: com.onedelhi.secure.r32$f */
    public abstract class C3362f<T> implements Iterator<T> {

        /* renamed from: a */
        public C3363g<K, V> f19591a;

        /* renamed from: b */
        public C3363g<K, V> f19593b = null;

        /* renamed from: n */
        public int f19594n;

        public C3362f() {
            this.f19591a = r32.this.f19576a.f19600d;
            this.f19594n = r32.this.f19580o;
        }

        /* renamed from: a */
        public final C3363g<K, V> mo23603a() {
            C3363g<K, V> gVar = this.f19591a;
            r32 r32 = r32.this;
            if (gVar == r32.f19576a) {
                throw new NoSuchElementException();
            } else if (r32.f19580o == this.f19594n) {
                this.f19591a = gVar.f19600d;
                this.f19593b = gVar;
                return gVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f19591a != r32.this.f19576a;
        }

        public final void remove() {
            C3363g<K, V> gVar = this.f19593b;
            if (gVar != null) {
                r32.this.mo23574l(gVar, true);
                this.f19593b = null;
                this.f19594n = r32.this.f19580o;
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: com.onedelhi.secure.r32$g */
    public static final class C3363g<K, V> implements Map.Entry<K, V> {

        /* renamed from: a */
        public C3363g<K, V> f19595a;

        /* renamed from: a */
        public final K f19596a;

        /* renamed from: b */
        public C3363g<K, V> f19597b;

        /* renamed from: b */
        public V f19598b;

        /* renamed from: c */
        public C3363g<K, V> f19599c;

        /* renamed from: d */
        public C3363g<K, V> f19600d;

        /* renamed from: e */
        public C3363g<K, V> f19601e;

        /* renamed from: n */
        public final int f19602n;

        /* renamed from: o */
        public int f19603o;

        public C3363g() {
            this.f19596a = null;
            this.f19602n = -1;
            this.f19601e = this;
            this.f19600d = this;
        }

        public C3363g(C3363g<K, V> gVar, K k, int i, C3363g<K, V> gVar2, C3363g<K, V> gVar3) {
            this.f19595a = gVar;
            this.f19596a = k;
            this.f19602n = i;
            this.f19603o = 1;
            this.f19600d = gVar2;
            this.f19601e = gVar3;
            gVar3.f19600d = this;
            gVar2.f19601e = this;
        }

        /* renamed from: a */
        public C3363g<K, V> mo23606a() {
            C3363g<K, V> gVar = this;
            for (C3363g<K, V> gVar2 = this.f19597b; gVar2 != null; gVar2 = gVar2.f19597b) {
                gVar = gVar2;
            }
            return gVar;
        }

        /* renamed from: b */
        public C3363g<K, V> mo23607b() {
            C3363g<K, V> gVar = this;
            for (C3363g<K, V> gVar2 = this.f19599c; gVar2 != null; gVar2 = gVar2.f19599c) {
                gVar = gVar2;
            }
            return gVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x002e
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                K r0 = r3.f19596a
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x002e
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x002e
            L_0x001c:
                V r0 = r3.f19598b
                java.lang.Object r4 = r4.getValue()
                if (r0 != 0) goto L_0x0027
                if (r4 != 0) goto L_0x002e
                goto L_0x002d
            L_0x0027:
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L_0x002e
            L_0x002d:
                r1 = 1
            L_0x002e:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.r32.C3363g.equals(java.lang.Object):boolean");
        }

        public K getKey() {
            return this.f19596a;
        }

        public V getValue() {
            return this.f19598b;
        }

        public int hashCode() {
            K k = this.f19596a;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f19598b;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            V v2 = this.f19598b;
            this.f19598b = v;
            return v2;
        }

        public String toString() {
            return this.f19596a + a13.f25713a + this.f19598b;
        }
    }

    static {
        Class<r32> cls = r32.class;
    }

    public r32() {
        this((Comparator) null);
    }

    public r32(Comparator<? super K> comparator) {
        this.f19579n = 0;
        this.f19580o = 0;
        this.f19577a = comparator == null ? f19572b : comparator;
        this.f19576a = new C3363g<>();
        C3363g<K, V>[] gVarArr = new C3363g[16];
        this.f19578a = gVarArr;
        this.f19581p = (gVarArr.length / 2) + (gVarArr.length / 4);
    }

    /* renamed from: d */
    public static <K, V> C3363g<K, V>[] m26281d(C3363g<K, V>[] gVarArr) {
        int length = gVarArr.length;
        C3363g<K, V>[] gVarArr2 = new C3363g[(length * 2)];
        C3357c cVar = new C3357c();
        C3356b bVar = new C3356b();
        C3356b bVar2 = new C3356b();
        for (int i = 0; i < length; i++) {
            C3363g<K, V> gVar = gVarArr[i];
            if (gVar != null) {
                cVar.mo23589b(gVar);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    C3363g a = cVar.mo23588a();
                    if (a == null) {
                        break;
                    } else if ((a.f19602n & length) == 0) {
                        i2++;
                    } else {
                        i3++;
                    }
                }
                bVar.mo23586b(i2);
                bVar2.mo23586b(i3);
                cVar.mo23589b(gVar);
                while (true) {
                    C3363g a2 = cVar.mo23588a();
                    if (a2 == null) {
                        break;
                    } else if ((a2.f19602n & length) == 0) {
                        bVar.mo23585a(a2);
                    } else {
                        bVar2.mo23585a(a2);
                    }
                }
                C3363g<K, V> gVar2 = null;
                gVarArr2[i] = i2 > 0 ? bVar.mo23587c() : null;
                int i4 = i + length;
                if (i3 > 0) {
                    gVar2 = bVar2.mo23587c();
                }
                gVarArr2[i4] = gVar2;
            }
        }
        return gVarArr2;
    }

    /* renamed from: q */
    public static int m26282q(int i) {
        int i2 = i ^ ((i >>> 20) ^ (i >>> 12));
        return (i2 >>> 4) ^ ((i2 >>> 7) ^ i2);
    }

    /* renamed from: c */
    public final void mo23563c() {
        C3363g<K, V>[] d = m26281d(this.f19578a);
        this.f19578a = d;
        this.f19581p = (d.length / 2) + (d.length / 4);
    }

    public void clear() {
        Arrays.fill(this.f19578a, (Object) null);
        this.f19579n = 0;
        this.f19580o++;
        C3363g<K, V> gVar = this.f19576a;
        C3363g<K, V> gVar2 = gVar.f19600d;
        while (gVar2 != gVar) {
            C3363g<K, V> gVar3 = gVar2.f19600d;
            gVar2.f19601e = null;
            gVar2.f19600d = null;
            gVar2 = gVar3;
        }
        gVar.f19601e = gVar;
        gVar.f19600d = gVar;
    }

    public boolean containsKey(Object obj) {
        return mo23571i(obj) != null;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        r32<K, V>.d dVar = this.f19574a;
        if (dVar != null) {
            return dVar;
        }
        r32<K, V>.d dVar2 = new C3358d();
        this.f19574a = dVar2;
        return dVar2;
    }

    /* renamed from: f */
    public final boolean mo23567f(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: g */
    public C3363g<K, V> mo23568g(K k, boolean z) {
        int i;
        C3363g<K, V> gVar;
        C3363g<K, V> gVar2;
        Comparator<? super K> comparator = this.f19577a;
        C3363g<K, V>[] gVarArr = this.f19578a;
        int q = m26282q(k.hashCode());
        int length = (gVarArr.length - 1) & q;
        C3363g<K, V> gVar3 = gVarArr[length];
        if (gVar3 != null) {
            Comparable comparable = comparator == f19572b ? (Comparable) k : null;
            while (true) {
                K k2 = gVar3.f19596a;
                int compareTo = comparable != null ? comparable.compareTo(k2) : comparator.compare(k, k2);
                if (compareTo == 0) {
                    return gVar3;
                }
                C3363g<K, V> gVar4 = compareTo < 0 ? gVar3.f19597b : gVar3.f19599c;
                if (gVar4 == null) {
                    gVar = gVar3;
                    i = compareTo;
                    break;
                }
                gVar3 = gVar4;
            }
        } else {
            gVar = gVar3;
            i = 0;
        }
        if (!z) {
            return null;
        }
        C3363g<K, V> gVar5 = this.f19576a;
        if (gVar != null) {
            gVar2 = new C3363g<>(gVar, k, q, gVar5, gVar5.f19601e);
            if (i < 0) {
                gVar.f19597b = gVar2;
            } else {
                gVar.f19599c = gVar2;
            }
            mo23572j(gVar, true);
        } else if (comparator != f19572b || (k instanceof Comparable)) {
            gVar2 = new C3363g<>(gVar, k, q, gVar5, gVar5.f19601e);
            gVarArr[length] = gVar2;
        } else {
            throw new ClassCastException(k.getClass().getName() + " is not Comparable");
        }
        int i2 = this.f19579n;
        this.f19579n = i2 + 1;
        if (i2 > this.f19581p) {
            mo23563c();
        }
        this.f19580o++;
        return gVar2;
    }

    public V get(Object obj) {
        C3363g i = mo23571i(obj);
        if (i != null) {
            return i.f19598b;
        }
        return null;
    }

    /* renamed from: h */
    public C3363g<K, V> mo23570h(Map.Entry<?, ?> entry) {
        C3363g<K, V> i = mo23571i(entry.getKey());
        if (i != null && mo23567f(i.f19598b, entry.getValue())) {
            return i;
        }
        return null;
    }

    /* renamed from: i */
    public C3363g<K, V> mo23571i(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return mo23568g(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    /* renamed from: j */
    public final void mo23572j(C3363g<K, V> gVar, boolean z) {
        while (gVar != null) {
            C3363g<K, V> gVar2 = gVar.f19597b;
            C3363g<K, V> gVar3 = gVar.f19599c;
            int i = 0;
            int i2 = gVar2 != null ? gVar2.f19603o : 0;
            int i3 = gVar3 != null ? gVar3.f19603o : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                C3363g<K, V> gVar4 = gVar3.f19597b;
                C3363g<K, V> gVar5 = gVar3.f19599c;
                int i5 = gVar5 != null ? gVar5.f19603o : 0;
                if (gVar4 != null) {
                    i = gVar4.f19603o;
                }
                int i6 = i - i5;
                if (i6 != -1 && (i6 != 0 || z)) {
                    mo23578p(gVar3);
                }
                mo23577o(gVar);
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                C3363g<K, V> gVar6 = gVar2.f19597b;
                C3363g<K, V> gVar7 = gVar2.f19599c;
                int i7 = gVar7 != null ? gVar7.f19603o : 0;
                if (gVar6 != null) {
                    i = gVar6.f19603o;
                }
                int i8 = i - i7;
                if (i8 != 1 && (i8 != 0 || z)) {
                    mo23577o(gVar2);
                }
                mo23578p(gVar);
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                gVar.f19603o = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                gVar.f19603o = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            gVar = gVar.f19595a;
        }
    }

    public Set<K> keySet() {
        r32<K, V>.e eVar = this.f19575a;
        if (eVar != null) {
            return eVar;
        }
        r32<K, V>.e eVar2 = new C3360e();
        this.f19575a = eVar2;
        return eVar2;
    }

    /* renamed from: l */
    public void mo23574l(C3363g<K, V> gVar, boolean z) {
        int i;
        if (z) {
            C3363g<K, V> gVar2 = gVar.f19601e;
            gVar2.f19600d = gVar.f19600d;
            gVar.f19600d.f19601e = gVar2;
            gVar.f19601e = null;
            gVar.f19600d = null;
        }
        C3363g<K, V> gVar3 = gVar.f19597b;
        C3363g<K, V> gVar4 = gVar.f19599c;
        C3363g<K, V> gVar5 = gVar.f19595a;
        int i2 = 0;
        if (gVar3 == null || gVar4 == null) {
            if (gVar3 != null) {
                mo23576n(gVar, gVar3);
                gVar.f19597b = null;
            } else if (gVar4 != null) {
                mo23576n(gVar, gVar4);
                gVar.f19599c = null;
            } else {
                mo23576n(gVar, (C3363g<K, V>) null);
            }
            mo23572j(gVar5, false);
            this.f19579n--;
            this.f19580o++;
            return;
        }
        C3363g<K, V> b = gVar3.f19603o > gVar4.f19603o ? gVar3.mo23607b() : gVar4.mo23606a();
        mo23574l(b, false);
        C3363g<K, V> gVar6 = gVar.f19597b;
        if (gVar6 != null) {
            i = gVar6.f19603o;
            b.f19597b = gVar6;
            gVar6.f19595a = b;
            gVar.f19597b = null;
        } else {
            i = 0;
        }
        C3363g<K, V> gVar7 = gVar.f19599c;
        if (gVar7 != null) {
            i2 = gVar7.f19603o;
            b.f19599c = gVar7;
            gVar7.f19595a = b;
            gVar.f19599c = null;
        }
        b.f19603o = Math.max(i, i2) + 1;
        mo23576n(gVar, b);
    }

    /* renamed from: m */
    public C3363g<K, V> mo23575m(Object obj) {
        C3363g<K, V> i = mo23571i(obj);
        if (i != null) {
            mo23574l(i, true);
        }
        return i;
    }

    /* renamed from: n */
    public final void mo23576n(C3363g<K, V> gVar, C3363g<K, V> gVar2) {
        C3363g<K, V> gVar3 = gVar.f19595a;
        gVar.f19595a = null;
        if (gVar2 != null) {
            gVar2.f19595a = gVar3;
        }
        if (gVar3 == null) {
            int i = gVar.f19602n;
            C3363g<K, V>[] gVarArr = this.f19578a;
            gVarArr[i & (gVarArr.length - 1)] = gVar2;
        } else if (gVar3.f19597b == gVar) {
            gVar3.f19597b = gVar2;
        } else {
            gVar3.f19599c = gVar2;
        }
    }

    /* renamed from: o */
    public final void mo23577o(C3363g<K, V> gVar) {
        C3363g<K, V> gVar2 = gVar.f19597b;
        C3363g<K, V> gVar3 = gVar.f19599c;
        C3363g<K, V> gVar4 = gVar3.f19597b;
        C3363g<K, V> gVar5 = gVar3.f19599c;
        gVar.f19599c = gVar4;
        if (gVar4 != null) {
            gVar4.f19595a = gVar;
        }
        mo23576n(gVar, gVar3);
        gVar3.f19597b = gVar;
        gVar.f19595a = gVar3;
        int i = 0;
        int max = Math.max(gVar2 != null ? gVar2.f19603o : 0, gVar4 != null ? gVar4.f19603o : 0) + 1;
        gVar.f19603o = max;
        if (gVar5 != null) {
            i = gVar5.f19603o;
        }
        gVar3.f19603o = Math.max(max, i) + 1;
    }

    /* renamed from: p */
    public final void mo23578p(C3363g<K, V> gVar) {
        C3363g<K, V> gVar2 = gVar.f19597b;
        C3363g<K, V> gVar3 = gVar.f19599c;
        C3363g<K, V> gVar4 = gVar2.f19597b;
        C3363g<K, V> gVar5 = gVar2.f19599c;
        gVar.f19597b = gVar5;
        if (gVar5 != null) {
            gVar5.f19595a = gVar;
        }
        mo23576n(gVar, gVar2);
        gVar2.f19599c = gVar;
        gVar.f19595a = gVar2;
        int i = 0;
        int max = Math.max(gVar3 != null ? gVar3.f19603o : 0, gVar5 != null ? gVar5.f19603o : 0) + 1;
        gVar.f19603o = max;
        if (gVar4 != null) {
            i = gVar4.f19603o;
        }
        gVar2.f19603o = Math.max(max, i) + 1;
    }

    public V put(K k, V v) {
        Objects.requireNonNull(k, "key == null");
        C3363g g = mo23568g(k, true);
        V v2 = g.f19598b;
        g.f19598b = v;
        return v2;
    }

    /* renamed from: r */
    public final Object mo23580r() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    public V remove(Object obj) {
        C3363g m = mo23575m(obj);
        if (m != null) {
            return m.f19598b;
        }
        return null;
    }

    public int size() {
        return this.f19579n;
    }
}
