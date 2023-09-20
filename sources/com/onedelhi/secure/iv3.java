package com.onedelhi.secure;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a.\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a6\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002\u001a-\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0002\u001a.\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\b¢\u0006\u0004\b\r\u0010\u0004\u001a.\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u0004\u001a6\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\b\u001a-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002\u001a-\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0002\u001a.\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\b¢\u0006\u0004\b\u0012\u0010\u0004¨\u0006\u0013"}, d2 = {"T", "", "element", "z", "(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;", "", "elements", "A", "(Ljava/util/Set;[Ljava/lang/Object;)Ljava/util/Set;", "", "y", "Lcom/onedelhi/secure/zt3;", "x", "B", "E", "F", "D", "C", "G", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/collections/SetsKt")
public class iv3 extends hv3 {
    @vr2
    /* renamed from: A */
    public static final <T> Set<T> m52698A(@vr2 Set<? extends T> set, @vr2 T[] tArr) {
        jt1.m53777p(set, "<this>");
        jt1.m53777p(tArr, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        x00.m69799H0(linkedHashSet, tArr);
        return linkedHashSet;
    }

    @xq1
    /* renamed from: B */
    public static final <T> Set<T> m52699B(Set<? extends T> set, T t) {
        jt1.m53777p(set, "<this>");
        return m52707z(set, t);
    }

    @vr2
    /* renamed from: C */
    public static final <T> Set<T> m52700C(@vr2 Set<? extends T> set, @vr2 zt3<? extends T> zt3) {
        jt1.m53777p(set, "<this>");
        jt1.m53777p(zt3, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(hd2.m50458j(set.size() * 2));
        linkedHashSet.addAll(set);
        x00.m69812o0(linkedHashSet, zt3);
        return linkedHashSet;
    }

    @vr2
    /* renamed from: D */
    public static final <T> Set<T> m52701D(@vr2 Set<? extends T> set, @vr2 Iterable<? extends T> iterable) {
        int i;
        jt1.m53777p(set, "<this>");
        jt1.m53777p(iterable, "elements");
        Integer a0 = t00.m65074a0(iterable);
        if (a0 != null) {
            i = set.size() + a0.intValue();
        } else {
            i = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(hd2.m50458j(i));
        linkedHashSet.addAll(set);
        x00.m69813p0(linkedHashSet, iterable);
        return linkedHashSet;
    }

    @vr2
    /* renamed from: E */
    public static final <T> Set<T> m52702E(@vr2 Set<? extends T> set, T t) {
        jt1.m53777p(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(hd2.m50458j(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t);
        return linkedHashSet;
    }

    @vr2
    /* renamed from: F */
    public static final <T> Set<T> m52703F(@vr2 Set<? extends T> set, @vr2 T[] tArr) {
        jt1.m53777p(set, "<this>");
        jt1.m53777p(tArr, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(hd2.m50458j(set.size() + tArr.length));
        linkedHashSet.addAll(set);
        x00.m69814q0(linkedHashSet, tArr);
        return linkedHashSet;
    }

    @xq1
    /* renamed from: G */
    public static final <T> Set<T> m52704G(Set<? extends T> set, T t) {
        jt1.m53777p(set, "<this>");
        return m52702E(set, t);
    }

    @vr2
    /* renamed from: x */
    public static final <T> Set<T> m52705x(@vr2 Set<? extends T> set, @vr2 zt3<? extends T> zt3) {
        jt1.m53777p(set, "<this>");
        jt1.m53777p(zt3, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        x00.m69796E0(linkedHashSet, zt3);
        return linkedHashSet;
    }

    @vr2
    /* renamed from: y */
    public static final <T> Set<T> m52706y(@vr2 Set<? extends T> set, @vr2 Iterable<? extends T> iterable) {
        jt1.m53777p(set, "<this>");
        jt1.m53777p(iterable, "elements");
        Collection<? extends T> d = C5048do.m45457d(iterable, set);
        if (d.isEmpty()) {
            return a10.m35794V5(set);
        }
        if (d instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (T next : set) {
                if (!d.contains(next)) {
                    linkedHashSet.add(next);
                }
            }
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
        linkedHashSet2.removeAll(d);
        return linkedHashSet2;
    }

    @vr2
    /* renamed from: z */
    public static final <T> Set<T> m52707z(@vr2 Set<? extends T> set, T t) {
        jt1.m53777p(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(hd2.m50458j(set.size()));
        boolean z = false;
        for (T next : set) {
            boolean z2 = true;
            if (!z && jt1.m53768g(next, t)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(next);
            }
        }
        return linkedHashSet;
    }
}
