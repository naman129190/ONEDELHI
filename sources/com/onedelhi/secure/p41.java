package com.onedelhi.secure;

public class p41 extends e41 {
    @mr2

    /* renamed from: a */
    public final C6364a f33453a;

    /* renamed from: com.onedelhi.secure.p41$a */
    public enum C6364a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public p41(@mr2 C6364a aVar) {
        this.f33453a = aVar;
    }

    public p41(@mr2 String str, @mr2 C6364a aVar) {
        super(str);
        this.f33453a = aVar;
    }

    public p41(@mr2 String str, @mr2 C6364a aVar, @mr2 Throwable th) {
        super(str, th);
        this.f33453a = aVar;
    }

    @mr2
    /* renamed from: a */
    public C6364a mo42360a() {
        return this.f33453a;
    }
}
