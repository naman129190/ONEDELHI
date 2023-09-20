package com.onedelhi.secure;

import com.onedelhi.secure.yg3;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0003\u001a0\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00040\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0007\u001aZ\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\b\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0006\"\u0004\b\u0002\u0010\u0007*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b2\u001e\u0010\u000b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\u0012\u0004\u0012\u00028\u00020\tH\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\r"}, d2 = {"T", "K", "Lcom/onedelhi/secure/zi1;", "", "", "a", "V", "R", "", "Lkotlin/Function1;", "", "f", "b", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/collections/GroupingKt")
public class cj1 {
    @gz3(version = "1.1")
    @vr2
    /* renamed from: a */
    public static final <T, K> Map<K, Integer> m41038a(@vr2 zi1<T, ? extends K> zi1) {
        jt1.m53777p(zi1, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> a = zi1.mo30407a();
        while (a.hasNext()) {
            Object b = zi1.mo30408b(a.next());
            Object obj = linkedHashMap.get(b);
            if (obj == null && !linkedHashMap.containsKey(b)) {
                obj = new yg3.C7355f();
            }
            yg3.C7355f fVar = (yg3.C7355f) obj;
            fVar.f37910n++;
            linkedHashMap.put(b, fVar);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            jt1.m53775n(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda-4, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda-4>");
            lj4.m55699m(entry).setValue(Integer.valueOf(((yg3.C7355f) entry.getValue()).f37910n));
        }
        return lj4.m55697k(linkedHashMap);
    }

    @xq1
    @z73
    /* renamed from: b */
    public static final <K, V, R> Map<K, R> m41039b(Map<K, V> map, ec1<? super Map.Entry<? extends K, ? extends V>, ? extends R> ec1) {
        jt1.m53777p(map, "<this>");
        jt1.m53777p(ec1, "f");
        for (Map.Entry entry : map.entrySet()) {
            jt1.m53775n(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda-4, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda-4>");
            lj4.m55699m(entry).setValue(ec1.mo17094X(entry));
        }
        return lj4.m55697k(map);
    }
}
