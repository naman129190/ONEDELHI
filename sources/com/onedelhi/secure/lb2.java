package com.onedelhi.secure;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class lb2<T, Y> {

    /* renamed from: a */
    public final long f15278a;

    /* renamed from: a */
    public final Map<T, C2715a<Y>> f15279a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b */
    public long f15280b;

    /* renamed from: c */
    public long f15281c;

    /* renamed from: com.onedelhi.secure.lb2$a */
    public static final class C2715a<Y> {

        /* renamed from: a */
        public final int f15282a;

        /* renamed from: a */
        public final Y f15283a;

        public C2715a(Y y, int i) {
            this.f15283a = y;
            this.f15282a = i;
        }
    }

    public lb2(long j) {
        this.f15278a = j;
        this.f15280b = j;
    }

    /* renamed from: b */
    public void mo19399b() {
        mo19411q(0);
    }

    /* renamed from: c */
    public synchronized long mo19400c() {
        return this.f15281c;
    }

    /* renamed from: e */
    public synchronized long mo19401e() {
        return this.f15280b;
    }

    /* renamed from: f */
    public synchronized void mo19402f(float f) {
        if (f >= 0.0f) {
            this.f15280b = (long) Math.round(((float) this.f15278a) * f);
            mo19404j();
        } else {
            throw new IllegalArgumentException("Multiplier must be >= 0");
        }
    }

    /* renamed from: i */
    public synchronized boolean mo19403i(@mr2 T t) {
        return this.f15279a.containsKey(t);
    }

    /* renamed from: j */
    public final void mo19404j() {
        mo19411q(this.f15280b);
    }

    @ts2
    /* renamed from: k */
    public synchronized Y mo19405k(@mr2 T t) {
        C2715a aVar;
        aVar = this.f15279a.get(t);
        return aVar != null ? aVar.f15283a : null;
    }

    /* renamed from: l */
    public synchronized int mo19406l() {
        return this.f15279a.size();
    }

    /* renamed from: m */
    public int mo19407m(@ts2 Y y) {
        return 1;
    }

    /* renamed from: n */
    public void mo19408n(@mr2 T t, @ts2 Y y) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0049, code lost:
        return r5;
     */
    @com.onedelhi.secure.ts2
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized Y mo19409o(@com.onedelhi.secure.mr2 T r8, @com.onedelhi.secure.ts2 Y r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            int r0 = r7.mo19407m(r9)     // Catch:{ all -> 0x004a }
            long r1 = (long) r0     // Catch:{ all -> 0x004a }
            long r3 = r7.f15280b     // Catch:{ all -> 0x004a }
            r5 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 < 0) goto L_0x0012
            r7.mo19408n(r8, r9)     // Catch:{ all -> 0x004a }
            monitor-exit(r7)
            return r5
        L_0x0012:
            if (r9 == 0) goto L_0x0019
            long r3 = r7.f15281c     // Catch:{ all -> 0x004a }
            long r3 = r3 + r1
            r7.f15281c = r3     // Catch:{ all -> 0x004a }
        L_0x0019:
            java.util.Map<T, com.onedelhi.secure.lb2$a<Y>> r1 = r7.f15279a     // Catch:{ all -> 0x004a }
            if (r9 != 0) goto L_0x001f
            r2 = r5
            goto L_0x0024
        L_0x001f:
            com.onedelhi.secure.lb2$a r2 = new com.onedelhi.secure.lb2$a     // Catch:{ all -> 0x004a }
            r2.<init>(r9, r0)     // Catch:{ all -> 0x004a }
        L_0x0024:
            java.lang.Object r0 = r1.put(r8, r2)     // Catch:{ all -> 0x004a }
            com.onedelhi.secure.lb2$a r0 = (com.onedelhi.secure.lb2.C2715a) r0     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0041
            long r1 = r7.f15281c     // Catch:{ all -> 0x004a }
            int r3 = r0.f15282a     // Catch:{ all -> 0x004a }
            long r3 = (long) r3     // Catch:{ all -> 0x004a }
            long r1 = r1 - r3
            r7.f15281c = r1     // Catch:{ all -> 0x004a }
            Y r1 = r0.f15283a     // Catch:{ all -> 0x004a }
            boolean r9 = r1.equals(r9)     // Catch:{ all -> 0x004a }
            if (r9 != 0) goto L_0x0041
            Y r9 = r0.f15283a     // Catch:{ all -> 0x004a }
            r7.mo19408n(r8, r9)     // Catch:{ all -> 0x004a }
        L_0x0041:
            r7.mo19404j()     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0048
            Y r5 = r0.f15283a     // Catch:{ all -> 0x004a }
        L_0x0048:
            monitor-exit(r7)
            return r5
        L_0x004a:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.lb2.mo19409o(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @ts2
    /* renamed from: p */
    public synchronized Y mo19410p(@mr2 T t) {
        C2715a remove = this.f15279a.remove(t);
        if (remove == null) {
            return null;
        }
        this.f15281c -= (long) remove.f15282a;
        return remove.f15283a;
    }

    /* renamed from: q */
    public synchronized void mo19411q(long j) {
        while (this.f15281c > j) {
            Iterator<Map.Entry<T, C2715a<Y>>> it = this.f15279a.entrySet().iterator();
            Map.Entry next = it.next();
            C2715a aVar = (C2715a) next.getValue();
            this.f15281c -= (long) aVar.f15282a;
            Object key = next.getKey();
            it.remove();
            mo19408n(key, aVar.f15283a);
        }
    }
}
