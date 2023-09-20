package com.onedelhi.secure;

import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.f13188c})
public abstract class aa4 {
    /* renamed from: a */
    public abstract void mo12884a(@mr2 Runnable runnable);

    /* renamed from: b */
    public void mo12885b(@mr2 Runnable runnable) {
        if (mo12886c()) {
            runnable.run();
        } else {
            mo12887d(runnable);
        }
    }

    /* renamed from: c */
    public abstract boolean mo12886c();

    /* renamed from: d */
    public abstract void mo12887d(@mr2 Runnable runnable);
}
