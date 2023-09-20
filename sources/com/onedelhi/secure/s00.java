package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0001\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a'\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000\u001a-\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000H\b\u001a\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000H\b\u001a\u001f\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00028\u00000\rj\b\u0012\u0004\u0012\u00028\u0000`\u000e\"\u0004\b\u0000\u0010\u0000H\b\u001a-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000¢\u0006\u0004\b\u0010\u0010\t\u001a7\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00028\u00000\rj\b\u0012\u0004\u0012\u00028\u0000`\u000e\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0000*\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a5\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0000*\u00020\u00132\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0001\"\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0017\u0010\t\u001aC\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0019\u001a\u00020\u00182!\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00028\u00000\u001aH\bø\u0001\u0000\u001aC\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0019\u001a\u00020\u00182!\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00028\u00000\u001aH\bø\u0001\u0000\u001aF\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010!2\u001f\b\u0001\u0010$\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0004\u0012\u00020\"0\u001a¢\u0006\u0002\b#H\bø\u0001\u0000\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001aN\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010!2\u0006\u0010&\u001a\u00020\u00182\u001f\b\u0001\u0010$\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0004\u0012\u00020\"0\u001a¢\u0006\u0002\b#H\bø\u0001\u0000\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u001a\u0019\u0010)\u001a\u00020(\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\b\u001a,\u0010*\u001a\u00020(\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002H\b\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a!\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002H\b\u001a!\u0010\u0000\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005H\b\u001a=\u0010/\u001a\u00028\u0001\"\u0010\b\u0000\u0010'*\u0006\u0012\u0002\b\u00030\u0002*\u00028\u0001\"\u0004\b\u0001\u0010,*\u00028\u00002\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00010-H\bø\u0001\u0000¢\u0006\u0004\b/\u00100\u001a,\u0010!\u001a\u00020(\"\t\b\u0000\u0010\u0000¢\u0006\u0002\b1*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\b\u001a&\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u0000022\u0006\u00104\u001a\u000203H\u0007\u001a\u001e\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0000\u001aG\u00109\u001a\u00020\u0018\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u000006*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00052\b\u0010\u0014\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u00107\u001a\u00020\u00182\b\b\u0002\u00108\u001a\u00020\u0018¢\u0006\u0004\b9\u0010:\u001aU\u0010>\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0014\u001a\u00028\u00002\u001a\u0010=\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000;j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`<2\b\b\u0002\u00107\u001a\u00020\u00182\b\b\u0002\u00108\u001a\u00020\u0018¢\u0006\u0004\b>\u0010?\u001ai\u0010B\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010**\b\u0012\u0004\u0012\u00028\u000106*\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0010@\u001a\u0004\u0018\u00018\u00012\b\b\u0002\u00107\u001a\u00020\u00182\b\b\u0002\u00108\u001a\u00020\u00182\u0016\b\u0004\u0010A\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u001aH\bø\u0001\u0000¢\u0006\u0004\bB\u0010C\u001a>\u0010E\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00052\b\b\u0002\u00107\u001a\u00020\u00182\b\b\u0002\u00108\u001a\u00020\u00182\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00180\u001a\u001a'\u0010F\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u00107\u001a\u00020\u00182\u0006\u00108\u001a\u00020\u0018H\u0002¢\u0006\u0004\bF\u0010G\u001a\b\u0010H\u001a\u00020\"H\u0001\u001a\b\u0010I\u001a\u00020\"H\u0001\"\u0019\u0010M\u001a\u00020J*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\bK\u0010L\"!\u0010P\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00058F¢\u0006\u0006\u001a\u0004\bN\u0010O\u0002\u0007\n\u0005\b20\u0001¨\u0006Q"}, d2 = {"T", "", "", "t", "([Ljava/lang/Object;)Ljava/util/Collection;", "", "F", "elements", "M", "([Ljava/lang/Object;)Ljava/util/List;", "L", "", "P", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "r", "Q", "s", "([Ljava/lang/Object;)Ljava/util/ArrayList;", "", "element", "N", "(Ljava/lang/Object;)Ljava/util/List;", "O", "", "size", "Lkotlin/Function1;", "Lcom/onedelhi/secure/iy2;", "name", "index", "init", "p", "q", "E", "Lcom/onedelhi/secure/un4;", "Lcom/onedelhi/secure/wy0;", "builderAction", "D", "capacity", "C", "", "J", "K", "S", "R", "Lkotlin/Function0;", "defaultValue", "I", "(Ljava/util/Collection;Lcom/onedelhi/secure/cc1;)Ljava/lang/Object;", "Lcom/onedelhi/secure/vv2;", "", "Lcom/onedelhi/secure/me3;", "random", "V", "", "fromIndex", "toIndex", "v", "(Ljava/util/List;Ljava/lang/Comparable;II)I", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "w", "(Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;II)I", "key", "selector", "A", "(Ljava/util/List;Ljava/lang/Comparable;IILcom/onedelhi/secure/ec1;)I", "comparison", "u", "U", "(III)V", "X", "W", "Lcom/onedelhi/secure/is1;", "G", "(Ljava/util/Collection;)Lcom/onedelhi/secure/is1;", "indices", "H", "(Ljava/util/List;)I", "lastIndex", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/collections/CollectionsKt")
public class s00 extends r00 {

    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00010\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "K", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Integer;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.s00$a */
    public static final class C6727a extends d12 implements ec1<T, Integer> {

        /* renamed from: a */
        public final /* synthetic */ ec1<T, K> f34816a;

        /* renamed from: a */
        public final /* synthetic */ K f34817a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6727a(ec1<? super T, ? extends K> ec1, K k) {
            super(1);
            this.f34816a = ec1;
            this.f34817a = k;
        }

        @vr2
        /* renamed from: a */
        public final Integer mo17094X(T t) {
            return Integer.valueOf(z10.m72495g((Comparable) this.f34816a.mo17094X(t), this.f34817a));
        }
    }

    /* renamed from: A */
    public static final <T, K extends Comparable<? super K>> int m64032A(@vr2 List<? extends T> list, @ss2 K k, int i, int i2, @vr2 ec1<? super T, ? extends K> ec1) {
        jt1.m53777p(list, "<this>");
        jt1.m53777p(ec1, "selector");
        return m64061u(list, i, i2, new C6727a(ec1, k));
    }

    /* renamed from: B */
    public static /* synthetic */ int m64033B(List list, Comparable comparable, int i, int i2, ec1 ec1, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        return m64061u(list, i, i2, new C6727a(ec1, comparable));
    }

    @gz3(version = "1.6")
    @tw4(markerClass = {ly0.class})
    @xq1
    /* renamed from: C */
    public static final <E> List<E> m64034C(int i, @C7381yp ec1<? super List<E>, un4> ec1) {
        jt1.m53777p(ec1, "builderAction");
        List k = r00.m63299k(i);
        ec1.mo17094X(k);
        return r00.m63290b(k);
    }

    @gz3(version = "1.6")
    @tw4(markerClass = {ly0.class})
    @xq1
    /* renamed from: D */
    public static final <E> List<E> m64035D(@C7381yp ec1<? super List<E>, un4> ec1) {
        jt1.m53777p(ec1, "builderAction");
        List j = r00.m63298j();
        ec1.mo17094X(j);
        return r00.m63290b(j);
    }

    @xq1
    /* renamed from: E */
    public static final <T> boolean m64036E(Collection<? extends T> collection, Collection<? extends T> collection2) {
        jt1.m53777p(collection, "<this>");
        jt1.m53777p(collection2, "elements");
        return collection.containsAll(collection2);
    }

    @vr2
    /* renamed from: F */
    public static final <T> List<T> m64037F() {
        return jt0.f30929a;
    }

    @vr2
    /* renamed from: G */
    public static final is1 m64038G(@vr2 Collection<?> collection) {
        jt1.m53777p(collection, "<this>");
        return new is1(0, collection.size() - 1);
    }

    /* renamed from: H */
    public static final <T> int m64039H(@vr2 List<? extends T> list) {
        jt1.m53777p(list, "<this>");
        return list.size() - 1;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [R, C, java.util.Collection] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.onedelhi.secure.gz3(version = "1.3")
    @com.onedelhi.secure.xq1
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <C extends java.util.Collection<?> & R, R> R m64040I(C r1, com.onedelhi.secure.cc1<? extends R> r2) {
        /*
            java.lang.String r0 = "defaultValue"
            com.onedelhi.secure.jt1.m53777p(r2, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x000f
            java.lang.Object r1 = r2.invoke()
        L_0x000f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.s00.m64040I(java.util.Collection, com.onedelhi.secure.cc1):java.lang.Object");
    }

    @xq1
    /* renamed from: J */
    public static final <T> boolean m64041J(Collection<? extends T> collection) {
        jt1.m53777p(collection, "<this>");
        return !collection.isEmpty();
    }

    @gz3(version = "1.3")
    @xq1
    /* renamed from: K */
    public static final <T> boolean m64042K(Collection<? extends T> collection) {
        return collection == null || collection.isEmpty();
    }

    @xq1
    /* renamed from: L */
    public static final <T> List<T> m64043L() {
        return m64037F();
    }

    @vr2
    /* renamed from: M */
    public static final <T> List<T> m64044M(@vr2 T... tArr) {
        jt1.m53777p(tArr, "elements");
        return tArr.length > 0 ? C7458za.m72983t(tArr) : m64037F();
    }

    @vr2
    /* renamed from: N */
    public static final <T> List<T> m64045N(@ss2 T t) {
        return t != null ? r00.m63300l(t) : m64037F();
    }

    @vr2
    /* renamed from: O */
    public static final <T> List<T> m64046O(@vr2 T... tArr) {
        jt1.m53777p(tArr, "elements");
        return C4478ab.m37584ub(tArr);
    }

    @gz3(version = "1.1")
    @xq1
    /* renamed from: P */
    public static final <T> List<T> m64047P() {
        return new ArrayList();
    }

    @vr2
    /* renamed from: Q */
    public static final <T> List<T> m64048Q(@vr2 T... tArr) {
        jt1.m53777p(tArr, "elements");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new C7149w9(tArr, true));
    }

    @vr2
    /* renamed from: R */
    public static final <T> List<T> m64049R(@vr2 List<? extends T> list) {
        jt1.m53777p(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : r00.m63300l(list.get(0)) : m64037F();
    }

    @xq1
    /* renamed from: S */
    public static final <T> Collection<T> m64050S(Collection<? extends T> collection) {
        return collection == null ? m64037F() : collection;
    }

    @xq1
    /* renamed from: T */
    public static final <T> List<T> m64051T(List<? extends T> list) {
        return list == null ? m64037F() : list;
    }

    /* renamed from: U */
    public static final void m64052U(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException("fromIndex (" + i2 + ") is greater than toIndex (" + i3 + ").");
        } else if (i2 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i2 + ") is less than zero.");
        } else if (i3 > i) {
            throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is greater than size (" + i + ").");
        }
    }

    @gz3(version = "1.3")
    @vr2
    /* renamed from: V */
    public static final <T> List<T> m64053V(@vr2 Iterable<? extends T> iterable, @vr2 me3 me3) {
        jt1.m53777p(iterable, "<this>");
        jt1.m53777p(me3, "random");
        List<T> S5 = a10.m35779S5(iterable);
        a10.m35813Z4(S5, me3);
        return S5;
    }

    @gz3(version = "1.3")
    @z73
    /* renamed from: W */
    public static final void m64054W() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    @gz3(version = "1.3")
    @z73
    /* renamed from: X */
    public static final void m64055X() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    @gz3(version = "1.1")
    @xq1
    /* renamed from: p */
    public static final <T> List<T> m64056p(int i, ec1<? super Integer, ? extends T> ec1) {
        jt1.m53777p(ec1, "init");
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(ec1.mo17094X(Integer.valueOf(i2)));
        }
        return arrayList;
    }

    @gz3(version = "1.1")
    @xq1
    /* renamed from: q */
    public static final <T> List<T> m64057q(int i, ec1<? super Integer, ? extends T> ec1) {
        jt1.m53777p(ec1, "init");
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(ec1.mo17094X(Integer.valueOf(i2)));
        }
        return arrayList;
    }

    @gz3(version = "1.1")
    @xq1
    /* renamed from: r */
    public static final <T> ArrayList<T> m64058r() {
        return new ArrayList<>();
    }

    @vr2
    /* renamed from: s */
    public static final <T> ArrayList<T> m64059s(@vr2 T... tArr) {
        jt1.m53777p(tArr, "elements");
        return tArr.length == 0 ? new ArrayList<>() : new ArrayList<>(new C7149w9(tArr, true));
    }

    @vr2
    /* renamed from: t */
    public static final <T> Collection<T> m64060t(@vr2 T[] tArr) {
        jt1.m53777p(tArr, "<this>");
        return new C7149w9(tArr, false);
    }

    /* renamed from: u */
    public static final <T> int m64061u(@vr2 List<? extends T> list, int i, int i2, @vr2 ec1<? super T, Integer> ec1) {
        jt1.m53777p(list, "<this>");
        jt1.m53777p(ec1, "comparison");
        m64052U(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int intValue = ec1.mo17094X(list.get(i4)).intValue();
            if (intValue < 0) {
                i = i4 + 1;
            } else if (intValue <= 0) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: v */
    public static final <T extends Comparable<? super T>> int m64062v(@vr2 List<? extends T> list, @ss2 T t, int i, int i2) {
        jt1.m53777p(list, "<this>");
        m64052U(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int g = z10.m72495g((Comparable) list.get(i4), t);
            if (g < 0) {
                i = i4 + 1;
            } else if (g <= 0) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: w */
    public static final <T> int m64063w(@vr2 List<? extends T> list, T t, @vr2 Comparator<? super T> comparator, int i, int i2) {
        jt1.m53777p(list, "<this>");
        jt1.m53777p(comparator, "comparator");
        m64052U(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int compare = comparator.compare(list.get(i4), t);
            if (compare < 0) {
                i = i4 + 1;
            } else if (compare <= 0) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: x */
    public static /* synthetic */ int m64064x(List list, int i, int i2, ec1 ec1, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = list.size();
        }
        return m64061u(list, i, i2, ec1);
    }

    /* renamed from: y */
    public static /* synthetic */ int m64065y(List list, Comparable comparable, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        return m64062v(list, comparable, i, i2);
    }

    /* renamed from: z */
    public static /* synthetic */ int m64066z(List list, Object obj, Comparator comparator, int i, int i2, int i3, Object obj2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = list.size();
        }
        return m64063w(list, obj, comparator, i, i2);
    }
}
