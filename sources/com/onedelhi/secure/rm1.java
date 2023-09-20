package com.onedelhi.secure;

import com.google.firebase.perf.config.C4336a;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class rm1 implements r51 {

    /* renamed from: a */
    public static final C7012v5 f34684a = C7012v5.m67717e();

    /* renamed from: a */
    public final oo2 f34685a;

    /* renamed from: a */
    public final qe4 f34686a;

    /* renamed from: a */
    public final Map<String, String> f34687a;

    /* renamed from: b */
    public boolean f34688b;

    /* renamed from: c */
    public boolean f34689c;

    public rm1(String str, String str2, li4 li4, qe4 qe4) {
        this.f34688b = false;
        this.f34689c = false;
        this.f34687a = new ConcurrentHashMap();
        this.f34686a = qe4;
        oo2 p = oo2.m59581c(li4).mo41925C(str).mo41937p(str2);
        this.f34685a = p;
        p.mo41939r();
        if (!C4336a.m34908h().mo29861M()) {
            f34684a.mo46005g("HttpMetric feature is disabled. URL %s", str);
            this.f34689c = true;
        }
    }

    public rm1(URL url, String str, li4 li4, qe4 qe4) {
        this(url.toString(), str, li4, qe4);
    }

    /* renamed from: a */
    public final void mo43947a(@mr2 String str, @mr2 String str2) {
        if (this.f34688b) {
            throw new IllegalArgumentException("HttpMetric has been logged already so unable to modify attributes");
        } else if (this.f34687a.containsKey(str) || this.f34687a.size() < 5) {
            f13.m47449d(str, str2);
        } else {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", new Object[]{5}));
        }
    }

    /* renamed from: b */
    public void mo43948b() {
        this.f34685a.mo41946y(this.f34686a.mo43508c());
    }

    /* renamed from: c */
    public void mo43949c() {
        this.f34685a.mo41924B(this.f34686a.mo43508c());
    }

    /* renamed from: d */
    public void mo43950d(int i) {
        this.f34685a.mo41938q(i);
    }

    /* renamed from: e */
    public void mo43951e(long j) {
        this.f34685a.mo41942u(j);
    }

    /* renamed from: f */
    public void mo43952f(@ts2 String str) {
        this.f34685a.mo41944w(str);
    }

    /* renamed from: g */
    public void mo43953g(long j) {
        this.f34685a.mo41945x(j);
    }

    @ts2
    public String getAttribute(@mr2 String str) {
        return this.f34687a.get(str);
    }

    @mr2
    public Map<String, String> getAttributes() {
        return new HashMap(this.f34687a);
    }

    /* renamed from: h */
    public void mo43954h() {
        this.f34686a.mo43512h();
        this.f34685a.mo41943v(this.f34686a.mo43511e());
    }

    /* renamed from: i */
    public void mo43955i() {
        if (!this.f34689c) {
            this.f34685a.mo41947z(this.f34686a.mo43508c()).mo41936o(this.f34687a).mo41927b();
            this.f34688b = true;
        }
    }

    public void putAttribute(@mr2 String str, @mr2 String str2) {
        boolean z = false;
        try {
            str = str.trim();
            str2 = str2.trim();
            mo43947a(str, str2);
            f34684a.mo46001b("Setting attribute '%s' to %s on network request '%s'", str, str2, this.f34685a.mo41931h());
            z = true;
        } catch (Exception e) {
            f34684a.mo46003d("Cannot set attribute '%s' with value '%s' (%s)", str, str2, e.getMessage());
        }
        if (z) {
            this.f34687a.put(str, str2);
        }
    }

    public void removeAttribute(@mr2 String str) {
        if (this.f34688b) {
            f34684a.mo46002c("Can't remove a attribute from a HttpMetric that's stopped.");
        } else {
            this.f34687a.remove(str);
        }
    }
}
