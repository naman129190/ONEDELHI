package com.onedelhi.secure;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

public abstract class iy5 {
    @Nullable

    /* renamed from: a */
    public static volatile ay5 f13943a = null;

    /* renamed from: a */
    public static final qy5 f13944a = new qy5(zv5.f23919a, (byte[]) null);

    /* renamed from: a */
    public static final AtomicInteger f13945a = new AtomicInteger();

    /* renamed from: a */
    public static final AtomicReference f13946a = new AtomicReference();

    /* renamed from: b */
    public static final /* synthetic */ int f13947b = 0;

    /* renamed from: b */
    public static volatile boolean f13948b = false;

    /* renamed from: c */
    public static final Object f13949c = new Object();

    /* renamed from: a */
    public volatile int f13950a = -1;

    /* renamed from: a */
    public final tw5 f13951a;

    /* renamed from: a */
    public final Object f13952a;

    /* renamed from: a */
    public final String f13953a;

    /* renamed from: a */
    public final boolean f13954a;

    /* renamed from: b */
    public volatile Object f13955b;

    public /* synthetic */ iy5(tw5 tw5, String str, Object obj, boolean z, ey5 ey5) {
        if (tw5.f21151a != null) {
            this.f13951a = tw5;
            this.f13953a = str;
            this.f13952a = obj;
            this.f13954a = true;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    /* renamed from: d */
    public static void m18041d() {
        f13945a.incrementAndGet();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: e */
    public static void m18042e(android.content.Context r3) {
        /*
            com.onedelhi.secure.ay5 r0 = f13943a
            if (r0 != 0) goto L_0x0045
            java.lang.Object r0 = f13949c
            monitor-enter(r0)
            com.onedelhi.secure.ay5 r1 = f13943a     // Catch:{ all -> 0x0042 }
            if (r1 != 0) goto L_0x0040
            monitor-enter(r0)     // Catch:{ all -> 0x0042 }
            com.onedelhi.secure.ay5 r1 = f13943a     // Catch:{ all -> 0x003d }
            android.content.Context r2 = r3.getApplicationContext()     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x0015
            r3 = r2
        L_0x0015:
            if (r1 == 0) goto L_0x001d
            android.content.Context r1 = r1.mo13328a()     // Catch:{ all -> 0x003d }
            if (r1 == r3) goto L_0x003b
        L_0x001d:
            com.onedelhi.secure.vt5.m30444d()     // Catch:{ all -> 0x003d }
            com.onedelhi.secure.my5.m22223c()     // Catch:{ all -> 0x003d }
            com.onedelhi.secure.bv5.m12099e()     // Catch:{ all -> 0x003d }
            com.onedelhi.secure.vv5 r1 = new com.onedelhi.secure.vv5     // Catch:{ all -> 0x003d }
            r1.<init>(r3)     // Catch:{ all -> 0x003d }
            com.onedelhi.secure.kz5 r1 = com.onedelhi.secure.a06.m10533a(r1)     // Catch:{ all -> 0x003d }
            com.onedelhi.secure.jt5 r2 = new com.onedelhi.secure.jt5     // Catch:{ all -> 0x003d }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x003d }
            f13943a = r2     // Catch:{ all -> 0x003d }
            java.util.concurrent.atomic.AtomicInteger r3 = f13945a     // Catch:{ all -> 0x003d }
            r3.incrementAndGet()     // Catch:{ all -> 0x003d }
        L_0x003b:
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            goto L_0x0040
        L_0x003d:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            throw r3     // Catch:{ all -> 0x0042 }
        L_0x0040:
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            return
        L_0x0042:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            throw r3
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.iy5.m18042e(android.content.Context):void");
    }

    /* renamed from: a */
    public abstract Object mo14923a(Object obj);

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        r2 = r2.mo13831a(mo18066c());
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0099  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo18065b() {
        /*
            r6 = this;
            boolean r0 = r6.f13954a
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = r6.f13953a
            java.lang.String r1 = "flagName must not be null"
            java.util.Objects.requireNonNull(r0, r1)
        L_0x000b:
            java.util.concurrent.atomic.AtomicInteger r0 = f13945a
            int r0 = r0.get()
            int r1 = r6.f13950a
            if (r1 >= r0) goto L_0x00d6
            monitor-enter(r6)
            int r1 = r6.f13950a     // Catch:{ all -> 0x00d3 }
            if (r1 >= r0) goto L_0x00d1
            com.onedelhi.secure.ay5 r1 = f13943a     // Catch:{ all -> 0x00d3 }
            java.lang.String r2 = "Must call PhenotypeFlag.init() first"
            if (r1 == 0) goto L_0x00cb
            com.onedelhi.secure.tw5 r2 = r6.f13951a     // Catch:{ all -> 0x00d3 }
            boolean r3 = r2.f21156b     // Catch:{ all -> 0x00d3 }
            android.net.Uri r2 = r2.f21151a     // Catch:{ all -> 0x00d3 }
            r3 = 0
            if (r2 == 0) goto L_0x0050
            android.content.Context r2 = r1.mo13328a()     // Catch:{ all -> 0x00d3 }
            com.onedelhi.secure.tw5 r4 = r6.f13951a     // Catch:{ all -> 0x00d3 }
            android.net.Uri r4 = r4.f21151a     // Catch:{ all -> 0x00d3 }
            boolean r2 = com.onedelhi.secure.jv5.m19216a(r2, r4)     // Catch:{ all -> 0x00d3 }
            if (r2 == 0) goto L_0x004e
            com.onedelhi.secure.tw5 r2 = r6.f13951a     // Catch:{ all -> 0x00d3 }
            boolean r2 = r2.f21159d     // Catch:{ all -> 0x00d3 }
            android.content.Context r2 = r1.mo13328a()     // Catch:{ all -> 0x00d3 }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ all -> 0x00d3 }
            com.onedelhi.secure.tw5 r4 = r6.f13951a     // Catch:{ all -> 0x00d3 }
            android.net.Uri r4 = r4.f21151a     // Catch:{ all -> 0x00d3 }
            com.onedelhi.secure.rv5 r5 = com.onedelhi.secure.rv5.f20103a     // Catch:{ all -> 0x00d3 }
            com.onedelhi.secure.vt5 r2 = com.onedelhi.secure.vt5.m30443b(r2, r4, r5)     // Catch:{ all -> 0x00d3 }
            goto L_0x005e
        L_0x004e:
            r2 = r3
            goto L_0x005e
        L_0x0050:
            android.content.Context r2 = r1.mo13328a()     // Catch:{ all -> 0x00d3 }
            com.onedelhi.secure.tw5 r4 = r6.f13951a     // Catch:{ all -> 0x00d3 }
            java.lang.String r4 = r4.f21153a     // Catch:{ all -> 0x00d3 }
            com.onedelhi.secure.rv5 r4 = com.onedelhi.secure.rv5.f20103a     // Catch:{ all -> 0x00d3 }
            com.onedelhi.secure.my5 r2 = com.onedelhi.secure.my5.m22222b(r2, r3, r4)     // Catch:{ all -> 0x00d3 }
        L_0x005e:
            if (r2 == 0) goto L_0x006f
            java.lang.String r4 = r6.mo18066c()     // Catch:{ all -> 0x00d3 }
            java.lang.Object r2 = r2.mo13831a(r4)     // Catch:{ all -> 0x00d3 }
            if (r2 == 0) goto L_0x006f
            java.lang.Object r2 = r6.mo14923a(r2)     // Catch:{ all -> 0x00d3 }
            goto L_0x0070
        L_0x006f:
            r2 = r3
        L_0x0070:
            if (r2 == 0) goto L_0x0073
            goto L_0x009b
        L_0x0073:
            com.onedelhi.secure.tw5 r2 = r6.f13951a     // Catch:{ all -> 0x00d3 }
            boolean r2 = r2.f21154a     // Catch:{ all -> 0x00d3 }
            if (r2 != 0) goto L_0x0096
            android.content.Context r2 = r1.mo13328a()     // Catch:{ all -> 0x00d3 }
            com.onedelhi.secure.bv5 r2 = com.onedelhi.secure.bv5.m12098b(r2)     // Catch:{ all -> 0x00d3 }
            com.onedelhi.secure.tw5 r4 = r6.f13951a     // Catch:{ all -> 0x00d3 }
            boolean r4 = r4.f21154a     // Catch:{ all -> 0x00d3 }
            if (r4 == 0) goto L_0x0089
            r4 = r3
            goto L_0x008b
        L_0x0089:
            java.lang.String r4 = r6.f13953a     // Catch:{ all -> 0x00d3 }
        L_0x008b:
            java.lang.String r2 = r2.mo13831a(r4)     // Catch:{ all -> 0x00d3 }
            if (r2 == 0) goto L_0x0096
            java.lang.Object r2 = r6.mo14923a(r2)     // Catch:{ all -> 0x00d3 }
            goto L_0x0097
        L_0x0096:
            r2 = r3
        L_0x0097:
            if (r2 != 0) goto L_0x009b
            java.lang.Object r2 = r6.f13952a     // Catch:{ all -> 0x00d3 }
        L_0x009b:
            com.onedelhi.secure.kz5 r1 = r1.mo13329b()     // Catch:{ all -> 0x00d3 }
            java.lang.Object r1 = r1.mo19246a()     // Catch:{ all -> 0x00d3 }
            com.onedelhi.secure.cz5 r1 = (com.onedelhi.secure.cz5) r1     // Catch:{ all -> 0x00d3 }
            boolean r4 = r1.mo14444b()     // Catch:{ all -> 0x00d3 }
            if (r4 == 0) goto L_0x00c6
            java.lang.Object r1 = r1.mo14443a()     // Catch:{ all -> 0x00d3 }
            com.onedelhi.secure.du5 r1 = (com.onedelhi.secure.du5) r1     // Catch:{ all -> 0x00d3 }
            com.onedelhi.secure.tw5 r2 = r6.f13951a     // Catch:{ all -> 0x00d3 }
            android.net.Uri r4 = r2.f21151a     // Catch:{ all -> 0x00d3 }
            java.lang.String r2 = r2.f21157c     // Catch:{ all -> 0x00d3 }
            java.lang.String r5 = r6.f13953a     // Catch:{ all -> 0x00d3 }
            java.lang.String r1 = r1.mo14860a(r4, r3, r2, r5)     // Catch:{ all -> 0x00d3 }
            if (r1 != 0) goto L_0x00c2
            java.lang.Object r2 = r6.f13952a     // Catch:{ all -> 0x00d3 }
            goto L_0x00c6
        L_0x00c2:
            java.lang.Object r2 = r6.mo14923a(r1)     // Catch:{ all -> 0x00d3 }
        L_0x00c6:
            r6.f13955b = r2     // Catch:{ all -> 0x00d3 }
            r6.f13950a = r0     // Catch:{ all -> 0x00d3 }
            goto L_0x00d1
        L_0x00cb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00d3 }
            r0.<init>(r2)     // Catch:{ all -> 0x00d3 }
            throw r0     // Catch:{ all -> 0x00d3 }
        L_0x00d1:
            monitor-exit(r6)     // Catch:{ all -> 0x00d3 }
            goto L_0x00d6
        L_0x00d3:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00d3 }
            throw r0
        L_0x00d6:
            java.lang.Object r0 = r6.f13955b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.iy5.mo18065b():java.lang.Object");
    }

    /* renamed from: c */
    public final String mo18066c() {
        String str = this.f13951a.f21157c;
        return this.f13953a;
    }
}
