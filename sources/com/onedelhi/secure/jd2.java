package com.onedelhi.secure;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ah\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u000e\b\u0002\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00020\u0002*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010\u0007\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u00020\u0005H\bø\u0001\u0000\u001ai\u0010\f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000422\u0010\u000b\u001a.\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\tj\u0016\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006`\nH\b\u001ah\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u000e\b\u0002\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00020\u0002*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010\u0007\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u00020\u0005H\bø\u0001\u0000\u001ah\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000422\u0010\u000b\u001a.\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\tj\u0016\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006`\nH\u0007\u0002\u0007\n\u0005\b20\u0001¨\u0006\u000f"}, d2 = {"K", "V", "", "R", "", "Lkotlin/Function1;", "", "selector", "L0", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "M0", "N0", "O0", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/collections/MapsKt")
public class jd2 extends id2 {
    @xj0(message = "Use maxByOrNull instead.", replaceWith = @oi3(expression = "this.maxByOrNull(selector)", imports = {}))
    @xq1
    @zj0(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: L0 */
    public static final /* synthetic */ <K, V, R extends Comparable<? super R>> Map.Entry<K, V> m53267L0(Map<? extends K, ? extends V> map, ec1<? super Map.Entry<? extends K, ? extends V>, ? extends R> ec1) {
        T t;
        jt1.m53777p(map, "<this>");
        jt1.m53777p(ec1, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            t = null;
        } else {
            T next = it.next();
            if (!it.hasNext()) {
                t = next;
            } else {
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
            t = next;
        }
        return (Map.Entry) t;
    }

    @xj0(message = "Use maxWithOrNull instead.", replaceWith = @oi3(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @xq1
    @zj0(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: M0 */
    public static final /* synthetic */ <K, V> Map.Entry<K, V> m53268M0(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        jt1.m53777p(map, "<this>");
        jt1.m53777p(comparator, "comparator");
        return (Map.Entry) a10.m35767Q3(map.entrySet(), comparator);
    }

    @zj0(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @xj0(message = "Use minByOrNull instead.", replaceWith = @oi3(expression = "this.minByOrNull(selector)", imports = {}))
    /* renamed from: N0 */
    public static final /* synthetic */ <K, V, R extends Comparable<? super R>> Map.Entry<K, V> m53269N0(Map<? extends K, ? extends V> map, ec1<? super Map.Entry<? extends K, ? extends V>, ? extends R> ec1) {
        T t;
        jt1.m53777p(map, "<this>");
        jt1.m53777p(ec1, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            t = null;
        } else {
            T next = it.next();
            if (!it.hasNext()) {
                t = next;
            } else {
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
            t = next;
        }
        return (Map.Entry) t;
    }

    @zj0(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @xj0(message = "Use minWithOrNull instead.", replaceWith = @oi3(expression = "this.minWithOrNull(comparator)", imports = {}))
    /* renamed from: O0 */
    public static final /* synthetic */ Map.Entry m53270O0(Map map, Comparator comparator) {
        jt1.m53777p(map, "<this>");
        jt1.m53777p(comparator, "comparator");
        return (Map.Entry) a10.m35857i4(map.entrySet(), comparator);
    }
}
