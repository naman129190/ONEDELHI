package com.onedelhi.secure;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.NoSuchElementException;

public abstract class mj6 extends ll6 {

    /* renamed from: n */
    public final int f16163n;

    /* renamed from: o */
    public int f16164o;

    public mj6(int i, int i2) {
        ui6.m29378b(i2, i, FirebaseAnalytics.C4305d.f24955X);
        this.f16163n = i;
        this.f16164o = i2;
    }

    /* renamed from: a */
    public abstract Object mo20448a(int i);

    public final boolean hasNext() {
        return this.f16164o < this.f16163n;
    }

    public final boolean hasPrevious() {
        return this.f16164o > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.f16164o;
            this.f16164o = i + 1;
            return mo20448a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f16164o;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f16164o - 1;
            this.f16164o = i;
            return mo20448a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f16164o - 1;
    }
}
