package com.onedelhi.secure;

public class su0<Z> implements ck3<Z> {

    /* renamed from: a */
    public final ck3<Z> f20511a;

    /* renamed from: a */
    public final ky1 f20512a;

    /* renamed from: a */
    public final C3544a f20513a;

    /* renamed from: b */
    public final boolean f20514b;

    /* renamed from: c */
    public final boolean f20515c;

    /* renamed from: d */
    public boolean f20516d;

    /* renamed from: n */
    public int f20517n;

    /* renamed from: com.onedelhi.secure.su0$a */
    public interface C3544a {
        /* renamed from: a */
        void mo21473a(ky1 ky1, su0<?> su0);
    }

    public su0(ck3<Z> ck3, boolean z, boolean z2, ky1 ky1, C3544a aVar) {
        this.f20511a = (ck3) g43.m15509d(ck3);
        this.f20514b = z;
        this.f20515c = z2;
        this.f20512a = ky1;
        this.f20513a = (C3544a) g43.m15509d(aVar);
    }

    /* renamed from: a */
    public synchronized void mo13177a() {
        if (this.f20517n > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.f20516d) {
            this.f20516d = true;
            if (this.f20515c) {
                this.f20511a.mo13177a();
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }

    /* renamed from: b */
    public synchronized void mo24547b() {
        if (!this.f20516d) {
            this.f20517n++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    /* renamed from: c */
    public int mo13179c() {
        return this.f20511a.mo13179c();
    }

    @mr2
    /* renamed from: d */
    public Class<Z> mo13180d() {
        return this.f20511a.mo13180d();
    }

    /* renamed from: e */
    public ck3<Z> mo24548e() {
        return this.f20511a;
    }

    /* renamed from: f */
    public boolean mo24549f() {
        return this.f20514b;
    }

    /* renamed from: g */
    public void mo24550g() {
        boolean z;
        synchronized (this) {
            int i = this.f20517n;
            if (i > 0) {
                z = true;
                int i2 = i - 1;
                this.f20517n = i2;
                if (i2 != 0) {
                    z = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z) {
            this.f20513a.mo21473a(this.f20512a, this);
        }
    }

    @mr2
    public Z get() {
        return this.f20511a.get();
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f20514b + ", listener=" + this.f20513a + ", key=" + this.f20512a + ", acquired=" + this.f20517n + ", isRecycled=" + this.f20516d + ", resource=" + this.f20511a + '}';
    }
}
