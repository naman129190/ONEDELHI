package com.onedelhi.secure;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\u0006\u0012\u0002\b\u00030\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u001aC\u0010\b\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0006*\n\u0012\u0006\b\u0000\u0012\u00028\u00010\u0005\"\u0004\b\u0001\u0010\u0000*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0007\u001a\u00028\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b\b\u0010\t\u001a&\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u000e\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\n*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a8\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010\u0010\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u000ej\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u000f\u001a\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u0012*\b\u0012\u0004\u0012\u00020\u00120\u0001H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\b\u0012\u0004\u0012\u00020\u00150\u0001H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a+\u0010\u0018\u001a\u0004\u0018\u00018\u0000\"\u000e\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\n*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001aI\u0010\u001c\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000b\"\u000e\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00010\n*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001aH\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a=\u0010\u001e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010\u0010\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u000ej\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u000fH\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u0012*\b\u0012\u0004\u0012\u00020\u00120\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0014\u001a\u001b\u0010 \u001a\u0004\u0018\u00010\u0015*\b\u0012\u0004\u0012\u00020\u00150\u0001H\u0007¢\u0006\u0004\b \u0010\u0017\u001a+\u0010!\u001a\u0004\u0018\u00018\u0000\"\u000e\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\n*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b!\u0010\u0019\u001aI\u0010\"\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000b\"\u000e\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00010\n*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001aH\bø\u0001\u0000¢\u0006\u0004\b\"\u0010\u001d\u001a=\u0010#\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010\u0010\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u000ej\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u000fH\u0007¢\u0006\u0004\b#\u0010\u001f\u001a7\u0010%\u001a\u00020$\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020$0\u001aH\bø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a7\u0010(\u001a\u00020'\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020'0\u001aH\bø\u0001\u0000¢\u0006\u0004\b(\u0010)\u0002\u0007\n\u0005\b20\u0001¨\u0006*"}, d2 = {"R", "Lcom/onedelhi/secure/zt3;", "Ljava/lang/Class;", "klass", "u", "", "C", "destination", "v", "(Lcom/onedelhi/secure/zt3;Ljava/util/Collection;Ljava/lang/Class;)Ljava/util/Collection;", "", "T", "Ljava/util/SortedSet;", "I", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "J", "", "x", "(Lcom/onedelhi/secure/zt3;)Ljava/lang/Double;", "", "y", "(Lcom/onedelhi/secure/zt3;)Ljava/lang/Float;", "w", "(Lcom/onedelhi/secure/zt3;)Ljava/lang/Comparable;", "Lkotlin/Function1;", "selector", "z", "(Lcom/onedelhi/secure/zt3;Lcom/onedelhi/secure/ec1;)Ljava/lang/Object;", "A", "(Lcom/onedelhi/secure/zt3;Ljava/util/Comparator;)Ljava/lang/Object;", "D", "B", "E", "F", "Ljava/math/BigDecimal;", "G", "(Lcom/onedelhi/secure/zt3;Lcom/onedelhi/secure/ec1;)Ljava/math/BigDecimal;", "Ljava/math/BigInteger;", "H", "(Lcom/onedelhi/secure/zt3;Lcom/onedelhi/secure/ec1;)Ljava/math/BigInteger;", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/sequences/SequencesKt")
public class gu3 extends fu3 {

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.gu3$a */
    public static final class C5449a extends d12 implements ec1<Object, Boolean> {

        /* renamed from: a */
        public final /* synthetic */ Class<R> f29326a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5449a(Class<R> cls) {
            super(1);
            this.f29326a = cls;
        }

        @vr2
        /* renamed from: a */
        public final Boolean mo17094X(@ss2 Object obj) {
            return Boolean.valueOf(this.f29326a.isInstance(obj));
        }
    }

    @zj0(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @xj0(message = "Use maxWithOrNull instead.", replaceWith = @oi3(expression = "this.maxWithOrNull(comparator)", imports = {}))
    /* renamed from: A */
    public static final /* synthetic */ Object m49847A(zt3 zt3, Comparator comparator) {
        jt1.m53777p(zt3, "<this>");
        jt1.m53777p(comparator, "comparator");
        return hu3.m50931I1(zt3, comparator);
    }

    @zj0(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @xj0(message = "Use minByOrNull instead.", replaceWith = @oi3(expression = "this.minByOrNull(selector)", imports = {}))
    /* renamed from: E */
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T m49851E(zt3<? extends T> zt3, ec1<? super T, ? extends R> ec1) {
        jt1.m53777p(zt3, "<this>");
        jt1.m53777p(ec1, "selector");
        Iterator<? extends T> it = zt3.iterator();
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
    /* renamed from: F */
    public static final /* synthetic */ Object m49852F(zt3 zt3, Comparator comparator) {
        jt1.m53777p(zt3, "<this>");
        jt1.m53777p(comparator, "comparator");
        return hu3.m51002a2(zt3, comparator);
    }

    @uw1(name = "sumOfBigDecimal")
    @fx2
    @gz3(version = "1.4")
    @xq1
    /* renamed from: G */
    public static final <T> BigDecimal m49853G(zt3<? extends T> zt3, ec1<? super T, ? extends BigDecimal> ec1) {
        jt1.m53777p(zt3, "<this>");
        jt1.m53777p(ec1, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0);
        jt1.m53776o(valueOf, "valueOf(this.toLong())");
        for (Object X : zt3) {
            valueOf = valueOf.add((BigDecimal) ec1.mo17094X(X));
            jt1.m53776o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @uw1(name = "sumOfBigInteger")
    @fx2
    @gz3(version = "1.4")
    @xq1
    /* renamed from: H */
    public static final <T> BigInteger m49854H(zt3<? extends T> zt3, ec1<? super T, ? extends BigInteger> ec1) {
        jt1.m53777p(zt3, "<this>");
        jt1.m53777p(ec1, "selector");
        BigInteger valueOf = BigInteger.valueOf(0);
        jt1.m53776o(valueOf, "valueOf(this.toLong())");
        for (Object X : zt3) {
            valueOf = valueOf.add((BigInteger) ec1.mo17094X(X));
            jt1.m53776o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @vr2
    /* renamed from: I */
    public static final <T extends Comparable<? super T>> SortedSet<T> m49855I(@vr2 zt3<? extends T> zt3) {
        jt1.m53777p(zt3, "<this>");
        return (SortedSet) hu3.m51003a3(zt3, new TreeSet());
    }

    @vr2
    /* renamed from: J */
    public static final <T> SortedSet<T> m49856J(@vr2 zt3<? extends T> zt3, @vr2 Comparator<? super T> comparator) {
        jt1.m53777p(zt3, "<this>");
        jt1.m53777p(comparator, "comparator");
        return (SortedSet) hu3.m51003a3(zt3, new TreeSet(comparator));
    }

    @vr2
    /* renamed from: u */
    public static final <R> zt3<R> m49857u(@vr2 zt3<?> zt3, @vr2 Class<R> cls) {
        jt1.m53777p(zt3, "<this>");
        jt1.m53777p(cls, "klass");
        zt3<R> p0 = hu3.m51060p0(zt3, new C5449a(cls));
        jt1.m53775n(p0, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesJvmKt.filterIsInstance>");
        return p0;
    }

    @vr2
    /* renamed from: v */
    public static final <C extends Collection<? super R>, R> C m49858v(@vr2 zt3<?> zt3, @vr2 C c, @vr2 Class<R> cls) {
        jt1.m53777p(zt3, "<this>");
        jt1.m53777p(c, FirebaseAnalytics.C4305d.f24996z);
        jt1.m53777p(cls, "klass");
        for (Object next : zt3) {
            if (cls.isInstance(next)) {
                c.add(next);
            }
        }
        return c;
    }

    @zj0(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @xj0(message = "Use maxByOrNull instead.", replaceWith = @oi3(expression = "this.maxByOrNull(selector)", imports = {}))
    /* renamed from: z */
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T m49862z(zt3<? extends T> zt3, ec1<? super T, ? extends R> ec1) {
        jt1.m53777p(zt3, "<this>");
        jt1.m53777p(ec1, "selector");
        Iterator<? extends T> it = zt3.iterator();
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
}
