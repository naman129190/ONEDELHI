package com.onedelhi.secure;

import com.onedelhi.secure.vi3;

public class pc4 implements vi3, si3 {

    /* renamed from: a */
    public volatile si3 f18425a;
    @mj1("requestLock")

    /* renamed from: a */
    public vi3.C3789a f18426a;
    @ts2

    /* renamed from: a */
    public final vi3 f18427a;

    /* renamed from: a */
    public final Object f18428a;
    @mj1("requestLock")

    /* renamed from: a */
    public boolean f18429a;

    /* renamed from: b */
    public volatile si3 f18430b;
    @mj1("requestLock")

    /* renamed from: b */
    public vi3.C3789a f18431b;

    public pc4(Object obj, @ts2 vi3 vi3) {
        vi3.C3789a aVar = vi3.C3789a.CLEARED;
        this.f18426a = aVar;
        this.f18431b = aVar;
        this.f18428a = obj;
        this.f18427a = vi3;
    }

    /* renamed from: a */
    public vi3 mo22097a() {
        vi3 a;
        synchronized (this.f18428a) {
            vi3 vi3 = this.f18427a;
            a = vi3 != null ? vi3.mo22097a() : this;
        }
        return a;
    }

    /* renamed from: b */
    public boolean mo19955b() {
        boolean z;
        synchronized (this.f18428a) {
            if (!this.f18430b.mo19955b()) {
                if (!this.f18425a.mo19955b()) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo22098c(com.onedelhi.secure.si3 r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f18428a
            monitor-enter(r0)
            com.onedelhi.secure.si3 r1 = r2.f18430b     // Catch:{ all -> 0x002b }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x0011
            com.onedelhi.secure.vi3$a r3 = com.onedelhi.secure.vi3.C3789a.SUCCESS     // Catch:{ all -> 0x002b }
            r2.f18431b = r3     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x0011:
            com.onedelhi.secure.vi3$a r3 = com.onedelhi.secure.vi3.C3789a.SUCCESS     // Catch:{ all -> 0x002b }
            r2.f18426a = r3     // Catch:{ all -> 0x002b }
            com.onedelhi.secure.vi3 r3 = r2.f18427a     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x001c
            r3.mo22098c(r2)     // Catch:{ all -> 0x002b }
        L_0x001c:
            com.onedelhi.secure.vi3$a r3 = r2.f18431b     // Catch:{ all -> 0x002b }
            boolean r3 = r3.mo26096a()     // Catch:{ all -> 0x002b }
            if (r3 != 0) goto L_0x0029
            com.onedelhi.secure.si3 r3 = r2.f18430b     // Catch:{ all -> 0x002b }
            r3.clear()     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.pc4.mo22098c(com.onedelhi.secure.si3):void");
    }

    public void clear() {
        synchronized (this.f18428a) {
            this.f18429a = false;
            vi3.C3789a aVar = vi3.C3789a.CLEARED;
            this.f18426a = aVar;
            this.f18431b = aVar;
            this.f18430b.clear();
            this.f18425a.clear();
        }
    }

    /* renamed from: d */
    public void mo19957d() {
        vi3.C3789a aVar;
        vi3.C3789a aVar2;
        synchronized (this.f18428a) {
            this.f18429a = true;
            try {
                if (!(this.f18426a == vi3.C3789a.SUCCESS || this.f18431b == (aVar2 = vi3.C3789a.RUNNING))) {
                    this.f18431b = aVar2;
                    this.f18430b.mo19957d();
                }
                if (this.f18429a && this.f18426a != (aVar = vi3.C3789a.RUNNING)) {
                    this.f18426a = aVar;
                    this.f18425a.mo19957d();
                }
            } finally {
                this.f18429a = false;
            }
        }
    }

    /* renamed from: e */
    public boolean mo22099e(si3 si3) {
        boolean z;
        synchronized (this.f18428a) {
            z = mo22386m() && si3.equals(this.f18425a) && !mo19955b();
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo19959f(com.onedelhi.secure.si3 r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.onedelhi.secure.pc4
            r1 = 0
            if (r0 == 0) goto L_0x002e
            com.onedelhi.secure.pc4 r4 = (com.onedelhi.secure.pc4) r4
            com.onedelhi.secure.si3 r0 = r3.f18425a
            if (r0 != 0) goto L_0x0010
            com.onedelhi.secure.si3 r0 = r4.f18425a
            if (r0 != 0) goto L_0x002e
            goto L_0x001a
        L_0x0010:
            com.onedelhi.secure.si3 r0 = r3.f18425a
            com.onedelhi.secure.si3 r2 = r4.f18425a
            boolean r0 = r0.mo19959f(r2)
            if (r0 == 0) goto L_0x002e
        L_0x001a:
            com.onedelhi.secure.si3 r0 = r3.f18430b
            if (r0 != 0) goto L_0x0023
            com.onedelhi.secure.si3 r4 = r4.f18430b
            if (r4 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0023:
            com.onedelhi.secure.si3 r0 = r3.f18430b
            com.onedelhi.secure.si3 r4 = r4.f18430b
            boolean r4 = r0.mo19959f(r4)
            if (r4 == 0) goto L_0x002e
        L_0x002d:
            r1 = 1
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.pc4.mo19959f(com.onedelhi.secure.si3):boolean");
    }

    /* renamed from: g */
    public boolean mo22100g(si3 si3) {
        boolean z;
        synchronized (this.f18428a) {
            z = mo22385l() && si3.equals(this.f18425a) && this.f18426a != vi3.C3789a.PAUSED;
        }
        return z;
    }

    /* renamed from: h */
    public boolean mo19960h() {
        boolean z;
        synchronized (this.f18428a) {
            z = this.f18426a == vi3.C3789a.SUCCESS;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        return;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo22101i(com.onedelhi.secure.si3 r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f18428a
            monitor-enter(r0)
            com.onedelhi.secure.si3 r1 = r2.f18425a     // Catch:{ all -> 0x001e }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x001e }
            if (r3 != 0) goto L_0x0011
            com.onedelhi.secure.vi3$a r3 = com.onedelhi.secure.vi3.C3789a.FAILED     // Catch:{ all -> 0x001e }
            r2.f18431b = r3     // Catch:{ all -> 0x001e }
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x0011:
            com.onedelhi.secure.vi3$a r3 = com.onedelhi.secure.vi3.C3789a.FAILED     // Catch:{ all -> 0x001e }
            r2.f18426a = r3     // Catch:{ all -> 0x001e }
            com.onedelhi.secure.vi3 r3 = r2.f18427a     // Catch:{ all -> 0x001e }
            if (r3 == 0) goto L_0x001c
            r3.mo22101i(r2)     // Catch:{ all -> 0x001e }
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x001e:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.pc4.mo22101i(com.onedelhi.secure.si3):void");
    }

    public boolean isRunning() {
        boolean z;
        synchronized (this.f18428a) {
            z = this.f18426a == vi3.C3789a.RUNNING;
        }
        return z;
    }

    /* renamed from: j */
    public boolean mo22102j(si3 si3) {
        boolean z;
        synchronized (this.f18428a) {
            z = mo22387n() && (si3.equals(this.f18425a) || this.f18426a != vi3.C3789a.SUCCESS);
        }
        return z;
    }

    /* renamed from: k */
    public boolean mo19964k() {
        boolean z;
        synchronized (this.f18428a) {
            z = this.f18426a == vi3.C3789a.CLEARED;
        }
        return z;
    }

    @mj1("requestLock")
    /* renamed from: l */
    public final boolean mo22385l() {
        vi3 vi3 = this.f18427a;
        return vi3 == null || vi3.mo22100g(this);
    }

    @mj1("requestLock")
    /* renamed from: m */
    public final boolean mo22386m() {
        vi3 vi3 = this.f18427a;
        return vi3 == null || vi3.mo22099e(this);
    }

    @mj1("requestLock")
    /* renamed from: n */
    public final boolean mo22387n() {
        vi3 vi3 = this.f18427a;
        return vi3 == null || vi3.mo22102j(this);
    }

    /* renamed from: o */
    public void mo22388o(si3 si3, si3 si32) {
        this.f18425a = si3;
        this.f18430b = si32;
    }

    /* renamed from: u0 */
    public void mo19974u0() {
        synchronized (this.f18428a) {
            if (!this.f18431b.mo26096a()) {
                this.f18431b = vi3.C3789a.PAUSED;
                this.f18430b.mo19974u0();
            }
            if (!this.f18426a.mo26096a()) {
                this.f18426a = vi3.C3789a.PAUSED;
                this.f18425a.mo19974u0();
            }
        }
    }
}
