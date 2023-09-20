package com.onedelhi.secure;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

public class sv0 implements n64, a83 {
    @mj1("this")

    /* renamed from: a */
    public final Map<Class<?>, ConcurrentHashMap<tv0<Object>, Executor>> f35197a = new HashMap();
    @mj1("this")

    /* renamed from: a */
    public Queue<pv0<?>> f35198a = new ArrayDeque();

    /* renamed from: a */
    public final Executor f35199a;

    public sv0(Executor executor) {
        this.f35199a = executor;
    }

    /* renamed from: a */
    public <T> void mo40985a(Class<T> cls, tv0<? super T> tv0) {
        mo40986c(cls, this.f35199a, tv0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r0.hasNext() == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        r1 = r0.next();
        ((java.util.concurrent.Executor) r1.getValue()).execute(new com.onedelhi.secure.rv0(r1, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000e, code lost:
        r0 = mo44554g(r5).iterator();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo30482b(com.onedelhi.secure.pv0<?> r5) {
        /*
            r4 = this;
            com.onedelhi.secure.i43.m51838b(r5)
            monitor-enter(r4)
            java.util.Queue<com.onedelhi.secure.pv0<?>> r0 = r4.f35198a     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x000d
            r0.add(r5)     // Catch:{ all -> 0x0032 }
            monitor-exit(r4)     // Catch:{ all -> 0x0032 }
            return
        L_0x000d:
            monitor-exit(r4)     // Catch:{ all -> 0x0032 }
            java.util.Set r0 = r4.mo44554g(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x0016:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0031
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            com.onedelhi.secure.rv0 r3 = new com.onedelhi.secure.rv0
            r3.<init>(r1, r5)
            r2.execute(r3)
            goto L_0x0016
        L_0x0031:
            return
        L_0x0032:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0032 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.sv0.mo30482b(com.onedelhi.secure.pv0):void");
    }

    /* renamed from: c */
    public synchronized <T> void mo40986c(Class<T> cls, Executor executor, tv0<? super T> tv0) {
        i43.m51838b(cls);
        i43.m51838b(tv0);
        i43.m51838b(executor);
        if (!this.f35197a.containsKey(cls)) {
            this.f35197a.put(cls, new ConcurrentHashMap());
        }
        this.f35197a.get(cls).put(tv0, executor);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized <T> void mo40987d(java.lang.Class<T> r2, com.onedelhi.secure.tv0<? super T> r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.onedelhi.secure.i43.m51838b(r2)     // Catch:{ all -> 0x0029 }
            com.onedelhi.secure.i43.m51838b(r3)     // Catch:{ all -> 0x0029 }
            java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<com.onedelhi.secure.tv0<java.lang.Object>, java.util.concurrent.Executor>> r0 = r1.f35197a     // Catch:{ all -> 0x0029 }
            boolean r0 = r0.containsKey(r2)     // Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x0011
            monitor-exit(r1)
            return
        L_0x0011:
            java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<com.onedelhi.secure.tv0<java.lang.Object>, java.util.concurrent.Executor>> r0 = r1.f35197a     // Catch:{ all -> 0x0029 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0029 }
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch:{ all -> 0x0029 }
            r0.remove(r3)     // Catch:{ all -> 0x0029 }
            boolean r3 = r0.isEmpty()     // Catch:{ all -> 0x0029 }
            if (r3 == 0) goto L_0x0027
            java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<com.onedelhi.secure.tv0<java.lang.Object>, java.util.concurrent.Executor>> r3 = r1.f35197a     // Catch:{ all -> 0x0029 }
            r3.remove(r2)     // Catch:{ all -> 0x0029 }
        L_0x0027:
            monitor-exit(r1)
            return
        L_0x0029:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.sv0.mo40987d(java.lang.Class, com.onedelhi.secure.tv0):void");
    }

    /* renamed from: f */
    public void mo44553f() {
        Queue<pv0<?>> queue;
        synchronized (this) {
            queue = this.f35198a;
            if (queue != null) {
                this.f35198a = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (pv0 b : queue) {
                mo30482b(b);
            }
        }
    }

    /* renamed from: g */
    public final synchronized Set<Map.Entry<tv0<Object>, Executor>> mo44554g(pv0<?> pv0) {
        Map map;
        map = this.f35197a.get(pv0.mo42922b());
        return map == null ? Collections.emptySet() : map.entrySet();
    }
}
