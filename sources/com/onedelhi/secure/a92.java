package com.onedelhi.secure;

public final class a92 {

    /* renamed from: a */
    public static final a92 f8906a = new C1671a().mo12864a();

    /* renamed from: a */
    public final long f8907a;

    /* renamed from: a */
    public final C1672b f8908a;

    /* renamed from: com.onedelhi.secure.a92$a */
    public static final class C1671a {

        /* renamed from: a */
        public long f8909a = 0;

        /* renamed from: a */
        public C1672b f8910a = C1672b.REASON_UNKNOWN;

        /* renamed from: a */
        public a92 mo12864a() {
            return new a92(this.f8909a, this.f8910a);
        }

        /* renamed from: b */
        public C1671a mo12865b(long j) {
            this.f8909a = j;
            return this;
        }

        /* renamed from: c */
        public C1671a mo12866c(C1672b bVar) {
            this.f8910a = bVar;
            return this;
        }
    }

    /* renamed from: com.onedelhi.secure.a92$b */
    public enum C1672b implements m63 {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        

        /* renamed from: n */
        public final int f8919n;

        /* access modifiers changed from: public */
        C1672b(int i) {
            this.f8919n = i;
        }

        /* renamed from: j */
        public int mo12867j() {
            return this.f8919n;
        }
    }

    public a92(long j, C1672b bVar) {
        this.f8907a = j;
        this.f8908a = bVar;
    }

    /* renamed from: a */
    public static a92 m10937a() {
        return f8906a;
    }

    /* renamed from: d */
    public static C1671a m10938d() {
        return new C1671a();
    }

    @o63(tag = 1)
    /* renamed from: b */
    public long mo12862b() {
        return this.f8907a;
    }

    @o63(tag = 3)
    /* renamed from: c */
    public C1672b mo12863c() {
        return this.f8908a;
    }
}
