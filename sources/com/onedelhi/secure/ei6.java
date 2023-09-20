package com.onedelhi.secure;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

public abstract class ei6 {
    @Nullable

    /* renamed from: a */
    public static volatile fh6 f11237a = null;

    /* renamed from: a */
    public static final ii6 f11238a = new ii6(pg6.f18525a);

    /* renamed from: a */
    public static final AtomicInteger f11239a = new AtomicInteger();

    /* renamed from: a */
    public static final AtomicReference f11240a = new AtomicReference();

    /* renamed from: a */
    public static volatile boolean f11241a = false;

    /* renamed from: b */
    public static final /* synthetic */ int f11242b = 0;

    /* renamed from: c */
    public static final Object f11243c = new Object();

    /* renamed from: a */
    public volatile int f11244a = -1;

    /* renamed from: a */
    public final dh6 f11245a;

    /* renamed from: a */
    public final Object f11246a;

    /* renamed from: a */
    public final String f11247a;

    /* renamed from: b */
    public volatile Object f11248b;

    public /* synthetic */ ei6(dh6 dh6, String str, Object obj, boolean z, ci6 ci6) {
        if (dh6.f10750a != null) {
            this.f11245a = dh6;
            this.f11247a = str;
            this.f11246a = obj;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    /* renamed from: c */
    public static void m13800c() {
        f11239a.incrementAndGet();
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: d */
    public static void m13801d(android.content.Context r3) {
        /*
            com.onedelhi.secure.fh6 r0 = f11237a
            if (r0 != 0) goto L_0x0048
            if (r3 != 0) goto L_0x0007
            goto L_0x0048
        L_0x0007:
            java.lang.Object r0 = f11243c
            monitor-enter(r0)
            com.onedelhi.secure.fh6 r1 = f11237a     // Catch:{ all -> 0x0045 }
            if (r1 != 0) goto L_0x0043
            monitor-enter(r0)     // Catch:{ all -> 0x0045 }
            com.onedelhi.secure.fh6 r1 = f11237a     // Catch:{ all -> 0x0040 }
            android.content.Context r2 = r3.getApplicationContext()     // Catch:{ all -> 0x0040 }
            if (r2 == 0) goto L_0x0018
            r3 = r2
        L_0x0018:
            if (r1 == 0) goto L_0x0020
            android.content.Context r1 = r1.mo15954a()     // Catch:{ all -> 0x0040 }
            if (r1 == r3) goto L_0x003e
        L_0x0020:
            com.onedelhi.secure.ze6.m33096e()     // Catch:{ all -> 0x0040 }
            com.onedelhi.secure.gi6.m15866c()     // Catch:{ all -> 0x0040 }
            com.onedelhi.secure.xf6.m31426e()     // Catch:{ all -> 0x0040 }
            com.onedelhi.secure.mg6 r1 = new com.onedelhi.secure.mg6     // Catch:{ all -> 0x0040 }
            r1.<init>(r3)     // Catch:{ all -> 0x0040 }
            com.onedelhi.secure.aj6 r1 = com.onedelhi.secure.kj6.m19823a(r1)     // Catch:{ all -> 0x0040 }
            com.onedelhi.secure.qe6 r2 = new com.onedelhi.secure.qe6     // Catch:{ all -> 0x0040 }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x0040 }
            f11237a = r2     // Catch:{ all -> 0x0040 }
            java.util.concurrent.atomic.AtomicInteger r3 = f11239a     // Catch:{ all -> 0x0040 }
            r3.incrementAndGet()     // Catch:{ all -> 0x0040 }
        L_0x003e:
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            goto L_0x0043
        L_0x0040:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            throw r3     // Catch:{ all -> 0x0045 }
        L_0x0043:
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            return
        L_0x0045:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            throw r3
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ei6.m13801d(android.content.Context):void");
    }

    /* renamed from: a */
    public abstract Object mo13705a(Object obj);

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00bd  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo15196b() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = f11239a
            int r0 = r0.get()
            int r1 = r8.f11244a
            if (r1 >= r0) goto L_0x00c8
            monitor-enter(r8)
            int r1 = r8.f11244a     // Catch:{ all -> 0x00c5 }
            if (r1 >= r0) goto L_0x00c3
            com.onedelhi.secure.fh6 r1 = f11237a     // Catch:{ all -> 0x00c5 }
            com.onedelhi.secure.si6 r2 = com.onedelhi.secure.si6.m27657c()     // Catch:{ all -> 0x00c5 }
            r3 = 0
            if (r1 == 0) goto L_0x003b
            com.onedelhi.secure.aj6 r2 = r1.mo15955b()     // Catch:{ all -> 0x00c5 }
            java.lang.Object r2 = r2.mo12477a()     // Catch:{ all -> 0x00c5 }
            com.onedelhi.secure.si6 r2 = (com.onedelhi.secure.si6) r2     // Catch:{ all -> 0x00c5 }
            boolean r4 = r2.mo19081b()     // Catch:{ all -> 0x00c5 }
            if (r4 == 0) goto L_0x003b
            java.lang.Object r4 = r2.mo19080a()     // Catch:{ all -> 0x00c5 }
            com.onedelhi.secure.ff6 r4 = (com.onedelhi.secure.ff6) r4     // Catch:{ all -> 0x00c5 }
            com.onedelhi.secure.dh6 r5 = r8.f11245a     // Catch:{ all -> 0x00c5 }
            android.net.Uri r6 = r5.f10750a     // Catch:{ all -> 0x00c5 }
            java.lang.String r5 = r5.f10753b     // Catch:{ all -> 0x00c5 }
            java.lang.String r7 = r8.f11247a     // Catch:{ all -> 0x00c5 }
            java.lang.String r4 = r4.mo15950a(r6, r3, r5, r7)     // Catch:{ all -> 0x00c5 }
            goto L_0x003c
        L_0x003b:
            r4 = r3
        L_0x003c:
            java.lang.String r5 = "Must call PhenotypeFlag.init() first"
            if (r1 == 0) goto L_0x00bd
            com.onedelhi.secure.dh6 r5 = r8.f11245a     // Catch:{ all -> 0x00c5 }
            android.net.Uri r5 = r5.f10750a     // Catch:{ all -> 0x00c5 }
            if (r5 == 0) goto L_0x0065
            android.content.Context r6 = r1.mo15954a()     // Catch:{ all -> 0x00c5 }
            boolean r5 = com.onedelhi.secure.dg6.m13106a(r6, r5)     // Catch:{ all -> 0x00c5 }
            if (r5 == 0) goto L_0x0063
            android.content.Context r5 = r1.mo15954a()     // Catch:{ all -> 0x00c5 }
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch:{ all -> 0x00c5 }
            com.onedelhi.secure.dh6 r6 = r8.f11245a     // Catch:{ all -> 0x00c5 }
            android.net.Uri r6 = r6.f10750a     // Catch:{ all -> 0x00c5 }
            com.onedelhi.secure.jg6 r7 = com.onedelhi.secure.jg6.f14142a     // Catch:{ all -> 0x00c5 }
            com.onedelhi.secure.ze6 r5 = com.onedelhi.secure.ze6.m33095b(r5, r6, r7)     // Catch:{ all -> 0x00c5 }
            goto L_0x006f
        L_0x0063:
            r5 = r3
            goto L_0x006f
        L_0x0065:
            android.content.Context r5 = r1.mo15954a()     // Catch:{ all -> 0x00c5 }
            com.onedelhi.secure.jg6 r6 = com.onedelhi.secure.jg6.f14142a     // Catch:{ all -> 0x00c5 }
            com.onedelhi.secure.gi6 r5 = com.onedelhi.secure.gi6.m15865b(r5, r3, r6)     // Catch:{ all -> 0x00c5 }
        L_0x006f:
            if (r5 == 0) goto L_0x007e
            java.lang.String r6 = r8.f11247a     // Catch:{ all -> 0x00c5 }
            java.lang.Object r5 = r5.mo16663a(r6)     // Catch:{ all -> 0x00c5 }
            if (r5 == 0) goto L_0x007e
            java.lang.Object r5 = r8.mo13705a(r5)     // Catch:{ all -> 0x00c5 }
            goto L_0x007f
        L_0x007e:
            r5 = r3
        L_0x007f:
            if (r5 != 0) goto L_0x00a9
            com.onedelhi.secure.dh6 r5 = r8.f11245a     // Catch:{ all -> 0x00c5 }
            boolean r5 = r5.f10752a     // Catch:{ all -> 0x00c5 }
            if (r5 != 0) goto L_0x00a3
            android.content.Context r1 = r1.mo15954a()     // Catch:{ all -> 0x00c5 }
            com.onedelhi.secure.xf6 r1 = com.onedelhi.secure.xf6.m31425b(r1)     // Catch:{ all -> 0x00c5 }
            com.onedelhi.secure.dh6 r5 = r8.f11245a     // Catch:{ all -> 0x00c5 }
            boolean r5 = r5.f10752a     // Catch:{ all -> 0x00c5 }
            if (r5 == 0) goto L_0x0097
            r5 = r3
            goto L_0x0099
        L_0x0097:
            java.lang.String r5 = r8.f11247a     // Catch:{ all -> 0x00c5 }
        L_0x0099:
            java.lang.String r1 = r1.mo16663a(r5)     // Catch:{ all -> 0x00c5 }
            if (r1 == 0) goto L_0x00a3
            java.lang.Object r3 = r8.mo13705a(r1)     // Catch:{ all -> 0x00c5 }
        L_0x00a3:
            if (r3 != 0) goto L_0x00a8
            java.lang.Object r5 = r8.f11246a     // Catch:{ all -> 0x00c5 }
            goto L_0x00a9
        L_0x00a8:
            r5 = r3
        L_0x00a9:
            boolean r1 = r2.mo19081b()     // Catch:{ all -> 0x00c5 }
            if (r1 == 0) goto L_0x00b8
            if (r4 != 0) goto L_0x00b4
            java.lang.Object r5 = r8.f11246a     // Catch:{ all -> 0x00c5 }
            goto L_0x00b8
        L_0x00b4:
            java.lang.Object r5 = r8.mo13705a(r4)     // Catch:{ all -> 0x00c5 }
        L_0x00b8:
            r8.f11248b = r5     // Catch:{ all -> 0x00c5 }
            r8.f11244a = r0     // Catch:{ all -> 0x00c5 }
            goto L_0x00c3
        L_0x00bd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00c5 }
            r0.<init>(r5)     // Catch:{ all -> 0x00c5 }
            throw r0     // Catch:{ all -> 0x00c5 }
        L_0x00c3:
            monitor-exit(r8)     // Catch:{ all -> 0x00c5 }
            goto L_0x00c8
        L_0x00c5:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00c5 }
            throw r0
        L_0x00c8:
            java.lang.Object r0 = r8.f11248b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ei6.mo15196b():java.lang.Object");
    }
}
