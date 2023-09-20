package com.onedelhi.secure;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.NoSuchElementException;
import org.jspecify.nullness.NullMarked;

@NullMarked
public abstract class h67 extends wf5 {

    /* renamed from: n */
    public final int f12925n;

    /* renamed from: o */
    public int f12926o;

    public h67(int i, int i2) {
        z17.m32799b(i2, i, FirebaseAnalytics.C4305d.f24955X);
        this.f12925n = i;
        this.f12926o = i2;
    }

    /* renamed from: a */
    public abstract Object mo17087a(int i);

    public final boolean hasNext() {
        return this.f12926o < this.f12925n;
    }

    public final boolean hasPrevious() {
        return this.f12926o > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.f12926o;
            this.f12926o = i + 1;
            return mo17087a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f12926o;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f12926o - 1;
            this.f12926o = i;
            return mo17087a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f12926o - 1;
    }
}
