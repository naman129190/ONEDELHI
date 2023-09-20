package com.onedelhi.secure;

import com.google.firebase.perf.metrics.Trace;
import com.onedelhi.secure.eg4;
import java.util.Arrays;
import java.util.List;

public class fg4 {

    /* renamed from: a */
    public final Trace f28444a;

    public fg4(@mr2 Trace trace) {
        this.f28444a = trace;
    }

    /* renamed from: a */
    public eg4 mo35940a() {
        eg4.C5143b hk = eg4.m46646cl().mo35365jk(this.f28444a.mo29949f()).mo35362gk(this.f28444a.mo29955i().mo43511e()).mo35363hk(this.f28444a.mo29955i().mo43509d(this.f28444a.mo29948e()));
        for (t90 next : this.f28444a.mo29946d().values()) {
            hk.mo35356ak(next.mo44949b(), next.mo44948a());
        }
        List<Trace> j = this.f28444a.mo29957j();
        if (!j.isEmpty()) {
            for (Trace fg4 : j) {
                hk.mo35345Pj(new fg4(fg4).mo35940a());
            }
        }
        hk.mo35355Zj(this.f28444a.getAttributes());
        h13[] b = g13.m48998b(this.f28444a.mo29954h());
        if (b != null) {
            hk.mo35336Gj(Arrays.asList(b));
        }
        return (eg4) hk.mo43381ab();
    }
}
