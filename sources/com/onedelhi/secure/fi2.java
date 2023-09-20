package com.onedelhi.secure;

public final class fi2 {

    /* renamed from: a */
    public static final fi2 f28463a = new C5271a().mo35976a();

    /* renamed from: a */
    public final int f28464a;

    /* renamed from: a */
    public final long f28465a;

    /* renamed from: a */
    public final C5272b f28466a;

    /* renamed from: a */
    public final C5273c f28467a;

    /* renamed from: a */
    public final C5274d f28468a;

    /* renamed from: a */
    public final String f28469a;

    /* renamed from: b */
    public final int f28470b;

    /* renamed from: b */
    public final long f28471b;

    /* renamed from: b */
    public final String f28472b;

    /* renamed from: c */
    public final long f28473c;

    /* renamed from: c */
    public final String f28474c;

    /* renamed from: d */
    public final String f28475d;

    /* renamed from: e */
    public final String f28476e;

    /* renamed from: f */
    public final String f28477f;

    /* renamed from: g */
    public final String f28478g;

    /* renamed from: com.onedelhi.secure.fi2$a */
    public static final class C5271a {

        /* renamed from: a */
        public int f28479a = 0;

        /* renamed from: a */
        public long f28480a = 0;

        /* renamed from: a */
        public C5272b f28481a = C5272b.UNKNOWN_EVENT;

        /* renamed from: a */
        public C5273c f28482a = C5273c.UNKNOWN;

        /* renamed from: a */
        public C5274d f28483a = C5274d.UNKNOWN_OS;

        /* renamed from: a */
        public String f28484a = "";

        /* renamed from: b */
        public int f28485b = 0;

        /* renamed from: b */
        public long f28486b = 0;

        /* renamed from: b */
        public String f28487b = "";

        /* renamed from: c */
        public long f28488c = 0;

        /* renamed from: c */
        public String f28489c = "";

        /* renamed from: d */
        public String f28490d = "";

        /* renamed from: e */
        public String f28491e = "";

        /* renamed from: f */
        public String f28492f = "";

        /* renamed from: g */
        public String f28493g = "";

        /* renamed from: a */
        public fi2 mo35976a() {
            return new fi2(this.f28480a, this.f28484a, this.f28487b, this.f28482a, this.f28483a, this.f28489c, this.f28490d, this.f28479a, this.f28485b, this.f28491e, this.f28486b, this.f28481a, this.f28492f, this.f28488c, this.f28493g);
        }

        /* renamed from: b */
        public C5271a mo35977b(String str) {
            this.f28492f = str;
            return this;
        }

        /* renamed from: c */
        public C5271a mo35978c(long j) {
            this.f28486b = j;
            return this;
        }

        /* renamed from: d */
        public C5271a mo35979d(long j) {
            this.f28488c = j;
            return this;
        }

        /* renamed from: e */
        public C5271a mo35980e(String str) {
            this.f28490d = str;
            return this;
        }

        /* renamed from: f */
        public C5271a mo35981f(String str) {
            this.f28493g = str;
            return this;
        }

        /* renamed from: g */
        public C5271a mo35982g(C5272b bVar) {
            this.f28481a = bVar;
            return this;
        }

        /* renamed from: h */
        public C5271a mo35983h(String str) {
            this.f28487b = str;
            return this;
        }

        /* renamed from: i */
        public C5271a mo35984i(String str) {
            this.f28484a = str;
            return this;
        }

        /* renamed from: j */
        public C5271a mo35985j(C5273c cVar) {
            this.f28482a = cVar;
            return this;
        }

        /* renamed from: k */
        public C5271a mo35986k(String str) {
            this.f28489c = str;
            return this;
        }

        /* renamed from: l */
        public C5271a mo35987l(int i) {
            this.f28479a = i;
            return this;
        }

        /* renamed from: m */
        public C5271a mo35988m(long j) {
            this.f28480a = j;
            return this;
        }

        /* renamed from: n */
        public C5271a mo35989n(C5274d dVar) {
            this.f28483a = dVar;
            return this;
        }

        /* renamed from: o */
        public C5271a mo35990o(String str) {
            this.f28491e = str;
            return this;
        }

        /* renamed from: p */
        public C5271a mo35991p(int i) {
            this.f28485b = i;
            return this;
        }
    }

    /* renamed from: com.onedelhi.secure.fi2$b */
    public enum C5272b implements m63 {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);
        

        /* renamed from: n */
        public final int f28498n;

        /* access modifiers changed from: public */
        C5272b(int i) {
            this.f28498n = i;
        }

        /* renamed from: j */
        public int mo12867j() {
            return this.f28498n;
        }
    }

    /* renamed from: com.onedelhi.secure.fi2$c */
    public enum C5273c implements m63 {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);
        

        /* renamed from: n */
        public final int f28504n;

        /* access modifiers changed from: public */
        C5273c(int i) {
            this.f28504n = i;
        }

        /* renamed from: j */
        public int mo12867j() {
            return this.f28504n;
        }
    }

    /* renamed from: com.onedelhi.secure.fi2$d */
    public enum C5274d implements m63 {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);
        

        /* renamed from: n */
        public final int f28510n;

        /* access modifiers changed from: public */
        C5274d(int i) {
            this.f28510n = i;
        }

        /* renamed from: j */
        public int mo12867j() {
            return this.f28510n;
        }
    }

    public fi2(long j, String str, String str2, C5273c cVar, C5274d dVar, String str3, String str4, int i, int i2, String str5, long j2, C5272b bVar, String str6, long j3, String str7) {
        this.f28465a = j;
        this.f28469a = str;
        this.f28472b = str2;
        this.f28467a = cVar;
        this.f28468a = dVar;
        this.f28474c = str3;
        this.f28475d = str4;
        this.f28464a = i;
        this.f28470b = i2;
        this.f28476e = str5;
        this.f28471b = j2;
        this.f28466a = bVar;
        this.f28477f = str6;
        this.f28473c = j3;
        this.f28478g = str7;
    }

    /* renamed from: f */
    public static fi2 m47889f() {
        return f28463a;
    }

    /* renamed from: q */
    public static C5271a m47890q() {
        return new C5271a();
    }

    @o63(tag = 13)
    /* renamed from: a */
    public String mo35961a() {
        return this.f28477f;
    }

    @o63(tag = 11)
    /* renamed from: b */
    public long mo35962b() {
        return this.f28471b;
    }

    @o63(tag = 14)
    /* renamed from: c */
    public long mo35963c() {
        return this.f28473c;
    }

    @o63(tag = 7)
    /* renamed from: d */
    public String mo35964d() {
        return this.f28475d;
    }

    @o63(tag = 15)
    /* renamed from: e */
    public String mo35965e() {
        return this.f28478g;
    }

    @o63(tag = 12)
    /* renamed from: g */
    public C5272b mo35966g() {
        return this.f28466a;
    }

    @o63(tag = 3)
    /* renamed from: h */
    public String mo35967h() {
        return this.f28472b;
    }

    @o63(tag = 2)
    /* renamed from: i */
    public String mo35968i() {
        return this.f28469a;
    }

    @o63(tag = 4)
    /* renamed from: j */
    public C5273c mo35969j() {
        return this.f28467a;
    }

    @o63(tag = 6)
    /* renamed from: k */
    public String mo35970k() {
        return this.f28474c;
    }

    @o63(tag = 8)
    /* renamed from: l */
    public int mo35971l() {
        return this.f28464a;
    }

    @o63(tag = 1)
    /* renamed from: m */
    public long mo35972m() {
        return this.f28465a;
    }

    @o63(tag = 5)
    /* renamed from: n */
    public C5274d mo35973n() {
        return this.f28468a;
    }

    @o63(tag = 10)
    /* renamed from: o */
    public String mo35974o() {
        return this.f28476e;
    }

    @o63(tag = 9)
    /* renamed from: p */
    public int mo35975p() {
        return this.f28470b;
    }
}
