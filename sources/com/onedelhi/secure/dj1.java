package com.onedelhi.secure;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032b\u0010\f\u001a^\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00018\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00028\u00020\u0004H\bø\u0001\u0000\u001a¹\u0001\u0010\u0012\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0016\b\u0003\u0010\u0010*\u0010\u0012\u0006\b\u0000\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0011\u001a\u00028\u00032b\u0010\f\u001a^\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00018\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00028\u00020\u0004H\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a¿\u0001\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000326\u0010\u0015\u001a2\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00020\u00142K\u0010\f\u001aG\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00020\u0016H\bø\u0001\u0000\u001aÚ\u0001\u0010\u0018\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0016\b\u0003\u0010\u0010*\u0010\u0012\u0006\b\u0000\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0011\u001a\u00028\u000326\u0010\u0015\u001a2\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00020\u00142K\u0010\f\u001aG\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00020\u0016H\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0001\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u001a\u001a\u00028\u000226\u0010\f\u001a2\u0012\u0013\u0012\u00118\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00020\u0014H\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0001\u0010\u001d\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0016\b\u0003\u0010\u0010*\u0010\u0012\u0006\b\u0000\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0011\u001a\u00028\u00032\u0006\u0010\u001a\u001a\u00028\u000226\u0010\f\u001a2\u0012\u0013\u0012\u00118\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00020\u0014H\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0001\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u001f\"\b\b\u0001\u0010\u0000*\u00028\u0000\"\u0004\b\u0002\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00032K\u0010\f\u001aG\u0012\u0013\u0012\u00118\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00000\u0016H\bø\u0001\u0000\u001a¦\u0001\u0010!\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u001f\"\b\b\u0001\u0010\u0000*\u00028\u0000\"\u0004\b\u0002\u0010\u0001\"\u0016\b\u0003\u0010\u0010*\u0010\u0012\u0006\b\u0000\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00000\u000f*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00032\u0006\u0010\u0011\u001a\u00028\u00032K\u0010\f\u001aG\u0012\u0013\u0012\u00118\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00000\u0016H\bø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001aK\u0010$\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0016\b\u0002\u0010\u0010*\u0010\u0012\u0006\b\u0000\u0012\u00028\u0001\u0012\u0004\u0012\u00020#0\u000f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0011\u001a\u00028\u0002H\u0007¢\u0006\u0004\b$\u0010%\u0002\u0007\n\u0005\b20\u0001¨\u0006&"}, d2 = {"T", "K", "R", "Lcom/onedelhi/secure/zi1;", "Lkotlin/Function4;", "Lcom/onedelhi/secure/iy2;", "name", "key", "accumulator", "element", "", "first", "operation", "", "c", "", "M", "destination", "d", "(Lcom/onedelhi/secure/zi1;Ljava/util/Map;Lcom/onedelhi/secure/vc1;)Ljava/util/Map;", "Lkotlin/Function2;", "initialValueSelector", "Lkotlin/Function3;", "f", "h", "(Lcom/onedelhi/secure/zi1;Ljava/util/Map;Lcom/onedelhi/secure/sc1;Lcom/onedelhi/secure/uc1;)Ljava/util/Map;", "initialValue", "g", "(Lcom/onedelhi/secure/zi1;Ljava/lang/Object;Lcom/onedelhi/secure/sc1;)Ljava/util/Map;", "i", "(Lcom/onedelhi/secure/zi1;Ljava/util/Map;Ljava/lang/Object;Lcom/onedelhi/secure/sc1;)Ljava/util/Map;", "S", "j", "k", "(Lcom/onedelhi/secure/zi1;Ljava/util/Map;Lcom/onedelhi/secure/uc1;)Ljava/util/Map;", "", "e", "(Lcom/onedelhi/secure/zi1;Ljava/util/Map;)Ljava/util/Map;", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/collections/GroupingKt")
public class dj1 extends cj1 {
    @gz3(version = "1.1")
    @vr2
    /* renamed from: c */
    public static final <T, K, R> Map<K, R> m45318c(@vr2 zi1<T, ? extends K> zi1, @vr2 vc1<? super K, ? super R, ? super T, ? super Boolean, ? extends R> vc1) {
        jt1.m53777p(zi1, "<this>");
        jt1.m53777p(vc1, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> a = zi1.mo30407a();
        while (a.hasNext()) {
            T next = a.next();
            Object b = zi1.mo30408b(next);
            Object obj = linkedHashMap.get(b);
            linkedHashMap.put(b, vc1.mo18982h(b, obj, next, Boolean.valueOf(obj == null && !linkedHashMap.containsKey(b))));
        }
        return linkedHashMap;
    }

    @gz3(version = "1.1")
    @vr2
    /* renamed from: d */
    public static final <T, K, R, M extends Map<? super K, R>> M m45319d(@vr2 zi1<T, ? extends K> zi1, @vr2 M m, @vr2 vc1<? super K, ? super R, ? super T, ? super Boolean, ? extends R> vc1) {
        jt1.m53777p(zi1, "<this>");
        jt1.m53777p(m, FirebaseAnalytics.C4305d.f24996z);
        jt1.m53777p(vc1, "operation");
        Iterator<T> a = zi1.mo30407a();
        while (a.hasNext()) {
            T next = a.next();
            Object b = zi1.mo30408b(next);
            Object obj = m.get(b);
            m.put(b, vc1.mo18982h(b, obj, next, Boolean.valueOf(obj == null && !m.containsKey(b))));
        }
        return m;
    }

    @gz3(version = "1.1")
    @vr2
    /* renamed from: e */
    public static final <T, K, M extends Map<? super K, Integer>> M m45320e(@vr2 zi1<T, ? extends K> zi1, @vr2 M m) {
        jt1.m53777p(zi1, "<this>");
        jt1.m53777p(m, FirebaseAnalytics.C4305d.f24996z);
        Iterator<T> a = zi1.mo30407a();
        while (a.hasNext()) {
            Object b = zi1.mo30408b(a.next());
            Object obj = m.get(b);
            if (obj == null && !m.containsKey(b)) {
                obj = 0;
            }
            m.put(b, Integer.valueOf(((Number) obj).intValue() + 1));
        }
        return m;
    }

    @gz3(version = "1.1")
    @vr2
    /* renamed from: f */
    public static final <T, K, R> Map<K, R> m45321f(@vr2 zi1<T, ? extends K> zi1, @vr2 sc1<? super K, ? super T, ? extends R> sc1, @vr2 uc1<? super K, ? super R, ? super T, ? extends R> uc1) {
        jt1.m53777p(zi1, "<this>");
        jt1.m53777p(sc1, "initialValueSelector");
        jt1.m53777p(uc1, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> a = zi1.mo30407a();
        while (a.hasNext()) {
            T next = a.next();
            Object b = zi1.mo30408b(next);
            Object obj = linkedHashMap.get(b);
            if (obj == null && !linkedHashMap.containsKey(b)) {
                obj = sc1.mo21054h0(b, next);
            }
            linkedHashMap.put(b, uc1.mo34871o(b, obj, next));
        }
        return linkedHashMap;
    }

    @gz3(version = "1.1")
    @vr2
    /* renamed from: g */
    public static final <T, K, R> Map<K, R> m45322g(@vr2 zi1<T, ? extends K> zi1, R r, @vr2 sc1<? super R, ? super T, ? extends R> sc1) {
        jt1.m53777p(zi1, "<this>");
        jt1.m53777p(sc1, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> a = zi1.mo30407a();
        while (a.hasNext()) {
            T next = a.next();
            Object b = zi1.mo30408b(next);
            R r2 = linkedHashMap.get(b);
            if (r2 == null && !linkedHashMap.containsKey(b)) {
                r2 = r;
            }
            linkedHashMap.put(b, sc1.mo21054h0(r2, next));
        }
        return linkedHashMap;
    }

    @gz3(version = "1.1")
    @vr2
    /* renamed from: h */
    public static final <T, K, R, M extends Map<? super K, R>> M m45323h(@vr2 zi1<T, ? extends K> zi1, @vr2 M m, @vr2 sc1<? super K, ? super T, ? extends R> sc1, @vr2 uc1<? super K, ? super R, ? super T, ? extends R> uc1) {
        jt1.m53777p(zi1, "<this>");
        jt1.m53777p(m, FirebaseAnalytics.C4305d.f24996z);
        jt1.m53777p(sc1, "initialValueSelector");
        jt1.m53777p(uc1, "operation");
        Iterator<T> a = zi1.mo30407a();
        while (a.hasNext()) {
            T next = a.next();
            Object b = zi1.mo30408b(next);
            Object obj = m.get(b);
            if (obj == null && !m.containsKey(b)) {
                obj = sc1.mo21054h0(b, next);
            }
            m.put(b, uc1.mo34871o(b, obj, next));
        }
        return m;
    }

    @gz3(version = "1.1")
    @vr2
    /* renamed from: i */
    public static final <T, K, R, M extends Map<? super K, R>> M m45324i(@vr2 zi1<T, ? extends K> zi1, @vr2 M m, R r, @vr2 sc1<? super R, ? super T, ? extends R> sc1) {
        jt1.m53777p(zi1, "<this>");
        jt1.m53777p(m, FirebaseAnalytics.C4305d.f24996z);
        jt1.m53777p(sc1, "operation");
        Iterator<T> a = zi1.mo30407a();
        while (a.hasNext()) {
            T next = a.next();
            Object b = zi1.mo30408b(next);
            R r2 = m.get(b);
            if (r2 == null && !m.containsKey(b)) {
                r2 = r;
            }
            m.put(b, sc1.mo21054h0(r2, next));
        }
        return m;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.onedelhi.secure.uc1<? super K, ? super S, ? super T, ? extends S>, java.lang.Object, com.onedelhi.secure.uc1] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.onedelhi.secure.gz3(version = "1.1")
    @com.onedelhi.secure.vr2
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S, T extends S, K> java.util.Map<K, S> m45325j(@com.onedelhi.secure.vr2 com.onedelhi.secure.zi1<T, ? extends K> r6, @com.onedelhi.secure.vr2 com.onedelhi.secure.uc1<? super K, ? super S, ? super T, ? extends S> r7) {
        /*
            java.lang.String r0 = "<this>"
            com.onedelhi.secure.jt1.m53777p(r6, r0)
            java.lang.String r0 = "operation"
            com.onedelhi.secure.jt1.m53777p(r7, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r1 = r6.mo30407a()
        L_0x0013:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x003b
            java.lang.Object r2 = r1.next()
            java.lang.Object r3 = r6.mo30408b(r2)
            java.lang.Object r4 = r0.get(r3)
            if (r4 != 0) goto L_0x002f
            boolean r5 = r0.containsKey(r3)
            if (r5 != 0) goto L_0x002f
            r5 = 1
            goto L_0x0030
        L_0x002f:
            r5 = 0
        L_0x0030:
            if (r5 == 0) goto L_0x0033
            goto L_0x0037
        L_0x0033:
            java.lang.Object r2 = r7.mo34871o(r3, r4, r2)
        L_0x0037:
            r0.put(r3, r2)
            goto L_0x0013
        L_0x003b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.dj1.m45325j(com.onedelhi.secure.zi1, com.onedelhi.secure.uc1):java.util.Map");
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.onedelhi.secure.uc1<? super K, ? super S, ? super T, ? extends S>, java.lang.Object, com.onedelhi.secure.uc1] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.onedelhi.secure.gz3(version = "1.1")
    @com.onedelhi.secure.vr2
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S, T extends S, K, M extends java.util.Map<? super K, S>> M m45326k(@com.onedelhi.secure.vr2 com.onedelhi.secure.zi1<T, ? extends K> r5, @com.onedelhi.secure.vr2 M r6, @com.onedelhi.secure.vr2 com.onedelhi.secure.uc1<? super K, ? super S, ? super T, ? extends S> r7) {
        /*
            java.lang.String r0 = "<this>"
            com.onedelhi.secure.jt1.m53777p(r5, r0)
            java.lang.String r0 = "destination"
            com.onedelhi.secure.jt1.m53777p(r6, r0)
            java.lang.String r0 = "operation"
            com.onedelhi.secure.jt1.m53777p(r7, r0)
            java.util.Iterator r0 = r5.mo30407a()
        L_0x0013:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x003b
            java.lang.Object r1 = r0.next()
            java.lang.Object r2 = r5.mo30408b(r1)
            java.lang.Object r3 = r6.get(r2)
            if (r3 != 0) goto L_0x002f
            boolean r4 = r6.containsKey(r2)
            if (r4 != 0) goto L_0x002f
            r4 = 1
            goto L_0x0030
        L_0x002f:
            r4 = 0
        L_0x0030:
            if (r4 == 0) goto L_0x0033
            goto L_0x0037
        L_0x0033:
            java.lang.Object r1 = r7.mo34871o(r2, r3, r1)
        L_0x0037:
            r6.put(r2, r1)
            goto L_0x0013
        L_0x003b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.dj1.m45326k(com.onedelhi.secure.zi1, java.util.Map, com.onedelhi.secure.uc1):java.util.Map");
    }
}
