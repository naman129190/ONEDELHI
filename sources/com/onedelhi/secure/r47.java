package com.onedelhi.secure;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public final class r47 extends ef5 {

    /* renamed from: a */
    public final dk6 f19614a;

    /* renamed from: b */
    public final Map f19615b = new HashMap();

    public r47(dk6 dk6) {
        super("require");
        this.f19614a = dk6;
    }

    /* renamed from: a */
    public final qh5 mo14991a(w96 w96, List list) {
        qh5 qh5;
        sd6.m27480h("require", 1, list);
        String b = w96.mo26465b((qh5) list.get(0)).mo13084b();
        if (this.f19615b.containsKey(b)) {
            return (qh5) this.f19615b.get(b);
        }
        dk6 dk6 = this.f19614a;
        if (dk6.f10802a.containsKey(b)) {
            try {
                qh5 = (qh5) ((Callable) dk6.f10802a.get(b)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(b)));
            }
        } else {
            qh5 = qh5.f19182a;
        }
        if (qh5 instanceof ef5) {
            this.f19615b.put(b, (ef5) qh5);
        }
        return qh5;
    }
}
