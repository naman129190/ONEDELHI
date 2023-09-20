package com.onedelhi.secure;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.onedelhi.secure.a3 */
public class C1644a3 implements v22 {

    /* renamed from: a */
    public final Set<y22> f8683a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: a */
    public boolean f8684a;

    /* renamed from: b */
    public boolean f8685b;

    /* renamed from: a */
    public void mo12673a(@mr2 y22 y22) {
        this.f8683a.remove(y22);
    }

    /* renamed from: b */
    public void mo12674b(@mr2 y22 y22) {
        this.f8683a.add(y22);
        if (this.f8685b) {
            y22.mo15999g();
        } else if (this.f8684a) {
            y22.mo15995d();
        } else {
            y22.mo15993c();
        }
    }

    /* renamed from: c */
    public void mo12675c() {
        this.f8685b = true;
        for (T g : oq4.m24023k(this.f8683a)) {
            g.mo15999g();
        }
    }

    /* renamed from: d */
    public void mo12676d() {
        this.f8684a = true;
        for (T d : oq4.m24023k(this.f8683a)) {
            d.mo15995d();
        }
    }

    /* renamed from: e */
    public void mo12677e() {
        this.f8684a = false;
        for (T c : oq4.m24023k(this.f8683a)) {
            c.mo15993c();
        }
    }
}
