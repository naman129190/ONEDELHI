package com.onedelhi.secure;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public final class wr5 {

    /* renamed from: a */
    public final l67 f22264a = new l67();

    /* renamed from: a */
    public w96 f22265a;

    /* renamed from: a */
    public final y56 f22266a;

    /* renamed from: a */
    public final zb5 f22267a = new zb5();

    public wr5() {
        y56 y56 = new y56();
        this.f22266a = y56;
        this.f22265a = y56.f22896a.mo26464a();
        y56.f22895a.mo14738a("internal.registerCallback", new ca5(this));
        y56.f22895a.mo14738a("internal.eventLogger", new hl5(this));
    }

    /* renamed from: a */
    public final zb5 mo26663a() {
        return this.f22267a;
    }

    /* renamed from: b */
    public final /* synthetic */ ef5 mo26664b() throws Exception {
        return new m37(this.f22264a);
    }

    /* renamed from: c */
    public final void mo26665c(uc6 uc6) throws bx5 {
        ef5 ef5;
        try {
            this.f22265a = this.f22266a.f22896a.mo26464a();
            if (!(this.f22266a.mo27213a(this.f22265a, (jd6[]) uc6.mo25565D().toArray(new jd6[0])) instanceof ie5)) {
                for (oc6 oc6 : uc6.mo25564B().mo17708E()) {
                    List D = oc6.mo21867D();
                    String C = oc6.mo21866C();
                    Iterator it = D.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            qh5 a = this.f22266a.mo27213a(this.f22265a, (jd6) it.next());
                            if (a instanceof sg5) {
                                w96 w96 = this.f22265a;
                                if (!w96.mo26471h(C)) {
                                    ef5 = null;
                                } else {
                                    qh5 d = w96.mo26467d(C);
                                    if (d instanceof ef5) {
                                        ef5 = (ef5) d;
                                    } else {
                                        throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(C)));
                                    }
                                }
                                if (ef5 != null) {
                                    ef5.mo14991a(this.f22265a, Collections.singletonList(a));
                                } else {
                                    throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(C)));
                                }
                            } else {
                                throw new IllegalArgumentException("Invalid rule definition");
                            }
                        }
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (Throwable th) {
            throw new bx5(th);
        }
    }

    /* renamed from: d */
    public final void mo26666d(String str, Callable callable) {
        this.f22266a.f22895a.mo14738a(str, callable);
    }

    /* renamed from: e */
    public final boolean mo26667e(mb5 mb5) throws bx5 {
        try {
            this.f22267a.mo27904d(mb5);
            this.f22266a.f22897b.mo26470g("runtime.counter", new te5(Double.valueOf(0.0d)));
            this.f22264a.mo19290b(this.f22265a.mo26464a(), this.f22267a);
            return mo26669g() || mo26668f();
        } catch (Throwable th) {
            throw new bx5(th);
        }
    }

    /* renamed from: f */
    public final boolean mo26668f() {
        return !this.f22267a.mo27902c().isEmpty();
    }

    /* renamed from: g */
    public final boolean mo26669g() {
        zb5 zb5 = this.f22267a;
        return !zb5.mo27901b().equals(zb5.mo27900a());
    }
}
