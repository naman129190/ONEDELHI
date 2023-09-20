package com.onedelhi.secure;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.NoSuchElementException;

public abstract class b06 extends d16 {

    /* renamed from: n */
    public final int f9600n;

    /* renamed from: o */
    public int f9601o;

    public b06(int i, int i2) {
        tz5.m29034b(i2, i, FirebaseAnalytics.C4305d.f24955X);
        this.f9600n = i;
        this.f9601o = i2;
    }

    /* renamed from: a */
    public abstract Object mo13363a(int i);

    public final boolean hasNext() {
        return this.f9601o < this.f9600n;
    }

    public final boolean hasPrevious() {
        return this.f9601o > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.f9601o;
            this.f9601o = i + 1;
            return mo13363a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f9601o;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f9601o - 1;
            this.f9601o = i;
            return mo13363a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f9601o - 1;
    }
}
