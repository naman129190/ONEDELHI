package com.onedelhi.secure;

import android.content.Context;
import com.onedelhi.secure.no2;
import java.net.URI;

public final class m51 extends f13 {

    /* renamed from: a */
    public static final int f32016a = -1;

    /* renamed from: a */
    public static final C7012v5 f32017a = C7012v5.m67717e();

    /* renamed from: a */
    public static final String f32018a = "http";

    /* renamed from: b */
    public static final String f32019b = "https";

    /* renamed from: a */
    public final Context f32020a;

    /* renamed from: a */
    public final no2 f32021a;

    public m51(no2 no2, Context context) {
        this.f32020a = context;
        this.f32021a = no2;
    }

    /* renamed from: c */
    public boolean mo35708c() {
        if (mo40494j(this.f32021a.mo41374t0())) {
            C7012v5 v5Var = f32017a;
            v5Var.mo46010l("URL is missing:" + this.f32021a.mo41374t0());
            return false;
        }
        URI g = mo40491g(this.f32021a.mo41374t0());
        if (g == null) {
            f32017a.mo46010l("URL cannot be parsed");
            return false;
        } else if (!mo40492h(g, this.f32020a)) {
            C7012v5 v5Var2 = f32017a;
            v5Var2.mo46010l("URL fails allowlist rule: " + g);
            return false;
        } else if (!mo40495k(g.getHost())) {
            f32017a.mo46010l("URL host is null or invalid");
            return false;
        } else if (!mo40500p(g.getScheme())) {
            f32017a.mo46010l("URL scheme is null or invalid");
            return false;
        } else if (!mo40502r(g.getUserInfo())) {
            f32017a.mo46010l("URL user info is null");
            return false;
        } else if (!mo40499o(g.getPort())) {
            f32017a.mo46010l("URL port is less than or equal to 0");
            return false;
        } else {
            if (!mo40496l(this.f32021a.mo41369h7() ? this.f32021a.mo41326H9() : null)) {
                C7012v5 v5Var3 = f32017a;
                v5Var3.mo46010l("HTTP Method is null or invalid: " + this.f32021a.mo41326H9());
                return false;
            } else if (this.f32021a.mo41379yc() && !mo40497m(this.f32021a.mo41373md())) {
                C7012v5 v5Var4 = f32017a;
                v5Var4.mo46010l("HTTP ResponseCode is a negative value:" + this.f32021a.mo41373md());
                return false;
            } else if (this.f32021a.mo41339P8() && !mo40498n(this.f32021a.mo41371la())) {
                C7012v5 v5Var5 = f32017a;
                v5Var5.mo46010l("Request Payload is a negative value:" + this.f32021a.mo41371la());
                return false;
            } else if (this.f32021a.mo41318Cg() && !mo40498n(this.f32021a.mo41323G9())) {
                C7012v5 v5Var6 = f32017a;
                v5Var6.mo46010l("Response Payload is a negative value:" + this.f32021a.mo41323G9());
                return false;
            } else if (!this.f32021a.mo41365f2() || this.f32021a.mo41353Y1() <= 0) {
                C7012v5 v5Var7 = f32017a;
                v5Var7.mo46010l("Start time of the request is null, or zero, or a negative value:" + this.f32021a.mo41353Y1());
                return false;
            } else if (this.f32021a.mo41342R8() && !mo40501q(this.f32021a.mo41355Z5())) {
                C7012v5 v5Var8 = f32017a;
                v5Var8.mo46010l("Time to complete the request is a negative value:" + this.f32021a.mo41355Z5());
                return false;
            } else if (this.f32021a.mo41378y4() && !mo40501q(this.f32021a.mo41381zc())) {
                C7012v5 v5Var9 = f32017a;
                v5Var9.mo46010l("Time from the start of the request to the start of the response is null or a negative value:" + this.f32021a.mo41381zc());
                return false;
            } else if (!this.f32021a.mo41372lc() || this.f32021a.mo41376x6() <= 0) {
                C7012v5 v5Var10 = f32017a;
                v5Var10.mo46010l("Time from the start of the request to the end of the response is null, negative or zero:" + this.f32021a.mo41376x6());
                return false;
            } else if (this.f32021a.mo41379yc()) {
                return true;
            } else {
                f32017a.mo46010l("Did not receive a HTTP Response Code");
                return false;
            }
        }
    }

    @ts2
    /* renamed from: g */
    public final URI mo40491g(@ts2 String str) {
        if (str == null) {
            return null;
        }
        try {
            return URI.create(str);
        } catch (IllegalArgumentException | IllegalStateException e) {
            f32017a.mo46011m("getResultUrl throws exception %s", e.getMessage());
            return null;
        }
    }

    /* renamed from: h */
    public final boolean mo40492h(@ts2 URI uri, @mr2 Context context) {
        if (uri == null) {
            return false;
        }
        return pm4.m61454a(uri, context);
    }

    /* renamed from: i */
    public final boolean mo40493i(@ts2 String str) {
        if (str == null) {
            return true;
        }
        return str.trim().isEmpty();
    }

    /* renamed from: j */
    public final boolean mo40494j(@ts2 String str) {
        return mo40493i(str);
    }

    /* renamed from: k */
    public final boolean mo40495k(@ts2 String str) {
        return str != null && !mo40493i(str) && str.length() <= 255;
    }

    /* renamed from: l */
    public boolean mo40496l(@ts2 no2.C6212d dVar) {
        return (dVar == null || dVar == no2.C6212d.HTTP_METHOD_UNKNOWN) ? false : true;
    }

    /* renamed from: m */
    public final boolean mo40497m(int i) {
        return i > 0;
    }

    /* renamed from: n */
    public final boolean mo40498n(long j) {
        return j >= 0;
    }

    /* renamed from: o */
    public final boolean mo40499o(int i) {
        return i == -1 || i > 0;
    }

    /* renamed from: p */
    public final boolean mo40500p(@ts2 String str) {
        if (str == null) {
            return false;
        }
        return f32018a.equalsIgnoreCase(str) || f32019b.equalsIgnoreCase(str);
    }

    /* renamed from: q */
    public final boolean mo40501q(long j) {
        return j >= 0;
    }

    /* renamed from: r */
    public final boolean mo40502r(@ts2 String str) {
        return str == null;
    }
}
