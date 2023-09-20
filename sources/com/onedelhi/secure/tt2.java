package com.onedelhi.secure;

import androidx.databinding.C0510b;
import androidx.databinding.C0519f;
import java.io.Serializable;

public class tt2<T> extends C0510b implements Serializable {

    /* renamed from: b */
    public static final long f21130b = 1;

    /* renamed from: a */
    public T f21131a;

    public tt2() {
    }

    public tt2(T t) {
        this.f21131a = t;
    }

    public tt2(C0519f... fVarArr) {
        super(fVarArr);
    }

    @ts2
    /* renamed from: f */
    public T mo25309f() {
        return this.f21131a;
    }

    /* renamed from: h */
    public void mo25310h(T t) {
        if (t != this.f21131a) {
            this.f21131a = t;
            mo3972d();
        }
    }
}
