package com.onedelhi.secure;

public class p61 extends e41 {

    /* renamed from: a */
    public final C6367a f33464a;

    /* renamed from: com.onedelhi.secure.p61$a */
    public enum C6367a {
        UNKNOWN(0),
        CONFIG_UPDATE_STREAM_ERROR(1),
        CONFIG_UPDATE_MESSAGE_INVALID(2),
        CONFIG_UPDATE_NOT_FETCHED(3),
        CONFIG_UPDATE_UNAVAILABLE(4);
        

        /* renamed from: n */
        public final int f33471n;

        /* access modifiers changed from: public */
        C6367a(int i) {
            this.f33471n = i;
        }

        /* renamed from: a */
        public int mo42377a() {
            return this.f33471n;
        }
    }

    public p61(@mr2 String str) {
        super(str);
        this.f33464a = C6367a.UNKNOWN;
    }

    public p61(@mr2 String str, @mr2 C6367a aVar) {
        super(str);
        this.f33464a = aVar;
    }

    public p61(@mr2 String str, @ts2 Throwable th) {
        super(str, th);
        this.f33464a = C6367a.UNKNOWN;
    }

    public p61(@mr2 String str, @ts2 Throwable th, @mr2 C6367a aVar) {
        super(str, th);
        this.f33464a = aVar;
    }

    @mr2
    /* renamed from: a */
    public C6367a mo42376a() {
        return this.f33464a;
    }
}
