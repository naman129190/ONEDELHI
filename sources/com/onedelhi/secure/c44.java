package com.onedelhi.secure;

public final class c44 {

    /* renamed from: a */
    public static final c44 f10101a = new C1842a().mo13971a();

    /* renamed from: a */
    public final long f10102a;

    /* renamed from: b */
    public final long f10103b;

    /* renamed from: com.onedelhi.secure.c44$a */
    public static final class C1842a {

        /* renamed from: a */
        public long f10104a = 0;

        /* renamed from: b */
        public long f10105b = 0;

        /* renamed from: a */
        public c44 mo13971a() {
            return new c44(this.f10104a, this.f10105b);
        }

        /* renamed from: b */
        public C1842a mo13972b(long j) {
            this.f10104a = j;
            return this;
        }

        /* renamed from: c */
        public C1842a mo13973c(long j) {
            this.f10105b = j;
            return this;
        }
    }

    public c44(long j, long j2) {
        this.f10102a = j;
        this.f10103b = j2;
    }

    /* renamed from: b */
    public static c44 m12297b() {
        return f10101a;
    }

    /* renamed from: d */
    public static C1842a m12298d() {
        return new C1842a();
    }

    @o63(tag = 1)
    /* renamed from: a */
    public long mo13969a() {
        return this.f10102a;
    }

    @o63(tag = 2)
    /* renamed from: c */
    public long mo13970c() {
        return this.f10103b;
    }
}
