package com.onedelhi.secure;

import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\u001a3\u0010\u0004\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001aQ\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00028\u00010\u0006\u001aZ\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b2!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00028\u00010\u0006H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"K", "V", "", "key", "a", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lcom/onedelhi/secure/iy2;", "name", "defaultValue", "b", "", "c", "(Ljava/util/Map;Lcom/onedelhi/secure/ec1;)Ljava/util/Map;", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/collections/MapsKt")
public class gd2 {
    @uw1(name = "getOrImplicitDefaultNullable")
    @z73
    /* renamed from: a */
    public static final <K, V> V m49384a(@vr2 Map<K, ? extends V> map, K k) {
        jt1.m53777p(map, "<this>");
        if (map instanceof cd2) {
            return ((cd2) map).mo32305k(k);
        }
        V v = map.get(k);
        if (v != null || map.containsKey(k)) {
            return v;
        }
        throw new NoSuchElementException("Key " + k + " is missing in the map.");
    }

    @vr2
    /* renamed from: b */
    public static final <K, V> Map<K, V> m49385b(@vr2 Map<K, ? extends V> map, @vr2 ec1<? super K, ? extends V> ec1) {
        jt1.m53777p(map, "<this>");
        jt1.m53777p(ec1, "defaultValue");
        return map instanceof cd2 ? m49385b(((cd2) map).mo32304e(), ec1) : new dd2(map, ec1);
    }

    @uw1(name = "withDefaultMutable")
    @vr2
    /* renamed from: c */
    public static final <K, V> Map<K, V> m49386c(@vr2 Map<K, V> map, @vr2 ec1<? super K, ? extends V> ec1) {
        jt1.m53777p(map, "<this>");
        jt1.m53777p(ec1, "defaultValue");
        return map instanceof nm2 ? m49386c(((nm2) map).mo32304e(), ec1) : new om2(map, ec1);
    }
}
