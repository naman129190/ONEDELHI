package com.onedelhi.secure;

import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.onedelhi.secure.no2;
import com.onedelhi.secure.q51;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class oo2 extends C5765j9 implements uu3 {

    /* renamed from: a */
    public static final char f33149a = '\u001f';

    /* renamed from: a */
    public static final C7012v5 f33150a = C7012v5.m67717e();

    /* renamed from: b */
    public static final char f33151b = '';

    /* renamed from: a */
    public final GaugeManager f33152a;

    /* renamed from: a */
    public final li4 f33153a;

    /* renamed from: a */
    public final no2.C6210b f33154a;

    /* renamed from: a */
    public final WeakReference<uu3> f33155a;

    /* renamed from: a */
    public final List<g13> f33156a;
    @ts2

    /* renamed from: b */
    public String f33157b;

    /* renamed from: b */
    public boolean f33158b;

    /* renamed from: c */
    public boolean f33159c;

    public oo2(li4 li4) {
        this(li4, C5665i9.m51864c(), GaugeManager.getInstance());
    }

    public oo2(li4 li4, C5665i9 i9Var, GaugeManager gaugeManager) {
        super(i9Var);
        this.f33154a = no2.m58457hl();
        this.f33155a = new WeakReference<>(this);
        this.f33153a = li4;
        this.f33152a = gaugeManager;
        this.f33156a = Collections.synchronizedList(new ArrayList());
        registerForAppState();
    }

    /* renamed from: c */
    public static oo2 m59581c(li4 li4) {
        return new oo2(li4);
    }

    /* renamed from: n */
    public static boolean m59582n(String str) {
        if (str.length() > 128) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt > 127) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: B */
    public oo2 mo41924B(long j) {
        this.f33154a.mo41417ok(j);
        return this;
    }

    /* renamed from: C */
    public oo2 mo41925C(@ts2 String str) {
        if (str != null) {
            this.f33154a.mo41418pk(br4.m40325f(br4.m40324e(str), 2000));
        }
        return this;
    }

    /* renamed from: D */
    public oo2 mo41926D(@ts2 String str) {
        this.f33157b = str;
        return this;
    }

    /* renamed from: a */
    public void mo29944a(g13 g13) {
        if (g13 == null) {
            f33150a.mo46010l("Unable to add new SessionId to the Network Trace. Continuing without it.");
        } else if (mo41933j() && !mo41935m()) {
            this.f33156a.add(g13);
        }
    }

    /* renamed from: b */
    public no2 mo41927b() {
        SessionManager.getInstance().unregisterForSessionUpdates(this.f33155a);
        unregisterForAppState();
        h13[] b = g13.m48998b(mo41929e());
        if (b != null) {
            this.f33154a.mo41383Gj(Arrays.asList(b));
        }
        no2 no2 = (no2) this.f33154a.mo43381ab();
        if (!po2.m61529c(this.f33157b)) {
            f33150a.mo46000a("Dropping network request from a 'User-Agent' that is not allowed");
            return no2;
        } else if (!this.f33158b) {
            this.f33153a.mo39870G(no2, getAppState());
            this.f33158b = true;
            return no2;
        } else {
            if (this.f33159c) {
                f33150a.mo46000a("This metric has already been queued for transmission.  Please create a new HttpMetric for each request/response");
            }
            return no2;
        }
    }

    @hw4
    /* renamed from: d */
    public void mo41928d() {
        this.f33154a.mo43379R3();
    }

    @hw4
    /* renamed from: e */
    public List<g13> mo41929e() {
        List<g13> unmodifiableList;
        synchronized (this.f33156a) {
            ArrayList arrayList = new ArrayList();
            for (g13 next : this.f33156a) {
                if (next != null) {
                    arrayList.add(next);
                }
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return unmodifiableList;
    }

    /* renamed from: f */
    public long mo41930f() {
        return this.f33154a.mo41381zc();
    }

    /* renamed from: h */
    public String mo41931h() {
        return this.f33154a.mo41374t0();
    }

    /* renamed from: i */
    public boolean mo41932i() {
        return this.f33154a.mo41379yc();
    }

    /* renamed from: j */
    public final boolean mo41933j() {
        return this.f33154a.mo41365f2();
    }

    @hw4
    /* renamed from: k */
    public boolean mo41934k() {
        return this.f33158b;
    }

    /* renamed from: m */
    public final boolean mo41935m() {
        return this.f33154a.mo41372lc();
    }

    /* renamed from: o */
    public oo2 mo41936o(Map<String, String> map) {
        this.f33154a.mo41389Mj().mo41401Yj(map);
        return this;
    }

    /* renamed from: p */
    public oo2 mo41937p(@ts2 String str) {
        if (str != null) {
            no2.C6212d dVar = no2.C6212d.HTTP_METHOD_UNKNOWN;
            String upperCase = str.toUpperCase();
            upperCase.hashCode();
            char c = 65535;
            switch (upperCase.hashCode()) {
                case -531492226:
                    if (upperCase.equals(q51.C6513a.f34006z)) {
                        c = 0;
                        break;
                    }
                    break;
                case 70454:
                    if (upperCase.equals("GET")) {
                        c = 1;
                        break;
                    }
                    break;
                case 79599:
                    if (upperCase.equals(q51.C6513a.f34001u)) {
                        c = 2;
                        break;
                    }
                    break;
                case 2213344:
                    if (upperCase.equals(q51.C6513a.f34004x)) {
                        c = 3;
                        break;
                    }
                    break;
                case 2461856:
                    if (upperCase.equals(q51.C6513a.f34002v)) {
                        c = 4;
                        break;
                    }
                    break;
                case 75900968:
                    if (upperCase.equals(q51.C6513a.f34005y)) {
                        c = 5;
                        break;
                    }
                    break;
                case 80083237:
                    if (upperCase.equals(q51.C6513a.f33998A)) {
                        c = 6;
                        break;
                    }
                    break;
                case 1669334218:
                    if (upperCase.equals(q51.C6513a.f33999B)) {
                        c = 7;
                        break;
                    }
                    break;
                case 2012838315:
                    if (upperCase.equals(q51.C6513a.f34003w)) {
                        c = 8;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    dVar = no2.C6212d.OPTIONS;
                    break;
                case 1:
                    dVar = no2.C6212d.GET;
                    break;
                case 2:
                    dVar = no2.C6212d.PUT;
                    break;
                case 3:
                    dVar = no2.C6212d.HEAD;
                    break;
                case 4:
                    dVar = no2.C6212d.POST;
                    break;
                case 5:
                    dVar = no2.C6212d.PATCH;
                    break;
                case 6:
                    dVar = no2.C6212d.TRACE;
                    break;
                case 7:
                    dVar = no2.C6212d.CONNECT;
                    break;
                case 8:
                    dVar = no2.C6212d.DELETE;
                    break;
            }
            this.f33154a.mo41406dk(dVar);
        }
        return this;
    }

    /* renamed from: q */
    public oo2 mo41938q(int i) {
        this.f33154a.mo41407ek(i);
        return this;
    }

    /* renamed from: r */
    public void mo41939r() {
        this.f33159c = true;
    }

    /* renamed from: s */
    public oo2 mo41940s() {
        this.f33154a.mo41408fk(no2.C6215e.GENERIC_CLIENT_ERROR);
        return this;
    }

    @hw4
    /* renamed from: t */
    public void mo41941t() {
        this.f33158b = true;
    }

    /* renamed from: u */
    public oo2 mo41942u(long j) {
        this.f33154a.mo41411ik(j);
        return this;
    }

    /* renamed from: v */
    public oo2 mo41943v(long j) {
        g13 perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f33155a);
        this.f33154a.mo41405ck(j);
        mo29944a(perfSession);
        if (perfSession.mo36519f()) {
            this.f33152a.collectGaugeMetricOnce(perfSession.mo36516d());
        }
        return this;
    }

    /* renamed from: w */
    public oo2 mo41944w(@ts2 String str) {
        if (str == null) {
            this.f33154a.mo41395Sj();
            return this;
        }
        if (m59582n(str)) {
            this.f33154a.mo41412jk(str);
        } else {
            C7012v5 v5Var = f33150a;
            v5Var.mo46010l("The content type of the response is not a valid content-type:" + str);
        }
        return this;
    }

    /* renamed from: x */
    public oo2 mo41945x(long j) {
        this.f33154a.mo41414lk(j);
        return this;
    }

    /* renamed from: y */
    public oo2 mo41946y(long j) {
        this.f33154a.mo41415mk(j);
        return this;
    }

    /* renamed from: z */
    public oo2 mo41947z(long j) {
        this.f33154a.mo41416nk(j);
        if (SessionManager.getInstance().perfSession().mo36519f()) {
            this.f33152a.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().mo36516d());
        }
        return this;
    }
}
