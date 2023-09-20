package com.onedelhi.secure;

public class ir6 {

    /* renamed from: a */
    public static final oo6 f13808a = oo6.f18059b;

    /* renamed from: a */
    public volatile on6 f13809a;

    /* renamed from: a */
    public volatile vs6 f13810a;

    /* renamed from: a */
    public final int mo17946a() {
        if (this.f13809a != null) {
            return ((pm6) this.f13809a).f18618a.length;
        }
        if (this.f13810a != null) {
            return this.f13810a.mo18536b();
        }
        return 0;
    }

    /* renamed from: b */
    public final on6 mo17947b() {
        if (this.f13809a != null) {
            return this.f13809a;
        }
        synchronized (this) {
            if (this.f13809a != null) {
                on6 on6 = this.f13809a;
                return on6;
            }
            this.f13809a = this.f13810a == null ? on6.f18031a : this.f13810a.mo22496c();
            on6 on62 = this.f13809a;
            return on62;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17948c(com.onedelhi.secure.vs6 r2) {
        /*
            r1 = this;
            com.onedelhi.secure.vs6 r0 = r1.f13810a
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            com.onedelhi.secure.vs6 r0 = r1.f13810a     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.f13810a = r2     // Catch:{ dr6 -> 0x0011 }
            com.onedelhi.secure.on6 r0 = com.onedelhi.secure.on6.f18031a     // Catch:{ dr6 -> 0x0011 }
            r1.f13809a = r0     // Catch:{ dr6 -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.f13810a = r2     // Catch:{ all -> 0x001b }
            com.onedelhi.secure.on6 r2 = com.onedelhi.secure.on6.f18031a     // Catch:{ all -> 0x001b }
            r1.f13809a = r2     // Catch:{ all -> 0x001b }
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ir6.mo17948c(com.onedelhi.secure.vs6):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ir6)) {
            return false;
        }
        ir6 ir6 = (ir6) obj;
        vs6 vs6 = this.f13810a;
        vs6 vs62 = ir6.f13810a;
        if (vs6 == null && vs62 == null) {
            return mo17947b().equals(ir6.mo17947b());
        }
        if (vs6 != null && vs62 != null) {
            return vs6.equals(vs62);
        }
        if (vs6 != null) {
            ir6.mo17948c(vs6.mo17915d());
            return vs6.equals(ir6.f13810a);
        }
        mo17948c(vs62.mo17915d());
        return this.f13810a.equals(vs62);
    }

    public int hashCode() {
        return 1;
    }
}
