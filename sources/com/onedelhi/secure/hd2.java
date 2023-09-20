package com.onedelhi.secure;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a2\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\u001aI\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012#\u0010\n\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\bø\u0001\u0000\u001aQ\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\r\u001a\u00020\f2#\u0010\n\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\bø\u0001\u0000\u001a \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\u0001\u001a(\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\r\u001a\u00020\fH\u0001\u001a4\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007H\u0001\u001aE\u0010\u0017\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00132\u0006\u0010\u0014\u001a\u00028\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015H\bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a:\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0019\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u001a@\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u000e\u0010\u001d\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u001c\u001a[\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0019\"\u0004\b\u0001\u0010\u00012*\u0010 \u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u001f\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b!\u0010\"\u001ac\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u001d\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u001c2*\u0010 \u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u001f\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0007¢\u0006\u0004\b#\u0010$\u001a\u0019\u0010'\u001a\u00020&*\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%0\u0004H\b\u001a1\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\b\u001a2\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0000\u001a\u0010\u0010+\u001a\u00020\f2\u0006\u0010*\u001a\u00020\fH\u0001\u0002\u0007\n\u0005\b20\u0001¨\u0006,"}, d2 = {"K", "V", "Lcom/onedelhi/secure/ey2;", "pair", "", "k", "Lkotlin/Function1;", "", "Lcom/onedelhi/secure/un4;", "Lcom/onedelhi/secure/wy0;", "builderAction", "f", "", "capacity", "e", "g", "h", "builder", "d", "Ljava/util/concurrent/ConcurrentMap;", "key", "Lkotlin/Function0;", "defaultValue", "i", "(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/Object;Lcom/onedelhi/secure/cc1;)Ljava/lang/Object;", "", "Ljava/util/SortedMap;", "q", "Ljava/util/Comparator;", "comparator", "r", "", "pairs", "m", "([Lcom/onedelhi/secure/ey2;)Ljava/util/SortedMap;", "l", "(Ljava/util/Comparator;[Lcom/onedelhi/secure/ey2;)Ljava/util/SortedMap;", "", "Ljava/util/Properties;", "n", "p", "o", "expectedSize", "j", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/collections/MapsKt")
public class hd2 extends gd2 {

    /* renamed from: a */
    public static final int f29574a = 1073741824;

    @vr2
    @z73
    @gz3(version = "1.3")
    /* renamed from: d */
    public static final <K, V> Map<K, V> m50452d(@vr2 Map<K, V> map) {
        jt1.m53777p(map, "builder");
        return ((ic2) map).mo37976m();
    }

    @z73
    @gz3(version = "1.3")
    @xq1
    /* renamed from: e */
    public static final <K, V> Map<K, V> m50453e(int i, ec1<? super Map<K, V>, un4> ec1) {
        jt1.m53777p(ec1, "builderAction");
        Map h = m50456h(i);
        ec1.mo17094X(h);
        return m50452d(h);
    }

    @z73
    @gz3(version = "1.3")
    @xq1
    /* renamed from: f */
    public static final <K, V> Map<K, V> m50454f(ec1<? super Map<K, V>, un4> ec1) {
        jt1.m53777p(ec1, "builderAction");
        Map g = m50455g();
        ec1.mo17094X(g);
        return m50452d(g);
    }

    @vr2
    @z73
    @gz3(version = "1.3")
    /* renamed from: g */
    public static final <K, V> Map<K, V> m50455g() {
        return new ic2();
    }

    @vr2
    @z73
    @gz3(version = "1.3")
    /* renamed from: h */
    public static final <K, V> Map<K, V> m50456h(int i) {
        return new ic2(i);
    }

    /* renamed from: i */
    public static final <K, V> V m50457i(@vr2 ConcurrentMap<K, V> concurrentMap, K k, @vr2 cc1<? extends V> cc1) {
        jt1.m53777p(concurrentMap, "<this>");
        jt1.m53777p(cc1, "defaultValue");
        V v = concurrentMap.get(k);
        if (v != null) {
            return v;
        }
        V invoke = cc1.invoke();
        V putIfAbsent = concurrentMap.putIfAbsent(k, invoke);
        return putIfAbsent == null ? invoke : putIfAbsent;
    }

    @z73
    /* renamed from: j */
    public static final int m50458j(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    @vr2
    /* renamed from: k */
    public static final <K, V> Map<K, V> m50459k(@vr2 ey2<? extends K, ? extends V> ey2) {
        jt1.m53777p(ey2, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(ey2.mo35668e(), ey2.mo35670f());
        jt1.m53776o(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    @gz3(version = "1.4")
    @vr2
    /* renamed from: l */
    public static final <K, V> SortedMap<K, V> m50460l(@vr2 Comparator<? super K> comparator, @vr2 ey2<? extends K, ? extends V>... ey2Arr) {
        jt1.m53777p(comparator, "comparator");
        jt1.m53777p(ey2Arr, "pairs");
        TreeMap treeMap = new TreeMap(comparator);
        id2.m52155y0(treeMap, ey2Arr);
        return treeMap;
    }

    @vr2
    /* renamed from: m */
    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> m50461m(@vr2 ey2<? extends K, ? extends V>... ey2Arr) {
        jt1.m53777p(ey2Arr, "pairs");
        TreeMap treeMap = new TreeMap();
        id2.m52155y0(treeMap, ey2Arr);
        return treeMap;
    }

    @xq1
    /* renamed from: n */
    public static final Properties m50462n(Map<String, String> map) {
        jt1.m53777p(map, "<this>");
        Properties properties = new Properties();
        properties.putAll(map);
        return properties;
    }

    @vr2
    /* renamed from: o */
    public static final <K, V> Map<K, V> m50463o(@vr2 Map<? extends K, ? extends V> map) {
        jt1.m53777p(map, "<this>");
        Map.Entry next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        jt1.m53776o(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }

    @xq1
    /* renamed from: p */
    public static final <K, V> Map<K, V> m50464p(Map<K, ? extends V> map) {
        jt1.m53777p(map, "<this>");
        return m50463o(map);
    }

    @vr2
    /* renamed from: q */
    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> m50465q(@vr2 Map<? extends K, ? extends V> map) {
        jt1.m53777p(map, "<this>");
        return new TreeMap(map);
    }

    @vr2
    /* renamed from: r */
    public static final <K, V> SortedMap<K, V> m50466r(@vr2 Map<? extends K, ? extends V> map, @vr2 Comparator<? super K> comparator) {
        jt1.m53777p(map, "<this>");
        jt1.m53777p(comparator, "comparator");
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }
}
