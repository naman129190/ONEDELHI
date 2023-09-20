package com.onedelhi.secure;

import com.onedelhi.secure.vi3;

public final class ov0 implements vi3, si3 {

    /* renamed from: a */
    public volatile si3 f18133a;
    @mj1("requestLock")

    /* renamed from: a */
    public vi3.C3789a f18134a;
    @ts2

    /* renamed from: a */
    public final vi3 f18135a;

    /* renamed from: a */
    public final Object f18136a;

    /* renamed from: b */
    public volatile si3 f18137b;
    @mj1("requestLock")

    /* renamed from: b */
    public vi3.C3789a f18138b;

    public ov0(Object obj, @ts2 vi3 vi3) {
        vi3.C3789a aVar = vi3.C3789a.CLEARED;
        this.f18134a = aVar;
        this.f18138b = aVar;
        this.f18136a = obj;
        this.f18135a = vi3;
    }

    /* renamed from: a */
    public vi3 mo22097a() {
        vi3 a;
        synchronized (this.f18136a) {
            vi3 vi3 = this.f18135a;
            a = vi3 != null ? vi3.mo22097a() : this;
        }
        return a;
    }

    /* renamed from: b */
    public boolean mo19955b() {
        boolean z;
        synchronized (this.f18136a) {
            if (!this.f18133a.mo19955b()) {
                if (!this.f18137b.mo19955b()) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: c */
    public void mo22098c(si3 si3) {
        synchronized (this.f18136a) {
            if (si3.equals(this.f18133a)) {
                this.f18134a = vi3.C3789a.SUCCESS;
            } else if (si3.equals(this.f18137b)) {
                this.f18138b = vi3.C3789a.SUCCESS;
            }
            vi3 vi3 = this.f18135a;
            if (vi3 != null) {
                vi3.mo22098c(this);
            }
        }
    }

    public void clear() {
        synchronized (this.f18136a) {
            vi3.C3789a aVar = vi3.C3789a.CLEARED;
            this.f18134a = aVar;
            this.f18133a.clear();
            if (this.f18138b != aVar) {
                this.f18138b = aVar;
                this.f18137b.clear();
            }
        }
    }

    /* renamed from: d */
    public void mo19957d() {
        synchronized (this.f18136a) {
            vi3.C3789a aVar = this.f18134a;
            vi3.C3789a aVar2 = vi3.C3789a.RUNNING;
            if (aVar != aVar2) {
                this.f18134a = aVar2;
                this.f18133a.mo19957d();
            }
        }
    }

    /* renamed from: e */
    public boolean mo22099e(si3 si3) {
        boolean z;
        synchronized (this.f18136a) {
            z = mo22105n() && mo22103l(si3);
        }
        return z;
    }

    /* renamed from: f */
    public boolean mo19959f(si3 si3) {
        if (!(si3 instanceof ov0)) {
            return false;
        }
        ov0 ov0 = (ov0) si3;
        return this.f18133a.mo19959f(ov0.f18133a) && this.f18137b.mo19959f(ov0.f18137b);
    }

    /* renamed from: g */
    public boolean mo22100g(si3 si3) {
        boolean z;
        synchronized (this.f18136a) {
            z = mo22104m() && mo22103l(si3);
        }
        return z;
    }

    /* renamed from: h */
    public boolean mo19960h() {
        boolean z;
        synchronized (this.f18136a) {
            vi3.C3789a aVar = this.f18134a;
            vi3.C3789a aVar2 = vi3.C3789a.SUCCESS;
            if (aVar != aVar2) {
                if (this.f18138b != aVar2) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        return;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo22101i(com.onedelhi.secure.si3 r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f18136a
            monitor-enter(r0)
            com.onedelhi.secure.si3 r1 = r2.f18137b     // Catch:{ all -> 0x002b }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x002b }
            if (r3 != 0) goto L_0x001e
            com.onedelhi.secure.vi3$a r3 = com.onedelhi.secure.vi3.C3789a.FAILED     // Catch:{ all -> 0x002b }
            r2.f18134a = r3     // Catch:{ all -> 0x002b }
            com.onedelhi.secure.vi3$a r3 = r2.f18138b     // Catch:{ all -> 0x002b }
            com.onedelhi.secure.vi3$a r1 = com.onedelhi.secure.vi3.C3789a.RUNNING     // Catch:{ all -> 0x002b }
            if (r3 == r1) goto L_0x001c
            r2.f18138b = r1     // Catch:{ all -> 0x002b }
            com.onedelhi.secure.si3 r3 = r2.f18137b     // Catch:{ all -> 0x002b }
            r3.mo19957d()     // Catch:{ all -> 0x002b }
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x001e:
            com.onedelhi.secure.vi3$a r3 = com.onedelhi.secure.vi3.C3789a.FAILED     // Catch:{ all -> 0x002b }
            r2.f18138b = r3     // Catch:{ all -> 0x002b }
            com.onedelhi.secure.vi3 r3 = r2.f18135a     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x0029
            r3.mo22101i(r2)     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ov0.mo22101i(com.onedelhi.secure.si3):void");
    }

    public boolean isRunning() {
        boolean z;
        synchronized (this.f18136a) {
            vi3.C3789a aVar = this.f18134a;
            vi3.C3789a aVar2 = vi3.C3789a.RUNNING;
            if (aVar != aVar2) {
                if (this.f18138b != aVar2) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: j */
    public boolean mo22102j(si3 si3) {
        boolean z;
        synchronized (this.f18136a) {
            z = mo22106o() && mo22103l(si3);
        }
        return z;
    }

    /* renamed from: k */
    public boolean mo19964k() {
        boolean z;
        synchronized (this.f18136a) {
            vi3.C3789a aVar = this.f18134a;
            vi3.C3789a aVar2 = vi3.C3789a.CLEARED;
            z = aVar == aVar2 && this.f18138b == aVar2;
        }
        return z;
    }

    @mj1("requestLock")
    /* renamed from: l */
    public final boolean mo22103l(si3 si3) {
        return si3.equals(this.f18133a) || (this.f18134a == vi3.C3789a.FAILED && si3.equals(this.f18137b));
    }

    @mj1("requestLock")
    /* renamed from: m */
    public final boolean mo22104m() {
        vi3 vi3 = this.f18135a;
        return vi3 == null || vi3.mo22100g(this);
    }

    @mj1("requestLock")
    /* renamed from: n */
    public final boolean mo22105n() {
        vi3 vi3 = this.f18135a;
        return vi3 == null || vi3.mo22099e(this);
    }

    @mj1("requestLock")
    /* renamed from: o */
    public final boolean mo22106o() {
        vi3 vi3 = this.f18135a;
        return vi3 == null || vi3.mo22102j(this);
    }

    /* renamed from: p */
    public void mo22107p(si3 si3, si3 si32) {
        this.f18133a = si3;
        this.f18137b = si32;
    }

    /* renamed from: u0 */
    public void mo19974u0() {
        synchronized (this.f18136a) {
            vi3.C3789a aVar = this.f18134a;
            vi3.C3789a aVar2 = vi3.C3789a.RUNNING;
            if (aVar == aVar2) {
                this.f18134a = vi3.C3789a.PAUSED;
                this.f18133a.mo19974u0();
            }
            if (this.f18138b == aVar2) {
                this.f18138b = vi3.C3789a.PAUSED;
                this.f18137b.mo19974u0();
            }
        }
    }
}
