package com.onedelhi.secure;

import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\t\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0001*\u00028\u0000*\u0015\u0012\u0006\b\u0000\u0012\u00020\u0003\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u00040\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\n¢\u0006\u0004\b\t\u0010\n\u001aO\u0010\f\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0001*\u00028\u0000*\u0017\u0012\u0006\b\u0000\u0012\u00020\u0003\u0012\u000b\b\u0001\u0012\u00078\u0000¢\u0006\u0002\b\u00040\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\n¢\u0006\u0004\b\f\u0010\n\u001aH\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0006\b\u0000\u0012\u00020\u0003\u0012\u0006\b\u0000\u0012\u00028\u00000\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\r\u001a\u00028\u0000H\n¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"V", "V1", "", "", "Lcom/onedelhi/secure/iw0;", "", "thisRef", "Lcom/onedelhi/secure/ay1;", "property", "a", "(Ljava/util/Map;Ljava/lang/Object;Lcom/onedelhi/secure/ay1;)Ljava/lang/Object;", "", "b", "value", "Lcom/onedelhi/secure/un4;", "c", "(Ljava/util/Map;Ljava/lang/Object;Lcom/onedelhi/secure/ay1;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1})
@uw1(name = "MapAccessorsKt")
public final class gc2 {
    @xq1
    /* renamed from: a */
    public static final <V, V1 extends V> V1 m49318a(Map<? super String, ? extends V> map, Object obj, ay1<?> ay1) {
        jt1.m53777p(map, "<this>");
        jt1.m53777p(ay1, "property");
        return gd2.m49384a(map, ay1.getName());
    }

    @xq1
    @uw1(name = "getVar")
    /* renamed from: b */
    public static final <V, V1 extends V> V1 m49319b(Map<? super String, ? extends V> map, Object obj, ay1<?> ay1) {
        jt1.m53777p(map, "<this>");
        jt1.m53777p(ay1, "property");
        return gd2.m49384a(map, ay1.getName());
    }

    @xq1
    /* renamed from: c */
    public static final <V> void m49320c(Map<? super String, ? super V> map, Object obj, ay1<?> ay1, V v) {
        jt1.m53777p(map, "<this>");
        jt1.m53777p(ay1, "property");
        map.put(ay1.getName(), v);
    }
}
