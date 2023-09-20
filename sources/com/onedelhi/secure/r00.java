package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a7\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00052\u001d\u0010\n\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\bø\u0001\u0000\u001a?\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00052\u0006\u0010\r\u001a\u00020\f2\u001d\u0010\n\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\bø\u0001\u0000\u001a\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0005H\u0001\u001a\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00052\u0006\u0010\r\u001a\u00020\fH\u0001\u001a\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0001\u001a\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0013H\b\u001a\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0007\u001a&\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0007\u001a$\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c2\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001aH\b¢\u0006\u0004\b\u001e\u0010\u001f\u001a6\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c\"\u0004\b\u0000\u0010\u00002\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001a2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\b¢\u0006\u0004\b!\u0010\"\u001a3\u0010%\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001d0\u001c\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001c2\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b%\u0010&\u001a\u0011\u0010(\u001a\u00020\f2\u0006\u0010'\u001a\u00020\fH\b\u001a\u0011\u0010*\u001a\u00020\f2\u0006\u0010)\u001a\u00020\fH\b\u001a\t\u0010+\u001a\u00020#H\b\u0002\u0007\n\u0005\b20\u0001¨\u0006,"}, d2 = {"T", "element", "", "l", "(Ljava/lang/Object;)Ljava/util/List;", "E", "Lkotlin/Function1;", "", "Lcom/onedelhi/secure/un4;", "Lcom/onedelhi/secure/wy0;", "builderAction", "d", "", "capacity", "c", "j", "k", "builder", "b", "Ljava/util/Enumeration;", "o", "", "m", "Ljava/util/Random;", "random", "n", "", "collection", "", "", "g", "(Ljava/util/Collection;)[Ljava/lang/Object;", "array", "h", "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;", "", "isVarargs", "i", "([Ljava/lang/Object;Z)[Ljava/lang/Object;", "index", "f", "count", "e", "a", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/collections/CollectionsKt")
public class r00 {
    /* renamed from: a */
    public static final boolean m63289a() {
        return n00.f32333a;
    }

    @vr2
    @z73
    @gz3(version = "1.3")
    /* renamed from: b */
    public static final <E> List<E> m63290b(@vr2 List<E> list) {
        jt1.m53777p(list, "builder");
        return ((x32) list).mo47003o();
    }

    @z73
    @gz3(version = "1.3")
    @xq1
    /* renamed from: c */
    public static final <E> List<E> m63291c(int i, ec1<? super List<E>, un4> ec1) {
        jt1.m53777p(ec1, "builderAction");
        List k = m63299k(i);
        ec1.mo17094X(k);
        return m63290b(k);
    }

    @z73
    @gz3(version = "1.3")
    @xq1
    /* renamed from: d */
    public static final <E> List<E> m63292d(ec1<? super List<E>, un4> ec1) {
        jt1.m53777p(ec1, "builderAction");
        List j = m63298j();
        ec1.mo17094X(j);
        return m63290b(j);
    }

    @gz3(version = "1.3")
    @xq1
    @z73
    /* renamed from: e */
    public static final int m63293e(int i) {
        if (i < 0) {
            if (o23.m58898a(1, 3, 0)) {
                s00.m64054W();
            } else {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        return i;
    }

    @gz3(version = "1.3")
    @xq1
    @z73
    /* renamed from: f */
    public static final int m63294f(int i) {
        if (i < 0) {
            if (o23.m58898a(1, 3, 0)) {
                s00.m64055X();
            } else {
                throw new ArithmeticException("Index overflow has happened.");
            }
        }
        return i;
    }

    @xq1
    /* renamed from: g */
    public static final Object[] m63295g(Collection<?> collection) {
        jt1.m53777p(collection, "collection");
        return o00.m58878a(collection);
    }

    @xq1
    /* renamed from: h */
    public static final <T> T[] m63296h(Collection<?> collection, T[] tArr) {
        jt1.m53777p(collection, "collection");
        jt1.m53777p(tArr, "array");
        T[] b = o00.m58879b(collection, tArr);
        jt1.m53775n(b, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.CollectionsKt__CollectionsJVMKt.copyToArrayImpl>");
        return b;
    }

    @vr2
    /* renamed from: i */
    public static final <T> Object[] m63297i(@vr2 T[] tArr, boolean z) {
        Class<Object[]> cls = Object[].class;
        jt1.m53777p(tArr, "<this>");
        if (z && jt1.m53768g(tArr.getClass(), cls)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, cls);
        jt1.m53776o(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    @vr2
    @z73
    @gz3(version = "1.3")
    /* renamed from: j */
    public static final <E> List<E> m63298j() {
        return new x32();
    }

    @vr2
    @z73
    @gz3(version = "1.3")
    /* renamed from: k */
    public static final <E> List<E> m63299k(int i) {
        return new x32(i);
    }

    @vr2
    /* renamed from: l */
    public static final <T> List<T> m63300l(T t) {
        List<T> singletonList = Collections.singletonList(t);
        jt1.m53776o(singletonList, "singletonList(element)");
        return singletonList;
    }

    @gz3(version = "1.2")
    @vr2
    /* renamed from: m */
    public static final <T> List<T> m63301m(@vr2 Iterable<? extends T> iterable) {
        jt1.m53777p(iterable, "<this>");
        List<T> S5 = a10.m35779S5(iterable);
        Collections.shuffle(S5);
        return S5;
    }

    @gz3(version = "1.2")
    @vr2
    /* renamed from: n */
    public static final <T> List<T> m63302n(@vr2 Iterable<? extends T> iterable, @vr2 Random random) {
        jt1.m53777p(iterable, "<this>");
        jt1.m53777p(random, "random");
        List<T> S5 = a10.m35779S5(iterable);
        Collections.shuffle(S5, random);
        return S5;
    }

    @xq1
    /* renamed from: o */
    public static final <T> List<T> m63303o(Enumeration<T> enumeration) {
        jt1.m53777p(enumeration, "<this>");
        ArrayList<T> list = Collections.list(enumeration);
        jt1.m53776o(list, "list(this)");
        return list;
    }
}
