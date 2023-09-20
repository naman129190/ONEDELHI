package com.onedelhi.secure;

import java.util.NoSuchElementException;

public final class g16 extends o16 {

    /* renamed from: a */
    public final /* synthetic */ i36 f12394a;

    /* renamed from: n */
    public int f12395n = 0;

    /* renamed from: o */
    public final int f12396o;

    public g16(i36 i36) {
        this.f12394a = i36;
        this.f12396o = i36.mo17550f();
    }

    /* renamed from: c */
    public final byte mo16279c() {
        int i = this.f12395n;
        if (i < this.f12396o) {
            this.f12395n = i + 1;
            return this.f12394a.mo17548e(i);
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.f12395n < this.f12396o;
    }
}
