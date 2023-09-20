package com.onedelhi.secure;

import com.google.firebase.remoteconfig.internal.C4370c;

public class t61 {

    /* renamed from: a */
    public final long f35427a;

    /* renamed from: b */
    public final long f35428b;

    /* renamed from: com.onedelhi.secure.t61$b */
    public static class C6839b {

        /* renamed from: a */
        public long f35429a = 60;

        /* renamed from: b */
        public long f35430b = C4370c.f25350a;

        @mr2
        /* renamed from: c */
        public t61 mo44927c() {
            return new t61(this);
        }

        /* renamed from: d */
        public long mo44928d() {
            return this.f35429a;
        }

        /* renamed from: e */
        public long mo44929e() {
            return this.f35430b;
        }

        @mr2
        /* renamed from: f */
        public C6839b mo44930f(long j) throws IllegalArgumentException {
            if (j >= 0) {
                this.f35429a = j;
                return this;
            }
            throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", new Object[]{Long.valueOf(j)}));
        }

        @mr2
        /* renamed from: g */
        public C6839b mo44931g(long j) {
            if (j >= 0) {
                this.f35430b = j;
                return this;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j + " is an invalid argument");
        }
    }

    public t61(C6839b bVar) {
        this.f35427a = bVar.f35429a;
        this.f35428b = bVar.f35430b;
    }

    /* renamed from: a */
    public long mo44924a() {
        return this.f35427a;
    }

    /* renamed from: b */
    public long mo44925b() {
        return this.f35428b;
    }

    @mr2
    /* renamed from: c */
    public C6839b mo44926c() {
        C6839b bVar = new C6839b();
        bVar.mo44930f(mo44924a());
        bVar.mo44931g(mo44925b());
        return bVar;
    }
}
