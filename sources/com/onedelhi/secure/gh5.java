package com.onedelhi.secure;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.NoSuchElementException;

public abstract class gh5 extends em5 {

    /* renamed from: n */
    public final int f12596n;

    /* renamed from: o */
    public int f12597o;

    public gh5(int i, int i2) {
        pg5.m24694b(i2, i, FirebaseAnalytics.C4305d.f24955X);
        this.f12596n = i;
        this.f12597o = i2;
    }

    /* renamed from: a */
    public abstract Object mo15195a(int i);

    public final boolean hasNext() {
        return this.f12597o < this.f12596n;
    }

    public final boolean hasPrevious() {
        return this.f12597o > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.f12597o;
            this.f12597o = i + 1;
            return mo15195a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f12597o;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f12597o - 1;
            this.f12597o = i;
            return mo15195a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f12597o - 1;
    }
}
