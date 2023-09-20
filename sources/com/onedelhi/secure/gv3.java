package com.onedelhi.secure;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a7\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00052\u001d\u0010\n\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\bø\u0001\u0000\u001a?\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00052\u0006\u0010\r\u001a\u00020\f2\u001d\u0010\n\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\bø\u0001\u0000\u001a\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0005H\u0001\u001a\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00052\u0006\u0010\r\u001a\u00020\fH\u0001\u001a\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0001\u001a-\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0013\"\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001aI\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u00002\u001a\u0010\u001a\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0018j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u00192\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0013\"\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u0002\u0007\n\u0005\b20\u0001¨\u0006\u001d"}, d2 = {"T", "element", "", "f", "(Ljava/lang/Object;)Ljava/util/Set;", "E", "Lkotlin/Function1;", "", "Lcom/onedelhi/secure/un4;", "Lcom/onedelhi/secure/wy0;", "builderAction", "c", "", "capacity", "b", "d", "e", "builder", "a", "", "elements", "Ljava/util/TreeSet;", "h", "([Ljava/lang/Object;)Ljava/util/TreeSet;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "g", "(Ljava/util/Comparator;[Ljava/lang/Object;)Ljava/util/TreeSet;", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/collections/SetsKt")
public class gv3 {
    @vr2
    @z73
    @gz3(version = "1.3")
    /* renamed from: a */
    public static final <E> Set<E> m49890a(@vr2 Set<E> set) {
        jt1.m53777p(set, "builder");
        return ((bv3) set).mo32172f();
    }

    @z73
    @gz3(version = "1.3")
    @xq1
    /* renamed from: b */
    public static final <E> Set<E> m49891b(int i, ec1<? super Set<E>, un4> ec1) {
        jt1.m53777p(ec1, "builderAction");
        Set e = m49894e(i);
        ec1.mo17094X(e);
        return m49890a(e);
    }

    @z73
    @gz3(version = "1.3")
    @xq1
    /* renamed from: c */
    public static final <E> Set<E> m49892c(ec1<? super Set<E>, un4> ec1) {
        jt1.m53777p(ec1, "builderAction");
        Set d = m49893d();
        ec1.mo17094X(d);
        return m49890a(d);
    }

    @vr2
    @z73
    @gz3(version = "1.3")
    /* renamed from: d */
    public static final <E> Set<E> m49893d() {
        return new bv3();
    }

    @vr2
    @z73
    @gz3(version = "1.3")
    /* renamed from: e */
    public static final <E> Set<E> m49894e(int i) {
        return new bv3(i);
    }

    @vr2
    /* renamed from: f */
    public static final <T> Set<T> m49895f(T t) {
        Set<T> singleton = Collections.singleton(t);
        jt1.m53776o(singleton, "singleton(element)");
        return singleton;
    }

    @vr2
    /* renamed from: g */
    public static final <T> TreeSet<T> m49896g(@vr2 Comparator<? super T> comparator, @vr2 T... tArr) {
        jt1.m53777p(comparator, "comparator");
        jt1.m53777p(tArr, "elements");
        return (TreeSet) C4478ab.m36566Ny(tArr, new TreeSet(comparator));
    }

    @vr2
    /* renamed from: h */
    public static final <T> TreeSet<T> m49897h(@vr2 T... tArr) {
        jt1.m53777p(tArr, "elements");
        return (TreeSet) C4478ab.m36566Ny(tArr, new TreeSet());
    }
}
