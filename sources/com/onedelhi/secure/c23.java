package com.onedelhi.secure;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

public abstract class c23<S> extends Fragment {

    /* renamed from: a */
    public final LinkedHashSet<ev2<S>> f10083a = new LinkedHashSet<>();

    /* renamed from: q */
    public boolean mo12056q(ev2<S> ev2) {
        return this.f10083a.add(ev2);
    }

    /* renamed from: r */
    public void mo13950r() {
        this.f10083a.clear();
    }

    /* renamed from: s */
    public abstract me0<S> mo12057s();

    /* renamed from: w */
    public boolean mo13951w(ev2<S> ev2) {
        return this.f10083a.remove(ev2);
    }
}
