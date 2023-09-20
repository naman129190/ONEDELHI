package com.onedelhi.secure;

public final class y56 {

    /* renamed from: a */
    public final ck5 f22894a;

    /* renamed from: a */
    public final dk6 f22895a;

    /* renamed from: a */
    public final w96 f22896a;

    /* renamed from: b */
    public final w96 f22897b;

    public y56() {
        ck5 ck5 = new ck5();
        this.f22894a = ck5;
        w96 w96 = new w96((w96) null, ck5);
        this.f22897b = w96;
        this.f22896a = w96.mo26464a();
        dk6 dk6 = new dk6();
        this.f22895a = dk6;
        w96.mo26470g("require", new r47(dk6));
        dk6.mo14738a("internal.platform", a26.f8682a);
        w96.mo26470g("runtime.counter", new te5(Double.valueOf(0.0d)));
    }

    /* renamed from: a */
    public final qh5 mo27213a(w96 w96, jd6... jd6Arr) {
        qh5 qh5 = qh5.f19182a;
        for (jd6 a : jd6Arr) {
            qh5 = jh6.m18590a(a);
            sd6.m27475c(this.f22897b);
            if ((qh5 instanceof yh5) || (qh5 instanceof ih5)) {
                qh5 = this.f22894a.mo14170a(w96, qh5);
            }
        }
        return qh5;
    }
}
