package com.onedelhi.secure;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class w96 {

    /* renamed from: a */
    public final ck5 f22069a;

    /* renamed from: a */
    public final w96 f22070a;

    /* renamed from: a */
    public final Map f22071a = new HashMap();

    /* renamed from: b */
    public final Map f22072b = new HashMap();

    public w96(w96 w96, ck5 ck5) {
        this.f22070a = w96;
        this.f22069a = ck5;
    }

    /* renamed from: a */
    public final w96 mo26464a() {
        return new w96(this, this.f22069a);
    }

    /* renamed from: b */
    public final qh5 mo26465b(qh5 qh5) {
        return this.f22069a.mo14170a(this, qh5);
    }

    /* renamed from: c */
    public final qh5 mo26466c(ld5 ld5) {
        qh5 qh5 = qh5.f19182a;
        Iterator u = ld5.mo19460u();
        while (u.hasNext()) {
            qh5 = this.f22069a.mo14170a(this, ld5.mo19457s(((Integer) u.next()).intValue()));
            if (qh5 instanceof ie5) {
                break;
            }
        }
        return qh5;
    }

    /* renamed from: d */
    public final qh5 mo26467d(String str) {
        if (this.f22071a.containsKey(str)) {
            return (qh5) this.f22071a.get(str);
        }
        w96 w96 = this.f22070a;
        if (w96 != null) {
            return w96.mo26467d(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", new Object[]{str}));
    }

    /* renamed from: e */
    public final void mo26468e(String str, qh5 qh5) {
        if (!this.f22072b.containsKey(str)) {
            if (qh5 == null) {
                this.f22071a.remove(str);
            } else {
                this.f22071a.put(str, qh5);
            }
        }
    }

    /* renamed from: f */
    public final void mo26469f(String str, qh5 qh5) {
        mo26468e(str, qh5);
        this.f22072b.put(str, Boolean.TRUE);
    }

    /* renamed from: g */
    public final void mo26470g(String str, qh5 qh5) {
        w96 w96;
        if (!this.f22071a.containsKey(str) && (w96 = this.f22070a) != null && w96.mo26471h(str)) {
            this.f22070a.mo26470g(str, qh5);
        } else if (!this.f22072b.containsKey(str)) {
            if (qh5 == null) {
                this.f22071a.remove(str);
            } else {
                this.f22071a.put(str, qh5);
            }
        }
    }

    /* renamed from: h */
    public final boolean mo26471h(String str) {
        if (this.f22071a.containsKey(str)) {
            return true;
        }
        w96 w96 = this.f22070a;
        if (w96 != null) {
            return w96.mo26471h(str);
        }
        return false;
    }
}
