package com.onedelhi.secure;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u001d\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\r\u001a/\u0010\u0005\u001a\u00020\u0004\"\t\b\u0000\u0010\u0001¢\u0006\u0002\b\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a.\u0010\t\u001a\u00020\u0004\"\t\b\u0000\u0010\u0001¢\u0006\u0002\b\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\b\u001a.\u0010\n\u001a\u00020\u0004\"\t\b\u0000\u0010\u0001¢\u0006\u0002\b\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\b\u001a*\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\n¢\u0006\u0004\b\f\u0010\r\u001a)\u0010\u000f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\n\u001a0\u0010\u0011\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\n¢\u0006\u0004\b\u0011\u0010\u0012\u001a)\u0010\u0014\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\n\u001a*\u0010\u0015\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0015\u0010\r\u001a)\u0010\u0016\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\n\u001a0\u0010\u0017\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\n¢\u0006\u0004\b\u0017\u0010\u0012\u001a)\u0010\u0018\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\n\u001a&\u0010\u0019\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\u001a&\u0010\u001a\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\u001a/\u0010\u001b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u001b\u0010\u001c\u001a&\u0010\u001d\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\u001a&\u0010\u001e\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\u001a/\u0010\u001f\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u001f\u0010\u001c\u001a&\u0010 \u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\u001a/\u0010!\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0010¢\u0006\u0004\b!\u0010\u001c\u001a&\u0010\"\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\u001a\u0017\u0010#\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b#\u0010$\u001a*\u0010(\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000%2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040&\u001a*\u0010)\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000%2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040&\u001a;\u0010+\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000%2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040&2\u0006\u0010*\u001a\u00020\u0004H\u0002¢\u0006\u0004\b+\u0010,\u001a(\u00100\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000-2\u0006\u0010/\u001a\u00020.H\b¢\u0006\u0004\b0\u00101\u001a\u001f\u00102\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000-H\u0007¢\u0006\u0004\b2\u00103\u001a!\u00104\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000-H\u0007¢\u0006\u0004\b4\u00103\u001a\u001f\u00105\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000-H\u0007¢\u0006\u0004\b5\u00103\u001a!\u00106\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000-H\u0007¢\u0006\u0004\b6\u00103\u001a*\u00107\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000-2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040&\u001a*\u00108\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000-2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040&\u001a;\u00109\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000-2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040&2\u0006\u0010*\u001a\u00020\u0004H\u0002¢\u0006\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lcom/onedelhi/secure/vv2;", "T", "", "element", "", "C0", "(Ljava/util/Collection;Ljava/lang/Object;)Z", "", "elements", "G0", "Q0", "Lcom/onedelhi/secure/un4;", "z0", "(Ljava/util/Collection;Ljava/lang/Object;)V", "", "y0", "", "A0", "(Ljava/util/Collection;[Ljava/lang/Object;)V", "Lcom/onedelhi/secure/zt3;", "x0", "v0", "u0", "w0", "t0", "p0", "o0", "q0", "(Ljava/util/Collection;[Ljava/lang/Object;)Z", "F0", "E0", "H0", "P0", "R0", "O0", "T0", "(Ljava/util/Collection;)Z", "", "Lkotlin/Function1;", "predicate", "D0", "N0", "predicateResultToRemove", "r0", "(Ljava/lang/Iterable;Lcom/onedelhi/secure/ec1;Z)Z", "", "", "index", "B0", "(Ljava/util/List;I)Ljava/lang/Object;", "J0", "(Ljava/util/List;)Ljava/lang/Object;", "K0", "L0", "M0", "I0", "S0", "s0", "(Ljava/util/List;Lcom/onedelhi/secure/ec1;Z)Z", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/collections/CollectionsKt")
public class x00 extends w00 {
    @xq1
    /* renamed from: A0 */
    public static final <T> void m69792A0(Collection<? super T> collection, T[] tArr) {
        jt1.m53777p(collection, "<this>");
        jt1.m53777p(tArr, "elements");
        m69814q0(collection, tArr);
    }

    @xq1
    @xj0(level = ak0.ERROR, message = "Use removeAt(index) instead.", replaceWith = @oi3(expression = "removeAt(index)", imports = {}))
    /* renamed from: B0 */
    public static final <T> T m69793B0(List<T> list, int i) {
        jt1.m53777p(list, "<this>");
        return list.remove(i);
    }

    @xq1
    /* renamed from: C0 */
    public static final <T> boolean m69794C0(Collection<? extends T> collection, T t) {
        jt1.m53777p(collection, "<this>");
        return lj4.m55687a(collection).remove(t);
    }

    /* renamed from: D0 */
    public static final <T> boolean m69795D0(@vr2 Iterable<? extends T> iterable, @vr2 ec1<? super T, Boolean> ec1) {
        jt1.m53777p(iterable, "<this>");
        jt1.m53777p(ec1, "predicate");
        return m69815r0(iterable, ec1, true);
    }

    /* renamed from: E0 */
    public static final <T> boolean m69796E0(@vr2 Collection<? super T> collection, @vr2 zt3<? extends T> zt3) {
        jt1.m53777p(collection, "<this>");
        jt1.m53777p(zt3, "elements");
        Collection<? extends T> a = C5048do.m45454a(zt3);
        return (a.isEmpty() ^ true) && collection.removeAll(a);
    }

    /* renamed from: F0 */
    public static final <T> boolean m69797F0(@vr2 Collection<? super T> collection, @vr2 Iterable<? extends T> iterable) {
        jt1.m53777p(collection, "<this>");
        jt1.m53777p(iterable, "elements");
        return lj4.m55687a(collection).removeAll(C5048do.m45457d(iterable, collection));
    }

    @xq1
    /* renamed from: G0 */
    public static final <T> boolean m69798G0(Collection<? extends T> collection, Collection<? extends T> collection2) {
        jt1.m53777p(collection, "<this>");
        jt1.m53777p(collection2, "elements");
        return lj4.m55687a(collection).removeAll(collection2);
    }

    /* renamed from: H0 */
    public static final <T> boolean m69799H0(@vr2 Collection<? super T> collection, @vr2 T[] tArr) {
        jt1.m53777p(collection, "<this>");
        jt1.m53777p(tArr, "elements");
        return ((tArr.length == 0) ^ true) && collection.removeAll(C5048do.m45456c(tArr));
    }

    /* renamed from: I0 */
    public static final <T> boolean m69800I0(@vr2 List<T> list, @vr2 ec1<? super T, Boolean> ec1) {
        jt1.m53777p(list, "<this>");
        jt1.m53777p(ec1, "predicate");
        return m69816s0(list, ec1, true);
    }

    @gz3(version = "1.4")
    @tw4(markerClass = {ly0.class})
    /* renamed from: J0 */
    public static final <T> T m69801J0(@vr2 List<T> list) {
        jt1.m53777p(list, "<this>");
        if (!list.isEmpty()) {
            return list.remove(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    @gz3(version = "1.4")
    @tw4(markerClass = {ly0.class})
    @ss2
    /* renamed from: K0 */
    public static final <T> T m69802K0(@vr2 List<T> list) {
        jt1.m53777p(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    @gz3(version = "1.4")
    @tw4(markerClass = {ly0.class})
    /* renamed from: L0 */
    public static final <T> T m69803L0(@vr2 List<T> list) {
        jt1.m53777p(list, "<this>");
        if (!list.isEmpty()) {
            return list.remove(s00.m64039H(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    @gz3(version = "1.4")
    @tw4(markerClass = {ly0.class})
    @ss2
    /* renamed from: M0 */
    public static final <T> T m69804M0(@vr2 List<T> list) {
        jt1.m53777p(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(s00.m64039H(list));
    }

    /* renamed from: N0 */
    public static final <T> boolean m69805N0(@vr2 Iterable<? extends T> iterable, @vr2 ec1<? super T, Boolean> ec1) {
        jt1.m53777p(iterable, "<this>");
        jt1.m53777p(ec1, "predicate");
        return m69815r0(iterable, ec1, false);
    }

    /* renamed from: O0 */
    public static final <T> boolean m69806O0(@vr2 Collection<? super T> collection, @vr2 zt3<? extends T> zt3) {
        jt1.m53777p(collection, "<this>");
        jt1.m53777p(zt3, "elements");
        Collection<? extends T> a = C5048do.m45454a(zt3);
        return a.isEmpty() ^ true ? collection.retainAll(a) : m69811T0(collection);
    }

    /* renamed from: P0 */
    public static final <T> boolean m69807P0(@vr2 Collection<? super T> collection, @vr2 Iterable<? extends T> iterable) {
        jt1.m53777p(collection, "<this>");
        jt1.m53777p(iterable, "elements");
        return lj4.m55687a(collection).retainAll(C5048do.m45457d(iterable, collection));
    }

    @xq1
    /* renamed from: Q0 */
    public static final <T> boolean m69808Q0(Collection<? extends T> collection, Collection<? extends T> collection2) {
        jt1.m53777p(collection, "<this>");
        jt1.m53777p(collection2, "elements");
        return lj4.m55687a(collection).retainAll(collection2);
    }

    /* renamed from: R0 */
    public static final <T> boolean m69809R0(@vr2 Collection<? super T> collection, @vr2 T[] tArr) {
        jt1.m53777p(collection, "<this>");
        jt1.m53777p(tArr, "elements");
        return (tArr.length == 0) ^ true ? collection.retainAll(C5048do.m45456c(tArr)) : m69811T0(collection);
    }

    /* renamed from: S0 */
    public static final <T> boolean m69810S0(@vr2 List<T> list, @vr2 ec1<? super T, Boolean> ec1) {
        jt1.m53777p(list, "<this>");
        jt1.m53777p(ec1, "predicate");
        return m69816s0(list, ec1, false);
    }

    /* renamed from: T0 */
    public static final boolean m69811T0(Collection<?> collection) {
        boolean z = !collection.isEmpty();
        collection.clear();
        return z;
    }

    /* renamed from: o0 */
    public static final <T> boolean m69812o0(@vr2 Collection<? super T> collection, @vr2 zt3<? extends T> zt3) {
        jt1.m53777p(collection, "<this>");
        jt1.m53777p(zt3, "elements");
        boolean z = false;
        for (Object add : zt3) {
            if (collection.add(add)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: p0 */
    public static final <T> boolean m69813p0(@vr2 Collection<? super T> collection, @vr2 Iterable<? extends T> iterable) {
        jt1.m53777p(collection, "<this>");
        jt1.m53777p(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        for (Object add : iterable) {
            if (collection.add(add)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: q0 */
    public static final <T> boolean m69814q0(@vr2 Collection<? super T> collection, @vr2 T[] tArr) {
        jt1.m53777p(collection, "<this>");
        jt1.m53777p(tArr, "elements");
        return collection.addAll(C7458za.m72983t(tArr));
    }

    /* renamed from: r0 */
    public static final <T> boolean m69815r0(Iterable<? extends T> iterable, ec1<? super T, Boolean> ec1, boolean z) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (ec1.mo17094X(it.next()).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    /* renamed from: s0 */
    public static final <T> boolean m69816s0(List<T> list, ec1<? super T, Boolean> ec1, boolean z) {
        if (!(list instanceof RandomAccess)) {
            jt1.m53775n(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return m69815r0(lj4.m55689c(list), ec1, z);
        }
        ds1 o = new is1(0, s00.m64039H(list)).iterator();
        int i = 0;
        while (o.hasNext()) {
            int b = o.mo19249b();
            T t = list.get(b);
            if (ec1.mo17094X(t).booleanValue() != z) {
                if (i != b) {
                    list.set(i, t);
                }
                i++;
            }
        }
        if (i >= list.size()) {
            return false;
        }
        int H = s00.m64039H(list);
        if (i > H) {
            return true;
        }
        while (true) {
            list.remove(H);
            if (H == i) {
                return true;
            }
            H--;
        }
    }

    @xq1
    /* renamed from: t0 */
    public static final <T> void m69817t0(Collection<? super T> collection, zt3<? extends T> zt3) {
        jt1.m53777p(collection, "<this>");
        jt1.m53777p(zt3, "elements");
        m69796E0(collection, zt3);
    }

    @xq1
    /* renamed from: u0 */
    public static final <T> void m69818u0(Collection<? super T> collection, Iterable<? extends T> iterable) {
        jt1.m53777p(collection, "<this>");
        jt1.m53777p(iterable, "elements");
        m69797F0(collection, iterable);
    }

    @xq1
    /* renamed from: v0 */
    public static final <T> void m69819v0(Collection<? super T> collection, T t) {
        jt1.m53777p(collection, "<this>");
        collection.remove(t);
    }

    @xq1
    /* renamed from: w0 */
    public static final <T> void m69820w0(Collection<? super T> collection, T[] tArr) {
        jt1.m53777p(collection, "<this>");
        jt1.m53777p(tArr, "elements");
        m69799H0(collection, tArr);
    }

    @xq1
    /* renamed from: x0 */
    public static final <T> void m69821x0(Collection<? super T> collection, zt3<? extends T> zt3) {
        jt1.m53777p(collection, "<this>");
        jt1.m53777p(zt3, "elements");
        m69812o0(collection, zt3);
    }

    @xq1
    /* renamed from: y0 */
    public static final <T> void m69822y0(Collection<? super T> collection, Iterable<? extends T> iterable) {
        jt1.m53777p(collection, "<this>");
        jt1.m53777p(iterable, "elements");
        m69813p0(collection, iterable);
    }

    @xq1
    /* renamed from: z0 */
    public static final <T> void m69823z0(Collection<? super T> collection, T t) {
        jt1.m53777p(collection, "<this>");
        collection.add(t);
    }
}
