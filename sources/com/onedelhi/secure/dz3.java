package com.onedelhi.secure;

@Deprecated
public abstract class dz3<Z> extends C3795vj<Z> {

    /* renamed from: n */
    public final int f11058n;

    /* renamed from: o */
    public final int f11059o;

    public dz3() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public dz3(int i, int i2) {
        this.f11058n = i;
        this.f11059o = i2;
    }

    /* renamed from: e */
    public final void mo14955e(@mr2 uz3 uz3) {
        if (oq4.m24035w(this.f11058n, this.f11059o)) {
            uz3.mo19958e(this.f11058n, this.f11059o);
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.f11058n + " and height: " + this.f11059o + ", either provide dimensions in the constructor or call override()");
    }

    /* renamed from: r */
    public void mo14956r(@mr2 uz3 uz3) {
    }
}
