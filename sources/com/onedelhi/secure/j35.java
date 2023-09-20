package com.onedelhi.secure;

import java.util.Iterator;

public final class j35 implements su2 {

    /* renamed from: a */
    public final /* synthetic */ bi0 f13995a;

    public j35(bi0 bi0) {
        this.f13995a = bi0;
    }

    /* renamed from: a */
    public final void mo18095a(w22 w22) {
        this.f13995a.f9829a = w22;
        Iterator it = this.f13995a.f9830a.iterator();
        while (it.hasNext()) {
            ((r45) it.next()).mo19275a(this.f13995a.f9829a);
        }
        this.f13995a.f9830a.clear();
        this.f13995a.f9827a = null;
    }
}
