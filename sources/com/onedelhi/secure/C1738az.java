package com.onedelhi.secure;

import com.onedelhi.secure.tt0;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.onedelhi.secure.az */
public final class C1738az {

    /* renamed from: a */
    public static final C1738az f9574a = new C1739a().mo13341b();

    /* renamed from: a */
    public final he4 f9575a;

    /* renamed from: a */
    public final jh1 f9576a;

    /* renamed from: a */
    public final String f9577a;

    /* renamed from: a */
    public final List<i92> f9578a;

    /* renamed from: com.onedelhi.secure.az$a */
    public static final class C1739a {

        /* renamed from: a */
        public he4 f9579a = null;

        /* renamed from: a */
        public jh1 f9580a = null;

        /* renamed from: a */
        public String f9581a = "";

        /* renamed from: a */
        public List<i92> f9582a = new ArrayList();

        /* renamed from: a */
        public C1739a mo13340a(i92 i92) {
            this.f9582a.add(i92);
            return this;
        }

        /* renamed from: b */
        public C1738az mo13341b() {
            return new C1738az(this.f9579a, Collections.unmodifiableList(this.f9582a), this.f9580a, this.f9581a);
        }

        /* renamed from: c */
        public C1739a mo13342c(String str) {
            this.f9581a = str;
            return this;
        }

        /* renamed from: d */
        public C1739a mo13343d(jh1 jh1) {
            this.f9580a = jh1;
            return this;
        }

        /* renamed from: e */
        public C1739a mo13344e(List<i92> list) {
            this.f9582a = list;
            return this;
        }

        /* renamed from: f */
        public C1739a mo13345f(he4 he4) {
            this.f9579a = he4;
            return this;
        }
    }

    public C1738az(he4 he4, List<i92> list, jh1 jh1, String str) {
        this.f9575a = he4;
        this.f9578a = list;
        this.f9576a = jh1;
        this.f9577a = str;
    }

    /* renamed from: b */
    public static C1738az m11488b() {
        return f9574a;
    }

    /* renamed from: h */
    public static C1739a m11489h() {
        return new C1739a();
    }

    @o63(tag = 4)
    /* renamed from: a */
    public String mo13332a() {
        return this.f9577a;
    }

    @tt0.C6899b
    /* renamed from: c */
    public jh1 mo13333c() {
        jh1 jh1 = this.f9576a;
        return jh1 == null ? jh1.m18570a() : jh1;
    }

    @o63(tag = 3)
    @tt0.C6898a(name = "globalMetrics")
    /* renamed from: d */
    public jh1 mo13334d() {
        return this.f9576a;
    }

    @o63(tag = 2)
    @tt0.C6898a(name = "logSourceMetrics")
    /* renamed from: e */
    public List<i92> mo13335e() {
        return this.f9578a;
    }

    @tt0.C6899b
    /* renamed from: f */
    public he4 mo13336f() {
        he4 he4 = this.f9575a;
        return he4 == null ? he4.m16649a() : he4;
    }

    @o63(tag = 1)
    @tt0.C6898a(name = "window")
    /* renamed from: g */
    public he4 mo13337g() {
        return this.f9575a;
    }

    /* renamed from: i */
    public byte[] mo13338i() {
        return l63.m20236b(this);
    }

    /* renamed from: j */
    public void mo13339j(OutputStream outputStream) throws IOException {
        l63.m20235a(this, outputStream);
    }
}
