package com.onedelhi.secure;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class zc5 implements Iterator {

    /* renamed from: a */
    public final /* synthetic */ ld5 f23567a;

    /* renamed from: n */
    public int f23568n = 0;

    public zc5(ld5 ld5) {
        this.f23567a = ld5;
    }

    public final boolean hasNext() {
        return this.f23568n < this.f23567a.mo19456r();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f23568n < this.f23567a.mo19456r()) {
            ld5 ld5 = this.f23567a;
            int i = this.f23568n;
            this.f23568n = i + 1;
            return ld5.mo19457s(i);
        }
        int i2 = this.f23568n;
        throw new NoSuchElementException("Out of bounds index: " + i2);
    }
}
