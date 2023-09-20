package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u0018\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0002\u001a,\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0000\u001a\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0000\u001a\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\bH\u0000\u001a%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\nH\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"T", "", "", "e", "", "source", "d", "b", "Lcom/onedelhi/secure/zt3;", "a", "", "c", "([Ljava/lang/Object;)Ljava/util/Collection;", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1})
/* renamed from: com.onedelhi.secure.do */
public final class C5048do {
    @vr2
    /* renamed from: a */
    public static final <T> Collection<T> m45454a(@vr2 zt3<? extends T> zt3) {
        jt1.m53777p(zt3, "<this>");
        return n00.f32333a ? hu3.m51007b3(zt3) : hu3.m51011c3(zt3);
    }

    @vr2
    /* renamed from: b */
    public static final <T> Collection<T> m45455b(@vr2 Iterable<? extends T> iterable) {
        jt1.m53777p(iterable, "<this>");
        if (iterable instanceof Set) {
            return (Collection) iterable;
        }
        if (iterable instanceof Collection) {
            Collection<T> collection = (Collection) iterable;
            if (!m45458e(collection)) {
                return collection;
            }
        } else if (!n00.f32333a) {
            return a10.m35769Q5(iterable);
        }
        return a10.m35759O5(iterable);
    }

    @vr2
    /* renamed from: c */
    public static final <T> Collection<T> m45456c(@vr2 T[] tArr) {
        jt1.m53777p(tArr, "<this>");
        return n00.f32333a ? C4478ab.m36918Yy(tArr) : C7458za.m72983t(tArr);
    }

    @vr2
    /* renamed from: d */
    public static final <T> Collection<T> m45457d(@vr2 Iterable<? extends T> iterable, @vr2 Iterable<? extends T> iterable2) {
        jt1.m53777p(iterable, "<this>");
        jt1.m53777p(iterable2, "source");
        if (!(iterable instanceof Set)) {
            if (iterable instanceof Collection) {
                if (!(iterable2 instanceof Collection) || ((Collection) iterable2).size() >= 2) {
                    Collection<T> collection = (Collection) iterable;
                    if (!m45458e(collection)) {
                        return collection;
                    }
                }
            } else if (!n00.f32333a) {
                return a10.m35769Q5(iterable);
            }
            return a10.m35759O5(iterable);
        }
        return (Collection) iterable;
    }

    /* renamed from: e */
    public static final <T> boolean m45458e(Collection<? extends T> collection) {
        return n00.f32333a && collection.size() > 2 && (collection instanceof ArrayList);
    }
}
