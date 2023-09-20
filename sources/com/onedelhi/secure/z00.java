package com.onedelhi.secure;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000b\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u001f\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u0006\u0012\u0002\b\u00030\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u001aC\u0010\t\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0007*\n\u0012\u0006\b\u0000\u0012\u00028\u00010\u0006\"\u0004\b\u0001\u0010\u0000*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\b\u001a\u00028\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0016\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\f\u001a&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u000e\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u000f*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a8\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010\u0014\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0012j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0013\u001a\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u0016*\b\u0012\u0004\u0012\u00020\u00160\u0001H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u0019*\b\u0012\u0004\u0012\u00020\u00190\u0001H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a+\u0010\u001c\u001a\u0004\u0018\u00018\u0000\"\u000e\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u000f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001aI\u0010 \u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000b\"\u000e\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00010\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001eH\bø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a=\u0010\"\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010\u0014\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0012j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0013H\u0007¢\u0006\u0004\b\"\u0010#\u001a\u001b\u0010$\u001a\u0004\u0018\u00010\u0016*\b\u0012\u0004\u0012\u00020\u00160\u0001H\u0007¢\u0006\u0004\b$\u0010\u0018\u001a\u001b\u0010%\u001a\u0004\u0018\u00010\u0019*\b\u0012\u0004\u0012\u00020\u00190\u0001H\u0007¢\u0006\u0004\b%\u0010\u001b\u001a+\u0010&\u001a\u0004\u0018\u00018\u0000\"\u000e\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u000f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b&\u0010\u001d\u001aI\u0010'\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000b\"\u000e\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00010\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001eH\bø\u0001\u0000¢\u0006\u0004\b'\u0010!\u001a=\u0010(\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010\u0014\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0012j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0013H\u0007¢\u0006\u0004\b(\u0010#\u001a7\u0010*\u001a\u00020)\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020)0\u001eH\bø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a7\u0010-\u001a\u00020,\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020,0\u001eH\bø\u0001\u0000¢\u0006\u0004\b-\u0010.\u0002\u0007\n\u0005\b20\u0001¨\u0006/"}, d2 = {"R", "", "Ljava/lang/Class;", "klass", "", "a1", "", "C", "destination", "b1", "(Ljava/lang/Iterable;Ljava/util/Collection;Ljava/lang/Class;)Ljava/util/Collection;", "T", "", "Lcom/onedelhi/secure/un4;", "m1", "", "Ljava/util/SortedSet;", "p1", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "q1", "", "d1", "(Ljava/lang/Iterable;)Ljava/lang/Double;", "", "e1", "(Ljava/lang/Iterable;)Ljava/lang/Float;", "c1", "(Ljava/lang/Iterable;)Ljava/lang/Comparable;", "Lkotlin/Function1;", "selector", "f1", "(Ljava/lang/Iterable;Lcom/onedelhi/secure/ec1;)Ljava/lang/Object;", "g1", "(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/lang/Object;", "i1", "j1", "h1", "k1", "l1", "Ljava/math/BigDecimal;", "n1", "(Ljava/lang/Iterable;Lcom/onedelhi/secure/ec1;)Ljava/math/BigDecimal;", "Ljava/math/BigInteger;", "o1", "(Ljava/lang/Iterable;Lcom/onedelhi/secure/ec1;)Ljava/math/BigInteger;", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/collections/CollectionsKt")
public class z00 extends y00 {
    @vr2
    /* renamed from: a1 */
    public static final <R> List<R> m72456a1(@vr2 Iterable<?> iterable, @vr2 Class<R> cls) {
        jt1.m53777p(iterable, "<this>");
        jt1.m53777p(cls, "klass");
        return (List) m72457b1(iterable, new ArrayList(), cls);
    }

    @vr2
    /* renamed from: b1 */
    public static final <C extends Collection<? super R>, R> C m72457b1(@vr2 Iterable<?> iterable, @vr2 C c, @vr2 Class<R> cls) {
        jt1.m53777p(iterable, "<this>");
        jt1.m53777p(c, FirebaseAnalytics.C4305d.f24996z);
        jt1.m53777p(cls, "klass");
        for (Object next : iterable) {
            if (cls.isInstance(next)) {
                c.add(next);
            }
        }
        return c;
    }

    @zj0(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @xj0(message = "Use maxByOrNull instead.", replaceWith = @oi3(expression = "this.maxByOrNull(selector)", imports = {}))
    /* renamed from: f1 */
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T m72461f1(Iterable<? extends T> iterable, ec1<? super T, ? extends R> ec1) {
        jt1.m53777p(iterable, "<this>");
        jt1.m53777p(ec1, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            Comparable comparable = (Comparable) ec1.mo17094X(next);
            do {
                T next2 = it.next();
                Comparable comparable2 = (Comparable) ec1.mo17094X(next2);
                if (comparable.compareTo(comparable2) < 0) {
                    next = next2;
                    comparable = comparable2;
                }
            } while (it.hasNext());
        }
        return next;
    }

    @zj0(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @xj0(message = "Use maxWithOrNull instead.", replaceWith = @oi3(expression = "this.maxWithOrNull(comparator)", imports = {}))
    /* renamed from: g1 */
    public static final /* synthetic */ Object m72462g1(Iterable iterable, Comparator comparator) {
        jt1.m53777p(iterable, "<this>");
        jt1.m53777p(comparator, "comparator");
        return a10.m35767Q3(iterable, comparator);
    }

    @zj0(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @xj0(message = "Use minByOrNull instead.", replaceWith = @oi3(expression = "this.minByOrNull(selector)", imports = {}))
    /* renamed from: k1 */
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T m72466k1(Iterable<? extends T> iterable, ec1<? super T, ? extends R> ec1) {
        jt1.m53777p(iterable, "<this>");
        jt1.m53777p(ec1, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            Comparable comparable = (Comparable) ec1.mo17094X(next);
            do {
                T next2 = it.next();
                Comparable comparable2 = (Comparable) ec1.mo17094X(next2);
                if (comparable.compareTo(comparable2) > 0) {
                    next = next2;
                    comparable = comparable2;
                }
            } while (it.hasNext());
        }
        return next;
    }

    @zj0(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @xj0(message = "Use minWithOrNull instead.", replaceWith = @oi3(expression = "this.minWithOrNull(comparator)", imports = {}))
    /* renamed from: l1 */
    public static final /* synthetic */ Object m72467l1(Iterable iterable, Comparator comparator) {
        jt1.m53777p(iterable, "<this>");
        jt1.m53777p(comparator, "comparator");
        return a10.m35857i4(iterable, comparator);
    }

    /* renamed from: m1 */
    public static final <T> void m72468m1(@vr2 List<T> list) {
        jt1.m53777p(list, "<this>");
        Collections.reverse(list);
    }

    @uw1(name = "sumOfBigDecimal")
    @fx2
    @gz3(version = "1.4")
    @xq1
    /* renamed from: n1 */
    public static final <T> BigDecimal m72469n1(Iterable<? extends T> iterable, ec1<? super T, ? extends BigDecimal> ec1) {
        jt1.m53777p(iterable, "<this>");
        jt1.m53777p(ec1, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0);
        jt1.m53776o(valueOf, "valueOf(this.toLong())");
        for (Object X : iterable) {
            valueOf = valueOf.add((BigDecimal) ec1.mo17094X(X));
            jt1.m53776o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @uw1(name = "sumOfBigInteger")
    @fx2
    @gz3(version = "1.4")
    @xq1
    /* renamed from: o1 */
    public static final <T> BigInteger m72470o1(Iterable<? extends T> iterable, ec1<? super T, ? extends BigInteger> ec1) {
        jt1.m53777p(iterable, "<this>");
        jt1.m53777p(ec1, "selector");
        BigInteger valueOf = BigInteger.valueOf(0);
        jt1.m53776o(valueOf, "valueOf(this.toLong())");
        for (Object X : iterable) {
            valueOf = valueOf.add((BigInteger) ec1.mo17094X(X));
            jt1.m53776o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @vr2
    /* renamed from: p1 */
    public static final <T extends Comparable<? super T>> SortedSet<T> m72471p1(@vr2 Iterable<? extends T> iterable) {
        jt1.m53777p(iterable, "<this>");
        return (SortedSet) a10.m35744L5(iterable, new TreeSet());
    }

    @vr2
    /* renamed from: q1 */
    public static final <T> SortedSet<T> m72472q1(@vr2 Iterable<? extends T> iterable, @vr2 Comparator<? super T> comparator) {
        jt1.m53777p(iterable, "<this>");
        jt1.m53777p(comparator, "comparator");
        return (SortedSet) a10.m35744L5(iterable, new TreeSet(comparator));
    }
}
