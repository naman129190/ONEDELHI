package com.onedelhi.secure;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

public class mb2<K, V> {

    /* renamed from: a */
    public int f16049a;

    /* renamed from: a */
    public final LinkedHashMap<K, V> f16050a;

    /* renamed from: b */
    public int f16051b;

    /* renamed from: c */
    public int f16052c;

    /* renamed from: d */
    public int f16053d;

    /* renamed from: e */
    public int f16054e;

    /* renamed from: f */
    public int f16055f;

    /* renamed from: g */
    public int f16056g;

    public mb2(int i) {
        if (i > 0) {
            this.f16051b = i;
            this.f16050a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    @ts2
    /* renamed from: a */
    public V mo20263a(@mr2 K k) {
        return null;
    }

    /* renamed from: b */
    public final synchronized int mo20264b() {
        return this.f16053d;
    }

    /* renamed from: c */
    public void mo20265c(boolean z, @mr2 K k, @mr2 V v, @ts2 V v2) {
    }

    /* renamed from: d */
    public final void mo20266d() {
        mo20280r(-1);
    }

    /* renamed from: e */
    public final synchronized int mo20267e() {
        return this.f16054e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        r0 = mo20263a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        if (r0 != null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r4.f16053d++;
        r1 = r4.f16050a.put(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        if (r1 == null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        r4.f16050a.put(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        r4.f16049a += mo20276n(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0044, code lost:
        if (r1 == null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
        mo20265c(false, r5, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004a, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        mo20280r(r4.f16051b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        return r0;
     */
    @com.onedelhi.secure.ts2
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V mo20268f(@com.onedelhi.secure.mr2 K r5) {
        /*
            r4 = this;
            java.lang.String r0 = "key == null"
            java.util.Objects.requireNonNull(r5, r0)
            monitor-enter(r4)
            java.util.LinkedHashMap<K, V> r0 = r4.f16050a     // Catch:{ all -> 0x0054 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x0054 }
            if (r0 == 0) goto L_0x0016
            int r5 = r4.f16055f     // Catch:{ all -> 0x0054 }
            int r5 = r5 + 1
            r4.f16055f = r5     // Catch:{ all -> 0x0054 }
            monitor-exit(r4)     // Catch:{ all -> 0x0054 }
            return r0
        L_0x0016:
            int r0 = r4.f16056g     // Catch:{ all -> 0x0054 }
            int r0 = r0 + 1
            r4.f16056g = r0     // Catch:{ all -> 0x0054 }
            monitor-exit(r4)     // Catch:{ all -> 0x0054 }
            java.lang.Object r0 = r4.mo20263a(r5)
            if (r0 != 0) goto L_0x0025
            r5 = 0
            return r5
        L_0x0025:
            monitor-enter(r4)
            int r1 = r4.f16053d     // Catch:{ all -> 0x0051 }
            int r1 = r1 + 1
            r4.f16053d = r1     // Catch:{ all -> 0x0051 }
            java.util.LinkedHashMap<K, V> r1 = r4.f16050a     // Catch:{ all -> 0x0051 }
            java.lang.Object r1 = r1.put(r5, r0)     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x003a
            java.util.LinkedHashMap<K, V> r2 = r4.f16050a     // Catch:{ all -> 0x0051 }
            r2.put(r5, r1)     // Catch:{ all -> 0x0051 }
            goto L_0x0043
        L_0x003a:
            int r2 = r4.f16049a     // Catch:{ all -> 0x0051 }
            int r3 = r4.mo20276n(r5, r0)     // Catch:{ all -> 0x0051 }
            int r2 = r2 + r3
            r4.f16049a = r2     // Catch:{ all -> 0x0051 }
        L_0x0043:
            monitor-exit(r4)     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x004b
            r2 = 0
            r4.mo20265c(r2, r5, r0, r1)
            return r1
        L_0x004b:
            int r5 = r4.f16051b
            r4.mo20280r(r5)
            return r0
        L_0x0051:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0051 }
            throw r5
        L_0x0054:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0054 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.mb2.mo20268f(java.lang.Object):java.lang.Object");
    }

    /* renamed from: g */
    public final synchronized int mo20269g() {
        return this.f16055f;
    }

    /* renamed from: h */
    public final synchronized int mo20270h() {
        return this.f16051b;
    }

    /* renamed from: i */
    public final synchronized int mo20271i() {
        return this.f16056g;
    }

    @ts2
    /* renamed from: j */
    public final V mo20272j(@mr2 K k, @mr2 V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f16052c++;
            this.f16049a += mo20276n(k, v);
            put = this.f16050a.put(k, v);
            if (put != null) {
                this.f16049a -= mo20276n(k, put);
            }
        }
        if (put != null) {
            mo20265c(false, k, put, v);
        }
        mo20280r(this.f16051b);
        return put;
    }

    /* renamed from: k */
    public final synchronized int mo20273k() {
        return this.f16052c;
    }

    @ts2
    /* renamed from: l */
    public final V mo20274l(@mr2 K k) {
        V remove;
        Objects.requireNonNull(k, "key == null");
        synchronized (this) {
            remove = this.f16050a.remove(k);
            if (remove != null) {
                this.f16049a -= mo20276n(k, remove);
            }
        }
        if (remove != null) {
            mo20265c(false, k, remove, (V) null);
        }
        return remove;
    }

    /* renamed from: m */
    public void mo20275m(int i) {
        if (i > 0) {
            synchronized (this) {
                this.f16051b = i;
            }
            mo20280r(i);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: n */
    public final int mo20276n(K k, V v) {
        int p = mo20278p(k, v);
        if (p >= 0) {
            return p;
        }
        throw new IllegalStateException("Negative size: " + k + a13.f25713a + v);
    }

    /* renamed from: o */
    public final synchronized int mo20277o() {
        return this.f16049a;
    }

    /* renamed from: p */
    public int mo20278p(@mr2 K k, @mr2 V v) {
        return 1;
    }

    /* renamed from: q */
    public final synchronized Map<K, V> mo20279q() {
        return new LinkedHashMap(this.f16050a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo20280r(int r5) {
        /*
            r4 = this;
        L_0x0000:
            monitor-enter(r4)
            int r0 = r4.f16049a     // Catch:{ all -> 0x0071 }
            if (r0 < 0) goto L_0x0052
            java.util.LinkedHashMap<K, V> r0 = r4.f16050a     // Catch:{ all -> 0x0071 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x0011
            int r0 = r4.f16049a     // Catch:{ all -> 0x0071 }
            if (r0 != 0) goto L_0x0052
        L_0x0011:
            int r0 = r4.f16049a     // Catch:{ all -> 0x0071 }
            if (r0 <= r5) goto L_0x0050
            java.util.LinkedHashMap<K, V> r0 = r4.f16050a     // Catch:{ all -> 0x0071 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x001e
            goto L_0x0050
        L_0x001e:
            java.util.LinkedHashMap<K, V> r0 = r4.f16050a     // Catch:{ all -> 0x0071 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0071 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0071 }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x0071 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0071 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0071 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0071 }
            java.util.LinkedHashMap<K, V> r2 = r4.f16050a     // Catch:{ all -> 0x0071 }
            r2.remove(r1)     // Catch:{ all -> 0x0071 }
            int r2 = r4.f16049a     // Catch:{ all -> 0x0071 }
            int r3 = r4.mo20276n(r1, r0)     // Catch:{ all -> 0x0071 }
            int r2 = r2 - r3
            r4.f16049a = r2     // Catch:{ all -> 0x0071 }
            int r2 = r4.f16054e     // Catch:{ all -> 0x0071 }
            r3 = 1
            int r2 = r2 + r3
            r4.f16054e = r2     // Catch:{ all -> 0x0071 }
            monitor-exit(r4)     // Catch:{ all -> 0x0071 }
            r2 = 0
            r4.mo20265c(r3, r1, r0, r2)
            goto L_0x0000
        L_0x0050:
            monitor-exit(r4)     // Catch:{ all -> 0x0071 }
            return
        L_0x0052:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0071 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
            r0.<init>()     // Catch:{ all -> 0x0071 }
            java.lang.Class r1 = r4.getClass()     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0071 }
            r0.append(r1)     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch:{ all -> 0x0071 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0071 }
            r5.<init>(r0)     // Catch:{ all -> 0x0071 }
            throw r5     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0071 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.mb2.mo20280r(int):void");
    }

    public final synchronized String toString() {
        int i;
        int i2;
        i = this.f16055f;
        i2 = this.f16056g + i;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f16051b), Integer.valueOf(this.f16055f), Integer.valueOf(this.f16056g), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0)});
    }
}
