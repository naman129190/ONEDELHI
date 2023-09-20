package com.onedelhi.secure;

import java.util.NoSuchElementException;

public final class dm6 extends hm6 {

    /* renamed from: a */
    public final /* synthetic */ on6 f10866a;

    /* renamed from: n */
    public int f10867n = 0;

    /* renamed from: o */
    public final int f10868o;

    public dm6(on6 on6) {
        this.f10866a = on6;
        this.f10868o = on6.mo18486f();
    }

    /* renamed from: c */
    public final byte mo14798c() {
        int i = this.f10867n;
        if (i < this.f10868o) {
            this.f10867n = i + 1;
            return this.f10866a.mo18485e(i);
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.f10867n < this.f10868o;
    }
}
