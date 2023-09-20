package com.onedelhi.secure;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public final class q70 {

    /* renamed from: a */
    public volatile Context f18875a;

    /* renamed from: a */
    public final Set<ru2> f18876a = new CopyOnWriteArraySet();

    /* renamed from: a */
    public void mo22856a(@mr2 ru2 ru2) {
        if (this.f18875a != null) {
            ru2.mo880a(this.f18875a);
        }
        this.f18876a.add(ru2);
    }

    /* renamed from: b */
    public void mo22857b() {
        this.f18875a = null;
    }

    /* renamed from: c */
    public void mo22858c(@mr2 Context context) {
        this.f18875a = context;
        for (ru2 a : this.f18876a) {
            a.mo880a(context);
        }
    }

    @ts2
    /* renamed from: d */
    public Context mo22859d() {
        return this.f18875a;
    }

    /* renamed from: e */
    public void mo22860e(@mr2 ru2 ru2) {
        this.f18876a.remove(ru2);
    }
}
